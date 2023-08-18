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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps

/**
 * Properties for defining a `CfnIPAMResourceDiscovery`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscoveryProps cfnIPAMResourceDiscoveryProps =
 * CfnIPAMResourceDiscoveryProps.builder()
 * .description("description")
 * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscovery.html)
 */
@CdkDslMarker
public class CfnIPAMResourceDiscoveryPropsDsl {
    private val cdkBuilder: CfnIPAMResourceDiscoveryProps.Builder =
        CfnIPAMResourceDiscoveryProps.builder()

    private val _operatingRegions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The resource discovery description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery. Operating Regions
     *   are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers
     *   and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(vararg operatingRegions: Any) {
        _operatingRegions.addAll(listOf(*operatingRegions))
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery. Operating Regions
     *   are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers
     *   and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(operatingRegions: Collection<Any>) {
        _operatingRegions.addAll(operatingRegions)
    }

    /**
     * @param operatingRegions The operating Regions for the resource discovery. Operating Regions
     *   are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers
     *   and monitors resources in the AWS Regions you select as operating Regions.
     */
    public fun operatingRegions(operatingRegions: IResolvable) {
        cdkBuilder.operatingRegions(operatingRegions)
    }

    /**
     * @param tags A tag is a label that you assign to an AWS resource. Each tag consists of a key
     *   and an optional value. You can use tags to search and filter your resources or track your
     *   AWS costs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A tag is a label that you assign to an AWS resource. Each tag consists of a key
     *   and an optional value. You can use tags to search and filter your resources or track your
     *   AWS costs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPAMResourceDiscoveryProps {
        if (_operatingRegions.isNotEmpty()) cdkBuilder.operatingRegions(_operatingRegions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
