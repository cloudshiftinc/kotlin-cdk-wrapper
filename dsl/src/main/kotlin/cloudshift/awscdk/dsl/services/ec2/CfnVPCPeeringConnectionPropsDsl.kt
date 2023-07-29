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
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps

/**
 * Properties for defining a `CfnVPCPeeringConnection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCPeeringConnectionProps cfnVPCPeeringConnectionProps =
 * CfnVPCPeeringConnectionProps.builder()
 * .peerVpcId("peerVpcId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .peerOwnerId("peerOwnerId")
 * .peerRegion("peerRegion")
 * .peerRoleArn("peerRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
@CdkDslMarker
public class CfnVPCPeeringConnectionPropsDsl {
    private val cdkBuilder: CfnVPCPeeringConnectionProps.Builder =
        CfnVPCPeeringConnectionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param peerOwnerId The AWS account ID of the owner of the accepter VPC. Default: Your AWS
     *   account ID
     */
    public fun peerOwnerId(peerOwnerId: String) {
        cdkBuilder.peerOwnerId(peerOwnerId)
    }

    /**
     * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
     *   Region other than the Region in which you make the request. Default: The Region in which
     *   you make the request.
     */
    public fun peerRegion(peerRegion: String) {
        cdkBuilder.peerRegion(peerRegion)
    }

    /**
     * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
     *   connection in another AWS account. This is required when you are peering a VPC in a
     *   different AWS account.
     */
    public fun peerRoleArn(peerRoleArn: String) {
        cdkBuilder.peerRoleArn(peerRoleArn)
    }

    /**
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection.
     *   You must specify this parameter in the request.
     */
    public fun peerVpcId(peerVpcId: String) {
        cdkBuilder.peerVpcId(peerVpcId)
    }

    /** @param tags Any tags assigned to the resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Any tags assigned to the resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcId The ID of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCPeeringConnectionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
