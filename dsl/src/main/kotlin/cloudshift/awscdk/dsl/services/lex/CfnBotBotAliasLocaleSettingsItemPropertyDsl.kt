@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotBotAliasLocaleSettingsItemPropertyDsl {
  private val cdkBuilder: CfnBot.BotAliasLocaleSettingsItemProperty.Builder =
      CfnBot.BotAliasLocaleSettingsItemProperty.builder()

  /**
   * @param botAliasLocaleSetting Specifies locale settings for a locale. 
   */
  public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
    cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
  }

  /**
   * @param botAliasLocaleSetting Specifies locale settings for a locale. 
   */
  public fun botAliasLocaleSetting(botAliasLocaleSetting: CfnBot.BotAliasLocaleSettingsProperty) {
    cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
  }

  /**
   * @param localeId Specifies the locale that the settings apply to. 
   */
  public fun localeId(localeId: String) {
    cdkBuilder.localeId(localeId)
  }

  public fun build(): CfnBot.BotAliasLocaleSettingsItemProperty = cdkBuilder.build()
}
