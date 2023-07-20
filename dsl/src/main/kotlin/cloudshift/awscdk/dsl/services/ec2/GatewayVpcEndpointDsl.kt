@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GatewayVpcEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: GatewayVpcEndpoint.Builder = GatewayVpcEndpoint.Builder.create(scope, id)

    private val _subnets: MutableList<SubnetSelection> = mutableListOf()

    public fun service(service: IGatewayVpcEndpointService) {
        cdkBuilder.service(service)
    }

    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
        _subnets.add(SubnetSelectionDsl().apply(subnets).build())
    }

    public fun subnets(subnets: Collection<SubnetSelection>) {
        _subnets.addAll(subnets)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): GatewayVpcEndpoint {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
