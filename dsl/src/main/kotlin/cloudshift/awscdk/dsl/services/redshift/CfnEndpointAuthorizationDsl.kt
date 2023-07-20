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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointAuthorizationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpointAuthorization.Builder =
        CfnEndpointAuthorization.Builder.create(scope, id)

    private val _vpcIds: MutableList<String> = mutableListOf()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun force(force: Boolean) {
        cdkBuilder.force(force)
    }

    public fun force(force: IResolvable) {
        cdkBuilder.force(force)
    }

    public fun vpcIds(vararg vpcIds: String) {
        _vpcIds.addAll(listOf(*vpcIds))
    }

    public fun vpcIds(vpcIds: Collection<String>) {
        _vpcIds.addAll(vpcIds)
    }

    public fun build(): CfnEndpointAuthorization {
        if (_vpcIds.isNotEmpty()) cdkBuilder.vpcIds(_vpcIds)
        return cdkBuilder.build()
    }
}
