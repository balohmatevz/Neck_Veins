package main;

public class CreditsAndHelpTMP {
	public static String helpString="The Q, W, E, A, S and D keyboard buttons are used to look arround (rotate the camera):\n" +
	        "   W - looks up\n   S - looks down\n   A - looks to the left\n   D - looks to the right\n" +
	        "   Q - rotates the camera counterclockwise\n   E - rotates the camera clockwise\n" +
	        "You can also use the ellipse on the right for more intuitive or finer rotations.\n\n" +
	        "The arows keys and the R and F keyboard buttons are used to move (translate) the camera:\n" +
	        "   Up Arrow - moves camera forward\n   Down Arrow - moves camera backwards\n" +
	        "   Left Arrow - moves the camera left\n   Right Arrow - moves the camera right\n" +
	        "   R - moves the camera upwards\n   F - moves the camera downwards\n" +
	        "You can also use the ellipse on the right for more intuitive or finer movements.\n\n" +
	        "You can scroll the mouse wheel to move closer or further away from the model.\n" +
	        "You can click on an invisible sphere around the model and drag to rotate it.\n\n" +
	        "You may change how the model is rendered with the following buttons:\n" +
	        "   0 - use a fixed function pipeline\n" +
	        "   1 - use a simple shader\n" +
	        "   2 - like 1, but uses interpolated normals\n" +
	        "   3 - like 2, but adds ambient light\n" +
	        "   4 - like 3, but adds a specular component using Blinn�Phong model\n" +
	        "   5 - like 3, but adds a specular component using Phong model (default)\n" +
	        "   9 - toggles wireframe mode\n\n" +
	        "You may apply a level of surface subdivision with the + button . Or switch back with the - button.\n" +
	        "Maximal surface subdivision level that this application allows is 3. The starting one is 0.\n" +
	        "Disclamer: Switching to a higher subdivision level for the first time constructs a new mesh.\n" +
	        "Each such construction lasts about 6 times longer and is more likely to crash this application.\n\n" +
	        "You can also activate 3D rendering for displays that support interlaced stereo.\n" +
	        "The slider that appears below the \"Stereo (3D)\" button changes the distance between the eyes.\n" +
	        "If the picture drawn for the right eye is shown to your left eye and vice versa, \n" +
	        "try moving the slider on the other side of it's middle point.";
	
	public static String creditsString="Author(s):\n" +
    		" - Simon �agar\n" +
    		" - 3rd party libraries used, their respective licenses can be seen below.\n\n" +
    		"This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.\n" +
    		"To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/\n" +
    		" or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.\n" +
    		"\n" +
            "This software uses LWJGL (Lightweight Java Game Library).\n" +
            "LWJGL's license is quoted below between the two lines drawn with minus signs:\n" +
            "-------------------------------------- LWJGL License: --------------------------------------\n" +
            "\"Copyright (c) 2002-2008 Lightweight Java Game Library Project\n" +
            "All rights reserved.\n\n" +
            "Redistribution and use in source and binary forms, with or without\n" +
            "modification, are permitted provided that the following conditions are\n" +
            "met:\n\n" +
            "* Redistributions of source code must retain the above copyright\n" +
            "  notice, this list of conditions and the following disclaimer.\n\n" +
            "* Redistributions in binary form must reproduce the above copyright\n" +
            "  notice, this list of conditions and the following disclaimer in the\n" +
            "  documentation and/or other materials provided with the distribution.\n\n" +
            "* Neither the name of 'Light Weight Java Game Library' nor the names of\n" +
            "  its contributors may be used to endorse or promote products derived\n" +
            "  from this software without specific prior written permission.\n\n" +
            "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS\n" +
            "\"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED\n" +
            "TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR\n" +
            "PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR\n" +
            "CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,\n" +
            "EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,\n" +
            "PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n" +
            "PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF\n" +
            "LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING\n" +
            "NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS\n" +
            "SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\"\n"+
            "--------------------------------------------------------------------------------------------\n\n\n\n"+
            
            "This software uses Slick-Util library.\n" +
            "Slick-Util library license is quoted below between the two lines drawn with minus signs:\n" +
            "-------------------------------- Slick-Util library License: --------------------------------\n" +
            "\"Copyright (c) 2007, Slick 2D\n\n" +
            "All rights reserved.\n\n" +
            "Redistribution and use in source and binary forms, with or without\n" +
            "modification, are permitted provided that the following conditions are\n" +
            "met:\n\n" +
            "* Redistributions of source code must retain the above copyright\n" +
            "  notice, this list of conditions and the following disclaimer.\n\n" +
            "* Redistributions in binary form must reproduce the above copyright\n" +
            "  notice, this list of conditions and the following disclaimer in the\n" +
            "  documentation and/or other materials provided with the distribution.\n\n" +
            "* Neither the name of Slick 2D nor the names of\n" +
            "  its contributors may be used to endorse or promote products derived\n" +
            "  from this software without specific prior written permission.\n\n" +
            "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS\n" +
            "\"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED\n" +
            "TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR\n" +
            "PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR\n" +
            "CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,\n" +
            "EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,\n" +
            "PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n" +
            "PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF\n" +
            "LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING\n" +
            "NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS\n" +
            "SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\"\n"+
            "--------------------------------------------------------------------------------------------\n\n\n\n"+
            
    		"This software uses TWL (Themable Widget Library).\n" +
    		"TWL's license is quoted below between the two lines drawn with minus signs:\n" +
    		"--------------------------------------- TWL License: ---------------------------------------\n" +
    		"\"Copyright (c) 2008-2009, Matthias Mann\n\n" +
    		"All rights reserved.\n\n" +
    		"Redistribution and use in source and binary forms, with or without\n" +
    		"modification, are permitted provided that the following conditions are met:\n\n" +
    		"     * Redistributions of source code must retain the above copyright notice,\n" +
    		"       this list of conditions and the following disclaimer.\n" +
    		"     * Redistributions in binary form must reproduce the above copyright\n" +
    		"       notice, this list of conditions and the following disclaimer in the\n" +
    		"       documentation and/or other materials provided with the distribution.\n" +
    		"     * Neither the name of Matthias Mann nor the names of its contributors may\n" +
    		"       be used to endorse or promote products derived from this software\n" +
    		"       without specific prior written permission.\n\n" +
    		"THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS\n" +
    		"\"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT\n" +
    		"LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR\n" +
    		"A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR\n" +
    		"CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,\n" +
    		"EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,\n" +
    		"PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n" +
    		"PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF\n" +
    		"LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING\n" +
    		"NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS\n" +
    		"SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\"\n" +
    		"--------------------------------------------------------------------------------------------\n\n\n"+
            "TWL uses XML Pull Parser 3 (XPP3).\n" +
            "It's license requests the following two lines to be quoted:\n" +
            "  \"This product includes software developed by the Indiana University \n" +
            "  Extreme! Lab (http://www.extreme.indiana.edu/).\"\n\n" +
            "XPP3's license is quoted below between the two lines drawn with minus signs:\n" +
            "--------------------------------------- XPP3 License: ---------------------------------------\n" +
            "\"Indiana University Extreme! Lab Software License\n\n" +
            "Version 1.1.1\n\n" +
            "Copyright (c) 2002 Extreme! Lab, Indiana University. All rights reserved.\n\n" +
            "Redistribution and use in source and binary forms, with or without\n" +
            "modification, are permitted provided that the following conditions are met:\n\n" +
            "1. Redistributions of source code must retain the above copyright notice, \n" +
            "   this list of conditions and the following disclaimer.\n\n" +
            "2. Redistributions in binary form must reproduce the above copyright \n" +
            "   notice, this list of conditions and the following disclaimer in \n" +
            "   the documentation and/or other materials provided with the distribution.\n\n" +
            "3. The end-user documentation included with the redistribution, if any, \n" +
            "   must include the following acknowledgment:\n\n" +
            "  \"This product includes software developed by the Indiana University \n" +
            "  Extreme! Lab (http://www.extreme.indiana.edu/).\"\n\n" +
            "Alternately, this acknowledgment may appear in the software itself, \n" +
            "if and wherever such third-party acknowledgments normally appear.\n\n" +
            "4. The names \"Indiana Univeristy\" and \"Indiana Univeristy Extreme! Lab\"\n" +
            "must not be used to endorse or promote products derived from this \n" +
            "software without prior written permission. For written permission, \n" +
            "please contact http://www.extreme.indiana.edu/.\n\n" +
            "5. Products derived from this software may not use \"Indiana Univeristy\" \n" +
            "name nor may \"Indiana Univeristy\" appear in their name, without prior \n" +
            "written permission of the Indiana University.\n\n" +
            "THIS SOFTWARE IS PROVIDED \"AS IS\" AND ANY EXPRESSED OR IMPLIED\n" +
            "WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF\n" +
            "MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.\n" +
            "IN NO EVENT SHALL THE AUTHORS, COPYRIGHT HOLDERS OR ITS CONTRIBUTORS\n" +
            "BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR\n" +
            "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF\n" +
            "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR\n" +
            "BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,\n" +
            "WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR\n" +
            "OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF\n" +
            "ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\"\n" +
            "--------------------------------------------------------------------------------------------\n";
	
	
}
