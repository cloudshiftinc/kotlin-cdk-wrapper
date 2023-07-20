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

package cloudshift.awscdk.dsl.services.globalaccelerator

import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
import software.amazon.awscdk.services.globalaccelerator.EndpointGroup
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps
import software.amazon.awscdk.services.globalaccelerator.Listener
import software.amazon.awscdk.services.globalaccelerator.ListenerOptions
import software.amazon.awscdk.services.globalaccelerator.ListenerProps
import software.amazon.awscdk.services.globalaccelerator.PortOverride
import software.amazon.awscdk.services.globalaccelerator.PortRange
import software.amazon.awscdk.services.globalaccelerator.RawEndpoint
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object globalaccelerator {
    public inline fun accelerator(
        scope: Construct,
        id: String,
        block: AcceleratorDsl.() -> Unit = {},
    ): Accelerator {
        val builder = AcceleratorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun acceleratorAttributes(block: AcceleratorAttributesDsl.() -> Unit = {}): AcceleratorAttributes {
        val builder = AcceleratorAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun acceleratorProps(block: AcceleratorPropsDsl.() -> Unit = {}): AcceleratorProps {
        val builder = AcceleratorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccelerator(
        scope: Construct,
        id: String,
        block: CfnAcceleratorDsl.() -> Unit = {},
    ): CfnAccelerator {
        val builder = CfnAcceleratorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAcceleratorProps(block: CfnAcceleratorPropsDsl.() -> Unit = {}): CfnAcceleratorProps {
        val builder = CfnAcceleratorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointGroup(
        scope: Construct,
        id: String,
        block: CfnEndpointGroupDsl.() -> Unit = {},
    ): CfnEndpointGroup {
        val builder = CfnEndpointGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointGroupEndpointConfigurationProperty(
        block: CfnEndpointGroupEndpointConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnEndpointGroup.EndpointConfigurationProperty {
        val builder = CfnEndpointGroupEndpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointGroupPortOverrideProperty(
        block: CfnEndpointGroupPortOverridePropertyDsl.() -> Unit =
            {},
    ): CfnEndpointGroup.PortOverrideProperty {
        val builder = CfnEndpointGroupPortOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointGroupProps(block: CfnEndpointGroupPropsDsl.() -> Unit = {}): CfnEndpointGroupProps {
        val builder = CfnEndpointGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnListener(
        scope: Construct,
        id: String,
        block: CfnListenerDsl.() -> Unit = {},
    ): CfnListener {
        val builder = CfnListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnListenerPortRangeProperty(
        block: CfnListenerPortRangePropertyDsl.() -> Unit =
            {},
    ): CfnListener.PortRangeProperty {
        val builder = CfnListenerPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnListenerProps(block: CfnListenerPropsDsl.() -> Unit = {}): CfnListenerProps {
        val builder = CfnListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun endpointGroup(
        scope: Construct,
        id: String,
        block: EndpointGroupDsl.() -> Unit = {},
    ): EndpointGroup {
        val builder = EndpointGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun endpointGroupOptions(block: EndpointGroupOptionsDsl.() -> Unit = {}): EndpointGroupOptions {
        val builder = EndpointGroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun endpointGroupProps(block: EndpointGroupPropsDsl.() -> Unit = {}): EndpointGroupProps {
        val builder = EndpointGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun listener(
        scope: Construct,
        id: String,
        block: ListenerDsl.() -> Unit = {},
    ): Listener {
        val builder = ListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun listenerOptions(block: ListenerOptionsDsl.() -> Unit = {}): ListenerOptions {
        val builder = ListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun listenerProps(block: ListenerPropsDsl.() -> Unit = {}): ListenerProps {
        val builder = ListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun portOverride(block: PortOverrideDsl.() -> Unit = {}): PortOverride {
        val builder = PortOverrideDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun portRange(block: PortRangeDsl.() -> Unit = {}): PortRange {
        val builder = PortRangeDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rawEndpoint(block: RawEndpointDsl.() -> Unit = {}): RawEndpoint {
        val builder = RawEndpointDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rawEndpointProps(block: RawEndpointPropsDsl.() -> Unit = {}): RawEndpointProps {
        val builder = RawEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
