@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDefaultConditionalBranchPropertyDsl {
  private val cdkBuilder: CfnBot.DefaultConditionalBranchProperty.Builder =
      CfnBot.DefaultConditionalBranchProperty.builder()

  /**
   * @param nextStep The next step in the conversation.
   */
  public fun nextStep(nextStep: IResolvable) {
    cdkBuilder.nextStep(nextStep)
  }

  /**
   * @param nextStep The next step in the conversation.
   */
  public fun nextStep(nextStep: CfnBot.DialogStateProperty) {
    cdkBuilder.nextStep(nextStep)
  }

  /**
   * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
   * input.
   */
  public fun response(response: IResolvable) {
    cdkBuilder.response(response)
  }

  /**
   * @param response Specifies a list of message groups that Amazon Lex uses to respond the user
   * input.
   */
  public fun response(response: CfnBot.ResponseSpecificationProperty) {
    cdkBuilder.response(response)
  }

  public fun build(): CfnBot.DefaultConditionalBranchProperty = cdkBuilder.build()
}
