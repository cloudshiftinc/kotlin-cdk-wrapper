@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.evidently

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
import kotlin.String
import kotlin.Unit

public object evidently {
    public inline fun cfnExperiment(
        scope: Construct,
        id: String,
        block: CfnExperimentDsl.() -> Unit = {},
    ): CfnExperiment {
        val builder = CfnExperimentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentMetricGoalObjectProperty(
        block: CfnExperimentMetricGoalObjectPropertyDsl.() -> Unit =
            {},
    ): CfnExperiment.MetricGoalObjectProperty {
        val builder = CfnExperimentMetricGoalObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentOnlineAbConfigObjectProperty(
        block: CfnExperimentOnlineAbConfigObjectPropertyDsl.() -> Unit =
            {},
    ): CfnExperiment.OnlineAbConfigObjectProperty {
        val builder = CfnExperimentOnlineAbConfigObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentProps(block: CfnExperimentPropsDsl.() -> Unit = {}): CfnExperimentProps {
        val builder = CfnExperimentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentRunningStatusObjectProperty(
        block: CfnExperimentRunningStatusObjectPropertyDsl.() -> Unit =
            {},
    ): CfnExperiment.RunningStatusObjectProperty {
        val builder = CfnExperimentRunningStatusObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTreatmentObjectProperty(
        block: CfnExperimentTreatmentObjectPropertyDsl.() -> Unit =
            {},
    ): CfnExperiment.TreatmentObjectProperty {
        val builder = CfnExperimentTreatmentObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTreatmentToWeightProperty(
        block: CfnExperimentTreatmentToWeightPropertyDsl.() -> Unit =
            {},
    ): CfnExperiment.TreatmentToWeightProperty {
        val builder = CfnExperimentTreatmentToWeightPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFeature(
        scope: Construct,
        id: String,
        block: CfnFeatureDsl.() -> Unit = {},
    ): CfnFeature {
        val builder = CfnFeatureDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFeatureEntityOverrideProperty(
        block: CfnFeatureEntityOverridePropertyDsl.() -> Unit =
            {},
    ): CfnFeature.EntityOverrideProperty {
        val builder = CfnFeatureEntityOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFeatureProps(block: CfnFeaturePropsDsl.() -> Unit = {}): CfnFeatureProps {
        val builder = CfnFeaturePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFeatureVariationObjectProperty(
        block: CfnFeatureVariationObjectPropertyDsl.() -> Unit =
            {},
    ): CfnFeature.VariationObjectProperty {
        val builder = CfnFeatureVariationObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunch(
        scope: Construct,
        id: String,
        block: CfnLaunchDsl.() -> Unit = {},
    ): CfnLaunch {
        val builder = CfnLaunchDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchExecutionStatusObjectProperty(
        block: CfnLaunchExecutionStatusObjectPropertyDsl.() -> Unit =
            {},
    ): CfnLaunch.ExecutionStatusObjectProperty {
        val builder = CfnLaunchExecutionStatusObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchGroupToWeightProperty(
        block: CfnLaunchGroupToWeightPropertyDsl.() -> Unit = {
        },
    ): CfnLaunch.GroupToWeightProperty {
        val builder = CfnLaunchGroupToWeightPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchLaunchGroupObjectProperty(
        block: CfnLaunchLaunchGroupObjectPropertyDsl.() -> Unit =
            {},
    ): CfnLaunch.LaunchGroupObjectProperty {
        val builder = CfnLaunchLaunchGroupObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchMetricDefinitionObjectProperty(
        block: CfnLaunchMetricDefinitionObjectPropertyDsl.() -> Unit =
            {},
    ): CfnLaunch.MetricDefinitionObjectProperty {
        val builder = CfnLaunchMetricDefinitionObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchProps(block: CfnLaunchPropsDsl.() -> Unit = {}): CfnLaunchProps {
        val builder = CfnLaunchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchSegmentOverrideProperty(
        block: CfnLaunchSegmentOverridePropertyDsl.() -> Unit =
            {},
    ): CfnLaunch.SegmentOverrideProperty {
        val builder = CfnLaunchSegmentOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchStepConfigProperty(
        block: CfnLaunchStepConfigPropertyDsl.() -> Unit =
            {},
    ): CfnLaunch.StepConfigProperty {
        val builder = CfnLaunchStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectAppConfigResourceObjectProperty(
        block: CfnProjectAppConfigResourceObjectPropertyDsl.() -> Unit =
            {},
    ): CfnProject.AppConfigResourceObjectProperty {
        val builder = CfnProjectAppConfigResourceObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectDataDeliveryObjectProperty(
        block: CfnProjectDataDeliveryObjectPropertyDsl.() -> Unit =
            {},
    ): CfnProject.DataDeliveryObjectProperty {
        val builder = CfnProjectDataDeliveryObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectS3DestinationProperty(
        block: CfnProjectS3DestinationPropertyDsl.() -> Unit =
            {},
    ): CfnProject.S3DestinationProperty {
        val builder = CfnProjectS3DestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSegment(
        scope: Construct,
        id: String,
        block: CfnSegmentDsl.() -> Unit = {},
    ): CfnSegment {
        val builder = CfnSegmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSegmentProps(block: CfnSegmentPropsDsl.() -> Unit = {}): CfnSegmentProps {
        val builder = CfnSegmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
