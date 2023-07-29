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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps

/**
 * Properties for defining a `CfnLocalGatewayRouteTable`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableProps cfnLocalGatewayRouteTableProps =
 * CfnLocalGatewayRouteTableProps.builder()
 * .localGatewayId("localGatewayId")
 * // the properties below are optional
 * .mode("mode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html)
 */
@CdkDslMarker
public class CfnLocalGatewayRouteTablePropsDsl {
    private val cdkBuilder: CfnLocalGatewayRouteTableProps.Builder =
        CfnLocalGatewayRouteTableProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param localGatewayId The ID of the local gateway. */
    public fun localGatewayId(localGatewayId: String) {
        cdkBuilder.localGatewayId(localGatewayId)
    }

    /** @param mode The mode of the local gateway route table. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /** @param tags The tags assigned to the local gateway route table. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags assigned to the local gateway route table. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocalGatewayRouteTableProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
