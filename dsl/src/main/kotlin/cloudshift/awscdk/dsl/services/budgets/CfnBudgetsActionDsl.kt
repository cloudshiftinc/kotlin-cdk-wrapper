@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.constructs.Construct

/**
 * The `AWS::Budgets::BudgetsAction` resource enables you to take predefined actions that are
 * initiated when a budget threshold has been exceeded.
 *
 * For more information, see
 * [Managing Your Costs with Budgets](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html)
 * in the *AWS Billing and Cost Management User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * CfnBudgetsAction cfnBudgetsAction = CfnBudgetsAction.Builder.create(this, "MyCfnBudgetsAction")
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
@CdkDslMarker
public class CfnBudgetsActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBudgetsAction.Builder = CfnBudgetsAction.Builder.create(scope, id)

    private val _subscribers: MutableList<Any> = mutableListOf()

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     *
     * @param actionThreshold The trigger threshold of the action.
     */
    public fun actionThreshold(actionThreshold: IResolvable) {
        cdkBuilder.actionThreshold(actionThreshold)
    }

    /**
     * The trigger threshold of the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actionthreshold)
     *
     * @param actionThreshold The trigger threshold of the action.
     */
    public fun actionThreshold(actionThreshold: CfnBudgetsAction.ActionThresholdProperty) {
        cdkBuilder.actionThreshold(actionThreshold)
    }

    /**
     * The type of action.
     *
     * This defines the type of tasks that can be carried out by this action. This field also
     * determines the format for definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-actiontype)
     *
     * @param actionType The type of action.
     */
    public fun actionType(actionType: String) {
        cdkBuilder.actionType(actionType)
    }

    /**
     * This specifies if the action needs manual or automatic approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-approvalmodel)
     *
     * @param approvalModel This specifies if the action needs manual or automatic approval.
     */
    public fun approvalModel(approvalModel: String) {
        cdkBuilder.approvalModel(approvalModel)
    }

    /**
     * A string that represents the budget name.
     *
     * ":" and "" characters aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-budgetname)
     *
     * @param budgetName A string that represents the budget name.
     */
    public fun budgetName(budgetName: String) {
        cdkBuilder.budgetName(budgetName)
    }

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     *
     * @param definition Specifies all of the type-specific parameters.
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * Specifies all of the type-specific parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-definition)
     *
     * @param definition Specifies all of the type-specific parameters.
     */
    public fun definition(definition: CfnBudgetsAction.DefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /**
     * The role passed for action execution and reversion.
     *
     * Roles and actions must be in the same account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-executionrolearn)
     *
     * @param executionRoleArn The role passed for action execution and reversion.
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The type of a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-notificationtype)
     *
     * @param notificationType The type of a notification.
     */
    public fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     *
     * @param subscribers A list of subscribers.
     */
    public fun subscribers(vararg subscribers: Any) {
        _subscribers.addAll(listOf(*subscribers))
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     *
     * @param subscribers A list of subscribers.
     */
    public fun subscribers(subscribers: Collection<Any>) {
        _subscribers.addAll(subscribers)
    }

    /**
     * A list of subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html#cfn-budgets-budgetsaction-subscribers)
     *
     * @param subscribers A list of subscribers.
     */
    public fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers)
    }

    public fun build(): CfnBudgetsAction {
        if (_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
        return cdkBuilder.build()
    }
}
