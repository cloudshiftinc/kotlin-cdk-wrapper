@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::StackSet` resource contains information about a StackSet.
 *
 * With StackSets, you can provision stacks across AWS accounts and Regions from a single
 * CloudFormation template. Each stack is based on the same CloudFormation template, but you can
 * customize individual stacks using parameters.
 *
 *
 * Run deployments to nested StackSets from the parent stack, not directly through the StackSet API.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object managedExecution;
 * CfnStackSet cfnStackSet = CfnStackSet.Builder.create(this, "MyCfnStackSet")
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
 * .concurrencyMode("concurrencyMode")
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
public open class CfnStackSet(
  cdkObject: software.amazon.awscdk.CfnStackSet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackSetProps,
  ) :
      this(software.amazon.awscdk.CfnStackSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStackSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStackSetProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) of the IAM role to use to create this StackSet.
   */
  public open fun administrationRoleArn(): String? = unwrap(this).getAdministrationRoleArn()

  /**
   * The Amazon Resource Number (ARN) of the IAM role to use to create this StackSet.
   */
  public open fun administrationRoleArn(`value`: String) {
    unwrap(this).setAdministrationRoleArn(`value`)
  }

  /**
   * Returns the unique identifier of the resource.
   */
  public open fun attrStackSetId(): String = unwrap(this).getAttrStackSetId()

  /**
   * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added
   * to a target organization or organizational unit (OU).
   */
  public open fun autoDeployment(): Any? = unwrap(this).getAutoDeployment()

  /**
   * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added
   * to a target organization or organizational unit (OU).
   */
  public open fun autoDeployment(`value`: IResolvable) {
    unwrap(this).setAutoDeployment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added
   * to a target organization or organizational unit (OU).
   */
  public open fun autoDeployment(`value`: AutoDeploymentProperty) {
    unwrap(this).setAutoDeployment(`value`.let(AutoDeploymentProperty.Companion::unwrap))
  }

  /**
   * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added
   * to a target organization or organizational unit (OU).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("541122c7707427c2c85e795a7eef12b7f230dc5310f83e8c1b12b4feeee16be7")
  public open fun autoDeployment(`value`: AutoDeploymentProperty.Builder.() -> Unit): Unit =
      autoDeployment(AutoDeploymentProperty(`value`))

  /**
   * Specifies whether you are acting as an account administrator in the organization's management
   * account or as a delegated administrator in a member account.
   */
  public open fun callAs(): String? = unwrap(this).getCallAs()

  /**
   * Specifies whether you are acting as an account administrator in the organization's management
   * account or as a delegated administrator in a member account.
   */
  public open fun callAs(`value`: String) {
    unwrap(this).setCallAs(`value`)
  }

  /**
   * The capabilities that are allowed in the StackSet.
   */
  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  /**
   * The capabilities that are allowed in the StackSet.
   */
  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  /**
   * The capabilities that are allowed in the StackSet.
   */
  public open fun capabilities(vararg `value`: String): Unit = capabilities(`value`.toList())

  /**
   * A description of the StackSet.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the StackSet.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the IAM execution role to use to create the StackSet.
   */
  public open fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  /**
   * The name of the IAM execution role to use to create the StackSet.
   */
  public open fun executionRoleName(`value`: String) {
    unwrap(this).setExecutionRoleName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Describes whether StackSets performs non-conflicting operations concurrently and queues
   * conflicting operations.
   */
  public open fun managedExecution(): Any? = unwrap(this).getManagedExecution()

  /**
   * Describes whether StackSets performs non-conflicting operations concurrently and queues
   * conflicting operations.
   */
  public open fun managedExecution(`value`: Any) {
    unwrap(this).setManagedExecution(`value`)
  }

  /**
   * The user-specified preferences for how CloudFormation performs a StackSet operation.
   */
  public open fun operationPreferences(): Any? = unwrap(this).getOperationPreferences()

  /**
   * The user-specified preferences for how CloudFormation performs a StackSet operation.
   */
  public open fun operationPreferences(`value`: IResolvable) {
    unwrap(this).setOperationPreferences(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The user-specified preferences for how CloudFormation performs a StackSet operation.
   */
  public open fun operationPreferences(`value`: OperationPreferencesProperty) {
    unwrap(this).setOperationPreferences(`value`.let(OperationPreferencesProperty.Companion::unwrap))
  }

  /**
   * The user-specified preferences for how CloudFormation performs a StackSet operation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("286fcc6600897ac9954d756a260b4e84f2e4bc1178aa2780076c37d422d6e6c1")
  public open fun operationPreferences(`value`: OperationPreferencesProperty.Builder.() -> Unit):
      Unit = operationPreferences(OperationPreferencesProperty(`value`))

  /**
   * The input parameters for the StackSet template.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The input parameters for the StackSet template.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The input parameters for the StackSet template.
   */
  public open fun parameters(`value`: List<Any>) {
    unwrap(this).setParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The input parameters for the StackSet template.
   */
  public open fun parameters(vararg `value`: Any): Unit = parameters(`value`.toList())

  /**
   * Describes how the IAM roles required for StackSet operations are created.
   */
  public open fun permissionModel(): String = unwrap(this).getPermissionModel()

  /**
   * Describes how the IAM roles required for StackSet operations are created.
   */
  public open fun permissionModel(`value`: String) {
    unwrap(this).setPermissionModel(`value`)
  }

  /**
   * A group of stack instances with parameters in some specific accounts and Regions.
   */
  public open fun stackInstancesGroup(): Any? = unwrap(this).getStackInstancesGroup()

  /**
   * A group of stack instances with parameters in some specific accounts and Regions.
   */
  public open fun stackInstancesGroup(`value`: IResolvable) {
    unwrap(this).setStackInstancesGroup(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A group of stack instances with parameters in some specific accounts and Regions.
   */
  public open fun stackInstancesGroup(`value`: List<Any>) {
    unwrap(this).setStackInstancesGroup(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A group of stack instances with parameters in some specific accounts and Regions.
   */
  public open fun stackInstancesGroup(vararg `value`: Any): Unit =
      stackInstancesGroup(`value`.toList())

  /**
   * The name to associate with the StackSet.
   */
  public open fun stackSetName(): String = unwrap(this).getStackSetName()

  /**
   * The name to associate with the StackSet.
   */
  public open fun stackSetName(`value`: String) {
    unwrap(this).setStackSetName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The structure that contains the template body, with a minimum length of 1 byte and a maximum
   * length of 51,200 bytes.
   */
  public open fun templateBody(): String? = unwrap(this).getTemplateBody()

  /**
   * The structure that contains the template body, with a minimum length of 1 byte and a maximum
   * length of 51,200 bytes.
   */
  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  /**
   * The URL of a file that contains the template body.
   */
  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  /**
   * The URL of a file that contains the template body.
   */
  public open fun templateUrl(`value`: String) {
    unwrap(this).setTemplateUrl(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnStackSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this StackSet.
     *
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific StackSets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific
     * StackSets within the same administrator account. For more information, see [Grant self-managed
     * permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Valid only if the permissions model is `SELF_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-administrationrolearn)
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     * create this StackSet. 
     */
    public fun administrationRoleArn(administrationRoleArn: String)

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    public fun autoDeployment(autoDeployment: IResolvable)

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    public fun autoDeployment(autoDeployment: AutoDeploymentProperty)

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5868005ed7fa39620e55579b88bf6442571eecf32cf05b9a009b69fe9f7b6728")
    public fun autoDeployment(autoDeployment: AutoDeploymentProperty.Builder.() -> Unit)

    /**
     * Specifies whether you are acting as an account administrator in the organization's management
     * account or as a delegated administrator in a member account.
     *
     * By default, `SELF` is specified. Use `SELF` for StackSets with self-managed permissions.
     *
     * * To create a StackSet with service-managed permissions while signed in to the management
     * account, specify `SELF` .
     * * To create a StackSet with service-managed permissions while signed in to a delegated
     * administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see [Register a delegated
     * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * StackSets with service-managed permissions are created in the management account, including
     * StackSets that are created by delegated administrators.
     *
     * Valid only if the permissions model is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-callas)
     * @param callAs Specifies whether you are acting as an account administrator in the
     * organization's management account or as a delegated administrator in a member account. 
     */
    public fun callAs(callAs: String)

    /**
     * The capabilities that are allowed in the StackSet.
     *
     * Some StackSet templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new IAM users. For more information, see [Acknowledging IAM
     * resources in CloudFormation
     * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/control-access-with-iam.html#using-iam-capabilities)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     * @param capabilities The capabilities that are allowed in the StackSet. 
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * The capabilities that are allowed in the StackSet.
     *
     * Some StackSet templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new IAM users. For more information, see [Acknowledging IAM
     * resources in CloudFormation
     * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/control-access-with-iam.html#using-iam-capabilities)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     * @param capabilities The capabilities that are allowed in the StackSet. 
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * A description of the StackSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-description)
     * @param description A description of the StackSet. 
     */
    public fun description(description: String)

    /**
     * The name of the IAM execution role to use to create the StackSet.
     *
     * If you don't specify an execution role, CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the StackSet operation.
     *
     * Valid only if the permissions model is `SELF_MANAGED` .
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-executionrolename)
     * @param executionRoleName The name of the IAM execution role to use to create the StackSet. 
     */
    public fun executionRoleName(executionRoleName: String)

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
     * You can't modify your StackSet's execution configuration while there are running or queued
     * operations for that StackSet.
     *
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     * concurrently and queues conflicting operations. 
     */
    public fun managedExecution(managedExecution: Any)

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    public fun operationPreferences(operationPreferences: IResolvable)

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    public fun operationPreferences(operationPreferences: OperationPreferencesProperty)

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c95c55213cdb45e9d6922da2043547a34eb7688d49dde0667edbf3d2d163135")
    public
        fun operationPreferences(operationPreferences: OperationPreferencesProperty.Builder.() -> Unit)

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    public fun parameters(parameters: List<Any>)

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    public fun parameters(vararg parameters: Any)

    /**
     * Describes how the IAM roles required for StackSet operations are created.
     *
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     * required to deploy to target accounts. For more information, see [Grant self-managed
     * permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * in the *AWS CloudFormation User Guide* .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     * to deploy to accounts managed by AWS Organizations . For more information, see [Activate trusted
     * access for StackSets with AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-activate-trusted-access.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-permissionmodel)
     * @param permissionModel Describes how the IAM roles required for StackSet operations are
     * created. 
     */
    public fun permissionModel(permissionModel: String)

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    public fun stackInstancesGroup(stackInstancesGroup: IResolvable)

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    public fun stackInstancesGroup(stackInstancesGroup: List<Any>)

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    public fun stackInstancesGroup(vararg stackInstancesGroup: Any)

    /**
     * The name to associate with the StackSet.
     *
     * The name must be unique in the Region where you create your StackSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stacksetname)
     * @param stackSetName The name to associate with the StackSet. 
     */
    public fun stackSetName(stackSetName: String)

    /**
     * Key-value pairs to associate with this stack.
     *
     * CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, CloudFormation doesn't modify the stack's tags. If you
     * specify an empty value, CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs to associate with this stack.
     *
     * CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, CloudFormation doesn't modify the stack's tags. If you
     * specify an empty value, CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum
     * length of 51,200 bytes.
     *
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates that contain dynamic references through `TemplateUrl` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templatebody)
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. 
     */
    public fun templateBody(templateBody: String)

    /**
     * The URL of a file that contains the template body.
     *
     * The URL must point to a template (max size: 1 MB) that's located in an Amazon S3 bucket or a
     * Systems Manager document. The location for an Amazon S3 bucket must start with `https://` .
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templateurl)
     * @param templateUrl The URL of a file that contains the template body. 
     */
    public fun templateUrl(templateUrl: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnStackSet.Builder =
        software.amazon.awscdk.CfnStackSet.Builder.create(scope, id)

    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this StackSet.
     *
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific StackSets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific
     * StackSets within the same administrator account. For more information, see [Grant self-managed
     * permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Valid only if the permissions model is `SELF_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-administrationrolearn)
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     * create this StackSet. 
     */
    override fun administrationRoleArn(administrationRoleArn: String) {
      cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    override fun autoDeployment(autoDeployment: IResolvable) {
      cdkBuilder.autoDeployment(autoDeployment.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    override fun autoDeployment(autoDeployment: AutoDeploymentProperty) {
      cdkBuilder.autoDeployment(autoDeployment.let(AutoDeploymentProperty.Companion::unwrap))
    }

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are
     * added to a target organization or organizational unit (OU).
     *
     * For more information, see [Enable or disable automatic deployments for StackSets in AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Required if the permissions model is `SERVICE_MANAGED` . (Not used with self-managed
     * permissions.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     * @param autoDeployment Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5868005ed7fa39620e55579b88bf6442571eecf32cf05b9a009b69fe9f7b6728")
    override fun autoDeployment(autoDeployment: AutoDeploymentProperty.Builder.() -> Unit): Unit =
        autoDeployment(AutoDeploymentProperty(autoDeployment))

    /**
     * Specifies whether you are acting as an account administrator in the organization's management
     * account or as a delegated administrator in a member account.
     *
     * By default, `SELF` is specified. Use `SELF` for StackSets with self-managed permissions.
     *
     * * To create a StackSet with service-managed permissions while signed in to the management
     * account, specify `SELF` .
     * * To create a StackSet with service-managed permissions while signed in to a delegated
     * administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see [Register a delegated
     * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * StackSets with service-managed permissions are created in the management account, including
     * StackSets that are created by delegated administrators.
     *
     * Valid only if the permissions model is `SERVICE_MANAGED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-callas)
     * @param callAs Specifies whether you are acting as an account administrator in the
     * organization's management account or as a delegated administrator in a member account. 
     */
    override fun callAs(callAs: String) {
      cdkBuilder.callAs(callAs)
    }

    /**
     * The capabilities that are allowed in the StackSet.
     *
     * Some StackSet templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new IAM users. For more information, see [Acknowledging IAM
     * resources in CloudFormation
     * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/control-access-with-iam.html#using-iam-capabilities)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     * @param capabilities The capabilities that are allowed in the StackSet. 
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * The capabilities that are allowed in the StackSet.
     *
     * Some StackSet templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new IAM users. For more information, see [Acknowledging IAM
     * resources in CloudFormation
     * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/control-access-with-iam.html#using-iam-capabilities)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     * @param capabilities The capabilities that are allowed in the StackSet. 
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * A description of the StackSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-description)
     * @param description A description of the StackSet. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the IAM execution role to use to create the StackSet.
     *
     * If you don't specify an execution role, CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the StackSet operation.
     *
     * Valid only if the permissions model is `SELF_MANAGED` .
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-executionrolename)
     * @param executionRoleName The name of the IAM execution role to use to create the StackSet. 
     */
    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

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
     * You can't modify your StackSet's execution configuration while there are running or queued
     * operations for that StackSet.
     *
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     * concurrently and queues conflicting operations. 
     */
    override fun managedExecution(managedExecution: Any) {
      cdkBuilder.managedExecution(managedExecution)
    }

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    override fun operationPreferences(operationPreferences: IResolvable) {
      cdkBuilder.operationPreferences(operationPreferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    override fun operationPreferences(operationPreferences: OperationPreferencesProperty) {
      cdkBuilder.operationPreferences(operationPreferences.let(OperationPreferencesProperty.Companion::unwrap))
    }

    /**
     * The user-specified preferences for how CloudFormation performs a StackSet operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     * @param operationPreferences The user-specified preferences for how CloudFormation performs a
     * StackSet operation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c95c55213cdb45e9d6922da2043547a34eb7688d49dde0667edbf3d2d163135")
    override
        fun operationPreferences(operationPreferences: OperationPreferencesProperty.Builder.() -> Unit):
        Unit = operationPreferences(OperationPreferencesProperty(operationPreferences))

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The input parameters for the StackSet template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     * @param parameters The input parameters for the StackSet template. 
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * Describes how the IAM roles required for StackSet operations are created.
     *
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     * required to deploy to target accounts. For more information, see [Grant self-managed
     * permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     * in the *AWS CloudFormation User Guide* .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     * to deploy to accounts managed by AWS Organizations . For more information, see [Activate trusted
     * access for StackSets with AWS
     * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-activate-trusted-access.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-permissionmodel)
     * @param permissionModel Describes how the IAM roles required for StackSet operations are
     * created. 
     */
    override fun permissionModel(permissionModel: String) {
      cdkBuilder.permissionModel(permissionModel)
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    override fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.let(IResolvable.Companion::unwrap))
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    override fun stackInstancesGroup(stackInstancesGroup: List<Any>) {
      cdkBuilder.stackInstancesGroup(stackInstancesGroup.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     * accounts and Regions. 
     */
    override fun stackInstancesGroup(vararg stackInstancesGroup: Any): Unit =
        stackInstancesGroup(stackInstancesGroup.toList())

    /**
     * The name to associate with the StackSet.
     *
     * The name must be unique in the Region where you create your StackSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stacksetname)
     * @param stackSetName The name to associate with the StackSet. 
     */
    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, CloudFormation doesn't modify the stack's tags. If you
     * specify an empty value, CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, CloudFormation doesn't modify the stack's tags. If you
     * specify an empty value, CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum
     * length of 51,200 bytes.
     *
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates that contain dynamic references through `TemplateUrl` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templatebody)
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. 
     */
    override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    /**
     * The URL of a file that contains the template body.
     *
     * The URL must point to a template (max size: 1 MB) that's located in an Amazon S3 bucket or a
     * Systems Manager document. The location for an Amazon S3 bucket must start with `https://` .
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templateurl)
     * @param templateUrl The URL of a file that contains the template body. 
     */
    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): software.amazon.awscdk.CfnStackSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnStackSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet): CfnStackSet =
        CfnStackSet(cdkObject)

    internal fun unwrap(wrapped: CfnStackSet): software.amazon.awscdk.CfnStackSet =
        wrapped.cdkObject as software.amazon.awscdk.CfnStackSet
  }

  /**
   * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added
   * to a target organization or organizational unit (OU).
   *
   * For more information, see [Enable or disable automatic deployments for StackSets in AWS
   * Organizations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-manage-auto-deployment.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * AutoDeploymentProperty autoDeploymentProperty = AutoDeploymentProperty.builder()
   * .enabled(false)
   * .retainStacksOnAccountRemoval(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html)
   */
  public interface AutoDeploymentProperty {
    /**
     * If set to `true` , StackSets automatically deploys additional stack instances to AWS
     * Organizations accounts that are added to a target organization or organizational unit (OU) in
     * the specified Regions.
     *
     * If an account is removed from a target organization or OU, StackSets deletes stack instances
     * from the account in the specified Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html#cfn-cloudformation-stackset-autodeployment-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * If set to `true` , stack resources are retained when an account is removed from a target
     * organization or OU.
     *
     * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html#cfn-cloudformation-stackset-autodeployment-retainstacksonaccountremoval)
     */
    public fun retainStacksOnAccountRemoval(): Any? = unwrap(this).getRetainStacksOnAccountRemoval()

    /**
     * A builder for [AutoDeploymentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If set to `true` , StackSets automatically deploys additional stack
       * instances to AWS Organizations accounts that are added to a target organization or
       * organizational unit (OU) in the specified Regions.
       * If an account is removed from a target organization or OU, StackSets deletes stack
       * instances from the account in the specified Regions.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If set to `true` , StackSets automatically deploys additional stack
       * instances to AWS Organizations accounts that are added to a target organization or
       * organizational unit (OU) in the specified Regions.
       * If an account is removed from a target organization or OU, StackSets deletes stack
       * instances from the account in the specified Regions.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
       * account is removed from a target organization or OU.
       * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True`
       * .
       */
      public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean)

      /**
       * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
       * account is removed from a target organization or OU.
       * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True`
       * .
       */
      public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty.Builder =
          software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty.builder()

      /**
       * @param enabled If set to `true` , StackSets automatically deploys additional stack
       * instances to AWS Organizations accounts that are added to a target organization or
       * organizational unit (OU) in the specified Regions.
       * If an account is removed from a target organization or OU, StackSets deletes stack
       * instances from the account in the specified Regions.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If set to `true` , StackSets automatically deploys additional stack
       * instances to AWS Organizations accounts that are added to a target organization or
       * organizational unit (OU) in the specified Regions.
       * If an account is removed from a target organization or OU, StackSets deletes stack
       * instances from the account in the specified Regions.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
       * account is removed from a target organization or OU.
       * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True`
       * .
       */
      override fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
      }

      /**
       * @param retainStacksOnAccountRemoval If set to `true` , stack resources are retained when an
       * account is removed from a target organization or OU.
       * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True`
       * .
       */
      override fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable) {
        cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty,
    ) : CdkObject(cdkObject),
        AutoDeploymentProperty {
      /**
       * If set to `true` , StackSets automatically deploys additional stack instances to AWS
       * Organizations accounts that are added to a target organization or organizational unit (OU) in
       * the specified Regions.
       *
       * If an account is removed from a target organization or OU, StackSets deletes stack
       * instances from the account in the specified Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html#cfn-cloudformation-stackset-autodeployment-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * If set to `true` , stack resources are retained when an account is removed from a target
       * organization or OU.
       *
       * If set to `false` , stack resources are deleted. Specify only if `Enabled` is set to `True`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html#cfn-cloudformation-stackset-autodeployment-retainstacksonaccountremoval)
       */
      override fun retainStacksOnAccountRemoval(): Any? =
          unwrap(this).getRetainStacksOnAccountRemoval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty):
          AutoDeploymentProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoDeploymentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoDeploymentProperty):
          software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty
    }
  }

  /**
   * The AWS Organizations accounts or AWS accounts to deploy stacks to in the specified Regions.
   *
   * When deploying to AWS Organizations accounts with `SERVICE_MANAGED` permissions:
   *
   * * You must specify the `OrganizationalUnitIds` property.
   * * If you specify organizational units (OUs) for `OrganizationalUnitIds` and use either the
   * `Accounts` or `AccountsUrl` property, you must also specify the `AccountFilterType` property.
   *
   * When deploying to AWS accounts with `SELF_MANAGED` permissions:
   *
   * * You must specify either the `Accounts` or `AccountsUrl` property, but not both.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * DeploymentTargetsProperty deploymentTargetsProperty = DeploymentTargetsProperty.builder()
   * .accountFilterType("accountFilterType")
   * .accounts(List.of("accounts"))
   * .accountsUrl("accountsUrl")
   * .organizationalUnitIds(List.of("organizationalUnitIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html)
   */
  public interface DeploymentTargetsProperty {
    /**
     * Refines which accounts to deploy stacks to by specifying how to use the `Accounts` and
     * `OrganizationalUnitIds` properties together.
     *
     * The following values determine how CloudFormation selects target accounts:
     *
     * * `INTERSECTION` : StackSet deploys to the accounts specified in the `Accounts` property.
     * * `DIFFERENCE` : StackSet deploys to the OU, excluding the accounts specified in the
     * `Accounts` property.
     * * `UNION` : StackSet deploys to the OU, and the accounts specified in the `Accounts`
     * property. `UNION` is not supported for create operations when using StackSet as a resource or
     * the `CreateStackInstances` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accountfiltertype)
     */
    public fun accountFilterType(): String? = unwrap(this).getAccountFilterType()

    /**
     * The account IDs of the AWS accounts .
     *
     * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
     * property instead.
     *
     * *Pattern* : `^[0-9]{12}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accounts)
     */
    public fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

    /**
     * The Amazon S3 URL path to a file that contains a list of AWS account IDs.
     *
     * The file format must be either `.csv` or `.txt` , and the data can be comma-separated or
     * new-line-separated. There is currently a 10MB limit for the data (approximately 800,000
     * accounts).
     *
     * This property serves the same purpose as `Accounts` but allows you to specify a large number
     * of accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accountsurl)
     */
    public fun accountsUrl(): String? = unwrap(this).getAccountsUrl()

    /**
     * The organization root ID or organizational unit (OU) IDs.
     *
     * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-organizationalunitids)
     */
    public fun organizationalUnitIds(): List<String> = unwrap(this).getOrganizationalUnitIds() ?:
        emptyList()

    /**
     * A builder for [DeploymentTargetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountFilterType Refines which accounts to deploy stacks to by specifying how to
       * use the `Accounts` and `OrganizationalUnitIds` properties together.
       * The following values determine how CloudFormation selects target accounts:
       *
       * * `INTERSECTION` : StackSet deploys to the accounts specified in the `Accounts` property.
       * * `DIFFERENCE` : StackSet deploys to the OU, excluding the accounts specified in the
       * `Accounts` property.
       * * `UNION` : StackSet deploys to the OU, and the accounts specified in the `Accounts`
       * property. `UNION` is not supported for create operations when using StackSet as a resource or
       * the `CreateStackInstances` API.
       */
      public fun accountFilterType(accountFilterType: String)

      /**
       * @param accounts The account IDs of the AWS accounts .
       * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
       * property instead.
       *
       * *Pattern* : `^[0-9]{12}$`
       */
      public fun accounts(accounts: List<String>)

      /**
       * @param accounts The account IDs of the AWS accounts .
       * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
       * property instead.
       *
       * *Pattern* : `^[0-9]{12}$`
       */
      public fun accounts(vararg accounts: String)

      /**
       * @param accountsUrl The Amazon S3 URL path to a file that contains a list of AWS account
       * IDs.
       * The file format must be either `.csv` or `.txt` , and the data can be comma-separated or
       * new-line-separated. There is currently a 10MB limit for the data (approximately 800,000
       * accounts).
       *
       * This property serves the same purpose as `Accounts` but allows you to specify a large
       * number of accounts.
       */
      public fun accountsUrl(accountsUrl: String)

      /**
       * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs.
       * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
       */
      public fun organizationalUnitIds(organizationalUnitIds: List<String>)

      /**
       * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs.
       * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
       */
      public fun organizationalUnitIds(vararg organizationalUnitIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty.Builder =
          software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty.builder()

      /**
       * @param accountFilterType Refines which accounts to deploy stacks to by specifying how to
       * use the `Accounts` and `OrganizationalUnitIds` properties together.
       * The following values determine how CloudFormation selects target accounts:
       *
       * * `INTERSECTION` : StackSet deploys to the accounts specified in the `Accounts` property.
       * * `DIFFERENCE` : StackSet deploys to the OU, excluding the accounts specified in the
       * `Accounts` property.
       * * `UNION` : StackSet deploys to the OU, and the accounts specified in the `Accounts`
       * property. `UNION` is not supported for create operations when using StackSet as a resource or
       * the `CreateStackInstances` API.
       */
      override fun accountFilterType(accountFilterType: String) {
        cdkBuilder.accountFilterType(accountFilterType)
      }

      /**
       * @param accounts The account IDs of the AWS accounts .
       * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
       * property instead.
       *
       * *Pattern* : `^[0-9]{12}$`
       */
      override fun accounts(accounts: List<String>) {
        cdkBuilder.accounts(accounts)
      }

      /**
       * @param accounts The account IDs of the AWS accounts .
       * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
       * property instead.
       *
       * *Pattern* : `^[0-9]{12}$`
       */
      override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

      /**
       * @param accountsUrl The Amazon S3 URL path to a file that contains a list of AWS account
       * IDs.
       * The file format must be either `.csv` or `.txt` , and the data can be comma-separated or
       * new-line-separated. There is currently a 10MB limit for the data (approximately 800,000
       * accounts).
       *
       * This property serves the same purpose as `Accounts` but allows you to specify a large
       * number of accounts.
       */
      override fun accountsUrl(accountsUrl: String) {
        cdkBuilder.accountsUrl(accountsUrl)
      }

      /**
       * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs.
       * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
       */
      override fun organizationalUnitIds(organizationalUnitIds: List<String>) {
        cdkBuilder.organizationalUnitIds(organizationalUnitIds)
      }

      /**
       * @param organizationalUnitIds The organization root ID or organizational unit (OU) IDs.
       * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
       */
      override fun organizationalUnitIds(vararg organizationalUnitIds: String): Unit =
          organizationalUnitIds(organizationalUnitIds.toList())

      public fun build(): software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty,
    ) : CdkObject(cdkObject),
        DeploymentTargetsProperty {
      /**
       * Refines which accounts to deploy stacks to by specifying how to use the `Accounts` and
       * `OrganizationalUnitIds` properties together.
       *
       * The following values determine how CloudFormation selects target accounts:
       *
       * * `INTERSECTION` : StackSet deploys to the accounts specified in the `Accounts` property.
       * * `DIFFERENCE` : StackSet deploys to the OU, excluding the accounts specified in the
       * `Accounts` property.
       * * `UNION` : StackSet deploys to the OU, and the accounts specified in the `Accounts`
       * property. `UNION` is not supported for create operations when using StackSet as a resource or
       * the `CreateStackInstances` API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accountfiltertype)
       */
      override fun accountFilterType(): String? = unwrap(this).getAccountFilterType()

      /**
       * The account IDs of the AWS accounts .
       *
       * If you have many account numbers, you can provide those accounts using the `AccountsUrl`
       * property instead.
       *
       * *Pattern* : `^[0-9]{12}$`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accounts)
       */
      override fun accounts(): List<String> = unwrap(this).getAccounts() ?: emptyList()

      /**
       * The Amazon S3 URL path to a file that contains a list of AWS account IDs.
       *
       * The file format must be either `.csv` or `.txt` , and the data can be comma-separated or
       * new-line-separated. There is currently a 10MB limit for the data (approximately 800,000
       * accounts).
       *
       * This property serves the same purpose as `Accounts` but allows you to specify a large
       * number of accounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-accountsurl)
       */
      override fun accountsUrl(): String? = unwrap(this).getAccountsUrl()

      /**
       * The organization root ID or organizational unit (OU) IDs.
       *
       * *Pattern* : `^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html#cfn-cloudformation-stackset-deploymenttargets-organizationalunitids)
       */
      override fun organizationalUnitIds(): List<String> = unwrap(this).getOrganizationalUnitIds()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentTargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty):
          DeploymentTargetsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentTargetsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentTargetsProperty):
          software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty
    }
  }

  /**
   * Describes whether StackSets performs non-conflicting operations concurrently and queues
   * conflicting operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * ManagedExecutionProperty managedExecutionProperty = ManagedExecutionProperty.builder()
   * .active(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html)
   */
  public interface ManagedExecutionProperty {
    /**
     * When `true` , CloudFormation performs non-conflicting operations concurrently and queues
     * conflicting operations.
     *
     * After conflicting operations finish, CloudFormation starts queued operations in request
     * order.
     *
     *
     * If there are already running or queued operations, CloudFormation queues all incoming
     * operations even if they are non-conflicting.
     *
     * You can't modify your StackSet's execution configuration while there are running or queued
     * operations for that StackSet.
     *
     *
     * When `false` (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html#cfn-cloudformation-stackset-managedexecution-active)
     */
    public fun active(): Any? = unwrap(this).getActive()

    /**
     * A builder for [ManagedExecutionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param active When `true` , CloudFormation performs non-conflicting operations concurrently
       * and queues conflicting operations.
       * After conflicting operations finish, CloudFormation starts queued operations in request
       * order.
       *
       *
       * If there are already running or queued operations, CloudFormation queues all incoming
       * operations even if they are non-conflicting.
       *
       * You can't modify your StackSet's execution configuration while there are running or queued
       * operations for that StackSet.
       *
       *
       * When `false` (default), StackSets performs one operation at a time in request order.
       */
      public fun active(active: Boolean)

      /**
       * @param active When `true` , CloudFormation performs non-conflicting operations concurrently
       * and queues conflicting operations.
       * After conflicting operations finish, CloudFormation starts queued operations in request
       * order.
       *
       *
       * If there are already running or queued operations, CloudFormation queues all incoming
       * operations even if they are non-conflicting.
       *
       * You can't modify your StackSet's execution configuration while there are running or queued
       * operations for that StackSet.
       *
       *
       * When `false` (default), StackSets performs one operation at a time in request order.
       */
      public fun active(active: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty.Builder =
          software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty.builder()

      /**
       * @param active When `true` , CloudFormation performs non-conflicting operations concurrently
       * and queues conflicting operations.
       * After conflicting operations finish, CloudFormation starts queued operations in request
       * order.
       *
       *
       * If there are already running or queued operations, CloudFormation queues all incoming
       * operations even if they are non-conflicting.
       *
       * You can't modify your StackSet's execution configuration while there are running or queued
       * operations for that StackSet.
       *
       *
       * When `false` (default), StackSets performs one operation at a time in request order.
       */
      override fun active(active: Boolean) {
        cdkBuilder.active(active)
      }

      /**
       * @param active When `true` , CloudFormation performs non-conflicting operations concurrently
       * and queues conflicting operations.
       * After conflicting operations finish, CloudFormation starts queued operations in request
       * order.
       *
       *
       * If there are already running or queued operations, CloudFormation queues all incoming
       * operations even if they are non-conflicting.
       *
       * You can't modify your StackSet's execution configuration while there are running or queued
       * operations for that StackSet.
       *
       *
       * When `false` (default), StackSets performs one operation at a time in request order.
       */
      override fun active(active: IResolvable) {
        cdkBuilder.active(active.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty,
    ) : CdkObject(cdkObject),
        ManagedExecutionProperty {
      /**
       * When `true` , CloudFormation performs non-conflicting operations concurrently and queues
       * conflicting operations.
       *
       * After conflicting operations finish, CloudFormation starts queued operations in request
       * order.
       *
       *
       * If there are already running or queued operations, CloudFormation queues all incoming
       * operations even if they are non-conflicting.
       *
       * You can't modify your StackSet's execution configuration while there are running or queued
       * operations for that StackSet.
       *
       *
       * When `false` (default), StackSets performs one operation at a time in request order.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html#cfn-cloudformation-stackset-managedexecution-active)
       */
      override fun active(): Any? = unwrap(this).getActive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedExecutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty):
          ManagedExecutionProperty = CdkObjectWrappers.wrap(cdkObject) as? ManagedExecutionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedExecutionProperty):
          software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnStackSet.ManagedExecutionProperty
    }
  }

  /**
   * The user-specified preferences for how CloudFormation performs a StackSet operation.
   *
   * For more information on maximum concurrent accounts and failure tolerance, see [StackSet
   * operation
   * options](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options)
   * in the *AWS CloudFormation User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * OperationPreferencesProperty operationPreferencesProperty =
   * OperationPreferencesProperty.builder()
   * .concurrencyMode("concurrencyMode")
   * .failureToleranceCount(123)
   * .failureTolerancePercentage(123)
   * .maxConcurrentCount(123)
   * .maxConcurrentPercentage(123)
   * .regionConcurrencyType("regionConcurrencyType")
   * .regionOrder(List.of("regionOrder"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html)
   */
  public interface OperationPreferencesProperty {
    /**
     * Specifies how the concurrency level behaves during the operation execution.
     *
     * * `STRICT_FAILURE_TOLERANCE` : This option dynamically lowers the concurrency level to ensure
     * the number of failed accounts never exceeds the value of `FailureToleranceCount` +1. The initial
     * actual concurrency is set to the lower of either the value of the `MaxConcurrentCount` , or the
     * value of `FailureToleranceCount` +1. The actual concurrency is then reduced proportionally by
     * the number of failures. This is the default behavior.
     *
     * If failure tolerance or Maximum concurrent accounts are set to percentages, the behavior is
     * similar.
     *
     * * `SOFT_FAILURE_TOLERANCE` : This option decouples `FailureToleranceCount` from the actual
     * concurrency. This allows StackSet operations to run at the concurrency level set by the
     * `MaxConcurrentCount` value, or `MaxConcurrentPercentage` , regardless of the number of failures.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-concurrencymode)
     */
    public fun concurrencyMode(): String? = unwrap(this).getConcurrencyMode()

    /**
     * The number of accounts per Region this operation can fail in before CloudFormation stops the
     * operation in that Region.
     *
     * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in any
     * subsequent Regions.
     *
     * Conditional: You must specify either `FailureToleranceCount` or `FailureTolerancePercentage`
     * (but not both).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-failuretolerancecount)
     */
    public fun failureToleranceCount(): Number? = unwrap(this).getFailureToleranceCount()

    /**
     * The percentage of accounts per Region this stack operation can fail in before CloudFormation
     * stops the operation in that Region.
     *
     * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in any
     * subsequent Regions.
     *
     * When calculating the number of accounts based on the specified percentage, CloudFormation
     * rounds *down* to the next whole number.
     *
     * Conditional: You must specify either `FailureToleranceCount` or `FailureTolerancePercentage`
     * , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-failuretolerancepercentage)
     */
    public fun failureTolerancePercentage(): Number? = unwrap(this).getFailureTolerancePercentage()

    /**
     * The maximum number of accounts in which to perform this operation at one time.
     *
     * This is dependent on the value of `FailureToleranceCount` . `MaxConcurrentCount` is at most
     * one more than the `FailureToleranceCount` .
     *
     * Note that this setting lets you specify the *maximum* for operations. For large deployments,
     * under certain circumstances the actual number of accounts acted upon concurrently may be lower
     * due to service throttling.
     *
     * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` , but
     * not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-maxconcurrentcount)
     */
    public fun maxConcurrentCount(): Number? = unwrap(this).getMaxConcurrentCount()

    /**
     * The maximum percentage of accounts in which to perform this operation at one time.
     *
     * When calculating the number of accounts based on the specified percentage, CloudFormation
     * rounds down to the next whole number. This is true except in cases where rounding down would
     * result is zero. In this case, CloudFormation sets the number as one instead.
     *
     * Note that this setting lets you specify the *maximum* for operations. For large deployments,
     * under certain circumstances the actual number of accounts acted upon concurrently may be lower
     * due to service throttling.
     *
     * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` , but
     * not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-maxconcurrentpercentage)
     */
    public fun maxConcurrentPercentage(): Number? = unwrap(this).getMaxConcurrentPercentage()

    /**
     * The concurrency type of deploying StackSets operations in Regions, could be in parallel or
     * one Region at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-regionconcurrencytype)
     */
    public fun regionConcurrencyType(): String? = unwrap(this).getRegionConcurrencyType()

    /**
     * The order of the Regions where you want to perform the stack operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-regionorder)
     */
    public fun regionOrder(): List<String> = unwrap(this).getRegionOrder() ?: emptyList()

    /**
     * A builder for [OperationPreferencesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param concurrencyMode Specifies how the concurrency level behaves during the operation
       * execution.
       * * `STRICT_FAILURE_TOLERANCE` : This option dynamically lowers the concurrency level to
       * ensure the number of failed accounts never exceeds the value of `FailureToleranceCount` +1.
       * The initial actual concurrency is set to the lower of either the value of the
       * `MaxConcurrentCount` , or the value of `FailureToleranceCount` +1. The actual concurrency is
       * then reduced proportionally by the number of failures. This is the default behavior.
       *
       * If failure tolerance or Maximum concurrent accounts are set to percentages, the behavior is
       * similar.
       *
       * * `SOFT_FAILURE_TOLERANCE` : This option decouples `FailureToleranceCount` from the actual
       * concurrency. This allows StackSet operations to run at the concurrency level set by the
       * `MaxConcurrentCount` value, or `MaxConcurrentPercentage` , regardless of the number of
       * failures.
       */
      public fun concurrencyMode(concurrencyMode: String)

      /**
       * @param failureToleranceCount The number of accounts per Region this operation can fail in
       * before CloudFormation stops the operation in that Region.
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` (but not both).
       */
      public fun failureToleranceCount(failureToleranceCount: Number)

      /**
       * @param failureTolerancePercentage The percentage of accounts per Region this stack
       * operation can fail in before CloudFormation stops the operation in that Region.
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds *down* to the next whole number.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` , but not both.
       */
      public fun failureTolerancePercentage(failureTolerancePercentage: Number)

      /**
       * @param maxConcurrentCount The maximum number of accounts in which to perform this operation
       * at one time.
       * This is dependent on the value of `FailureToleranceCount` . `MaxConcurrentCount` is at most
       * one more than the `FailureToleranceCount` .
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       */
      public fun maxConcurrentCount(maxConcurrentCount: Number)

      /**
       * @param maxConcurrentPercentage The maximum percentage of accounts in which to perform this
       * operation at one time.
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds down to the next whole number. This is true except in cases where rounding down would
       * result is zero. In this case, CloudFormation sets the number as one instead.
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       */
      public fun maxConcurrentPercentage(maxConcurrentPercentage: Number)

      /**
       * @param regionConcurrencyType The concurrency type of deploying StackSets operations in
       * Regions, could be in parallel or one Region at a time.
       */
      public fun regionConcurrencyType(regionConcurrencyType: String)

      /**
       * @param regionOrder The order of the Regions where you want to perform the stack operation.
       */
      public fun regionOrder(regionOrder: List<String>)

      /**
       * @param regionOrder The order of the Regions where you want to perform the stack operation.
       */
      public fun regionOrder(vararg regionOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty.Builder =
          software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty.builder()

      /**
       * @param concurrencyMode Specifies how the concurrency level behaves during the operation
       * execution.
       * * `STRICT_FAILURE_TOLERANCE` : This option dynamically lowers the concurrency level to
       * ensure the number of failed accounts never exceeds the value of `FailureToleranceCount` +1.
       * The initial actual concurrency is set to the lower of either the value of the
       * `MaxConcurrentCount` , or the value of `FailureToleranceCount` +1. The actual concurrency is
       * then reduced proportionally by the number of failures. This is the default behavior.
       *
       * If failure tolerance or Maximum concurrent accounts are set to percentages, the behavior is
       * similar.
       *
       * * `SOFT_FAILURE_TOLERANCE` : This option decouples `FailureToleranceCount` from the actual
       * concurrency. This allows StackSet operations to run at the concurrency level set by the
       * `MaxConcurrentCount` value, or `MaxConcurrentPercentage` , regardless of the number of
       * failures.
       */
      override fun concurrencyMode(concurrencyMode: String) {
        cdkBuilder.concurrencyMode(concurrencyMode)
      }

      /**
       * @param failureToleranceCount The number of accounts per Region this operation can fail in
       * before CloudFormation stops the operation in that Region.
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` (but not both).
       */
      override fun failureToleranceCount(failureToleranceCount: Number) {
        cdkBuilder.failureToleranceCount(failureToleranceCount)
      }

      /**
       * @param failureTolerancePercentage The percentage of accounts per Region this stack
       * operation can fail in before CloudFormation stops the operation in that Region.
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds *down* to the next whole number.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` , but not both.
       */
      override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
      }

      /**
       * @param maxConcurrentCount The maximum number of accounts in which to perform this operation
       * at one time.
       * This is dependent on the value of `FailureToleranceCount` . `MaxConcurrentCount` is at most
       * one more than the `FailureToleranceCount` .
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       */
      override fun maxConcurrentCount(maxConcurrentCount: Number) {
        cdkBuilder.maxConcurrentCount(maxConcurrentCount)
      }

      /**
       * @param maxConcurrentPercentage The maximum percentage of accounts in which to perform this
       * operation at one time.
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds down to the next whole number. This is true except in cases where rounding down would
       * result is zero. In this case, CloudFormation sets the number as one instead.
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       */
      override fun maxConcurrentPercentage(maxConcurrentPercentage: Number) {
        cdkBuilder.maxConcurrentPercentage(maxConcurrentPercentage)
      }

      /**
       * @param regionConcurrencyType The concurrency type of deploying StackSets operations in
       * Regions, could be in parallel or one Region at a time.
       */
      override fun regionConcurrencyType(regionConcurrencyType: String) {
        cdkBuilder.regionConcurrencyType(regionConcurrencyType)
      }

      /**
       * @param regionOrder The order of the Regions where you want to perform the stack operation.
       */
      override fun regionOrder(regionOrder: List<String>) {
        cdkBuilder.regionOrder(regionOrder)
      }

      /**
       * @param regionOrder The order of the Regions where you want to perform the stack operation.
       */
      override fun regionOrder(vararg regionOrder: String): Unit = regionOrder(regionOrder.toList())

      public fun build(): software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty,
    ) : CdkObject(cdkObject),
        OperationPreferencesProperty {
      /**
       * Specifies how the concurrency level behaves during the operation execution.
       *
       * * `STRICT_FAILURE_TOLERANCE` : This option dynamically lowers the concurrency level to
       * ensure the number of failed accounts never exceeds the value of `FailureToleranceCount` +1.
       * The initial actual concurrency is set to the lower of either the value of the
       * `MaxConcurrentCount` , or the value of `FailureToleranceCount` +1. The actual concurrency is
       * then reduced proportionally by the number of failures. This is the default behavior.
       *
       * If failure tolerance or Maximum concurrent accounts are set to percentages, the behavior is
       * similar.
       *
       * * `SOFT_FAILURE_TOLERANCE` : This option decouples `FailureToleranceCount` from the actual
       * concurrency. This allows StackSet operations to run at the concurrency level set by the
       * `MaxConcurrentCount` value, or `MaxConcurrentPercentage` , regardless of the number of
       * failures.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-concurrencymode)
       */
      override fun concurrencyMode(): String? = unwrap(this).getConcurrencyMode()

      /**
       * The number of accounts per Region this operation can fail in before CloudFormation stops
       * the operation in that Region.
       *
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` (but not both).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-failuretolerancecount)
       */
      override fun failureToleranceCount(): Number? = unwrap(this).getFailureToleranceCount()

      /**
       * The percentage of accounts per Region this stack operation can fail in before
       * CloudFormation stops the operation in that Region.
       *
       * If the operation is stopped in a Region, CloudFormation doesn't attempt the operation in
       * any subsequent Regions.
       *
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds *down* to the next whole number.
       *
       * Conditional: You must specify either `FailureToleranceCount` or
       * `FailureTolerancePercentage` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-failuretolerancepercentage)
       */
      override fun failureTolerancePercentage(): Number? =
          unwrap(this).getFailureTolerancePercentage()

      /**
       * The maximum number of accounts in which to perform this operation at one time.
       *
       * This is dependent on the value of `FailureToleranceCount` . `MaxConcurrentCount` is at most
       * one more than the `FailureToleranceCount` .
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-maxconcurrentcount)
       */
      override fun maxConcurrentCount(): Number? = unwrap(this).getMaxConcurrentCount()

      /**
       * The maximum percentage of accounts in which to perform this operation at one time.
       *
       * When calculating the number of accounts based on the specified percentage, CloudFormation
       * rounds down to the next whole number. This is true except in cases where rounding down would
       * result is zero. In this case, CloudFormation sets the number as one instead.
       *
       * Note that this setting lets you specify the *maximum* for operations. For large
       * deployments, under certain circumstances the actual number of accounts acted upon concurrently
       * may be lower due to service throttling.
       *
       * Conditional: You must specify either `MaxConcurrentCount` or `MaxConcurrentPercentage` ,
       * but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-maxconcurrentpercentage)
       */
      override fun maxConcurrentPercentage(): Number? = unwrap(this).getMaxConcurrentPercentage()

      /**
       * The concurrency type of deploying StackSets operations in Regions, could be in parallel or
       * one Region at a time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-regionconcurrencytype)
       */
      override fun regionConcurrencyType(): String? = unwrap(this).getRegionConcurrencyType()

      /**
       * The order of the Regions where you want to perform the stack operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html#cfn-cloudformation-stackset-operationpreferences-regionorder)
       */
      override fun regionOrder(): List<String> = unwrap(this).getRegionOrder() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OperationPreferencesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty):
          OperationPreferencesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OperationPreferencesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OperationPreferencesProperty):
          software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty
    }
  }

  /**
   * The Parameter data type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html)
   */
  public interface ParameterProperty {
    /**
     * The key associated with the parameter.
     *
     * If you don't specify a key and value for a particular parameter, CloudFormation uses the
     * default value that's specified in your template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html#cfn-cloudformation-stackset-parameter-parameterkey)
     */
    public fun parameterKey(): String

    /**
     * The input value associated with the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html#cfn-cloudformation-stackset-parameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterKey The key associated with the parameter. 
       * If you don't specify a key and value for a particular parameter, CloudFormation uses the
       * default value that's specified in your template.
       */
      public fun parameterKey(parameterKey: String)

      /**
       * @param parameterValue The input value associated with the parameter. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStackSet.ParameterProperty.Builder =
          software.amazon.awscdk.CfnStackSet.ParameterProperty.builder()

      /**
       * @param parameterKey The key associated with the parameter. 
       * If you don't specify a key and value for a particular parameter, CloudFormation uses the
       * default value that's specified in your template.
       */
      override fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
      }

      /**
       * @param parameterValue The input value associated with the parameter. 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build(): software.amazon.awscdk.CfnStackSet.ParameterProperty = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.ParameterProperty,
    ) : CdkObject(cdkObject),
        ParameterProperty {
      /**
       * The key associated with the parameter.
       *
       * If you don't specify a key and value for a particular parameter, CloudFormation uses the
       * default value that's specified in your template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html#cfn-cloudformation-stackset-parameter-parameterkey)
       */
      override fun parameterKey(): String = unwrap(this).getParameterKey()

      /**
       * The input value associated with the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html#cfn-cloudformation-stackset-parameter-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.ParameterProperty):
          ParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.CfnStackSet.ParameterProperty = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.CfnStackSet.ParameterProperty
    }
  }

  /**
   * Stack instances in some specific accounts and Regions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * StackInstancesProperty stackInstancesProperty = StackInstancesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html)
   */
  public interface StackInstancesProperty {
    /**
     * The AWS Organizations accounts or AWS accounts to deploy stacks to in the specified Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-deploymenttargets)
     */
    public fun deploymentTargets(): Any

    /**
     * A list of StackSet parameters whose values you want to override in the selected stack
     * instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-parameteroverrides)
     */
    public fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

    /**
     * The names of one or more Regions where you want to create stack instances using the specified
     * AWS accounts .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-regions)
     */
    public fun regions(): List<String>

    /**
     * A builder for [StackInstancesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      public fun deploymentTargets(deploymentTargets: IResolvable)

      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      public fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty)

      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cce75b5342b1638fb000023ed0c15e590133242c5c446ad9ac733df727569a8f")
      public fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty.Builder.() -> Unit)

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      public fun parameterOverrides(parameterOverrides: IResolvable)

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      public fun parameterOverrides(parameterOverrides: List<Any>)

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      public fun parameterOverrides(vararg parameterOverrides: Any)

      /**
       * @param regions The names of one or more Regions where you want to create stack instances
       * using the specified AWS accounts . 
       */
      public fun regions(regions: List<String>)

      /**
       * @param regions The names of one or more Regions where you want to create stack instances
       * using the specified AWS accounts . 
       */
      public fun regions(vararg regions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStackSet.StackInstancesProperty.Builder =
          software.amazon.awscdk.CfnStackSet.StackInstancesProperty.builder()

      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      override fun deploymentTargets(deploymentTargets: IResolvable) {
        cdkBuilder.deploymentTargets(deploymentTargets.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      override fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty) {
        cdkBuilder.deploymentTargets(deploymentTargets.let(DeploymentTargetsProperty.Companion::unwrap))
      }

      /**
       * @param deploymentTargets The AWS Organizations accounts or AWS accounts to deploy stacks to
       * in the specified Regions. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cce75b5342b1638fb000023ed0c15e590133242c5c446ad9ac733df727569a8f")
      override
          fun deploymentTargets(deploymentTargets: DeploymentTargetsProperty.Builder.() -> Unit):
          Unit = deploymentTargets(DeploymentTargetsProperty(deploymentTargets))

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      override fun parameterOverrides(parameterOverrides: IResolvable) {
        cdkBuilder.parameterOverrides(parameterOverrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      override fun parameterOverrides(parameterOverrides: List<Any>) {
        cdkBuilder.parameterOverrides(parameterOverrides.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param parameterOverrides A list of StackSet parameters whose values you want to override
       * in the selected stack instances.
       */
      override fun parameterOverrides(vararg parameterOverrides: Any): Unit =
          parameterOverrides(parameterOverrides.toList())

      /**
       * @param regions The names of one or more Regions where you want to create stack instances
       * using the specified AWS accounts . 
       */
      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      /**
       * @param regions The names of one or more Regions where you want to create stack instances
       * using the specified AWS accounts . 
       */
      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      public fun build(): software.amazon.awscdk.CfnStackSet.StackInstancesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnStackSet.StackInstancesProperty,
    ) : CdkObject(cdkObject),
        StackInstancesProperty {
      /**
       * The AWS Organizations accounts or AWS accounts to deploy stacks to in the specified
       * Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-deploymenttargets)
       */
      override fun deploymentTargets(): Any = unwrap(this).getDeploymentTargets()

      /**
       * A list of StackSet parameters whose values you want to override in the selected stack
       * instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-parameteroverrides)
       */
      override fun parameterOverrides(): Any? = unwrap(this).getParameterOverrides()

      /**
       * The names of one or more Regions where you want to create stack instances using the
       * specified AWS accounts .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html#cfn-cloudformation-stackset-stackinstances-regions)
       */
      override fun regions(): List<String> = unwrap(this).getRegions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackInstancesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackSet.StackInstancesProperty):
          StackInstancesProperty = CdkObjectWrappers.wrap(cdkObject) as? StackInstancesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackInstancesProperty):
          software.amazon.awscdk.CfnStackSet.StackInstancesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnStackSet.StackInstancesProperty
    }
  }
}
