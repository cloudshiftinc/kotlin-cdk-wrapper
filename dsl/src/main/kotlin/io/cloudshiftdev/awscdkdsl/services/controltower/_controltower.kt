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

package io.cloudshiftdev.awscdkdsl.services.controltower

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledBaseline
import software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps
import software.amazon.awscdk.services.controltower.CfnLandingZone
import software.amazon.awscdk.services.controltower.CfnLandingZoneProps
import software.constructs.Construct

public object controltower {
    /**
     * This resource represents a `Baseline` that has been applied to a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * CfnEnabledBaseline cfnEnabledBaseline = CfnEnabledBaseline.Builder.create(this,
     * "MyCfnEnabledBaseline")
     * .baselineIdentifier("baselineIdentifier")
     * .baselineVersion("baselineVersion")
     * .targetIdentifier("targetIdentifier")
     * // the properties below are optional
     * .parameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html)
     */
    public inline fun cfnEnabledBaseline(
        scope: Construct,
        id: String,
        block: CfnEnabledBaselineDsl.() -> Unit = {},
    ): CfnEnabledBaseline {
        val builder = CfnEnabledBaselineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value parameter to an `EnabledBaseline` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * ParameterProperty parameterProperty = ParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html)
     */
    public inline fun cfnEnabledBaselineParameterProperty(
        block: CfnEnabledBaselineParameterPropertyDsl.() -> Unit = {}
    ): CfnEnabledBaseline.ParameterProperty {
        val builder = CfnEnabledBaselineParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnabledBaseline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * CfnEnabledBaselineProps cfnEnabledBaselineProps = CfnEnabledBaselineProps.builder()
     * .baselineIdentifier("baselineIdentifier")
     * .baselineVersion("baselineVersion")
     * .targetIdentifier("targetIdentifier")
     * // the properties below are optional
     * .parameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html)
     */
    public inline fun cfnEnabledBaselineProps(
        block: CfnEnabledBaselinePropsDsl.() -> Unit = {}
    ): CfnEnabledBaselineProps {
        val builder = CfnEnabledBaselinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The resource represents an enabled control.
     *
     * It specifies an asynchronous operation that creates AWS resources on the specified
     * organizational unit and the accounts it contains. The resources created will vary according
     * to the control that you specify.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * CfnEnabledControl cfnEnabledControl = CfnEnabledControl.Builder.create(this,
     * "MyCfnEnabledControl")
     * .controlIdentifier("controlIdentifier")
     * .targetIdentifier("targetIdentifier")
     * // the properties below are optional
     * .parameters(List.of(EnabledControlParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
     */
    public inline fun cfnEnabledControl(
        scope: Construct,
        id: String,
        block: CfnEnabledControlDsl.() -> Unit = {},
    ): CfnEnabledControl {
        val builder = CfnEnabledControlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A set of parameters that configure the behavior of the enabled control.
     *
     * Expressed as a key/value pair, where `Key` is of type `String` and `Value` is of type
     * `Document` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * EnabledControlParameterProperty enabledControlParameterProperty =
     * EnabledControlParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html)
     */
    public inline fun cfnEnabledControlEnabledControlParameterProperty(
        block: CfnEnabledControlEnabledControlParameterPropertyDsl.() -> Unit = {}
    ): CfnEnabledControl.EnabledControlParameterProperty {
        val builder = CfnEnabledControlEnabledControlParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnabledControl`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object value;
     * CfnEnabledControlProps cfnEnabledControlProps = CfnEnabledControlProps.builder()
     * .controlIdentifier("controlIdentifier")
     * .targetIdentifier("targetIdentifier")
     * // the properties below are optional
     * .parameters(List.of(EnabledControlParameterProperty.builder()
     * .key("key")
     * .value(value)
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
     */
    public inline fun cfnEnabledControlProps(
        block: CfnEnabledControlPropsDsl.() -> Unit = {}
    ): CfnEnabledControlProps {
        val builder = CfnEnabledControlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new landing zone.
     *
     * This API call starts an asynchronous operation that creates and configures a landing zone,
     * based on the parameters specified in the manifest JSON file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object manifest;
     * CfnLandingZone cfnLandingZone = CfnLandingZone.Builder.create(this, "MyCfnLandingZone")
     * .manifest(manifest)
     * .version("version")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html)
     */
    public inline fun cfnLandingZone(
        scope: Construct,
        id: String,
        block: CfnLandingZoneDsl.() -> Unit = {},
    ): CfnLandingZone {
        val builder = CfnLandingZoneDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLandingZone`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.controltower.*;
     * Object manifest;
     * CfnLandingZoneProps cfnLandingZoneProps = CfnLandingZoneProps.builder()
     * .manifest(manifest)
     * .version("version")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html)
     */
    public inline fun cfnLandingZoneProps(
        block: CfnLandingZonePropsDsl.() -> Unit = {}
    ): CfnLandingZoneProps {
        val builder = CfnLandingZonePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
