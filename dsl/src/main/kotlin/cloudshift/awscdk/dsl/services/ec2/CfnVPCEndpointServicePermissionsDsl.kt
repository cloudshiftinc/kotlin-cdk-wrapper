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
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEndpointServicePermissionsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCEndpointServicePermissions.Builder =
        CfnVPCEndpointServicePermissions.Builder.create(scope, id)

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

    public fun build(): CfnVPCEndpointServicePermissions {
        if (_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
        return cdkBuilder.build()
    }
}
