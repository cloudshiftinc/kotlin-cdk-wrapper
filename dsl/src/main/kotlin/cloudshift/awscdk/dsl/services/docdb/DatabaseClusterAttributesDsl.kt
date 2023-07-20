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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.docdb.DatabaseClusterAttributes
import software.amazon.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseClusterAttributesDsl {
    private val cdkBuilder: DatabaseClusterAttributes.Builder = DatabaseClusterAttributes.builder()

    private val _instanceEndpointAddresses: MutableList<String> = mutableListOf()

    private val _instanceIdentifiers: MutableList<String> = mutableListOf()

    public fun clusterEndpointAddress(clusterEndpointAddress: String) {
        cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String) {
        _instanceEndpointAddresses.addAll(listOf(*instanceEndpointAddresses))
    }

    public fun instanceEndpointAddresses(instanceEndpointAddresses: Collection<String>) {
        _instanceEndpointAddresses.addAll(instanceEndpointAddresses)
    }

    public fun instanceIdentifiers(vararg instanceIdentifiers: String) {
        _instanceIdentifiers.addAll(listOf(*instanceIdentifiers))
    }

    public fun instanceIdentifiers(instanceIdentifiers: Collection<String>) {
        _instanceIdentifiers.addAll(instanceIdentifiers)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun readerEndpointAddress(readerEndpointAddress: String) {
        cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun build(): DatabaseClusterAttributes {
        if (_instanceEndpointAddresses.isNotEmpty()) {
            cdkBuilder.instanceEndpointAddresses(_instanceEndpointAddresses)
        }
        if (_instanceIdentifiers.isNotEmpty()) cdkBuilder.instanceIdentifiers(_instanceIdentifiers)
        return cdkBuilder.build()
    }
}
