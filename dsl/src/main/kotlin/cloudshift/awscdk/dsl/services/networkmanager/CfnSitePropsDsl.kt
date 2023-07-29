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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnSite
import software.amazon.awscdk.services.networkmanager.CfnSiteProps

/**
 * Properties for defining a `CfnSite`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnSiteProps cfnSiteProps = CfnSiteProps.builder()
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .description("description")
 * .location(LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-site.html)
 */
@CdkDslMarker
public class CfnSitePropsDsl {
    private val cdkBuilder: CfnSiteProps.Builder = CfnSiteProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param description A description of your site. Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param location The site location. This information is used for visualization in the Network
     *   Manager console. If you specify the address, the latitude and longitude are automatically
     *   calculated.
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * @param location The site location. This information is used for visualization in the Network
     *   Manager console. If you specify the address, the latitude and longitude are automatically
     *   calculated.
     * * `Address` : The physical address of the site.
     * * `Latitude` : The latitude of the site.
     * * `Longitude` : The longitude of the site.
     */
    public fun location(location: CfnSite.LocationProperty) {
        cdkBuilder.location(location)
    }

    /** @param tags The tags for the site. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the site. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSiteProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
