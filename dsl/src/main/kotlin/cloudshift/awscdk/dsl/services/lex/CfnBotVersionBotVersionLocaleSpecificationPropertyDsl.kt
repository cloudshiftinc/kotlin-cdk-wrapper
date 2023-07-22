@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotVersion

@CdkDslMarker
public class CfnBotVersionBotVersionLocaleSpecificationPropertyDsl {
  private val cdkBuilder: CfnBotVersion.BotVersionLocaleSpecificationProperty.Builder =
      CfnBotVersion.BotVersionLocaleSpecificationProperty.builder()

  /**
   * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
   */
  public fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable) {
    cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails)
  }

  /**
   * @param botVersionLocaleDetails The version of a bot used for a bot locale. 
   */
  public
      fun botVersionLocaleDetails(botVersionLocaleDetails: CfnBotVersion.BotVersionLocaleDetailsProperty) {
    cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails)
  }

  /**
   * @param localeId The identifier of the locale to add to the version. 
   */
  public fun localeId(localeId: String) {
    cdkBuilder.localeId(localeId)
  }

  public fun build(): CfnBotVersion.BotVersionLocaleSpecificationProperty = cdkBuilder.build()
}
