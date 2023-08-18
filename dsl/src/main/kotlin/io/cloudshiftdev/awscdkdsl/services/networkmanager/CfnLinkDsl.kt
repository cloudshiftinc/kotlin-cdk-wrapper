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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.constructs.Construct

/**
 * Specifies a link for a site.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
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
public class CfnLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLink.Builder = CfnLink.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     *
     * @param bandwidth The bandwidth for the link.
     */
    public fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /**
     * The bandwidth for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-bandwidth)
     *
     * @param bandwidth The bandwidth for the link.
     */
    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth)
    }

    /**
     * A description of the link.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-description)
     *
     * @param description A description of the link.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-globalnetworkid)
     *
     * @param globalNetworkId The ID of the global network.
     */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The provider of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-provider)
     *
     * @param provider The provider of the link.
     */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    /**
     * The ID of the site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-siteid)
     *
     * @param siteId The ID of the site.
     */
    public fun siteId(siteId: String) {
        cdkBuilder.siteId(siteId)
    }

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     *
     * @param tags The tags for the link.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-tags)
     *
     * @param tags The tags for the link.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of the link.
     *
     * Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-link.html#cfn-networkmanager-link-type)
     *
     * @param type The type of the link.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLink {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
