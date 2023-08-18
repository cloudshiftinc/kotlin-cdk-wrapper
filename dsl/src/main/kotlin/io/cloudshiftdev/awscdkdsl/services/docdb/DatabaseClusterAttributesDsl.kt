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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.docdb.DatabaseClusterAttributes
import software.amazon.awscdk.services.ec2.ISecurityGroup

/**
 * Properties that describe an existing cluster instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * import software.amazon.awscdk.services.ec2.*;
 * SecurityGroup securityGroup;
 * DatabaseClusterAttributes databaseClusterAttributes = DatabaseClusterAttributes.builder()
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .clusterEndpointAddress("clusterEndpointAddress")
 * .instanceEndpointAddresses(List.of("instanceEndpointAddresses"))
 * .instanceIdentifiers(List.of("instanceIdentifiers"))
 * .port(123)
 * .readerEndpointAddress("readerEndpointAddress")
 * .securityGroup(securityGroup)
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseClusterAttributesDsl {
    private val cdkBuilder: DatabaseClusterAttributes.Builder = DatabaseClusterAttributes.builder()

    private val _instanceEndpointAddresses: MutableList<String> = mutableListOf()

    private val _instanceIdentifiers: MutableList<String> = mutableListOf()

    /** @param clusterEndpointAddress Cluster endpoint address. */
    public fun clusterEndpointAddress(clusterEndpointAddress: String) {
        cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    /** @param clusterIdentifier Identifier for the cluster. */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /** @param instanceEndpointAddresses Endpoint addresses of individual instances. */
    public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String) {
        _instanceEndpointAddresses.addAll(listOf(*instanceEndpointAddresses))
    }

    /** @param instanceEndpointAddresses Endpoint addresses of individual instances. */
    public fun instanceEndpointAddresses(instanceEndpointAddresses: Collection<String>) {
        _instanceEndpointAddresses.addAll(instanceEndpointAddresses)
    }

    /** @param instanceIdentifiers Identifier for the instances. */
    public fun instanceIdentifiers(vararg instanceIdentifiers: String) {
        _instanceIdentifiers.addAll(listOf(*instanceIdentifiers))
    }

    /** @param instanceIdentifiers Identifier for the instances. */
    public fun instanceIdentifiers(instanceIdentifiers: Collection<String>) {
        _instanceIdentifiers.addAll(instanceIdentifiers)
    }

    /** @param port The database port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param readerEndpointAddress Reader endpoint address. */
    public fun readerEndpointAddress(readerEndpointAddress: String) {
        cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    /** @param securityGroup The security group of the database cluster. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun build(): DatabaseClusterAttributes {
        if (_instanceEndpointAddresses.isNotEmpty())
            cdkBuilder.instanceEndpointAddresses(_instanceEndpointAddresses)
        if (_instanceIdentifiers.isNotEmpty()) cdkBuilder.instanceIdentifiers(_instanceIdentifiers)
        return cdkBuilder.build()
    }
}
