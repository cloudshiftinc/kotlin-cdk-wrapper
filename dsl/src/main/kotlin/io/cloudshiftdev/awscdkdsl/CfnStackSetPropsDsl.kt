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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnStackSetProps
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable

/**
 * Properties for defining a `CfnStackSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object managedExecution;
 * CfnStackSetProps cfnStackSetProps = CfnStackSetProps.builder()
 * .permissionModel("permissionModel")
 * .stackSetName("stackSetName")
 * // the properties below are optional
 * .administrationRoleArn("administrationRoleArn")
 * .autoDeployment(AutoDeploymentProperty.builder()
 * .enabled(false)
 * .retainStacksOnAccountRemoval(false)
 * .build())
 * .callAs("callAs")
 * .capabilities(List.of("capabilities"))
 * .description("description")
 * .executionRoleName("executionRoleName")
 * .managedExecution(managedExecution)
 * .operationPreferences(OperationPreferencesProperty.builder()
 * .failureToleranceCount(123)
 * .failureTolerancePercentage(123)
 * .maxConcurrentCount(123)
 * .maxConcurrentPercentage(123)
 * .regionConcurrencyType("regionConcurrencyType")
 * .regionOrder(List.of("regionOrder"))
 * .build())
 * .parameters(List.of(ParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
 * .deploymentTargets(DeploymentTargetsProperty.builder()
 * .accountFilterType("accountFilterType")
 * .accounts(List.of("accounts"))
 * .organizationalUnitIds(List.of("organizationalUnitIds"))
 * .build())
 * .regions(List.of("regions"))
 * // the properties below are optional
 * .parameterOverrides(List.of(ParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateBody("templateBody")
 * .templateUrl("templateUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
 */
@CdkDslMarker
public class CfnStackSetPropsDsl {
    private val cdkBuilder: CfnStackSetProps.Builder = CfnStackSetProps.builder()

    private val _capabilities: MutableList<String> = mutableListOf()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _stackInstancesGroup: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     *   create this stack set. Specify an IAM role only if you are using customized administrator
     *   roles to control which users or groups can manage specific stack sets within the same
     *   administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific stack
     * sets within the same administrator account. For more information, see
     * [Prerequisites: Granting Permissions for Stack Set Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * *Minimum* : `20`
     *
     * *Maximum* : `2048`
     */
    public fun administrationRoleArn(administrationRoleArn: String) {
        cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     *   automatically deploys to AWS Organizations accounts that are added to a target organization
     *   or organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     *   automatically deploys to AWS Organizations accounts that are added to a target organization
     *   or organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: IResolvable) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    /**
     * @param callAs [Service-managed permissions] Specifies whether you are acting as an account
     *   administrator in the organization's management account or as a delegated administrator in a
     *   member account. By default, `SELF` is specified. Use `SELF` for stack sets with
     *   self-managed permissions.
     * * To create a stack set with service-managed permissions while signed in to the management
     *   account, specify `SELF` .
     * * To create a stack set with service-managed permissions while signed in to a delegated
     *   administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see
     * [Register a delegated administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Stack sets with service-managed permissions are created in the management account, including
     * stack sets that are created by delegated administrators.
     *
     * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
     */
    public fun callAs(callAs: String) {
        cdkBuilder.callAs(callAs)
    }

    /**
     * @param capabilities The capabilities that are allowed in the stack set. Some stack set
     *   templates might include resources that can affect permissions in your AWS account —for
     *   example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     *   information, see
     *   [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     *   .
     */
    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    /**
     * @param capabilities The capabilities that are allowed in the stack set. Some stack set
     *   templates might include resources that can affect permissions in your AWS account —for
     *   example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     *   information, see
     *   [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     *   .
     */
    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    /**
     * @param description A description of the stack set. *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param executionRoleName The name of the IAM execution role to use to create the stack set.
     *   If you don't specify an execution role, AWS CloudFormation uses the
     *   `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     */
    public fun executionRoleName(executionRoleName: String) {
        cdkBuilder.executionRoleName(executionRoleName)
    }

    /**
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     *   concurrently and queues conflicting operations. When active, StackSets performs
     *   non-conflicting operations concurrently and queues conflicting operations. After
     *   conflicting operations finish, StackSets starts queued operations in request order.
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     */
    public fun managedExecution(managedExecution: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(managedExecution)
        cdkBuilder.managedExecution(builder.map)
    }

    /**
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     *   concurrently and queues conflicting operations. When active, StackSets performs
     *   non-conflicting operations concurrently and queues conflicting operations. After
     *   conflicting operations finish, StackSets starts queued operations in request order.
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     */
    public fun managedExecution(managedExecution: Any) {
        cdkBuilder.managedExecution(managedExecution)
    }

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     *   performs a stack set operation.
     */
    public fun operationPreferences(
        operationPreferences: CfnStackSet.OperationPreferencesProperty
    ) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     *   performs a stack set operation.
     */
    public fun operationPreferences(operationPreferences: IResolvable) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    /** @param parameters The input parameters for the stack set template. */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /** @param parameters The input parameters for the stack set template. */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /** @param parameters The input parameters for the stack set template. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param permissionModel Describes how the IAM roles required for stack set operations are
     *   created.
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     *   required to deploy to target accounts. For more information, see
     *   [Grant Self-Managed Stack Set Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     *   .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     *   to deploy to accounts managed by AWS Organizations .
     */
    public fun permissionModel(permissionModel: String) {
        cdkBuilder.permissionModel(permissionModel)
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(vararg stackInstancesGroup: Any) {
        _stackInstancesGroup.addAll(listOf(*stackInstancesGroup))
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: Collection<Any>) {
        _stackInstancesGroup.addAll(stackInstancesGroup)
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
        cdkBuilder.stackInstancesGroup(stackInstancesGroup)
    }

    /**
     * @param stackSetName The name to associate with the stack set. The name must be unique in the
     *   Region where you create your stack set.
     *
     * *Maximum* : `128`
     *
     * *Pattern* : `^[a-zA-Z][a-zA-Z0-9-]{0,127}$`
     *
     * The `StackSetName` property is required.
     */
    public fun stackSetName(stackSetName: String) {
        cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * @param tags The key-value pairs to associate with this stack set and the stacks created from
     *   it. AWS CloudFormation also propagates these tags to supported resources that are created
     *   in the stacks. A maximum number of 50 tags can be specified.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The key-value pairs to associate with this stack set and the stacks created from
     *   it. AWS CloudFormation also propagates these tags to supported resources that are created
     *   in the stacks. A maximum number of 50 tags can be specified.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     *   byte and a maximum length of 51,200 bytes. You must include either `TemplateURL` or
     *   `TemplateBody` in a StackSet, but you can't use both. Dynamic references in the
     *   `TemplateBody` may not work correctly in all cases. It's recommended to pass templates
     *   containing dynamic references through `TemplateUrl` instead.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `51200`
     */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateUrl Location of file containing the template body. The URL must point to a
     *   template (max size: 460,800 bytes) that's located in an Amazon S3 bucket.
     *
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    public fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): CfnStackSetProps {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_stackInstancesGroup.isNotEmpty()) cdkBuilder.stackInstancesGroup(_stackInstancesGroup)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
