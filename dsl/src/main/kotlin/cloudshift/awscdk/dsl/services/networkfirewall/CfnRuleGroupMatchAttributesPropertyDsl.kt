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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupMatchAttributesPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.MatchAttributesProperty.Builder =
        CfnRuleGroup.MatchAttributesProperty.builder()

    private val _destinationPorts: MutableList<Any> = mutableListOf()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _protocols: MutableList<Number> = mutableListOf()

    private val _sourcePorts: MutableList<Any> = mutableListOf()

    private val _sources: MutableList<Any> = mutableListOf()

    private val _tcpFlags: MutableList<Any> = mutableListOf()

    public fun destinationPorts(vararg destinationPorts: Any) {
        _destinationPorts.addAll(listOf(*destinationPorts))
    }

    public fun destinationPorts(destinationPorts: Collection<Any>) {
        _destinationPorts.addAll(destinationPorts)
    }

    public fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts)
    }

    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    public fun protocols(vararg protocols: Number) {
        _protocols.addAll(listOf(*protocols))
    }

    public fun protocols(protocols: Collection<Number>) {
        _protocols.addAll(protocols)
    }

    public fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols)
    }

    public fun sourcePorts(vararg sourcePorts: Any) {
        _sourcePorts.addAll(listOf(*sourcePorts))
    }

    public fun sourcePorts(sourcePorts: Collection<Any>) {
        _sourcePorts.addAll(sourcePorts)
    }

    public fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts)
    }

    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    public fun tcpFlags(vararg tcpFlags: Any) {
        _tcpFlags.addAll(listOf(*tcpFlags))
    }

    public fun tcpFlags(tcpFlags: Collection<Any>) {
        _tcpFlags.addAll(tcpFlags)
    }

    public fun tcpFlags(tcpFlags: IResolvable) {
        cdkBuilder.tcpFlags(tcpFlags)
    }

    public fun build(): CfnRuleGroup.MatchAttributesProperty {
        if (_destinationPorts.isNotEmpty()) cdkBuilder.destinationPorts(_destinationPorts)
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
        if (_sourcePorts.isNotEmpty()) cdkBuilder.sourcePorts(_sourcePorts)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        if (_tcpFlags.isNotEmpty()) cdkBuilder.tcpFlags(_tcpFlags)
        return cdkBuilder.build()
    }
}
