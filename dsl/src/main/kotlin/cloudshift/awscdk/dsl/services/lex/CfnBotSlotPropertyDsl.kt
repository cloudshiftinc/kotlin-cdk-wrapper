@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotPropertyDsl {
  private val cdkBuilder: CfnBot.SlotProperty.Builder = CfnBot.SlotProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun multipleValuesSetting(multipleValuesSetting: IResolvable) {
    cdkBuilder.multipleValuesSetting(multipleValuesSetting)
  }

  public fun multipleValuesSetting(multipleValuesSetting: CfnBot.MultipleValuesSettingProperty) {
    cdkBuilder.multipleValuesSetting(multipleValuesSetting)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun obfuscationSetting(obfuscationSetting: IResolvable) {
    cdkBuilder.obfuscationSetting(obfuscationSetting)
  }

  public fun obfuscationSetting(obfuscationSetting: CfnBot.ObfuscationSettingProperty) {
    cdkBuilder.obfuscationSetting(obfuscationSetting)
  }

  public fun slotTypeName(slotTypeName: String) {
    cdkBuilder.slotTypeName(slotTypeName)
  }

  public fun valueElicitationSetting(valueElicitationSetting: IResolvable) {
    cdkBuilder.valueElicitationSetting(valueElicitationSetting)
  }

  public
      fun valueElicitationSetting(valueElicitationSetting: CfnBot.SlotValueElicitationSettingProperty) {
    cdkBuilder.valueElicitationSetting(valueElicitationSetting)
  }

  public fun build(): CfnBot.SlotProperty = cdkBuilder.build()
}
