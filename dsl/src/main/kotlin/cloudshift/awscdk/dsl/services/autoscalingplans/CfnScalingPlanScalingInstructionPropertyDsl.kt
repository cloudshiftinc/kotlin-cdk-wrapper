@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `ScalingInstruction` is a property of
 * [ScalingPlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 * that specifies the scaling instruction for a scalable resource in a scaling plan. Each scaling
 * instruction applies to one resource.
 *
 * AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions.
 * Target tracking scaling policies adjust the capacity of your scalable resource as required to
 * maintain resource utilization at the target value that you specified.
 *
 * AWS Auto Scaling also configures predictive scaling for your Amazon EC2 Auto Scaling groups using
 * a subset of properties, including the load metric, the scaling metric, the target value for the
 * scaling metric, the predictive scaling mode (forecast and scale or forecast only), and the desired
 * behavior when the forecast capacity exceeds the maximum capacity of the resource. With predictive
 * scaling, AWS Auto Scaling generates forecasts with traffic predictions for the two days ahead and
 * schedules scaling actions that proactively add and remove resource capacity to match the forecast.
 *
 *
 * We recommend waiting a minimum of 24 hours after creating an Auto Scaling group to configure
 * predictive scaling. At minimum, there must be 24 hours of historical data to generate a forecast.
 * For more information, see [Best Practices for AWS Auto
 * Scaling](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-best-practices.html) in the *AWS
 * Auto Scaling User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * ScalingInstructionProperty scalingInstructionProperty = ScalingInstructionProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .resourceId("resourceId")
 * .scalableDimension("scalableDimension")
 * .serviceNamespace("serviceNamespace")
 * .targetTrackingConfigurations(List.of(TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedScalingMetricSpecification(CustomizedScalingMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(123)
 * .predefinedScalingMetricSpecification(PredefinedScalingMetricSpecificationProperty.builder()
 * .predefinedScalingMetricType("predefinedScalingMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build()))
 * // the properties below are optional
 * .customizedLoadMetricSpecification(CustomizedLoadMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableDynamicScaling(false)
 * .predefinedLoadMetricSpecification(PredefinedLoadMetricSpecificationProperty.builder()
 * .predefinedLoadMetricType("predefinedLoadMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predictiveScalingMaxCapacityBehavior("predictiveScalingMaxCapacityBehavior")
 * .predictiveScalingMaxCapacityBuffer(123)
 * .predictiveScalingMode("predictiveScalingMode")
 * .scalingPolicyUpdateBehavior("scalingPolicyUpdateBehavior")
 * .scheduledActionBufferTime(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
 */
@CdkDslMarker
public class CfnScalingPlanScalingInstructionPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.ScalingInstructionProperty.Builder =
      CfnScalingPlan.ScalingInstructionProperty.builder()

  private val _targetTrackingConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param customizedLoadMetricSpecification The customized load metric to use for predictive
   * scaling.
   * This property or a *PredefinedLoadMetricSpecification* is required when configuring predictive
   * scaling, and cannot be used otherwise.
   */
  public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param customizedLoadMetricSpecification The customized load metric to use for predictive
   * scaling.
   * This property or a *PredefinedLoadMetricSpecification* is required when configuring predictive
   * scaling, and cannot be used otherwise.
   */
  public
      fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CfnScalingPlan.CustomizedLoadMetricSpecificationProperty) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param disableDynamicScaling Controls whether dynamic scaling by AWS Auto Scaling is disabled.
   * When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling policies
   * based on the specified target tracking configurations.
   *
   * The default is enabled ( `false` ).
   */
  public fun disableDynamicScaling(disableDynamicScaling: Boolean) {
    cdkBuilder.disableDynamicScaling(disableDynamicScaling)
  }

  /**
   * @param disableDynamicScaling Controls whether dynamic scaling by AWS Auto Scaling is disabled.
   * When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling policies
   * based on the specified target tracking configurations.
   *
   * The default is enabled ( `false` ).
   */
  public fun disableDynamicScaling(disableDynamicScaling: IResolvable) {
    cdkBuilder.disableDynamicScaling(disableDynamicScaling)
  }

  /**
   * @param maxCapacity The maximum capacity of the resource. 
   * The exception to this upper limit is if you specify a non-default setting for
   * *PredictiveScalingMaxCapacityBehavior* .
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum capacity of the resource. 
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric to use for predictive
   * scaling.
   * This property or a *CustomizedLoadMetricSpecification* is required when configuring predictive
   * scaling, and cannot be used otherwise.
   */
  public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric to use for predictive
   * scaling.
   * This property or a *CustomizedLoadMetricSpecification* is required when configuring predictive
   * scaling, and cannot be used otherwise.
   */
  public
      fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: CfnScalingPlan.PredefinedLoadMetricSpecificationProperty) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predictiveScalingMaxCapacityBehavior Defines the behavior that should be applied if the
   * forecast capacity approaches or exceeds the maximum capacity specified for the resource.
   * The default value is `SetForecastCapacityToMaxCapacity` .
   *
   * The following are possible values:
   *
   * * `SetForecastCapacityToMaxCapacity` - AWS Auto Scaling cannot scale resource capacity higher
   * than the maximum capacity. The maximum capacity is enforced as a hard limit.
   * * `SetMaxCapacityToForecastCapacity` - AWS Auto Scaling can scale resource capacity higher than
   * the maximum capacity to equal but not exceed forecast capacity.
   * * `SetMaxCapacityAboveForecastCapacity` - AWS Auto Scaling can scale resource capacity higher
   * than the maximum capacity by a specified buffer value. The intention is to give the target
   * tracking scaling policy extra capacity if unexpected traffic occurs.
   *
   * Valid only when configuring predictive scaling.
   */
  public fun predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior: String) {
    cdkBuilder.predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior)
  }

  /**
   * @param predictiveScalingMaxCapacityBuffer The size of the capacity buffer to use when the
   * forecast capacity is close to or exceeds the maximum capacity.
   * The value is specified as a percentage relative to the forecast capacity. For example, if the
   * buffer is 10, this means a 10 percent buffer. With a 10 percent buffer, if the forecast capacity
   * is 50, and the maximum capacity is 40, then the effective maximum capacity is 55.
   *
   * Valid only when configuring predictive scaling. Required if
   * *PredictiveScalingMaxCapacityBehavior* is set to `SetMaxCapacityAboveForecastCapacity` , and
   * cannot be used otherwise.
   *
   * The range is 1-100.
   */
  public fun predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer: Number) {
    cdkBuilder.predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer)
  }

  /**
   * @param predictiveScalingMode The predictive scaling mode.
   * The default value is `ForecastAndScale` . Otherwise, AWS Auto Scaling forecasts capacity but
   * does not apply any scheduled scaling actions based on the capacity forecast.
   */
  public fun predictiveScalingMode(predictiveScalingMode: String) {
    cdkBuilder.predictiveScalingMode(predictiveScalingMode)
  }

  /**
   * @param resourceId The ID of the resource. This string consists of the resource type and unique
   * identifier. 
   * * Auto Scaling group - The resource type is `autoScalingGroup` and the unique identifier is the
   * name of the Auto Scaling group. Example: `autoScalingGroup/my-asg` .
   * * ECS service - The resource type is `service` and the unique identifier is the cluster name
   * and service name. Example: `service/default/sample-webapp` .
   * * Spot Fleet request - The resource type is `spot-fleet-request` and the unique identifier is
   * the Spot Fleet request ID. Example: `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE`
   * .
   * * DynamoDB table - The resource type is `table` and the unique identifier is the resource ID.
   * Example: `table/my-table` .
   * * DynamoDB global secondary index - The resource type is `index` and the unique identifier is
   * the resource ID. Example: `table/my-table/index/my-table-index` .
   * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the cluster
   * name. Example: `cluster:my-db-cluster` .
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param scalableDimension The scalable dimension associated with the resource. 
   * * `autoscaling:autoScalingGroup:DesiredCapacity` - The desired capacity of an Auto Scaling
   * group.
   * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
   * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet request.
   * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB table.
   * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB table.
   * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB global
   * secondary index.
   * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB global
   * secondary index.
   * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB cluster.
   * Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
   */
  public fun scalableDimension(scalableDimension: String) {
    cdkBuilder.scalableDimension(scalableDimension)
  }

  /**
   * @param scalingPolicyUpdateBehavior Controls whether your scaling policies that are external to
   * AWS Auto Scaling are deleted and new target tracking scaling policies created.
   * The default value is `KeepExternalPolicies` .
   *
   * Valid only when configuring dynamic scaling.
   */
  public fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String) {
    cdkBuilder.scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior)
  }

  /**
   * @param scheduledActionBufferTime The amount of time, in seconds, to buffer the run time of
   * scheduled scaling actions when scaling out.
   * For example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5
   * minutes, then the run time of the corresponding scheduled scaling action will be 9:55 AM. The
   * intention is to give resources time to be provisioned. For example, it can take a few minutes to
   * launch an EC2 instance. The actual amount of time required depends on several factors, such as the
   * size of the instance and whether there are startup scripts to complete.
   *
   * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The
   * default is 300 seconds.
   *
   * Valid only when configuring predictive scaling.
   */
  public fun scheduledActionBufferTime(scheduledActionBufferTime: Number) {
    cdkBuilder.scheduledActionBufferTime(scheduledActionBufferTime)
  }

  /**
   * @param serviceNamespace The namespace of the AWS service. 
   */
  public fun serviceNamespace(serviceNamespace: String) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  /**
   * @param targetTrackingConfigurations The target tracking configurations (up to 10). 
   * Each of these structures must specify a unique scaling metric and a target value for the
   * metric.
   */
  public fun targetTrackingConfigurations(vararg targetTrackingConfigurations: Any) {
    _targetTrackingConfigurations.addAll(listOf(*targetTrackingConfigurations))
  }

  /**
   * @param targetTrackingConfigurations The target tracking configurations (up to 10). 
   * Each of these structures must specify a unique scaling metric and a target value for the
   * metric.
   */
  public fun targetTrackingConfigurations(targetTrackingConfigurations: Collection<Any>) {
    _targetTrackingConfigurations.addAll(targetTrackingConfigurations)
  }

  /**
   * @param targetTrackingConfigurations The target tracking configurations (up to 10). 
   * Each of these structures must specify a unique scaling metric and a target value for the
   * metric.
   */
  public fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable) {
    cdkBuilder.targetTrackingConfigurations(targetTrackingConfigurations)
  }

  public fun build(): CfnScalingPlan.ScalingInstructionProperty {
    if(_targetTrackingConfigurations.isNotEmpty())
        cdkBuilder.targetTrackingConfigurations(_targetTrackingConfigurations)
    return cdkBuilder.build()
  }
}
