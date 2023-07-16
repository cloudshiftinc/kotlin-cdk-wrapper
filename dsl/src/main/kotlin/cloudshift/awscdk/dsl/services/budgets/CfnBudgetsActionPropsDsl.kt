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

  public fun actionThreshold(actionThreshold: IResolvable) {
    cdkBuilder.actionThreshold(actionThreshold)
  }

  public fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty) {
    cdkBuilder.actionThreshold(actionThreshold)
  }

  public fun actionType(actionType: String) {
    cdkBuilder.actionType(actionType)
  }

  public fun approvalModel(approvalModel: String) {
    cdkBuilder.approvalModel(approvalModel)
  }

  public fun budgetName(budgetName: String) {
    cdkBuilder.budgetName(budgetName)
  }

  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  public fun definition(definition: CfnBudgetsAction.DefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun notificationType(notificationType: String) {
    cdkBuilder.notificationType(notificationType)
  }

  public fun subscribers(vararg subscribers: Any) {
    _subscribers.addAll(listOf(*subscribers))
  }

  public fun subscribers(subscribers: Collection<Any>) {
    _subscribers.addAll(subscribers)
  }

  public fun subscribers(subscribers: IResolvable) {
    cdkBuilder.subscribers(subscribers)
  }

  public fun build(): CfnBudgetsActionProps {
    if(_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
    return cdkBuilder.build()
  }
}
