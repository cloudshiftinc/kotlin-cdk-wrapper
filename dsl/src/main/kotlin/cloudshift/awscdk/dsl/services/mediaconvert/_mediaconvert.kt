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

package cloudshift.awscdk.dsl.services.mediaconvert

import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps
import software.amazon.awscdk.services.mediaconvert.CfnPreset
import software.amazon.awscdk.services.mediaconvert.CfnPresetProps
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.amazon.awscdk.services.mediaconvert.CfnQueueProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object mediaconvert {
    public inline fun cfnJobTemplate(
        scope: Construct,
        id: String,
        block: CfnJobTemplateDsl.() -> Unit = {},
    ): CfnJobTemplate {
        val builder = CfnJobTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateAccelerationSettingsProperty(
        block: CfnJobTemplateAccelerationSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.AccelerationSettingsProperty {
        val builder = CfnJobTemplateAccelerationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateHopDestinationProperty(
        block: CfnJobTemplateHopDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnJobTemplate.HopDestinationProperty {
        val builder = CfnJobTemplateHopDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnJobTemplateProps(block: CfnJobTemplatePropsDsl.() -> Unit = {}): CfnJobTemplateProps {
        val builder = CfnJobTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPreset(
        scope: Construct,
        id: String,
        block: CfnPresetDsl.() -> Unit = {},
    ): CfnPreset {
        val builder = CfnPresetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPresetProps(block: CfnPresetPropsDsl.() -> Unit = {}): CfnPresetProps {
        val builder = CfnPresetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQueue(
        scope: Construct,
        id: String,
        block: CfnQueueDsl.() -> Unit = {},
    ): CfnQueue {
        val builder = CfnQueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQueueProps(block: CfnQueuePropsDsl.() -> Unit = {}): CfnQueueProps {
        val builder = CfnQueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
