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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps

/**
 * Properties for defining a `CfnInstanceGroupConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ConfigurationProperty configurationProperty_;
 * CfnInstanceGroupConfigProps cfnInstanceGroupConfigProps = CfnInstanceGroupConfigProps.builder()
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
public class CfnInstanceGroupConfigPropsDsl {
    private val cdkBuilder: CfnInstanceGroupConfigProps.Builder =
        CfnInstanceGroupConfigProps.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *   `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     *   instances in response to the value of a CloudWatch metric. For more information, see
     *   [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     *   in the *Amazon EMR Management Guide* .
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * @param autoScalingPolicy `AutoScalingPolicy` is a subproperty of `InstanceGroupConfig` .
     *   `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2
     *   instances in response to the value of a CloudWatch metric. For more information, see
     *   [Using Automatic Scaling in Amazon EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html)
     *   in the *Amazon EMR Management Guide* .
     */
    public fun autoScalingPolicy(
        autoScalingPolicy: CfnInstanceGroupConfig.AutoScalingPolicyProperty
    ) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * @param bidPrice If specified, indicates that the instance group uses Spot Instances. This is
     *   the maximum price you are willing to pay for Spot Instances. Specify `OnDemandPrice` to set
     *   the amount equal to the On-Demand price, or specify an amount in USD.
     */
    public fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. The list of configurations supplied
     *   for an Amazon EMR cluster instance group. You can specify a separate configuration for each
     *   instance group (master, core, and task).
     */
    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. The list of configurations supplied
     *   for an Amazon EMR cluster instance group. You can specify a separate configuration for each
     *   instance group (master, core, and task).
     */
    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    /**
     * @param configurations Amazon EMR releases 4.x or later. The list of configurations supplied
     *   for an Amazon EMR cluster instance group. You can specify a separate configuration for each
     *   instance group (master, core, and task).
     */
    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    /** @param customAmiId The custom AMI ID to use for the provisioned instance group. */
    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     *   cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /**
     * @param ebsConfiguration `EbsConfiguration` determines the EBS volumes to attach to EMR
     *   cluster instances.
     */
    public fun ebsConfiguration(ebsConfiguration: CfnInstanceGroupConfig.EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    /** @param instanceCount Target number of instances for the instance group. */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceRole The role of the instance group in the cluster. *Allowed Values* : TASK
     */
    public fun instanceRole(instanceRole: String) {
        cdkBuilder.instanceRole(instanceRole)
    }

    /** @param instanceType The Amazon EC2 instance type for all instances in the instance group. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param jobFlowId The ID of an Amazon EMR cluster that you want to associate this instance
     *   group with.
     */
    public fun jobFlowId(jobFlowId: String) {
        cdkBuilder.jobFlowId(jobFlowId)
    }

    /** @param market Market type of the Amazon EC2 instances used to create a cluster node. */
    public fun market(market: String) {
        cdkBuilder.market(market)
    }

    /** @param name Friendly name given to the instance group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnInstanceGroupConfigProps {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
