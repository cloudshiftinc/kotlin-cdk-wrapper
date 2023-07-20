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

import software.amazon.awscdk.services.rds.AuroraClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures
import software.amazon.awscdk.services.rds.BackupProps
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.rds.CfnDBClusterProps
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBInstanceProps
import software.amazon.awscdk.services.rds.CfnDBParameterGroup
import software.amazon.awscdk.services.rds.CfnDBParameterGroupProps
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps
import software.amazon.awscdk.services.rds.CfnDBProxyProps
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
import software.amazon.awscdk.services.rds.CfnDBSubnetGroup
import software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps
import software.amazon.awscdk.services.rds.CfnEventSubscription
import software.amazon.awscdk.services.rds.CfnEventSubscriptionProps
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.amazon.awscdk.services.rds.CfnGlobalClusterProps
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.CfnOptionGroupProps
import software.amazon.awscdk.services.rds.ClusterEngineBindOptions
import software.amazon.awscdk.services.rds.ClusterEngineConfig
import software.amazon.awscdk.services.rds.ClusterEngineFeatures
import software.amazon.awscdk.services.rds.ClusterInstanceBindOptions
import software.amazon.awscdk.services.rds.ClusterInstanceOptions
import software.amazon.awscdk.services.rds.ClusterInstanceProps
import software.amazon.awscdk.services.rds.CommonRotationUserOptions
import software.amazon.awscdk.services.rds.CredentialsBaseOptions
import software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterAttributes
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps
import software.amazon.awscdk.services.rds.DatabaseClusterProps
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceAttributes
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.amazon.awscdk.services.rds.DatabaseInstanceNewProps
import software.amazon.awscdk.services.rds.DatabaseInstanceProps
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps
import software.amazon.awscdk.services.rds.DatabaseInstanceSourceProps
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.DatabaseProxyAttributes
import software.amazon.awscdk.services.rds.DatabaseProxyOptions
import software.amazon.awscdk.services.rds.DatabaseProxyProps
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.amazon.awscdk.services.rds.EngineVersion
import software.amazon.awscdk.services.rds.InstanceEngineBindOptions
import software.amazon.awscdk.services.rds.InstanceEngineConfig
import software.amazon.awscdk.services.rds.InstanceEngineFeatures
import software.amazon.awscdk.services.rds.InstanceProps
import software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps
import software.amazon.awscdk.services.rds.MySqlInstanceEngineProps
import software.amazon.awscdk.services.rds.OptionConfiguration
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.OptionGroupProps
import software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
import software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.amazon.awscdk.services.rds.PostgresEngineFeatures
import software.amazon.awscdk.services.rds.PostgresInstanceEngineProps
import software.amazon.awscdk.services.rds.ProcessorFeatures
import software.amazon.awscdk.services.rds.ProvisionedClusterInstanceProps
import software.amazon.awscdk.services.rds.ProxyTargetConfig
import software.amazon.awscdk.services.rds.RotationMultiUserOptions
import software.amazon.awscdk.services.rds.RotationSingleUserOptions
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
import software.amazon.awscdk.services.rds.ServerlessClusterProps
import software.amazon.awscdk.services.rds.ServerlessScalingOptions
import software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps
import software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions
import software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps
import software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps
import software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps
import software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps
import software.amazon.awscdk.services.rds.SubnetGroup
import software.amazon.awscdk.services.rds.SubnetGroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object rds {
    public inline fun auroraClusterEngineProps(block: AuroraClusterEnginePropsDsl.() -> Unit = {}): AuroraClusterEngineProps {
        val builder = AuroraClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun auroraMysqlClusterEngineProps(
        block: AuroraMysqlClusterEnginePropsDsl.() -> Unit =
            {},
    ): AuroraMysqlClusterEngineProps {
        val builder = AuroraMysqlClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun auroraPostgresClusterEngineProps(
        block: AuroraPostgresClusterEnginePropsDsl.() -> Unit =
            {},
    ): AuroraPostgresClusterEngineProps {
        val builder = AuroraPostgresClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun auroraPostgresEngineFeatures(
        block: AuroraPostgresEngineFeaturesDsl.() -> Unit =
            {},
    ): AuroraPostgresEngineFeatures {
        val builder = AuroraPostgresEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun backupProps(block: BackupPropsDsl.() -> Unit = {}): BackupProps {
        val builder = BackupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomDBEngineVersion(
        scope: Construct,
        id: String,
        block: CfnCustomDBEngineVersionDsl.() -> Unit = {},
    ): CfnCustomDBEngineVersion {
        val builder = CfnCustomDBEngineVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCustomDBEngineVersionProps(
        block: CfnCustomDBEngineVersionPropsDsl.() -> Unit =
            {},
    ): CfnCustomDBEngineVersionProps {
        val builder = CfnCustomDBEngineVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBCluster(
        scope: Construct,
        id: String,
        block: CfnDBClusterDsl.() -> Unit = {},
    ): CfnDBCluster {
        val builder = CfnDBClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterDBClusterRoleProperty(
        block: CfnDBClusterDBClusterRolePropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.DBClusterRoleProperty {
        val builder = CfnDBClusterDBClusterRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterEndpointProperty(
        block: CfnDBClusterEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.EndpointProperty {
        val builder = CfnDBClusterEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterMasterUserSecretProperty(
        block: CfnDBClusterMasterUserSecretPropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.MasterUserSecretProperty {
        val builder = CfnDBClusterMasterUserSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterParameterGroup(
        scope: Construct,
        id: String,
        block: CfnDBClusterParameterGroupDsl.() -> Unit = {},
    ): CfnDBClusterParameterGroup {
        val builder = CfnDBClusterParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterParameterGroupProps(
        block: CfnDBClusterParameterGroupPropsDsl.() -> Unit =
            {},
    ): CfnDBClusterParameterGroupProps {
        val builder = CfnDBClusterParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterProps(block: CfnDBClusterPropsDsl.() -> Unit = {}): CfnDBClusterProps {
        val builder = CfnDBClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterReadEndpointProperty(
        block: CfnDBClusterReadEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.ReadEndpointProperty {
        val builder = CfnDBClusterReadEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterScalingConfigurationProperty(
        block: CfnDBClusterScalingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.ScalingConfigurationProperty {
        val builder = CfnDBClusterScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBClusterServerlessV2ScalingConfigurationProperty(
        block: CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDBCluster.ServerlessV2ScalingConfigurationProperty {
        val builder = CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstance(
        scope: Construct,
        id: String,
        block: CfnDBInstanceDsl.() -> Unit = {},
    ): CfnDBInstance {
        val builder = CfnDBInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceCertificateDetailsProperty(
        block: CfnDBInstanceCertificateDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnDBInstance.CertificateDetailsProperty {
        val builder = CfnDBInstanceCertificateDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceDBInstanceRoleProperty(
        block: CfnDBInstanceDBInstanceRolePropertyDsl.() -> Unit =
            {},
    ): CfnDBInstance.DBInstanceRoleProperty {
        val builder = CfnDBInstanceDBInstanceRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceEndpointProperty(
        block: CfnDBInstanceEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnDBInstance.EndpointProperty {
        val builder = CfnDBInstanceEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceMasterUserSecretProperty(
        block: CfnDBInstanceMasterUserSecretPropertyDsl.() -> Unit =
            {},
    ): CfnDBInstance.MasterUserSecretProperty {
        val builder = CfnDBInstanceMasterUserSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceProcessorFeatureProperty(
        block: CfnDBInstanceProcessorFeaturePropertyDsl.() -> Unit =
            {},
    ): CfnDBInstance.ProcessorFeatureProperty {
        val builder = CfnDBInstanceProcessorFeaturePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBInstanceProps(block: CfnDBInstancePropsDsl.() -> Unit = {}): CfnDBInstanceProps {
        val builder = CfnDBInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBParameterGroup(
        scope: Construct,
        id: String,
        block: CfnDBParameterGroupDsl.() -> Unit = {},
    ): CfnDBParameterGroup {
        val builder = CfnDBParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBParameterGroupProps(block: CfnDBParameterGroupPropsDsl.() -> Unit = {}): CfnDBParameterGroupProps {
        val builder = CfnDBParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxy(
        scope: Construct,
        id: String,
        block: CfnDBProxyDsl.() -> Unit = {},
    ): CfnDBProxy {
        val builder = CfnDBProxyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyAuthFormatProperty(
        block: CfnDBProxyAuthFormatPropertyDsl.() -> Unit =
            {},
    ): CfnDBProxy.AuthFormatProperty {
        val builder = CfnDBProxyAuthFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyEndpoint(
        scope: Construct,
        id: String,
        block: CfnDBProxyEndpointDsl.() -> Unit = {},
    ): CfnDBProxyEndpoint {
        val builder = CfnDBProxyEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyEndpointProps(block: CfnDBProxyEndpointPropsDsl.() -> Unit = {}): CfnDBProxyEndpointProps {
        val builder = CfnDBProxyEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyEndpointTagFormatProperty(
        block: CfnDBProxyEndpointTagFormatPropertyDsl.() -> Unit =
            {},
    ): CfnDBProxyEndpoint.TagFormatProperty {
        val builder = CfnDBProxyEndpointTagFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyProps(block: CfnDBProxyPropsDsl.() -> Unit = {}): CfnDBProxyProps {
        val builder = CfnDBProxyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyTagFormatProperty(
        block: CfnDBProxyTagFormatPropertyDsl.() -> Unit =
            {},
    ): CfnDBProxy.TagFormatProperty {
        val builder = CfnDBProxyTagFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyTargetGroup(
        scope: Construct,
        id: String,
        block: CfnDBProxyTargetGroupDsl.() -> Unit = {},
    ): CfnDBProxyTargetGroup {
        val builder = CfnDBProxyTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatProperty(
        block: CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl.() -> Unit =
            {},
    ): CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty {
        val builder = CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBProxyTargetGroupProps(
        block: CfnDBProxyTargetGroupPropsDsl.() -> Unit =
            {},
    ): CfnDBProxyTargetGroupProps {
        val builder = CfnDBProxyTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnDBSecurityGroupDsl.() -> Unit = {},
    ): CfnDBSecurityGroup {
        val builder = CfnDBSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSecurityGroupIngress(
        scope: Construct,
        id: String,
        block: CfnDBSecurityGroupIngressDsl.() -> Unit = {},
    ): CfnDBSecurityGroupIngress {
        val builder = CfnDBSecurityGroupIngressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSecurityGroupIngressProperty(
        block: CfnDBSecurityGroupIngressPropertyDsl.() -> Unit =
            {},
    ): CfnDBSecurityGroup.IngressProperty {
        val builder = CfnDBSecurityGroupIngressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSecurityGroupIngressProps(block: CfnDBSecurityGroupIngressPropsDsl.() -> Unit = {}): CfnDBSecurityGroupIngressProps {
        val builder = CfnDBSecurityGroupIngressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSecurityGroupProps(block: CfnDBSecurityGroupPropsDsl.() -> Unit = {}): CfnDBSecurityGroupProps {
        val builder = CfnDBSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSubnetGroup(
        scope: Construct,
        id: String,
        block: CfnDBSubnetGroupDsl.() -> Unit = {},
    ): CfnDBSubnetGroup {
        val builder = CfnDBSubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDBSubnetGroupProps(block: CfnDBSubnetGroupPropsDsl.() -> Unit = {}): CfnDBSubnetGroupProps {
        val builder = CfnDBSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventSubscription(
        scope: Construct,
        id: String,
        block: CfnEventSubscriptionDsl.() -> Unit = {},
    ): CfnEventSubscription {
        val builder = CfnEventSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventSubscriptionProps(block: CfnEventSubscriptionPropsDsl.() -> Unit = {}): CfnEventSubscriptionProps {
        val builder = CfnEventSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGlobalCluster(
        scope: Construct,
        id: String,
        block: CfnGlobalClusterDsl.() -> Unit = {},
    ): CfnGlobalCluster {
        val builder = CfnGlobalClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGlobalClusterProps(block: CfnGlobalClusterPropsDsl.() -> Unit = {}): CfnGlobalClusterProps {
        val builder = CfnGlobalClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOptionGroup(
        scope: Construct,
        id: String,
        block: CfnOptionGroupDsl.() -> Unit = {},
    ): CfnOptionGroup {
        val builder = CfnOptionGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOptionGroupOptionConfigurationProperty(
        block: CfnOptionGroupOptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnOptionGroup.OptionConfigurationProperty {
        val builder = CfnOptionGroupOptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOptionGroupOptionSettingProperty(
        block: CfnOptionGroupOptionSettingPropertyDsl.() -> Unit =
            {},
    ): CfnOptionGroup.OptionSettingProperty {
        val builder = CfnOptionGroupOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOptionGroupProps(block: CfnOptionGroupPropsDsl.() -> Unit = {}): CfnOptionGroupProps {
        val builder = CfnOptionGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterEngineBindOptions(block: ClusterEngineBindOptionsDsl.() -> Unit = {}): ClusterEngineBindOptions {
        val builder = ClusterEngineBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterEngineConfig(block: ClusterEngineConfigDsl.() -> Unit = {}): ClusterEngineConfig {
        val builder = ClusterEngineConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterEngineFeatures(block: ClusterEngineFeaturesDsl.() -> Unit = {}): ClusterEngineFeatures {
        val builder = ClusterEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterInstanceBindOptions(
        block: ClusterInstanceBindOptionsDsl.() -> Unit =
            {},
    ): ClusterInstanceBindOptions {
        val builder = ClusterInstanceBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterInstanceOptions(block: ClusterInstanceOptionsDsl.() -> Unit = {}): ClusterInstanceOptions {
        val builder = ClusterInstanceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterInstanceProps(block: ClusterInstancePropsDsl.() -> Unit = {}): ClusterInstanceProps {
        val builder = ClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonRotationUserOptions(block: CommonRotationUserOptionsDsl.() -> Unit = {}): CommonRotationUserOptions {
        val builder = CommonRotationUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun credentialsBaseOptions(block: CredentialsBaseOptionsDsl.() -> Unit = {}): CredentialsBaseOptions {
        val builder = CredentialsBaseOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun credentialsFromUsernameOptions(block: CredentialsFromUsernameOptionsDsl.() -> Unit = {}): CredentialsFromUsernameOptions {
        val builder = CredentialsFromUsernameOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseCluster(
        scope: Construct,
        id: String,
        block: DatabaseClusterDsl.() -> Unit = {},
    ): DatabaseCluster {
        val builder = DatabaseClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseClusterAttributes(block: DatabaseClusterAttributesDsl.() -> Unit = {}): DatabaseClusterAttributes {
        val builder = DatabaseClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseClusterFromSnapshot(
        scope: Construct,
        id: String,
        block: DatabaseClusterFromSnapshotDsl.() -> Unit = {},
    ): DatabaseClusterFromSnapshot {
        val builder = DatabaseClusterFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseClusterFromSnapshotProps(
        block: DatabaseClusterFromSnapshotPropsDsl.() -> Unit =
            {},
    ): DatabaseClusterFromSnapshotProps {
        val builder = DatabaseClusterFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseClusterProps(block: DatabaseClusterPropsDsl.() -> Unit = {}): DatabaseClusterProps {
        val builder = DatabaseClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstance(
        scope: Construct,
        id: String,
        block: DatabaseInstanceDsl.() -> Unit = {},
    ): DatabaseInstance {
        val builder = DatabaseInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceAttributes(
        block: DatabaseInstanceAttributesDsl.() -> Unit =
            {},
    ): DatabaseInstanceAttributes {
        val builder = DatabaseInstanceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceFromSnapshot(
        scope: Construct,
        id: String,
        block: DatabaseInstanceFromSnapshotDsl.() -> Unit = {},
    ): DatabaseInstanceFromSnapshot {
        val builder = DatabaseInstanceFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceFromSnapshotProps(
        block: DatabaseInstanceFromSnapshotPropsDsl.() -> Unit =
            {},
    ): DatabaseInstanceFromSnapshotProps {
        val builder = DatabaseInstanceFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceNewProps(block: DatabaseInstanceNewPropsDsl.() -> Unit = {}): DatabaseInstanceNewProps {
        val builder = DatabaseInstanceNewPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceProps(block: DatabaseInstancePropsDsl.() -> Unit = {}): DatabaseInstanceProps {
        val builder = DatabaseInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceReadReplica(
        scope: Construct,
        id: String,
        block: DatabaseInstanceReadReplicaDsl.() -> Unit = {},
    ): DatabaseInstanceReadReplica {
        val builder = DatabaseInstanceReadReplicaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceReadReplicaProps(
        block: DatabaseInstanceReadReplicaPropsDsl.() -> Unit =
            {},
    ): DatabaseInstanceReadReplicaProps {
        val builder = DatabaseInstanceReadReplicaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseInstanceSourceProps(
        block: DatabaseInstanceSourcePropsDsl.() -> Unit =
            {},
    ): DatabaseInstanceSourceProps {
        val builder = DatabaseInstanceSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseProxy(
        scope: Construct,
        id: String,
        block: DatabaseProxyDsl.() -> Unit = {},
    ): DatabaseProxy {
        val builder = DatabaseProxyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseProxyAttributes(block: DatabaseProxyAttributesDsl.() -> Unit = {}): DatabaseProxyAttributes {
        val builder = DatabaseProxyAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseProxyOptions(block: DatabaseProxyOptionsDsl.() -> Unit = {}): DatabaseProxyOptions {
        val builder = DatabaseProxyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseProxyProps(block: DatabaseProxyPropsDsl.() -> Unit = {}): DatabaseProxyProps {
        val builder = DatabaseProxyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseSecret(
        scope: Construct,
        id: String,
        block: DatabaseSecretDsl.() -> Unit = {},
    ): DatabaseSecret {
        val builder = DatabaseSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun databaseSecretProps(block: DatabaseSecretPropsDsl.() -> Unit = {}): DatabaseSecretProps {
        val builder = DatabaseSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun engineVersion(block: EngineVersionDsl.() -> Unit = {}): EngineVersion {
        val builder = EngineVersionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun instanceEngineBindOptions(block: InstanceEngineBindOptionsDsl.() -> Unit = {}): InstanceEngineBindOptions {
        val builder = InstanceEngineBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun instanceEngineConfig(block: InstanceEngineConfigDsl.() -> Unit = {}): InstanceEngineConfig {
        val builder = InstanceEngineConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun instanceEngineFeatures(block: InstanceEngineFeaturesDsl.() -> Unit = {}): InstanceEngineFeatures {
        val builder = InstanceEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun instanceProps(block: InstancePropsDsl.() -> Unit = {}): InstanceProps {
        val builder = InstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mariaDbInstanceEngineProps(
        block: MariaDbInstanceEnginePropsDsl.() -> Unit =
            {},
    ): MariaDbInstanceEngineProps {
        val builder = MariaDbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mySqlInstanceEngineProps(block: MySqlInstanceEnginePropsDsl.() -> Unit = {}): MySqlInstanceEngineProps {
        val builder = MySqlInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun optionConfiguration(block: OptionConfigurationDsl.() -> Unit = {}): OptionConfiguration {
        val builder = OptionConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun optionGroup(
        scope: Construct,
        id: String,
        block: OptionGroupDsl.() -> Unit = {},
    ): OptionGroup {
        val builder = OptionGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun optionGroupProps(block: OptionGroupPropsDsl.() -> Unit = {}): OptionGroupProps {
        val builder = OptionGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun oracleEeCdbInstanceEngineProps(block: OracleEeCdbInstanceEnginePropsDsl.() -> Unit = {}): OracleEeCdbInstanceEngineProps {
        val builder = OracleEeCdbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun oracleEeInstanceEngineProps(
        block: OracleEeInstanceEnginePropsDsl.() -> Unit =
            {},
    ): OracleEeInstanceEngineProps {
        val builder = OracleEeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun oracleSe2CdbInstanceEngineProps(
        block: OracleSe2CdbInstanceEnginePropsDsl.() -> Unit =
            {},
    ): OracleSe2CdbInstanceEngineProps {
        val builder = OracleSe2CdbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun oracleSe2InstanceEngineProps(
        block: OracleSe2InstanceEnginePropsDsl.() -> Unit =
            {},
    ): OracleSe2InstanceEngineProps {
        val builder = OracleSe2InstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroup(
        scope: Construct,
        id: String,
        block: ParameterGroupDsl.() -> Unit = {},
    ): ParameterGroup {
        val builder = ParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroupClusterBindOptions(
        block: ParameterGroupClusterBindOptionsDsl.() -> Unit =
            {},
    ): ParameterGroupClusterBindOptions {
        val builder = ParameterGroupClusterBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroupClusterConfig(
        block: ParameterGroupClusterConfigDsl.() -> Unit =
            {},
    ): ParameterGroupClusterConfig {
        val builder = ParameterGroupClusterConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroupInstanceBindOptions(
        block: ParameterGroupInstanceBindOptionsDsl.() -> Unit =
            {},
    ): ParameterGroupInstanceBindOptions {
        val builder = ParameterGroupInstanceBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroupInstanceConfig(
        block: ParameterGroupInstanceConfigDsl.() -> Unit =
            {},
    ): ParameterGroupInstanceConfig {
        val builder = ParameterGroupInstanceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun parameterGroupProps(block: ParameterGroupPropsDsl.() -> Unit = {}): ParameterGroupProps {
        val builder = ParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun postgresEngineFeatures(block: PostgresEngineFeaturesDsl.() -> Unit = {}): PostgresEngineFeatures {
        val builder = PostgresEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun postgresInstanceEngineProps(
        block: PostgresInstanceEnginePropsDsl.() -> Unit =
            {},
    ): PostgresInstanceEngineProps {
        val builder = PostgresInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun processorFeatures(block: ProcessorFeaturesDsl.() -> Unit = {}): ProcessorFeatures {
        val builder = ProcessorFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun provisionedClusterInstanceProps(
        block: ProvisionedClusterInstancePropsDsl.() -> Unit =
            {},
    ): ProvisionedClusterInstanceProps {
        val builder = ProvisionedClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun proxyTargetConfig(block: ProxyTargetConfigDsl.() -> Unit = {}): ProxyTargetConfig {
        val builder = ProxyTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rotationMultiUserOptions(block: RotationMultiUserOptionsDsl.() -> Unit = {}): RotationMultiUserOptions {
        val builder = RotationMultiUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rotationSingleUserOptions(block: RotationSingleUserOptionsDsl.() -> Unit = {}): RotationSingleUserOptions {
        val builder = RotationSingleUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessCluster(
        scope: Construct,
        id: String,
        block: ServerlessClusterDsl.() -> Unit = {},
    ): ServerlessCluster {
        val builder = ServerlessClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessClusterAttributes(
        block: ServerlessClusterAttributesDsl.() -> Unit =
            {},
    ): ServerlessClusterAttributes {
        val builder = ServerlessClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessClusterFromSnapshot(
        scope: Construct,
        id: String,
        block: ServerlessClusterFromSnapshotDsl.() -> Unit = {},
    ): ServerlessClusterFromSnapshot {
        val builder = ServerlessClusterFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessClusterFromSnapshotProps(
        block: ServerlessClusterFromSnapshotPropsDsl.() -> Unit =
            {},
    ): ServerlessClusterFromSnapshotProps {
        val builder = ServerlessClusterFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessClusterProps(block: ServerlessClusterPropsDsl.() -> Unit = {}): ServerlessClusterProps {
        val builder = ServerlessClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessScalingOptions(block: ServerlessScalingOptionsDsl.() -> Unit = {}): ServerlessScalingOptions {
        val builder = ServerlessScalingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverlessV2ClusterInstanceProps(
        block: ServerlessV2ClusterInstancePropsDsl.() -> Unit =
            {},
    ): ServerlessV2ClusterInstanceProps {
        val builder = ServerlessV2ClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun snapshotCredentialsFromGeneratedPasswordOptions(
        block: SnapshotCredentialsFromGeneratedPasswordOptionsDsl.() -> Unit =
            {},
    ): SnapshotCredentialsFromGeneratedPasswordOptions {
        val builder = SnapshotCredentialsFromGeneratedPasswordOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqlServerEeInstanceEngineProps(block: SqlServerEeInstanceEnginePropsDsl.() -> Unit = {}): SqlServerEeInstanceEngineProps {
        val builder = SqlServerEeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqlServerExInstanceEngineProps(block: SqlServerExInstanceEnginePropsDsl.() -> Unit = {}): SqlServerExInstanceEngineProps {
        val builder = SqlServerExInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqlServerSeInstanceEngineProps(block: SqlServerSeInstanceEnginePropsDsl.() -> Unit = {}): SqlServerSeInstanceEngineProps {
        val builder = SqlServerSeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqlServerWebInstanceEngineProps(
        block: SqlServerWebInstanceEnginePropsDsl.() -> Unit =
            {},
    ): SqlServerWebInstanceEngineProps {
        val builder = SqlServerWebInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun subnetGroup(
        scope: Construct,
        id: String,
        block: SubnetGroupDsl.() -> Unit = {},
    ): SubnetGroup {
        val builder = SubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun subnetGroupProps(block: SubnetGroupPropsDsl.() -> Unit = {}): SubnetGroupProps {
        val builder = SubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
