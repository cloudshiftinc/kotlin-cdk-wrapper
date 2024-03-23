@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EMR::Cluster` resource specifies an Amazon EMR cluster.
 *
 * This cluster is a collection of Amazon EC2 instances that run open source big data frameworks and
 * applications to process and analyze vast amounts of data. For more information, see the [Amazon EMR
 * Management Guide](https://docs.aws.amazon.com//emr/latest/ManagementGuide/) .
 *
 * Amazon EMR now supports launching task instance groups and task instance fleets as part of the
 * `AWS::EMR::Cluster` resource. This can be done by using the `JobFlowInstancesConfig` property type's
 * `TaskInstanceGroups` and `TaskInstanceFleets` subproperties. Using these subproperties reduces
 * delays in provisioning task nodes compared to specifying task nodes with the
 * `AWS::EMR::InstanceGroupConfig` and `AWS::EMR::InstanceFleetConfig` resources. Please refer to the
 * examples at the bottom of this page to learn how to use these subproperties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * Object additionalInfo;
 * ConfigurationProperty configurationProperty_;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .instances(JobFlowInstancesConfigProperty.builder()
 * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
 * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
 * .coreInstanceFleet(InstanceFleetConfigProperty.builder()
 * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .bidPrice("bidPrice")
 * .bidPriceAsPercentageOfOnDemandPrice(123)
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
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
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build())
 * .build())
 * .name("name")
 * .targetOnDemandCapacity(123)
 * .targetSpotCapacity(123)
 * .build())
 * .coreInstanceGroup(InstanceGroupConfigProperty.builder()
 * .instanceCount(123)
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
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricName("metricName")
 * .period(123)
 * .threshold(123)
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .bidPrice("bidPrice")
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .market("market")
 * .name("name")
 * .build())
 * .ec2KeyName("ec2KeyName")
 * .ec2SubnetId("ec2SubnetId")
 * .ec2SubnetIds(List.of("ec2SubnetIds"))
 * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
 * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
 * .hadoopVersion("hadoopVersion")
 * .keepJobFlowAliveWhenNoSteps(false)
 * .masterInstanceFleet(InstanceFleetConfigProperty.builder()
 * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .bidPrice("bidPrice")
 * .bidPriceAsPercentageOfOnDemandPrice(123)
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
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
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build())
 * .build())
 * .name("name")
 * .targetOnDemandCapacity(123)
 * .targetSpotCapacity(123)
 * .build())
 * .masterInstanceGroup(InstanceGroupConfigProperty.builder()
 * .instanceCount(123)
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
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricName("metricName")
 * .period(123)
 * .threshold(123)
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .bidPrice("bidPrice")
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .market("market")
 * .name("name")
 * .build())
 * .placement(PlacementTypeProperty.builder()
 * .availabilityZone("availabilityZone")
 * .build())
 * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
 * .taskInstanceFleets(List.of(InstanceFleetConfigProperty.builder()
 * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .bidPrice("bidPrice")
 * .bidPriceAsPercentageOfOnDemandPrice(123)
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
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
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build())
 * .build())
 * .name("name")
 * .targetOnDemandCapacity(123)
 * .targetSpotCapacity(123)
 * .build()))
 * .taskInstanceGroups(List.of(InstanceGroupConfigProperty.builder()
 * .instanceCount(123)
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
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricName("metricName")
 * .period(123)
 * .threshold(123)
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .bidPrice("bidPrice")
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsConfiguration(EbsConfigurationProperty.builder()
 * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .throughput(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build()))
 * .ebsOptimized(false)
 * .build())
 * .market("market")
 * .name("name")
 * .build()))
 * .terminationProtected(false)
 * .unhealthyNodeReplacement(false)
 * .build())
 * .jobFlowRole("jobFlowRole")
 * .name("name")
 * .serviceRole("serviceRole")
 * // the properties below are optional
 * .additionalInfo(additionalInfo)
 * .applications(List.of(ApplicationProperty.builder()
 * .additionalInfo(Map.of(
 * "additionalInfoKey", "additionalInfo"))
 * .args(List.of("args"))
 * .name("name")
 * .version("version")
 * .build()))
 * .autoScalingRole("autoScalingRole")
 * .autoTerminationPolicy(AutoTerminationPolicyProperty.builder()
 * .idleTimeout(123)
 * .build())
 * .bootstrapActions(List.of(BootstrapActionConfigProperty.builder()
 * .name("name")
 * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .args(List.of("args"))
 * .build())
 * .build()))
 * .configurations(List.of(ConfigurationProperty.builder()
 * .classification("classification")
 * .configurationProperties(Map.of(
 * "configurationPropertiesKey", "configurationProperties"))
 * .configurations(List.of(configurationProperty_))
 * .build()))
 * .customAmiId("customAmiId")
 * .ebsRootVolumeIops(123)
 * .ebsRootVolumeSize(123)
 * .ebsRootVolumeThroughput(123)
 * .kerberosAttributes(KerberosAttributesProperty.builder()
 * .kdcAdminPassword("kdcAdminPassword")
 * .realm("realm")
 * // the properties below are optional
 * .adDomainJoinPassword("adDomainJoinPassword")
 * .adDomainJoinUser("adDomainJoinUser")
 * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
 * .build())
 * .logEncryptionKmsKeyId("logEncryptionKmsKeyId")
 * .logUri("logUri")
 * .managedScalingPolicy(ManagedScalingPolicyProperty.builder()
 * .computeLimits(ComputeLimitsProperty.builder()
 * .maximumCapacityUnits(123)
 * .minimumCapacityUnits(123)
 * .unitType("unitType")
 * // the properties below are optional
 * .maximumCoreCapacityUnits(123)
 * .maximumOnDemandCapacityUnits(123)
 * .build())
 * .build())
 * .osReleaseLabel("osReleaseLabel")
 * .placementGroupConfigs(List.of(PlacementGroupConfigProperty.builder()
 * .instanceRole("instanceRole")
 * // the properties below are optional
 * .placementStrategy("placementStrategy")
 * .build()))
 * .releaseLabel("releaseLabel")
 * .scaleDownBehavior("scaleDownBehavior")
 * .securityConfiguration("securityConfiguration")
 * .stepConcurrencyLevel(123)
 * .steps(List.of(StepConfigProperty.builder()
 * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
 * .jar("jar")
 * // the properties below are optional
 * .args(List.of("args"))
 * .mainClass("mainClass")
 * .stepProperties(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .actionOnFailure("actionOnFailure")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .visibleToAllUsers(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html)
 */
public open class CfnCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.emr.CfnCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * A JSON string for selecting additional features.
   */
  public open fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

  /**
   * A JSON string for selecting additional features.
   */
  public open fun additionalInfo(`value`: Any) {
    unwrap(this).setAdditionalInfo(`value`)
  }

  /**
   * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and so
   * on.
   */
  public open fun applications(): Any? = unwrap(this).getApplications()

  /**
   * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and so
   * on.
   */
  public open fun applications(`value`: IResolvable) {
    unwrap(this).setApplications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and so
   * on.
   */
  public open fun applications(`value`: List<Any>) {
    unwrap(this).setApplications(`value`)
  }

  /**
   * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and so
   * on.
   */
  public open fun applications(vararg `value`: Any): Unit = applications(`value`.toList())

  /**
   * The unique identifier for the cluster.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The public DNS name of the master node (instance), such as
   * `ec2-12-123-123-123.us-west-2.compute.amazonaws.com` .
   */
  public open fun attrMasterPublicDns(): String = unwrap(this).getAttrMasterPublicDns()

  /**
   * An IAM role for automatic scaling policies.
   */
  public open fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

  /**
   * An IAM role for automatic scaling policies.
   */
  public open fun autoScalingRole(`value`: String) {
    unwrap(this).setAutoScalingRole(`value`)
  }

  /**
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates.
   */
  public open fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

  /**
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates.
   */
  public open fun autoTerminationPolicy(`value`: IResolvable) {
    unwrap(this).setAutoTerminationPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates.
   */
  public open fun autoTerminationPolicy(`value`: AutoTerminationPolicyProperty) {
    unwrap(this).setAutoTerminationPolicy(`value`.let(AutoTerminationPolicyProperty::unwrap))
  }

  /**
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2aaccf20f9ad05b9e2a9b80c53a4e38b8470cf554bcd7d844f3217feba9c542")
  public open fun autoTerminationPolicy(`value`: AutoTerminationPolicyProperty.Builder.() -> Unit):
      Unit = autoTerminationPolicy(AutoTerminationPolicyProperty(`value`))

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   */
  public open fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   */
  public open fun bootstrapActions(`value`: IResolvable) {
    unwrap(this).setBootstrapActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   */
  public open fun bootstrapActions(`value`: List<Any>) {
    unwrap(this).setBootstrapActions(`value`)
  }

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   */
  public open fun bootstrapActions(vararg `value`: Any): Unit = bootstrapActions(`value`.toList())

  /**
   * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are supplied
   * to the Amazon EMR cluster.
   */
  public open fun configurations(): Any? = unwrap(this).getConfigurations()

  /**
   * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are supplied
   * to the Amazon EMR cluster.
   */
  public open fun configurations(`value`: IResolvable) {
    unwrap(this).setConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are supplied
   * to the Amazon EMR cluster.
   */
  public open fun configurations(`value`: List<Any>) {
    unwrap(this).setConfigurations(`value`)
  }

  /**
   * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are supplied
   * to the Amazon EMR cluster.
   */
  public open fun configurations(vararg `value`: Any): Unit = configurations(`value`.toList())

  /**
   * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
   * Linux AMI if the cluster uses a custom AMI.
   */
  public open fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  /**
   * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
   * Linux AMI if the cluster uses a custom AMI.
   */
  public open fun customAmiId(`value`: String) {
    unwrap(this).setCustomAmiId(`value`)
  }

  /**
   * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
   * EC2 instance.
   */
  public open fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

  /**
   * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
   * EC2 instance.
   */
  public open fun ebsRootVolumeIops(`value`: Number) {
    unwrap(this).setEbsRootVolumeIops(`value`)
  }

  /**
   * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
   * Amazon EC2 instance.
   */
  public open fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

  /**
   * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
   * Amazon EC2 instance.
   */
  public open fun ebsRootVolumeSize(`value`: Number) {
    unwrap(this).setEbsRootVolumeSize(`value`)
  }

  /**
   * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
   * for each Amazon EC2 instance.
   */
  public open fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

  /**
   * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
   * for each Amazon EC2 instance.
   */
  public open fun ebsRootVolumeThroughput(`value`: Number) {
    unwrap(this).setEbsRootVolumeThroughput(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A specification of the number and type of Amazon EC2 instances.
   */
  public open fun instances(): Any = unwrap(this).getInstances()

  /**
   * A specification of the number and type of Amazon EC2 instances.
   */
  public open fun instances(`value`: IResolvable) {
    unwrap(this).setInstances(`value`.let(IResolvable::unwrap))
  }

  /**
   * A specification of the number and type of Amazon EC2 instances.
   */
  public open fun instances(`value`: JobFlowInstancesConfigProperty) {
    unwrap(this).setInstances(`value`.let(JobFlowInstancesConfigProperty::unwrap))
  }

  /**
   * A specification of the number and type of Amazon EC2 instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d0f4e6dc3e46a777c8b6829fa11cec773997a671e9f27a800bfb577830b7a332")
  public open fun instances(`value`: JobFlowInstancesConfigProperty.Builder.() -> Unit): Unit =
      instances(JobFlowInstancesConfigProperty(`value`))

  /**
   * Also called instance profile and Amazon EC2 role.
   */
  public open fun jobFlowRole(): String = unwrap(this).getJobFlowRole()

  /**
   * Also called instance profile and Amazon EC2 role.
   */
  public open fun jobFlowRole(`value`: String) {
    unwrap(this).setJobFlowRole(`value`)
  }

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   */
  public open fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   */
  public open fun kerberosAttributes(`value`: IResolvable) {
    unwrap(this).setKerberosAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   */
  public open fun kerberosAttributes(`value`: KerberosAttributesProperty) {
    unwrap(this).setKerberosAttributes(`value`.let(KerberosAttributesProperty::unwrap))
  }

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03f96896a39377f5bddf0b270de86a9d9692a4633e799e8368efcc0bd5aaa284")
  public open fun kerberosAttributes(`value`: KerberosAttributesProperty.Builder.() -> Unit): Unit =
      kerberosAttributes(KerberosAttributesProperty(`value`))

  /**
   * The AWS KMS key used for encrypting log files.
   */
  public open fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

  /**
   * The AWS KMS key used for encrypting log files.
   */
  public open fun logEncryptionKmsKeyId(`value`: String) {
    unwrap(this).setLogEncryptionKmsKeyId(`value`)
  }

  /**
   * The path to the Amazon S3 location where logs for this cluster are stored.
   */
  public open fun logUri(): String? = unwrap(this).getLogUri()

  /**
   * The path to the Amazon S3 location where logs for this cluster are stored.
   */
  public open fun logUri(`value`: String) {
    unwrap(this).setLogUri(`value`)
  }

  /**
   * Creates or updates a managed scaling policy for an Amazon EMR cluster.
   */
  public open fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

  /**
   * Creates or updates a managed scaling policy for an Amazon EMR cluster.
   */
  public open fun managedScalingPolicy(`value`: IResolvable) {
    unwrap(this).setManagedScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Creates or updates a managed scaling policy for an Amazon EMR cluster.
   */
  public open fun managedScalingPolicy(`value`: ManagedScalingPolicyProperty) {
    unwrap(this).setManagedScalingPolicy(`value`.let(ManagedScalingPolicyProperty::unwrap))
  }

  /**
   * Creates or updates a managed scaling policy for an Amazon EMR cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65ae1f8d959b2610491675c00700c62b7f9b19262c91a1920f4f96b6f1c62d7e")
  public open fun managedScalingPolicy(`value`: ManagedScalingPolicyProperty.Builder.() -> Unit):
      Unit = managedScalingPolicy(ManagedScalingPolicyProperty(`value`))

  /**
   * The name of the cluster.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the cluster.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Linux release specified in a cluster launch RunJobFlow request.
   */
  public open fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

  /**
   * The Amazon Linux release specified in a cluster launch RunJobFlow request.
   */
  public open fun osReleaseLabel(`value`: String) {
    unwrap(this).setOsReleaseLabel(`value`)
  }

  /**
   *
   */
  public open fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

  /**
   *
   */
  public open fun placementGroupConfigs(`value`: IResolvable) {
    unwrap(this).setPlacementGroupConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun placementGroupConfigs(`value`: List<Any>) {
    unwrap(this).setPlacementGroupConfigs(`value`)
  }

  /**
   *
   */
  public open fun placementGroupConfigs(vararg `value`: Any): Unit =
      placementGroupConfigs(`value`.toList())

  /**
   * The Amazon EMR release label, which determines the version of open-source application packages
   * installed on the cluster.
   */
  public open fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  /**
   * The Amazon EMR release label, which determines the version of open-source application packages
   * installed on the cluster.
   */
  public open fun releaseLabel(`value`: String) {
    unwrap(this).setReleaseLabel(`value`)
  }

  /**
   * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
   * occurs or an instance group is resized.
   */
  public open fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

  /**
   * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
   * occurs or an instance group is resized.
   */
  public open fun scaleDownBehavior(`value`: String) {
    unwrap(this).setScaleDownBehavior(`value`)
  }

  /**
   * The name of the security configuration applied to the cluster.
   */
  public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The name of the security configuration applied to the cluster.
   */
  public open fun securityConfiguration(`value`: String) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  /**
   * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
   */
  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  /**
   * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
   */
  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  /**
   * Specifies the number of steps that can be executed concurrently.
   */
  public open fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  /**
   * Specifies the number of steps that can be executed concurrently.
   */
  public open fun stepConcurrencyLevel(`value`: Number) {
    unwrap(this).setStepConcurrencyLevel(`value`)
  }

  /**
   * A list of steps to run.
   */
  public open fun steps(): Any? = unwrap(this).getSteps()

  /**
   * A list of steps to run.
   */
  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of steps to run.
   */
  public open fun steps(`value`: List<Any>) {
    unwrap(this).setSteps(`value`)
  }

  /**
   * A list of steps to run.
   */
  public open fun steps(vararg `value`: Any): Unit = steps(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags associated with a cluster.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags associated with a cluster.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags associated with a cluster.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
   * the cluster.
   */
  public open fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()

  /**
   * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
   * the cluster.
   */
  public open fun visibleToAllUsers(`value`: Boolean) {
    unwrap(this).setVisibleToAllUsers(`value`)
  }

  /**
   * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
   * the cluster.
   */
  public open fun visibleToAllUsers(`value`: IResolvable) {
    unwrap(this).setVisibleToAllUsers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A JSON string for selecting additional features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
     * @param additionalInfo A JSON string for selecting additional features. 
     */
    public fun additionalInfo(additionalInfo: Any)

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    public fun applications(applications: IResolvable)

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    public fun applications(applications: List<Any>)

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    public fun applications(vararg applications: Any)

    /**
     * An IAM role for automatic scaling policies.
     *
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoscalingrole)
     * @param autoScalingRole An IAM role for automatic scaling policies. 
     */
    public fun autoScalingRole(autoScalingRole: String)

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable)

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    public fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty)

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04bf042f7c2a440d931875f8b70e08227df842d1d87d013acf0317b48810b609")
    public
        fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty.Builder.() -> Unit)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    public fun bootstrapActions(bootstrapActions: IResolvable)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    public fun bootstrapActions(bootstrapActions: List<Any>)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    public fun bootstrapActions(vararg bootstrapActions: Any)

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    public fun configurations(configurations: IResolvable)

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    public fun configurations(configurations: List<Any>)

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    public fun configurations(vararg configurations: Any)

    /**
     * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
     * Linux AMI if the cluster uses a custom AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-customamiid)
     * @param customAmiId Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI. 
     */
    public fun customAmiId(customAmiId: String)

    /**
     * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
     * EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumeiops)
     * @param ebsRootVolumeIops The IOPS, of the Amazon EBS root device volume of the Linux AMI that
     * is used for each Amazon EC2 instance. 
     */
    public fun ebsRootVolumeIops(ebsRootVolumeIops: Number)

    /**
     * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
     * Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 4.x and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumesize)
     * @param ebsRootVolumeSize The size, in GiB, of the Amazon EBS root device volume of the Linux
     * AMI that is used for each Amazon EC2 instance. 
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Number)

    /**
     * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
     * for each Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumethroughput)
     * @param ebsRootVolumeThroughput The throughput, in MiB/s, of the Amazon EBS root device volume
     * of the Linux AMI that is used for each Amazon EC2 instance. 
     */
    public fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number)

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: IResolvable)

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: JobFlowInstancesConfigProperty)

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4392db05069307858968e7f25c0aed0db99baf1275502c31f16ff933fb598c4e")
    public fun instances(instances: JobFlowInstancesConfigProperty.Builder.() -> Unit)

    /**
     * Also called instance profile and Amazon EC2 role.
     *
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-jobflowrole)
     * @param jobFlowRole Also called instance profile and Amazon EC2 role. 
     */
    public fun jobFlowRole(jobFlowRole: String)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    public fun kerberosAttributes(kerberosAttributes: IResolvable)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b758ccdadfcc3ccd12852a4ab8d146fec24ec216c503ffa7e97e5e01a97a1000")
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit)

    /**
     * The AWS KMS key used for encrypting log files.
     *
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-logencryptionkmskeyid)
     * @param logEncryptionKmsKeyId The AWS KMS key used for encrypting log files. 
     */
    public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String)

    /**
     * The path to the Amazon S3 location where logs for this cluster are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-loguri)
     * @param logUri The path to the Amazon S3 location where logs for this cluster are stored. 
     */
    public fun logUri(logUri: String)

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    public fun managedScalingPolicy(managedScalingPolicy: IResolvable)

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    public fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty)

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fed765ea5d1af1c7bea77dffebc7688273bed497485e9e69d926f3f3888644a")
    public
        fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty.Builder.() -> Unit)

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-name)
     * @param name The name of the cluster. 
     */
    public fun name(name: String)

    /**
     * The Amazon Linux release specified in a cluster launch RunJobFlow request.
     *
     * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
     * response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-osreleaselabel)
     * @param osReleaseLabel The Amazon Linux release specified in a cluster launch RunJobFlow
     * request. 
     */
    public fun osReleaseLabel(osReleaseLabel: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    public fun placementGroupConfigs(placementGroupConfigs: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    public fun placementGroupConfigs(placementGroupConfigs: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    public fun placementGroupConfigs(vararg placementGroupConfigs: Any)

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version
     * such as `emr-5.14.0` . For more information about Amazon EMR release versions and included
     * application versions and features, see [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/)
     * . The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions
     * use `AmiVersion` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-releaselabel)
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. 
     */
    public fun releaseLabel(releaseLabel: String)

    /**
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     * occurs or an instance group is resized.
     *
     * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
     * boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using
     * that version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a deny list
     * and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     * instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first
     * and blocks instance termination if it could lead to HDFS corruption.
     * `TERMINATE_AT_TASK_COMPLETION` is available only in Amazon EMR releases 4.1.0 and later, and is
     * the default for versions of Amazon EMR earlier than 5.1.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-scaledownbehavior)
     * @param scaleDownBehavior The way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized. 
     */
    public fun scaleDownBehavior(scaleDownBehavior: String)

    /**
     * The name of the security configuration applied to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-securityconfiguration)
     * @param securityConfiguration The name of the security configuration applied to the cluster. 
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-servicerole)
     * @param serviceRole The IAM role that Amazon EMR assumes in order to access AWS resources on
     * your behalf. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * Specifies the number of steps that can be executed concurrently.
     *
     * The default value is `1` . The maximum value is `256` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-stepconcurrencylevel)
     * @param stepConcurrencyLevel Specifies the number of steps that can be executed concurrently. 
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    public fun steps(steps: IResolvable)

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    public fun steps(steps: List<Any>)

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    public fun steps(vararg steps: Any)

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     * @param tags A list of tags associated with a cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     * @param tags A list of tags associated with a cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. 
     */
    public fun visibleToAllUsers(visibleToAllUsers: Boolean)

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. 
     */
    public fun visibleToAllUsers(visibleToAllUsers: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnCluster.Builder =
        software.amazon.awscdk.services.emr.CfnCluster.Builder.create(scope, id)

    /**
     * A JSON string for selecting additional features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
     * @param additionalInfo A JSON string for selecting additional features. 
     */
    override fun additionalInfo(additionalInfo: Any) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    override fun applications(applications: IResolvable) {
      cdkBuilder.applications(applications.let(IResolvable::unwrap))
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    override fun applications(applications: List<Any>) {
      cdkBuilder.applications(applications)
    }

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on. 
     */
    override fun applications(vararg applications: Any): Unit = applications(applications.toList())

    /**
     * An IAM role for automatic scaling policies.
     *
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoscalingrole)
     * @param autoScalingRole An IAM role for automatic scaling policies. 
     */
    override fun autoScalingRole(autoScalingRole: String) {
      cdkBuilder.autoScalingRole(autoScalingRole)
    }

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    override fun autoTerminationPolicy(autoTerminationPolicy: IResolvable) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(IResolvable::unwrap))
    }

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    override fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(AutoTerminationPolicyProperty::unwrap))
    }

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04bf042f7c2a440d931875f8b70e08227df842d1d87d013acf0317b48810b609")
    override
        fun autoTerminationPolicy(autoTerminationPolicy: AutoTerminationPolicyProperty.Builder.() -> Unit):
        Unit = autoTerminationPolicy(AutoTerminationPolicyProperty(autoTerminationPolicy))

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    override fun bootstrapActions(bootstrapActions: IResolvable) {
      cdkBuilder.bootstrapActions(bootstrapActions.let(IResolvable::unwrap))
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    override fun bootstrapActions(bootstrapActions: List<Any>) {
      cdkBuilder.bootstrapActions(bootstrapActions)
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    override fun bootstrapActions(vararg bootstrapActions: Any): Unit =
        bootstrapActions(bootstrapActions.toList())

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster. 
     */
    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    /**
     * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
     * Linux AMI if the cluster uses a custom AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-customamiid)
     * @param customAmiId Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI. 
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
     * EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumeiops)
     * @param ebsRootVolumeIops The IOPS, of the Amazon EBS root device volume of the Linux AMI that
     * is used for each Amazon EC2 instance. 
     */
    override fun ebsRootVolumeIops(ebsRootVolumeIops: Number) {
      cdkBuilder.ebsRootVolumeIops(ebsRootVolumeIops)
    }

    /**
     * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
     * Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 4.x and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumesize)
     * @param ebsRootVolumeSize The size, in GiB, of the Amazon EBS root device volume of the Linux
     * AMI that is used for each Amazon EC2 instance. 
     */
    override fun ebsRootVolumeSize(ebsRootVolumeSize: Number) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
    }

    /**
     * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
     * for each Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumethroughput)
     * @param ebsRootVolumeThroughput The throughput, in MiB/s, of the Amazon EBS root device volume
     * of the Linux AMI that is used for each Amazon EC2 instance. 
     */
    override fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number) {
      cdkBuilder.ebsRootVolumeThroughput(ebsRootVolumeThroughput)
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: IResolvable) {
      cdkBuilder.instances(instances.let(IResolvable::unwrap))
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: JobFlowInstancesConfigProperty) {
      cdkBuilder.instances(instances.let(JobFlowInstancesConfigProperty::unwrap))
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4392db05069307858968e7f25c0aed0db99baf1275502c31f16ff933fb598c4e")
    override fun instances(instances: JobFlowInstancesConfigProperty.Builder.() -> Unit): Unit =
        instances(JobFlowInstancesConfigProperty(instances))

    /**
     * Also called instance profile and Amazon EC2 role.
     *
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-jobflowrole)
     * @param jobFlowRole Also called instance profile and Amazon EC2 role. 
     */
    override fun jobFlowRole(jobFlowRole: String) {
      cdkBuilder.jobFlowRole(jobFlowRole)
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    override fun kerberosAttributes(kerberosAttributes: IResolvable) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(IResolvable::unwrap))
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    override fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(KerberosAttributesProperty::unwrap))
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b758ccdadfcc3ccd12852a4ab8d146fec24ec216c503ffa7e97e5e01a97a1000")
    override
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(KerberosAttributesProperty(kerberosAttributes))

    /**
     * The AWS KMS key used for encrypting log files.
     *
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-logencryptionkmskeyid)
     * @param logEncryptionKmsKeyId The AWS KMS key used for encrypting log files. 
     */
    override fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
      cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
    }

    /**
     * The path to the Amazon S3 location where logs for this cluster are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-loguri)
     * @param logUri The path to the Amazon S3 location where logs for this cluster are stored. 
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    override fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(IResolvable::unwrap))
    }

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    override fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(ManagedScalingPolicyProperty::unwrap))
    }

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fed765ea5d1af1c7bea77dffebc7688273bed497485e9e69d926f3f3888644a")
    override
        fun managedScalingPolicy(managedScalingPolicy: ManagedScalingPolicyProperty.Builder.() -> Unit):
        Unit = managedScalingPolicy(ManagedScalingPolicyProperty(managedScalingPolicy))

    /**
     * The name of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-name)
     * @param name The name of the cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Linux release specified in a cluster launch RunJobFlow request.
     *
     * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
     * response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-osreleaselabel)
     * @param osReleaseLabel The Amazon Linux release specified in a cluster launch RunJobFlow
     * request. 
     */
    override fun osReleaseLabel(osReleaseLabel: String) {
      cdkBuilder.osReleaseLabel(osReleaseLabel)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    override fun placementGroupConfigs(placementGroupConfigs: IResolvable) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    override fun placementGroupConfigs(placementGroupConfigs: List<Any>) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     * @param placementGroupConfigs 
     */
    override fun placementGroupConfigs(vararg placementGroupConfigs: Any): Unit =
        placementGroupConfigs(placementGroupConfigs.toList())

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version
     * such as `emr-5.14.0` . For more information about Amazon EMR release versions and included
     * application versions and features, see [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/)
     * . The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions
     * use `AmiVersion` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-releaselabel)
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. 
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     * occurs or an instance group is resized.
     *
     * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
     * boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using
     * that version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a deny list
     * and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     * instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first
     * and blocks instance termination if it could lead to HDFS corruption.
     * `TERMINATE_AT_TASK_COMPLETION` is available only in Amazon EMR releases 4.1.0 and later, and is
     * the default for versions of Amazon EMR earlier than 5.1.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-scaledownbehavior)
     * @param scaleDownBehavior The way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized. 
     */
    override fun scaleDownBehavior(scaleDownBehavior: String) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    /**
     * The name of the security configuration applied to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-securityconfiguration)
     * @param securityConfiguration The name of the security configuration applied to the cluster. 
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-servicerole)
     * @param serviceRole The IAM role that Amazon EMR assumes in order to access AWS resources on
     * your behalf. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * Specifies the number of steps that can be executed concurrently.
     *
     * The default value is `1` . The maximum value is `256` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-stepconcurrencylevel)
     * @param stepConcurrencyLevel Specifies the number of steps that can be executed concurrently. 
     */
    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     * @param steps A list of steps to run. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     * @param tags A list of tags associated with a cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     * @param tags A list of tags associated with a cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. 
     */
    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    /**
     * Indicates whether the cluster is visible to all IAM users of the AWS account associated with
     * the cluster.
     *
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster. 
     */
    override fun visibleToAllUsers(visibleToAllUsers: IResolvable) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.emr.CfnCluster =
        wrapped.cdkObject
  }

  /**
   * `Application` is a property of `AWS::EMR::Cluster` .
   *
   * The `Application` property type defines the open-source big data applications for EMR to
   * install and configure when a cluster is created.
   *
   * With Amazon EMR release version 4.0 and later, the only accepted parameter is the application
   * `Name` . To pass arguments to these applications, you use configuration classifications specified
   * using JSON objects in a `Configuration` property. For more information, see [Configuring
   * Applications](https://docs.aws.amazon.com//emr/latest/ReleaseGuide/emr-configure-apps.html) .
   *
   * With earlier Amazon EMR releases, the application is any AWS or third-party software that you
   * can add to the cluster. You can specify the version of the application and arguments to pass to
   * it. Amazon EMR accepts and forwards the argument list to the corresponding installation script as
   * a bootstrap action argument.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ApplicationProperty applicationProperty = ApplicationProperty.builder()
   * .additionalInfo(Map.of(
   * "additionalInfoKey", "additionalInfo"))
   * .args(List.of("args"))
   * .name("name")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html)
   */
  public interface ApplicationProperty {
    /**
     * This option is for advanced users only.
     *
     * This is meta information about clusters and applications that are used for testing and
     * troubleshooting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-additionalinfo)
     */
    public fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

    /**
     * Arguments for Amazon EMR to pass to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-args)
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The version of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [ApplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about clusters and applications that are used for testing and
       * troubleshooting.
       */
      public fun additionalInfo(additionalInfo: IResolvable)

      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about clusters and applications that are used for testing and
       * troubleshooting.
       */
      public fun additionalInfo(additionalInfo: Map<String, String>)

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      public fun args(args: List<String>)

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      public fun args(vararg args: String)

      /**
       * @param name The name of the application.
       */
      public fun name(name: String)

      /**
       * @param version The version of the application.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.builder()

      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about clusters and applications that are used for testing and
       * troubleshooting.
       */
      override fun additionalInfo(additionalInfo: IResolvable) {
        cdkBuilder.additionalInfo(additionalInfo.let(IResolvable::unwrap))
      }

      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about clusters and applications that are used for testing and
       * troubleshooting.
       */
      override fun additionalInfo(additionalInfo: Map<String, String>) {
        cdkBuilder.additionalInfo(additionalInfo)
      }

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param name The name of the application.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the application.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty,
    ) : CdkObject(cdkObject), ApplicationProperty {
      /**
       * This option is for advanced users only.
       *
       * This is meta information about clusters and applications that are used for testing and
       * troubleshooting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-additionalinfo)
       */
      override fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

      /**
       * Arguments for Amazon EMR to pass to the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-args)
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * The name of the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The version of the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html#cfn-emr-cluster-application-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty):
          ApplicationProperty = CdkObjectWrappers.wrap(cdkObject) as? ApplicationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty
    }
  }

  /**
   * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
   *
   * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2 instances
   * in response to the value of a CloudWatch metric. For more information, see [Using Automatic
   * Scaling in Amazon
   * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
   * *Amazon EMR Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
   * .constraints(ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
   * .rules(List.of(ScalingRuleProperty.builder()
   * .action(ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html)
   */
  public interface AutoScalingPolicyProperty {
    /**
     * The upper and lower Amazon EC2 instance limits for an automatic scaling policy.
     *
     * Automatic scaling activity will not cause an instance group to grow above or below these
     * limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html#cfn-emr-cluster-autoscalingpolicy-constraints)
     */
    public fun constraints(): Any

    /**
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html#cfn-emr-cluster-autoscalingpolicy-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [AutoScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      public fun constraints(constraints: IResolvable)

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      public fun constraints(constraints: ScalingConstraintsProperty)

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2297aee95e47f66db144bc25bb2a219bac3fb2ba745f0c8036382aa2ab570e6e")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.builder()

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      /**
       * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
       * policy. 
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2297aee95e47f66db144bc25bb2a219bac3fb2ba745f0c8036382aa2ab570e6e")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      /**
       * The upper and lower Amazon EC2 instance limits for an automatic scaling policy.
       *
       * Automatic scaling activity will not cause an instance group to grow above or below these
       * limits.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html#cfn-emr-cluster-autoscalingpolicy-constraints)
       */
      override fun constraints(): Any = unwrap(this).getConstraints()

      /**
       * The scale-in and scale-out rules that comprise the automatic scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoscalingpolicy.html#cfn-emr-cluster-autoscalingpolicy-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty
    }
  }

  /**
   * An auto-termination policy for an Amazon EMR cluster.
   *
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates. For alternative cluster termination options, see [Control cluster
   * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * AutoTerminationPolicyProperty autoTerminationPolicyProperty =
   * AutoTerminationPolicyProperty.builder()
   * .idleTimeout(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoterminationpolicy.html)
   */
  public interface AutoTerminationPolicyProperty {
    /**
     * Specifies the amount of idle time in seconds after which the cluster automatically
     * terminates.
     *
     * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoterminationpolicy.html#cfn-emr-cluster-autoterminationpolicy-idletimeout)
     */
    public fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()

    /**
     * A builder for [AutoTerminationPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleTimeout Specifies the amount of idle time in seconds after which the cluster
       * automatically terminates.
       * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
       */
      public fun idleTimeout(idleTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty.builder()

      /**
       * @param idleTimeout Specifies the amount of idle time in seconds after which the cluster
       * automatically terminates.
       * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
       */
      override fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty,
    ) : CdkObject(cdkObject), AutoTerminationPolicyProperty {
      /**
       * Specifies the amount of idle time in seconds after which the cluster automatically
       * terminates.
       *
       * You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoterminationpolicy.html#cfn-emr-cluster-autoterminationpolicy-idletimeout)
       */
      override fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoTerminationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty):
          AutoTerminationPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoTerminationPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoTerminationPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.AutoTerminationPolicyProperty
    }
  }

  /**
   * `BootstrapActionConfig` is a property of `AWS::EMR::Cluster` that can be used to run bootstrap
   * actions on EMR clusters.
   *
   * You can use a bootstrap action to install software and configure EC2 instances for all cluster
   * nodes before EMR installs and configures open-source big data applications on cluster instances.
   * For more information, see [Create Bootstrap Actions to Install Additional
   * Software](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-plan-bootstrap.html) in the
   * *Amazon EMR Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * BootstrapActionConfigProperty bootstrapActionConfigProperty =
   * BootstrapActionConfigProperty.builder()
   * .name("name")
   * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .args(List.of("args"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html)
   */
  public interface BootstrapActionConfigProperty {
    /**
     * The name of the bootstrap action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html#cfn-emr-cluster-bootstrapactionconfig-name)
     */
    public fun name(): String

    /**
     * The script run by the bootstrap action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html#cfn-emr-cluster-bootstrapactionconfig-scriptbootstrapaction)
     */
    public fun scriptBootstrapAction(): Any

    /**
     * A builder for [BootstrapActionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the bootstrap action. 
       */
      public fun name(name: String)

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      public fun scriptBootstrapAction(scriptBootstrapAction: IResolvable)

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      public fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty)

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a865fef280f00048f67690c708ff1b8892cd0b48dc38c0a818102b6a89898b59")
      public
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.builder()

      /**
       * @param name The name of the bootstrap action. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      override fun scriptBootstrapAction(scriptBootstrapAction: IResolvable) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(IResolvable::unwrap))
      }

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(ScriptBootstrapActionConfigProperty::unwrap))
      }

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a865fef280f00048f67690c708ff1b8892cd0b48dc38c0a818102b6a89898b59")
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
          Unit = scriptBootstrapAction(ScriptBootstrapActionConfigProperty(scriptBootstrapAction))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), BootstrapActionConfigProperty {
      /**
       * The name of the bootstrap action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html#cfn-emr-cluster-bootstrapactionconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The script run by the bootstrap action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-bootstrapactionconfig.html#cfn-emr-cluster-bootstrapactionconfig-scriptbootstrapaction)
       */
      override fun scriptBootstrapAction(): Any = unwrap(this).getScriptBootstrapAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty):
          BootstrapActionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BootstrapActionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BootstrapActionConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty
    }
  }

  /**
   * `CloudWatchAlarmDefinition` is a subproperty of the `ScalingTrigger` property, which determines
   * when to trigger an automatic scaling activity.
   *
   * Scaling activity begins when you satisfy the defined alarm conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
   * CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html)
   */
  public interface CloudWatchAlarmDefinitionProperty {
    /**
     * Determines how the metric specified by `MetricName` is compared to the value specified by
     * `Threshold` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * A CloudWatch metric dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The number of periods, in five-minute increments, during which the alarm condition must exist
     * before the alarm triggers automatic scaling activity.
     *
     * The default value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-evaluationperiods)
     */
    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace for the CloudWatch metric.
     *
     * The default is `AWS/ElasticMapReduce` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The period, in seconds, over which the statistic is applied.
     *
     * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
     * specify a CloudWatch metric, specify `300` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-period)
     */
    public fun period(): Number

    /**
     * The statistic to apply to the metric associated with the alarm.
     *
     * The default is `AVERAGE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-statistic)
     */
    public fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * The value against which the specified statistic is compared.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-threshold)
     */
    public fun threshold(): Number

    /**
     * The unit of measure associated with the CloudWatch metric being watched.
     *
     * The value specified for `Unit` must correspond to the units specified in the CloudWatch
     * metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [CloudWatchAlarmDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator Determines how the metric specified by `MetricName` is compared
       * to the value specified by `Threshold` . 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       * The default value is `1` .
       */
      public fun evaluationPeriods(evaluationPeriods: Number)

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace for the CloudWatch metric.
       * The default is `AWS/ElasticMapReduce` .
       */
      public fun namespace(namespace: String)

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       */
      public fun period(period: Number)

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       * The default is `AVERAGE` .
       */
      public fun statistic(statistic: String)

      /**
       * @param threshold The value against which the specified statistic is compared. 
       */
      public fun threshold(threshold: Number)

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.builder()

      /**
       * @param comparisonOperator Determines how the metric specified by `MetricName` is compared
       * to the value specified by `Threshold` . 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       * The default value is `1` .
       */
      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace for the CloudWatch metric.
       * The default is `AWS/ElasticMapReduce` .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       */
      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       * The default is `AVERAGE` .
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      /**
       * @param threshold The value against which the specified statistic is compared. 
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty,
    ) : CdkObject(cdkObject), CloudWatchAlarmDefinitionProperty {
      /**
       * Determines how the metric specified by `MetricName` is compared to the value specified by
       * `Threshold` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * A CloudWatch metric dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The number of periods, in five-minute increments, during which the alarm condition must
       * exist before the alarm triggers automatic scaling activity.
       *
       * The default value is `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-evaluationperiods)
       */
      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      /**
       * The name of the CloudWatch metric that is watched to determine an alarm condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace for the CloudWatch metric.
       *
       * The default is `AWS/ElasticMapReduce` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The period, in seconds, over which the statistic is applied.
       *
       * CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you
       * specify a CloudWatch metric, specify `300` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-period)
       */
      override fun period(): Number = unwrap(this).getPeriod()

      /**
       * The statistic to apply to the metric associated with the alarm.
       *
       * The default is `AVERAGE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-statistic)
       */
      override fun statistic(): String? = unwrap(this).getStatistic()

      /**
       * The value against which the specified statistic is compared.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * The unit of measure associated with the CloudWatch metric being watched.
       *
       * The value specified for `Unit` must correspond to the units specified in the CloudWatch
       * metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-cloudwatchalarmdefinition.html#cfn-emr-cluster-cloudwatchalarmdefinition-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchAlarmDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchAlarmDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty
    }
  }

  /**
   * The Amazon EC2 unit limits for a managed scaling policy.
   *
   * The managed scaling activity of a cluster can not be above or below these limits. The limit
   * only applies to the core and task nodes. The master node cannot be scaled after initial
   * configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ComputeLimitsProperty computeLimitsProperty = ComputeLimitsProperty.builder()
   * .maximumCapacityUnits(123)
   * .minimumCapacityUnits(123)
   * .unitType("unitType")
   * // the properties below are optional
   * .maximumCoreCapacityUnits(123)
   * .maximumOnDemandCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html)
   */
  public interface ComputeLimitsProperty {
    /**
     * The upper boundary of Amazon EC2 units.
     *
     * It is measured through vCPU cores or instances for instance groups and measured through units
     * for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumcapacityunits)
     */
    public fun maximumCapacityUnits(): Number

    /**
     * The upper boundary of Amazon EC2 units for core node type in a cluster.
     *
     * It is measured through vCPU cores or instances for instance groups and measured through units
     * for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter
     * is used to split capacity allocation between core and task nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumcorecapacityunits)
     */
    public fun maximumCoreCapacityUnits(): Number? = unwrap(this).getMaximumCoreCapacityUnits()

    /**
     * The upper boundary of On-Demand Amazon EC2 units.
     *
     * It is measured through vCPU cores or instances for instance groups and measured through units
     * for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The
     * parameter is used to split capacity allocation between On-Demand and Spot Instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumondemandcapacityunits)
     */
    public fun maximumOnDemandCapacityUnits(): Number? =
        unwrap(this).getMaximumOnDemandCapacityUnits()

    /**
     * The lower boundary of Amazon EC2 units.
     *
     * It is measured through vCPU cores or instances for instance groups and measured through units
     * for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-minimumcapacityunits)
     */
    public fun minimumCapacityUnits(): Number

    /**
     * The unit type used for specifying a managed scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-unittype)
     */
    public fun unitType(): String

    /**
     * A builder for [ComputeLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumCapacityUnits The upper boundary of Amazon EC2 units. 
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      public fun maximumCapacityUnits(maximumCapacityUnits: Number)

      /**
       * @param maximumCoreCapacityUnits The upper boundary of Amazon EC2 units for core node type
       * in a cluster.
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The core units are not allowed to scale beyond this boundary. The
       * parameter is used to split capacity allocation between core and task nodes.
       */
      public fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number)

      /**
       * @param maximumOnDemandCapacityUnits The upper boundary of On-Demand Amazon EC2 units.
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
       * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
       */
      public fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number)

      /**
       * @param minimumCapacityUnits The lower boundary of Amazon EC2 units. 
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      public fun minimumCapacityUnits(minimumCapacityUnits: Number)

      /**
       * @param unitType The unit type used for specifying a managed scaling policy. 
       */
      public fun unitType(unitType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.builder()

      /**
       * @param maximumCapacityUnits The upper boundary of Amazon EC2 units. 
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      override fun maximumCapacityUnits(maximumCapacityUnits: Number) {
        cdkBuilder.maximumCapacityUnits(maximumCapacityUnits)
      }

      /**
       * @param maximumCoreCapacityUnits The upper boundary of Amazon EC2 units for core node type
       * in a cluster.
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The core units are not allowed to scale beyond this boundary. The
       * parameter is used to split capacity allocation between core and task nodes.
       */
      override fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number) {
        cdkBuilder.maximumCoreCapacityUnits(maximumCoreCapacityUnits)
      }

      /**
       * @param maximumOnDemandCapacityUnits The upper boundary of On-Demand Amazon EC2 units.
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
       * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
       */
      override fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number) {
        cdkBuilder.maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits)
      }

      /**
       * @param minimumCapacityUnits The lower boundary of Amazon EC2 units. 
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      override fun minimumCapacityUnits(minimumCapacityUnits: Number) {
        cdkBuilder.minimumCapacityUnits(minimumCapacityUnits)
      }

      /**
       * @param unitType The unit type used for specifying a managed scaling policy. 
       */
      override fun unitType(unitType: String) {
        cdkBuilder.unitType(unitType)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty,
    ) : CdkObject(cdkObject), ComputeLimitsProperty {
      /**
       * The upper boundary of Amazon EC2 units.
       *
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumcapacityunits)
       */
      override fun maximumCapacityUnits(): Number = unwrap(this).getMaximumCapacityUnits()

      /**
       * The upper boundary of Amazon EC2 units for core node type in a cluster.
       *
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The core units are not allowed to scale beyond this boundary. The
       * parameter is used to split capacity allocation between core and task nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumcorecapacityunits)
       */
      override fun maximumCoreCapacityUnits(): Number? = unwrap(this).getMaximumCoreCapacityUnits()

      /**
       * The upper boundary of On-Demand Amazon EC2 units.
       *
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
       * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-maximumondemandcapacityunits)
       */
      override fun maximumOnDemandCapacityUnits(): Number? =
          unwrap(this).getMaximumOnDemandCapacityUnits()

      /**
       * The lower boundary of Amazon EC2 units.
       *
       * It is measured through vCPU cores or instances for instance groups and measured through
       * units for instance fleets. Managed scaling activities are not allowed beyond this boundary.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-minimumcapacityunits)
       */
      override fun minimumCapacityUnits(): Number = unwrap(this).getMinimumCapacityUnits()

      /**
       * The unit type used for specifying a managed scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-computelimits.html#cfn-emr-cluster-computelimits-unittype)
       */
      override fun unitType(): String = unwrap(this).getUnitType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty):
          ComputeLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? ComputeLimitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeLimitsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty
    }
  }

  /**
   * Used only with Amazon EMR release 4.0 and later.
   *
   * `Configuration` is a subproperty of `InstanceFleetConfig` or `InstanceGroupConfig` .
   * `Configuration` specifies optional configurations for customizing open-source big data
   * applications and environment parameters. A configuration consists of a classification, properties,
   * and optional nested configurations. A classification refers to an application-specific
   * configuration file. Properties are the settings you want to change in that file. For more
   * information, see [Configuring
   * Applications](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-configure-apps.html) in the
   * *Amazon EMR Release Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ConfigurationProperty configurationProperty_;
   * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html)
   */
  public interface ConfigurationProperty {
    /**
     * The classification within a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
     */
    public fun classification(): String? = unwrap(this).getClassification()

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties)
     */
    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * A builder for [ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification The classification within a configuration.
       */
      public fun classification(classification: String)

      /**
       * @param configurationProperties A list of additional configurations to apply within a
       * configuration object.
       */
      public fun configurationProperties(configurationProperties: IResolvable)

      /**
       * @param configurationProperties A list of additional configurations to apply within a
       * configuration object.
       */
      public fun configurationProperties(configurationProperties: Map<String, String>)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(vararg configurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.builder()

      /**
       * @param classification The classification within a configuration.
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param configurationProperties A list of additional configurations to apply within a
       * configuration object.
       */
      override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      /**
       * @param configurationProperties A list of additional configurations to apply within a
       * configuration object.
       */
      override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      /**
       * The classification within a configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-classification)
       */
      override fun classification(): String? = unwrap(this).getClassification()

      /**
       * A list of additional configurations to apply within a configuration object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurationproperties)
       */
      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      /**
       * A list of additional configurations to apply within a configuration object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-configuration.html#cfn-emr-cluster-configuration-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty):
          ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty
    }
  }

  /**
   * `EbsBlockDeviceConfig` is a subproperty of the `EbsConfiguration` property type.
   *
   * `EbsBlockDeviceConfig` defines the number and type of EBS volumes to associate with all EC2
   * instances in an EMR cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
   * EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html)
   */
  public interface EbsBlockDeviceConfigProperty {
    /**
     * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
     * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html#cfn-emr-cluster-ebsblockdeviceconfig-volumespecification)
     */
    public fun volumeSpecification(): Any

    /**
     * Number of EBS volumes with a specific volume configuration that are associated with every
     * instance in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html#cfn-emr-cluster-ebsblockdeviceconfig-volumesperinstance)
     */
    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    /**
     * A builder for [EbsBlockDeviceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      public fun volumeSpecification(volumeSpecification: IResolvable)

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6098102f5fe1e7c642ed86c5ea6655bb1f9f5971c6dce82a27acdd3a241902")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * are associated with every instance in the instance group.
       */
      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.builder()

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, size (GiB)
       * and throughput (MiB/s) that are requested for the EBS volume attached to an Amazon EC2
       * instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6098102f5fe1e7c642ed86c5ea6655bb1f9f5971c6dce82a27acdd3a241902")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * are associated with every instance in the instance group.
       */
      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      /**
       * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that
       * are requested for the EBS volume attached to an Amazon EC2 instance in the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html#cfn-emr-cluster-ebsblockdeviceconfig-volumespecification)
       */
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      /**
       * Number of EBS volumes with a specific volume configuration that are associated with every
       * instance in the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsblockdeviceconfig.html#cfn-emr-cluster-ebsblockdeviceconfig-volumesperinstance)
       */
      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EbsBlockDeviceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty
    }
  }

  /**
   * `EbsConfiguration` is a subproperty of `InstanceFleetConfig` or `InstanceGroupConfig` .
   *
   * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html)
   */
  public interface EbsConfigurationProperty {
    /**
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html#cfn-emr-cluster-ebsconfiguration-ebsblockdeviceconfigs)
     */
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html#cfn-emr-cluster-ebsconfiguration-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * A builder for [EbsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable)

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>)

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any)

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.builder()

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      /**
       * An array of Amazon EBS volume specifications attached to a cluster instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html#cfn-emr-cluster-ebsconfiguration-ebsblockdeviceconfigs)
       */
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      /**
       * Indicates whether an Amazon EBS volume is EBS-optimized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ebsconfiguration.html#cfn-emr-cluster-ebsconfiguration-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty):
          EbsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty
    }
  }

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   *
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * HadoopJarStepConfigProperty hadoopJarStepConfigProperty = HadoopJarStepConfigProperty.builder()
   * .jar("jar")
   * // the properties below are optional
   * .args(List.of("args"))
   * .mainClass("mainClass")
   * .stepProperties(List.of(KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html)
   */
  public interface HadoopJarStepConfigProperty {
    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-args)
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * A path to a JAR file run during the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-jar)
     */
    public fun jar(): String

    /**
     * The name of the main class in the specified Java file.
     *
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-mainclass)
     */
    public fun mainClass(): String? = unwrap(this).getMainClass()

    /**
     * A list of Java properties that are set when the step runs.
     *
     * You can use these properties to pass key-value pairs to your main function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-stepproperties)
     */
    public fun stepProperties(): Any? = unwrap(this).getStepProperties()

    /**
     * A builder for [HadoopJarStepConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      public fun args(args: List<String>)

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      public fun args(vararg args: String)

      /**
       * @param jar A path to a JAR file run during the step. 
       */
      public fun jar(jar: String)

      /**
       * @param mainClass The name of the main class in the specified Java file.
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       */
      public fun mainClass(mainClass: String)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      public fun stepProperties(stepProperties: IResolvable)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      public fun stepProperties(stepProperties: List<Any>)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      public fun stepProperties(vararg stepProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.builder()

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param jar A path to a JAR file run during the step. 
       */
      override fun jar(jar: String) {
        cdkBuilder.jar(jar)
      }

      /**
       * @param mainClass The name of the main class in the specified Java file.
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       */
      override fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      override fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties.let(IResolvable::unwrap))
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      override fun stepProperties(stepProperties: List<Any>) {
        cdkBuilder.stepProperties(stepProperties)
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key-value pairs to your main function.
       */
      override fun stepProperties(vararg stepProperties: Any): Unit =
          stepProperties(stepProperties.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty,
    ) : CdkObject(cdkObject), HadoopJarStepConfigProperty {
      /**
       * A list of command line arguments passed to the JAR file's main function when executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-args)
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * A path to a JAR file run during the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-jar)
       */
      override fun jar(): String = unwrap(this).getJar()

      /**
       * The name of the main class in the specified Java file.
       *
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-mainclass)
       */
      override fun mainClass(): String? = unwrap(this).getMainClass()

      /**
       * A list of Java properties that are set when the step runs.
       *
       * You can use these properties to pass key-value pairs to your main function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html#cfn-emr-cluster-hadoopjarstepconfig-stepproperties)
       */
      override fun stepProperties(): Any? = unwrap(this).getStepProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HadoopJarStepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty):
          HadoopJarStepConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HadoopJarStepConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HadoopJarStepConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty
    }
  }

  /**
   * Use `InstanceFleetConfig` to define instance fleets for an EMR cluster.
   *
   * A cluster can not use both instance fleets and instance groups. For more information, see
   * [Configure Instance
   * Fleets](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
   * in the *Amazon EMR Management Guide* .
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ConfigurationProperty configurationProperty_;
   * InstanceFleetConfigProperty instanceFleetConfigProperty = InstanceFleetConfigProperty.builder()
   * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
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
   * .allocationStrategy("allocationStrategy")
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build())
   * .build())
   * .name("name")
   * .targetOnDemandCapacity(123)
   * .targetSpotCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html)
   */
  public interface InstanceFleetConfigProperty {
    /**
     * The instance type configurations that define the Amazon EC2 instances in the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-instancetypeconfigs)
     */
    public fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

    /**
     * The launch specification for the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-launchspecifications)
     */
    public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    /**
     * The friendly name of the instance fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many
     * On-Demand instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by `InstanceTypeConfig` . Each instance configuration has a specified
     * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
     * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
     * totally fulfilled, even if this results in an overage. For example, if there are 2 units
     * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
     * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is exceeded
     * by 3 units.
     *
     *
     * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
     * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
     * `TargetOnDemandCapacity` can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-targetondemandcapacity)
     */
    public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot
     * instances to provision.
     *
     * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
     * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` . When
     * a Spot instance is provisioned, the `WeightedCapacity` units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this
     * results in an overage. For example, if there are 2 units remaining to fulfill capacity, and
     * Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units, the instance is
     * provisioned, and the target capacity is exceeded by 3 units.
     *
     *
     * If not specified or set to 0, only On-Demand instances are provisioned for the instance
     * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater than
     * 0. For a master instance fleet, only one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
     * can be specified, and its value must be 1.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-targetspotcapacity)
     */
    public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

    /**
     * A builder for [InstanceFleetConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      public fun launchSpecifications(launchSpecifications: IResolvable)

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f85e4274949c23fd43accc57821cbd6c34700468d4a30a07af21ad2c6bddf3")
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

      /**
       * @param name The friendly name of the instance fleet.
       */
      public fun name(name: String)

      /**
       * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance
       * fleet, which determines how many On-Demand instances to provision.
       * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
       * specified by `InstanceTypeConfig` . Each instance configuration has a specified
       * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
       * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
       * totally fulfilled, even if this results in an overage. For example, if there are 2 units
       * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
       * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is
       * exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
       * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
       * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       */
      public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

      /**
       * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
       * determines how many Spot instances to provision.
       * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
       * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` .
       * When a Spot instance is provisioned, the `WeightedCapacity` units count toward the target
       * capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even
       * if this results in an overage. For example, if there are 2 units remaining to fulfill
       * capacity, and Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units,
       * the instance is provisioned, and the target capacity is exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only On-Demand instances are provisioned for the instance
       * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater
       * than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       */
      public fun targetSpotCapacity(targetSpotCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.builder()

      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
      }

      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
      }

      /**
       * @param instanceTypeConfigs The instance type configurations that define the Amazon EC2
       * instances in the instance fleet.
       */
      override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
          instanceTypeConfigs(instanceTypeConfigs.toList())

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      override fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
      }

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f85e4274949c23fd43accc57821cbd6c34700468d4a30a07af21ad2c6bddf3")
      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
          Unit =
          launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

      /**
       * @param name The friendly name of the instance fleet.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance
       * fleet, which determines how many On-Demand instances to provision.
       * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
       * specified by `InstanceTypeConfig` . Each instance configuration has a specified
       * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
       * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
       * totally fulfilled, even if this results in an overage. For example, if there are 2 units
       * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
       * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is
       * exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
       * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
       * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       */
      override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
      }

      /**
       * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
       * determines how many Spot instances to provision.
       * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
       * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` .
       * When a Spot instance is provisioned, the `WeightedCapacity` units count toward the target
       * capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even
       * if this results in an overage. For example, if there are 2 units remaining to fulfill
       * capacity, and Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units,
       * the instance is provisioned, and the target capacity is exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only On-Demand instances are provisioned for the instance
       * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater
       * than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       */
      override fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty,
    ) : CdkObject(cdkObject), InstanceFleetConfigProperty {
      /**
       * The instance type configurations that define the Amazon EC2 instances in the instance
       * fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-instancetypeconfigs)
       */
      override fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

      /**
       * The launch specification for the instance fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-launchspecifications)
       */
      override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

      /**
       * The friendly name of the instance fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The target capacity of On-Demand units for the instance fleet, which determines how many
       * On-Demand instances to provision.
       *
       * When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as
       * specified by `InstanceTypeConfig` . Each instance configuration has a specified
       * `WeightedCapacity` . When an On-Demand instance is provisioned, the `WeightedCapacity` units
       * count toward the target capacity. Amazon EMR provisions instances until the target capacity is
       * totally fulfilled, even if this results in an overage. For example, if there are 2 units
       * remaining to fulfill capacity, and Amazon EMR can only provision an instance with a
       * `WeightedCapacity` of 5 units, the instance is provisioned, and the target capacity is
       * exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only Spot instances are provisioned for the instance fleet
       * using `TargetSpotCapacity` . At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity`
       * should be greater than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-targetondemandcapacity)
       */
      override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

      /**
       * The target capacity of Spot units for the instance fleet, which determines how many Spot
       * instances to provision.
       *
       * When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified
       * by `InstanceTypeConfig` . Each instance configuration has a specified `WeightedCapacity` .
       * When a Spot instance is provisioned, the `WeightedCapacity` units count toward the target
       * capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even
       * if this results in an overage. For example, if there are 2 units remaining to fulfill
       * capacity, and Amazon EMR can only provision an instance with a `WeightedCapacity` of 5 units,
       * the instance is provisioned, and the target capacity is exceeded by 3 units.
       *
       *
       * If not specified or set to 0, only On-Demand instances are provisioned for the instance
       * fleet. At least one of `TargetSpotCapacity` and `TargetOnDemandCapacity` should be greater
       * than 0. For a master instance fleet, only one of `TargetSpotCapacity` and
       * `TargetOnDemandCapacity` can be specified, and its value must be 1.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetconfig.html#cfn-emr-cluster-instancefleetconfig-targetspotcapacity)
       */
      override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceFleetConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty):
          InstanceFleetConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceFleetConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty
    }
  }

  /**
   * `InstanceFleetProvisioningSpecification` is a subproperty of `InstanceFleetConfig` .
   *
   * `InstanceFleetProvisioningSpecification` defines the launch specification for Spot instances in
   * an instance fleet, which determines the defined duration and provisioning timeout behavior for
   * Spot instances.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty
   * = InstanceFleetProvisioningSpecificationsProperty.builder()
   * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy("allocationStrategy")
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html)
   */
  public interface InstanceFleetProvisioningSpecificationsProperty {
    /**
     * The launch specification for On-Demand Instances in the instance fleet, which determines the
     * allocation strategy.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html#cfn-emr-cluster-instancefleetprovisioningspecifications-ondemandspecification)
     */
    public fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

    /**
     * The launch specification for Spot instances in the fleet, which determines the defined
     * duration, provisioning timeout behavior, and allocation strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html#cfn-emr-cluster-instancefleetprovisioningspecifications-spotspecification)
     */
    public fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()

    /**
     * A builder for [InstanceFleetProvisioningSpecificationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      public fun onDemandSpecification(onDemandSpecification: IResolvable)

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("369b092f799a27e0159f3e3505a102216d79aa0c7a478a36e719d41b750073b4")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      public fun spotSpecification(spotSpecification: IResolvable)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feb9c7ed9ccb5fa3fdaa636ef7684dde558d7eb0ffc5c6e55202ff3c6a0bea6a")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      override fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("369b092f799a27e0159f3e3505a102216d79aa0c7a478a36e719d41b750073b4")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      override fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration, provisioning timeout behavior, and allocation strategy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feb9c7ed9ccb5fa3fdaa636ef7684dde558d7eb0ffc5c6e55202ff3c6a0bea6a")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty,
    ) : CdkObject(cdkObject), InstanceFleetProvisioningSpecificationsProperty {
      /**
       * The launch specification for On-Demand Instances in the instance fleet, which determines
       * the allocation strategy.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
       * releases 5.12.1 and later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html#cfn-emr-cluster-instancefleetprovisioningspecifications-ondemandspecification)
       */
      override fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

      /**
       * The launch specification for Spot instances in the fleet, which determines the defined
       * duration, provisioning timeout behavior, and allocation strategy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html#cfn-emr-cluster-instancefleetprovisioningspecifications-spotspecification)
       */
      override fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceFleetProvisioningSpecificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceFleetProvisioningSpecificationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
    }
  }

  /**
   * Use `InstanceGroupConfig` to define instance groups for an EMR cluster.
   *
   * A cluster can not use both instance groups and instance fleets. For more information, see
   * [Create a Cluster with Instance Fleets or Uniform Instance
   * Groups](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
   * in the *Amazon EMR Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ConfigurationProperty configurationProperty_;
   * InstanceGroupConfigProperty instanceGroupConfigProperty = InstanceGroupConfigProperty.builder()
   * .instanceCount(123)
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
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build())
   * .bidPrice("bidPrice")
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .market("market")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html)
   */
  public interface InstanceGroupConfigProperty {
    /**
     * `AutoScalingPolicy` is a subproperty of the
     * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
     * property type that specifies the constraints and rules of an automatic scaling policy in Amazon
     * EMR . The automatic scaling policy defines how an instance group dynamically adds and terminates
     * EC2 instances in response to the value of a CloudWatch metric. Only core and task instance
     * groups can use automatic scaling policies. For more information, see [Using Automatic Scaling in
     * Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-autoscalingpolicy)
     */
    public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    /**
     * If specified, indicates that the instance group uses Spot Instances.
     *
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-bidprice)
     */
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * The custom AMI ID to use for the provisioned instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-customamiid)
     */
    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * EBS configurations that will be attached to each Amazon EC2 instance in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-ebsconfiguration)
     */
    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    /**
     * Target number of instances for the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-instancecount)
     */
    public fun instanceCount(): Number

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-market)
     */
    public fun market(): String? = unwrap(this).getMarket()

    /**
     * Friendly name given to the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [InstanceGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ff2b9dd21c94ae6cfe970e5b0e824d10b8cc152e3a40c855e107a70ed2802")
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

      /**
       * @param bidPrice If specified, indicates that the instance group uses Spot Instances.
       * This is the maximum price you are willing to pay for Spot Instances. Specify
       * `OnDemandPrice` to set the amount equal to the On-Demand price, or specify an amount in USD.
       */
      public fun bidPrice(bidPrice: String)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      public fun configurations(vararg configurations: Any)

      /**
       * @param customAmiId The custom AMI ID to use for the provisioned instance group.
       */
      public fun customAmiId(customAmiId: String)

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("651928770cfe2bc959b58884807e1ce30b436559d9259fb91b9ac7e79a541aff")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param instanceCount Target number of instances for the instance group. 
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param market Market type of the Amazon EC2 instances used to create a cluster node.
       */
      public fun market(market: String)

      /**
       * @param name Friendly name given to the instance group.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.builder()

      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
      }

      /**
       * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ff2b9dd21c94ae6cfe970e5b0e824d10b8cc152e3a40c855e107a70ed2802")
      override
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
          Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

      /**
       * @param bidPrice If specified, indicates that the instance group uses Spot Instances.
       * This is the maximum price you are willing to pay for Spot Instances. Specify
       * `OnDemandPrice` to set the amount equal to the On-Demand price, or specify an amount in USD.
       */
      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations Amazon EMR releases 4.x or later.
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      /**
       * @param customAmiId The custom AMI ID to use for the provisioned instance group.
       */
      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each Amazon EC2
       * instance in the instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("651928770cfe2bc959b58884807e1ce30b436559d9259fb91b9ac7e79a541aff")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      /**
       * @param instanceCount Target number of instances for the instance group. 
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The Amazon EC2 instance type for all instances in the instance group. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param market Market type of the Amazon EC2 instances used to create a cluster node.
       */
      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      /**
       * @param name Friendly name given to the instance group.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty,
    ) : CdkObject(cdkObject), InstanceGroupConfigProperty {
      /**
       * `AutoScalingPolicy` is a subproperty of the
       * [InstanceGroupConfig](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig-instancegroupconfig.html)
       * property type that specifies the constraints and rules of an automatic scaling policy in
       * Amazon EMR . The automatic scaling policy defines how an instance group dynamically adds and
       * terminates EC2 instances in response to the value of a CloudWatch metric. Only core and task
       * instance groups can use automatic scaling policies. For more information, see [Using Automatic
       * Scaling in Amazon
       * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-autoscalingpolicy)
       */
      override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

      /**
       * If specified, indicates that the instance group uses Spot Instances.
       *
       * This is the maximum price you are willing to pay for Spot Instances. Specify
       * `OnDemandPrice` to set the amount equal to the On-Demand price, or specify an amount in USD.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-bidprice)
       */
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      /**
       * Amazon EMR releases 4.x or later.
       *
       * The list of configurations supplied for an Amazon EMR cluster instance group. You can
       * specify a separate configuration for each instance group (master, core, and task).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      /**
       * The custom AMI ID to use for the provisioned instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-customamiid)
       */
      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      /**
       * EBS configurations that will be attached to each Amazon EC2 instance in the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-ebsconfiguration)
       */
      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      /**
       * Target number of instances for the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-instancecount)
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The Amazon EC2 instance type for all instances in the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * Market type of the Amazon EC2 instances used to create a cluster node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-market)
       */
      override fun market(): String? = unwrap(this).getMarket()

      /**
       * Friendly name given to the instance group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancegroupconfig.html#cfn-emr-cluster-instancegroupconfig-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty):
          InstanceGroupConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceGroupConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty
    }
  }

  /**
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   * `InstanceTypeConfig` is a sub-property of `InstanceFleetConfig` . `InstanceTypeConfig`
   * determines the EC2 instances that Amazon EMR attempts to provision to fulfill On-Demand and Spot
   * target capacities.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ConfigurationProperty configurationProperty_;
   * InstanceTypeConfigProperty instanceTypeConfigProperty = InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .weightedCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html)
   */
  public interface InstanceTypeConfigProperty {
    /**
     * The bid price for each Amazon EC2 Spot Instance type as defined by `InstanceType` .
     *
     * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
     * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-bidprice)
     */
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * The bid price, as a percentage of On-Demand price, for each Amazon EC2 Spot Instance as
     * defined by `InstanceType` .
     *
     * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
     * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
     * defaults to 100%.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
     */
    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    /**
     * A configuration classification that applies when provisioning cluster instances, which can
     * include configurations for applications and software that run on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * The custom AMI ID to use for the instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-customamiid)
     */
    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as
     * defined by `InstanceType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-ebsconfiguration)
     */
    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    /**
     * An Amazon EC2 instance type, such as `m3.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-instancetype)
     */
    public fun instanceType(): String

    /**
     * The number of units that a provisioned instance of this type provides toward fulfilling the
     * target capacities defined in `InstanceFleetConfig` .
     *
     * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
     * instance fleets. Defaults to 1 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-weightedcapacity)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [InstanceTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
       * `InstanceType` .
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       */
      public fun bidPrice(bidPrice: String)

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price, for each Amazon EC2 Spot Instance as defined by `InstanceType` .
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       */
      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      public fun configurations(configurations: List<Any>)

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      public fun configurations(vararg configurations: Any)

      /**
       * @param customAmiId The custom AMI ID to use for the instance type.
       */
      public fun customAmiId(customAmiId: String)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2a629b219a80793df3f9931317579967e7b78ea6e2fa9d3e5f9aa2490ad026a")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in `InstanceFleetConfig` .
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.builder()

      /**
       * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
       * `InstanceType` .
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       */
      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price, for each Amazon EC2 Spot Instance as defined by `InstanceType` .
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       */
      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      /**
       * @param customAmiId The custom AMI ID to use for the instance type.
       */
      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS)
       * attached to each instance as defined by `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2a629b219a80793df3f9931317579967e7b78ea6e2fa9d3e5f9aa2490ad026a")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      /**
       * @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in `InstanceFleetConfig` .
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty,
    ) : CdkObject(cdkObject), InstanceTypeConfigProperty {
      /**
       * The bid price for each Amazon EC2 Spot Instance type as defined by `InstanceType` .
       *
       * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is
       * provided, `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-bidprice)
       */
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      /**
       * The bid price, as a percentage of On-Demand price, for each Amazon EC2 Spot Instance as
       * defined by `InstanceType` .
       *
       * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
       * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice`
       * defaults to 100%.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-bidpriceaspercentageofondemandprice)
       */
      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      /**
       * A configuration classification that applies when provisioning cluster instances, which can
       * include configurations for applications and software that run on the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      /**
       * The custom AMI ID to use for the instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-customamiid)
       */
      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      /**
       * The configuration of Amazon Elastic Block Store (Amazon EBS) attached to each instance as
       * defined by `InstanceType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-ebsconfiguration)
       */
      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      /**
       * An Amazon EC2 instance type, such as `m3.xlarge` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The number of units that a provisioned instance of this type provides toward fulfilling the
       * target capacities defined in `InstanceFleetConfig` .
       *
       * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
       * instance fleets. Defaults to 1 if not specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancetypeconfig.html#cfn-emr-cluster-instancetypeconfig-weightedcapacity)
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceTypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty
    }
  }

  /**
   * `JobFlowInstancesConfig` is a property of the `AWS::EMR::Cluster` resource.
   *
   * `JobFlowInstancesConfig` defines the instance groups or instance fleets that comprise the
   * cluster. `JobFlowInstancesConfig` must contain either `InstanceFleetConfig` or
   * `InstanceGroupConfig` . They cannot be used together.
   *
   * You can now define task instance groups or task instance fleets using the `TaskInstanceGroups`
   * and `TaskInstanceFleets` subproperties. Using these subproperties reduces delays in provisioning
   * task nodes compared to specifying task nodes with the `InstanceFleetConfig` and
   * `InstanceGroupConfig` resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ConfigurationProperty configurationProperty_;
   * JobFlowInstancesConfigProperty jobFlowInstancesConfigProperty =
   * JobFlowInstancesConfigProperty.builder()
   * .additionalMasterSecurityGroups(List.of("additionalMasterSecurityGroups"))
   * .additionalSlaveSecurityGroups(List.of("additionalSlaveSecurityGroups"))
   * .coreInstanceFleet(InstanceFleetConfigProperty.builder()
   * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
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
   * .allocationStrategy("allocationStrategy")
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build())
   * .build())
   * .name("name")
   * .targetOnDemandCapacity(123)
   * .targetSpotCapacity(123)
   * .build())
   * .coreInstanceGroup(InstanceGroupConfigProperty.builder()
   * .instanceCount(123)
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
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build())
   * .bidPrice("bidPrice")
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .market("market")
   * .name("name")
   * .build())
   * .ec2KeyName("ec2KeyName")
   * .ec2SubnetId("ec2SubnetId")
   * .ec2SubnetIds(List.of("ec2SubnetIds"))
   * .emrManagedMasterSecurityGroup("emrManagedMasterSecurityGroup")
   * .emrManagedSlaveSecurityGroup("emrManagedSlaveSecurityGroup")
   * .hadoopVersion("hadoopVersion")
   * .keepJobFlowAliveWhenNoSteps(false)
   * .masterInstanceFleet(InstanceFleetConfigProperty.builder()
   * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
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
   * .allocationStrategy("allocationStrategy")
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build())
   * .build())
   * .name("name")
   * .targetOnDemandCapacity(123)
   * .targetSpotCapacity(123)
   * .build())
   * .masterInstanceGroup(InstanceGroupConfigProperty.builder()
   * .instanceCount(123)
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
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build())
   * .bidPrice("bidPrice")
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .market("market")
   * .name("name")
   * .build())
   * .placement(PlacementTypeProperty.builder()
   * .availabilityZone("availabilityZone")
   * .build())
   * .serviceAccessSecurityGroup("serviceAccessSecurityGroup")
   * .taskInstanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
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
   * .allocationStrategy("allocationStrategy")
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build())
   * .build())
   * .name("name")
   * .targetOnDemandCapacity(123)
   * .targetSpotCapacity(123)
   * .build()))
   * .taskInstanceGroups(List.of(InstanceGroupConfigProperty.builder()
   * .instanceCount(123)
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
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build())
   * .bidPrice("bidPrice")
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurationProperties(Map.of(
   * "configurationPropertiesKey", "configurationProperties"))
   * .configurations(List.of(configurationProperty_))
   * .build()))
   * .customAmiId("customAmiId")
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .market("market")
   * .name("name")
   * .build()))
   * .terminationProtected(false)
   * .unhealthyNodeReplacement(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html)
   */
  public interface JobFlowInstancesConfigProperty {
    /**
     * A list of additional Amazon EC2 security group IDs for the master node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
     */
    public fun additionalMasterSecurityGroups(): List<String> =
        unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

    /**
     * A list of additional Amazon EC2 security group IDs for the core and task nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
     */
    public fun additionalSlaveSecurityGroups(): List<String> =
        unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

    /**
     * Describes the EC2 instances and instance configurations for the core instance fleet when
     * using clusters with the instance fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-coreinstancefleet)
     */
    public fun coreInstanceFleet(): Any? = unwrap(this).getCoreInstanceFleet()

    /**
     * Describes the EC2 instances and instance configurations for core instance groups when using
     * clusters with the uniform instance group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-coreinstancegroup)
     */
    public fun coreInstanceGroup(): Any? = unwrap(this).getCoreInstanceGroup()

    /**
     * The name of the Amazon EC2 key pair that can be used to connect to the master node using SSH
     * as the user called "hadoop.".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2keyname)
     */
    public fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

    /**
     * Applies to clusters that use the uniform instance group configuration.
     *
     * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the
     * identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify
     * this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2subnetid)
     */
    public fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

    /**
     * Applies to clusters that use the instance fleet configuration.
     *
     * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
     * instances in the optimal subnet.
     *
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2subnetids)
     */
    public fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

    /**
     * The identifier of the Amazon EC2 security group for the master node.
     *
     * If you specify `EmrManagedMasterSecurityGroup` , you must also specify
     * `EmrManagedSlaveSecurityGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
     */
    public fun emrManagedMasterSecurityGroup(): String? =
        unwrap(this).getEmrManagedMasterSecurityGroup()

    /**
     * The identifier of the Amazon EC2 security group for the core and task nodes.
     *
     * If you specify `EmrManagedSlaveSecurityGroup` , you must also specify
     * `EmrManagedMasterSecurityGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
     */
    public fun emrManagedSlaveSecurityGroup(): String? =
        unwrap(this).getEmrManagedSlaveSecurityGroup()

    /**
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the
     * cluster. Valid inputs are "0.18" (no longer maintained), "0.20" (no longer maintained),
     * "0.20.205" (no longer maintained), "1.0.3", "2.2.0", or "2.4.0". If you do not set this value,
     * the default of 0.18 is used, unless the `AmiVersion` parameter is set in the RunJobFlow call, in
     * which case the default version of Hadoop for that AMI version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-hadoopversion)
     */
    public fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

    /**
     * Specifies whether the cluster should remain available after completing all steps.
     *
     * Defaults to `true` . For more information about configuring cluster termination, see [Control
     * Cluster
     * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     * in the *EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps)
     */
    public fun keepJobFlowAliveWhenNoSteps(): Any? = unwrap(this).getKeepJobFlowAliveWhenNoSteps()

    /**
     * Describes the EC2 instances and instance configurations for the master instance fleet when
     * using clusters with the instance fleet configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-masterinstancefleet)
     */
    public fun masterInstanceFleet(): Any? = unwrap(this).getMasterInstanceFleet()

    /**
     * Describes the EC2 instances and instance configurations for the master instance group when
     * using clusters with the uniform instance group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-masterinstancegroup)
     */
    public fun masterInstanceGroup(): Any? = unwrap(this).getMasterInstanceGroup()

    /**
     * The Availability Zone in which the cluster runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-placement)
     */
    public fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters
     * in VPC private subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
     */
    public fun serviceAccessSecurityGroup(): String? = unwrap(this).getServiceAccessSecurityGroup()

    /**
     * Describes the EC2 instances and instance configurations for the task instance fleets when
     * using clusters with the instance fleet configuration.
     *
     * These task instance fleets are added to the cluster as part of the cluster launch. Each task
     * instance fleet must have a unique name specified so that CloudFormation can differentiate
     * between the task instance fleets.
     *
     *
     * You can currently specify only one task instance fleet for a cluster. After creating the
     * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
     * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
     * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet, include
     * `TaskInstanceFleets` when you create your cluster. If you create your cluster without
     * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
     * maximum of five Amazon EC2 instance types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-taskinstancefleets)
     */
    public fun taskInstanceFleets(): Any? = unwrap(this).getTaskInstanceFleets()

    /**
     * Describes the EC2 instances and instance configurations for task instance groups when using
     * clusters with the uniform instance group configuration.
     *
     * These task instance groups are added to the cluster as part of the cluster launch. Each task
     * instance group must have a unique name specified so that CloudFormation can differentiate
     * between the task instance groups.
     *
     *
     * After creating the cluster, you can only modify the mutable properties of
     * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any other
     * property results in cluster replacement.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-taskinstancegroups)
     */
    public fun taskInstanceGroups(): Any? = unwrap(this).getTaskInstanceGroups()

    /**
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being
     * terminated by API call, user intervention, or in the event of a job-flow error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-terminationprotected)
     */
    public fun terminationProtected(): Any? = unwrap(this).getTerminationProtected()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-unhealthynodereplacement)
     */
    public fun unhealthyNodeReplacement(): Any? = unwrap(this).getUnhealthyNodeReplacement()

    /**
     * A builder for [JobFlowInstancesConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>)

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String)

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>)

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String)

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      public fun coreInstanceFleet(coreInstanceFleet: IResolvable)

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      public fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty)

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece8c06fdf4f69b4f87726d658d7e132bad320781884031ae69285e45e871ffe")
      public
          fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit)

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      public fun coreInstanceGroup(coreInstanceGroup: IResolvable)

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      public fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty)

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67715b405476ee62063fd050da43e4a1d168fa2721f0574cc2735773279d44e6")
      public
          fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit)

      /**
       * @param ec2KeyName The name of the Amazon EC2 key pair that can be used to connect to the
       * master node using SSH as the user called "hadoop.".
       */
      public fun ec2KeyName(ec2KeyName: String)

      /**
       * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration.
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to
       * the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not
       * specify this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
       */
      public fun ec2SubnetId(ec2SubnetId: String)

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
       * instances in the optimal subnet.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      public fun ec2SubnetIds(ec2SubnetIds: List<String>)

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
       * instances in the optimal subnet.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      public fun ec2SubnetIds(vararg ec2SubnetIds: String)

      /**
       * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for
       * the master node.
       * If you specify `EmrManagedMasterSecurityGroup` , you must also specify
       * `EmrManagedSlaveSecurityGroup` .
       */
      public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String)

      /**
       * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
       * core and task nodes.
       * If you specify `EmrManagedSlaveSecurityGroup` , you must also specify
       * `EmrManagedMasterSecurityGroup` .
       */
      public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String)

      /**
       * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The
       * Hadoop version for the cluster. Valid inputs are "0.18" (no longer maintained), "0.20" (no
       * longer maintained), "0.20.205" (no longer maintained), "1.0.3", "2.2.0", or "2.4.0". If you do
       * not set this value, the default of 0.18 is used, unless the `AmiVersion` parameter is set in
       * the RunJobFlow call, in which case the default version of Hadoop for that AMI version is used.
       */
      public fun hadoopVersion(hadoopVersion: String)

      /**
       * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
       * after completing all steps.
       * Defaults to `true` . For more information about configuring cluster termination, see
       * [Control Cluster
       * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
       * in the *EMR Management Guide* .
       */
      public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean)

      /**
       * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
       * after completing all steps.
       * Defaults to `true` . For more information about configuring cluster termination, see
       * [Control Cluster
       * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
       * in the *EMR Management Guide* .
       */
      public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable)

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      public fun masterInstanceFleet(masterInstanceFleet: IResolvable)

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      public fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty)

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d982dc921f49be4c3b292103d501661502301ce18c5701c80ce4b7afa4384215")
      public
          fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit)

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      public fun masterInstanceGroup(masterInstanceGroup: IResolvable)

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      public fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty)

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e99fd5ba5ee81ee99d08ccf02f72ac58022bdad063059bbc765db0f9f4200136")
      public
          fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit)

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      public fun placement(placement: IResolvable)

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      public fun placement(placement: PlacementTypeProperty)

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad452251bb47bde9c4adffd09ce7b373251ba37ce6c1b3400f6a5aa8f167493c")
      public fun placement(placement: PlacementTypeProperty.Builder.() -> Unit)

      /**
       * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
       * Amazon EMR service to access clusters in VPC private subnets.
       */
      public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String)

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      public fun taskInstanceFleets(taskInstanceFleets: IResolvable)

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      public fun taskInstanceFleets(taskInstanceFleets: List<Any>)

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      public fun taskInstanceFleets(vararg taskInstanceFleets: Any)

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      public fun taskInstanceGroups(taskInstanceGroups: IResolvable)

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      public fun taskInstanceGroups(taskInstanceGroups: List<Any>)

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      public fun taskInstanceGroups(vararg taskInstanceGroups: Any)

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      public fun terminationProtected(terminationProtected: Boolean)

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      public fun terminationProtected(terminationProtected: IResolvable)

      /**
       * @param unhealthyNodeReplacement the value to be set.
       */
      public fun unhealthyNodeReplacement(unhealthyNodeReplacement: Boolean)

      /**
       * @param unhealthyNodeReplacement the value to be set.
       */
      public fun unhealthyNodeReplacement(unhealthyNodeReplacement: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.builder()

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      override fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>) {
        cdkBuilder.additionalMasterSecurityGroups(additionalMasterSecurityGroups)
      }

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      override fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String):
          Unit = additionalMasterSecurityGroups(additionalMasterSecurityGroups.toList())

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      override fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>) {
        cdkBuilder.additionalSlaveSecurityGroups(additionalSlaveSecurityGroups)
      }

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      override fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String): Unit
          = additionalSlaveSecurityGroups(additionalSlaveSecurityGroups.toList())

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      override fun coreInstanceFleet(coreInstanceFleet: IResolvable) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet.let(IResolvable::unwrap))
      }

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      override fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet.let(InstanceFleetConfigProperty::unwrap))
      }

      /**
       * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the
       * core instance fleet when using clusters with the instance fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece8c06fdf4f69b4f87726d658d7e132bad320781884031ae69285e45e871ffe")
      override
          fun coreInstanceFleet(coreInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit):
          Unit = coreInstanceFleet(InstanceFleetConfigProperty(coreInstanceFleet))

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      override fun coreInstanceGroup(coreInstanceGroup: IResolvable) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup.let(IResolvable::unwrap))
      }

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      override fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup.let(InstanceGroupConfigProperty::unwrap))
      }

      /**
       * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
       * instance groups when using clusters with the uniform instance group configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67715b405476ee62063fd050da43e4a1d168fa2721f0574cc2735773279d44e6")
      override
          fun coreInstanceGroup(coreInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit):
          Unit = coreInstanceGroup(InstanceGroupConfigProperty(coreInstanceGroup))

      /**
       * @param ec2KeyName The name of the Amazon EC2 key pair that can be used to connect to the
       * master node using SSH as the user called "hadoop.".
       */
      override fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
      }

      /**
       * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration.
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to
       * the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not
       * specify this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
       */
      override fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
      }

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
       * instances in the optimal subnet.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
        cdkBuilder.ec2SubnetIds(ec2SubnetIds)
      }

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
       * instances in the optimal subnet.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
          ec2SubnetIds(ec2SubnetIds.toList())

      /**
       * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for
       * the master node.
       * If you specify `EmrManagedMasterSecurityGroup` , you must also specify
       * `EmrManagedSlaveSecurityGroup` .
       */
      override fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
      }

      /**
       * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
       * core and task nodes.
       * If you specify `EmrManagedSlaveSecurityGroup` , you must also specify
       * `EmrManagedMasterSecurityGroup` .
       */
      override fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
      }

      /**
       * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The
       * Hadoop version for the cluster. Valid inputs are "0.18" (no longer maintained), "0.20" (no
       * longer maintained), "0.20.205" (no longer maintained), "1.0.3", "2.2.0", or "2.4.0". If you do
       * not set this value, the default of 0.18 is used, unless the `AmiVersion` parameter is set in
       * the RunJobFlow call, in which case the default version of Hadoop for that AMI version is used.
       */
      override fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
      }

      /**
       * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
       * after completing all steps.
       * Defaults to `true` . For more information about configuring cluster termination, see
       * [Control Cluster
       * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
       * in the *EMR Management Guide* .
       */
      override fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
      }

      /**
       * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
       * after completing all steps.
       * Defaults to `true` . For more information about configuring cluster termination, see
       * [Control Cluster
       * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
       * in the *EMR Management Guide* .
       */
      override fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps.let(IResolvable::unwrap))
      }

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      override fun masterInstanceFleet(masterInstanceFleet: IResolvable) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet.let(IResolvable::unwrap))
      }

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      override fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet.let(InstanceFleetConfigProperty::unwrap))
      }

      /**
       * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
       * master instance fleet when using clusters with the instance fleet configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d982dc921f49be4c3b292103d501661502301ce18c5701c80ce4b7afa4384215")
      override
          fun masterInstanceFleet(masterInstanceFleet: InstanceFleetConfigProperty.Builder.() -> Unit):
          Unit = masterInstanceFleet(InstanceFleetConfigProperty(masterInstanceFleet))

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      override fun masterInstanceGroup(masterInstanceGroup: IResolvable) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup.let(IResolvable::unwrap))
      }

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      override fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup.let(InstanceGroupConfigProperty::unwrap))
      }

      /**
       * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
       * master instance group when using clusters with the uniform instance group configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e99fd5ba5ee81ee99d08ccf02f72ac58022bdad063059bbc765db0f9f4200136")
      override
          fun masterInstanceGroup(masterInstanceGroup: InstanceGroupConfigProperty.Builder.() -> Unit):
          Unit = masterInstanceGroup(InstanceGroupConfigProperty(masterInstanceGroup))

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      override fun placement(placement: PlacementTypeProperty) {
        cdkBuilder.placement(placement.let(PlacementTypeProperty::unwrap))
      }

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad452251bb47bde9c4adffd09ce7b373251ba37ce6c1b3400f6a5aa8f167493c")
      override fun placement(placement: PlacementTypeProperty.Builder.() -> Unit): Unit =
          placement(PlacementTypeProperty(placement))

      /**
       * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
       * Amazon EMR service to access clusters in VPC private subnets.
       */
      override fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
      }

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      override fun taskInstanceFleets(taskInstanceFleets: IResolvable) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets.let(IResolvable::unwrap))
      }

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      override fun taskInstanceFleets(taskInstanceFleets: List<Any>) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets)
      }

      /**
       * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
       * task instance fleets when using clusters with the instance fleet configuration.
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       */
      override fun taskInstanceFleets(vararg taskInstanceFleets: Any): Unit =
          taskInstanceFleets(taskInstanceFleets.toList())

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      override fun taskInstanceGroups(taskInstanceGroups: IResolvable) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups.let(IResolvable::unwrap))
      }

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      override fun taskInstanceGroups(taskInstanceGroups: List<Any>) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups)
      }

      /**
       * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
       * instance groups when using clusters with the uniform instance group configuration.
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       */
      override fun taskInstanceGroups(vararg taskInstanceGroups: Any): Unit =
          taskInstanceGroups(taskInstanceGroups.toList())

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      override fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
      }

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      override fun terminationProtected(terminationProtected: IResolvable) {
        cdkBuilder.terminationProtected(terminationProtected.let(IResolvable::unwrap))
      }

      /**
       * @param unhealthyNodeReplacement the value to be set.
       */
      override fun unhealthyNodeReplacement(unhealthyNodeReplacement: Boolean) {
        cdkBuilder.unhealthyNodeReplacement(unhealthyNodeReplacement)
      }

      /**
       * @param unhealthyNodeReplacement the value to be set.
       */
      override fun unhealthyNodeReplacement(unhealthyNodeReplacement: IResolvable) {
        cdkBuilder.unhealthyNodeReplacement(unhealthyNodeReplacement.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty,
    ) : CdkObject(cdkObject), JobFlowInstancesConfigProperty {
      /**
       * A list of additional Amazon EC2 security group IDs for the master node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-additionalmastersecuritygroups)
       */
      override fun additionalMasterSecurityGroups(): List<String> =
          unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

      /**
       * A list of additional Amazon EC2 security group IDs for the core and task nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-additionalslavesecuritygroups)
       */
      override fun additionalSlaveSecurityGroups(): List<String> =
          unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

      /**
       * Describes the EC2 instances and instance configurations for the core instance fleet when
       * using clusters with the instance fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-coreinstancefleet)
       */
      override fun coreInstanceFleet(): Any? = unwrap(this).getCoreInstanceFleet()

      /**
       * Describes the EC2 instances and instance configurations for core instance groups when using
       * clusters with the uniform instance group configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-coreinstancegroup)
       */
      override fun coreInstanceGroup(): Any? = unwrap(this).getCoreInstanceGroup()

      /**
       * The name of the Amazon EC2 key pair that can be used to connect to the master node using
       * SSH as the user called "hadoop.".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2keyname)
       */
      override fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

      /**
       * Applies to clusters that use the uniform instance group configuration.
       *
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to
       * the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not
       * specify this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2subnetid)
       */
      override fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

      /**
       * Applies to clusters that use the instance fleet configuration.
       *
       * When multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
       * instances in the optimal subnet.
       *
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-ec2subnetids)
       */
      override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

      /**
       * The identifier of the Amazon EC2 security group for the master node.
       *
       * If you specify `EmrManagedMasterSecurityGroup` , you must also specify
       * `EmrManagedSlaveSecurityGroup` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup)
       */
      override fun emrManagedMasterSecurityGroup(): String? =
          unwrap(this).getEmrManagedMasterSecurityGroup()

      /**
       * The identifier of the Amazon EC2 security group for the core and task nodes.
       *
       * If you specify `EmrManagedSlaveSecurityGroup` , you must also specify
       * `EmrManagedMasterSecurityGroup` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup)
       */
      override fun emrManagedSlaveSecurityGroup(): String? =
          unwrap(this).getEmrManagedSlaveSecurityGroup()

      /**
       * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the
       * cluster. Valid inputs are "0.18" (no longer maintained), "0.20" (no longer maintained),
       * "0.20.205" (no longer maintained), "1.0.3", "2.2.0", or "2.4.0". If you do not set this value,
       * the default of 0.18 is used, unless the `AmiVersion` parameter is set in the RunJobFlow call,
       * in which case the default version of Hadoop for that AMI version is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-hadoopversion)
       */
      override fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

      /**
       * Specifies whether the cluster should remain available after completing all steps.
       *
       * Defaults to `true` . For more information about configuring cluster termination, see
       * [Control Cluster
       * Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
       * in the *EMR Management Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps)
       */
      override fun keepJobFlowAliveWhenNoSteps(): Any? =
          unwrap(this).getKeepJobFlowAliveWhenNoSteps()

      /**
       * Describes the EC2 instances and instance configurations for the master instance fleet when
       * using clusters with the instance fleet configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-masterinstancefleet)
       */
      override fun masterInstanceFleet(): Any? = unwrap(this).getMasterInstanceFleet()

      /**
       * Describes the EC2 instances and instance configurations for the master instance group when
       * using clusters with the uniform instance group configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-masterinstancegroup)
       */
      override fun masterInstanceGroup(): Any? = unwrap(this).getMasterInstanceGroup()

      /**
       * The Availability Zone in which the cluster runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-placement)
       */
      override fun placement(): Any? = unwrap(this).getPlacement()

      /**
       * The identifier of the Amazon EC2 security group for the Amazon EMR service to access
       * clusters in VPC private subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup)
       */
      override fun serviceAccessSecurityGroup(): String? =
          unwrap(this).getServiceAccessSecurityGroup()

      /**
       * Describes the EC2 instances and instance configurations for the task instance fleets when
       * using clusters with the instance fleet configuration.
       *
       * These task instance fleets are added to the cluster as part of the cluster launch. Each
       * task instance fleet must have a unique name specified so that CloudFormation can differentiate
       * between the task instance fleets.
       *
       *
       * You can currently specify only one task instance fleet for a cluster. After creating the
       * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
       * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
       * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
       * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
       * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
       * maximum of five Amazon EC2 instance types.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-taskinstancefleets)
       */
      override fun taskInstanceFleets(): Any? = unwrap(this).getTaskInstanceFleets()

      /**
       * Describes the EC2 instances and instance configurations for task instance groups when using
       * clusters with the uniform instance group configuration.
       *
       * These task instance groups are added to the cluster as part of the cluster launch. Each
       * task instance group must have a unique name specified so that CloudFormation can differentiate
       * between the task instance groups.
       *
       *
       * After creating the cluster, you can only modify the mutable properties of
       * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
       * other property results in cluster replacement.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-taskinstancegroups)
       */
      override fun taskInstanceGroups(): Any? = unwrap(this).getTaskInstanceGroups()

      /**
       * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being
       * terminated by API call, user intervention, or in the event of a job-flow error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-terminationprotected)
       */
      override fun terminationProtected(): Any? = unwrap(this).getTerminationProtected()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html#cfn-emr-cluster-jobflowinstancesconfig-unhealthynodereplacement)
       */
      override fun unhealthyNodeReplacement(): Any? = unwrap(this).getUnhealthyNodeReplacement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobFlowInstancesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty):
          JobFlowInstancesConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JobFlowInstancesConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobFlowInstancesConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty
    }
  }

  /**
   * `KerberosAttributes` is a property of the `AWS::EMR::Cluster` resource.
   *
   * `KerberosAttributes` define the cluster-specific Kerberos configuration when Kerberos
   * authentication is enabled using a security configuration. The cluster-specific configuration must
   * be compatible with the security configuration. For more information see [Use Kerberos
   * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
   * *EMR Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
   * .kdcAdminPassword("kdcAdminPassword")
   * .realm("realm")
   * // the properties below are optional
   * .adDomainJoinPassword("adDomainJoinPassword")
   * .adDomainJoinUser("adDomainJoinUser")
   * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html)
   */
  public interface KerberosAttributesProperty {
    /**
     * The Active Directory password for `ADDomainJoinUser` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-addomainjoinpassword)
     */
    public fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain.
     *
     * A user with sufficient privileges to join resources to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-addomainjoinuser)
     */
    public fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm.
     *
     * The cross-realm principal password, which must be identical across realms.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-crossrealmtrustprincipalpassword)
     */
    public fun crossRealmTrustPrincipalPassword(): String? =
        unwrap(this).getCrossRealmTrustPrincipalPassword()

    /**
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC,
     * which maintains Kerberos principals, password policies, and keytabs for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-kdcadminpassword)
     */
    public fun kdcAdminPassword(): String

    /**
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     *
     * For example, `EC2.INTERNAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-realm)
     */
    public fun realm(): String

    /**
     * A builder for [KerberosAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adDomainJoinPassword The Active Directory password for `ADDomainJoinUser` .
       */
      public fun adDomainJoinPassword(adDomainJoinPassword: String)

      /**
       * @param adDomainJoinUser Required only when establishing a cross-realm trust with an Active
       * Directory domain.
       * A user with sufficient privileges to join resources to the domain.
       */
      public fun adDomainJoinUser(adDomainJoinUser: String)

      /**
       * @param crossRealmTrustPrincipalPassword Required only when establishing a cross-realm trust
       * with a KDC in a different realm.
       * The cross-realm principal password, which must be identical across realms.
       */
      public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String)

      /**
       * @param kdcAdminPassword The password used within the cluster for the kadmin service on the
       * cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for
       * the cluster. 
       */
      public fun kdcAdminPassword(kdcAdminPassword: String)

      /**
       * @param realm The name of the Kerberos realm to which all nodes in a cluster belong. 
       * For example, `EC2.INTERNAL` .
       */
      public fun realm(realm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.builder()

      /**
       * @param adDomainJoinPassword The Active Directory password for `ADDomainJoinUser` .
       */
      override fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
      }

      /**
       * @param adDomainJoinUser Required only when establishing a cross-realm trust with an Active
       * Directory domain.
       * A user with sufficient privileges to join resources to the domain.
       */
      override fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
      }

      /**
       * @param crossRealmTrustPrincipalPassword Required only when establishing a cross-realm trust
       * with a KDC in a different realm.
       * The cross-realm principal password, which must be identical across realms.
       */
      override fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
      }

      /**
       * @param kdcAdminPassword The password used within the cluster for the kadmin service on the
       * cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for
       * the cluster. 
       */
      override fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
      }

      /**
       * @param realm The name of the Kerberos realm to which all nodes in a cluster belong. 
       * For example, `EC2.INTERNAL` .
       */
      override fun realm(realm: String) {
        cdkBuilder.realm(realm)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty,
    ) : CdkObject(cdkObject), KerberosAttributesProperty {
      /**
       * The Active Directory password for `ADDomainJoinUser` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-addomainjoinpassword)
       */
      override fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

      /**
       * Required only when establishing a cross-realm trust with an Active Directory domain.
       *
       * A user with sufficient privileges to join resources to the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-addomainjoinuser)
       */
      override fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

      /**
       * Required only when establishing a cross-realm trust with a KDC in a different realm.
       *
       * The cross-realm principal password, which must be identical across realms.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-crossrealmtrustprincipalpassword)
       */
      override fun crossRealmTrustPrincipalPassword(): String? =
          unwrap(this).getCrossRealmTrustPrincipalPassword()

      /**
       * The password used within the cluster for the kadmin service on the cluster-dedicated KDC,
       * which maintains Kerberos principals, password policies, and keytabs for the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-kdcadminpassword)
       */
      override fun kdcAdminPassword(): String = unwrap(this).getKdcAdminPassword()

      /**
       * The name of the Kerberos realm to which all nodes in a cluster belong.
       *
       * For example, `EC2.INTERNAL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html#cfn-emr-cluster-kerberosattributes-realm)
       */
      override fun realm(): String = unwrap(this).getRealm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KerberosAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty):
          KerberosAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KerberosAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KerberosAttributesProperty):
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty
    }
  }

  /**
   * `KeyValue` is a subproperty of the `HadoopJarStepConfig` property type.
   *
   * `KeyValue` is used to pass parameters to a step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html)
   */
  public interface KeyValueProperty {
    /**
     * The unique identifier of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html#cfn-emr-cluster-keyvalue-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value part of the identified key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html#cfn-emr-cluster-keyvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [KeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The unique identifier of a key-value pair.
       */
      public fun key(key: String)

      /**
       * @param value The value part of the identified key.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.builder()

      /**
       * @param key The unique identifier of a key-value pair.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value part of the identified key.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty,
    ) : CdkObject(cdkObject), KeyValueProperty {
      /**
       * The unique identifier of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html#cfn-emr-cluster-keyvalue-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value part of the identified key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-keyvalue.html#cfn-emr-cluster-keyvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty):
          KeyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty
    }
  }

  /**
   * Managed scaling policy for an Amazon EMR cluster.
   *
   * The policy specifies the limits for resources that can be added or terminated from a cluster.
   * The policy only applies to the core and task nodes. The master node cannot be scaled after initial
   * configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ManagedScalingPolicyProperty managedScalingPolicyProperty =
   * ManagedScalingPolicyProperty.builder()
   * .computeLimits(ComputeLimitsProperty.builder()
   * .maximumCapacityUnits(123)
   * .minimumCapacityUnits(123)
   * .unitType("unitType")
   * // the properties below are optional
   * .maximumCoreCapacityUnits(123)
   * .maximumOnDemandCapacityUnits(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-managedscalingpolicy.html)
   */
  public interface ManagedScalingPolicyProperty {
    /**
     * The Amazon EC2 unit limits for a managed scaling policy.
     *
     * The managed scaling activity of a cluster is not allowed to go above or below these limits.
     * The limit only applies to the core and task nodes. The master node cannot be scaled after
     * initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-managedscalingpolicy.html#cfn-emr-cluster-managedscalingpolicy-computelimits)
     */
    public fun computeLimits(): Any? = unwrap(this).getComputeLimits()

    /**
     * A builder for [ManagedScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      public fun computeLimits(computeLimits: IResolvable)

      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      public fun computeLimits(computeLimits: ComputeLimitsProperty)

      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bc72e2e9aa925adeed929babb4791327d9958ad0bd79ae634df9497a8bec64")
      public fun computeLimits(computeLimits: ComputeLimitsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty.builder()

      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      override fun computeLimits(computeLimits: IResolvable) {
        cdkBuilder.computeLimits(computeLimits.let(IResolvable::unwrap))
      }

      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      override fun computeLimits(computeLimits: ComputeLimitsProperty) {
        cdkBuilder.computeLimits(computeLimits.let(ComputeLimitsProperty::unwrap))
      }

      /**
       * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bc72e2e9aa925adeed929babb4791327d9958ad0bd79ae634df9497a8bec64")
      override fun computeLimits(computeLimits: ComputeLimitsProperty.Builder.() -> Unit): Unit =
          computeLimits(ComputeLimitsProperty(computeLimits))

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty,
    ) : CdkObject(cdkObject), ManagedScalingPolicyProperty {
      /**
       * The Amazon EC2 unit limits for a managed scaling policy.
       *
       * The managed scaling activity of a cluster is not allowed to go above or below these limits.
       * The limit only applies to the core and task nodes. The master node cannot be scaled after
       * initial configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-managedscalingpolicy.html#cfn-emr-cluster-managedscalingpolicy-computelimits)
       */
      override fun computeLimits(): Any? = unwrap(this).getComputeLimits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty):
          ManagedScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedScalingPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ManagedScalingPolicyProperty
    }
  }

  /**
   * `MetricDimension` is a subproperty of the `CloudWatchAlarmDefinition` property type.
   *
   * `MetricDimension` specifies a CloudWatch dimension, which is specified with a `Key` `Value`
   * pair. The key is known as a `Name` in CloudWatch. By default, Amazon EMR uses one dimension whose
   * `Key` is `JobFlowID` and `Value` is a variable representing the cluster ID, which is
   * `${emr.clusterId}` . This enables the automatic scaling rule for EMR to bootstrap when the cluster
   * ID becomes available during cluster creation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * The dimension name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html#cfn-emr-cluster-metricdimension-key)
     */
    public fun key(): String

    /**
     * The dimension value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html#cfn-emr-cluster-metricdimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The dimension name. 
       */
      public fun key(key: String)

      /**
       * @param value The dimension value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.builder()

      /**
       * @param key The dimension name. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The dimension value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The dimension name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html#cfn-emr-cluster-metricdimension-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The dimension value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-metricdimension.html#cfn-emr-cluster-metricdimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty):
          MetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty
    }
  }

  /**
   * The launch specification for On-Demand Instances in the instance fleet, which determines the
   * allocation strategy.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
   * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
   * releases 5.12.1 and later.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * OnDemandProvisioningSpecificationProperty onDemandProvisioningSpecificationProperty =
   * OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy("allocationStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ondemandprovisioningspecification.html)
   */
  public interface OnDemandProvisioningSpecificationProperty {
    /**
     * Specifies the strategy to use in launching On-Demand instance fleets.
     *
     * Currently, the only option is `lowest-price` (the default), which launches the lowest price
     * first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ondemandprovisioningspecification.html#cfn-emr-cluster-ondemandprovisioningspecification-allocationstrategy)
     */
    public fun allocationStrategy(): String

    /**
     * A builder for [OnDemandProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       */
      public fun allocationStrategy(allocationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), OnDemandProvisioningSpecificationProperty {
      /**
       * Specifies the strategy to use in launching On-Demand instance fleets.
       *
       * Currently, the only option is `lowest-price` (the default), which launches the lowest price
       * first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-ondemandprovisioningspecification.html#cfn-emr-cluster-ondemandprovisioningspecification-allocationstrategy)
       */
      override fun allocationStrategy(): String = unwrap(this).getAllocationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnDemandProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnDemandProvisioningSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty
    }
  }

  /**
   * Placement group configuration for an Amazon EMR cluster.
   *
   * The configuration specifies the placement strategy that can be applied to instance roles during
   * cluster creation.
   *
   * To use this configuration, consider attaching managed policy
   * AmazonElasticMapReducePlacementGroupPolicy to the Amazon EMR role.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * PlacementGroupConfigProperty placementGroupConfigProperty =
   * PlacementGroupConfigProperty.builder()
   * .instanceRole("instanceRole")
   * // the properties below are optional
   * .placementStrategy("placementStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html)
   */
  public interface PlacementGroupConfigProperty {
    /**
     * Role of the instance in the cluster.
     *
     * Starting with Amazon EMR release 5.23.0, the only supported instance role is `MASTER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html#cfn-emr-cluster-placementgroupconfig-instancerole)
     */
    public fun instanceRole(): String

    /**
     * Amazon EC2 Placement Group strategy associated with instance role.
     *
     * Starting with Amazon EMR release 5.23.0, the only supported placement strategy is `SPREAD`
     * for the `MASTER` instance role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html#cfn-emr-cluster-placementgroupconfig-placementstrategy)
     */
    public fun placementStrategy(): String? = unwrap(this).getPlacementStrategy()

    /**
     * A builder for [PlacementGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceRole Role of the instance in the cluster. 
       * Starting with Amazon EMR release 5.23.0, the only supported instance role is `MASTER` .
       */
      public fun instanceRole(instanceRole: String)

      /**
       * @param placementStrategy Amazon EC2 Placement Group strategy associated with instance role.
       * Starting with Amazon EMR release 5.23.0, the only supported placement strategy is `SPREAD`
       * for the `MASTER` instance role.
       */
      public fun placementStrategy(placementStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty.builder()

      /**
       * @param instanceRole Role of the instance in the cluster. 
       * Starting with Amazon EMR release 5.23.0, the only supported instance role is `MASTER` .
       */
      override fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
      }

      /**
       * @param placementStrategy Amazon EC2 Placement Group strategy associated with instance role.
       * Starting with Amazon EMR release 5.23.0, the only supported placement strategy is `SPREAD`
       * for the `MASTER` instance role.
       */
      override fun placementStrategy(placementStrategy: String) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty,
    ) : CdkObject(cdkObject), PlacementGroupConfigProperty {
      /**
       * Role of the instance in the cluster.
       *
       * Starting with Amazon EMR release 5.23.0, the only supported instance role is `MASTER` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html#cfn-emr-cluster-placementgroupconfig-instancerole)
       */
      override fun instanceRole(): String = unwrap(this).getInstanceRole()

      /**
       * Amazon EC2 Placement Group strategy associated with instance role.
       *
       * Starting with Amazon EMR release 5.23.0, the only supported placement strategy is `SPREAD`
       * for the `MASTER` instance role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementgroupconfig.html#cfn-emr-cluster-placementgroupconfig-placementstrategy)
       */
      override fun placementStrategy(): String? = unwrap(this).getPlacementStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty):
          PlacementGroupConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementGroupConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementGroupConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.PlacementGroupConfigProperty
    }
  }

  /**
   * `PlacementType` is a property of the `AWS::EMR::Cluster` resource.
   *
   * `PlacementType` determines the Amazon EC2 Availability Zone configuration of the cluster (job
   * flow).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * PlacementTypeProperty placementTypeProperty = PlacementTypeProperty.builder()
   * .availabilityZone("availabilityZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementtype.html)
   */
  public interface PlacementTypeProperty {
    /**
     * The Amazon EC2 Availability Zone for the cluster.
     *
     * `AvailabilityZone` is used for uniform instance groups, while `AvailabilityZones` (plural) is
     * used for instance fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementtype.html#cfn-emr-cluster-placementtype-availabilityzone)
     */
    public fun availabilityZone(): String

    /**
     * A builder for [PlacementTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Amazon EC2 Availability Zone for the cluster. 
       * `AvailabilityZone` is used for uniform instance groups, while `AvailabilityZones` (plural)
       * is used for instance fleets.
       */
      public fun availabilityZone(availabilityZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.builder()

      /**
       * @param availabilityZone The Amazon EC2 Availability Zone for the cluster. 
       * `AvailabilityZone` is used for uniform instance groups, while `AvailabilityZones` (plural)
       * is used for instance fleets.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty,
    ) : CdkObject(cdkObject), PlacementTypeProperty {
      /**
       * The Amazon EC2 Availability Zone for the cluster.
       *
       * `AvailabilityZone` is used for uniform instance groups, while `AvailabilityZones` (plural)
       * is used for instance fleets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-placementtype.html#cfn-emr-cluster-placementtype-availabilityzone)
       */
      override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty):
          PlacementTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? PlacementTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTypeProperty):
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty
    }
  }

  /**
   * `ScalingAction` is a subproperty of the `ScalingRule` property type.
   *
   * `ScalingAction` determines the type of adjustment the automatic scaling activity makes when
   * triggered, and the periodicity of the adjustment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html)
   */
  public interface ScalingActionProperty {
    /**
     * Not available for instance groups.
     *
     * Instance groups use the market type specified for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html#cfn-emr-cluster-scalingaction-market)
     */
    public fun market(): String? = unwrap(this).getMarket()

    /**
     * The type of adjustment the automatic scaling activity makes when triggered, and the
     * periodicity of the adjustment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html#cfn-emr-cluster-scalingaction-simplescalingpolicyconfiguration)
     */
    public fun simpleScalingPolicyConfiguration(): Any

    /**
     * A builder for [ScalingActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      public fun market(market: String)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b02d666cf409d0da791d543a5027ae708d2738f5d4eb69d19393c49afb51a0")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.builder()

      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      override fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b02d666cf409d0da791d543a5027ae708d2738f5d4eb69d19393c49afb51a0")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty,
    ) : CdkObject(cdkObject), ScalingActionProperty {
      /**
       * Not available for instance groups.
       *
       * Instance groups use the market type specified for the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html#cfn-emr-cluster-scalingaction-market)
       */
      override fun market(): String? = unwrap(this).getMarket()

      /**
       * The type of adjustment the automatic scaling activity makes when triggered, and the
       * periodicity of the adjustment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html#cfn-emr-cluster-scalingaction-simplescalingpolicyconfiguration)
       */
      override fun simpleScalingPolicyConfiguration(): Any =
          unwrap(this).getSimpleScalingPolicyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty):
          ScalingActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty
    }
  }

  /**
   * `ScalingConstraints` is a subproperty of the `AutoScalingPolicy` property type.
   *
   * `ScalingConstraints` defines the upper and lower EC2 instance limits for an automatic scaling
   * policy. Automatic scaling activities triggered by automatic scaling rules will not cause an
   * instance group to grow above or shrink below these limits.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html)
   */
  public interface ScalingConstraintsProperty {
    /**
     * The upper boundary of Amazon EC2 instances in an instance group beyond which scaling
     * activities are not allowed to grow.
     *
     * Scale-out activities will not add instances beyond this boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html#cfn-emr-cluster-scalingconstraints-maxcapacity)
     */
    public fun maxCapacity(): Number

    /**
     * The lower boundary of Amazon EC2 instances in an instance group below which scaling
     * activities are not allowed to shrink.
     *
     * Scale-in activities will not terminate instances below this boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html#cfn-emr-cluster-scalingconstraints-mincapacity)
     */
    public fun minCapacity(): Number

    /**
     * A builder for [ScalingConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The upper boundary of Amazon EC2 instances in an instance group beyond
       * which scaling activities are not allowed to grow. 
       * Scale-out activities will not add instances beyond this boundary.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The lower boundary of Amazon EC2 instances in an instance group below
       * which scaling activities are not allowed to shrink. 
       * Scale-in activities will not terminate instances below this boundary.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.builder()

      /**
       * @param maxCapacity The upper boundary of Amazon EC2 instances in an instance group beyond
       * which scaling activities are not allowed to grow. 
       * Scale-out activities will not add instances beyond this boundary.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The lower boundary of Amazon EC2 instances in an instance group below
       * which scaling activities are not allowed to shrink. 
       * Scale-in activities will not terminate instances below this boundary.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty,
    ) : CdkObject(cdkObject), ScalingConstraintsProperty {
      /**
       * The upper boundary of Amazon EC2 instances in an instance group beyond which scaling
       * activities are not allowed to grow.
       *
       * Scale-out activities will not add instances beyond this boundary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html#cfn-emr-cluster-scalingconstraints-maxcapacity)
       */
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      /**
       * The lower boundary of Amazon EC2 instances in an instance group below which scaling
       * activities are not allowed to shrink.
       *
       * Scale-in activities will not terminate instances below this boundary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingconstraints.html#cfn-emr-cluster-scalingconstraints-mincapacity)
       */
      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty):
          ScalingConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty
    }
  }

  /**
   * `ScalingRule` is a subproperty of the `AutoScalingPolicy` property type.
   *
   * `ScalingRule` defines the scale-in or scale-out rules for scaling activity, including the
   * CloudWatch metric alarm that triggers activity, how EC2 instances are added or removed, and the
   * periodicity of adjustments. The automatic scaling policy for an instance group can comprise one or
   * more automatic scaling rules.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
   * .action(ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market("market")
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html)
   */
  public interface ScalingRuleProperty {
    /**
     * The conditions that trigger an automatic scaling activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-action)
     */
    public fun action(): Any

    /**
     * A friendly, more verbose description of the automatic scaling rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name used to identify an automatic scaling rule.
     *
     * Rule names must be unique within a scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-name)
     */
    public fun name(): String

    /**
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-trigger)
     */
    public fun trigger(): Any

    /**
     * A builder for [ScalingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      public fun action(action: ScalingActionProperty)

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54312c2345469e16a1b194b05d183d8df3a94ae8cf715d7d9766ff89c6fcbf4f")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      public fun description(description: String)

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      public fun name(name: String)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      public fun trigger(trigger: IResolvable)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      public fun trigger(trigger: ScalingTriggerProperty)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed9f626671d043fbff78c239a39dc75380aaa27f98ca356653fb9b4b4426fa22")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.builder()

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54312c2345469e16a1b194b05d183d8df3a94ae8cf715d7d9766ff89c6fcbf4f")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      override fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger.let(IResolvable::unwrap))
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed9f626671d043fbff78c239a39dc75380aaa27f98ca356653fb9b4b4426fa22")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty,
    ) : CdkObject(cdkObject), ScalingRuleProperty {
      /**
       * The conditions that trigger an automatic scaling activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * A friendly, more verbose description of the automatic scaling rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name used to identify an automatic scaling rule.
       *
       * Rule names must be unique within a scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The CloudWatch alarm definition that determines when automatic scaling activity is
       * triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingrule.html#cfn-emr-cluster-scalingrule-trigger)
       */
      override fun trigger(): Any = unwrap(this).getTrigger()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty):
          ScalingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty
    }
  }

  /**
   * `ScalingTrigger` is a subproperty of the `ScalingRule` property type.
   *
   * `ScalingTrigger` determines the conditions that trigger an automatic scaling activity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .metricName("metricName")
   * .period(123)
   * .threshold(123)
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic("statistic")
   * .unit("unit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingtrigger.html)
   */
  public interface ScalingTriggerProperty {
    /**
     * The definition of a CloudWatch metric alarm.
     *
     * When the defined alarm conditions are met along with other trigger parameters, scaling
     * activity begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingtrigger.html#cfn-emr-cluster-scalingtrigger-cloudwatchalarmdefinition)
     */
    public fun cloudWatchAlarmDefinition(): Any

    /**
     * A builder for [ScalingTriggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable)

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("428bcdc3c65c762349543882ce1e400491bb34b9504fac0dc7b95f64dc197e49")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.builder()

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      override fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("428bcdc3c65c762349543882ce1e400491bb34b9504fac0dc7b95f64dc197e49")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty,
    ) : CdkObject(cdkObject), ScalingTriggerProperty {
      /**
       * The definition of a CloudWatch metric alarm.
       *
       * When the defined alarm conditions are met along with other trigger parameters, scaling
       * activity begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingtrigger.html#cfn-emr-cluster-scalingtrigger-cloudwatchalarmdefinition)
       */
      override fun cloudWatchAlarmDefinition(): Any = unwrap(this).getCloudWatchAlarmDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty):
          ScalingTriggerProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingTriggerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty
    }
  }

  /**
   * `ScriptBootstrapActionConfig` is a subproperty of the `BootstrapActionConfig` property type.
   *
   * `ScriptBootstrapActionConfig` specifies the arguments and location of the bootstrap script for
   * EMR to run on all cluster nodes before it installs open-source big data applications on them.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
   * ScriptBootstrapActionConfigProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .args(List.of("args"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html)
   */
  public interface ScriptBootstrapActionConfigProperty {
    /**
     * A list of command line arguments to pass to the bootstrap action script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html#cfn-emr-cluster-scriptbootstrapactionconfig-args)
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * Location in Amazon S3 of the script to run during a bootstrap action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html#cfn-emr-cluster-scriptbootstrapactionconfig-path)
     */
    public fun path(): String

    /**
     * A builder for [ScriptBootstrapActionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      public fun args(args: List<String>)

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      public fun args(vararg args: String)

      /**
       * @param path Location in Amazon S3 of the script to run during a bootstrap action. 
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.builder()

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param path Location in Amazon S3 of the script to run during a bootstrap action. 
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), ScriptBootstrapActionConfigProperty {
      /**
       * A list of command line arguments to pass to the bootstrap action script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html#cfn-emr-cluster-scriptbootstrapactionconfig-args)
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * Location in Amazon S3 of the script to run during a bootstrap action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scriptbootstrapactionconfig.html#cfn-emr-cluster-scriptbootstrapactionconfig-path)
       */
      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScriptBootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty):
          ScriptBootstrapActionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScriptBootstrapActionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptBootstrapActionConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty
    }
  }

  /**
   * `SimpleScalingPolicyConfiguration` is a subproperty of the `ScalingAction` property type.
   *
   * `SimpleScalingPolicyConfiguration` determines how an automatic scaling action adds or removes
   * instances, the cooldown period, and the number of EC2 instances that are added each time the
   * CloudWatch metric alarm condition is satisfied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
   * SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType("adjustmentType")
   * .coolDown(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html)
   */
  public interface SimpleScalingPolicyConfigurationProperty {
    /**
     * The way in which Amazon EC2 instances are added (if `ScalingAdjustment` is a positive number)
     * or terminated (if `ScalingAdjustment` is a negative number) each time the scaling activity is
     * triggered.
     *
     * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
     * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as an
     * integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements by
     * the percentage specified by `ScalingAdjustment` , which should be expressed as an integer. For
     * example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
     * indicates the scaling activity results in an instance group with the number of Amazon EC2
     * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-adjustmenttype)
     */
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    /**
     * The amount of time, in seconds, after a scaling activity completes before any further
     * trigger-related scaling activities can start.
     *
     * The default value is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-cooldown)
     */
    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    /**
     * The amount by which to scale in or scale out, based on the specified `AdjustmentType` .
     *
     * A positive value adds to the instance group's Amazon EC2 instance count while a negative
     * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
     * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
     * value should express the percentage as an integer. For example, -20 indicates a decrease in 20%
     * increments of cluster capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-scalingadjustment)
     */
    public fun scalingAdjustment(): Number

    /**
     * A builder for [SimpleScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adjustmentType The way in which Amazon EC2 instances are added (if
       * `ScalingAdjustment` is a positive number) or terminated (if `ScalingAdjustment` is a negative
       * number) each time the scaling activity is triggered.
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       */
      public fun adjustmentType(adjustmentType: String)

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       * The default value is 0.
       */
      public fun coolDown(coolDown: Number)

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified `AdjustmentType` . 
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.builder()

      /**
       * @param adjustmentType The way in which Amazon EC2 instances are added (if
       * `ScalingAdjustment` is a positive number) or terminated (if `ScalingAdjustment` is a negative
       * number) each time the scaling activity is triggered.
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       */
      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       * The default value is 0.
       */
      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified `AdjustmentType` . 
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), SimpleScalingPolicyConfigurationProperty {
      /**
       * The way in which Amazon EC2 instances are added (if `ScalingAdjustment` is a positive
       * number) or terminated (if `ScalingAdjustment` is a negative number) each time the scaling
       * activity is triggered.
       *
       * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
       * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as
       * an integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements
       * by the percentage specified by `ScalingAdjustment` , which should be expressed as an integer.
       * For example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
       * indicates the scaling activity results in an instance group with the number of Amazon EC2
       * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-adjustmenttype)
       */
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      /**
       * The amount of time, in seconds, after a scaling activity completes before any further
       * trigger-related scaling activities can start.
       *
       * The default value is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-cooldown)
       */
      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      /**
       * The amount by which to scale in or scale out, based on the specified `AdjustmentType` .
       *
       * A positive value adds to the instance group's Amazon EC2 instance count while a negative
       * number removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should
       * only be a positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the
       * value should express the percentage as an integer. For example, -20 indicates a decrease in
       * 20% increments of cluster capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-simplescalingpolicyconfiguration.html#cfn-emr-cluster-simplescalingpolicyconfiguration-scalingadjustment)
       */
      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SimpleScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SimpleScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty
    }
  }

  /**
   * `SpotProvisioningSpecification` is a subproperty of the
   * `InstanceFleetProvisioningSpecifications` property type.
   *
   * `SpotProvisioningSpecification` determines the launch specification for Spot instances in the
   * instance fleet, which includes the defined duration and provisioning timeout behavior.
   *
   *
   * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
   * excluding 5.0.x versions.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
   * SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction("timeoutAction")
   * .timeoutDurationMinutes(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .blockDurationMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html)
   */
  public interface SpotProvisioningSpecificationProperty {
    /**
     * Specifies one of the following strategies to launch Spot Instance fleets:
     * `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified` .
     *
     * For more information on the provisioning strategies, see [Allocation strategies for Spot
     * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * When you launch a Spot Instance fleet with the old console, it automatically launches with
     * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
     * console.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The defined duration for Spot Instances (also known as Spot blocks) in minutes.
     *
     * When specified, the Spot Instance does not terminate before the defined duration expires, and
     * defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240, 300, or
     * 360. The duration period starts as soon as a Spot Instance receives its instance ID. At the end
     * of the duration, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance
     * termination notice, which gives the instance a two-minute warning before it terminates.
     *
     *
     * Spot Instances with a defined duration (also known as Spot blocks) are no longer available to
     * new customers from July 1, 2021. For customers who have previously used the feature, we will
     * continue to support Spot Instances with a defined duration until December 31, 2022.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-blockdurationminutes)
     */
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    /**
     * The action to take when `TargetSpotCapacity` has not been fulfilled when the
     * `TimeoutDurationMinutes` has expired;
     *
     * that is, when all Spot Instances could not be provisioned within the Spot provisioning
     * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
     * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned to
     * fulfill any remaining Spot capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-timeoutaction)
     */
    public fun timeoutAction(): String

    /**
     * The Spot provisioning timeout period in minutes.
     *
     * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is taken.
     * Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
     * provisioning, when the cluster is first created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-timeoutdurationminutes)
     */
    public fun timeoutDurationMinutes(): Number

    /**
     * A builder for [SpotProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies one of the following strategies to launch Spot Instance
       * fleets: `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified`
       * .
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param blockDurationMinutes The defined duration for Spot Instances (also known as Spot
       * blocks) in minutes.
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       */
      public fun blockDurationMinutes(blockDurationMinutes: Number)

      /**
       * @param timeoutAction The action to take when `TargetSpotCapacity` has not been fulfilled
       * when the `TimeoutDurationMinutes` has expired;. 
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       */
      public fun timeoutAction(timeoutAction: String)

      /**
       * @param timeoutDurationMinutes The Spot provisioning timeout period in minutes. 
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       */
      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies one of the following strategies to launch Spot Instance
       * fleets: `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified`
       * .
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param blockDurationMinutes The defined duration for Spot Instances (also known as Spot
       * blocks) in minutes.
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       */
      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      /**
       * @param timeoutAction The action to take when `TargetSpotCapacity` has not been fulfilled
       * when the `TimeoutDurationMinutes` has expired;. 
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       */
      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      /**
       * @param timeoutDurationMinutes The Spot provisioning timeout period in minutes. 
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       */
      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), SpotProvisioningSpecificationProperty {
      /**
       * Specifies one of the following strategies to launch Spot Instance fleets:
       * `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or `diversified` .
       *
       * For more information on the provisioning strategies, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * When you launch a Spot Instance fleet with the old console, it automatically launches with
       * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
       * console.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * The defined duration for Spot Instances (also known as Spot blocks) in minutes.
       *
       * When specified, the Spot Instance does not terminate before the defined duration expires,
       * and defined duration pricing for Spot Instances applies. Valid values are 60, 120, 180, 240,
       * 300, or 360. The duration period starts as soon as a Spot Instance receives its instance ID.
       * At the end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
       * Spot Instance termination notice, which gives the instance a two-minute warning before it
       * terminates.
       *
       *
       * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
       * to new customers from July 1, 2021. For customers who have previously used the feature, we
       * will continue to support Spot Instances with a defined duration until December 31, 2022.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-blockdurationminutes)
       */
      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      /**
       * The action to take when `TargetSpotCapacity` has not been fulfilled when the
       * `TimeoutDurationMinutes` has expired;
       *
       * that is, when all Spot Instances could not be provisioned within the Spot provisioning
       * timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND
       * specifies that if no Spot Instances are available, On-Demand Instances should be provisioned
       * to fulfill any remaining Spot capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-timeoutaction)
       */
      override fun timeoutAction(): String = unwrap(this).getTimeoutAction()

      /**
       * The Spot provisioning timeout period in minutes.
       *
       * If Spot Instances are not provisioned within this time period, the `TimeOutAction` is
       * taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
       * provisioning, when the cluster is first created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-spotprovisioningspecification.html#cfn-emr-cluster-spotprovisioningspecification-timeoutdurationminutes)
       */
      override fun timeoutDurationMinutes(): Number = unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotProvisioningSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty
    }
  }

  /**
   * `StepConfig` is a property of the `AWS::EMR::Cluster` resource.
   *
   * The `StepConfig` property type specifies a cluster (job flow) step, which runs only on the
   * master node. Steps are used to submit data processing jobs to the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * StepConfigProperty stepConfigProperty = StepConfigProperty.builder()
   * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
   * .jar("jar")
   * // the properties below are optional
   * .args(List.of("args"))
   * .mainClass("mainClass")
   * .stepProperties(List.of(KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .name("name")
   * // the properties below are optional
   * .actionOnFailure("actionOnFailure")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html)
   */
  public interface StepConfigProperty {
    /**
     * The action to take when the cluster step fails.
     *
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-actiononfailure)
     */
    public fun actionOnFailure(): String? = unwrap(this).getActionOnFailure()

    /**
     * The JAR file used for the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-hadoopjarstep)
     */
    public fun hadoopJarStep(): Any

    /**
     * The name of the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-name)
     */
    public fun name(): String

    /**
     * A builder for [StepConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionOnFailure The action to take when the cluster step fails.
       * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
       */
      public fun actionOnFailure(actionOnFailure: String)

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      public fun hadoopJarStep(hadoopJarStep: IResolvable)

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty)

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35c8e923fe8dffa0f705d5b8464c7d670916d6d321c8b4ec178d10f9ea0ff2b6")
      public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit)

      /**
       * @param name The name of the step. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.builder()

      /**
       * @param actionOnFailure The action to take when the cluster step fails.
       * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
       */
      override fun actionOnFailure(actionOnFailure: String) {
        cdkBuilder.actionOnFailure(actionOnFailure)
      }

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      override fun hadoopJarStep(hadoopJarStep: IResolvable) {
        cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
      }

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
        cdkBuilder.hadoopJarStep(hadoopJarStep.let(HadoopJarStepConfigProperty::unwrap))
      }

      /**
       * @param hadoopJarStep The JAR file used for the step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35c8e923fe8dffa0f705d5b8464c7d670916d6d321c8b4ec178d10f9ea0ff2b6")
      override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit):
          Unit = hadoopJarStep(HadoopJarStepConfigProperty(hadoopJarStep))

      /**
       * @param name The name of the step. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty,
    ) : CdkObject(cdkObject), StepConfigProperty {
      /**
       * The action to take when the cluster step fails.
       *
       * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-actiononfailure)
       */
      override fun actionOnFailure(): String? = unwrap(this).getActionOnFailure()

      /**
       * The JAR file used for the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-hadoopjarstep)
       */
      override fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

      /**
       * The name of the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-stepconfig.html#cfn-emr-cluster-stepconfig-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty):
          StepConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? StepConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepConfigProperty):
          software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty
    }
  }

  /**
   * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
   *
   * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes attached
   * to EC2 instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
   * .sizeInGb(123)
   * .volumeType("volumeType")
   * // the properties below are optional
   * .iops(123)
   * .throughput(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html)
   */
  public interface VolumeSpecificationProperty {
    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The volume size, in gibibytes (GiB).
     *
     * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is
     * 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-sizeingb)
     */
    public fun sizeInGb(): Number

    /**
     * The throughput, in mebibyte per second (MiB/s).
     *
     * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type.
     *
     * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-volumetype)
     */
    public fun volumeType(): String

    /**
     * A builder for [VolumeSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      public fun iops(iops: Number)

      /**
       * @param sizeInGb The volume size, in gibibytes (GiB). 
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       */
      public fun sizeInGb(sizeInGb: Number)

      /**
       * @param throughput The throughput, in mebibyte per second (MiB/s).
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.builder()

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param sizeInGb The volume size, in gibibytes (GiB). 
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       */
      override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      /**
       * @param throughput The throughput, in mebibyte per second (MiB/s).
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The volume size, in gibibytes (GiB).
       *
       * This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value
       * is 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-sizeingb)
       */
      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      /**
       * The throughput, in mebibyte per second (MiB/s).
       *
       * This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The volume type.
       *
       * Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-volumespecification.html#cfn-emr-cluster-volumespecification-volumetype)
       */
      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty):
          VolumeSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VolumeSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty
    }
  }
}
