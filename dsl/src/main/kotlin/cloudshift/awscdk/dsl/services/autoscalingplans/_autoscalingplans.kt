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

package cloudshift.awscdk.dsl.services.autoscalingplans

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
import software.constructs.Construct

public object autoscalingplans {
    /**
     * The `AWS::AutoScalingPlans::ScalingPlan` resource defines an AWS Auto Scaling scaling plan.
     *
     * A scaling plan is used to scale application resources to size them appropriately to ensure
     * that enough resource is available in the application at peak times and to reduce allocated
     * resource during periods of low utilization. The following resources can be added to a scaling
     * plan:
     * * Amazon EC2 Auto Scaling groups
     * * Amazon EC2 Spot Fleet requests
     * * Amazon ECS services
     * * Amazon DynamoDB tables and global secondary indexes
     * * Amazon Aurora Replicas
     *
     * For more information, see the
     * [AWS Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * CfnScalingPlan cfnScalingPlan = CfnScalingPlan.Builder.create(this, "MyCfnScalingPlan")
     * .applicationSource(ApplicationSourceProperty.builder()
     * .cloudFormationStackArn("cloudFormationStackArn")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .scalingInstructions(List.of(ScalingInstructionProperty.builder()
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
     */
    public inline fun cfnScalingPlan(
        scope: Construct,
        id: String,
        block: CfnScalingPlanDsl.() -> Unit = {},
    ): CfnScalingPlan {
        val builder = CfnScalingPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ApplicationSource` is a property of
     * [ScalingPlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
     * that specifies the application source to use with AWS Auto Scaling ( Auto Scaling Plans ).
     * You can create one scaling plan per application source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * ApplicationSourceProperty applicationSourceProperty = ApplicationSourceProperty.builder()
     * .cloudFormationStackArn("cloudFormationStackArn")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html)
     */
    public inline fun cfnScalingPlanApplicationSourceProperty(
        block: CfnScalingPlanApplicationSourcePropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.ApplicationSourceProperty {
        val builder = CfnScalingPlanApplicationSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CustomizedLoadMetricSpecification` is a subproperty of
     * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
     * that specifies a customized load metric for predictive scaling to use with AWS Auto Scaling (
     * Auto Scaling Plans ).
     *
     * For predictive scaling to work with a customized load metric specification, AWS Auto Scaling
     * needs access to the `Sum` and `Average` statistics that CloudWatch computes from metric data.
     *
     * When you choose a load metric, make sure that the required `Sum` and `Average` statistics for
     * your metric are available in CloudWatch and that they provide relevant data for predictive
     * scaling. The `Sum` statistic must represent the total load on the resource, and the `Average`
     * statistic must represent the average load per capacity unit of the resource. For example,
     * there is a metric that counts the number of requests processed by your Auto Scaling group. If
     * the `Sum` statistic represents the total request count processed by the group, then the
     * `Average` statistic for the specified metric must represent the average request count
     * processed by each instance of the group.
     *
     * If you publish your own metrics, you can aggregate the data points at a given interval and
     * then publish the aggregated data points to CloudWatch. Before AWS Auto Scaling generates the
     * forecast, it sums up all the metric data points that occurred within each hour to match the
     * granularity period that is used in the forecast (60 minutes).
     *
     * For information about terminology, available metrics, or how to publish new metrics, see
     * [Amazon CloudWatch Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * After creating your scaling plan, you can use the AWS Auto Scaling console to visualize
     * forecasts for the specified metric. For more information, see
     * [View Scaling Information for a Resource](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource)
     * in the *AWS Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * CustomizedLoadMetricSpecificationProperty customizedLoadMetricSpecificationProperty =
     * CustomizedLoadMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html)
     */
    public inline fun cfnScalingPlanCustomizedLoadMetricSpecificationProperty(
        block: CfnScalingPlanCustomizedLoadMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.CustomizedLoadMetricSpecificationProperty {
        val builder = CfnScalingPlanCustomizedLoadMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CustomizedScalingMetricSpecification` is a subproperty of
     * [TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
     * that specifies a customized scaling metric for a target tracking configuration to use with
     * AWS Auto Scaling ( Auto Scaling Plans ).
     *
     * To create your customized scaling metric specification:
     * * Add values for each required property from CloudWatch. You can use an existing metric, or a
     *   new metric that you create. To use your own metric, you must first publish the metric to
     *   CloudWatch. For more information, see
     *   [Publish Custom Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     * * Choose a metric that changes proportionally with capacity. The value of the metric should
     *   increase or decrease in inverse proportion to the number of capacity units. That is, the
     *   value of the metric should decrease when capacity increases.
     *
     * For information about terminology, available metrics, or how to publish new metrics, see
     * [Amazon CloudWatch Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * CustomizedScalingMetricSpecificationProperty customizedScalingMetricSpecificationProperty =
     * CustomizedScalingMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html)
     */
    public inline fun cfnScalingPlanCustomizedScalingMetricSpecificationProperty(
        block: CfnScalingPlanCustomizedScalingMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.CustomizedScalingMetricSpecificationProperty {
        val builder = CfnScalingPlanCustomizedScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricDimension` is a subproperty of
     * [CustomizedScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html)
     * that specifies a dimension for a customized metric to use with AWS Auto Scaling ( Auto
     * Scaling Plans ). Dimensions are arbitrary name/value pairs that can be associated with a
     * CloudWatch metric. Duplicate dimensions are not allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html)
     */
    public inline fun cfnScalingPlanMetricDimensionProperty(
        block: CfnScalingPlanMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.MetricDimensionProperty {
        val builder = CfnScalingPlanMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PredefinedLoadMetricSpecification` is a subproperty of
     * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
     * that specifies a predefined load metric for predictive scaling to use with AWS Auto Scaling (
     * Auto Scaling Plans ).
     *
     * After creating your scaling plan, you can use the AWS Auto Scaling console to visualize
     * forecasts for the specified metric. For more information, see
     * [View Scaling Information for a Resource](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource)
     * in the *AWS Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * PredefinedLoadMetricSpecificationProperty predefinedLoadMetricSpecificationProperty =
     * PredefinedLoadMetricSpecificationProperty.builder()
     * .predefinedLoadMetricType("predefinedLoadMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html)
     */
    public inline fun cfnScalingPlanPredefinedLoadMetricSpecificationProperty(
        block: CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.PredefinedLoadMetricSpecificationProperty {
        val builder = CfnScalingPlanPredefinedLoadMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PredefinedScalingMetricSpecification` is a subproperty of
     * [TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
     * that specifies a customized scaling metric for a target tracking configuration to use with
     * AWS Auto Scaling ( Auto Scaling Plans ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * PredefinedScalingMetricSpecificationProperty predefinedScalingMetricSpecificationProperty =
     * PredefinedScalingMetricSpecificationProperty.builder()
     * .predefinedScalingMetricType("predefinedScalingMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedscalingmetricspecification.html)
     */
    public inline fun cfnScalingPlanPredefinedScalingMetricSpecificationProperty(
        block: CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.PredefinedScalingMetricSpecificationProperty {
        val builder = CfnScalingPlanPredefinedScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScalingPlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * CfnScalingPlanProps cfnScalingPlanProps = CfnScalingPlanProps.builder()
     * .applicationSource(ApplicationSourceProperty.builder()
     * .cloudFormationStackArn("cloudFormationStackArn")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .scalingInstructions(List.of(ScalingInstructionProperty.builder()
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
     */
    public inline fun cfnScalingPlanProps(
        block: CfnScalingPlanPropsDsl.() -> Unit = {}
    ): CfnScalingPlanProps {
        val builder = CfnScalingPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `ScalingInstruction` is a property of
     * [ScalingPlan](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
     * that specifies the scaling instruction for a scalable resource in a scaling plan. Each
     * scaling instruction applies to one resource.
     *
     * AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions.
     * Target tracking scaling policies adjust the capacity of your scalable resource as required to
     * maintain resource utilization at the target value that you specified.
     *
     * AWS Auto Scaling also configures predictive scaling for your Amazon EC2 Auto Scaling groups
     * using a subset of properties, including the load metric, the scaling metric, the target value
     * for the scaling metric, the predictive scaling mode (forecast and scale or forecast only),
     * and the desired behavior when the forecast capacity exceeds the maximum capacity of the
     * resource. With predictive scaling, AWS Auto Scaling generates forecasts with traffic
     * predictions for the two days ahead and schedules scaling actions that proactively add and
     * remove resource capacity to match the forecast.
     *
     * We recommend waiting a minimum of 24 hours after creating an Auto Scaling group to configure
     * predictive scaling. At minimum, there must be 24 hours of historical data to generate a
     * forecast. For more information, see
     * [Best Practices for AWS Auto Scaling](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-best-practices.html)
     * in the *AWS Auto Scaling User Guide* .
     *
     * Example:
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
    public inline fun cfnScalingPlanScalingInstructionProperty(
        block: CfnScalingPlanScalingInstructionPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.ScalingInstructionProperty {
        val builder = CfnScalingPlanScalingInstructionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TagFilter` is a subproperty of
     * [ApplicationSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html)
     * that specifies a tag for an application source to use with AWS Auto Scaling ( Auto Scaling
     * Plans ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
     * .key("key")
     * // the properties below are optional
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-tagfilter.html)
     */
    public inline fun cfnScalingPlanTagFilterProperty(
        block: CfnScalingPlanTagFilterPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.TagFilterProperty {
        val builder = CfnScalingPlanTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TargetTrackingConfiguration` is a subproperty of
     * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
     * that specifies a target tracking configuration to use with AWS Auto Scaling ( Auto Scaling
     * Plans ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscalingplans.*;
     * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
     * TargetTrackingConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
     */
    public inline fun cfnScalingPlanTargetTrackingConfigurationProperty(
        block: CfnScalingPlanTargetTrackingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScalingPlan.TargetTrackingConfigurationProperty {
        val builder = CfnScalingPlanTargetTrackingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
