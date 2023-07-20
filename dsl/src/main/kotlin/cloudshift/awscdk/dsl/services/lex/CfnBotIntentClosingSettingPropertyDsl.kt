@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotIntentClosingSettingPropertyDsl {
  private val cdkBuilder: CfnBot.IntentClosingSettingProperty.Builder =
      CfnBot.IntentClosingSettingProperty.builder()

  public fun closingResponse(closingResponse: IResolvable) {
    cdkBuilder.closingResponse(closingResponse)
  }

  public fun closingResponse(closingResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.closingResponse(closingResponse)
  }

  public fun conditional(conditional: IResolvable) {
    cdkBuilder.conditional(conditional)
  }

  public fun conditional(conditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.conditional(conditional)
  }

  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  public fun nextStep(nextStep: IResolvable) {
    cdkBuilder.nextStep(nextStep)
  }

  public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.nextStep(nextStep)
  }

  public fun build(): CfnBot.IntentClosingSettingProperty = cdkBuilder.build()
}
