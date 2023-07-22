@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * Configuration defining a new instance group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ConfigurationProperty configurationProperty_;
 * Size size;
 * InstanceGroupConfigProperty instanceGroupConfigProperty = InstanceGroupConfigProperty.builder()
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
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
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
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupConfig.html)
 */
@CdkDslMarker
public class EmrCreateClusterInstanceGroupConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstanceGroupConfigProperty.Builder =
      EmrCreateCluster.InstanceGroupConfigProperty.builder()

  private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

  /**
   * @param autoScalingPolicy An automatic scaling policy for a core instance group or task instance
   * group in an Amazon EMR cluster.
   */
  public
      fun autoScalingPolicy(autoScalingPolicy: EmrCreateClusterAutoScalingPolicyPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterAutoScalingPolicyPropertyDsl()
    builder.apply(autoScalingPolicy)
    cdkBuilder.autoScalingPolicy(builder.build())
  }

  /**
   * @param autoScalingPolicy An automatic scaling policy for a core instance group or task instance
   * group in an Amazon EMR cluster.
   */
  public fun autoScalingPolicy(autoScalingPolicy: EmrCreateCluster.AutoScalingPolicyProperty) {
    cdkBuilder.autoScalingPolicy(autoScalingPolicy)
  }

  /**
   * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
   * Expressed in USD.
   */
  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  /**
   * @param configurations The list of configurations supplied for an EMR cluster instance group.
   */
  public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
    _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
  }

  /**
   * @param configurations The list of configurations supplied for an EMR cluster instance group.
   */
  public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in the
   * instance group.
   */
  public
      fun ebsConfiguration(ebsConfiguration: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
    builder.apply(ebsConfiguration)
    cdkBuilder.ebsConfiguration(builder.build())
  }

  /**
   * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in the
   * instance group.
   */
  public fun ebsConfiguration(ebsConfiguration: EmrCreateCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  /**
   * @param instanceCount Target number of instances for the instance group. 
   */
  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  /**
   * @param instanceRole The role of the instance group in the cluster. 
   */
  public fun instanceRole(instanceRole: EmrCreateCluster.InstanceRoleType) {
    cdkBuilder.instanceRole(instanceRole)
  }

  /**
   * @param instanceType The EC2 instance type for all instances in the instance group. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param market Market type of the EC2 instances used to create a cluster node.
   */
  public fun market(market: EmrCreateCluster.InstanceMarket) {
    cdkBuilder.market(market)
  }

  /**
   * @param name Friendly name given to the instance group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): EmrCreateCluster.InstanceGroupConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
