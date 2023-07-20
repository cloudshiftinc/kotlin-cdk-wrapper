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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.ServerlessClusterProps
import software.amazon.awscdk.services.rds.ServerlessScalingOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ServerlessClusterPropsDsl {
    private val cdkBuilder: ServerlessClusterProps.Builder = ServerlessClusterProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun backupRetention(backupRetention: Duration) {
        cdkBuilder.backupRetention(backupRetention)
    }

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun defaultDatabaseName(defaultDatabaseName: String) {
        cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun enableDataApi(enableDataApi: Boolean) {
        cdkBuilder.enableDataApi(enableDataApi)
    }

    public fun engine(engine: IClusterEngine) {
        cdkBuilder.engine(engine)
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun scaling(block: ServerlessScalingOptionsDsl.() -> Unit = {}) {
        val builder = ServerlessScalingOptionsDsl()
        builder.apply(block)
        cdkBuilder.scaling(builder.build())
    }

    public fun scaling(scaling: ServerlessScalingOptions) {
        cdkBuilder.scaling(scaling)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
        cdkBuilder.storageEncryptionKey(storageEncryptionKey)
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ServerlessClusterProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
