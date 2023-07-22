@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps

@CdkDslMarker
public class CfnBudgetsActionPropsDsl {
  private val cdkBuilder: CfnBudgetsActionProps.Builder = CfnBudgetsActionProps.builder()

  private val _subscribers: MutableList<Any> = mutableListOf()

  /**
   * @param actionThreshold The trigger threshold of the action. 
   */
  public fun actionThreshold(actionThreshold: IResolvable) {
    cdkBuilder.actionThreshold(actionThreshold)
  }

  /**
   * @param actionThreshold The trigger threshold of the action. 
   */
  public fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty) {
    cdkBuilder.actionThreshold(actionThreshold)
  }

  /**
   * @param actionType The type of action. 
   * This defines the type of tasks that can be carried out by this action. This field also
   * determines the format for definition.
   */
  public fun actionType(actionType: String) {
    cdkBuilder.actionType(actionType)
  }

  /**
   * @param approvalModel This specifies if the action needs manual or automatic approval.
   */
  public fun approvalModel(approvalModel: String) {
    cdkBuilder.approvalModel(approvalModel)
  }

  /**
   * @param budgetName A string that represents the budget name. 
   * ":" and "" characters aren't allowed.
   */
  public fun budgetName(budgetName: String) {
    cdkBuilder.budgetName(budgetName)
  }

  /**
   * @param definition Specifies all of the type-specific parameters. 
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param definition Specifies all of the type-specific parameters. 
   */
  public fun definition(definition: CfnBudgetsAction.DefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param executionRoleArn The role passed for action execution and reversion. 
   * Roles and actions must be in the same account.
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param notificationType The type of a notification. 
   */
  public fun notificationType(notificationType: String) {
    cdkBuilder.notificationType(notificationType)
  }

  /**
   * @param subscribers A list of subscribers. 
   */
  public fun subscribers(vararg subscribers: Any) {
    _subscribers.addAll(listOf(*subscribers))
  }

  /**
   * @param subscribers A list of subscribers. 
   */
  public fun subscribers(subscribers: Collection<Any>) {
    _subscribers.addAll(subscribers)
  }

  /**
   * @param subscribers A list of subscribers. 
   */
  public fun subscribers(subscribers: IResolvable) {
    cdkBuilder.subscribers(subscribers)
  }

  public fun build(): CfnBudgetsActionProps {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
