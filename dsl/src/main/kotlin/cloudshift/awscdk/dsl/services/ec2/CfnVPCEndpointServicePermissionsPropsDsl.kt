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
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEndpointServicePermissionsPropsDsl {
    private val cdkBuilder: CfnVPCEndpointServicePermissionsProps.Builder =
        CfnVPCEndpointServicePermissionsProps.builder()

    private val _allowedPrincipals: MutableList<String> = mutableListOf()

    public fun allowedPrincipals(vararg allowedPrincipals: String) {
        _allowedPrincipals.addAll(listOf(*allowedPrincipals))
    }

    public fun allowedPrincipals(allowedPrincipals: Collection<String>) {
        _allowedPrincipals.addAll(allowedPrincipals)
    }

    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    public fun build(): CfnVPCEndpointServicePermissionsProps {
        if (_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
        return cdkBuilder.build()
    }
}
