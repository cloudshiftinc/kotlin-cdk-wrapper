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

package io.cloudshiftdev.awscdkdsl.services.evidently

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnExperimentProps
import software.amazon.awscdk.services.evidently.CfnFeature
import software.amazon.awscdk.services.evidently.CfnFeatureProps
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnLaunchProps
import software.amazon.awscdk.services.evidently.CfnProject
import software.amazon.awscdk.services.evidently.CfnProjectProps
import software.amazon.awscdk.services.evidently.CfnSegment
import software.amazon.awscdk.services.evidently.CfnSegmentProps
import software.constructs.Construct

public object evidently {
    /**
     * Creates or updates an Evidently *experiment* .
     *
     * Before you create an experiment, you must create the feature to use for the experiment.
     *
     * An experiment helps you make feature design decisions based on evidence and data. An
     * experiment can test as many as five variations at once. Evidently collects experiment data
     * and analyzes it by statistical methods, and provides clear recommendations about which
     * variations perform better.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnExperiment cfnExperiment = CfnExperiment.Builder.create(this, "MyCfnExperiment")
     * .metricGoals(List.of(MetricGoalObjectProperty.builder()
     * .desiredChange("desiredChange")
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build()))
     * .name("name")
     * .onlineAbConfig(OnlineAbConfigObjectProperty.builder()
     * .controlTreatmentName("controlTreatmentName")
     * .treatmentWeights(List.of(TreatmentToWeightProperty.builder()
     * .splitWeight(123)
     * .treatment("treatment")
     * .build()))
     * .build())
     * .project("project")
     * .treatments(List.of(TreatmentObjectProperty.builder()
     * .feature("feature")
     * .treatmentName("treatmentName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .randomizationSalt("randomizationSalt")
     * .removeSegment(false)
     * .runningStatus(RunningStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .analysisCompleteTime("analysisCompleteTime")
     * .desiredState("desiredState")
     * .reason("reason")
     * .build())
     * .samplingRate(123)
     * .segment("segment")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html)
     */
    public inline fun cfnExperiment(
        scope: Construct,
        id: String,
        block: CfnExperimentDsl.() -> Unit = {},
    ): CfnExperiment {
        val builder = CfnExperimentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to tell Evidently whether higher or lower values are desired for a metric
     * that is used in an experiment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * MetricGoalObjectProperty metricGoalObjectProperty = MetricGoalObjectProperty.builder()
     * .desiredChange("desiredChange")
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-metricgoalobject.html)
     */
    public inline fun cfnExperimentMetricGoalObjectProperty(
        block: CfnExperimentMetricGoalObjectPropertyDsl.() -> Unit = {}
    ): CfnExperiment.MetricGoalObjectProperty {
        val builder = CfnExperimentMetricGoalObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the configuration of which variation to use as the "control"
     * version.
     *
     * The "control" version is used for comparison with other variations. This structure also
     * specifies how much experiment traffic is allocated to each variation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * OnlineAbConfigObjectProperty onlineAbConfigObjectProperty =
     * OnlineAbConfigObjectProperty.builder()
     * .controlTreatmentName("controlTreatmentName")
     * .treatmentWeights(List.of(TreatmentToWeightProperty.builder()
     * .splitWeight(123)
     * .treatment("treatment")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-onlineabconfigobject.html)
     */
    public inline fun cfnExperimentOnlineAbConfigObjectProperty(
        block: CfnExperimentOnlineAbConfigObjectPropertyDsl.() -> Unit = {}
    ): CfnExperiment.OnlineAbConfigObjectProperty {
        val builder = CfnExperimentOnlineAbConfigObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnExperiment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnExperimentProps cfnExperimentProps = CfnExperimentProps.builder()
     * .metricGoals(List.of(MetricGoalObjectProperty.builder()
     * .desiredChange("desiredChange")
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build()))
     * .name("name")
     * .onlineAbConfig(OnlineAbConfigObjectProperty.builder()
     * .controlTreatmentName("controlTreatmentName")
     * .treatmentWeights(List.of(TreatmentToWeightProperty.builder()
     * .splitWeight(123)
     * .treatment("treatment")
     * .build()))
     * .build())
     * .project("project")
     * .treatments(List.of(TreatmentObjectProperty.builder()
     * .feature("feature")
     * .treatmentName("treatmentName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .randomizationSalt("randomizationSalt")
     * .removeSegment(false)
     * .runningStatus(RunningStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .analysisCompleteTime("analysisCompleteTime")
     * .desiredState("desiredState")
     * .reason("reason")
     * .build())
     * .samplingRate(123)
     * .segment("segment")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-experiment.html)
     */
    public inline fun cfnExperimentProps(
        block: CfnExperimentPropsDsl.() -> Unit = {}
    ): CfnExperimentProps {
        val builder = CfnExperimentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to start and stop the experiment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * RunningStatusObjectProperty runningStatusObjectProperty = RunningStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .analysisCompleteTime("analysisCompleteTime")
     * .desiredState("desiredState")
     * .reason("reason")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html)
     */
    public inline fun cfnExperimentRunningStatusObjectProperty(
        block: CfnExperimentRunningStatusObjectPropertyDsl.() -> Unit = {}
    ): CfnExperiment.RunningStatusObjectProperty {
        val builder = CfnExperimentRunningStatusObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines one treatment in an experiment.
     *
     * A treatment is a variation of the feature that you are including in the experiment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * TreatmentObjectProperty treatmentObjectProperty = TreatmentObjectProperty.builder()
     * .feature("feature")
     * .treatmentName("treatmentName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html)
     */
    public inline fun cfnExperimentTreatmentObjectProperty(
        block: CfnExperimentTreatmentObjectPropertyDsl.() -> Unit = {}
    ): CfnExperiment.TreatmentObjectProperty {
        val builder = CfnExperimentTreatmentObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines how much experiment traffic to allocate to one treatment used in the
     * experiment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * TreatmentToWeightProperty treatmentToWeightProperty = TreatmentToWeightProperty.builder()
     * .splitWeight(123)
     * .treatment("treatment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmenttoweight.html)
     */
    public inline fun cfnExperimentTreatmentToWeightProperty(
        block: CfnExperimentTreatmentToWeightPropertyDsl.() -> Unit = {}
    ): CfnExperiment.TreatmentToWeightProperty {
        val builder = CfnExperimentTreatmentToWeightPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates an Evidently *feature* that you want to launch or test.
     *
     * You can define up to five variations of a feature, and use these variations in your launches
     * and experiments. A feature must be created in a project. For information about creating a
     * project, see
     * [CreateProject](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnFeature cfnFeature = CfnFeature.Builder.create(this, "MyCfnFeature")
     * .name("name")
     * .project("project")
     * .variations(List.of(VariationObjectProperty.builder()
     * .variationName("variationName")
     * // the properties below are optional
     * .booleanValue(false)
     * .doubleValue(123)
     * .longValue(123)
     * .stringValue("stringValue")
     * .build()))
     * // the properties below are optional
     * .defaultVariation("defaultVariation")
     * .description("description")
     * .entityOverrides(List.of(EntityOverrideProperty.builder()
     * .entityId("entityId")
     * .variation("variation")
     * .build()))
     * .evaluationStrategy("evaluationStrategy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html)
     */
    public inline fun cfnFeature(
        scope: Construct,
        id: String,
        block: CfnFeatureDsl.() -> Unit = {},
    ): CfnFeature {
        val builder = CfnFeatureDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A set of key-value pairs that specify users who should always be served a specific variation
     * of a feature.
     *
     * Each key specifies a user using their user ID, account ID, or some other identifier. The
     * value specifies the name of the variation that the user is to be served.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * EntityOverrideProperty entityOverrideProperty = EntityOverrideProperty.builder()
     * .entityId("entityId")
     * .variation("variation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html)
     */
    public inline fun cfnFeatureEntityOverrideProperty(
        block: CfnFeatureEntityOverridePropertyDsl.() -> Unit = {}
    ): CfnFeature.EntityOverrideProperty {
        val builder = CfnFeatureEntityOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFeature`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnFeatureProps cfnFeatureProps = CfnFeatureProps.builder()
     * .name("name")
     * .project("project")
     * .variations(List.of(VariationObjectProperty.builder()
     * .variationName("variationName")
     * // the properties below are optional
     * .booleanValue(false)
     * .doubleValue(123)
     * .longValue(123)
     * .stringValue("stringValue")
     * .build()))
     * // the properties below are optional
     * .defaultVariation("defaultVariation")
     * .description("description")
     * .entityOverrides(List.of(EntityOverrideProperty.builder()
     * .entityId("entityId")
     * .variation("variation")
     * .build()))
     * .evaluationStrategy("evaluationStrategy")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-feature.html)
     */
    public inline fun cfnFeatureProps(block: CfnFeaturePropsDsl.() -> Unit = {}): CfnFeatureProps {
        val builder = CfnFeaturePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains the name and variation value of one variation of a feature.
     *
     * It can contain only one of the following parameters: `BooleanValue` , `DoubleValue` ,
     * `LongValue` or `StringValue` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * VariationObjectProperty variationObjectProperty = VariationObjectProperty.builder()
     * .variationName("variationName")
     * // the properties below are optional
     * .booleanValue(false)
     * .doubleValue(123)
     * .longValue(123)
     * .stringValue("stringValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-variationobject.html)
     */
    public inline fun cfnFeatureVariationObjectProperty(
        block: CfnFeatureVariationObjectPropertyDsl.() -> Unit = {}
    ): CfnFeature.VariationObjectProperty {
        val builder = CfnFeatureVariationObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a *launch* of a given feature.
     *
     * Before you create a launch, you must create the feature to use for the launch.
     *
     * You can use a launch to safely validate new features by serving them to a specified
     * percentage of your users while you roll out the feature. You can monitor the performance of
     * the new feature to help you decide when to ramp up traffic to more users. This helps you
     * reduce risk and identify unintended consequences before you fully launch the feature.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnLaunch cfnLaunch = CfnLaunch.Builder.create(this, "MyCfnLaunch")
     * .groups(List.of(LaunchGroupObjectProperty.builder()
     * .feature("feature")
     * .groupName("groupName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .name("name")
     * .project("project")
     * .scheduledSplitsConfig(List.of(StepConfigProperty.builder()
     * .groupWeights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .startTime("startTime")
     * // the properties below are optional
     * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
     * .evaluationOrder(123)
     * .segment("segment")
     * .weights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .build()))
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .executionStatus(ExecutionStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .desiredState("desiredState")
     * .reason("reason")
     * .build())
     * .metricMonitors(List.of(MetricDefinitionObjectProperty.builder()
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build()))
     * .randomizationSalt("randomizationSalt")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html)
     */
    public inline fun cfnLaunch(
        scope: Construct,
        id: String,
        block: CfnLaunchDsl.() -> Unit = {},
    ): CfnLaunch {
        val builder = CfnLaunchDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to start and stop the launch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * ExecutionStatusObjectProperty executionStatusObjectProperty =
     * ExecutionStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .desiredState("desiredState")
     * .reason("reason")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html)
     */
    public inline fun cfnLaunchExecutionStatusObjectProperty(
        block: CfnLaunchExecutionStatusObjectPropertyDsl.() -> Unit = {}
    ): CfnLaunch.ExecutionStatusObjectProperty {
        val builder = CfnLaunchExecutionStatusObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing the percentage of launch traffic to allocate to one launch group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * GroupToWeightProperty groupToWeightProperty = GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html)
     */
    public inline fun cfnLaunchGroupToWeightProperty(
        block: CfnLaunchGroupToWeightPropertyDsl.() -> Unit = {}
    ): CfnLaunch.GroupToWeightProperty {
        val builder = CfnLaunchGroupToWeightPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines one launch group in a launch.
     *
     * A launch group is a variation of the feature that you are including in the launch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * LaunchGroupObjectProperty launchGroupObjectProperty = LaunchGroupObjectProperty.builder()
     * .feature("feature")
     * .groupName("groupName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-launchgroupobject.html)
     */
    public inline fun cfnLaunchLaunchGroupObjectProperty(
        block: CfnLaunchLaunchGroupObjectPropertyDsl.() -> Unit = {}
    ): CfnLaunch.LaunchGroupObjectProperty {
        val builder = CfnLaunchLaunchGroupObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines a metric that you want to use to evaluate the variations during a
     * launch or experiment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * MetricDefinitionObjectProperty metricDefinitionObjectProperty =
     * MetricDefinitionObjectProperty.builder()
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-metricdefinitionobject.html)
     */
    public inline fun cfnLaunchMetricDefinitionObjectProperty(
        block: CfnLaunchMetricDefinitionObjectPropertyDsl.() -> Unit = {}
    ): CfnLaunch.MetricDefinitionObjectProperty {
        val builder = CfnLaunchMetricDefinitionObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunch`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnLaunchProps cfnLaunchProps = CfnLaunchProps.builder()
     * .groups(List.of(LaunchGroupObjectProperty.builder()
     * .feature("feature")
     * .groupName("groupName")
     * .variation("variation")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * .name("name")
     * .project("project")
     * .scheduledSplitsConfig(List.of(StepConfigProperty.builder()
     * .groupWeights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .startTime("startTime")
     * // the properties below are optional
     * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
     * .evaluationOrder(123)
     * .segment("segment")
     * .weights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .build()))
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .executionStatus(ExecutionStatusObjectProperty.builder()
     * .status("status")
     * // the properties below are optional
     * .desiredState("desiredState")
     * .reason("reason")
     * .build())
     * .metricMonitors(List.of(MetricDefinitionObjectProperty.builder()
     * .entityIdKey("entityIdKey")
     * .metricName("metricName")
     * .valueKey("valueKey")
     * // the properties below are optional
     * .eventPattern("eventPattern")
     * .unitLabel("unitLabel")
     * .build()))
     * .randomizationSalt("randomizationSalt")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-launch.html)
     */
    public inline fun cfnLaunchProps(block: CfnLaunchPropsDsl.() -> Unit = {}): CfnLaunchProps {
        val builder = CfnLaunchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to specify different traffic splits for one or more audience *segments* .
     *
     * A segment is a portion of your audience that share one or more characteristics. Examples
     * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
     * fit other criteria that your application collects, such as age.
     *
     * For more information, see
     * [Use segments to focus your audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
     * .
     *
     * This sructure is an array of up to six segment override objects. Each of these objects
     * specifies a segment that you have already created, and defines the traffic split for that
     * segment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * SegmentOverrideProperty segmentOverrideProperty = SegmentOverrideProperty.builder()
     * .evaluationOrder(123)
     * .segment("segment")
     * .weights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-segmentoverride.html)
     */
    public inline fun cfnLaunchSegmentOverrideProperty(
        block: CfnLaunchSegmentOverridePropertyDsl.() -> Unit = {}
    ): CfnLaunch.SegmentOverrideProperty {
        val builder = CfnLaunchSegmentOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines when each step of the launch is to start, and how much launch
     * traffic is to be allocated to each variation during each step.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * StepConfigProperty stepConfigProperty = StepConfigProperty.builder()
     * .groupWeights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .startTime("startTime")
     * // the properties below are optional
     * .segmentOverrides(List.of(SegmentOverrideProperty.builder()
     * .evaluationOrder(123)
     * .segment("segment")
     * .weights(List.of(GroupToWeightProperty.builder()
     * .groupName("groupName")
     * .splitWeight(123)
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-stepconfig.html)
     */
    public inline fun cfnLaunchStepConfigProperty(
        block: CfnLaunchStepConfigPropertyDsl.() -> Unit = {}
    ): CfnLaunch.StepConfigProperty {
        val builder = CfnLaunchStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a project, which is the logical object in Evidently that can contain features,
     * launches, and experiments.
     *
     * Use projects to group similar features together.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .name("name")
     * // the properties below are optional
     * .appConfigResource(AppConfigResourceObjectProperty.builder()
     * .applicationId("applicationId")
     * .environmentId("environmentId")
     * .build())
     * .dataDelivery(DataDeliveryObjectProperty.builder()
     * .logGroup("logGroup")
     * .s3(S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .prefix("prefix")
     * .build())
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is a structure that defines the configuration of how your application integrates with
     * AWS AppConfig to run client-side evaluation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * AppConfigResourceObjectProperty appConfigResourceObjectProperty =
     * AppConfigResourceObjectProperty.builder()
     * .applicationId("applicationId")
     * .environmentId("environmentId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html)
     */
    public inline fun cfnProjectAppConfigResourceObjectProperty(
        block: CfnProjectAppConfigResourceObjectPropertyDsl.() -> Unit = {}
    ): CfnProject.AppConfigResourceObjectProperty {
        val builder = CfnProjectAppConfigResourceObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains information about where Evidently is to store evaluation events for
     * longer term storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * DataDeliveryObjectProperty dataDeliveryObjectProperty = DataDeliveryObjectProperty.builder()
     * .logGroup("logGroup")
     * .s3(S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .prefix("prefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html)
     */
    public inline fun cfnProjectDataDeliveryObjectProperty(
        block: CfnProjectDataDeliveryObjectPropertyDsl.() -> Unit = {}
    ): CfnProject.DataDeliveryObjectProperty {
        val builder = CfnProjectDataDeliveryObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .name("name")
     * // the properties below are optional
     * .appConfigResource(AppConfigResourceObjectProperty.builder()
     * .applicationId("applicationId")
     * .environmentId("environmentId")
     * .build())
     * .dataDelivery(DataDeliveryObjectProperty.builder()
     * .logGroup("logGroup")
     * .s3(S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .prefix("prefix")
     * .build())
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the
     * bucket name and bucket prefix.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html)
     */
    public inline fun cfnProjectS3DestinationProperty(
        block: CfnProjectS3DestinationPropertyDsl.() -> Unit = {}
    ): CfnProject.S3DestinationProperty {
        val builder = CfnProjectS3DestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a *segment* of your audience.
     *
     * A segment is a portion of your audience that share one or more characteristics. Examples
     * could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also
     * fit other criteria that your application collects, such as age.
     *
     * Using a segment in an experiment limits that experiment to evaluate only the users who match
     * the segment criteria. Using one or more segments in a launch allow you to define different
     * traffic splits for the different audience segments.
     *
     * For more information about segment pattern syntax, see
     * [Segment rule pattern syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax)
     * .
     *
     * The pattern that you define for a segment is matched against the value of `evaluationContext`
     * , which is passed into Evidently in the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation, when Evidently assigns a feature variation to a user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnSegment cfnSegment = CfnSegment.Builder.create(this, "MyCfnSegment")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .pattern("pattern")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html)
     */
    public inline fun cfnSegment(
        scope: Construct,
        id: String,
        block: CfnSegmentDsl.() -> Unit = {},
    ): CfnSegment {
        val builder = CfnSegmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSegment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.evidently.*;
     * CfnSegmentProps cfnSegmentProps = CfnSegmentProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .pattern("pattern")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html)
     */
    public inline fun cfnSegmentProps(block: CfnSegmentPropsDsl.() -> Unit = {}): CfnSegmentProps {
        val builder = CfnSegmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
