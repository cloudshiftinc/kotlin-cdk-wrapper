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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
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
 * .build())
 * .mapName("mapName")
 * // the properties below are optional
 * .description("description")
 * .pricingPlan("pricingPlan")
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

    public fun build(): CfnMap = cdkBuilder.build()
}
