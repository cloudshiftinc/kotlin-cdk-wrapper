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

package cloudshift.awscdk.dsl.services.iot1click

import software.amazon.awscdk.services.iot1click.CfnDevice
import software.amazon.awscdk.services.iot1click.CfnDeviceProps
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.amazon.awscdk.services.iot1click.CfnPlacementProps
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object iot1click {
    public inline fun cfnDevice(
        scope: Construct,
        id: String,
        block: CfnDeviceDsl.() -> Unit = {},
    ): CfnDevice {
        val builder = CfnDeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
        val builder = CfnDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlacement(
        scope: Construct,
        id: String,
        block: CfnPlacementDsl.() -> Unit = {},
    ): CfnPlacement {
        val builder = CfnPlacementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlacementProps(block: CfnPlacementPropsDsl.() -> Unit = {}): CfnPlacementProps {
        val builder = CfnPlacementPropsDsl()
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

    public inline fun cfnProjectDeviceTemplateProperty(
        block: CfnProjectDeviceTemplatePropertyDsl.() -> Unit =
            {},
    ): CfnProject.DeviceTemplateProperty {
        val builder = CfnProjectDeviceTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectPlacementTemplateProperty(
        block: CfnProjectPlacementTemplatePropertyDsl.() -> Unit =
            {},
    ): CfnProject.PlacementTemplateProperty {
        val builder = CfnProjectPlacementTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
