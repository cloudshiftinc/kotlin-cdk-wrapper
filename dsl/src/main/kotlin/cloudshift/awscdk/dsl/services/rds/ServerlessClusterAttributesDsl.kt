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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes
import software.amazon.awscdk.services.secretsmanager.ISecret
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ServerlessClusterAttributesDsl {
    private val cdkBuilder: ServerlessClusterAttributes.Builder =
        ServerlessClusterAttributes.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun clusterEndpointAddress(clusterEndpointAddress: String) {
        cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun readerEndpointAddress(readerEndpointAddress: String) {
        cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): ServerlessClusterAttributes {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
