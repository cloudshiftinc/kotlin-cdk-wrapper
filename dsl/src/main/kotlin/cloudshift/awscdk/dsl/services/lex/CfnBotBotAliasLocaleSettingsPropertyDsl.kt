@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotBotAliasLocaleSettingsPropertyDsl {
  private val cdkBuilder: CfnBot.BotAliasLocaleSettingsProperty.Builder =
      CfnBot.BotAliasLocaleSettingsProperty.builder()

  /**
   * @param codeHookSpecification Specifies the Lambda function that should be used in the locale.
   */
  public fun codeHookSpecification(codeHookSpecification: IResolvable) {
    cdkBuilder.codeHookSpecification(codeHookSpecification)
  }

  /**
   * @param codeHookSpecification Specifies the Lambda function that should be used in the locale.
   */
  public fun codeHookSpecification(codeHookSpecification: CfnBot.CodeHookSpecificationProperty) {
    cdkBuilder.codeHookSpecification(codeHookSpecification)
  }

  /**
   * @param enabled Determines whether the locale is enabled for the bot. 
   * If the value is `false` , the locale isn't available for use.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Determines whether the locale is enabled for the bot. 
   * If the value is `false` , the locale isn't available for use.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnBot.BotAliasLocaleSettingsProperty = cdkBuilder.build()
}
