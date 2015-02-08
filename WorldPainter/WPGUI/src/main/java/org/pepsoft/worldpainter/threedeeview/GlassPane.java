/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GlassPane.java
 *
 * Created on 26-jan-2012, 19:34:38
 */
package org.pepsoft.worldpainter.threedeeview;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.pepsoft.minecraft.Direction;
import org.pepsoft.util.IconUtils;

/**
 *
 * @author pepijn
 */
public class GlassPane extends javax.swing.JPanel {
    /** Creates new form GlassPane */
    public GlassPane() {
        initComponents();
    }
    
    public void setRotation(Direction rotation) {
        switch (rotation) {
            case SOUTH:
                jLabel1.setIcon(NORTH_ARROW_BOTTOM_RIGHT);
                break;
            case WEST:
                jLabel1.setIcon(NORTH_ARROW_BOTTOM_LEFT);
                break;
            case NORTH:
                jLabel1.setIcon(NORTH_ARROW_TOP_LEFT);
                break;
            case EAST:
                jLabel1.setIcon(NORTH_ARROW_TOP_RIGHT);
                break;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pepsoft/worldpainter/north_arrow_top_left.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private static final Icon NORTH_ARROW_TOP_LEFT     = new ImageIcon(IconUtils.loadImage("org/pepsoft/worldpainter/north_arrow_top_left.png"));
    private static final Icon NORTH_ARROW_TOP_RIGHT    = new ImageIcon(IconUtils.loadImage("org/pepsoft/worldpainter/north_arrow_top_right.png"));
    private static final Icon NORTH_ARROW_BOTTOM_RIGHT = new ImageIcon(IconUtils.loadImage("org/pepsoft/worldpainter/north_arrow_bottom_right.png"));
    private static final Icon NORTH_ARROW_BOTTOM_LEFT  = new ImageIcon(IconUtils.loadImage("org/pepsoft/worldpainter/north_arrow_bottom_left.png"));

    private static final long serialVersionUID = 1L;
}