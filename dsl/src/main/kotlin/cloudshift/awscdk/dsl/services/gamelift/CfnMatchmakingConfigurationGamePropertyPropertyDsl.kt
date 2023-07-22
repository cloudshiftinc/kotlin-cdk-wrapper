@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration

/**
 * Set of key-value pairs that contain information about a game session.
 *
 * When included in a game session request, these properties communicate details to be used when
 * setting up the new game session. For example, a game property might specify a game mode, level, or
 * map. Game properties are passed to the game server process when initiating a new game session. For
 * more information, see the [Amazon GameLift Developer
 * Guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * GamePropertyProperty gamePropertyProperty = GamePropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html)
 */
@CdkDslMarker
public class CfnMatchmakingConfigurationGamePropertyPropertyDsl {
  private val cdkBuilder: CfnMatchmakingConfiguration.GamePropertyProperty.Builder =
      CfnMatchmakingConfiguration.GamePropertyProperty.builder()

  /**
   * @param key The game property identifier. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The game property value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnMatchmakingConfiguration.GamePropertyProperty = cdkBuilder.build()
}
