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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

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
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-jobflowinstancesconfig.html)
 */
@CdkDslMarker
public class CfnClusterJobFlowInstancesConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.JobFlowInstancesConfigProperty.Builder =
        CfnCluster.JobFlowInstancesConfigProperty.builder()

    private val _additionalMasterSecurityGroups: MutableList<String> = mutableListOf()

    private val _additionalSlaveSecurityGroups: MutableList<String> = mutableListOf()

    private val _ec2SubnetIds: MutableList<String> = mutableListOf()

    private val _taskInstanceFleets: MutableList<Any> = mutableListOf()

    private val _taskInstanceGroups: MutableList<Any> = mutableListOf()

    /**
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the master node.
     */
    public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String) {
        _additionalMasterSecurityGroups.addAll(listOf(*additionalMasterSecurityGroups))
    }

    /**
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the master node.
     */
    public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: Collection<String>) {
        _additionalMasterSecurityGroups.addAll(additionalMasterSecurityGroups)
    }

    /**
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the core and task nodes.
     */
    public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String) {
        _additionalSlaveSecurityGroups.addAll(listOf(*additionalSlaveSecurityGroups))
    }

    /**
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
     *   the core and task nodes.
     */
    public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: Collection<String>) {
        _additionalSlaveSecurityGroups.addAll(additionalSlaveSecurityGroups)
    }

    /**
     * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the core
     *   instance fleet when using clusters with the instance fleet configuration.
     */
    public fun coreInstanceFleet(coreInstanceFleet: IResolvable) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet)
    }

    /**
     * @param coreInstanceFleet Describes the EC2 instances and instance configurations for the core
     *   instance fleet when using clusters with the instance fleet configuration.
     */
    public fun coreInstanceFleet(coreInstanceFleet: CfnCluster.InstanceFleetConfigProperty) {
        cdkBuilder.coreInstanceFleet(coreInstanceFleet)
    }

    /**
     * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
     *   instance groups when using clusters with the uniform instance group configuration.
     */
    public fun coreInstanceGroup(coreInstanceGroup: IResolvable) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup)
    }

    /**
     * @param coreInstanceGroup Describes the EC2 instances and instance configurations for core
     *   instance groups when using clusters with the uniform instance group configuration.
     */
    public fun coreInstanceGroup(coreInstanceGroup: CfnCluster.InstanceGroupConfigProperty) {
        cdkBuilder.coreInstanceGroup(coreInstanceGroup)
    }

    /**
     * @param ec2KeyName The name of the Amazon EC2 key pair that can be used to connect to the
     *   master node using SSH as the user called "hadoop.".
     */
    public fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
    }

    /**
     * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration. To
     *   launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the
     *   identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not
     *   specify this value and your account supports EC2-Classic, the cluster launches in
     *   EC2-Classic.
     */
    public fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
    }

    /**
     * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration. When
     *   multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
     *   instances in the optimal subnet.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
        _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
    }

    /**
     * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration. When
     *   multiple Amazon EC2 subnet IDs are specified, Amazon EMR evaluates them and launches
     *   instances in the optimal subnet.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions.
     */
    public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
        _ec2SubnetIds.addAll(ec2SubnetIds)
    }

    /**
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for the
     *   master node. If you specify `EmrManagedMasterSecurityGroup` , you must also specify
     *   `EmrManagedSlaveSecurityGroup` .
     */
    public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
    }

    /**
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
     *   core and task nodes. If you specify `EmrManagedSlaveSecurityGroup` , you must also specify
     *   `EmrManagedMasterSecurityGroup` .
     */
    public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
    }

    /**
     * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     *   version for the cluster. Valid inputs are "0.18" (no longer maintained), "0.20" (no longer
     *   maintained), "0.20.205" (no longer maintained), "1.0.3", "2.2.0", or "2.4.0". If you do not
     *   set this value, the default of 0.18 is used, unless the `AmiVersion` parameter is set in
     *   the RunJobFlow call, in which case the default version of Hadoop for that AMI version is
     *   used.
     */
    public fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
    }

    /**
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
     *   after completing all steps. Defaults to `true` . For more information about configuring
     *   cluster termination, see
     *   [Control Cluster Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *   in the *EMR Management Guide* .
     */
    public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: Boolean) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
    }

    /**
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the cluster should remain available
     *   after completing all steps. Defaults to `true` . For more information about configuring
     *   cluster termination, see
     *   [Control Cluster Termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
     *   in the *EMR Management Guide* .
     */
    public fun keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps: IResolvable) {
        cdkBuilder.keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps)
    }

    /**
     * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
     *   master instance fleet when using clusters with the instance fleet configuration.
     */
    public fun masterInstanceFleet(masterInstanceFleet: IResolvable) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet)
    }

    /**
     * @param masterInstanceFleet Describes the EC2 instances and instance configurations for the
     *   master instance fleet when using clusters with the instance fleet configuration.
     */
    public fun masterInstanceFleet(masterInstanceFleet: CfnCluster.InstanceFleetConfigProperty) {
        cdkBuilder.masterInstanceFleet(masterInstanceFleet)
    }

    /**
     * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
     *   master instance group when using clusters with the uniform instance group configuration.
     */
    public fun masterInstanceGroup(masterInstanceGroup: IResolvable) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup)
    }

    /**
     * @param masterInstanceGroup Describes the EC2 instances and instance configurations for the
     *   master instance group when using clusters with the uniform instance group configuration.
     */
    public fun masterInstanceGroup(masterInstanceGroup: CfnCluster.InstanceGroupConfigProperty) {
        cdkBuilder.masterInstanceGroup(masterInstanceGroup)
    }

    /** @param placement The Availability Zone in which the cluster runs. */
    public fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement)
    }

    /** @param placement The Availability Zone in which the cluster runs. */
    public fun placement(placement: CfnCluster.PlacementTypeProperty) {
        cdkBuilder.placement(placement)
    }

    /**
     * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
     *   Amazon EMR service to access clusters in VPC private subnets.
     */
    public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
    }

    /**
     * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
     *   task instance fleets when using clusters with the instance fleet configuration. These task
     *   instance fleets are added to the cluster as part of the cluster launch. Each task instance
     *   fleet must have a unique name specified so that CloudFormation can differentiate between
     *   the task instance fleets.
     *
     * You can currently specify only one task instance fleet for a cluster. After creating the
     * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
     * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
     * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
     * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
     * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
     * maximum of five Amazon EC2 instance types.
     */
    public fun taskInstanceFleets(vararg taskInstanceFleets: Any) {
        _taskInstanceFleets.addAll(listOf(*taskInstanceFleets))
    }

    /**
     * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
     *   task instance fleets when using clusters with the instance fleet configuration. These task
     *   instance fleets are added to the cluster as part of the cluster launch. Each task instance
     *   fleet must have a unique name specified so that CloudFormation can differentiate between
     *   the task instance fleets.
     *
     * You can currently specify only one task instance fleet for a cluster. After creating the
     * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
     * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
     * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
     * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
     * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
     * maximum of five Amazon EC2 instance types.
     */
    public fun taskInstanceFleets(taskInstanceFleets: Collection<Any>) {
        _taskInstanceFleets.addAll(taskInstanceFleets)
    }

    /**
     * @param taskInstanceFleets Describes the EC2 instances and instance configurations for the
     *   task instance fleets when using clusters with the instance fleet configuration. These task
     *   instance fleets are added to the cluster as part of the cluster launch. Each task instance
     *   fleet must have a unique name specified so that CloudFormation can differentiate between
     *   the task instance fleets.
     *
     * You can currently specify only one task instance fleet for a cluster. After creating the
     * cluster, you can only modify the mutable properties of `InstanceFleetConfig` , which are
     * `TargetOnDemandCapacity` and `TargetSpotCapacity` . Modifying any other property results in
     * cluster replacement. &gt; To allow a maximum of 30 Amazon EC2 instance types per fleet,
     * include `TaskInstanceFleets` when you create your cluster. If you create your cluster without
     * `TaskInstanceFleets` , Amazon EMR uses its default allocation strategy, which allows for a
     * maximum of five Amazon EC2 instance types.
     */
    public fun taskInstanceFleets(taskInstanceFleets: IResolvable) {
        cdkBuilder.taskInstanceFleets(taskInstanceFleets)
    }

    /**
     * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
     *   instance groups when using clusters with the uniform instance group configuration. These
     *   task instance groups are added to the cluster as part of the cluster launch. Each task
     *   instance group must have a unique name specified so that CloudFormation can differentiate
     *   between the task instance groups.
     *
     * After creating the cluster, you can only modify the mutable properties of
     * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
     * other property results in cluster replacement.
     */
    public fun taskInstanceGroups(vararg taskInstanceGroups: Any) {
        _taskInstanceGroups.addAll(listOf(*taskInstanceGroups))
    }

    /**
     * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
     *   instance groups when using clusters with the uniform instance group configuration. These
     *   task instance groups are added to the cluster as part of the cluster launch. Each task
     *   instance group must have a unique name specified so that CloudFormation can differentiate
     *   between the task instance groups.
     *
     * After creating the cluster, you can only modify the mutable properties of
     * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
     * other property results in cluster replacement.
     */
    public fun taskInstanceGroups(taskInstanceGroups: Collection<Any>) {
        _taskInstanceGroups.addAll(taskInstanceGroups)
    }

    /**
     * @param taskInstanceGroups Describes the EC2 instances and instance configurations for task
     *   instance groups when using clusters with the uniform instance group configuration. These
     *   task instance groups are added to the cluster as part of the cluster launch. Each task
     *   instance group must have a unique name specified so that CloudFormation can differentiate
     *   between the task instance groups.
     *
     * After creating the cluster, you can only modify the mutable properties of
     * `InstanceGroupConfig` , which are `AutoScalingPolicy` and `InstanceCount` . Modifying any
     * other property results in cluster replacement.
     */
    public fun taskInstanceGroups(taskInstanceGroups: IResolvable) {
        cdkBuilder.taskInstanceGroups(taskInstanceGroups)
    }

    /**
     * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
     *   instances from being terminated by API call, user intervention, or in the event of a
     *   job-flow error.
     */
    public fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
    }

    /**
     * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
     *   instances from being terminated by API call, user intervention, or in the event of a
     *   job-flow error.
     */
    public fun terminationProtected(terminationProtected: IResolvable) {
        cdkBuilder.terminationProtected(terminationProtected)
    }

    public fun build(): CfnCluster.JobFlowInstancesConfigProperty {
        if (_additionalMasterSecurityGroups.isNotEmpty())
            cdkBuilder.additionalMasterSecurityGroups(_additionalMasterSecurityGroups)
        if (_additionalSlaveSecurityGroups.isNotEmpty())
            cdkBuilder.additionalSlaveSecurityGroups(_additionalSlaveSecurityGroups)
        if (_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
        if (_taskInstanceFleets.isNotEmpty()) cdkBuilder.taskInstanceFleets(_taskInstanceFleets)
        if (_taskInstanceGroups.isNotEmpty()) cdkBuilder.taskInstanceGroups(_taskInstanceGroups)
        return cdkBuilder.build()
    }
}
