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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterResourcesVpcConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.ResourcesVpcConfigProperty.Builder =
        CfnCluster.ResourcesVpcConfigProperty.builder()

    private val _publicAccessCidrs: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    public fun endpointPrivateAccess(endpointPrivateAccess: Boolean) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
    }

    public fun endpointPrivateAccess(endpointPrivateAccess: IResolvable) {
        cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
    }

    public fun endpointPublicAccess(endpointPublicAccess: Boolean) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess)
    }

    public fun endpointPublicAccess(endpointPublicAccess: IResolvable) {
        cdkBuilder.endpointPublicAccess(endpointPublicAccess)
    }

    public fun publicAccessCidrs(vararg publicAccessCidrs: String) {
        _publicAccessCidrs.addAll(listOf(*publicAccessCidrs))
    }

    public fun publicAccessCidrs(publicAccessCidrs: Collection<String>) {
        _publicAccessCidrs.addAll(publicAccessCidrs)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnCluster.ResourcesVpcConfigProperty {
        if (_publicAccessCidrs.isNotEmpty()) cdkBuilder.publicAccessCidrs(_publicAccessCidrs)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
