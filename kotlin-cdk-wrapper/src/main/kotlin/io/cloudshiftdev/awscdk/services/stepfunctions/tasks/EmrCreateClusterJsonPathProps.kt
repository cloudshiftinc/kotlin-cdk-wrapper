@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.QueryLanguage
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateJsonPathBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for calling an AWS service's API action using JSONPath from your state machine across
 * regions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Object assign;
 * ConfigurationProperty configurationProperty_;
 * Object resultSelector;
 * Role role;
 * Size size;
 * TaskRole taskRole;
 * Timeout timeout;
 * EmrCreateClusterJsonPathProps emrCreateClusterJsonPathProps =
 * EmrCreateClusterJsonPathProps.builder()
 * .instances(InstancesConfigProperty.builder()
 * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
 * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
 * .ec2KeyName("ec2KeyName")
 * .ec2SubnetId("ec2SubnetId")
 * .ec2SubnetIds(List.of("ec2SubnetIds"))
 * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
 * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
 * .hadoopVersion("hadoopVersion")
 * .instanceCount(123)
 * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
 * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
 * // the properties below are optional
 * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .bidPrice("bidPrice")
 * .bidPriceAsPercentageOfOnDemandPrice(123)
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurations(List.of(configurationProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .volumeSize(size)
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
 * // the properties below are optional
 * .iops(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .weightedCapacity(123)
 * .build()))
 * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
 * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
 * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
 * // the properties below are optional
 * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
 * .blockDurationMinutes(123)
 * .timeout(Duration.minutes(30))
 * .timeoutDurationMinutes(123)
 * .build())
 * .build())
 * .name("name")
 * .targetOnDemandCapacity(123)
 * .targetSpotCapacity(123)
 * .build()))
 * .instanceGroups(List.of(InstanceGroupConfigProperty.builder()
 * .instanceCount(123)
 * .instanceRole(EmrCreateCluster.getInstanceRoleType().MASTER)
 * .instanceType("instanceType")
 * // the properties below are optional
 * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
 * .constraints(ScalingConstraintsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .rules(List.of(ScalingRuleProperty.builder()
 * .action(ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
 * .metricName("metricName")
 * .period(Duration.minutes(30))
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
 * .threshold(123)
 * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .bidPrice("bidPrice")
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurations(List.of(configurationProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .volumeSize(size)
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
 * // the properties below are optional
 * .iops(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
 * .name("name")
 * .build()))
 * .masterInstanceType("masterInstanceType")
 * .placement(PlacementTypeProperty.builder()
 * .availabilityZone("availabilityZone")
 * .availabilityZones(List.of("availabilityZones"))
 * .build())
 * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
 * .slaveInstanceType("slaveInstanceType")
 * .terminationProtected(false)
 * .build())
 * .name("name")
 * // the properties below are optional
 * .additionalInfo("additionalInfo")
 * .applications(List.of(ApplicationConfigProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .additionalInfo(Map.of(
 * "additionalInfoKey", "additionalInfo"))
 * .args(List.of("args"))
 * .version("version")
 * .build()))
 * .assign(Map.of(
 * "assignKey", assign))
 * .autoScalingRole(role)
 * .autoTerminationPolicyIdleTimeout(Duration.minutes(30))
 * .bootstrapActions(List.of(BootstrapActionConfigProperty.builder()
 * .name("name")
 * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build())
 * .build()))
 * .clusterRole(role)
 * .comment("comment")
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurations(List.of(configurationProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .credentials(Credentials.builder()
 * .role(taskRole)
 * .build())
 * .customAmiId("customAmiId")
 * .ebsRootVolumeSize(size)
 * .heartbeat(Duration.minutes(30))
 * .heartbeatTimeout(timeout)
 * .inputPath("inputPath")
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .kerberosAttributes(KerberosAttributesProperty.builder()
 * .realm("realm")
 * // the properties below are optional
 * .adDomainJoinPassword("adDomainJoinPassword")
 * .adDomainJoinUser("adDomainJoinUser")
 * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
 * .kdcAdminPassword("kdcAdminPassword")
 * .build())
 * .logUri("logUri")
 * .outputPath("outputPath")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .releaseLabel("releaseLabel")
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .scaleDownBehavior(EmrCreateCluster.getEmrClusterScaleDownBehavior().TERMINATE_AT_INSTANCE_HOUR)
 * .securityConfiguration("securityConfiguration")
 * .serviceRole(role)
 * .stateName("stateName")
 * .stepConcurrencyLevel(123)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .taskTimeout(timeout)
 * .timeout(Duration.minutes(30))
 * .visibleToAllUsers(false)
 * .build();
 * ```
 */
public interface EmrCreateClusterJsonPathProps : TaskStateJsonPathBaseProps {
  /**
   * A JSON string for selecting additional features.
   *
   * Default: - None
   */
  public fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  /**
   * A case-insensitive list of applications for Amazon EMR to install and configure when launching
   * the cluster.
   *
   * Default: - EMR selected default
   */
  public fun applications(): List<EmrCreateCluster.ApplicationConfigProperty> =
      unwrap(this).getApplications()?.map(EmrCreateCluster.ApplicationConfigProperty::wrap) ?:
      emptyList()

  /**
   * An IAM role for automatic scaling policies.
   *
   * Default: - A role will be created.
   */
  public fun autoScalingRole(): IRole? = unwrap(this).getAutoScalingRole()?.let(IRole::wrap)

  /**
   * The amount of idle time after which the cluster automatically terminates.
   *
   * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
   *
   * Default: - No timeout
   */
  public fun autoTerminationPolicyIdleTimeout(): Duration? =
      unwrap(this).getAutoTerminationPolicyIdleTimeout()?.let(Duration::wrap)

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   *
   * Default: - None
   */
  public fun bootstrapActions(): List<EmrCreateCluster.BootstrapActionConfigProperty> =
      unwrap(this).getBootstrapActions()?.map(EmrCreateCluster.BootstrapActionConfigProperty::wrap)
      ?: emptyList()

  /**
   * Also called instance profile and EC2 role.
   *
   * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
   *
   * This attribute has been renamed from jobFlowRole to clusterRole to align with other
   * ERM/StepFunction integration parameters.
   *
   * Default: - * A Role will be created
   */
  public fun clusterRole(): IRole? = unwrap(this).getClusterRole()?.let(IRole::wrap)

  /**
   * The list of configurations supplied for the EMR cluster you are creating.
   *
   * Default: - None
   */
  public fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
      unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
      emptyList()

  /**
   * The ID of a custom Amazon EBS-backed Linux AMI.
   *
   * Default: - None
   */
  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  /**
   * The size of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
   *
   * Default: - EMR selected default
   */
  public fun ebsRootVolumeSize(): Size? = unwrap(this).getEbsRootVolumeSize()?.let(Size::wrap)

  /**
   * A specification of the number and type of Amazon EC2 instances.
   */
  public fun instances(): EmrCreateCluster.InstancesConfigProperty

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   *
   * Default: - None
   */
  public fun kerberosAttributes(): EmrCreateCluster.KerberosAttributesProperty? =
      unwrap(this).getKerberosAttributes()?.let(EmrCreateCluster.KerberosAttributesProperty::wrap)

  /**
   * The location in Amazon S3 to write the log files of the job flow.
   *
   * Default: - None
   */
  public fun logUri(): String? = unwrap(this).getLogUri()

  /**
   * The Name of the Cluster.
   */
  public fun name(): String

  /**
   * The Amazon EMR release label, which determines the version of open-source application packages
   * installed on the cluster.
   *
   * Default: - EMR selected default
   */
  public fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  /**
   * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in
   * activity occurs or an instance group is resized.
   *
   * Default: - EMR selected default
   */
  public fun scaleDownBehavior(): EmrCreateCluster.EmrClusterScaleDownBehavior? =
      unwrap(this).getScaleDownBehavior()?.let(EmrCreateCluster.EmrClusterScaleDownBehavior::wrap)

  /**
   * The name of a security configuration to apply to the cluster.
   *
   * Default: - None
   */
  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your
   * behalf.
   *
   * Default: - A role will be created that Amazon EMR service can assume.
   */
  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  /**
   * Specifies the step concurrency level to allow multiple steps to run in parallel.
   *
   * Requires EMR release label 5.28.0 or above.
   * Must be in range [1, 256].
   *
   * Default: 1 - no step concurrency allowed
   */
  public fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  /**
   * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
   *
   * Default: - None
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A value of true indicates that all IAM users in the AWS account can perform cluster actions if
   * they have the proper IAM policy permissions.
   *
   * Default: true
   */
  public fun visibleToAllUsers(): Boolean? = unwrap(this).getVisibleToAllUsers()

  /**
   * A builder for [EmrCreateClusterJsonPathProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public fun additionalInfo(additionalInfo: String)

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster.
     */
    public fun applications(applications: List<EmrCreateCluster.ApplicationConfigProperty>)

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster.
     */
    public fun applications(vararg applications: EmrCreateCluster.ApplicationConfigProperty)

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param autoScalingRole An IAM role for automatic scaling policies.
     */
    public fun autoScalingRole(autoScalingRole: IRole)

    /**
     * @param autoTerminationPolicyIdleTimeout The amount of idle time after which the cluster
     * automatically terminates.
     * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     */
    public fun autoTerminationPolicyIdleTimeout(autoTerminationPolicyIdleTimeout: Duration)

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    public
        fun bootstrapActions(bootstrapActions: List<EmrCreateCluster.BootstrapActionConfigProperty>)

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    public fun bootstrapActions(vararg
        bootstrapActions: EmrCreateCluster.BootstrapActionConfigProperty)

    /**
     * @param clusterRole Also called instance profile and EC2 role.
     * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     */
    public fun clusterRole(clusterRole: IRole)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating.
     */
    public fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>)

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating.
     */
    public fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials)

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("747f564eaa3a507569f0bca960c22e8eb41fcc33c745a0c62ea51da3f9c2c127")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * @param customAmiId The ID of a custom Amazon EBS-backed Linux AMI.
     */
    public fun customAmiId(customAmiId: String)

    /**
     * @param ebsRootVolumeSize The size of the EBS root device volume of the Linux AMI that is used
     * for each EC2 instance.
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size)

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty)

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e4ace319772bb64b7e7de0f6a9bba8c7ab7b3b272d637db2ee796f8bfa1513")
    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit)

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     */
    public fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty)

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa575fe6ebb85969374bb38027eabb3282a26794db5ff25a476efe38672495fe")
    public
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty.Builder.() -> Unit)

    /**
     * @param logUri The location in Amazon S3 to write the log files of the job flow.
     */
    public fun logUri(logUri: String)

    /**
     * @param name The Name of the Cluster. 
     */
    public fun name(name: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster.
     */
    public fun releaseLabel(releaseLabel: String)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param scaleDownBehavior Specifies the way that individual Amazon EC2 instances terminate
     * when an automatic scale-in activity occurs or an instance group is resized.
     */
    public fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior)

    /**
     * @param securityConfiguration The name of a security configuration to apply to the cluster.
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param stepConcurrencyLevel Specifies the step concurrency level to allow multiple steps to
     * run in parallel.
     * Requires EMR release label 5.28.0 or above.
     * Must be in range [1, 256].
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    /**
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * @param visibleToAllUsers A value of true indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions.
     */
    public fun visibleToAllUsers(visibleToAllUsers: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps.builder()

    /**
     * @param additionalInfo A JSON string for selecting additional features.
     */
    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster.
     */
    override fun applications(applications: List<EmrCreateCluster.ApplicationConfigProperty>) {
      cdkBuilder.applications(applications.map(EmrCreateCluster.ApplicationConfigProperty.Companion::unwrap))
    }

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster.
     */
    override fun applications(vararg applications: EmrCreateCluster.ApplicationConfigProperty): Unit
        = applications(applications.toList())

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param autoScalingRole An IAM role for automatic scaling policies.
     */
    override fun autoScalingRole(autoScalingRole: IRole) {
      cdkBuilder.autoScalingRole(autoScalingRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param autoTerminationPolicyIdleTimeout The amount of idle time after which the cluster
     * automatically terminates.
     * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     */
    override fun autoTerminationPolicyIdleTimeout(autoTerminationPolicyIdleTimeout: Duration) {
      cdkBuilder.autoTerminationPolicyIdleTimeout(autoTerminationPolicyIdleTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    override
        fun bootstrapActions(bootstrapActions: List<EmrCreateCluster.BootstrapActionConfigProperty>) {
      cdkBuilder.bootstrapActions(bootstrapActions.map(EmrCreateCluster.BootstrapActionConfigProperty.Companion::unwrap))
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    override fun bootstrapActions(vararg
        bootstrapActions: EmrCreateCluster.BootstrapActionConfigProperty): Unit =
        bootstrapActions(bootstrapActions.toList())

    /**
     * @param clusterRole Also called instance profile and EC2 role.
     * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     */
    override fun clusterRole(clusterRole: IRole) {
      cdkBuilder.clusterRole(clusterRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating.
     */
    override fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
      cdkBuilder.configurations(configurations.map(EmrCreateCluster.ConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating.
     */
    override fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty): Unit
        = configurations(configurations.toList())

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials.Companion::unwrap))
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task.
     * This enables cross-account resource invocations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("747f564eaa3a507569f0bca960c22e8eb41fcc33c745a0c62ea51da3f9c2c127")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * @param customAmiId The ID of a custom Amazon EBS-backed Linux AMI.
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsRootVolumeSize The size of the EBS root device volume of the Linux AMI that is used
     * for each EC2 instance.
     */
    override fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize.let(Size.Companion::unwrap))
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration.Companion::unwrap))
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: EmrCreateCluster.InstancesConfigProperty) {
      cdkBuilder.instances(instances.let(EmrCreateCluster.InstancesConfigProperty.Companion::unwrap))
    }

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e4ace319772bb64b7e7de0f6a9bba8c7ab7b3b272d637db2ee796f8bfa1513")
    override fun instances(instances: EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit):
        Unit = instances(EmrCreateCluster.InstancesConfigProperty(instances))

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language.
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern.Companion::unwrap))
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     */
    override
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(EmrCreateCluster.KerberosAttributesProperty.Companion::unwrap))
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa575fe6ebb85969374bb38027eabb3282a26794db5ff25a476efe38672495fe")
    override
        fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(EmrCreateCluster.KerberosAttributesProperty(kerberosAttributes))

    /**
     * @param logUri The location in Amazon S3 to write the log files of the job flow.
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * @param name The Name of the Cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster.
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param scaleDownBehavior Specifies the way that individual Amazon EC2 instances terminate
     * when an automatic scale-in activity occurs or an instance group is resized.
     */
    override
        fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior.let(EmrCreateCluster.EmrClusterScaleDownBehavior.Companion::unwrap))
    }

    /**
     * @param securityConfiguration The name of a security configuration to apply to the cluster.
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param stepConcurrencyLevel Specifies the step concurrency level to allow multiple steps to
     * run in parallel.
     * Requires EMR release label 5.28.0 or above.
     * Must be in range [1, 256].
     */
    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param taskTimeout Timeout for the task.
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param visibleToAllUsers A value of true indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions.
     */
    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps,
  ) : CdkObject(cdkObject),
      EmrCreateClusterJsonPathProps {
    /**
     * A JSON string for selecting additional features.
     *
     * Default: - None
     */
    override fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

    /**
     * A case-insensitive list of applications for Amazon EMR to install and configure when
     * launching the cluster.
     *
     * Default: - EMR selected default
     */
    override fun applications(): List<EmrCreateCluster.ApplicationConfigProperty> =
        unwrap(this).getApplications()?.map(EmrCreateCluster.ApplicationConfigProperty::wrap) ?:
        emptyList()

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * An IAM role for automatic scaling policies.
     *
     * Default: - A role will be created.
     */
    override fun autoScalingRole(): IRole? = unwrap(this).getAutoScalingRole()?.let(IRole::wrap)

    /**
     * The amount of idle time after which the cluster automatically terminates.
     *
     * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     *
     * Default: - No timeout
     */
    override fun autoTerminationPolicyIdleTimeout(): Duration? =
        unwrap(this).getAutoTerminationPolicyIdleTimeout()?.let(Duration::wrap)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * Default: - None
     */
    override fun bootstrapActions(): List<EmrCreateCluster.BootstrapActionConfigProperty> =
        unwrap(this).getBootstrapActions()?.map(EmrCreateCluster.BootstrapActionConfigProperty::wrap)
        ?: emptyList()

    /**
     * Also called instance profile and EC2 role.
     *
     * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     *
     * Default: - * A Role will be created
     */
    override fun clusterRole(): IRole? = unwrap(this).getClusterRole()?.let(IRole::wrap)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The list of configurations supplied for the EMR cluster you are creating.
     *
     * Default: - None
     */
    override fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
        emptyList()

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     */
    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    /**
     * The ID of a custom Amazon EBS-backed Linux AMI.
     *
     * Default: - None
     */
    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * The size of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *
     * Default: - EMR selected default
     */
    override fun ebsRootVolumeSize(): Size? = unwrap(this).getEbsRootVolumeSize()?.let(Size::wrap)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * A specification of the number and type of Amazon EC2 instances.
     */
    override fun instances(): EmrCreateCluster.InstancesConfigProperty =
        unwrap(this).getInstances().let(EmrCreateCluster.InstancesConfigProperty::wrap)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     */
    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * Default: - None
     */
    override fun kerberosAttributes(): EmrCreateCluster.KerberosAttributesProperty? =
        unwrap(this).getKerberosAttributes()?.let(EmrCreateCluster.KerberosAttributesProperty::wrap)

    /**
     * The location in Amazon S3 to write the log files of the job flow.
     *
     * Default: - None
     */
    override fun logUri(): String? = unwrap(this).getLogUri()

    /**
     * The Name of the Cluster.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Default: - EMR selected default
     */
    override fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in
     * activity occurs or an instance group is resized.
     *
     * Default: - EMR selected default
     */
    override fun scaleDownBehavior(): EmrCreateCluster.EmrClusterScaleDownBehavior? =
        unwrap(this).getScaleDownBehavior()?.let(EmrCreateCluster.EmrClusterScaleDownBehavior::wrap)

    /**
     * The name of a security configuration to apply to the cluster.
     *
     * Default: - None
     */
    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your
     * behalf.
     *
     * Default: - A role will be created that Amazon EMR service can assume.
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Specifies the step concurrency level to allow multiple steps to run in parallel.
     *
     * Requires EMR release label 5.28.0 or above.
     * Must be in range [1, 256].
     *
     * Default: 1 - no step concurrency allowed
     */
    override fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     *
     * Default: - None
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     */
    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * A value of true indicates that all IAM users in the AWS account can perform cluster actions
     * if they have the proper IAM policy permissions.
     *
     * Default: true
     */
    override fun visibleToAllUsers(): Boolean? = unwrap(this).getVisibleToAllUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrCreateClusterJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps):
        EmrCreateClusterJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as?
        EmrCreateClusterJsonPathProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrCreateClusterJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterJsonPathProps
  }
}
