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

package cloudshift.awscdk.dsl.services.fis

import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object fis {
    public inline fun cfnExperimentTemplate(
        scope: Construct,
        id: String,
        block: CfnExperimentTemplateDsl.() -> Unit = {},
    ): CfnExperimentTemplate {
        val builder = CfnExperimentTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateCloudWatchLogsConfigurationProperty(
        block: CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.CloudWatchLogsConfigurationProperty {
        val builder = CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateExperimentTemplateActionProperty(
        block: CfnExperimentTemplateExperimentTemplateActionPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.ExperimentTemplateActionProperty {
        val builder = CfnExperimentTemplateExperimentTemplateActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateExperimentTemplateLogConfigurationProperty(
        block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty {
        val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateExperimentTemplateStopConditionProperty(
        block: CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.ExperimentTemplateStopConditionProperty {
        val builder = CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateExperimentTemplateTargetFilterProperty(
        block: CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.ExperimentTemplateTargetFilterProperty {
        val builder = CfnExperimentTemplateExperimentTemplateTargetFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateExperimentTemplateTargetProperty(
        block: CfnExperimentTemplateExperimentTemplateTargetPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.ExperimentTemplateTargetProperty {
        val builder = CfnExperimentTemplateExperimentTemplateTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateProps(
        block: CfnExperimentTemplatePropsDsl.() -> Unit =
            {},
    ): CfnExperimentTemplateProps {
        val builder = CfnExperimentTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnExperimentTemplateS3ConfigurationProperty(
        block: CfnExperimentTemplateS3ConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnExperimentTemplate.S3ConfigurationProperty {
        val builder = CfnExperimentTemplateS3ConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
