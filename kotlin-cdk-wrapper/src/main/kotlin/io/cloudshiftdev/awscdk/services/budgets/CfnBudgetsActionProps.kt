@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBudgetsActionProps {
  public fun actionThreshold(): Any

  public fun actionType(): String

  public fun approvalModel(): String? = unwrap(this).getApprovalModel()

  public fun budgetName(): String

  public fun definition(): Any

  public fun executionRoleArn(): String

  public fun notificationType(): String

  public fun subscribers(): Any

  @CdkDslMarker
  public interface Builder {
    public fun actionThreshold(actionThreshold: IResolvable)

    public fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ce6dcb10f2139db638cd1119b7c775d7488b0272c7802583b44c99b4ea3d2f")
    public
        fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty.Builder.() -> Unit)

    public fun actionType(actionType: String)

    public fun approvalModel(approvalModel: String)

    public fun budgetName(budgetName: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnBudgetsAction.DefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bce6f6637b65663c1a15125ecb060e91b067faf805a392f648257b11c7aaefa5")
    public fun definition(definition: CfnBudgetsAction.DefinitionProperty.Builder.() -> Unit)

    public fun executionRoleArn(executionRoleArn: String)

    public fun notificationType(notificationType: String)

    public fun subscribers(subscribers: IResolvable)

    public fun subscribers(subscribers: List<Any>)

    public fun subscribers(vararg subscribers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.builder()

    override fun actionThreshold(actionThreshold: IResolvable) {
      cdkBuilder.actionThreshold(actionThreshold.let(IResolvable::unwrap))
    }

    override fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty) {
      cdkBuilder.actionThreshold(actionThreshold.let(CfnBudgetsAction.ActionThresholdProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ce6dcb10f2139db638cd1119b7c775d7488b0272c7802583b44c99b4ea3d2f")
    override
        fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty.Builder.() -> Unit):
        Unit = actionThreshold(CfnBudgetsAction.ActionThresholdProperty(actionThreshold))

    override fun actionType(actionType: String) {
      cdkBuilder.actionType(actionType)
    }

    override fun approvalModel(approvalModel: String) {
      cdkBuilder.approvalModel(approvalModel)
    }

    override fun budgetName(budgetName: String) {
      cdkBuilder.budgetName(budgetName)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnBudgetsAction.DefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnBudgetsAction.DefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bce6f6637b65663c1a15125ecb060e91b067faf805a392f648257b11c7aaefa5")
    override fun definition(definition: CfnBudgetsAction.DefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnBudgetsAction.DefinitionProperty(definition))

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun notificationType(notificationType: String) {
      cdkBuilder.notificationType(notificationType)
    }

    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudgetsActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps,
  ) : CdkObject(cdkObject), CfnBudgetsActionProps {
    override fun actionThreshold(): Any = unwrap(this).getActionThreshold()

    override fun actionType(): String = unwrap(this).getActionType()

    override fun approvalModel(): String? = unwrap(this).getApprovalModel()

    override fun budgetName(): String = unwrap(this).getBudgetName()

    override fun definition(): Any = unwrap(this).getDefinition()

    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    override fun notificationType(): String = unwrap(this).getNotificationType()

    override fun subscribers(): Any = unwrap(this).getSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBudgetsActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps):
        CfnBudgetsActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBudgetsActionProps):
        software.amazon.awscdk.services.budgets.CfnBudgetsActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
  }
}
