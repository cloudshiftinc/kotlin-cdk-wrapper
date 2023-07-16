@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotGrammarSlotTypeSettingPropertyDsl {
  private val cdkBuilder: CfnBot.GrammarSlotTypeSettingProperty.Builder =
      CfnBot.GrammarSlotTypeSettingProperty.builder()

  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  public fun source(source: CfnBot.GrammarSlotTypeSourceProperty) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnBot.GrammarSlotTypeSettingProperty = cdkBuilder.build()
}
