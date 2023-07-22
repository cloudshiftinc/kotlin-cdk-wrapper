@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Specifies settings that are unique to a locale.
 *
 * For example, you can use different Lambda function depending on the bot's locale.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * BotAliasLocaleSettingsItemProperty botAliasLocaleSettingsItemProperty =
 * BotAliasLocaleSettingsItemProperty.builder()
 * .botAliasLocaleSetting(BotAliasLocaleSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .codeHookSpecification(CodeHookSpecificationProperty.builder()
 * .lambdaCodeHook(LambdaCodeHookProperty.builder()
 * .codeHookInterfaceVersion("codeHookInterfaceVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .build())
 * .localeId("localeId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettingsitem.html)
 */
@CdkDslMarker
public class CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl {
  private val cdkBuilder: CfnBotAlias.BotAliasLocaleSettingsItemProperty.Builder =
      CfnBotAlias.BotAliasLocaleSettingsItemProperty.builder()

  /**
   * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
   */
  public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
    cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
  }

  /**
   * @param botAliasLocaleSetting Specifies settings that are unique to a locale. 
   */
  public
      fun botAliasLocaleSetting(botAliasLocaleSetting: CfnBotAlias.BotAliasLocaleSettingsProperty) {
    cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
  }

  /**
   * @param localeId The unique identifier of the locale. 
   */
  public fun localeId(localeId: String) {
    cdkBuilder.localeId(localeId)
  }

  public fun build(): CfnBotAlias.BotAliasLocaleSettingsItemProperty = cdkBuilder.build()
}
