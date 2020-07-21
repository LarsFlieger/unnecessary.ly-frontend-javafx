package ly.unnecessary.frontend.components.powerups;

import static com.almasb.fxgl.dsl.FXGL.byType;
import static com.almasb.fxgl.dsl.FXGL.geti;
import static com.almasb.fxgl.dsl.FXGL.texture;

import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.texture.Texture;

import ly.unnecessary.frontend.EntityType;
import ly.unnecessary.frontend.components.BallComponent;

/**
 * Super Ball Power Up Component
 * Will spawn when the player is collecting a super ball power up.
 */
public class SuperBallComponent extends Component {

    /**
     * Adds the super ball texture to all balls
     */
    @Override
    public void onAdded() {
        byType(EntityType.BALL).forEach(e -> e.getComponent(BallComponent.class).addSuperBallTexture());
    }

    /**
     * Removes the super ball texture from all balls
     */
    @Override
    public void onRemoved() {
        byType(EntityType.BALL).forEach(e -> e.getComponent(BallComponent.class).removeSuperBallTexture());
    }
}
