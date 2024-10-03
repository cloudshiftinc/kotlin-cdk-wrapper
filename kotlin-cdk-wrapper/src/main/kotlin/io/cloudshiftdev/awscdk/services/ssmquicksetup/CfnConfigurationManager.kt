@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmquicksetup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Quick Setup configuration manager resource.
 *
 * This object is a collection of desired state configurations for multiple configuration
 * definitions and summaries describing the deployments of those definitions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmquicksetup.*;
 * CfnConfigurationManager cfnConfigurationManager = CfnConfigurationManager.Builder.create(this,
 * "MyCfnConfigurationManager")
 * .configurationDefinitions(List.of(ConfigurationDefinitionProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .type("type")
 * // the properties below are optional
 * .id("id")
 * .localDeploymentAdministrationRoleArn("localDeploymentAdministrationRoleArn")
 * .localDeploymentExecutionRoleName("localDeploymentExecutionRoleName")
 * .typeVersion("typeVersion")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html)
 */
public open class CfnConfigurationManager(
  cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationManagerProps,
  ) :
      this(software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfigurationManagerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationManagerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationManagerProps(props)
  )

  /**
   * The datetime stamp when the configuration manager was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The datetime stamp when the configuration manager was last updated.
   */
  public open fun attrLastModifiedAt(): String = unwrap(this).getAttrLastModifiedAt()

  /**
   * The ARN of the Quick Setup configuration.
   */
  public open fun attrManagerArn(): String = unwrap(this).getAttrManagerArn()

  /**
   * Summaries of the state of the configuration manager.
   *
   * These summaries include an aggregate of the statuses from the configuration definition
   * associated with the configuration manager. This includes deployment statuses, association
   * statuses, drift statuses, health checks, and more.
   */
  public open fun attrStatusSummaries(): IResolvable =
      unwrap(this).getAttrStatusSummaries().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The definition of the Quick Setup configuration that the configuration manager deploys.
   */
  public open fun configurationDefinitions(): Any = unwrap(this).getConfigurationDefinitions()

  /**
   * The definition of the Quick Setup configuration that the configuration manager deploys.
   */
  public open fun configurationDefinitions(`value`: IResolvable) {
    unwrap(this).setConfigurationDefinitions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition of the Quick Setup configuration that the configuration manager deploys.
   */
  public open fun configurationDefinitions(`value`: List<Any>) {
    unwrap(this).setConfigurationDefinitions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The definition of the Quick Setup configuration that the configuration manager deploys.
   */
  public open fun configurationDefinitions(vararg `value`: Any): Unit =
      configurationDefinitions(`value`.toList())

  /**
   * The description of the configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the configuration.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Key-value pairs of metadata to assign to the configuration manager.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Key-value pairs of metadata to assign to the configuration manager.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmquicksetup.CfnConfigurationManager].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(configurationDefinitions: IResolvable)

    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(configurationDefinitions: List<Any>)

    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    public fun configurationDefinitions(vararg configurationDefinitions: Any)

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-description)
     * @param description The description of the configuration. 
     */
    public fun description(description: String)

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-name)
     * @param name The name of the configuration. 
     */
    public fun name(name: String)

    /**
     * Key-value pairs of metadata to assign to the configuration manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-tags)
     * @param tags Key-value pairs of metadata to assign to the configuration manager. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.Builder =
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.Builder.create(scope,
        id)

    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(configurationDefinitions: IResolvable) {
      cdkBuilder.configurationDefinitions(configurationDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(configurationDefinitions: List<Any>) {
      cdkBuilder.configurationDefinitions(configurationDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The definition of the Quick Setup configuration that the configuration manager deploys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-configurationdefinitions)
     * @param configurationDefinitions The definition of the Quick Setup configuration that the
     * configuration manager deploys. 
     */
    override fun configurationDefinitions(vararg configurationDefinitions: Any): Unit =
        configurationDefinitions(configurationDefinitions.toList())

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-description)
     * @param description The description of the configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-name)
     * @param name The name of the configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Key-value pairs of metadata to assign to the configuration manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmquicksetup-configurationmanager.html#cfn-ssmquicksetup-configurationmanager-tags)
     * @param tags Key-value pairs of metadata to assign to the configuration manager. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationManager {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationManager(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager):
        CfnConfigurationManager = CfnConfigurationManager(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationManager):
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager = wrapped.cdkObject as
        software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager
  }

  /**
   * The definition of a Quick Setup configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmquicksetup.*;
   * ConfigurationDefinitionProperty configurationDefinitionProperty =
   * ConfigurationDefinitionProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .type("type")
   * // the properties below are optional
   * .id("id")
   * .localDeploymentAdministrationRoleArn("localDeploymentAdministrationRoleArn")
   * .localDeploymentExecutionRoleName("localDeploymentExecutionRoleName")
   * .typeVersion("typeVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html)
   */
  public interface ConfigurationDefinitionProperty {
    /**
     * The ID of the configuration definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The ARN of the IAM role used to administrate local configuration deployments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-localdeploymentadministrationrolearn)
     */
    public fun localDeploymentAdministrationRoleArn(): String? =
        unwrap(this).getLocalDeploymentAdministrationRoleArn()

    /**
     * The name of the IAM role used to deploy local configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-localdeploymentexecutionrolename)
     */
    public fun localDeploymentExecutionRoleName(): String? =
        unwrap(this).getLocalDeploymentExecutionRoleName()

    /**
     * The parameters for the configuration definition type.
     *
     * Parameters for configuration definitions vary based the configuration type. The following
     * tables outline the parameters for each configuration type.
     *
     * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
     * * Description: (Required) The ID of the delegated administrator account.
     * * `TargetOrganizationalUnits`
     * * Description: (Required) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
     * * Description: (Required) The tag key assigned to the instances you want to target.
     * * `TargetTagValue`
     * * Description: (Required) The value of the tag key assigned to the instances you want to
     * target.
     * * `ICalendarString`
     * * Description: (Required) An iCalendar formatted string containing the schedule you want
     * Change Manager to use.
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
     * `UpdateSSMAgent`
     * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated on
     * the target instances every 2 weeks. The default value is " `true` ".
     * * `TargetOrganizationalUnits`
     * * Description: (Required) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
     * `SelectedAggregatorRegion`
     * * Description: (Required) The AWS Region where you want to create the aggregator index.
     * * `ReplaceExistingAggregator`
     * * Description: (Required) A boolean value that determines whether to demote an existing
     * aggregator if it is in a Region that differs from the value you specify for the
     * `SelectedAggregatorRegion` .
     * * `TargetOrganizationalUnits`
     * * Description: (Required) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
     * * Description: (Required) The ID of the delegated administrator account.
     * * `JobFunction`
     * * Description: (Required) The name for the Change Manager job function.
     * * `PermissionType`
     * * Description: (Optional) Specifies whether you want to use default administrator permissions
     * for the job function role, or provide a custom IAM policy. The valid values are
     * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
     * `CustomerPermissions` .
     * * `CustomPermissions`
     * * Description: (Optional) A JSON string containing the IAM policy you want your job function
     * to use. You must provide a value for this parameter if you specify `CustomPermissions` for the
     * `PermissionType` parameter.
     * * `TargetOrganizationalUnits`
     * * Description: (Required) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
     * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
     * AWS CloudFormation stacks in the account. The default value is " `false` ".
     * * `EnableSnsNotifications`
     * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
     * notifications when an insight is created. The default value is " `true` ".
     * * `EnableSsmOpsItems`
     * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
     * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
     * * `EnableDriftRemediation`
     * * Description: (Optional) A boolean value that determines whether a drift remediation
     * schedule is used. The default value is " `false` ".
     * * `RemediationSchedule`
     * * Description: (Optional) A rate expression that defines the schedule for drift remediation.
     * The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and `none` . The
     * default value is " `none` ".
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
     * * Description: (Optional) The ID of the delegated administrator account. This parameter is
     * required for Organization deployments.
     * * `RemediationSchedule`
     * * Description: (Optional) A rate expression that defines the schedule for drift remediation.
     * The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and `none` . The
     * default value is " `none` ".
     * * `CPackNames`
     * * Description: (Required) A comma separated list of AWS Config conformance packs.
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) The ID of the root of your Organization. This configuration type
     * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
     * OUs in the Organization.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
     * * Description: (Optional) A boolean value that determines whether all supported resources are
     * recorded. The default value is " `true` ".
     * * `ResourceTypesToRecord`
     * * Description: (Optional) A comma separated list of resource types you want to record.
     * * `RecordGlobalResourceTypes`
     * * Description: (Optional) A boolean value that determines whether global resources are
     * recorded with all resource configurations. The default value is " `false` ".
     * * `GlobalResourceTypesRegion`
     * * Description: (Optional) Determines the AWS Region where global resources are recorded.
     * * `UseCustomBucket`
     * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
     * is used for delivery. The default value is " `false` ".
     * * `DeliveryBucketName`
     * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
     * configuration snapshots and configuration history files to.
     * * `DeliveryBucketPrefix`
     * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
     * * `NotificationOptions`
     * * Description: (Optional) Determines the notification configuration for the recorder. The
     * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
     * `NoStreaming` .
     * * `CustomDeliveryTopicAccountId`
     * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
     * use for notifications resides. You must specify a value for this parameter if you use the
     * `UseExistingTopic` notification option.
     * * `CustomDeliveryTopicName`
     * * Description: (Optional) The name of the Amazon SNS topic you want to use for notifications.
     * You must specify a value for this parameter if you use the `UseExistingTopic` notification
     * option.
     * * `RemediationSchedule`
     * * Description: (Optional) A rate expression that defines the schedule for drift remediation.
     * The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and `none` . The
     * default value is " `none` ".
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) The ID of the root of your Organization. This configuration type
     * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
     * OUs in the Organization.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
     * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated on
     * the target instances every 2 weeks. The default value is " `true` ".
     * * `UpdateEc2LaunchAgent`
     * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
     * updated on the target instances every month. The default value is " `false` ".
     * * `CollectInventory`
     * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
     * updated on the target instances every month. The default value is " `true` ".
     * * `ScanInstances`
     * * Description: (Optional) A boolean value that determines whether the target instances are
     * scanned daily for available patches. The default value is " `true` ".
     * * `InstallCloudWatchAgent`
     * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch agent
     * is installed on the target instances. The default value is " `false` ".
     * * `UpdateCloudWatchAgent`
     * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch agent
     * is updated on the target instances every month. The default value is " `false` ".
     * * `IsPolicyAttachAllowed`
     * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
     * policies to instances profiles already associated with the target instances. The default value
     * is " `false` ".
     * * `TargetType`
     * * Description: (Optional) Determines how instances are targeted for local account
     * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
     * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all instances
     * in the account.
     * * `TargetInstances`
     * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
     * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
     * * `TargetTagKey`
     * * Description: (Optional) The tag key assigned to the instances you want to target. You must
     * provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
     * * `TargetTagValue`
     * * Description: (Optional) The value of the tag key assigned to the instances you want to
     * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
     * parameter.
     * * `ResourceGroupName`
     * * Description: (Optional) The name of the resource group associated with the instances you
     * want to target. You must provide a value for this parameter if you specify `ResourceGroups` for
     * the `TargetType` parameter.
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
     * * Description: (Required) A comma separated list of packages you want to install on the
     * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent` .
     * * `RemediationSchedule`
     * * Description: (Optional) A rate expression that defines the schedule for drift remediation.
     * The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and `none` . The
     * default value is " `rate(30 days)` ".
     * * `IsPolicyAttachAllowed`
     * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
     * policies to instances profiles already associated with the target instances. The default value
     * is " `false` ".
     * * `TargetType`
     * * Description: (Optional) Determines how instances are targeted for local account
     * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
     * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all instances
     * in the account.
     * * `TargetInstances`
     * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
     * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
     * * `TargetTagKey`
     * * Description: (Required) The tag key assigned to the instances you want to target. You must
     * provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
     * * `TargetTagValue`
     * * Description: (Required) The value of the tag key assigned to the instances you want to
     * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
     * parameter.
     * * `ResourceGroupName`
     * * Description: (Required) The name of the resource group associated with the instances you
     * want to target. You must provide a value for this parameter if you specify `ResourceGroups` for
     * the `TargetType` parameter.
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
     * * Description: (Required) A name for the patch policy. The value you provide is applied to
     * target Amazon EC2 instances as a tag.
     * * `SelectedPatchBaselines`
     * * Description: (Required) An array of JSON objects containing the information for the patch
     * baselines to include in your patch policy.
     * * `PatchBaselineUseDefault`
     * * Description: (Optional) A boolean value that determines whether the selected patch
     * baselines are all AWS provided.
     * * `ConfigurationOptionsPatchOperation`
     * * Description: (Optional) Determines whether target instances scan for available patches, or
     * scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
     * default value for the parameter is `Scan` .
     * * `ConfigurationOptionsScanValue`
     * * Description: (Optional) A cron expression that is used as the schedule for when instances
     * scan for available patches.
     * * `ConfigurationOptionsInstallValue`
     * * Description: (Optional) A cron expression that is used as the schedule for when instances
     * install available patches.
     * * `ConfigurationOptionsScanNextInterval`
     * * Description: (Optional) A boolean value that determines whether instances should scan for
     * available patches at the next cron interval. The default value is " `false` ".
     * * `ConfigurationOptionsInstallNextInterval`
     * * Description: (Optional) A boolean value that determines whether instances should scan for
     * available patches at the next cron interval. The default value is " `false` ".
     * * `RebootOption`
     * * Description: (Optional) A boolean value that determines whether instances are rebooted
     * after patches are installed. The default value is " `false` ".
     * * `IsPolicyAttachAllowed`
     * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
     * policies to instances profiles already associated with the target instances. The default value
     * is " `false` ".
     * * `OutputLogEnableS3`
     * * Description: (Optional) A boolean value that determines whether command output logs are
     * sent to Amazon S3.
     * * `OutputS3Location`
     * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
     * where you want to store the output details of the request.
     * * `OutputS3BucketRegion`
     * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
     * deliver command output to is located.
     * * `OutputS3BucketName`
     * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
     * command output to.
     * * `OutputS3KeyPrefix`
     * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
     * * `TargetType`
     * * Description: (Optional) Determines how instances are targeted for local account
     * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
     * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all instances
     * in the account.
     * * `TargetInstances`
     * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
     * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
     * * `TargetTagKey`
     * * Description: (Required) The tag key assigned to the instances you want to target. You must
     * provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
     * * `TargetTagValue`
     * * Description: (Required) The value of the tag key assigned to the instances you want to
     * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
     * parameter.
     * * `ResourceGroupName`
     * * Description: (Required) The name of the resource group associated with the instances you
     * want to target. You must provide a value for this parameter if you specify `ResourceGroups` for
     * the `TargetType` parameter.
     * * `TargetAccounts`
     * * Description: (Optional) The ID of the AWS account initiating the configuration deployment.
     * You only need to provide a value for this parameter if you want to deploy the configuration
     * locally. A value must be provided for either `TargetAccounts` or `TargetOrganizationalUnits` .
     * * `TargetOrganizationalUnits`
     * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
     * deploy the configuration to.
     * * `TargetRegions`
     * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
     * configuration to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-parameters)
     */
    public fun parameters(): Any

    /**
     * The type of the Quick Setup configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-type)
     */
    public fun type(): String

    /**
     * The version of the Quick Setup type used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-typeversion)
     */
    public fun typeVersion(): String? = unwrap(this).getTypeVersion()

    /**
     * A builder for [ConfigurationDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the configuration definition.
       */
      public fun id(id: String)

      /**
       * @param localDeploymentAdministrationRoleArn The ARN of the IAM role used to administrate
       * local configuration deployments.
       */
      public fun localDeploymentAdministrationRoleArn(localDeploymentAdministrationRoleArn: String)

      /**
       * @param localDeploymentExecutionRoleName The name of the IAM role used to deploy local
       * configurations.
       */
      public fun localDeploymentExecutionRoleName(localDeploymentExecutionRoleName: String)

      /**
       * @param parameters The parameters for the configuration definition type. 
       * Parameters for configuration definitions vary based the configuration type. The following
       * tables outline the parameters for each configuration type.
       *
       * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target.
       * * `ICalendarString`
       * * Description: (Required) An iCalendar formatted string containing the schedule you want
       * Change Manager to use.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
       * `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
       * `SelectedAggregatorRegion`
       * * Description: (Required) The AWS Region where you want to create the aggregator index.
       * * `ReplaceExistingAggregator`
       * * Description: (Required) A boolean value that determines whether to demote an existing
       * aggregator if it is in a Region that differs from the value you specify for the
       * `SelectedAggregatorRegion` .
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `JobFunction`
       * * Description: (Required) The name for the Change Manager job function.
       * * `PermissionType`
       * * Description: (Optional) Specifies whether you want to use default administrator
       * permissions for the job function role, or provide a custom IAM policy. The valid values are
       * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
       * `CustomerPermissions` .
       * * `CustomPermissions`
       * * Description: (Optional) A JSON string containing the IAM policy you want your job
       * function to use. You must provide a value for this parameter if you specify
       * `CustomPermissions` for the `PermissionType` parameter.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
       * AWS CloudFormation stacks in the account. The default value is " `false` ".
       * * `EnableSnsNotifications`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
       * notifications when an insight is created. The default value is " `true` ".
       * * `EnableSsmOpsItems`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
       * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
       * * `EnableDriftRemediation`
       * * Description: (Optional) A boolean value that determines whether a drift remediation
       * schedule is used. The default value is " `false` ".
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
       * * Description: (Optional) The ID of the delegated administrator account. This parameter is
       * required for Organization deployments.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `none` ".
       * * `CPackNames`
       * * Description: (Required) A comma separated list of AWS Config conformance packs.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
       * * Description: (Optional) A boolean value that determines whether all supported resources
       * are recorded. The default value is " `true` ".
       * * `ResourceTypesToRecord`
       * * Description: (Optional) A comma separated list of resource types you want to record.
       * * `RecordGlobalResourceTypes`
       * * Description: (Optional) A boolean value that determines whether global resources are
       * recorded with all resource configurations. The default value is " `false` ".
       * * `GlobalResourceTypesRegion`
       * * Description: (Optional) Determines the AWS Region where global resources are recorded.
       * * `UseCustomBucket`
       * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
       * is used for delivery. The default value is " `false` ".
       * * `DeliveryBucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * configuration snapshots and configuration history files to.
       * * `DeliveryBucketPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `NotificationOptions`
       * * Description: (Optional) Determines the notification configuration for the recorder. The
       * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
       * `NoStreaming` .
       * * `CustomDeliveryTopicAccountId`
       * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
       * use for notifications resides. You must specify a value for this parameter if you use the
       * `UseExistingTopic` notification option.
       * * `CustomDeliveryTopicName`
       * * Description: (Optional) The name of the Amazon SNS topic you want to use for
       * notifications. You must specify a value for this parameter if you use the `UseExistingTopic`
       * notification option.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `UpdateEc2LaunchAgent`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `false` ".
       * * `CollectInventory`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `true` ".
       * * `ScanInstances`
       * * Description: (Optional) A boolean value that determines whether the target instances are
       * scanned daily for available patches. The default value is " `true` ".
       * * `InstallCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is installed on the target instances. The default value is " `false` ".
       * * `UpdateCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is updated on the target instances every month. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Optional) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Optional) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Optional) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
       * * Description: (Required) A comma separated list of packages you want to install on the
       * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent`
       * .
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `rate(30 days)` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
       * * Description: (Required) A name for the patch policy. The value you provide is applied to
       * target Amazon EC2 instances as a tag.
       * * `SelectedPatchBaselines`
       * * Description: (Required) An array of JSON objects containing the information for the patch
       * baselines to include in your patch policy.
       * * `PatchBaselineUseDefault`
       * * Description: (Optional) A boolean value that determines whether the selected patch
       * baselines are all AWS provided.
       * * `ConfigurationOptionsPatchOperation`
       * * Description: (Optional) Determines whether target instances scan for available patches,
       * or scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
       * default value for the parameter is `Scan` .
       * * `ConfigurationOptionsScanValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * scan for available patches.
       * * `ConfigurationOptionsInstallValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * install available patches.
       * * `ConfigurationOptionsScanNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `ConfigurationOptionsInstallNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `RebootOption`
       * * Description: (Optional) A boolean value that determines whether instances are rebooted
       * after patches are installed. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `OutputLogEnableS3`
       * * Description: (Optional) A boolean value that determines whether command output logs are
       * sent to Amazon S3.
       * * `OutputS3Location`
       * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
       * where you want to store the output details of the request.
       * * `OutputS3BucketRegion`
       * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
       * deliver command output to is located.
       * * `OutputS3BucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * command output to.
       * * `OutputS3KeyPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The parameters for the configuration definition type. 
       * Parameters for configuration definitions vary based the configuration type. The following
       * tables outline the parameters for each configuration type.
       *
       * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target.
       * * `ICalendarString`
       * * Description: (Required) An iCalendar formatted string containing the schedule you want
       * Change Manager to use.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
       * `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
       * `SelectedAggregatorRegion`
       * * Description: (Required) The AWS Region where you want to create the aggregator index.
       * * `ReplaceExistingAggregator`
       * * Description: (Required) A boolean value that determines whether to demote an existing
       * aggregator if it is in a Region that differs from the value you specify for the
       * `SelectedAggregatorRegion` .
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `JobFunction`
       * * Description: (Required) The name for the Change Manager job function.
       * * `PermissionType`
       * * Description: (Optional) Specifies whether you want to use default administrator
       * permissions for the job function role, or provide a custom IAM policy. The valid values are
       * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
       * `CustomerPermissions` .
       * * `CustomPermissions`
       * * Description: (Optional) A JSON string containing the IAM policy you want your job
       * function to use. You must provide a value for this parameter if you specify
       * `CustomPermissions` for the `PermissionType` parameter.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
       * AWS CloudFormation stacks in the account. The default value is " `false` ".
       * * `EnableSnsNotifications`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
       * notifications when an insight is created. The default value is " `true` ".
       * * `EnableSsmOpsItems`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
       * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
       * * `EnableDriftRemediation`
       * * Description: (Optional) A boolean value that determines whether a drift remediation
       * schedule is used. The default value is " `false` ".
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
       * * Description: (Optional) The ID of the delegated administrator account. This parameter is
       * required for Organization deployments.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `none` ".
       * * `CPackNames`
       * * Description: (Required) A comma separated list of AWS Config conformance packs.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
       * * Description: (Optional) A boolean value that determines whether all supported resources
       * are recorded. The default value is " `true` ".
       * * `ResourceTypesToRecord`
       * * Description: (Optional) A comma separated list of resource types you want to record.
       * * `RecordGlobalResourceTypes`
       * * Description: (Optional) A boolean value that determines whether global resources are
       * recorded with all resource configurations. The default value is " `false` ".
       * * `GlobalResourceTypesRegion`
       * * Description: (Optional) Determines the AWS Region where global resources are recorded.
       * * `UseCustomBucket`
       * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
       * is used for delivery. The default value is " `false` ".
       * * `DeliveryBucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * configuration snapshots and configuration history files to.
       * * `DeliveryBucketPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `NotificationOptions`
       * * Description: (Optional) Determines the notification configuration for the recorder. The
       * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
       * `NoStreaming` .
       * * `CustomDeliveryTopicAccountId`
       * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
       * use for notifications resides. You must specify a value for this parameter if you use the
       * `UseExistingTopic` notification option.
       * * `CustomDeliveryTopicName`
       * * Description: (Optional) The name of the Amazon SNS topic you want to use for
       * notifications. You must specify a value for this parameter if you use the `UseExistingTopic`
       * notification option.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `UpdateEc2LaunchAgent`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `false` ".
       * * `CollectInventory`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `true` ".
       * * `ScanInstances`
       * * Description: (Optional) A boolean value that determines whether the target instances are
       * scanned daily for available patches. The default value is " `true` ".
       * * `InstallCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is installed on the target instances. The default value is " `false` ".
       * * `UpdateCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is updated on the target instances every month. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Optional) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Optional) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Optional) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
       * * Description: (Required) A comma separated list of packages you want to install on the
       * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent`
       * .
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `rate(30 days)` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
       * * Description: (Required) A name for the patch policy. The value you provide is applied to
       * target Amazon EC2 instances as a tag.
       * * `SelectedPatchBaselines`
       * * Description: (Required) An array of JSON objects containing the information for the patch
       * baselines to include in your patch policy.
       * * `PatchBaselineUseDefault`
       * * Description: (Optional) A boolean value that determines whether the selected patch
       * baselines are all AWS provided.
       * * `ConfigurationOptionsPatchOperation`
       * * Description: (Optional) Determines whether target instances scan for available patches,
       * or scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
       * default value for the parameter is `Scan` .
       * * `ConfigurationOptionsScanValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * scan for available patches.
       * * `ConfigurationOptionsInstallValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * install available patches.
       * * `ConfigurationOptionsScanNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `ConfigurationOptionsInstallNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `RebootOption`
       * * Description: (Optional) A boolean value that determines whether instances are rebooted
       * after patches are installed. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `OutputLogEnableS3`
       * * Description: (Optional) A boolean value that determines whether command output logs are
       * sent to Amazon S3.
       * * `OutputS3Location`
       * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
       * where you want to store the output details of the request.
       * * `OutputS3BucketRegion`
       * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
       * deliver command output to is located.
       * * `OutputS3BucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * command output to.
       * * `OutputS3KeyPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param type The type of the Quick Setup configuration. 
       */
      public fun type(type: String)

      /**
       * @param typeVersion The version of the Quick Setup type used.
       */
      public fun typeVersion(typeVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty.builder()

      /**
       * @param id The ID of the configuration definition.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param localDeploymentAdministrationRoleArn The ARN of the IAM role used to administrate
       * local configuration deployments.
       */
      override
          fun localDeploymentAdministrationRoleArn(localDeploymentAdministrationRoleArn: String) {
        cdkBuilder.localDeploymentAdministrationRoleArn(localDeploymentAdministrationRoleArn)
      }

      /**
       * @param localDeploymentExecutionRoleName The name of the IAM role used to deploy local
       * configurations.
       */
      override fun localDeploymentExecutionRoleName(localDeploymentExecutionRoleName: String) {
        cdkBuilder.localDeploymentExecutionRoleName(localDeploymentExecutionRoleName)
      }

      /**
       * @param parameters The parameters for the configuration definition type. 
       * Parameters for configuration definitions vary based the configuration type. The following
       * tables outline the parameters for each configuration type.
       *
       * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target.
       * * `ICalendarString`
       * * Description: (Required) An iCalendar formatted string containing the schedule you want
       * Change Manager to use.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
       * `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
       * `SelectedAggregatorRegion`
       * * Description: (Required) The AWS Region where you want to create the aggregator index.
       * * `ReplaceExistingAggregator`
       * * Description: (Required) A boolean value that determines whether to demote an existing
       * aggregator if it is in a Region that differs from the value you specify for the
       * `SelectedAggregatorRegion` .
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `JobFunction`
       * * Description: (Required) The name for the Change Manager job function.
       * * `PermissionType`
       * * Description: (Optional) Specifies whether you want to use default administrator
       * permissions for the job function role, or provide a custom IAM policy. The valid values are
       * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
       * `CustomerPermissions` .
       * * `CustomPermissions`
       * * Description: (Optional) A JSON string containing the IAM policy you want your job
       * function to use. You must provide a value for this parameter if you specify
       * `CustomPermissions` for the `PermissionType` parameter.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
       * AWS CloudFormation stacks in the account. The default value is " `false` ".
       * * `EnableSnsNotifications`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
       * notifications when an insight is created. The default value is " `true` ".
       * * `EnableSsmOpsItems`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
       * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
       * * `EnableDriftRemediation`
       * * Description: (Optional) A boolean value that determines whether a drift remediation
       * schedule is used. The default value is " `false` ".
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
       * * Description: (Optional) The ID of the delegated administrator account. This parameter is
       * required for Organization deployments.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `none` ".
       * * `CPackNames`
       * * Description: (Required) A comma separated list of AWS Config conformance packs.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
       * * Description: (Optional) A boolean value that determines whether all supported resources
       * are recorded. The default value is " `true` ".
       * * `ResourceTypesToRecord`
       * * Description: (Optional) A comma separated list of resource types you want to record.
       * * `RecordGlobalResourceTypes`
       * * Description: (Optional) A boolean value that determines whether global resources are
       * recorded with all resource configurations. The default value is " `false` ".
       * * `GlobalResourceTypesRegion`
       * * Description: (Optional) Determines the AWS Region where global resources are recorded.
       * * `UseCustomBucket`
       * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
       * is used for delivery. The default value is " `false` ".
       * * `DeliveryBucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * configuration snapshots and configuration history files to.
       * * `DeliveryBucketPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `NotificationOptions`
       * * Description: (Optional) Determines the notification configuration for the recorder. The
       * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
       * `NoStreaming` .
       * * `CustomDeliveryTopicAccountId`
       * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
       * use for notifications resides. You must specify a value for this parameter if you use the
       * `UseExistingTopic` notification option.
       * * `CustomDeliveryTopicName`
       * * Description: (Optional) The name of the Amazon SNS topic you want to use for
       * notifications. You must specify a value for this parameter if you use the `UseExistingTopic`
       * notification option.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `UpdateEc2LaunchAgent`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `false` ".
       * * `CollectInventory`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `true` ".
       * * `ScanInstances`
       * * Description: (Optional) A boolean value that determines whether the target instances are
       * scanned daily for available patches. The default value is " `true` ".
       * * `InstallCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is installed on the target instances. The default value is " `false` ".
       * * `UpdateCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is updated on the target instances every month. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Optional) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Optional) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Optional) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
       * * Description: (Required) A comma separated list of packages you want to install on the
       * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent`
       * .
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `rate(30 days)` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
       * * Description: (Required) A name for the patch policy. The value you provide is applied to
       * target Amazon EC2 instances as a tag.
       * * `SelectedPatchBaselines`
       * * Description: (Required) An array of JSON objects containing the information for the patch
       * baselines to include in your patch policy.
       * * `PatchBaselineUseDefault`
       * * Description: (Optional) A boolean value that determines whether the selected patch
       * baselines are all AWS provided.
       * * `ConfigurationOptionsPatchOperation`
       * * Description: (Optional) Determines whether target instances scan for available patches,
       * or scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
       * default value for the parameter is `Scan` .
       * * `ConfigurationOptionsScanValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * scan for available patches.
       * * `ConfigurationOptionsInstallValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * install available patches.
       * * `ConfigurationOptionsScanNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `ConfigurationOptionsInstallNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `RebootOption`
       * * Description: (Optional) A boolean value that determines whether instances are rebooted
       * after patches are installed. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `OutputLogEnableS3`
       * * Description: (Optional) A boolean value that determines whether command output logs are
       * sent to Amazon S3.
       * * `OutputS3Location`
       * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
       * where you want to store the output details of the request.
       * * `OutputS3BucketRegion`
       * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
       * deliver command output to is located.
       * * `OutputS3BucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * command output to.
       * * `OutputS3KeyPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters The parameters for the configuration definition type. 
       * Parameters for configuration definitions vary based the configuration type. The following
       * tables outline the parameters for each configuration type.
       *
       * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target.
       * * `ICalendarString`
       * * Description: (Required) An iCalendar formatted string containing the schedule you want
       * Change Manager to use.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
       * `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
       * `SelectedAggregatorRegion`
       * * Description: (Required) The AWS Region where you want to create the aggregator index.
       * * `ReplaceExistingAggregator`
       * * Description: (Required) A boolean value that determines whether to demote an existing
       * aggregator if it is in a Region that differs from the value you specify for the
       * `SelectedAggregatorRegion` .
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `JobFunction`
       * * Description: (Required) The name for the Change Manager job function.
       * * `PermissionType`
       * * Description: (Optional) Specifies whether you want to use default administrator
       * permissions for the job function role, or provide a custom IAM policy. The valid values are
       * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
       * `CustomerPermissions` .
       * * `CustomPermissions`
       * * Description: (Optional) A JSON string containing the IAM policy you want your job
       * function to use. You must provide a value for this parameter if you specify
       * `CustomPermissions` for the `PermissionType` parameter.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
       * AWS CloudFormation stacks in the account. The default value is " `false` ".
       * * `EnableSnsNotifications`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
       * notifications when an insight is created. The default value is " `true` ".
       * * `EnableSsmOpsItems`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
       * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
       * * `EnableDriftRemediation`
       * * Description: (Optional) A boolean value that determines whether a drift remediation
       * schedule is used. The default value is " `false` ".
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
       * * Description: (Optional) The ID of the delegated administrator account. This parameter is
       * required for Organization deployments.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `none` ".
       * * `CPackNames`
       * * Description: (Required) A comma separated list of AWS Config conformance packs.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
       * * Description: (Optional) A boolean value that determines whether all supported resources
       * are recorded. The default value is " `true` ".
       * * `ResourceTypesToRecord`
       * * Description: (Optional) A comma separated list of resource types you want to record.
       * * `RecordGlobalResourceTypes`
       * * Description: (Optional) A boolean value that determines whether global resources are
       * recorded with all resource configurations. The default value is " `false` ".
       * * `GlobalResourceTypesRegion`
       * * Description: (Optional) Determines the AWS Region where global resources are recorded.
       * * `UseCustomBucket`
       * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
       * is used for delivery. The default value is " `false` ".
       * * `DeliveryBucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * configuration snapshots and configuration history files to.
       * * `DeliveryBucketPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `NotificationOptions`
       * * Description: (Optional) Determines the notification configuration for the recorder. The
       * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
       * `NoStreaming` .
       * * `CustomDeliveryTopicAccountId`
       * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
       * use for notifications resides. You must specify a value for this parameter if you use the
       * `UseExistingTopic` notification option.
       * * `CustomDeliveryTopicName`
       * * Description: (Optional) The name of the Amazon SNS topic you want to use for
       * notifications. You must specify a value for this parameter if you use the `UseExistingTopic`
       * notification option.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `UpdateEc2LaunchAgent`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `false` ".
       * * `CollectInventory`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `true` ".
       * * `ScanInstances`
       * * Description: (Optional) A boolean value that determines whether the target instances are
       * scanned daily for available patches. The default value is " `true` ".
       * * `InstallCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is installed on the target instances. The default value is " `false` ".
       * * `UpdateCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is updated on the target instances every month. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Optional) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Optional) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Optional) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
       * * Description: (Required) A comma separated list of packages you want to install on the
       * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent`
       * .
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `rate(30 days)` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
       * * Description: (Required) A name for the patch policy. The value you provide is applied to
       * target Amazon EC2 instances as a tag.
       * * `SelectedPatchBaselines`
       * * Description: (Required) An array of JSON objects containing the information for the patch
       * baselines to include in your patch policy.
       * * `PatchBaselineUseDefault`
       * * Description: (Optional) A boolean value that determines whether the selected patch
       * baselines are all AWS provided.
       * * `ConfigurationOptionsPatchOperation`
       * * Description: (Optional) Determines whether target instances scan for available patches,
       * or scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
       * default value for the parameter is `Scan` .
       * * `ConfigurationOptionsScanValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * scan for available patches.
       * * `ConfigurationOptionsInstallValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * install available patches.
       * * `ConfigurationOptionsScanNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `ConfigurationOptionsInstallNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `RebootOption`
       * * Description: (Optional) A boolean value that determines whether instances are rebooted
       * after patches are installed. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `OutputLogEnableS3`
       * * Description: (Optional) A boolean value that determines whether command output logs are
       * sent to Amazon S3.
       * * `OutputS3Location`
       * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
       * where you want to store the output details of the request.
       * * `OutputS3BucketRegion`
       * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
       * deliver command output to is located.
       * * `OutputS3BucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * command output to.
       * * `OutputS3KeyPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param type The type of the Quick Setup configuration. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param typeVersion The version of the Quick Setup type used.
       */
      override fun typeVersion(typeVersion: String) {
        cdkBuilder.typeVersion(typeVersion)
      }

      public fun build():
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty,
    ) : CdkObject(cdkObject),
        ConfigurationDefinitionProperty {
      /**
       * The ID of the configuration definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The ARN of the IAM role used to administrate local configuration deployments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-localdeploymentadministrationrolearn)
       */
      override fun localDeploymentAdministrationRoleArn(): String? =
          unwrap(this).getLocalDeploymentAdministrationRoleArn()

      /**
       * The name of the IAM role used to deploy local configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-localdeploymentexecutionrolename)
       */
      override fun localDeploymentExecutionRoleName(): String? =
          unwrap(this).getLocalDeploymentExecutionRoleName()

      /**
       * The parameters for the configuration definition type.
       *
       * Parameters for configuration definitions vary based the configuration type. The following
       * tables outline the parameters for each configuration type.
       *
       * * **OpsCenter (Type: AWS QuickSetupType-SSMOpsCenter)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Scheduler (Type: AWS QuickSetupType-Scheduler)** - - `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target.
       * * `ICalendarString`
       * * Description: (Required) An iCalendar formatted string containing the schedule you want
       * Change Manager to use.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Default Host Management Configuration (Type: AWS QuickSetupType-DHMC)** - -
       * `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Resource Explorer (Type: AWS QuickSetupType-ResourceExplorer)** - -
       * `SelectedAggregatorRegion`
       * * Description: (Required) The AWS Region where you want to create the aggregator index.
       * * `ReplaceExistingAggregator`
       * * Description: (Required) A boolean value that determines whether to demote an existing
       * aggregator if it is in a Region that differs from the value you specify for the
       * `SelectedAggregatorRegion` .
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Change Manager (Type: AWS QuickSetupType-SSMChangeMgr)** - - `DelegatedAccountId`
       * * Description: (Required) The ID of the delegated administrator account.
       * * `JobFunction`
       * * Description: (Required) The name for the Change Manager job function.
       * * `PermissionType`
       * * Description: (Optional) Specifies whether you want to use default administrator
       * permissions for the job function role, or provide a custom IAM policy. The valid values are
       * `CustomPermissions` and `AdminPermissions` . The default value for the parameter is
       * `CustomerPermissions` .
       * * `CustomPermissions`
       * * Description: (Optional) A JSON string containing the IAM policy you want your job
       * function to use. You must provide a value for this parameter if you specify
       * `CustomPermissions` for the `PermissionType` parameter.
       * * `TargetOrganizationalUnits`
       * * Description: (Required) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **DevOps Guru (Type: AWS QuickSetupType-DevOpsGuru)** - - `AnalyseAllResources`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru analyzes all
       * AWS CloudFormation stacks in the account. The default value is " `false` ".
       * * `EnableSnsNotifications`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru sends
       * notifications when an insight is created. The default value is " `true` ".
       * * `EnableSsmOpsItems`
       * * Description: (Optional) A boolean value that determines whether DevOps Guru creates an
       * OpsCenter OpsItem when an insight is created. The default value is " `true` ".
       * * `EnableDriftRemediation`
       * * Description: (Optional) A boolean value that determines whether a drift remediation
       * schedule is used. The default value is " `false` ".
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Conformance Packs (Type: AWS QuickSetupType-CFGCPacks)** - - `DelegatedAccountId`
       * * Description: (Optional) The ID of the delegated administrator account. This parameter is
       * required for Organization deployments.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `none` ".
       * * `CPackNames`
       * * Description: (Required) A comma separated list of AWS Config conformance packs.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **AWS Config Recording (Type: AWS QuickSetupType-CFGRecording)** - - `RecordAllResources`
       * * Description: (Optional) A boolean value that determines whether all supported resources
       * are recorded. The default value is " `true` ".
       * * `ResourceTypesToRecord`
       * * Description: (Optional) A comma separated list of resource types you want to record.
       * * `RecordGlobalResourceTypes`
       * * Description: (Optional) A boolean value that determines whether global resources are
       * recorded with all resource configurations. The default value is " `false` ".
       * * `GlobalResourceTypesRegion`
       * * Description: (Optional) Determines the AWS Region where global resources are recorded.
       * * `UseCustomBucket`
       * * Description: (Optional) A boolean value that determines whether a custom Amazon S3 bucket
       * is used for delivery. The default value is " `false` ".
       * * `DeliveryBucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * configuration snapshots and configuration history files to.
       * * `DeliveryBucketPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `NotificationOptions`
       * * Description: (Optional) Determines the notification configuration for the recorder. The
       * valid values are `NoStreaming` , `UseExistingTopic` , and `CreateTopic` . The default value is
       * `NoStreaming` .
       * * `CustomDeliveryTopicAccountId`
       * * Description: (Optional) The ID of the AWS account where the Amazon SNS topic you want to
       * use for notifications resides. You must specify a value for this parameter if you use the
       * `UseExistingTopic` notification option.
       * * `CustomDeliveryTopicName`
       * * Description: (Optional) The name of the Amazon SNS topic you want to use for
       * notifications. You must specify a value for this parameter if you use the `UseExistingTopic`
       * notification option.
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(7 days)` , `rate(1 days)` , and
       * `none` . The default value is " `none` ".
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) The ID of the root of your Organization. This configuration type
       * doesn't currently support choosing specific OUs. The configuration will be deployed to all the
       * OUs in the Organization.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Host Management (Type: AWS QuickSetupType-SSMHostMgmt)** - - `UpdateSSMAgent`
       * * Description: (Optional) A boolean value that determines whether the SSM Agent is updated
       * on the target instances every 2 weeks. The default value is " `true` ".
       * * `UpdateEc2LaunchAgent`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `false` ".
       * * `CollectInventory`
       * * Description: (Optional) A boolean value that determines whether the EC2 Launch agent is
       * updated on the target instances every month. The default value is " `true` ".
       * * `ScanInstances`
       * * Description: (Optional) A boolean value that determines whether the target instances are
       * scanned daily for available patches. The default value is " `true` ".
       * * `InstallCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is installed on the target instances. The default value is " `false` ".
       * * `UpdateCloudWatchAgent`
       * * Description: (Optional) A boolean value that determines whether the Amazon CloudWatch
       * agent is updated on the target instances every month. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Optional) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Optional) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Optional) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Distributor (Type: AWS QuickSetupType-Distributor)** - - `PackagesToInstall`
       * * Description: (Required) A comma separated list of packages you want to install on the
       * target instances. The valid values are `AWSEFSTools` , `AWSCWAgent` , and `AWSEC2LaunchAgent`
       * .
       * * `RemediationSchedule`
       * * Description: (Optional) A rate expression that defines the schedule for drift
       * remediation. The valid values are `rate(30 days)` , `rate(14 days)` , `rate(2 days)` , and
       * `none` . The default value is " `rate(30 days)` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       * * **Patch Policy (Type: AWS QuickSetupType-PatchPolicy)** - - `PatchPolicyName`
       * * Description: (Required) A name for the patch policy. The value you provide is applied to
       * target Amazon EC2 instances as a tag.
       * * `SelectedPatchBaselines`
       * * Description: (Required) An array of JSON objects containing the information for the patch
       * baselines to include in your patch policy.
       * * `PatchBaselineUseDefault`
       * * Description: (Optional) A boolean value that determines whether the selected patch
       * baselines are all AWS provided.
       * * `ConfigurationOptionsPatchOperation`
       * * Description: (Optional) Determines whether target instances scan for available patches,
       * or scan and install available patches. The valid values are `Scan` and `ScanAndInstall` . The
       * default value for the parameter is `Scan` .
       * * `ConfigurationOptionsScanValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * scan for available patches.
       * * `ConfigurationOptionsInstallValue`
       * * Description: (Optional) A cron expression that is used as the schedule for when instances
       * install available patches.
       * * `ConfigurationOptionsScanNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `ConfigurationOptionsInstallNextInterval`
       * * Description: (Optional) A boolean value that determines whether instances should scan for
       * available patches at the next cron interval. The default value is " `false` ".
       * * `RebootOption`
       * * Description: (Optional) A boolean value that determines whether instances are rebooted
       * after patches are installed. The default value is " `false` ".
       * * `IsPolicyAttachAllowed`
       * * Description: (Optional) A boolean value that determines whether Quick Setup attaches
       * policies to instances profiles already associated with the target instances. The default value
       * is " `false` ".
       * * `OutputLogEnableS3`
       * * Description: (Optional) A boolean value that determines whether command output logs are
       * sent to Amazon S3.
       * * `OutputS3Location`
       * * Description: (Optional) A JSON string containing information about the Amazon S3 bucket
       * where you want to store the output details of the request.
       * * `OutputS3BucketRegion`
       * * Description: (Optional) The AWS Region where the Amazon S3 bucket you want AWS Config to
       * deliver command output to is located.
       * * `OutputS3BucketName`
       * * Description: (Optional) The name of the Amazon S3 bucket you want AWS Config to deliver
       * command output to.
       * * `OutputS3KeyPrefix`
       * * Description: (Optional) The key prefix you want to use in the custom Amazon S3 bucket.
       * * `TargetType`
       * * Description: (Optional) Determines how instances are targeted for local account
       * deployments. Don't specify a value for this parameter if you're deploying to OUs. The valid
       * values are `*` , `InstanceIds` , `ResourceGroups` , and `Tags` . Use `*` to target all
       * instances in the account.
       * * `TargetInstances`
       * * Description: (Optional) A comma separated list of instance IDs. You must provide a value
       * for this parameter if you specify `InstanceIds` for the `TargetType` parameter.
       * * `TargetTagKey`
       * * Description: (Required) The tag key assigned to the instances you want to target. You
       * must provide a value for this parameter if you specify `Tags` for the `TargetType` parameter.
       * * `TargetTagValue`
       * * Description: (Required) The value of the tag key assigned to the instances you want to
       * target. You must provide a value for this parameter if you specify `Tags` for the `TargetType`
       * parameter.
       * * `ResourceGroupName`
       * * Description: (Required) The name of the resource group associated with the instances you
       * want to target. You must provide a value for this parameter if you specify `ResourceGroups`
       * for the `TargetType` parameter.
       * * `TargetAccounts`
       * * Description: (Optional) The ID of the AWS account initiating the configuration
       * deployment. You only need to provide a value for this parameter if you want to deploy the
       * configuration locally. A value must be provided for either `TargetAccounts` or
       * `TargetOrganizationalUnits` .
       * * `TargetOrganizationalUnits`
       * * Description: (Optional) A comma separated list of organizational units (OUs) you want to
       * deploy the configuration to.
       * * `TargetRegions`
       * * Description: (Required) A comma separated list of AWS Regions you want to deploy the
       * configuration to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-parameters)
       */
      override fun parameters(): Any = unwrap(this).getParameters()

      /**
       * The type of the Quick Setup configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The version of the Quick Setup type used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-configurationdefinition.html#cfn-ssmquicksetup-configurationmanager-configurationdefinition-typeversion)
       */
      override fun typeVersion(): String? = unwrap(this).getTypeVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty):
          ConfigurationDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfigurationDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationDefinitionProperty):
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.ConfigurationDefinitionProperty
    }
  }

  /**
   * A summarized description of the status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmquicksetup.*;
   * StatusSummaryProperty statusSummaryProperty = StatusSummaryProperty.builder()
   * .lastUpdatedAt("lastUpdatedAt")
   * .statusType("statusType")
   * // the properties below are optional
   * .status("status")
   * .statusDetails(Map.of(
   * "statusDetailsKey", "statusDetails"))
   * .statusMessage("statusMessage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html)
   */
  public interface StatusSummaryProperty {
    /**
     * The datetime stamp when the status was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-lastupdatedat)
     */
    public fun lastUpdatedAt(): String

    /**
     * The current status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * Details about the status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statusdetails)
     */
    public fun statusDetails(): Any? = unwrap(this).getStatusDetails()

    /**
     * When applicable, returns an informational message relevant to the current status and status
     * type of the status summary object.
     *
     * We don't recommend implementing parsing logic around this value since the messages returned
     * can vary in format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statusmessage)
     */
    public fun statusMessage(): String? = unwrap(this).getStatusMessage()

    /**
     * The type of a status summary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statustype)
     */
    public fun statusType(): String

    /**
     * A builder for [StatusSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lastUpdatedAt The datetime stamp when the status was last updated. 
       */
      public fun lastUpdatedAt(lastUpdatedAt: String)

      /**
       * @param status The current status.
       */
      public fun status(status: String)

      /**
       * @param statusDetails Details about the status.
       */
      public fun statusDetails(statusDetails: IResolvable)

      /**
       * @param statusDetails Details about the status.
       */
      public fun statusDetails(statusDetails: Map<String, String>)

      /**
       * @param statusMessage When applicable, returns an informational message relevant to the
       * current status and status type of the status summary object.
       * We don't recommend implementing parsing logic around this value since the messages returned
       * can vary in format.
       */
      public fun statusMessage(statusMessage: String)

      /**
       * @param statusType The type of a status summary. 
       */
      public fun statusType(statusType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty.Builder
          =
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty.builder()

      /**
       * @param lastUpdatedAt The datetime stamp when the status was last updated. 
       */
      override fun lastUpdatedAt(lastUpdatedAt: String) {
        cdkBuilder.lastUpdatedAt(lastUpdatedAt)
      }

      /**
       * @param status The current status.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param statusDetails Details about the status.
       */
      override fun statusDetails(statusDetails: IResolvable) {
        cdkBuilder.statusDetails(statusDetails.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param statusDetails Details about the status.
       */
      override fun statusDetails(statusDetails: Map<String, String>) {
        cdkBuilder.statusDetails(statusDetails)
      }

      /**
       * @param statusMessage When applicable, returns an informational message relevant to the
       * current status and status type of the status summary object.
       * We don't recommend implementing parsing logic around this value since the messages returned
       * can vary in format.
       */
      override fun statusMessage(statusMessage: String) {
        cdkBuilder.statusMessage(statusMessage)
      }

      /**
       * @param statusType The type of a status summary. 
       */
      override fun statusType(statusType: String) {
        cdkBuilder.statusType(statusType)
      }

      public fun build():
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty,
    ) : CdkObject(cdkObject),
        StatusSummaryProperty {
      /**
       * The datetime stamp when the status was last updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-lastupdatedat)
       */
      override fun lastUpdatedAt(): String = unwrap(this).getLastUpdatedAt()

      /**
       * The current status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * Details about the status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statusdetails)
       */
      override fun statusDetails(): Any? = unwrap(this).getStatusDetails()

      /**
       * When applicable, returns an informational message relevant to the current status and status
       * type of the status summary object.
       *
       * We don't recommend implementing parsing logic around this value since the messages returned
       * can vary in format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statusmessage)
       */
      override fun statusMessage(): String? = unwrap(this).getStatusMessage()

      /**
       * The type of a status summary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmquicksetup-configurationmanager-statussummary.html#cfn-ssmquicksetup-configurationmanager-statussummary-statustype)
       */
      override fun statusType(): String = unwrap(this).getStatusType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatusSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty):
          StatusSummaryProperty = CdkObjectWrappers.wrap(cdkObject) as? StatusSummaryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusSummaryProperty):
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmquicksetup.CfnConfigurationManager.StatusSummaryProperty
    }
  }
}
