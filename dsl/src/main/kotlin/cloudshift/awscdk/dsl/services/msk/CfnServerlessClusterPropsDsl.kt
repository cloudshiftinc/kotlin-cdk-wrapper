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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServerlessClusterPropsDsl {
    private val cdkBuilder: CfnServerlessClusterProps.Builder = CfnServerlessClusterProps.builder()

    private val _vpcConfigs: MutableList<Any> = mutableListOf()

    public fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    public fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun vpcConfigs(vararg vpcConfigs: Any) {
        _vpcConfigs.addAll(listOf(*vpcConfigs))
    }

    public fun vpcConfigs(vpcConfigs: Collection<Any>) {
        _vpcConfigs.addAll(vpcConfigs)
    }

    public fun vpcConfigs(vpcConfigs: IResolvable) {
        cdkBuilder.vpcConfigs(vpcConfigs)
    }

    public fun build(): CfnServerlessClusterProps {
        if (_vpcConfigs.isNotEmpty()) cdkBuilder.vpcConfigs(_vpcConfigs)
        return cdkBuilder.build()
    }
}
