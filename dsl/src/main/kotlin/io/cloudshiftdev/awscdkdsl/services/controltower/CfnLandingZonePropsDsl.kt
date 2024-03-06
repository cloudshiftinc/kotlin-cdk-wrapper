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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.controltower.CfnLandingZoneProps

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
@CdkDslMarker
public class CfnLandingZonePropsDsl {
    private val cdkBuilder: CfnLandingZoneProps.Builder = CfnLandingZoneProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     *   configurations.
     */
    public fun manifest(manifest: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(manifest)
        cdkBuilder.manifest(builder.map)
    }

    /**
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     *   configurations.
     */
    public fun manifest(manifest: Any) {
        cdkBuilder.manifest(manifest)
    }

    /** @param tags Tags to be applied to the landing zone. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags to be applied to the landing zone. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param version The landing zone's current deployed version. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnLandingZoneProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
