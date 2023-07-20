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

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkgroupEndpointPropertyDsl {
    private val cdkBuilder: CfnWorkgroup.EndpointProperty.Builder =
        CfnWorkgroup.EndpointProperty.builder()

    private val _vpcEndpoints: MutableList<Any> = mutableListOf()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun vpcEndpoints(vararg vpcEndpoints: Any) {
        _vpcEndpoints.addAll(listOf(*vpcEndpoints))
    }

    public fun vpcEndpoints(vpcEndpoints: Collection<Any>) {
        _vpcEndpoints.addAll(vpcEndpoints)
    }

    public fun vpcEndpoints(vpcEndpoints: IResolvable) {
        cdkBuilder.vpcEndpoints(vpcEndpoints)
    }

    public fun build(): CfnWorkgroup.EndpointProperty {
        if (_vpcEndpoints.isNotEmpty()) cdkBuilder.vpcEndpoints(_vpcEndpoints)
        return cdkBuilder.build()
    }
}
