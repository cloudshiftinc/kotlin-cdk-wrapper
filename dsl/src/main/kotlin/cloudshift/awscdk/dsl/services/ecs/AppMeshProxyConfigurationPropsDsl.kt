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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AppMeshProxyConfigurationPropsDsl {
    private val cdkBuilder: AppMeshProxyConfigurationProps.Builder =
        AppMeshProxyConfigurationProps.builder()

    private val _appPorts: MutableList<Number> = mutableListOf()

    private val _egressIgnoredIPs: MutableList<String> = mutableListOf()

    private val _egressIgnoredPorts: MutableList<Number> = mutableListOf()

    public fun appPorts(vararg appPorts: Number) {
        _appPorts.addAll(listOf(*appPorts))
    }

    public fun appPorts(appPorts: Collection<Number>) {
        _appPorts.addAll(appPorts)
    }

    public fun egressIgnoredIPs(vararg egressIgnoredIPs: String) {
        _egressIgnoredIPs.addAll(listOf(*egressIgnoredIPs))
    }

    public fun egressIgnoredIPs(egressIgnoredIPs: Collection<String>) {
        _egressIgnoredIPs.addAll(egressIgnoredIPs)
    }

    public fun egressIgnoredPorts(vararg egressIgnoredPorts: Number) {
        _egressIgnoredPorts.addAll(listOf(*egressIgnoredPorts))
    }

    public fun egressIgnoredPorts(egressIgnoredPorts: Collection<Number>) {
        _egressIgnoredPorts.addAll(egressIgnoredPorts)
    }

    public fun ignoredGid(ignoredGid: Number) {
        cdkBuilder.ignoredGid(ignoredGid)
    }

    public fun ignoredUid(ignoredUid: Number) {
        cdkBuilder.ignoredUid(ignoredUid)
    }

    public fun proxyEgressPort(proxyEgressPort: Number) {
        cdkBuilder.proxyEgressPort(proxyEgressPort)
    }

    public fun proxyIngressPort(proxyIngressPort: Number) {
        cdkBuilder.proxyIngressPort(proxyIngressPort)
    }

    public fun build(): AppMeshProxyConfigurationProps {
        if (_appPorts.isNotEmpty()) cdkBuilder.appPorts(_appPorts)
        if (_egressIgnoredIPs.isNotEmpty()) cdkBuilder.egressIgnoredIPs(_egressIgnoredIPs)
        if (_egressIgnoredPorts.isNotEmpty()) cdkBuilder.egressIgnoredPorts(_egressIgnoredPorts)
        return cdkBuilder.build()
    }
}
