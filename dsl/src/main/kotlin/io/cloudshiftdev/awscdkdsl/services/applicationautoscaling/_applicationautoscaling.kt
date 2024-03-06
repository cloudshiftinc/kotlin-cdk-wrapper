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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier
import software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps
import software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.CronOptions
import software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
import software.constructs.Construct

public object applicationautoscaling {
    /**
     * An adjustment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * AdjustmentTier adjustmentTier = AdjustmentTier.builder()
     * .adjustment(123)
     * // the properties below are optional
     * .lowerBound(123)
     * .upperBound(123)
     * .build();
     * ```
     */
    public inline fun adjustmentTier(block: AdjustmentTierDsl.() -> Unit = {}): AdjustmentTier {
        val builder = AdjustmentTierDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a ScalableTableAttribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * BaseScalableAttributeProps baseScalableAttributeProps = BaseScalableAttributeProps.builder()
     * .dimension("dimension")
     * .maxCapacity(123)
     * .resourceId("resourceId")
     * .role(role)
     * .serviceNamespace(ServiceNamespace.ECS)
     * // the properties below are optional
     * .minCapacity(123)
     * .build();
     * ```
     */
    public inline fun baseScalableAttributeProps(
        block: BaseScalableAttributePropsDsl.() -> Unit = {}
    ): BaseScalableAttributeProps {
        val builder = BaseScalableAttributePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base interface for target tracking props.
     *
     * Contains the attributes that are common to target tracking policies, except the ones relating
     * to the metric and to the scalable target.
     *
     * This interface is reused by more specific target tracking props objects in other services.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
     * .disableScaleIn(false)
     * .policyName("policyName")
     * .scaleInCooldown(Duration.minutes(30))
     * .scaleOutCooldown(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun baseTargetTrackingProps(
        block: BaseTargetTrackingPropsDsl.() -> Unit = {}
    ): BaseTargetTrackingProps {
        val builder = BaseTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * ScalableAttribute capacity;
     * Metric cpuUtilization;
     * capacity.scaleOnMetric("ScaleToCPU", BasicStepScalingPolicyProps.builder()
     * .metric(cpuUtilization)
     * .scalingSteps(List.of(ScalingInterval.builder().upper(10).change(-1).build(),
     * ScalingInterval.builder().lower(50).change(+1).build(),
     * ScalingInterval.builder().lower(70).change(+3).build()))
     * // Change this to AdjustmentType.PercentChangeInCapacity to interpret the
     * // 'change' numbers before as percentages instead of capacity counts.
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .build());
     * ```
     */
    public inline fun basicStepScalingPolicyProps(
        block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}
    ): BasicStepScalingPolicyProps {
        val builder = BasicStepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Target Tracking policy that include the metric but exclude the target.
     *
     * Example:
     * ```
     * ScalableTarget shardsScalableTarget = ScalableTarget.Builder.create(this,
     * "ElastiCacheRedisShardsScalableTarget")
     * .serviceNamespace(ServiceNamespace.ELASTICACHE)
     * .scalableDimension("elasticache:replication-group:NodeGroups")
     * .minCapacity(2)
     * .maxCapacity(10)
     * .resourceId("replication-group/main-cluster")
     * .build();
     * shardsScalableTarget.scaleToTrackMetric("ElastiCacheRedisShardsCPUUtilization",
     * BasicTargetTrackingScalingPolicyProps.builder()
     * .targetValue(20)
     * .predefinedMetric(PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION)
     * .build());
     * ```
     */
    public inline fun basicTargetTrackingScalingPolicyProps(
        block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit = {}
    ): BasicTargetTrackingScalingPolicyProps {
        val builder = BasicTargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationAutoScaling::ScalableTarget` resource specifies a resource that
     * Application Auto Scaling can scale, such as an AWS::DynamoDB::Table or AWS::ECS::Service
     * resource.
     *
     * For more information, see
     * [Getting started](https://docs.aws.amazon.com/autoscaling/application/userguide/getting-started.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * If the resource that you want Application Auto Scaling to scale is not yet created in your
     * account, add a dependency on the resource when registering it as a scalable target using the
     * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * CfnScalableTarget cfnScalableTarget = CfnScalableTarget.Builder.create(this,
     * "MyCfnScalableTarget")
     * .maxCapacity(123)
     * .minCapacity(123)
     * .resourceId("resourceId")
     * .scalableDimension("scalableDimension")
     * .serviceNamespace("serviceNamespace")
     * // the properties below are optional
     * .roleArn("roleArn")
     * .scheduledActions(List.of(ScheduledActionProperty.builder()
     * .schedule("schedule")
     * .scheduledActionName("scheduledActionName")
     * // the properties below are optional
     * .endTime(new Date())
     * .scalableTargetAction(ScalableTargetActionProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .startTime(new Date())
     * .timezone("timezone")
     * .build()))
     * .suspendedState(SuspendedStateProperty.builder()
     * .dynamicScalingInSuspended(false)
     * .dynamicScalingOutSuspended(false)
     * .scheduledScalingSuspended(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
     */
    public inline fun cfnScalableTarget(
        scope: Construct,
        id: String,
        block: CfnScalableTargetDsl.() -> Unit = {},
    ): CfnScalableTarget {
        val builder = CfnScalableTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScalableTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * CfnScalableTargetProps cfnScalableTargetProps = CfnScalableTargetProps.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .resourceId("resourceId")
     * .scalableDimension("scalableDimension")
     * .serviceNamespace("serviceNamespace")
     * // the properties below are optional
     * .roleArn("roleArn")
     * .scheduledActions(List.of(ScheduledActionProperty.builder()
     * .schedule("schedule")
     * .scheduledActionName("scheduledActionName")
     * // the properties below are optional
     * .endTime(new Date())
     * .scalableTargetAction(ScalableTargetActionProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .startTime(new Date())
     * .timezone("timezone")
     * .build()))
     * .suspendedState(SuspendedStateProperty.builder()
     * .dynamicScalingInSuspended(false)
     * .dynamicScalingOutSuspended(false)
     * .scheduledScalingSuspended(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
     */
    public inline fun cfnScalableTargetProps(
        block: CfnScalableTargetPropsDsl.() -> Unit = {}
    ): CfnScalableTargetProps {
        val builder = CfnScalableTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalableTargetAction` specifies the minimum and maximum capacity for the
     * `ScalableTargetAction` property of the
     * [AWS::ApplicationAutoScaling::ScalableTarget ScheduledAction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * ScalableTargetActionProperty scalableTargetActionProperty =
     * ScalableTargetActionProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html)
     */
    public inline fun cfnScalableTargetScalableTargetActionProperty(
        block: CfnScalableTargetScalableTargetActionPropertyDsl.() -> Unit = {}
    ): CfnScalableTarget.ScalableTargetActionProperty {
        val builder = CfnScalableTargetScalableTargetActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScheduledAction` is a property of the
     * [AWS::ApplicationAutoScaling::ScalableTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
     * resource that specifies a scheduled action for a scalable target.
     *
     * For more information, see
     * [Scheduled scaling](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * ScheduledActionProperty scheduledActionProperty = ScheduledActionProperty.builder()
     * .schedule("schedule")
     * .scheduledActionName("scheduledActionName")
     * // the properties below are optional
     * .endTime(new Date())
     * .scalableTargetAction(ScalableTargetActionProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .startTime(new Date())
     * .timezone("timezone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
     */
    public inline fun cfnScalableTargetScheduledActionProperty(
        block: CfnScalableTargetScheduledActionPropertyDsl.() -> Unit = {}
    ): CfnScalableTarget.ScheduledActionProperty {
        val builder = CfnScalableTargetScheduledActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `SuspendedState` is a property of the
     * [AWS::ApplicationAutoScaling::ScalableTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
     * resource that specifies whether the scaling activities for a scalable target are in a
     * suspended state.
     *
     * For more information, see
     * [Suspending and resuming scaling](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * SuspendedStateProperty suspendedStateProperty = SuspendedStateProperty.builder()
     * .dynamicScalingInSuspended(false)
     * .dynamicScalingOutSuspended(false)
     * .scheduledScalingSuspended(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html)
     */
    public inline fun cfnScalableTargetSuspendedStateProperty(
        block: CfnScalableTargetSuspendedStatePropertyDsl.() -> Unit = {}
    ): CfnScalableTarget.SuspendedStateProperty {
        val builder = CfnScalableTargetSuspendedStatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationAutoScaling::ScalingPolicy` resource defines a scaling policy that
     * Application Auto Scaling uses to adjust the capacity of a scalable target.
     *
     * For more information, see
     * [Target tracking scaling policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
     * and
     * [Step scaling policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * CfnScalingPolicy cfnScalingPolicy = CfnScalingPolicy.Builder.create(this, "MyCfnScalingPolicy")
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .resourceId("resourceId")
     * .scalableDimension("scalableDimension")
     * .scalingTargetId("scalingTargetId")
     * .serviceNamespace("serviceNamespace")
     * .stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty.builder()
     * .adjustmentType("adjustmentType")
     * .cooldown(123)
     * .metricAggregationType("metricAggregationType")
     * .minAdjustmentMagnitude(123)
     * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build()))
     * .build())
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .metrics(List.of(TargetTrackingMetricDataQueryProperty.builder()
     * .expression("expression")
     * .id("id")
     * .label("label")
     * .metricStat(TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
     */
    public inline fun cfnScalingPolicy(
        scope: Construct,
        id: String,
        block: CfnScalingPolicyDsl.() -> Unit = {},
    ): CfnScalingPolicy {
        val builder = CfnScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains customized metric specification information for a target tracking scaling policy for
     * Application Auto Scaling.
     *
     * For information about the available metrics for a service, see
     * [AWS services that publish CloudWatch metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * To create your customized metric specification:
     * * Add values for each required parameter from CloudWatch. You can use an existing metric, or
     *   a new metric that you create. To use your own metric, you must first publish the metric to
     *   CloudWatch. For more information, see
     *   [Publish custom metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     * * Choose a metric that changes proportionally with capacity. The value of the metric should
     *   increase or decrease in inverse proportion to the number of capacity units. That is, the
     *   value of the metric should decrease when capacity increases, and increase when capacity
     *   decreases.
     *
     * For an example of how creating new metrics can be useful, see
     * [Scaling based on Amazon SQS](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . This topic mentions Auto Scaling groups, but
     * the same scenario for Amazon SQS can apply to the target tracking scaling policies that you
     * create for a Spot Fleet by using Application Auto Scaling.
     *
     * For more information about the CloudWatch terminology below, see
     * [Amazon CloudWatch concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * .
     *
     * `CustomizedMetricSpecification` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * CustomizedMetricSpecificationProperty customizedMetricSpecificationProperty =
     * CustomizedMetricSpecificationProperty.builder()
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .metrics(List.of(TargetTrackingMetricDataQueryProperty.builder()
     * .expression("expression")
     * .id("id")
     * .label("label")
     * .metricStat(TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
     */
    public inline fun cfnScalingPolicyCustomizedMetricSpecificationProperty(
        block: CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
        val builder = CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricDimension` specifies a name/value pair that is part of the identity of a CloudWatch
     * metric for the `Dimensions` property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
     * property type. Duplicate dimensions are not allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html)
     */
    public inline fun cfnScalingPolicyMetricDimensionProperty(
        block: CfnScalingPolicyMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.MetricDimensionProperty {
        val builder = CfnScalingPolicyMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains predefined metric specification information for a target tracking scaling policy for
     * Application Auto Scaling.
     *
     * `PredefinedMetricSpecification` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * PredefinedMetricSpecificationProperty predefinedMetricSpecificationProperty =
     * PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html)
     */
    public inline fun cfnScalingPolicyPredefinedMetricSpecificationProperty(
        block: CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredefinedMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScalingPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * CfnScalingPolicyProps cfnScalingPolicyProps = CfnScalingPolicyProps.builder()
     * .policyName("policyName")
     * .policyType("policyType")
     * // the properties below are optional
     * .resourceId("resourceId")
     * .scalableDimension("scalableDimension")
     * .scalingTargetId("scalingTargetId")
     * .serviceNamespace("serviceNamespace")
     * .stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty.builder()
     * .adjustmentType("adjustmentType")
     * .cooldown(123)
     * .metricAggregationType("metricAggregationType")
     * .minAdjustmentMagnitude(123)
     * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build()))
     * .build())
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .metrics(List.of(TargetTrackingMetricDataQueryProperty.builder()
     * .expression("expression")
     * .id("id")
     * .label("label")
     * .metricStat(TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
     */
    public inline fun cfnScalingPolicyProps(
        block: CfnScalingPolicyPropsDsl.() -> Unit = {}
    ): CfnScalingPolicyProps {
        val builder = CfnScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StepAdjustment` specifies a step adjustment for the `StepAdjustments` property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy StepScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
     * property type.
     *
     * For the following examples, suppose that you have an alarm with a breach threshold of 50:
     * * To trigger a step adjustment when the metric is greater than or equal to 50 and less than
     *   60, specify a lower bound of 0 and an upper bound of 10.
     * * To trigger a step adjustment when the metric is greater than 40 and less than or equal to
     *   50, specify a lower bound of -10 and an upper bound of 0.
     *
     * For more information, see
     * [Step adjustments](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#as-scaling-steps)
     * in the *Application Auto Scaling User Guide* .
     *
     * You can find a sample template snippet in the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#aws-resource-applicationautoscaling-scalingpolicy--examples)
     * section of the `AWS::ApplicationAutoScaling::ScalingPolicy` documentation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * StepAdjustmentProperty stepAdjustmentProperty = StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html)
     */
    public inline fun cfnScalingPolicyStepAdjustmentProperty(
        block: CfnScalingPolicyStepAdjustmentPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.StepAdjustmentProperty {
        val builder = CfnScalingPolicyStepAdjustmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StepScalingPolicyConfiguration` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
     * resource that specifies a step scaling policy configuration for Application Auto Scaling.
     *
     * For more information, see
     * [Step scaling policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * StepScalingPolicyConfigurationProperty stepScalingPolicyConfigurationProperty =
     * StepScalingPolicyConfigurationProperty.builder()
     * .adjustmentType("adjustmentType")
     * .cooldown(123)
     * .metricAggregationType("metricAggregationType")
     * .minAdjustmentMagnitude(123)
     * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
     */
    public inline fun cfnScalingPolicyStepScalingPolicyConfigurationProperty(
        block: CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.StepScalingPolicyConfigurationProperty {
        val builder = CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metric data to return.
     *
     * Also defines whether this call is returning data for one metric only, or whether it is
     * performing a math expression on the values of returned metric statistics to create a new time
     * series. A time series is a series of data points, each of which is associated with a
     * timestamp.
     *
     * You can call for a single metric or perform math expressions on multiple metrics. Any
     * expressions used in a metric specification must eventually return a single time series.
     *
     * For more information and examples, see
     * [Create a target tracking scaling policy for Application Auto Scaling using metric math](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking-metric-math.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * `TargetTrackingMetricDataQuery` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * TargetTrackingMetricDataQueryProperty targetTrackingMetricDataQueryProperty =
     * TargetTrackingMetricDataQueryProperty.builder()
     * .expression("expression")
     * .id("id")
     * .label("label")
     * .metricStat(TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingMetricDataQueryProperty(
        block: CfnScalingPolicyTargetTrackingMetricDataQueryPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingMetricDataQueryProperty {
        val builder = CfnScalingPolicyTargetTrackingMetricDataQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TargetTrackingMetricDimension` specifies a name/value pair that is part of the identity of a
     * CloudWatch metric for the `Dimensions` property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html)
     * property type. Duplicate dimensions are not allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * TargetTrackingMetricDimensionProperty targetTrackingMetricDimensionProperty =
     * TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingMetricDimensionProperty(
        block: CfnScalingPolicyTargetTrackingMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingMetricDimensionProperty {
        val builder = CfnScalingPolicyTargetTrackingMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a specific metric for a target tracking scaling policy for Application Auto
     * Scaling.
     *
     * Metric is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingMetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * TargetTrackingMetricProperty targetTrackingMetricProperty =
     * TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingMetricProperty(
        block: CfnScalingPolicyTargetTrackingMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingMetricProperty {
        val builder = CfnScalingPolicyTargetTrackingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines the CloudWatch metric to return, along with the statistic, period, and
     * unit.
     *
     * `TargetTrackingMetricStat` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingMetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
     * property type.
     *
     * For more information about the CloudWatch terminology below, see
     * [Amazon CloudWatch concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * TargetTrackingMetricStatProperty targetTrackingMetricStatProperty =
     * TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingMetricStatProperty(
        block: CfnScalingPolicyTargetTrackingMetricStatPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingMetricStatProperty {
        val builder = CfnScalingPolicyTargetTrackingMetricStatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TargetTrackingScalingPolicyConfiguration` is a property of the
     * [AWS::ApplicationAutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
     * resource that specifies a target tracking scaling policy configuration for Application Auto
     * Scaling. Use a target tracking scaling policy to adjust the capacity of the specified
     * scalable target in response to actual workloads, so that resource utilization remains at or
     * near the target utilization value.
     *
     * For more information, see
     * [Target tracking scaling policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * TargetTrackingScalingPolicyConfigurationProperty
     * targetTrackingScalingPolicyConfigurationProperty =
     * TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .metrics(List.of(TargetTrackingMetricDataQueryProperty.builder()
     * .expression("expression")
     * .id("id")
     * .label("label")
     * .metricStat(TargetTrackingMetricStatProperty.builder()
     * .metric(TargetTrackingMetricProperty.builder()
     * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .stat("stat")
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .statistic("statistic")
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingScalingPolicyConfigurationProperty(
        block: CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty {
        val builder = CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure a cron expression.
     *
     * All fields are strings so you can use complex expressions. Absence of a field implies '*' or
     * '?', whichever one is appropriate.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ScalableTaskCount scalableTarget =
     * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
     * .minCapacity(5)
     * .maxCapacity(20)
     * .build());
     * scalableTarget.scaleOnSchedule("DaytimeScaleDown", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(1)
     * .build());
     * scalableTarget.scaleOnSchedule("EveningRushScaleUp", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
     * .minCapacity(10)
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     */
    public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
        val builder = CronOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling Application Auto Scaling.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ScalableTaskCount scalableTarget =
     * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
     * .minCapacity(1)
     * .maxCapacity(20)
     * .build());
     * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * scalableTarget.scaleOnMemoryUtilization("MemoryScaling",
     * MemoryUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * ```
     */
    public inline fun enableScalingProps(
        block: EnableScalingPropsDsl.() -> Unit = {}
    ): EnableScalingProps {
        val builder = EnableScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a scalable target.
     *
     * Example:
     * ```
     * ScalableTarget shardsScalableTarget = ScalableTarget.Builder.create(this,
     * "ElastiCacheRedisShardsScalableTarget")
     * .serviceNamespace(ServiceNamespace.ELASTICACHE)
     * .scalableDimension("elasticache:replication-group:NodeGroups")
     * .minCapacity(2)
     * .maxCapacity(10)
     * .resourceId("replication-group/main-cluster")
     * .build();
     * shardsScalableTarget.scaleToTrackMetric("ElastiCacheRedisShardsCPUUtilization",
     * BasicTargetTrackingScalingPolicyProps.builder()
     * .targetValue(20)
     * .predefinedMetric(PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION)
     * .build());
     * ```
     */
    public inline fun scalableTarget(
        scope: Construct,
        id: String,
        block: ScalableTargetDsl.() -> Unit = {},
    ): ScalableTarget {
        val builder = ScalableTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a scalable target.
     *
     * Example:
     * ```
     * ScalableTarget shardsScalableTarget = ScalableTarget.Builder.create(this,
     * "ElastiCacheRedisShardsScalableTarget")
     * .serviceNamespace(ServiceNamespace.ELASTICACHE)
     * .scalableDimension("elasticache:replication-group:NodeGroups")
     * .minCapacity(2)
     * .maxCapacity(10)
     * .resourceId("replication-group/main-cluster")
     * .build();
     * shardsScalableTarget.scaleToTrackMetric("ElastiCacheRedisShardsCPUUtilization",
     * BasicTargetTrackingScalingPolicyProps.builder()
     * .targetValue(20)
     * .predefinedMetric(PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION)
     * .build());
     * ```
     */
    public inline fun scalableTargetProps(
        block: ScalableTargetPropsDsl.() -> Unit = {}
    ): ScalableTargetProps {
        val builder = ScalableTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A range of metric values in which to apply a certain scaling operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * ScalingInterval scalingInterval = ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build();
     * ```
     */
    public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
        val builder = ScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scheduled scaling action.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ScalableTaskCount scalableTarget =
     * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
     * .minCapacity(5)
     * .maxCapacity(20)
     * .build());
     * scalableTarget.scaleOnSchedule("DaytimeScaleDown", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(1)
     * .build());
     * scalableTarget.scaleOnSchedule("EveningRushScaleUp", ScalingSchedule.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
     * .minCapacity(10)
     * .build());
     * ```
     */
    public inline fun scalingSchedule(block: ScalingScheduleDsl.() -> Unit = {}): ScalingSchedule {
        val builder = ScalingScheduleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a step scaling action.
     *
     * This kind of scaling policy adjusts the target capacity in configurable steps. The size of
     * the step is configurable based on the metric's distance to its alarm threshold.
     *
     * This Action must be used as the target of a CloudWatch alarm to take effect.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * ScalableTarget scalableTarget;
     * StepScalingAction stepScalingAction = StepScalingAction.Builder.create(this,
     * "MyStepScalingAction")
     * .scalingTarget(scalableTarget)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .policyName("policyName")
     * .build();
     * ```
     */
    public inline fun stepScalingAction(
        scope: Construct,
        id: String,
        block: StepScalingActionDsl.() -> Unit = {},
    ): StepScalingAction {
        val builder = StepScalingActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a scaling policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * ScalableTarget scalableTarget;
     * StepScalingActionProps stepScalingActionProps = StepScalingActionProps.builder()
     * .scalingTarget(scalableTarget)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .policyName("policyName")
     * .build();
     * ```
     */
    public inline fun stepScalingActionProps(
        block: StepScalingActionPropsDsl.() -> Unit = {}
    ): StepScalingActionProps {
        val builder = StepScalingActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a scaling strategy which scales depending on absolute values of some metric.
     *
     * You can specify the scaling behavior for various values of the metric.
     *
     * Implemented using one or more CloudWatch alarms and Step Scaling Policies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * ScalableTarget scalableTarget;
     * StepScalingPolicy stepScalingPolicy = StepScalingPolicy.Builder.create(this,
     * "MyStepScalingPolicy")
     * .metric(metric)
     * .scalingSteps(List.of(ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build()))
     * .scalingTarget(scalableTarget)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .datapointsToAlarm(123)
     * .evaluationPeriods(123)
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingPolicy(
        scope: Construct,
        id: String,
        block: StepScalingPolicyDsl.() -> Unit = {},
    ): StepScalingPolicy {
        val builder = StepScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * ScalableTarget scalableTarget;
     * StepScalingPolicyProps stepScalingPolicyProps = StepScalingPolicyProps.builder()
     * .metric(metric)
     * .scalingSteps(List.of(ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build()))
     * .scalingTarget(scalableTarget)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .datapointsToAlarm(123)
     * .evaluationPeriods(123)
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingPolicyProps(
        block: StepScalingPolicyPropsDsl.() -> Unit = {}
    ): StepScalingPolicyProps {
        val builder = StepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * ScalableTarget scalableTarget;
     * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
     * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
     * .scalingTarget(scalableTarget)
     * .targetValue(123)
     * // the properties below are optional
     * .customMetric(metric)
     * .disableScaleIn(false)
     * .policyName("policyName")
     * .predefinedMetric(PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION)
     * .resourceLabel("resourceLabel")
     * .scaleInCooldown(Duration.minutes(30))
     * .scaleOutCooldown(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun targetTrackingScalingPolicy(
        scope: Construct,
        id: String,
        block: TargetTrackingScalingPolicyDsl.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
        val builder = TargetTrackingScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a concrete TargetTrackingPolicy.
     *
     * Adds the scalingTarget.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * ScalableTarget scalableTarget;
     * TargetTrackingScalingPolicyProps targetTrackingScalingPolicyProps =
     * TargetTrackingScalingPolicyProps.builder()
     * .scalingTarget(scalableTarget)
     * .targetValue(123)
     * // the properties below are optional
     * .customMetric(metric)
     * .disableScaleIn(false)
     * .policyName("policyName")
     * .predefinedMetric(PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION)
     * .resourceLabel("resourceLabel")
     * .scaleInCooldown(Duration.minutes(30))
     * .scaleOutCooldown(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun targetTrackingScalingPolicyProps(
        block: TargetTrackingScalingPolicyPropsDsl.() -> Unit = {}
    ): TargetTrackingScalingPolicyProps {
        val builder = TargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
