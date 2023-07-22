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

  /**
   * @param closingResponse The response that Amazon Lex sends to the user when the intent is
   * complete.
   */
  public fun closingResponse(closingResponse: IResolvable) {
    cdkBuilder.closingResponse(closingResponse)
  }

  /**
   * @param closingResponse The response that Amazon Lex sends to the user when the intent is
   * complete.
   */
  public fun closingResponse(closingResponse: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.closingResponse(closingResponse)
  }

  /**
   * @param conditional A list of conditional branches associated with the intent's closing
   * response.
   * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional` .
   */
  public fun conditional(conditional: IResolvable) {
    cdkBuilder.conditional(conditional)
  }

  /**
   * @param conditional A list of conditional branches associated with the intent's closing
   * response.
   * These branches are executed when the `nextStep` attribute is set to `EvalutateConditional` .
   */
  public fun conditional(conditional: CfnBot.ConditionalSpecificationProperty) {
    cdkBuilder.conditional(conditional)
  }

  /**
   * @param isActive Specifies whether an intent's closing response is used.
   * When this field is false, the closing response isn't sent to the user. If the `IsActive` field
   * isn't specified, the default is true.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Specifies whether an intent's closing response is used.
   * When this field is false, the closing response isn't sent to the user. If the `IsActive` field
   * isn't specified, the default is true.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param nextStep Specifies the next step that the bot executes after playing the intent's
   * closing response.
   */
  public fun nextStep(nextStep: IResolvable) {
    cdkBuilder.nextStep(nextStep)
  }

  /**
   * @param nextStep Specifies the next step that the bot executes after playing the intent's
   * closing response.
   */
  public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.nextStep(nextStep)
  }

  public fun build(): CfnBot.IntentClosingSettingProperty = cdkBuilder.build()
}
