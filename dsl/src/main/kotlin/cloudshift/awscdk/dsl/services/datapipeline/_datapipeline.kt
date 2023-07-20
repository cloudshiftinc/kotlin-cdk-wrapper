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

package cloudshift.awscdk.dsl.services.datapipeline

import software.amazon.awscdk.services.datapipeline.CfnPipeline
import software.amazon.awscdk.services.datapipeline.CfnPipelineProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object datapipeline {
    public inline fun cfnPipeline(
        scope: Construct,
        id: String,
        block: CfnPipelineDsl.() -> Unit = {},
    ): CfnPipeline {
        val builder = CfnPipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelineFieldProperty(block: CfnPipelineFieldPropertyDsl.() -> Unit = {}): CfnPipeline.FieldProperty {
        val builder = CfnPipelineFieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelineParameterAttributeProperty(
        block: CfnPipelineParameterAttributePropertyDsl.() -> Unit =
            {},
    ): CfnPipeline.ParameterAttributeProperty {
        val builder = CfnPipelineParameterAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelineParameterObjectProperty(
        block: CfnPipelineParameterObjectPropertyDsl.() -> Unit =
            {},
    ): CfnPipeline.ParameterObjectProperty {
        val builder = CfnPipelineParameterObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelineParameterValueProperty(
        block: CfnPipelineParameterValuePropertyDsl.() -> Unit =
            {},
    ): CfnPipeline.ParameterValueProperty {
        val builder = CfnPipelineParameterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelinePipelineObjectProperty(
        block: CfnPipelinePipelineObjectPropertyDsl.() -> Unit =
            {},
    ): CfnPipeline.PipelineObjectProperty {
        val builder = CfnPipelinePipelineObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelinePipelineTagProperty(
        block: CfnPipelinePipelineTagPropertyDsl.() -> Unit = {
        },
    ): CfnPipeline.PipelineTagProperty {
        val builder = CfnPipelinePipelineTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPipelineProps(block: CfnPipelinePropsDsl.() -> Unit = {}): CfnPipelineProps {
        val builder = CfnPipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
