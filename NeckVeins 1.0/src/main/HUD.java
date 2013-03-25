package main;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_LIGHTING;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_MODULATE;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_ENV;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_ENV_MODE;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glTexEnvf;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex3f;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class HUD {
	public static final int CLICKED_ON_NOTHING = 0;
	public static final int CLICKED_ON_VEINS_MODEL = 1;
	public static final int CLICKED_ON_ROTATION_CIRCLE = 2;
	public static final int CLICKED_ON_MOVE_CIRCLE = 3;
	public static final int CLICKED_ON_ROTATION_ELLIPSE = 4;
	public static final int CLICKED_ON_MOVE_ELLIPSE = 5;
	public static final int CLICKED_ON_BUTTONS = 6;
	
	
	private static Texture rotationCircle;
	private static Texture circleGlow;
	private static Texture movementCircle;
	private static Texture rotationElipse;
	private static Texture movementElipse;
	private static Texture ellipseGlow;
	
	// TODO fix check what this is
	private static int clickedOn = 0;
	private static int ellipseSide = 0;
	private static int rotationCircleAngle = 0;
	private static float rotationCircleDistance = 0;
	// *

	public HUD() {
		initHUDTextures();
	}
	
	/**
	 * @since 0.1
	 * @version 0.4
	 */
	private void initHUDTextures(){
	    //load textures
	    try {
            rotationCircle = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/rotationCircle.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/rotationCircle.png unsuccessful");
            e.printStackTrace();
        }
        try {
            circleGlow = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/circleGlow.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/circleGlow.png unsuccessful");
            e.printStackTrace();
        }
        try {
            movementCircle = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/movementCircle.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/movementCircle.png unsuccessful");
            e.printStackTrace();
        }
        try {
            rotationElipse = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/rotationElipse.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/rotationElipse.png unsuccessful");
            e.printStackTrace();
        }
        try {
            movementElipse = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/movementElipse.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/movementElipse.png unsuccessful");
            e.printStackTrace();
        }
        try {
            ellipseGlow = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("main/ellipseGlow.png"));
        } catch(IOException e) {
            System.err.println("Loading texture main/ellipseGlow.png unsuccessful");
            e.printStackTrace();
        }
	}
	
	/**
     * @since 0.1
     * @version 0.1
     */
	public void drawHUD(){
	    //prepare
        glTexEnvf(GL_TEXTURE_ENV,GL_TEXTURE_ENV_MODE,GL_MODULATE);
        glMatrixMode(GL_PROJECTION);
        glPushMatrix();
        glLoadIdentity();
        glOrtho(0, MainFrameRefactored.settings.resWidth, 0, MainFrameRefactored.settings.resHeight, 0.2f, 2);
        glMatrixMode(GL_MODELVIEW);
        glPushMatrix();
        glLoadIdentity();
        glDisable(GL_LIGHTING);
	    glEnable(GL_TEXTURE_2D);
        glClearColor(0f, 0f, 0f, 0f);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        
        //begin drawing
	    float w=MainFrameRefactored.settings.resWidth;
        float h=MainFrameRefactored.settings.resHeight;
        float r=w/18;
        float offset=r*2/3;
        float x=w-offset-r;
        float y=h-h/18-offset-r;
        float x2=w-offset-r;
        float y2=h-h/18-2*offset-3*r;
        
        glColor4f(1,1,1,1);
        GL11.glBindTexture(GL_TEXTURE_2D, rotationElipse.getTextureID());
        glBegin(GL_QUADS);
        glTexCoord2f(1, 0);
        glVertex3f(x+1.5f*r, y+r, -1.0f);
        glTexCoord2f(0, 0);
        glVertex3f(x-1.5f*r, y+r, -1.0f);
        glTexCoord2f(0, 1);
        glVertex3f(x-1.5f*r, y-r, -1.0f);
        glTexCoord2f(1, 1);
        glVertex3f(x+1.5f*r, y-r, -1.0f);
        glEnd();
        GL11.glBindTexture(GL_TEXTURE_2D, movementElipse.getTextureID());
        glBegin(GL_QUADS);
        glTexCoord2f(1, 0);
        glVertex3f(x2+1.5f*r, y2+r, -1.0f);
        glTexCoord2f(0, 0);
        glVertex3f(x2-1.5f*r, y2+r, -1.0f);
        glTexCoord2f(0, 1);
        glVertex3f(x2-1.5f*r, y2-r, -1.0f);
        glTexCoord2f(1, 1);
        glVertex3f(x2+1.5f*r, y2-r, -1.0f);
        glEnd();
        
        if(clickedOn==CLICKED_ON_MOVE_ELLIPSE || clickedOn==CLICKED_ON_ROTATION_ELLIPSE){
            float x3=x, y3=y;
            if(clickedOn==CLICKED_ON_MOVE_ELLIPSE){x3=x2; y3=y2;}
            glPushMatrix();
            glTranslatef(x3, y3, 0);
            if(ellipseSide==0)glRotatef((float)(180), 0, 0, 1);
            glTranslatef(-x3, -y3, 0);
            GL11.glBindTexture(GL_TEXTURE_2D, ellipseGlow.getTextureID());
            glColor4f(1,1,1, 0.5f);
            glBegin(GL_QUADS);
            glTexCoord2f(1, 0);
            glVertex3f(x3+1.5f*r, y3+r, -0.8f);
            glTexCoord2f(0, 0);
            glVertex3f(x3-1.5f*r, y3+r, -0.8f);
            glTexCoord2f(0, 1);
            glVertex3f(x3-1.5f*r, y3-r, -0.8f);
            glTexCoord2f(1, 1);
            glVertex3f(x3+1.5f*r, y3-r, -0.8f);
            glEnd();
            glPopMatrix();
        }
        glColor4f(1,1,1,1);
        GL11.glBindTexture(GL_TEXTURE_2D, rotationCircle.getTextureID());
        glBegin(GL_QUADS);
        glTexCoord2f(1, 0);
        glVertex3f(x+r, y+r, -0.6f);
        glTexCoord2f(0, 0);
        glVertex3f(x-r, y+r, -0.6f);
        glTexCoord2f(0, 1);
        glVertex3f(x-r, y-r, -0.6f);
        glTexCoord2f(1, 1);
        glVertex3f(x+r, y-r, -0.6f);
        glEnd();
        
        
      //begin drawing
        GL11.glBindTexture(GL_TEXTURE_2D, movementCircle.getTextureID());
        glBegin(GL_QUADS);
        glTexCoord2f(1, 0);
        glVertex3f(x2+r, y2+r, -0.6f);
        glTexCoord2f(0, 0);
        glVertex3f(x2-r, y2+r, -0.6f);
        glTexCoord2f(0, 1);
        glVertex3f(x2-r, y2-r, -0.6f);
        glTexCoord2f(1, 1);
        glVertex3f(x2+r, y2-r, -0.6f);
        glEnd();
        if(clickedOn==CLICKED_ON_ROTATION_CIRCLE || clickedOn ==CLICKED_ON_MOVE_CIRCLE){
            if(clickedOn==CLICKED_ON_MOVE_CIRCLE){x=x2; y=y2;}
            glPushMatrix();
            glTranslatef(x, y, 0);
            glRotatef((float)(180*rotationCircleAngle/Math.PI), 0, 0, 1);
            glTranslatef(-x, -y, 0);
            GL11.glBindTexture(GL_TEXTURE_2D, circleGlow.getTextureID());
            glColor4f(1,1,1,(float)rotationCircleDistance);
            glBegin(GL_QUADS);
            glTexCoord2f(1, 0);
            glVertex3f(x+r, y+r, -0.4f);
            glTexCoord2f(0, 0);
            glVertex3f(x-r, y+r, -0.4f);
            glTexCoord2f(0, 1);
            glVertex3f(x-r, y-r, -0.4f);
            glTexCoord2f(1, 1);
            glVertex3f(x+r, y-r, -0.4f);
            glEnd();
            glPopMatrix();
        }
        
        //exit "HUD" mode
        glDisable(GL_BLEND);
        glDisable(GL_TEXTURE_2D);
        glEnable(GL_LIGHTING);
        glMatrixMode(GL_PROJECTION);
        glPopMatrix();
        glMatrixMode(GL_MODELVIEW);
        glPopMatrix();
	}
	
	public void enable() {}
	
	public void disable() {}
	
}