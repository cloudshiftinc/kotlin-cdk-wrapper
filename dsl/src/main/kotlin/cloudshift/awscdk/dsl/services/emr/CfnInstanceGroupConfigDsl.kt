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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.constructs.Construct

/**
 * Use `InstanceGroupConfig` to define instance groups for an EMR cluster.
 *
 * A cluster can not use both instance groups and instance fleets. For more information, see
 * [Create a Cluster with Instance Fleets or Uniform Instance Groups](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-instance-group-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 * You can currently only add task instance groups to a cluster with this resource. If you use this
 * resource, CloudFormation waits for the cluster launch to complete before adding the task instance
 * group to the cluster. In order to add task instance groups to the cluster as part of the cluster
 * launch and minimize delays in provisioning task nodes, use the `TaskInstanceGroups` subproperty
 * for the
 * [AWS::EMR::Cluster JobFlowInstancesConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html)
 * property instead. To use this subproperty, see
 * [AWS::EMR::Cluster](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-cluster.html)
 * for examples.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ConfigurationProperty configurationProperty_;
 * CfnInstanceGroupConfig cfnInstanceGroupConfig = CfnInstanceGroupConfig.Builder.create(this,
 * "MyCfnInstanceGroupConfig")
 * .instanceCount(123)
 * .instanceRole("instanceRole")
 * .instanceType("instanceType")
 * .jobFlowId("jobFlowId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstanceGroupConfig.Builder =
        CfnInstanceGroupConfig.Builder.create(scope, id)

    private val _configurations: MutableList<Any> = mutableListOf()

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see
     * [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * in the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     *
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *
     * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric. For more information, see
     * [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * in the *Amazon EMR Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-autoscalingpolicy)
     *
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     */
    public fun autoScalingPolicy(
        autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty
    ) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * If specified, indicates that the instance group uses Spot Instances.
     *
     * This is the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice`
     * to set the amount equal to the On-Demand price, or specify an amount in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-bidprice)
     *
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances.
     */
    public fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     *
     * @param configurations Amazon EMR releases 4.x or later.
     */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     *
     * @param configurations Amazon EMR releases 4.x or later.
     */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /**
     * Amazon EMR releases 4.x or later.
     *
     * The list of configurations supplied for an Amazon EMR cluster instance group. You can specify
     * a separate configuration for each instance group (master, core, and task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-configurations)
     *
     * @param configurations Amazon EMR releases 4.x or later.
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /**
     * The custom AMI ID to use for the provisioned instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-customamiid)
     *
     * @param customAmiId The custom AMI ID to use for the provisioned instance group.
     */
    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     *
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     *   cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /**
     * `EbsConfiguration` determines the EBS volumes to attach to EMR cluster instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-ebsconfiguration)
     *
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     *   cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /**
     * Target number of instances for the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancecount)
     *
     * @param instanceCount Target number of instances for the instance group.
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * The role of the instance group in the cluster.
     *
     * *Allowed Values* : TASK
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancerole)
     *
     * @param instanceRole The role of the instance group in the cluster.
     */
    public fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
    }

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-instancetype)
     *
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The ID of an Amazon EMR cluster that you want to associate this instance group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-jobflowid)
     *
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     *   group with.
     */
    public fun jobFlowId(jobFlowId: String) {
        cdkBuilder.jobFlowId(jobFlowId)
    }

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-market)
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     */
    public fun market(market: String) {
        cdkBuilder.market(market)
    }

    /**
     * Friendly name given to the instance group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-instancegroupconfig.html#cfn-emr-instancegroupconfig-name)
     *
     * @param name Friendly name given to the instance group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnInstanceGroupConfig {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
