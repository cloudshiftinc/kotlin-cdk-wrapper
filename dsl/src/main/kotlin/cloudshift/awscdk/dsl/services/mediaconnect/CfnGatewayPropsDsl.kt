@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnGatewayProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnGatewayProps cfnGatewayProps = CfnGatewayProps.builder()
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
public class CfnGatewayPropsDsl {
    private val cdkBuilder: CfnGatewayProps.Builder = CfnGatewayProps.builder()

    private val _egressCidrBlocks: MutableList<String> = mutableListOf()

    private val _networks: MutableList<Any> = mutableListOf()

    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for
     * example, 10.0.0.0/16.
     */
    public fun egressCidrBlocks(vararg egressCidrBlocks: String) {
        _egressCidrBlocks.addAll(listOf(*egressCidrBlocks))
    }

    /**
     * @param egressCidrBlocks The range of IP addresses that are allowed to contribute content or
     * initiate output requests for flows communicating with this gateway.
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for
     * example, 10.0.0.0/16.
     */
    public fun egressCidrBlocks(egressCidrBlocks: Collection<String>) {
        _egressCidrBlocks.addAll(egressCidrBlocks)
    }

    /**
     * @param name The name of the gateway.
     * This name can not be modified after the gateway is created.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param networks The list of networks that you want to add.
     */
    public fun networks(vararg networks: Any) {
        _networks.addAll(listOf(*networks))
    }

    /**
     * @param networks The list of networks that you want to add.
     */
    public fun networks(networks: Collection<Any>) {
        _networks.addAll(networks)
    }

    /**
     * @param networks The list of networks that you want to add.
     */
    public fun networks(networks: IResolvable) {
        cdkBuilder.networks(networks)
    }

    public fun build(): CfnGatewayProps {
        if (_egressCidrBlocks.isNotEmpty()) cdkBuilder.egressCidrBlocks(_egressCidrBlocks)
        if (_networks.isNotEmpty()) cdkBuilder.networks(_networks)
        return cdkBuilder.build()
    }
}
