@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnStackSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
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
 * .accountsUrl("accountsUrl")
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
public interface CfnStackSetProps {
  /**
   * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set.
   *
   * Specify an IAM role only if you are using customized administrator roles to control which users
   * or groups can manage specific stack sets within the same administrator account.
   *
   * Use customized administrator roles to control which users or groups can manage specific stack
   * sets within the same administrator account. For more information, see [Prerequisites: Granting
   * Permissions for Stack Set
   * Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * *Minimum* : `20`
   *
   * *Maximum* : `2048`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-administrationrolearn)
   */
  public fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

  /**
   * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
   * Organizations accounts that are added to a target organization or organizational unit (OU).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
   */
  public fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

  /**
   * [Service-managed permissions] Specifies whether you are acting as an account administrator in
   * the organization's management account or as a delegated administrator in a member account.
   *
   * By default, `SELF` is specified. Use `SELF` for stack sets with self-managed permissions.
   *
   * * To create a stack set with service-managed permissions while signed in to the management
   * account, specify `SELF` .
   * * To create a stack set with service-managed permissions while signed in to a delegated
   * administrator account, specify `DELEGATED_ADMIN` .
   *
   * Your AWS account must be registered as a delegated admin in the management account. For more
   * information, see [Register a delegated
   * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * Stack sets with service-managed permissions are created in the management account, including
   * stack sets that are created by delegated administrators.
   *
   * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-callas)
   */
  public fun callAs(): String? = unwrap(this).getCallAs()

  /**
   * The capabilities that are allowed in the stack set.
   *
   * Some stack set templates might include resources that can affect permissions in your AWS
   * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
   * information, see [Acknowledging IAM Resources in AWS CloudFormation
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
   */
  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  /**
   * A description of the stack set.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `1024`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the IAM execution role to use to create the stack set.
   *
   * If you don't specify an execution role, AWS CloudFormation uses the
   * `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `64`
   *
   * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-executionrolename)
   */
  public fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  /**
   * Describes whether StackSets performs non-conflicting operations concurrently and queues
   * conflicting operations.
   *
   * When active, StackSets performs non-conflicting operations concurrently and queues conflicting
   * operations. After conflicting operations finish, StackSets starts queued operations in request
   * order.
   *
   *
   * If there are already running or queued operations, StackSets queues all incoming operations
   * even if they are non-conflicting.
   *
   * You can't modify your stack set's execution configuration while there are running or queued
   * operations for that stack set.
   *
   *
   * When inactive (default), StackSets performs one operation at a time in request order.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
   */
  public fun managedExecution(): Any? = unwrap(this).getManagedExecution()

  /**
   * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
   */
  public fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

  /**
   * The input parameters for the stack set template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Describes how the IAM roles required for stack set operations are created.
   *
   * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
   * required to deploy to target accounts. For more information, see [Grant Self-Managed Stack Set
   * Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
   * .
   * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required to
   * deploy to accounts managed by AWS Organizations .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-permissionmodel)
   */
  public fun permissionModel(): String

  /**
   * A group of stack instances with parameters in some specific accounts and Regions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
   */
  public fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

  /**
   * The name to associate with the stack set.
   *
   * The name must be unique in the Region where you create your stack set.
   *
   *
   * The `StackSetName` property is required.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stacksetname)
   */
  public fun stackSetName(): String

  /**
   * Key-value pairs to associate with this stack.
   *
   * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
   * specify a maximum number of 50 tags.
   *
   * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you
   * specify an empty value, AWS CloudFormation removes all associated tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The structure that contains the template body, with a minimum length of 1 byte and a maximum
   * length of 51,200 bytes.
   *
   * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use both.
   * Dynamic references in the `TemplateBody` may not work correctly in all cases. It's recommended to
   * pass templates containing dynamic references through `TemplateUrl` instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templatebody)
   */
  public fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * Location of file containing the template body.
   *
   * The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager
   * document. For more information, go to [Template
   * Anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) in
   * the AWS CloudFormation User Guide.
   *
   * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
   * `TemplateURL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templateurl)
   */
  public fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  /**
   * A builder for [CfnStackSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     * create this stack set.
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific stack sets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific stack
     * sets within the same administrator account. For more information, see [Prerequisites: Granting
     * Permissions for Stack Set
     * Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * *Minimum* : `20`
     *
     * *Maximum* : `2048`
     */
    public fun administrationRoleArn(administrationRoleArn: String)

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: IResolvable)

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty)

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94884309d1b95db1bcfea54028062296757ebac54e91c6a69cc0fd1950c04158")
    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit)

    /**
     * @param callAs [Service-managed permissions] Specifies whether you are acting as an account
     * administrator in the organization's management account or as a delegated administrator in a
     * member account.
     * By default, `SELF` is specified. Use `SELF` for stack sets with self-managed permissions.
     *
     * * To create a stack set with service-managed permissions while signed in to the management
     * account, specify `SELF` .
     * * To create a stack set with service-managed permissions while signed in to a delegated
     * administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see [Register a delegated
     * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Stack sets with service-managed permissions are created in the management account, including
     * stack sets that are created by delegated administrators.
     *
     * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
     */
    public fun callAs(callAs: String)

    /**
     * @param capabilities The capabilities that are allowed in the stack set.
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     * information, see [Acknowledging IAM Resources in AWS CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * @param capabilities The capabilities that are allowed in the stack set.
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     * information, see [Acknowledging IAM Resources in AWS CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * @param description A description of the stack set.
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    public fun description(description: String)

    /**
     * @param executionRoleName The name of the IAM execution role to use to create the stack set.
     * If you don't specify an execution role, AWS CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     */
    public fun executionRoleName(executionRoleName: String)

    /**
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     * concurrently and queues conflicting operations.
     * When active, StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations. After conflicting operations finish, StackSets starts queued operations
     * in request order.
     *
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     */
    public fun managedExecution(managedExecution: Any)

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    public fun operationPreferences(operationPreferences: IResolvable)

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    public fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty)

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50c6449649f81761af9c959da02e5f49ff8548a4841ad994b5353b1858093d07")
    public
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty.Builder.() -> Unit)

    /**
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(parameters: List<Any>)

    /**
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(vararg parameters: Any)

    /**
     * @param permissionModel Describes how the IAM roles required for stack set operations are
     * created. 
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     * required to deploy to target accounts. For more information, see [Grant Self-Managed Stack Set
     * Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     * to deploy to accounts managed by AWS Organizations .
     */
    public fun permissionModel(permissionModel: String)

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: IResolvable)

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: List<Any>)

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    public fun stackInstancesGroup(vararg stackInstancesGroup: Any)

    /**
     * @param stackSetName The name to associate with the stack set. 
     * The name must be unique in the Region where you create your stack set.
     *
     *
     * The `StackSetName` property is required.
     */
    public fun stackSetName(stackSetName: String)

    /**
     * @param tags Key-value pairs to associate with this stack.
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs to associate with this stack.
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes.
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates containing dynamic references through `TemplateUrl` instead.
     */
    public fun templateBody(templateBody: String)

    /**
     * @param templateUrl Location of file containing the template body.
     * The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager
     * document. For more information, go to [Template
     * Anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
     * in the AWS CloudFormation User Guide.
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     */
    public fun templateUrl(templateUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnStackSetProps.Builder
        = software.amazon.awscdk.services.cloudformation.CfnStackSetProps.builder()

    /**
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     * create this stack set.
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific stack sets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific stack
     * sets within the same administrator account. For more information, see [Prerequisites: Granting
     * Permissions for Stack Set
     * Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * *Minimum* : `20`
     *
     * *Maximum* : `2048`
     */
    override fun administrationRoleArn(administrationRoleArn: String) {
      cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    override fun autoDeployment(autoDeployment: IResolvable) {
      cdkBuilder.autoDeployment(autoDeployment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    override fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty) {
      cdkBuilder.autoDeployment(autoDeployment.let(CfnStackSet.AutoDeploymentProperty.Companion::unwrap))
    }

    /**
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94884309d1b95db1bcfea54028062296757ebac54e91c6a69cc0fd1950c04158")
    override
        fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit):
        Unit = autoDeployment(CfnStackSet.AutoDeploymentProperty(autoDeployment))

    /**
     * @param callAs [Service-managed permissions] Specifies whether you are acting as an account
     * administrator in the organization's management account or as a delegated administrator in a
     * member account.
     * By default, `SELF` is specified. Use `SELF` for stack sets with self-managed permissions.
     *
     * * To create a stack set with service-managed permissions while signed in to the management
     * account, specify `SELF` .
     * * To create a stack set with service-managed permissions while signed in to a delegated
     * administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see [Register a delegated
     * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Stack sets with service-managed permissions are created in the management account, including
     * stack sets that are created by delegated administrators.
     *
     * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
     */
    override fun callAs(callAs: String) {
      cdkBuilder.callAs(callAs)
    }

    /**
     * @param capabilities The capabilities that are allowed in the stack set.
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     * information, see [Acknowledging IAM Resources in AWS CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * @param capabilities The capabilities that are allowed in the stack set.
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     * information, see [Acknowledging IAM Resources in AWS CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * @param description A description of the stack set.
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionRoleName The name of the IAM execution role to use to create the stack set.
     * If you don't specify an execution role, AWS CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     */
    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    /**
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     * concurrently and queues conflicting operations.
     * When active, StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations. After conflicting operations finish, StackSets starts queued operations
     * in request order.
     *
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     */
    override fun managedExecution(managedExecution: Any) {
      cdkBuilder.managedExecution(managedExecution)
    }

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    override fun operationPreferences(operationPreferences: IResolvable) {
      cdkBuilder.operationPreferences(operationPreferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    override
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty) {
      cdkBuilder.operationPreferences(operationPreferences.let(CfnStackSet.OperationPreferencesProperty.Companion::unwrap))
    }

    /**
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     * performs a stack set operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50c6449649f81761af9c959da02e5f49ff8548a4841ad994b5353b1858093d07")
    override
        fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty.Builder.() -> Unit):
        Unit = operationPreferences(CfnStackSet.OperationPreferencesProperty(operationPreferences))

    /**
     * @param parameters The input parameters for the stack set template.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters The input parameters for the stack set template.
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameters The input parameters for the stack set template.
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * @param permissionModel Describes how the IAM roles required for stack set operations are
     * created. 
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     * required to deploy to target accounts. For more information, see [Grant Self-Managed Stack Set
     * Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     * to deploy to accounts managed by AWS Organizations .
     */
    override fun permissionModel(permissionModel: String) {
      cdkBuilder.permissionModel(permissionModel)
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    override fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    override fun stackInstancesGroup(stackInstancesGroup: List<Any>) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions.
     */
    override fun stackInstancesGroup(vararg stackInstancesGroup: Any): Unit =
        stackInstancesGroup(stackInstancesGroup.toList())

    /**
     * @param stackSetName The name to associate with the stack set. 
     * The name must be unique in the Region where you create your stack set.
     *
     *
     * The `StackSetName` property is required.
     */
    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * @param tags Key-value pairs to associate with this stack.
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Key-value pairs to associate with this stack.
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes.
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates containing dynamic references through `TemplateUrl` instead.
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateUrl Location of file containing the template body.
     * The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager
     * document. For more information, go to [Template
     * Anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
     * in the AWS CloudFormation User Guide.
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     */
    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnStackSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSetProps,
  ) : CdkObject(cdkObject), CfnStackSetProps {
    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set.
     *
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific stack sets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific stack
     * sets within the same administrator account. For more information, see [Prerequisites: Granting
     * Permissions for Stack Set
     * Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * *Minimum* : `20`
     *
     * *Maximum* : `2048`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-administrationrolearn)
     */
    override fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

    /**
     * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or organizational unit (OU).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     */
    override fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

    /**
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in
     * the organization's management account or as a delegated administrator in a member account.
     *
     * By default, `SELF` is specified. Use `SELF` for stack sets with self-managed permissions.
     *
     * * To create a stack set with service-managed permissions while signed in to the management
     * account, specify `SELF` .
     * * To create a stack set with service-managed permissions while signed in to a delegated
     * administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see [Register a delegated
     * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Stack sets with service-managed permissions are created in the management account, including
     * stack sets that are created by delegated administrators.
     *
     * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-callas)
     */
    override fun callAs(): String? = unwrap(this).getCallAs()

    /**
     * The capabilities that are allowed in the stack set.
     *
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For more
     * information, see [Acknowledging IAM Resources in AWS CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     */
    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    /**
     * A description of the stack set.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the IAM execution role to use to create the stack set.
     *
     * If you don't specify an execution role, AWS CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-executionrolename)
     */
    override fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations.
     *
     * When active, StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations. After conflicting operations finish, StackSets starts queued operations
     * in request order.
     *
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
     */
    override fun managedExecution(): Any? = unwrap(this).getManagedExecution()

    /**
     * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     */
    override fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

    /**
     * The input parameters for the stack set template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Describes how the IAM roles required for stack set operations are created.
     *
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     * required to deploy to target accounts. For more information, see [Grant Self-Managed Stack Set
     * Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     * to deploy to accounts managed by AWS Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-permissionmodel)
     */
    override fun permissionModel(): String = unwrap(this).getPermissionModel()

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     */
    override fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

    /**
     * The name to associate with the stack set.
     *
     * The name must be unique in the Region where you create your stack set.
     *
     *
     * The `StackSetName` property is required.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stacksetname)
     */
    override fun stackSetName(): String = unwrap(this).getStackSetName()

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum
     * length of 51,200 bytes.
     *
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates containing dynamic references through `TemplateUrl` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templatebody)
     */
    override fun templateBody(): String? = unwrap(this).getTemplateBody()

    /**
     * Location of file containing the template body.
     *
     * The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager
     * document. For more information, go to [Template
     * Anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
     * in the AWS CloudFormation User Guide.
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templateurl)
     */
    override fun templateUrl(): String? = unwrap(this).getTemplateUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStackSetProps):
        CfnStackSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStackSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackSetProps):
        software.amazon.awscdk.services.cloudformation.CfnStackSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnStackSetProps
  }
}
