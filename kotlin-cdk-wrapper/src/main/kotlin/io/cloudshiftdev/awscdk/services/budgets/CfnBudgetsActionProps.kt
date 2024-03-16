@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBudgetsAction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.budgets.*;
 * CfnBudgetsActionProps cfnBudgetsActionProps = CfnBudgetsActionProps.builder()
 * .actionThreshold(ActionThresholdProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .actionType("actionType")
 * .budgetName("budgetName")
 * .definition(DefinitionProperty.builder()
 * .iamActionDefinition(IamActionDefinitionProperty.builder()
 * .policyArn("policyArn")
 * // the properties below are optional
 * .groups(List.of("groups"))
 * .roles(List.of("roles"))
 * .users(List.of("users"))
 * .build())
 * .scpActionDefinition(ScpActionDefinitionProperty.builder()
 * .policyId("policyId")
 * .targetIds(List.of("targetIds"))
 * .build())
 * .ssmActionDefinition(SsmActionDefinitionProperty.builder()
 * .instanceIds(List.of("instanceIds"))
 * .region("region")
 * .subtype("subtype")
 * .build())
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .notificationType("notificationType")
 * .subscribers(List.of(SubscriberProperty.builder()
 * .address("address")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .approvalModel("approvalModel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html)
 */
public interface CfnBudgetsActionProps {
  /**
   * The trigger threshold of the action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
   */
  public fun actionThreshold(): Any

  /**
   * The type of action.
   *
   * This defines the type of tasks that can be carried out by this action. This field also
   * determines the format for definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actiontype)
   */
  public fun actionType(): String

  /**
   * This specifies if the action needs manual or automatic approval.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-approvalmodel)
   */
  public fun approvalModel(): String? = unwrap(this).getApprovalModel()

  /**
   * A string that represents the budget name.
   *
   * ":" and "" characters aren't allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-budgetname)
   */
  public fun budgetName(): String

  /**
   * Specifies all of the type-specific parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
   */
  public fun definition(): Any

  /**
   * The role passed for action execution and reversion.
   *
   * Roles and actions must be in the same account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-executionrolearn)
   */
  public fun executionRoleArn(): String

  /**
   * The type of a notification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-notificationtype)
   */
  public fun notificationType(): String

  /**
   * A list of subscribers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
   */
  public fun subscribers(): Any

  /**
   * A builder for [CfnBudgetsActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    public fun actionThreshold(actionThreshold: IResolvable)

    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    public fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty)

    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ce6dcb10f2139db638cd1119b7c775d7488b0272c7802583b44c99b4ea3d2f")
    public
        fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty.Builder.() -> Unit)

    /**
     * @param actionType The type of action. 
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     */
    public fun actionType(actionType: String)

    /**
     * @param approvalModel This specifies if the action needs manual or automatic approval.
     */
    public fun approvalModel(approvalModel: String)

    /**
     * @param budgetName A string that represents the budget name. 
     * ":" and "" characters aren't allowed.
     */
    public fun budgetName(budgetName: String)

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    public fun definition(definition: CfnBudgetsAction.DefinitionProperty)

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bce6f6637b65663c1a15125ecb060e91b067faf805a392f648257b11c7aaefa5")
    public fun definition(definition: CfnBudgetsAction.DefinitionProperty.Builder.() -> Unit)

    /**
     * @param executionRoleArn The role passed for action execution and reversion. 
     * Roles and actions must be in the same account.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param notificationType The type of a notification. 
     */
    public fun notificationType(notificationType: String)

    /**
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(subscribers: IResolvable)

    /**
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(subscribers: List<Any>)

    /**
     * @param subscribers A list of subscribers. 
     */
    public fun subscribers(vararg subscribers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetsActionProps.builder()

    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    override fun actionThreshold(actionThreshold: IResolvable) {
      cdkBuilder.actionThreshold(actionThreshold.let(IResolvable::unwrap))
    }

    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    override fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty) {
      cdkBuilder.actionThreshold(actionThreshold.let(CfnBudgetsAction.ActionThresholdProperty::unwrap))
    }

    /**
     * @param actionThreshold The trigger threshold of the action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ce6dcb10f2139db638cd1119b7c775d7488b0272c7802583b44c99b4ea3d2f")
    override
        fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty.Builder.() -> Unit):
        Unit = actionThreshold(CfnBudgetsAction.ActionThresholdProperty(actionThreshold))

    /**
     * @param actionType The type of action. 
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     */
    override fun actionType(actionType: String) {
      cdkBuilder.actionType(actionType)
    }

    /**
     * @param approvalModel This specifies if the action needs manual or automatic approval.
     */
    override fun approvalModel(approvalModel: String) {
      cdkBuilder.approvalModel(approvalModel)
    }

    /**
     * @param budgetName A string that represents the budget name. 
     * ":" and "" characters aren't allowed.
     */
    override fun budgetName(budgetName: String) {
      cdkBuilder.budgetName(budgetName)
    }

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    override fun definition(definition: CfnBudgetsAction.DefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnBudgetsAction.DefinitionProperty::unwrap))
    }

    /**
     * @param definition Specifies all of the type-specific parameters. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bce6f6637b65663c1a15125ecb060e91b067faf805a392f648257b11c7aaefa5")
    override fun definition(definition: CfnBudgetsAction.DefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnBudgetsAction.DefinitionProperty(definition))

    /**
     * @param executionRoleArn The role passed for action execution and reversion. 
     * Roles and actions must be in the same account.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param notificationType The type of a notification. 
     */
    override fun notificationType(notificationType: String) {
      cdkBuilder.notificationType(notificationType)
    }

    /**
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(subscribers: IResolvable) {
      cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
    }

    /**
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(subscribers: List<Any>) {
      cdkBuilder.subscribers(subscribers)
    }

    /**
     * @param subscribers A list of subscribers. 
     */
    override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudgetsActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps,
  ) : CdkObject(cdkObject), CfnBudgetsActionProps {
    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     */
    override fun actionThreshold(): Any = unwrap(this).getActionThreshold()

    /**
     * The type of action.
     *
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actiontype)
     */
    override fun actionType(): String = unwrap(this).getActionType()

    /**
     * This specifies if the action needs manual or automatic approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-approvalmodel)
     */
    override fun approvalModel(): String? = unwrap(this).getApprovalModel()

    /**
     * A string that represents the budget name.
     *
     * ":" and "" characters aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-budgetname)
     */
    override fun budgetName(): String = unwrap(this).getBudgetName()

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * The role passed for action execution and reversion.
     *
     * Roles and actions must be in the same account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-executionrolearn)
     */
    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    /**
     * The type of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-notificationtype)
     */
    override fun notificationType(): String = unwrap(this).getNotificationType()

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     */
    override fun subscribers(): Any = unwrap(this).getSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBudgetsActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetsActionProps):
        CfnBudgetsActionProps = CdkObjectWrappers.wrap(cdkObject) as CfnBudgetsActionProps

    internal fun unwrap(wrapped: CfnBudgetsActionProps):
        software.amazon.awscdk.services.budgets.CfnBudgetsActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
  }
}
