@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotObfuscationSettingPropertyDsl {
  private val cdkBuilder: CfnBot.ObfuscationSettingProperty.Builder =
      CfnBot.ObfuscationSettingProperty.builder()

  /**
   * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values in
   * conversation logs. 
   * The default is to obscure the values.
   */
  public fun obfuscationSettingType(obfuscationSettingType: String) {
    cdkBuilder.obfuscationSettingType(obfuscationSettingType)
  }

  public fun build(): CfnBot.ObfuscationSettingProperty = cdkBuilder.build()
}
