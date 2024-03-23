@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * Object additionalInfo;
 * ConfigurationProperty configurationProperty_;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
  /**
   * A JSON string for selecting additional features.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
   */
  public fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

  /**
   * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and so
   * on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
   */
  public fun applications(): Any? = unwrap(this).getApplications()

  /**
   * An IAM role for automatic scaling policies.
   *
   * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that the
   * automatic scaling feature requires to launch and terminate Amazon EC2 instances in an instance
   * group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoscalingrole)
   */
  public fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

  /**
   * An auto-termination policy defines the amount of idle time in seconds after which a cluster
   * automatically terminates.
   *
   * For alternative cluster termination options, see [Control cluster
   * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
   */
  public fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

  /**
   * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
   */
  public fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

  /**
   * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are supplied
   * to the Amazon EMR cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
   */
  public fun configurations(): Any? = unwrap(this).getConfigurations()

  /**
   * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
   * Linux AMI if the cluster uses a custom AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-customamiid)
   */
  public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  /**
   * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
   * EC2 instance.
   *
   * Available in Amazon EMR releases 6.15.0 and later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumeiops)
   */
  public fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

  /**
   * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
   * Amazon EC2 instance.
   *
   * Available in Amazon EMR releases 4.x and later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumesize)
   */
  public fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

  /**
   * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
   * for each Amazon EC2 instance.
   *
   * Available in Amazon EMR releases 6.15.0 and later.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumethroughput)
   */
  public fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

  /**
   * A specification of the number and type of Amazon EC2 instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
   */
  public fun instances(): Any

  /**
   * Also called instance profile and Amazon EC2 role.
   *
   * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
   * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must have
   * already created it using the AWS CLI or console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-jobflowrole)
   */
  public fun jobFlowRole(): String

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   *
   * For more information see [Use Kerberos
   * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
   * *Amazon EMR Management Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
   */
  public fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

  /**
   * The AWS KMS key used for encrypting log files.
   *
   * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR 6.0.0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-logencryptionkmskeyid)
   */
  public fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

  /**
   * The path to the Amazon S3 location where logs for this cluster are stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-loguri)
   */
  public fun logUri(): String? = unwrap(this).getLogUri()

  /**
   * Creates or updates a managed scaling policy for an Amazon EMR cluster.
   *
   * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances that
   * can be added or terminated from a cluster. The policy only applies to the core and task nodes. The
   * master node cannot be scaled after initial configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
   */
  public fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

  /**
   * The name of the cluster.
   *
   * This parameter can't contain the characters &lt;, &gt;, $, |, or ` (backtick).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-name)
   */
  public fun name(): String

  /**
   * The Amazon Linux release specified in a cluster launch RunJobFlow request.
   *
   * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
   * response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-osreleaselabel)
   */
  public fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
   */
  public fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

  /**
   * The Amazon EMR release label, which determines the version of open-source application packages
   * installed on the cluster.
   *
   * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version such
   * as `emr-5.14.0` . For more information about Amazon EMR release versions and included application
   * versions and features, see [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/) . The release
   * label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use `AmiVersion`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-releaselabel)
   */
  public fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

  /**
   * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity
   * occurs or an instance group is resized.
   *
   * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
   * boundary, regardless of when the request to terminate the instance was submitted. This option is
   * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that
   * version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a deny list and
   * drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
   * instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and
   * blocks instance termination if it could lead to HDFS corruption. `TERMINATE_AT_TASK_COMPLETION` is
   * available only in Amazon EMR releases 4.1.0 and later, and is the default for versions of Amazon
   * EMR earlier than 5.1.0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-scaledownbehavior)
   */
  public fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

  /**
   * The name of the security configuration applied to the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-securityconfiguration)
   */
  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-servicerole)
   */
  public fun serviceRole(): String

  /**
   * Specifies the number of steps that can be executed concurrently.
   *
   * The default value is `1` . The maximum value is `256` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-stepconcurrencylevel)
   */
  public fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

  /**
   * A list of steps to run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
   */
  public fun steps(): Any? = unwrap(this).getSteps()

  /**
   * A list of tags associated with a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-visibletoallusers)
   */
  public fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public fun additionalInfo(additionalInfo: Any)

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    public fun applications(applications: IResolvable)

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    public fun applications(applications: List<Any>)

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    public fun applications(vararg applications: Any)

    /**
     * @param autoScalingRole An IAM role for automatic scaling policies.
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     */
    public fun autoScalingRole(autoScalingRole: String)

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    public fun autoTerminationPolicy(autoTerminationPolicy: IResolvable)

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    public
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty)

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3240acf26a1c9c7b4ba81bd6a1e25256e5be8202b4c67f86b93242c1944044")
    public
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit)

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    public fun bootstrapActions(bootstrapActions: IResolvable)

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    public fun bootstrapActions(bootstrapActions: List<Any>)

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    public fun bootstrapActions(vararg bootstrapActions: Any)

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(configurations: IResolvable)

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(configurations: List<Any>)

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    public fun configurations(vararg configurations: Any)

    /**
     * @param customAmiId Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     */
    public fun customAmiId(customAmiId: String)

    /**
     * @param ebsRootVolumeIops The IOPS, of the Amazon EBS root device volume of the Linux AMI that
     * is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 6.15.0 and later.
     */
    public fun ebsRootVolumeIops(ebsRootVolumeIops: Number)

    /**
     * @param ebsRootVolumeSize The size, in GiB, of the Amazon EBS root device volume of the Linux
     * AMI that is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 4.x and later.
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Number)

    /**
     * @param ebsRootVolumeThroughput The throughput, in MiB/s, of the Amazon EBS root device volume
     * of the Linux AMI that is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 6.15.0 and later.
     */
    public fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number)

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: IResolvable)

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty)

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3187d564387336529962c72fd2106d28abad87dda841f9a9006103caf648cb4")
    public fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit)

    /**
     * @param jobFlowRole Also called instance profile and Amazon EC2 role. 
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     */
    public fun jobFlowRole(jobFlowRole: String)

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    public fun kerberosAttributes(kerberosAttributes: IResolvable)

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    public fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty)

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d934421d8d810d6cbcf3885258551a0173093dbe4de5d5a3c75038b49cb30143")
    public
        fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit)

    /**
     * @param logEncryptionKmsKeyId The AWS KMS key used for encrypting log files.
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     */
    public fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String)

    /**
     * @param logUri The path to the Amazon S3 location where logs for this cluster are stored.
     */
    public fun logUri(logUri: String)

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    public fun managedScalingPolicy(managedScalingPolicy: IResolvable)

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    public fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty)

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc9c5ff76a6f289ebce415acdd74380dda47578b061a80d4d2045428f21afe26")
    public
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit)

    /**
     * @param name The name of the cluster. 
     * This parameter can't contain the characters &lt;, &gt;, $, |, or ` (backtick).
     */
    public fun name(name: String)

    /**
     * @param osReleaseLabel The Amazon Linux release specified in a cluster launch RunJobFlow
     * request.
     * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
     * response.
     */
    public fun osReleaseLabel(osReleaseLabel: String)

    /**
     * @param placementGroupConfigs the value to be set.
     */
    public fun placementGroupConfigs(placementGroupConfigs: IResolvable)

    /**
     * @param placementGroupConfigs the value to be set.
     */
    public fun placementGroupConfigs(placementGroupConfigs: List<Any>)

    /**
     * @param placementGroupConfigs the value to be set.
     */
    public fun placementGroupConfigs(vararg placementGroupConfigs: Any)

    /**
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster.
     * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version
     * such as `emr-5.14.0` . For more information about Amazon EMR release versions and included
     * application versions and features, see [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/)
     * . The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions
     * use `AmiVersion` .
     */
    public fun releaseLabel(releaseLabel: String)

    /**
     * @param scaleDownBehavior The way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
     * boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using
     * that version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a deny list
     * and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     * instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first
     * and blocks instance termination if it could lead to HDFS corruption.
     * `TERMINATE_AT_TASK_COMPLETION` is available only in Amazon EMR releases 4.1.0 and later, and is
     * the default for versions of Amazon EMR earlier than 5.1.0.
     */
    public fun scaleDownBehavior(scaleDownBehavior: String)

    /**
     * @param securityConfiguration The name of the security configuration applied to the cluster.
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * @param serviceRole The IAM role that Amazon EMR assumes in order to access AWS resources on
     * your behalf. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * @param stepConcurrencyLevel Specifies the number of steps that can be executed concurrently.
     * The default value is `1` . The maximum value is `256` .
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    /**
     * @param steps A list of steps to run.
     */
    public fun steps(steps: IResolvable)

    /**
     * @param steps A list of steps to run.
     */
    public fun steps(steps: List<Any>)

    /**
     * @param steps A list of steps to run.
     */
    public fun steps(vararg steps: Any)

    /**
     * @param tags A list of tags associated with a cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags associated with a cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster.
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     */
    public fun visibleToAllUsers(visibleToAllUsers: Boolean)

    /**
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster.
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     */
    public fun visibleToAllUsers(visibleToAllUsers: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnClusterProps.Builder =
        software.amazon.awscdk.services.emr.CfnClusterProps.builder()

    /**
     * @param additionalInfo A JSON string for selecting additional features.
     */
    override fun additionalInfo(additionalInfo: Any) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    override fun applications(applications: IResolvable) {
      cdkBuilder.applications(applications.let(IResolvable::unwrap))
    }

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    override fun applications(applications: List<Any>) {
      cdkBuilder.applications(applications)
    }

    /**
     * @param applications The applications to install on this cluster, for example, Spark, Flink,
     * Oozie, Zeppelin, and so on.
     */
    override fun applications(vararg applications: Any): Unit = applications(applications.toList())

    /**
     * @param autoScalingRole An IAM role for automatic scaling policies.
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     */
    override fun autoScalingRole(autoScalingRole: String) {
      cdkBuilder.autoScalingRole(autoScalingRole)
    }

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    override fun autoTerminationPolicy(autoTerminationPolicy: IResolvable) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    override
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty) {
      cdkBuilder.autoTerminationPolicy(autoTerminationPolicy.let(CfnCluster.AutoTerminationPolicyProperty::unwrap))
    }

    /**
     * @param autoTerminationPolicy An auto-termination policy defines the amount of idle time in
     * seconds after which a cluster automatically terminates.
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f3240acf26a1c9c7b4ba81bd6a1e25256e5be8202b4c67f86b93242c1944044")
    override
        fun autoTerminationPolicy(autoTerminationPolicy: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit):
        Unit =
        autoTerminationPolicy(CfnCluster.AutoTerminationPolicyProperty(autoTerminationPolicy))

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    override fun bootstrapActions(bootstrapActions: IResolvable) {
      cdkBuilder.bootstrapActions(bootstrapActions.let(IResolvable::unwrap))
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    override fun bootstrapActions(bootstrapActions: List<Any>) {
      cdkBuilder.bootstrapActions(bootstrapActions)
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes.
     */
    override fun bootstrapActions(vararg bootstrapActions: Any): Unit =
        bootstrapActions(bootstrapActions.toList())

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    /**
     * @param configurations Applies only to Amazon EMR releases 4.x and later. The list of
     * configurations that are supplied to the Amazon EMR cluster.
     */
    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    /**
     * @param customAmiId Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom
     * Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsRootVolumeIops The IOPS, of the Amazon EBS root device volume of the Linux AMI that
     * is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 6.15.0 and later.
     */
    override fun ebsRootVolumeIops(ebsRootVolumeIops: Number) {
      cdkBuilder.ebsRootVolumeIops(ebsRootVolumeIops)
    }

    /**
     * @param ebsRootVolumeSize The size, in GiB, of the Amazon EBS root device volume of the Linux
     * AMI that is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 4.x and later.
     */
    override fun ebsRootVolumeSize(ebsRootVolumeSize: Number) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
    }

    /**
     * @param ebsRootVolumeThroughput The throughput, in MiB/s, of the Amazon EBS root device volume
     * of the Linux AMI that is used for each Amazon EC2 instance.
     * Available in Amazon EMR releases 6.15.0 and later.
     */
    override fun ebsRootVolumeThroughput(ebsRootVolumeThroughput: Number) {
      cdkBuilder.ebsRootVolumeThroughput(ebsRootVolumeThroughput)
    }

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: IResolvable) {
      cdkBuilder.instances(instances.let(IResolvable::unwrap))
    }

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty) {
      cdkBuilder.instances(instances.let(CfnCluster.JobFlowInstancesConfigProperty::unwrap))
    }

    /**
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3187d564387336529962c72fd2106d28abad87dda841f9a9006103caf648cb4")
    override fun instances(instances: CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit):
        Unit = instances(CfnCluster.JobFlowInstancesConfigProperty(instances))

    /**
     * @param jobFlowRole Also called instance profile and Amazon EC2 role. 
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     */
    override fun jobFlowRole(jobFlowRole: String) {
      cdkBuilder.jobFlowRole(jobFlowRole)
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    override fun kerberosAttributes(kerberosAttributes: IResolvable) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    override fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(CfnCluster.KerberosAttributesProperty::unwrap))
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration.
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d934421d8d810d6cbcf3885258551a0173093dbe4de5d5a3c75038b49cb30143")
    override
        fun kerberosAttributes(kerberosAttributes: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(CfnCluster.KerberosAttributesProperty(kerberosAttributes))

    /**
     * @param logEncryptionKmsKeyId The AWS KMS key used for encrypting log files.
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     */
    override fun logEncryptionKmsKeyId(logEncryptionKmsKeyId: String) {
      cdkBuilder.logEncryptionKmsKeyId(logEncryptionKmsKeyId)
    }

    /**
     * @param logUri The path to the Amazon S3 location where logs for this cluster are stored.
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    override fun managedScalingPolicy(managedScalingPolicy: IResolvable) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    override
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty) {
      cdkBuilder.managedScalingPolicy(managedScalingPolicy.let(CfnCluster.ManagedScalingPolicyProperty::unwrap))
    }

    /**
     * @param managedScalingPolicy Creates or updates a managed scaling policy for an Amazon EMR
     * cluster.
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc9c5ff76a6f289ebce415acdd74380dda47578b061a80d4d2045428f21afe26")
    override
        fun managedScalingPolicy(managedScalingPolicy: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit):
        Unit = managedScalingPolicy(CfnCluster.ManagedScalingPolicyProperty(managedScalingPolicy))

    /**
     * @param name The name of the cluster. 
     * This parameter can't contain the characters &lt;, &gt;, $, |, or ` (backtick).
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param osReleaseLabel The Amazon Linux release specified in a cluster launch RunJobFlow
     * request.
     * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
     * response.
     */
    override fun osReleaseLabel(osReleaseLabel: String) {
      cdkBuilder.osReleaseLabel(osReleaseLabel)
    }

    /**
     * @param placementGroupConfigs the value to be set.
     */
    override fun placementGroupConfigs(placementGroupConfigs: IResolvable) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs.let(IResolvable::unwrap))
    }

    /**
     * @param placementGroupConfigs the value to be set.
     */
    override fun placementGroupConfigs(placementGroupConfigs: List<Any>) {
      cdkBuilder.placementGroupConfigs(placementGroupConfigs)
    }

    /**
     * @param placementGroupConfigs the value to be set.
     */
    override fun placementGroupConfigs(vararg placementGroupConfigs: Any): Unit =
        placementGroupConfigs(placementGroupConfigs.toList())

    /**
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster.
     * Release labels are in the form `emr-x.x.x` , where x.x.x is an Amazon EMR release version
     * such as `emr-5.14.0` . For more information about Amazon EMR release versions and included
     * application versions and features, see [](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/)
     * . The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions
     * use `AmiVersion` .
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param scaleDownBehavior The way that individual Amazon EC2 instances terminate when an
     * automatic scale-in activity occurs or an instance group is resized.
     * `TERMINATE_AT_INSTANCE_HOUR` indicates that Amazon EMR terminates nodes at the instance-hour
     * boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using
     * that version. `TERMINATE_AT_TASK_COMPLETION` indicates that Amazon EMR adds nodes to a deny list
     * and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     * instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first
     * and blocks instance termination if it could lead to HDFS corruption.
     * `TERMINATE_AT_TASK_COMPLETION` is available only in Amazon EMR releases 4.1.0 and later, and is
     * the default for versions of Amazon EMR earlier than 5.1.0.
     */
    override fun scaleDownBehavior(scaleDownBehavior: String) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    /**
     * @param securityConfiguration The name of the security configuration applied to the cluster.
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param serviceRole The IAM role that Amazon EMR assumes in order to access AWS resources on
     * your behalf. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param stepConcurrencyLevel Specifies the number of steps that can be executed concurrently.
     * The default value is `1` . The maximum value is `256` .
     */
    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * @param steps A list of steps to run.
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * @param steps A list of steps to run.
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    /**
     * @param steps A list of steps to run.
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * @param tags A list of tags associated with a cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags associated with a cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster.
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     */
    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    /**
     * @param visibleToAllUsers Indicates whether the cluster is visible to all IAM users of the AWS
     * account associated with the cluster.
     * If this value is set to `true` , all IAM users of that AWS account can view and manage the
     * cluster if they have the proper policy permissions set. If this value is `false` , only the IAM
     * user that created the cluster can view and manage it. This value can be changed using the
     * SetVisibleToAllUsers action.
     *
     *
     * When you create clusters directly through the EMR console or API, this value is set to `true`
     * by default. However, for `AWS::EMR::Cluster` resources in CloudFormation, the default is `false`
     * .
     */
    override fun visibleToAllUsers(visibleToAllUsers: IResolvable) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.emr.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    /**
     * A JSON string for selecting additional features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-additionalinfo)
     */
    override fun additionalInfo(): Any? = unwrap(this).getAdditionalInfo()

    /**
     * The applications to install on this cluster, for example, Spark, Flink, Oozie, Zeppelin, and
     * so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-applications)
     */
    override fun applications(): Any? = unwrap(this).getApplications()

    /**
     * An IAM role for automatic scaling policies.
     *
     * The default role is `EMR_AutoScaling_DefaultRole` . The IAM role provides permissions that
     * the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an
     * instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoscalingrole)
     */
    override fun autoScalingRole(): String? = unwrap(this).getAutoScalingRole()

    /**
     * An auto-termination policy defines the amount of idle time in seconds after which a cluster
     * automatically terminates.
     *
     * For alternative cluster termination options, see [Control cluster
     * termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-autoterminationpolicy)
     */
    override fun autoTerminationPolicy(): Any? = unwrap(this).getAutoTerminationPolicy()

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-bootstrapactions)
     */
    override fun bootstrapActions(): Any? = unwrap(this).getBootstrapActions()

    /**
     * Applies only to Amazon EMR releases 4.x and later. The list of configurations that are
     * supplied to the Amazon EMR cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-configurations)
     */
    override fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * Available only in Amazon EMR releases 5.7.0 and later. The ID of a custom Amazon EBS-backed
     * Linux AMI if the cluster uses a custom AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-customamiid)
     */
    override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    /**
     * The IOPS, of the Amazon EBS root device volume of the Linux AMI that is used for each Amazon
     * EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumeiops)
     */
    override fun ebsRootVolumeIops(): Number? = unwrap(this).getEbsRootVolumeIops()

    /**
     * The size, in GiB, of the Amazon EBS root device volume of the Linux AMI that is used for each
     * Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 4.x and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumesize)
     */
    override fun ebsRootVolumeSize(): Number? = unwrap(this).getEbsRootVolumeSize()

    /**
     * The throughput, in MiB/s, of the Amazon EBS root device volume of the Linux AMI that is used
     * for each Amazon EC2 instance.
     *
     * Available in Amazon EMR releases 6.15.0 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-ebsrootvolumethroughput)
     */
    override fun ebsRootVolumeThroughput(): Number? = unwrap(this).getEbsRootVolumeThroughput()

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-instances)
     */
    override fun instances(): Any = unwrap(this).getInstances()

    /**
     * Also called instance profile and Amazon EC2 role.
     *
     * An IAM role for an Amazon EMR cluster. The Amazon EC2 instances of the cluster assume this
     * role. The default role is `EMR_EC2_DefaultRole` . In order to use the default role, you must
     * have already created it using the AWS CLI or console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-jobflowrole)
     */
    override fun jobFlowRole(): String = unwrap(this).getJobFlowRole()

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * For more information see [Use Kerberos
     * Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html) in the
     * *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-kerberosattributes)
     */
    override fun kerberosAttributes(): Any? = unwrap(this).getKerberosAttributes()

    /**
     * The AWS KMS key used for encrypting log files.
     *
     * This attribute is only available with Amazon EMR 5.30.0 and later, excluding Amazon EMR
     * 6.0.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-logencryptionkmskeyid)
     */
    override fun logEncryptionKmsKeyId(): String? = unwrap(this).getLogEncryptionKmsKeyId()

    /**
     * The path to the Amazon S3 location where logs for this cluster are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-loguri)
     */
    override fun logUri(): String? = unwrap(this).getLogUri()

    /**
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     *
     * The managed scaling policy defines the limits for resources, such as Amazon EC2 instances
     * that can be added or terminated from a cluster. The policy only applies to the core and task
     * nodes. The master node cannot be scaled after initial configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-managedscalingpolicy)
     */
    override fun managedScalingPolicy(): Any? = unwrap(this).getManagedScalingPolicy()

    /**
     * The name of the cluster.
     *
     * This parameter can't contain the characters &lt;, &gt;, $, |, or ` (backtick).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Linux release specified in a cluster launch RunJobFlow request.
     *
     * If no Amazon Linux release was specified, the default Amazon Linux release is shown in the
     * response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-osreleaselabel)
     */
    override fun osReleaseLabel(): String? = unwrap(this).getOsReleaseLabel()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-placementgroupconfigs)
     */
    override fun placementGroupConfigs(): Any? = unwrap(this).getPlacementGroupConfigs()

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
     */
    override fun releaseLabel(): String? = unwrap(this).getReleaseLabel()

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
     */
    override fun scaleDownBehavior(): String? = unwrap(this).getScaleDownBehavior()

    /**
     * The name of the security configuration applied to the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-securityconfiguration)
     */
    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * The IAM role that Amazon EMR assumes in order to access AWS resources on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-servicerole)
     */
    override fun serviceRole(): String = unwrap(this).getServiceRole()

    /**
     * Specifies the number of steps that can be executed concurrently.
     *
     * The default value is `1` . The maximum value is `256` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-stepconcurrencylevel)
     */
    override fun stepConcurrencyLevel(): Number? = unwrap(this).getStepConcurrencyLevel()

    /**
     * A list of steps to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-steps)
     */
    override fun steps(): Any? = unwrap(this).getSteps()

    /**
     * A list of tags associated with a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html#cfn-emr-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun visibleToAllUsers(): Any? = unwrap(this).getVisibleToAllUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.emr.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.emr.CfnClusterProps
  }
}
