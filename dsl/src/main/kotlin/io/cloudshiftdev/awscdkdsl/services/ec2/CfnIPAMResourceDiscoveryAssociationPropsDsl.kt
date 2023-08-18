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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps

/**
 * Properties for defining a `CfnIPAMResourceDiscoveryAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscoveryAssociationProps cfnIPAMResourceDiscoveryAssociationProps =
 * CfnIPAMResourceDiscoveryAssociationProps.builder()
 * .ipamId("ipamId")
 * .ipamResourceDiscoveryId("ipamResourceDiscoveryId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html)
 */
@CdkDslMarker
public class CfnIPAMResourceDiscoveryAssociationPropsDsl {
    private val cdkBuilder: CfnIPAMResourceDiscoveryAssociationProps.Builder =
        CfnIPAMResourceDiscoveryAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param ipamId The IPAM ID. */
    public fun ipamId(ipamId: String) {
        cdkBuilder.ipamId(ipamId)
    }

    /** @param ipamResourceDiscoveryId The resource discovery ID. */
    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
        cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
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

    public fun build(): CfnIPAMResourceDiscoveryAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
