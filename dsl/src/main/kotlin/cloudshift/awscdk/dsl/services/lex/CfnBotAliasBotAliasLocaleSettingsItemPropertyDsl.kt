@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

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
