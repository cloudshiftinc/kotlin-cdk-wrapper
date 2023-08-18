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
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps

/**
 * Properties for defining a `CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
 * cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps =
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.builder()
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html)
 */
@CdkDslMarker
public class CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationPropsDsl {
    private val cdkBuilder: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.Builder =
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param localGatewayRouteTableId The ID of the local gateway route table. */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
        cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /** @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
        cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /** @param tags The tags assigned to the association. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags assigned to the association. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
