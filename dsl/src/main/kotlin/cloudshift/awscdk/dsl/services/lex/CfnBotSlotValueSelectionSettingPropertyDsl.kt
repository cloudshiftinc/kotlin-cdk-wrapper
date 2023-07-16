@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotValueSelectionSettingPropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueSelectionSettingProperty.Builder =
      CfnBot.SlotValueSelectionSettingProperty.builder()

  public fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable) {
    cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting)
  }

  public
      fun advancedRecognitionSetting(advancedRecognitionSetting: CfnBot.AdvancedRecognitionSettingProperty) {
    cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting)
  }

  public fun regexFilter(regexFilter: IResolvable) {
    cdkBuilder.regexFilter(regexFilter)
  }

  public fun regexFilter(regexFilter: CfnBot.SlotValueRegexFilterProperty) {
    cdkBuilder.regexFilter(regexFilter)
  }

  public fun resolutionStrategy(resolutionStrategy: String) {
    cdkBuilder.resolutionStrategy(resolutionStrategy)
  }

  public fun build(): CfnBot.SlotValueSelectionSettingProperty = cdkBuilder.build()
}
