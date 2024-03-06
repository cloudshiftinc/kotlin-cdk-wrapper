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
import software.amazon.awscdk.services.controltower.CfnLandingZone
import software.constructs.Construct

/**
 * Creates a new landing zone.
 *
 * This API call starts an asynchronous operation that creates and configures a landing zone, based
 * on the parameters specified in the manifest JSON file.
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
@CdkDslMarker
public class CfnLandingZoneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLandingZone.Builder = CfnLandingZone.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The landing zone `manifest.yaml` text file that specifies the landing zone configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
     *
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     *   configurations.
     */
    public fun manifest(manifest: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(manifest)
        cdkBuilder.manifest(builder.map)
    }

    /**
     * The landing zone `manifest.yaml` text file that specifies the landing zone configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
     *
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     *   configurations.
     */
    public fun manifest(manifest: Any) {
        cdkBuilder.manifest(manifest)
    }

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     *
     * @param tags Tags to be applied to the landing zone.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     *
     * @param tags Tags to be applied to the landing zone.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The landing zone's current deployed version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-version)
     *
     * @param version The landing zone's current deployed version.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnLandingZone {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
