@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * Settings that define the Secure Sockets Layer/Transport Layer Security (SSL/TLS) traffic that
 * Network Firewall should decrypt for inspection by the stateful rule engine.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * ServerCertificateScopeProperty serverCertificateScopeProperty =
 * ServerCertificateScopeProperty.builder()
 * .destinationPorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .destinations(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .protocols(List.of(123))
 * .sourcePorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .sources(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationServerCertificateScopePropertyDsl {
    private val cdkBuilder: CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.Builder =
        CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.builder()

    private val _destinationPorts: MutableList<Any> = mutableListOf()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _protocols: MutableList<Number> = mutableListOf()

    private val _sourcePorts: MutableList<Any> = mutableListOf()

    private val _sources: MutableList<Any> = mutableListOf()

    /**
     * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
     *   Control Protocol (TCP) format. If not specified, this matches with any destination port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun destinationPorts(vararg destinationPorts: Any) {
        _destinationPorts.addAll(listOf(*destinationPorts))
    }

    /**
     * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
     *   Control Protocol (TCP) format. If not specified, this matches with any destination port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun destinationPorts(destinationPorts: Collection<Any>) {
        _destinationPorts.addAll(destinationPorts)
    }

    /**
     * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
     *   Control Protocol (TCP) format. If not specified, this matches with any destination port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts)
    }

    /**
     * @param destinations The destination IP addresses and address ranges to decrypt for
     *   inspection, in CIDR notation. If not specified, this matches with any destination address.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * @param destinations The destination IP addresses and address ranges to decrypt for
     *   inspection, in CIDR notation. If not specified, this matches with any destination address.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * @param destinations The destination IP addresses and address ranges to decrypt for
     *   inspection, in CIDR notation. If not specified, this matches with any destination address.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    /**
     * @param protocols The protocols to decrypt for inspection, specified using each protocol's
     *   assigned internet protocol number (IANA). Network Firewall currently supports only TCP.
     */
    public fun protocols(vararg protocols: Number) {
        _protocols.addAll(listOf(*protocols))
    }

    /**
     * @param protocols The protocols to decrypt for inspection, specified using each protocol's
     *   assigned internet protocol number (IANA). Network Firewall currently supports only TCP.
     */
    public fun protocols(protocols: Collection<Number>) {
        _protocols.addAll(protocols)
    }

    /**
     * @param protocols The protocols to decrypt for inspection, specified using each protocol's
     *   assigned internet protocol number (IANA). Network Firewall currently supports only TCP.
     */
    public fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols)
    }

    /**
     * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
     *   Protocol (TCP) format. If not specified, this matches with any source port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun sourcePorts(vararg sourcePorts: Any) {
        _sourcePorts.addAll(listOf(*sourcePorts))
    }

    /**
     * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
     *   Protocol (TCP) format. If not specified, this matches with any source port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun sourcePorts(sourcePorts: Collection<Any>) {
        _sourcePorts.addAll(sourcePorts)
    }

    /**
     * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
     *   Protocol (TCP) format. If not specified, this matches with any source port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     */
    public fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts)
    }

    /**
     * @param sources The source IP addresses and address ranges to decrypt for inspection, in CIDR
     *   notation. If not specified, this matches with any source address.
     */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /**
     * @param sources The source IP addresses and address ranges to decrypt for inspection, in CIDR
     *   notation. If not specified, this matches with any source address.
     */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /**
     * @param sources The source IP addresses and address ranges to decrypt for inspection, in CIDR
     *   notation. If not specified, this matches with any source address.
     */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    public fun build(): CfnTLSInspectionConfiguration.ServerCertificateScopeProperty {
        if (_destinationPorts.isNotEmpty()) cdkBuilder.destinationPorts(_destinationPorts)
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
        if (_sourcePorts.isNotEmpty()) cdkBuilder.sourcePorts(_sourcePorts)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
