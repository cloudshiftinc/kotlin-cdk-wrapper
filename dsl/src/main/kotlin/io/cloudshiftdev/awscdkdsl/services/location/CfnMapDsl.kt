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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnMap
import software.constructs.Construct

/**
 * The `AWS::Location::Map` resource specifies a map resource in your AWS account, which provides
 * map tiles of different styles sourced from global location data providers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnMap cfnMap = CfnMap.Builder.create(this, "MyCfnMap")
 * .configuration(MapConfigurationProperty.builder()
 * .style("style")
 * // the properties below are optional
 * .customLayers(List.of("customLayers"))
 * .politicalView("politicalView")
 * .build())
 * .mapName("mapName")
 * // the properties below are optional
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html)
 */
@CdkDslMarker
public class CfnMapDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMap.Builder = CfnMap.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     *
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     *   resource that you create.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * Specifies the `MapConfiguration` , including the map style, for the map resource that you
     * create.
     *
     * The map style defines the look of maps and the data provider for your map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-configuration)
     *
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     *   resource that you create.
     */
    public fun configuration(configuration: CfnMap.MapConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * An optional description for the map resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-description)
     *
     * @param description An optional description for the map resource.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name for the map resource.
     *
     * Requirements:
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-mapname)
     *
     * @param mapName The name for the map resource.
     */
    public fun mapName(mapName: String) {
        cdkBuilder.mapName(mapName)
    }

    /**
     * No longer used. If included, the only allowed value is `RequestBasedUsage` .
     *
     * *Allowed Values* : `RequestBasedUsage`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-pricingplan)
     *
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     *   .
     */
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     *   /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     *
     * @param tags Applies one or more tags to the map resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Applies one or more tags to the map resource.
     *
     * A tag is a key-value pair helps manage, identify, search, and filter your resources by
     * labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     *   /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html#cfn-location-map-tags)
     *
     * @param tags Applies one or more tags to the map resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMap {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
