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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnMultiplex
import software.constructs.Construct

/**
 * The multiplex object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CfnMultiplex cfnMultiplex = CfnMultiplex.Builder.create(this, "MyCfnMultiplex")
 * .availabilityZones(List.of("availabilityZones"))
 * .multiplexSettings(MultiplexSettingsProperty.builder()
 * .transportStreamBitrate(123)
 * .transportStreamId(123)
 * // the properties below are optional
 * .maximumVideoBufferDelayMilliseconds(123)
 * .transportStreamReservedBitrate(123)
 * .build())
 * .name("name")
 * // the properties below are optional
 * .destinations(List.of(MultiplexOutputDestinationProperty.builder()
 * .multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
 * .entitlementArn("entitlementArn")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html)
 */
@CdkDslMarker
public class CfnMultiplexDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMultiplex.Builder = CfnMultiplex.Builder.create(scope, id)

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     *
     * @param availabilityZones A list of availability zones for the multiplex.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     *
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     *
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     *
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     *
     * @param multiplexSettings Configuration for a multiplex event.
     */
    public fun multiplexSettings(multiplexSettings: IResolvable) {
        cdkBuilder.multiplexSettings(multiplexSettings)
    }

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     *
     * @param multiplexSettings Configuration for a multiplex event.
     */
    public fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty) {
        cdkBuilder.multiplexSettings(multiplexSettings)
    }

    /**
     * The name of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-name)
     *
     * @param name The name of the multiplex.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     *
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     *
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMultiplex {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
