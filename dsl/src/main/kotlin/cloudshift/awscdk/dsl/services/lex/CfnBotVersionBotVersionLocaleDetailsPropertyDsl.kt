@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotVersion

@CdkDslMarker
public class CfnBotVersionBotVersionLocaleDetailsPropertyDsl {
  private val cdkBuilder: CfnBotVersion.BotVersionLocaleDetailsProperty.Builder =
      CfnBotVersion.BotVersionLocaleDetailsProperty.builder()

  /**
   * @param sourceBotVersion The version of a bot used for a bot locale. 
   */
  public fun sourceBotVersion(sourceBotVersion: String) {
    cdkBuilder.sourceBotVersion(sourceBotVersion)
  }

  public fun build(): CfnBotVersion.BotVersionLocaleDetailsProperty = cdkBuilder.build()
}
