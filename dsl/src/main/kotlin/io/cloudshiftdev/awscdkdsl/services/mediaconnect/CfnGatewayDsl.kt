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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnGateway
import software.constructs.Construct

/**
 * The AWS::MediaConnect::Gateway resource is used to create a new gateway.
 *
 * AWS Elemental MediaConnect Gateway is a feature of MediaConnect that allows the deployment of
 * on-premises resources for transporting live video to and from the AWS Cloud. MediaConnect Gateway
 * allows you to contribute live video to the AWS Cloud from on-premises hardware, as well as
 * distribute live video from the AWS Cloud to your local data center.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnGateway cfnGateway = CfnGateway.Builder.create(this, "MyCfnGateway")
 * .egressCidrBlocks(List.of("egressCidrBlocks"))
 * .name("name")
 * .networks(List.of(GatewayNetworkProperty.builder()
 * .cidrBlock("cidrBlock")
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html)
 */
@CdkDslMarker
public class CfnGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGateway.Builder = CfnGateway.Builder.create(scope, id)

    private val _egressCidrBlocks: MutableList<String> = mutableListOf()

    private val _networks: MutableList<Any> = mutableListOf()

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     *
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     *   initiate output requests for flows communicating with this gateway.
     */
    public fun egressCidrBlocks(vararg egressCidrBlocks: String) {
        _egressCidrBlocks.addAll(listOf(*egressCidrBlocks))
    }

    /**
     * The range of IP addresses that are allowed to contribute content or initiate output requests
     * for flows communicating with this gateway.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-egresscidrblocks)
     *
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     *   initiate output requests for flows communicating with this gateway.
     */
    public fun egressCidrBlocks(egressCidrBlocks: Collection<String>) {
        _egressCidrBlocks.addAll(egressCidrBlocks)
    }

    /**
     * The name of the network.
     *
     * This name is used to reference the network and must be unique among networks in this gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-name)
     *
     * @param name The name of the network.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     *
     * @param networks The list of networks that you want to add.
     */
    public fun networks(vararg networks: Any) {
        _networks.addAll(listOf(*networks))
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     *
     * @param networks The list of networks that you want to add.
     */
    public fun networks(networks: Collection<Any>) {
        _networks.addAll(networks)
    }

    /**
     * The list of networks that you want to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-gateway.html#cfn-mediaconnect-gateway-networks)
     *
     * @param networks The list of networks that you want to add.
     */
    public fun networks(networks: IResolvable) {
        cdkBuilder.networks(networks)
    }

    public fun build(): CfnGateway {
        if (_egressCidrBlocks.isNotEmpty()) cdkBuilder.egressCidrBlocks(_egressCidrBlocks)
        if (_networks.isNotEmpty()) cdkBuilder.networks(_networks)
        return cdkBuilder.build()
    }
}
