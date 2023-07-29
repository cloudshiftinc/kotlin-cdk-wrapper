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
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkProps

/**
 * Properties for defining a `CfnLink`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnLinkProps cfnLinkProps = CfnLinkProps.builder()
 * .bandwidth(BandwidthProperty.builder()
 * .downloadSpeed(123)
 * .uploadSpeed(123)
 * .build())
 * .globalNetworkId("globalNetworkId")
 * .siteId("siteId")
 * // the properties below are optional
 * .description("description")
 * .provider("provider")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html)
 */
@CdkDslMarker
public class CfnLinkPropsDsl {
    private val cdkBuilder: CfnLinkProps.Builder = CfnLinkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param bandwidth The bandwidth for the link. */
    public fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /** @param bandwidth The bandwidth for the link. */
    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /**
     * @param description A description of the link. Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param provider The provider of the link. Constraints: Maximum length of 128 characters.
     *   Cannot include the following characters: | \ ^
     */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    /** @param siteId The ID of the site. */
    public fun siteId(siteId: String) {
        cdkBuilder.siteId(siteId)
    }

    /** @param tags The tags for the link. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the link. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of the link. Constraints: Maximum length of 128 characters. Cannot
     *   include the following characters: | \ ^
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLinkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
