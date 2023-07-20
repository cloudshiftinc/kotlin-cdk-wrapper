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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.BackupProps
import software.amazon.awscdk.services.docdb.DatabaseClusterProps
import software.amazon.awscdk.services.docdb.IClusterParameterGroup
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DatabaseClusterPropsDsl {
    private val cdkBuilder: DatabaseClusterProps.Builder = DatabaseClusterProps.builder()

    public fun backup(block: BackupPropsDsl.() -> Unit = {}) {
        val builder = BackupPropsDsl()
        builder.apply(block)
        cdkBuilder.backup(builder.build())
    }

    public fun backup(backup: BackupProps) {
        cdkBuilder.backup(backup)
    }

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention)
    }

    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole)
    }

    public fun dbClusterName(dbClusterName: String) {
        cdkBuilder.dbClusterName(dbClusterName)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
        cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
        cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    public fun instanceIdentifierBase(instanceIdentifierBase: String) {
        cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun instances(instances: Number) {
        cdkBuilder.instances(instances)
    }

    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun masterUser(block: LoginDsl.() -> Unit = {}) {
        val builder = LoginDsl()
        builder.apply(block)
        cdkBuilder.masterUser(builder.build())
    }

    public fun masterUser(masterUser: Login) {
        cdkBuilder.masterUser(masterUser)
    }

    public fun parameterGroup(parameterGroup: IClusterParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
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

    public fun build(): DatabaseClusterProps = cdkBuilder.build()
}
