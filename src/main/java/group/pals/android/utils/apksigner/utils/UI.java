/*
 *   Copyright 2012 Hai Bison
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package group.pals.android.utils.apksigner.utils;

import java.awt.Color;

/**
 *
 * @author Hai Bison
 */
public class UI {
    
    public static final Color SelectedFileColor = Color.blue;

    /**
     * Set <code>window</code> center screen, also resizes it by ratio 16:9  :-)
     * (in a multiplication with {@code luckyNo}
     * @param window
     * @param luckyNo 
     */
    public static void setWindowCenterScreen(java.awt.Window window, int luckyNo) {
        java.awt.Dimension dim;

        if (luckyNo > 0) {
            dim = new java.awt.Dimension(luckyNo * 16, luckyNo * 9);
            window.setMinimumSize(dim);
            window.setSize(dim);
        }

        dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((dim.width - window.getWidth()) / 2, (dim.height - window.getHeight()) / 2);
    }//setWindowCenterScreen
}