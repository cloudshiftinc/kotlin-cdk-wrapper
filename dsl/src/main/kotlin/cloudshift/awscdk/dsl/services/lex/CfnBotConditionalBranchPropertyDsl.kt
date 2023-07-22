@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotConditionalBranchPropertyDsl {
  private val cdkBuilder: CfnBot.ConditionalBranchProperty.Builder =
      CfnBot.ConditionalBranchProperty.builder()

  /**
   * @param condition Contains the expression to evaluate. 
   * If the condition is true, the branch's actions are taken.
   */
  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param condition Contains the expression to evaluate. 
   * If the condition is true, the branch's actions are taken.
   */
  public fun condition(condition: CfnBot.ConditionProperty) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param name The name of the branch. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

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

  public fun build(): CfnBot.ConditionalBranchProperty = cdkBuilder.build()
}
