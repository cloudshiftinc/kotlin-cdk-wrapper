@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration

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
