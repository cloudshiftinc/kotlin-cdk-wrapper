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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.grafana.CfnWorkspace
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkspaceNetworkAccessControlPropertyDsl {
    private val cdkBuilder: CfnWorkspace.NetworkAccessControlProperty.Builder =
        CfnWorkspace.NetworkAccessControlProperty.builder()

    private val _prefixListIds: MutableList<String> = mutableListOf()

    private val _vpceIds: MutableList<String> = mutableListOf()

    public fun prefixListIds(vararg prefixListIds: String) {
        _prefixListIds.addAll(listOf(*prefixListIds))
    }

    public fun prefixListIds(prefixListIds: Collection<String>) {
        _prefixListIds.addAll(prefixListIds)
    }

    public fun vpceIds(vararg vpceIds: String) {
        _vpceIds.addAll(listOf(*vpceIds))
    }

    public fun vpceIds(vpceIds: Collection<String>) {
        _vpceIds.addAll(vpceIds)
    }

    public fun build(): CfnWorkspace.NetworkAccessControlProperty {
        if (_prefixListIds.isNotEmpty()) cdkBuilder.prefixListIds(_prefixListIds)
        if (_vpceIds.isNotEmpty()) cdkBuilder.vpceIds(_vpceIds)
        return cdkBuilder.build()
    }
}
