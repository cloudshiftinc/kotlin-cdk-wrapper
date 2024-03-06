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

package io.cloudshiftdev.awscdkdsl.services.rds

import kotlin.String
import kotlin.Unit
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
import software.amazon.awscdk.services.rds.CfnIntegration
import software.amazon.awscdk.services.rds.CfnIntegrationProps
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

public object rds {
    /**
     * Creation properties of the plain Aurora database cluster engine.
     *
     * Used in `DatabaseClusterEngine.aurora`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
     * .writer(ClusterInstance.provisioned("writer"))
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .build();
     * ```
     */
    public inline fun auroraClusterEngineProps(
        block: AuroraClusterEnginePropsDsl.() -> Unit = {}
    ): AuroraClusterEngineProps {
        val builder = AuroraClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creation properties of the Aurora MySQL database cluster engine.
     *
     * Used in `DatabaseClusterEngine.auroraMysql`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
     * .build()))
     * .serverlessV2MinCapacity(6.5)
     * .serverlessV2MaxCapacity(64)
     * .readers(List.of(ClusterInstance.serverlessV2("reader1",
     * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
     * ClusterInstance.serverlessV2("reader2")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun auroraMysqlClusterEngineProps(
        block: AuroraMysqlClusterEnginePropsDsl.() -> Unit = {}
    ): AuroraMysqlClusterEngineProps {
        val builder = AuroraMysqlClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creation properties of the Aurora PostgreSQL database cluster engine.
     *
     * Used in `DatabaseClusterEngine.auroraPostgres`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_2).build()))
     * .credentials(Credentials.fromUsername("adminuser",
     * CredentialsFromUsernameOptions.builder().password(SecretValue.unsafePlainText("7959866cacc02c2d243ecfe177464fe6")).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .publiclyAccessible(false)
     * .build()))
     * .readers(List.of(ClusterInstance.provisioned("reader")))
     * .storageType(DBClusterStorageType.AURORA_IOPT1)
     * .vpcSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun auroraPostgresClusterEngineProps(
        block: AuroraPostgresClusterEnginePropsDsl.() -> Unit = {}
    ): AuroraPostgresClusterEngineProps {
        val builder = AuroraPostgresClusterEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Features supported by this version of the Aurora Postgres cluster engine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * AuroraPostgresEngineFeatures auroraPostgresEngineFeatures =
     * AuroraPostgresEngineFeatures.builder()
     * .s3Export(false)
     * .s3Import(false)
     * .build();
     * ```
     */
    public inline fun auroraPostgresEngineFeatures(
        block: AuroraPostgresEngineFeaturesDsl.() -> Unit = {}
    ): AuroraPostgresEngineFeatures {
        val builder = AuroraPostgresEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Backup configuration for RDS databases.
     *
     * Default: - The retention period for automated backups is 1 day. The preferred backup window
     * will be a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.rds.*;
     * BackupProps backupProps = BackupProps.builder()
     * .retention(Duration.minutes(30))
     * // the properties below are optional
     * .preferredWindow("preferredWindow")
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow)
     */
    public inline fun backupProps(block: BackupPropsDsl.() -> Unit = {}): BackupProps {
        val builder = BackupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a custom DB engine version (CEV).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnCustomDBEngineVersion cfnCustomDBEngineVersion =
     * CfnCustomDBEngineVersion.Builder.create(this, "MyCfnCustomDBEngineVersion")
     * .databaseInstallationFilesS3BucketName("databaseInstallationFilesS3BucketName")
     * .engine("engine")
     * .engineVersion("engineVersion")
     * // the properties below are optional
     * .databaseInstallationFilesS3Prefix("databaseInstallationFilesS3Prefix")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .manifest("manifest")
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html)
     */
    public inline fun cfnCustomDBEngineVersion(
        scope: Construct,
        id: String,
        block: CfnCustomDBEngineVersionDsl.() -> Unit = {},
    ): CfnCustomDBEngineVersion {
        val builder = CfnCustomDBEngineVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCustomDBEngineVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnCustomDBEngineVersionProps cfnCustomDBEngineVersionProps =
     * CfnCustomDBEngineVersionProps.builder()
     * .databaseInstallationFilesS3BucketName("databaseInstallationFilesS3BucketName")
     * .engine("engine")
     * .engineVersion("engineVersion")
     * // the properties below are optional
     * .databaseInstallationFilesS3Prefix("databaseInstallationFilesS3Prefix")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .manifest("manifest")
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html)
     */
    public inline fun cfnCustomDBEngineVersionProps(
        block: CfnCustomDBEngineVersionPropsDsl.() -> Unit = {}
    ): CfnCustomDBEngineVersionProps {
        val builder = CfnCustomDBEngineVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBCluster` resource creates an Amazon Aurora DB cluster or Multi-AZ DB
     * cluster.
     *
     * For more information about creating an Aurora DB cluster, see
     * [Creating an Amazon Aurora DB cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html)
     * in the *Amazon Aurora User Guide* .
     *
     * For more information about creating a Multi-AZ DB cluster, see
     * [Creating a Multi-AZ DB cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/create-multi-az-db-cluster.html)
     * in the *Amazon RDS User Guide* .
     *
     * You can only create this resource in AWS Regions where Amazon Aurora or Multi-AZ DB clusters
     * are supported.
     *
     * *Updating DB clusters*
     *
     * When properties labeled " *Update requires:*
     * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * " are updated, AWS CloudFormation first creates a replacement DB cluster, then changes
     * references from other dependent resources to point to the replacement DB cluster, and finally
     * deletes the old DB cluster.
     *
     * We highly recommend that you take a snapshot of the database before updating the stack. If
     * you don't, you lose the data when AWS CloudFormation replaces your DB cluster. To preserve
     * your data, perform the following procedure:
     * * Deactivate any applications that are using the DB cluster so that there's no activity on
     *   the DB instance.
     * * Create a snapshot of the DB cluster. For more information, see
     *   [Creating a DB Cluster Snapshot](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CreateSnapshotCluster.html)
     *   .
     * * If you want to restore your DB cluster using a DB cluster snapshot, modify the updated
     *   template with your DB cluster changes and add the `SnapshotIdentifier` property with the ID
     *   of the DB cluster snapshot that you want to use.
     *
     * After you restore a DB cluster with a `SnapshotIdentifier` property, you must specify the
     * same `SnapshotIdentifier` property for any future updates to the DB cluster. When you specify
     * this property for an update, the DB cluster is not restored from the DB cluster snapshot
     * again, and the data in the database is not changed. However, if you don't specify the
     * `SnapshotIdentifier` property, an empty DB cluster is created, and the original DB cluster is
     * deleted. If you specify a property that is different from the previous snapshot restore
     * property, a new DB cluster is restored from the specified `SnapshotIdentifier` property, and
     * the original DB cluster is deleted.
     * * Update the stack.
     *
     * Currently, when you are updating the stack for an Aurora Serverless DB cluster, you can't
     * include changes to any other properties when you specify one of the following properties:
     * `PreferredBackupWindow` , `PreferredMaintenanceWindow` , and `Port` . This limitation doesn't
     * apply to provisioned DB clusters.
     *
     * For more information about updating other properties of this resource, see
     * `[ModifyDBCluster](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_ModifyDBCluster.html)`
     * . For more information about updating stacks, see
     * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * *Deleting DB clusters*
     *
     * The default `DeletionPolicy` for `AWS::RDS::DBCluster` resources is `Snapshot` . For more
     * information about how AWS CloudFormation deletes resources, see
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
     * .allocatedStorage(123)
     * .associatedRoles(List.of(DBClusterRoleProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .featureName("featureName")
     * .build()))
     * .autoMinorVersionUpgrade(false)
     * .availabilityZones(List.of("availabilityZones"))
     * .backtrackWindow(123)
     * .backupRetentionPeriod(123)
     * .copyTagsToSnapshot(false)
     * .databaseName("databaseName")
     * .dbClusterIdentifier("dbClusterIdentifier")
     * .dbClusterInstanceClass("dbClusterInstanceClass")
     * .dbClusterParameterGroupName("dbClusterParameterGroupName")
     * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .dbSystemId("dbSystemId")
     * .deletionProtection(false)
     * .domain("domain")
     * .domainIamRoleName("domainIamRoleName")
     * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
     * .enableGlobalWriteForwarding(false)
     * .enableHttpEndpoint(false)
     * .enableIamDatabaseAuthentication(false)
     * .engine("engine")
     * .engineMode("engineMode")
     * .engineVersion("engineVersion")
     * .globalClusterIdentifier("globalClusterIdentifier")
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .manageMasterUserPassword(false)
     * .masterUsername("masterUsername")
     * .masterUserPassword("masterUserPassword")
     * .masterUserSecret(MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build())
     * .monitoringInterval(123)
     * .monitoringRoleArn("monitoringRoleArn")
     * .networkType("networkType")
     * .performanceInsightsEnabled(false)
     * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
     * .performanceInsightsRetentionPeriod(123)
     * .port(123)
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .replicationSourceIdentifier("replicationSourceIdentifier")
     * .restoreToTime("restoreToTime")
     * .restoreType("restoreType")
     * .scalingConfiguration(ScalingConfigurationProperty.builder()
     * .autoPause(false)
     * .maxCapacity(123)
     * .minCapacity(123)
     * .secondsBeforeTimeout(123)
     * .secondsUntilAutoPause(123)
     * .timeoutAction("timeoutAction")
     * .build())
     * .serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .snapshotIdentifier("snapshotIdentifier")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .sourceRegion("sourceRegion")
     * .storageEncrypted(false)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useLatestRestorableTime(false)
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
     */
    public inline fun cfnDBCluster(
        scope: Construct,
        id: String,
        block: CfnDBClusterDsl.() -> Unit = {},
    ): CfnDBCluster {
        val builder = CfnDBClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB
     * cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * DBClusterRoleProperty dBClusterRoleProperty = DBClusterRoleProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .featureName("featureName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-dbclusterrole.html)
     */
    public inline fun cfnDBClusterDBClusterRoleProperty(
        block: CfnDBClusterDBClusterRolePropertyDsl.() -> Unit = {}
    ): CfnDBCluster.DBClusterRoleProperty {
        val builder = CfnDBClusterDBClusterRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Endpoint` return value specifies the connection endpoint for the primary instance of the
     * DB cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * EndpointProperty endpointProperty = EndpointProperty.builder()
     * .address("address")
     * .port("port")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html)
     */
    public inline fun cfnDBClusterEndpointProperty(
        block: CfnDBClusterEndpointPropertyDsl.() -> Unit = {}
    ): CfnDBCluster.EndpointProperty {
        val builder = CfnDBClusterEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MasterUserSecret` return value specifies the secret managed by RDS in AWS Secrets
     * Manager for the master user password.
     *
     * For more information, see
     * [Password management with AWS Secrets Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html)
     * in the *Amazon RDS User Guide* and
     * [Password management with AWS Secrets Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * MasterUserSecretProperty masterUserSecretProperty = MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     */
    public inline fun cfnDBClusterMasterUserSecretProperty(
        block: CfnDBClusterMasterUserSecretPropertyDsl.() -> Unit = {}
    ): CfnDBCluster.MasterUserSecretProperty {
        val builder = CfnDBClusterMasterUserSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBClusterParameterGroup` resource creates a new Amazon RDS DB cluster
     * parameter group.
     *
     * For information about configuring parameters for Amazon Aurora DB clusters, see
     * [Working with parameter groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     * If you apply a parameter group to a DB cluster, then its DB instances might need to reboot.
     * This can result in an outage while the DB instances are rebooting.
     *
     * If you apply a change to parameter group associated with a stopped DB cluster, then the
     * update stack waits until the DB cluster is started.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * Object parameters;
     * CfnDBClusterParameterGroup cfnDBClusterParameterGroup =
     * CfnDBClusterParameterGroup.Builder.create(this, "MyCfnDBClusterParameterGroup")
     * .description("description")
     * .family("family")
     * .parameters(parameters)
     * // the properties below are optional
     * .dbClusterParameterGroupName("dbClusterParameterGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html)
     */
    public inline fun cfnDBClusterParameterGroup(
        scope: Construct,
        id: String,
        block: CfnDBClusterParameterGroupDsl.() -> Unit = {},
    ): CfnDBClusterParameterGroup {
        val builder = CfnDBClusterParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBClusterParameterGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * Object parameters;
     * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
     * CfnDBClusterParameterGroupProps.builder()
     * .description("description")
     * .family("family")
     * .parameters(parameters)
     * // the properties below are optional
     * .dbClusterParameterGroupName("dbClusterParameterGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html)
     */
    public inline fun cfnDBClusterParameterGroupProps(
        block: CfnDBClusterParameterGroupPropsDsl.() -> Unit = {}
    ): CfnDBClusterParameterGroupProps {
        val builder = CfnDBClusterParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
     * .allocatedStorage(123)
     * .associatedRoles(List.of(DBClusterRoleProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .featureName("featureName")
     * .build()))
     * .autoMinorVersionUpgrade(false)
     * .availabilityZones(List.of("availabilityZones"))
     * .backtrackWindow(123)
     * .backupRetentionPeriod(123)
     * .copyTagsToSnapshot(false)
     * .databaseName("databaseName")
     * .dbClusterIdentifier("dbClusterIdentifier")
     * .dbClusterInstanceClass("dbClusterInstanceClass")
     * .dbClusterParameterGroupName("dbClusterParameterGroupName")
     * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .dbSystemId("dbSystemId")
     * .deletionProtection(false)
     * .domain("domain")
     * .domainIamRoleName("domainIamRoleName")
     * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
     * .enableGlobalWriteForwarding(false)
     * .enableHttpEndpoint(false)
     * .enableIamDatabaseAuthentication(false)
     * .engine("engine")
     * .engineMode("engineMode")
     * .engineVersion("engineVersion")
     * .globalClusterIdentifier("globalClusterIdentifier")
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .manageMasterUserPassword(false)
     * .masterUsername("masterUsername")
     * .masterUserPassword("masterUserPassword")
     * .masterUserSecret(MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build())
     * .monitoringInterval(123)
     * .monitoringRoleArn("monitoringRoleArn")
     * .networkType("networkType")
     * .performanceInsightsEnabled(false)
     * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
     * .performanceInsightsRetentionPeriod(123)
     * .port(123)
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .publiclyAccessible(false)
     * .replicationSourceIdentifier("replicationSourceIdentifier")
     * .restoreToTime("restoreToTime")
     * .restoreType("restoreType")
     * .scalingConfiguration(ScalingConfigurationProperty.builder()
     * .autoPause(false)
     * .maxCapacity(123)
     * .minCapacity(123)
     * .secondsBeforeTimeout(123)
     * .secondsUntilAutoPause(123)
     * .timeoutAction("timeoutAction")
     * .build())
     * .serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build())
     * .snapshotIdentifier("snapshotIdentifier")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .sourceRegion("sourceRegion")
     * .storageEncrypted(false)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .useLatestRestorableTime(false)
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html)
     */
    public inline fun cfnDBClusterProps(
        block: CfnDBClusterPropsDsl.() -> Unit = {}
    ): CfnDBClusterProps {
        val builder = CfnDBClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ReadEndpoint` return value specifies the reader endpoint for the DB cluster.
     *
     * The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas
     * that are available in a DB cluster. As clients request new connections to the reader
     * endpoint, Aurora distributes the connection requests among the Aurora Replicas in the DB
     * cluster. This functionality can help balance your read workload across multiple Aurora
     * Replicas in your DB cluster.
     *
     * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the
     * primary instance, your connection is dropped. To continue sending your read workload to other
     * Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
     *
     * For more information about Aurora endpoints, see
     * [Amazon Aurora connection management](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ReadEndpointProperty readEndpointProperty = ReadEndpointProperty.builder()
     * .address("address")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-readendpoint.html)
     */
    public inline fun cfnDBClusterReadEndpointProperty(
        block: CfnDBClusterReadEndpointPropertyDsl.() -> Unit = {}
    ): CfnDBCluster.ReadEndpointProperty {
        val builder = CfnDBClusterReadEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
     * Serverless DB cluster.
     *
     * For more information, see
     * [Using Amazon Aurora Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html)
     * in the *Amazon Aurora User Guide* .
     *
     * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, Use the
     * `ServerlessV2ScalingConfiguration` property.
     *
     * Valid for: Aurora DB clusters only
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ScalingConfigurationProperty scalingConfigurationProperty =
     * ScalingConfigurationProperty.builder()
     * .autoPause(false)
     * .maxCapacity(123)
     * .minCapacity(123)
     * .secondsBeforeTimeout(123)
     * .secondsUntilAutoPause(123)
     * .timeoutAction("timeoutAction")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html)
     */
    public inline fun cfnDBClusterScalingConfigurationProperty(
        block: CfnDBClusterScalingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDBCluster.ScalingConfigurationProperty {
        val builder = CfnDBClusterScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ServerlessV2ScalingConfiguration` property type specifies the scaling configuration of
     * an Aurora Serverless V2 DB cluster.
     *
     * For more information, see
     * [Using Amazon Aurora Serverless v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.html)
     * in the *Amazon Aurora User Guide* .
     *
     * If you have an Aurora cluster, you must set the `ScalingConfigurationInfo` attribute before
     * you add a DB instance that uses the `db.serverless` DB instance class. For more information,
     * see
     * [Clusters that use Aurora Serverless v2 must have a capacity range specified](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html#aurora-serverless-v2.requirements.capacity-range)
     * in the *Amazon Aurora User Guide* .
     *
     * This property is only supported for Aurora Serverless v2. For Aurora Serverless v1, Use the
     * `ScalingConfiguration` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ServerlessV2ScalingConfigurationProperty serverlessV2ScalingConfigurationProperty =
     * ServerlessV2ScalingConfigurationProperty.builder()
     * .maxCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-serverlessv2scalingconfiguration.html)
     */
    public inline fun cfnDBClusterServerlessV2ScalingConfigurationProperty(
        block: CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDBCluster.ServerlessV2ScalingConfigurationProperty {
        val builder = CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBInstance` resource creates an Amazon DB instance.
     *
     * The new DB instance can be an RDS DB instance, or it can be a DB instance in an Aurora DB
     * cluster.
     *
     * For more information about creating an RDS DB instance, see
     * [Creating an Amazon RDS DB instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateDBInstance.html)
     * in the *Amazon RDS User Guide* .
     *
     * For more information about creating a DB instance in an Aurora DB cluster, see
     * [Creating an Amazon Aurora DB cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.CreateInstance.html)
     * in the *Amazon Aurora User Guide* .
     *
     * If you import an existing DB instance, and the template configuration doesn't match the
     * actual configuration of the DB instance, AWS CloudFormation applies the changes in the
     * template during the import operation.
     *
     * If a DB instance is deleted or replaced during an update, AWS CloudFormation deletes all
     * automated snapshots. However, it retains manual DB snapshots. During an update that requires
     * replacement, you can apply a stack policy to prevent DB instances from being replaced. For
     * more information, see
     * [Prevent Updates to Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html)
     * .
     *
     * *Updating DB instances*
     *
     * When properties labeled " *Update requires:*
     * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * " are updated, AWS CloudFormation first creates a replacement DB instance, then changes
     * references from other dependent resources to point to the replacement DB instance, and
     * finally deletes the old DB instance.
     *
     * We highly recommend that you take a snapshot of the database before updating the stack. If
     * you don't, you lose the data when AWS CloudFormation replaces your DB instance. To preserve
     * your data, perform the following procedure:
     * * Deactivate any applications that are using the DB instance so that there's no activity on
     *   the DB instance.
     * * Create a snapshot of the DB instance. For more information, see
     *   [Creating a DB Snapshot](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CreateSnapshot.html)
     *   .
     * * If you want to restore your instance using a DB snapshot, modify the updated template with
     *   your DB instance changes and add the `DBSnapshotIdentifier` property with the ID of the DB
     *   snapshot that you want to use.
     *
     * After you restore a DB instance with a `DBSnapshotIdentifier` property, you can delete the
     * `DBSnapshotIdentifier` property. When you specify this property for an update, the DB
     * instance is not restored from the DB snapshot again, and the data in the database is not
     * changed. However, if you don't specify the `DBSnapshotIdentifier` property, an empty DB
     * instance is created, and the original DB instance is deleted. If you specify a property that
     * is different from the previous snapshot restore property, a new DB instance is restored from
     * the specified `DBSnapshotIdentifier` property, and the original DB instance is deleted.
     * * Update the stack.
     *
     * For more information about updating other properties of this resource, see
     * `[ModifyDBInstance](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_ModifyDBInstance.html)`
     * . For more information about updating stacks, see
     * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * *Deleting DB instances*
     *
     * For DB instances that are part of an Aurora DB cluster, you can set a deletion policy for
     * your DB instance to control how AWS CloudFormation handles the DB instance when the stack is
     * deleted. For Amazon RDS DB instances, you can choose to *retain* the DB instance, to *delete*
     * the DB instance, or to *create a snapshot* of the DB instance. The default AWS CloudFormation
     * behavior depends on the `DBClusterIdentifier` property:
     * * For `AWS::RDS::DBInstance` resources that don't specify the `DBClusterIdentifier` property,
     *   AWS CloudFormation saves a snapshot of the DB instance.
     * * For `AWS::RDS::DBInstance` resources that do specify the `DBClusterIdentifier` property,
     *   AWS CloudFormation deletes the DB instance.
     *
     * For more information, see
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBInstance cfnDBInstance = CfnDBInstance.Builder.create(this, "MyCfnDBInstance")
     * .allocatedStorage("allocatedStorage")
     * .allowMajorVersionUpgrade(false)
     * .associatedRoles(List.of(DBInstanceRoleProperty.builder()
     * .featureName("featureName")
     * .roleArn("roleArn")
     * .build()))
     * .automaticBackupReplicationRegion("automaticBackupReplicationRegion")
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .backupRetentionPeriod(123)
     * .caCertificateIdentifier("caCertificateIdentifier")
     * .certificateDetails(CertificateDetailsProperty.builder()
     * .caIdentifier("caIdentifier")
     * .validTill("validTill")
     * .build())
     * .certificateRotationRestart(false)
     * .characterSetName("characterSetName")
     * .copyTagsToSnapshot(false)
     * .customIamInstanceProfile("customIamInstanceProfile")
     * .dbClusterIdentifier("dbClusterIdentifier")
     * .dbClusterSnapshotIdentifier("dbClusterSnapshotIdentifier")
     * .dbInstanceClass("dbInstanceClass")
     * .dbInstanceIdentifier("dbInstanceIdentifier")
     * .dbName("dbName")
     * .dbParameterGroupName("dbParameterGroupName")
     * .dbSecurityGroups(List.of("dbSecurityGroups"))
     * .dbSnapshotIdentifier("dbSnapshotIdentifier")
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .dedicatedLogVolume(false)
     * .deleteAutomatedBackups(false)
     * .deletionProtection(false)
     * .domain("domain")
     * .domainAuthSecretArn("domainAuthSecretArn")
     * .domainDnsIps(List.of("domainDnsIps"))
     * .domainFqdn("domainFqdn")
     * .domainIamRoleName("domainIamRoleName")
     * .domainOu("domainOu")
     * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
     * .enableIamDatabaseAuthentication(false)
     * .enablePerformanceInsights(false)
     * .endpoint(EndpointProperty.builder()
     * .address("address")
     * .hostedZoneId("hostedZoneId")
     * .port("port")
     * .build())
     * .engine("engine")
     * .engineVersion("engineVersion")
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .licenseModel("licenseModel")
     * .manageMasterUserPassword(false)
     * .masterUsername("masterUsername")
     * .masterUserPassword("masterUserPassword")
     * .masterUserSecret(MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build())
     * .maxAllocatedStorage(123)
     * .monitoringInterval(123)
     * .monitoringRoleArn("monitoringRoleArn")
     * .multiAz(false)
     * .ncharCharacterSetName("ncharCharacterSetName")
     * .networkType("networkType")
     * .optionGroupName("optionGroupName")
     * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
     * .performanceInsightsRetentionPeriod(123)
     * .port("port")
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .processorFeatures(List.of(ProcessorFeatureProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .promotionTier(123)
     * .publiclyAccessible(false)
     * .replicaMode("replicaMode")
     * .restoreTime("restoreTime")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .sourceDbInstanceAutomatedBackupsArn("sourceDbInstanceAutomatedBackupsArn")
     * .sourceDbInstanceIdentifier("sourceDbInstanceIdentifier")
     * .sourceDbiResourceId("sourceDbiResourceId")
     * .sourceRegion("sourceRegion")
     * .storageEncrypted(false)
     * .storageThroughput(123)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tdeCredentialArn("tdeCredentialArn")
     * .tdeCredentialPassword("tdeCredentialPassword")
     * .timezone("timezone")
     * .useDefaultProcessorFeatures(false)
     * .useLatestRestorableTime(false)
     * .vpcSecurityGroups(List.of("vpcSecurityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html)
     */
    public inline fun cfnDBInstance(
        scope: Construct,
        id: String,
        block: CfnDBInstanceDsl.() -> Unit = {},
    ): CfnDBInstance {
        val builder = CfnDBInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Returns the details of the DB instance’s server certificate.
     *
     * For more information, see
     * [Using SSL/TLS to encrypt a connection to a DB instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html)
     * in the *Amazon RDS User Guide* and
     * [Using SSL/TLS to encrypt a connection to a DB cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CertificateDetailsProperty certificateDetailsProperty = CertificateDetailsProperty.builder()
     * .caIdentifier("caIdentifier")
     * .validTill("validTill")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-certificatedetails.html)
     */
    public inline fun cfnDBInstanceCertificateDetailsProperty(
        block: CfnDBInstanceCertificateDetailsPropertyDsl.() -> Unit = {}
    ): CfnDBInstance.CertificateDetailsProperty {
        val builder = CfnDBInstanceCertificateDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an AWS Identity and Access Management (IAM) role that is associated with a
     * DB instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * DBInstanceRoleProperty dBInstanceRoleProperty = DBInstanceRoleProperty.builder()
     * .featureName("featureName")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html)
     */
    public inline fun cfnDBInstanceDBInstanceRoleProperty(
        block: CfnDBInstanceDBInstanceRolePropertyDsl.() -> Unit = {}
    ): CfnDBInstance.DBInstanceRoleProperty {
        val builder = CfnDBInstanceDBInstanceRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This data type represents the information you need to connect to an Amazon RDS DB instance.
     *
     * This data type is used as a response element in the following actions:
     * * `CreateDBInstance`
     * * `DescribeDBInstances`
     * * `DeleteDBInstance`
     *
     * For the data structure that represents Amazon Aurora DB cluster endpoints, see
     * `DBClusterEndpoint` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * EndpointProperty endpointProperty = EndpointProperty.builder()
     * .address("address")
     * .hostedZoneId("hostedZoneId")
     * .port("port")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html)
     */
    public inline fun cfnDBInstanceEndpointProperty(
        block: CfnDBInstanceEndpointPropertyDsl.() -> Unit = {}
    ): CfnDBInstance.EndpointProperty {
        val builder = CfnDBInstanceEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MasterUserSecret` return value specifies the secret managed by RDS in AWS Secrets
     * Manager for the master user password.
     *
     * For more information, see
     * [Password management with AWS Secrets Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html)
     * in the *Amazon RDS User Guide* and
     * [Password management with AWS Secrets Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html)
     * in the *Amazon Aurora User Guide.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * MasterUserSecretProperty masterUserSecretProperty = MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-masterusersecret.html)
     */
    public inline fun cfnDBInstanceMasterUserSecretProperty(
        block: CfnDBInstanceMasterUserSecretPropertyDsl.() -> Unit = {}
    ): CfnDBInstance.MasterUserSecretProperty {
        val builder = CfnDBInstanceMasterUserSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ProcessorFeature` property type specifies the processor features of a DB instance class
     * status.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ProcessorFeatureProperty processorFeatureProperty = ProcessorFeatureProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-processorfeature.html)
     */
    public inline fun cfnDBInstanceProcessorFeatureProperty(
        block: CfnDBInstanceProcessorFeaturePropertyDsl.() -> Unit = {}
    ): CfnDBInstance.ProcessorFeatureProperty {
        val builder = CfnDBInstanceProcessorFeaturePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
     * .allocatedStorage("allocatedStorage")
     * .allowMajorVersionUpgrade(false)
     * .associatedRoles(List.of(DBInstanceRoleProperty.builder()
     * .featureName("featureName")
     * .roleArn("roleArn")
     * .build()))
     * .automaticBackupReplicationRegion("automaticBackupReplicationRegion")
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .backupRetentionPeriod(123)
     * .caCertificateIdentifier("caCertificateIdentifier")
     * .certificateDetails(CertificateDetailsProperty.builder()
     * .caIdentifier("caIdentifier")
     * .validTill("validTill")
     * .build())
     * .certificateRotationRestart(false)
     * .characterSetName("characterSetName")
     * .copyTagsToSnapshot(false)
     * .customIamInstanceProfile("customIamInstanceProfile")
     * .dbClusterIdentifier("dbClusterIdentifier")
     * .dbClusterSnapshotIdentifier("dbClusterSnapshotIdentifier")
     * .dbInstanceClass("dbInstanceClass")
     * .dbInstanceIdentifier("dbInstanceIdentifier")
     * .dbName("dbName")
     * .dbParameterGroupName("dbParameterGroupName")
     * .dbSecurityGroups(List.of("dbSecurityGroups"))
     * .dbSnapshotIdentifier("dbSnapshotIdentifier")
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .dedicatedLogVolume(false)
     * .deleteAutomatedBackups(false)
     * .deletionProtection(false)
     * .domain("domain")
     * .domainAuthSecretArn("domainAuthSecretArn")
     * .domainDnsIps(List.of("domainDnsIps"))
     * .domainFqdn("domainFqdn")
     * .domainIamRoleName("domainIamRoleName")
     * .domainOu("domainOu")
     * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
     * .enableIamDatabaseAuthentication(false)
     * .enablePerformanceInsights(false)
     * .endpoint(EndpointProperty.builder()
     * .address("address")
     * .hostedZoneId("hostedZoneId")
     * .port("port")
     * .build())
     * .engine("engine")
     * .engineVersion("engineVersion")
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .licenseModel("licenseModel")
     * .manageMasterUserPassword(false)
     * .masterUsername("masterUsername")
     * .masterUserPassword("masterUserPassword")
     * .masterUserSecret(MasterUserSecretProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .secretArn("secretArn")
     * .build())
     * .maxAllocatedStorage(123)
     * .monitoringInterval(123)
     * .monitoringRoleArn("monitoringRoleArn")
     * .multiAz(false)
     * .ncharCharacterSetName("ncharCharacterSetName")
     * .networkType("networkType")
     * .optionGroupName("optionGroupName")
     * .performanceInsightsKmsKeyId("performanceInsightsKmsKeyId")
     * .performanceInsightsRetentionPeriod(123)
     * .port("port")
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .processorFeatures(List.of(ProcessorFeatureProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .promotionTier(123)
     * .publiclyAccessible(false)
     * .replicaMode("replicaMode")
     * .restoreTime("restoreTime")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .sourceDbInstanceAutomatedBackupsArn("sourceDbInstanceAutomatedBackupsArn")
     * .sourceDbInstanceIdentifier("sourceDbInstanceIdentifier")
     * .sourceDbiResourceId("sourceDbiResourceId")
     * .sourceRegion("sourceRegion")
     * .storageEncrypted(false)
     * .storageThroughput(123)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tdeCredentialArn("tdeCredentialArn")
     * .tdeCredentialPassword("tdeCredentialPassword")
     * .timezone("timezone")
     * .useDefaultProcessorFeatures(false)
     * .useLatestRestorableTime(false)
     * .vpcSecurityGroups(List.of("vpcSecurityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html)
     */
    public inline fun cfnDBInstanceProps(
        block: CfnDBInstancePropsDsl.() -> Unit = {}
    ): CfnDBInstanceProps {
        val builder = CfnDBInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBParameterGroup` resource creates a custom parameter group for an RDS
     * database family.
     *
     * This type can be declared in a template and referenced in the `DBParameterGroupName` property
     * of an
     * `[AWS::RDS::DBInstance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)`
     * resource.
     *
     * For information about configuring parameters for Amazon RDS DB instances, see
     * [Working with parameter groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* .
     *
     * For information about configuring parameters for Amazon Aurora DB instances, see
     * [Working with parameter groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Applying a parameter group to a DB instance may require the DB instance to reboot, resulting
     * in a database outage for the duration of the reboot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * Object parameters;
     * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
     * "MyCfnDBParameterGroup")
     * .description("description")
     * .family("family")
     * // the properties below are optional
     * .dbParameterGroupName("dbParameterGroupName")
     * .parameters(parameters)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html)
     */
    public inline fun cfnDBParameterGroup(
        scope: Construct,
        id: String,
        block: CfnDBParameterGroupDsl.() -> Unit = {},
    ): CfnDBParameterGroup {
        val builder = CfnDBParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBParameterGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * Object parameters;
     * CfnDBParameterGroupProps cfnDBParameterGroupProps = CfnDBParameterGroupProps.builder()
     * .description("description")
     * .family("family")
     * // the properties below are optional
     * .dbParameterGroupName("dbParameterGroupName")
     * .parameters(parameters)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html)
     */
    public inline fun cfnDBParameterGroupProps(
        block: CfnDBParameterGroupPropsDsl.() -> Unit = {}
    ): CfnDBParameterGroupProps {
        val builder = CfnDBParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBProxy` resource creates or updates a DB proxy.
     *
     * For information about RDS Proxy for Amazon RDS, see
     * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html)
     * in the *Amazon RDS User Guide* .
     *
     * For information about RDS Proxy for Amazon Aurora, see
     * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Limitations apply to RDS Proxy, including DB engine version limitations and AWS Region
     * limitations.
     *
     * For information about limitations that apply to RDS Proxy for Amazon RDS, see
     * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy.limitations)
     * in the *Amazon RDS User Guide* .
     *
     * For information about that apply to RDS Proxy for Amazon Aurora, see
     * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html#rds-proxy.limitations)
     * in the *Amazon Aurora User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxy cfnDBProxy = CfnDBProxy.Builder.create(this, "MyCfnDBProxy")
     * .auth(List.of(AuthFormatProperty.builder()
     * .authScheme("authScheme")
     * .clientPasswordAuthType("clientPasswordAuthType")
     * .description("description")
     * .iamAuth("iamAuth")
     * .secretArn("secretArn")
     * .build()))
     * .dbProxyName("dbProxyName")
     * .engineFamily("engineFamily")
     * .roleArn("roleArn")
     * .vpcSubnetIds(List.of("vpcSubnetIds"))
     * // the properties below are optional
     * .debugLogging(false)
     * .idleClientTimeout(123)
     * .requireTls(false)
     * .tags(List.of(TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html)
     */
    public inline fun cfnDBProxy(
        scope: Construct,
        id: String,
        block: CfnDBProxyDsl.() -> Unit = {},
    ): CfnDBProxy {
        val builder = CfnDBProxyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details of authentication used by a proxy to log in as a specific database
     * user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * AuthFormatProperty authFormatProperty = AuthFormatProperty.builder()
     * .authScheme("authScheme")
     * .clientPasswordAuthType("clientPasswordAuthType")
     * .description("description")
     * .iamAuth("iamAuth")
     * .secretArn("secretArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html)
     */
    public inline fun cfnDBProxyAuthFormatProperty(
        block: CfnDBProxyAuthFormatPropertyDsl.() -> Unit = {}
    ): CfnDBProxy.AuthFormatProperty {
        val builder = CfnDBProxyAuthFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBProxyEndpoint` resource creates or updates a DB proxy endpoint.
     *
     * You can use custom proxy endpoints to access a proxy through a different VPC than the proxy's
     * default VPC.
     *
     * For more information about RDS Proxy, see
     * [AWS::RDS::DBProxy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxyEndpoint cfnDBProxyEndpoint = CfnDBProxyEndpoint.Builder.create(this,
     * "MyCfnDBProxyEndpoint")
     * .dbProxyEndpointName("dbProxyEndpointName")
     * .dbProxyName("dbProxyName")
     * .vpcSubnetIds(List.of("vpcSubnetIds"))
     * // the properties below are optional
     * .tags(List.of(TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetRole("targetRole")
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html)
     */
    public inline fun cfnDBProxyEndpoint(
        scope: Construct,
        id: String,
        block: CfnDBProxyEndpointDsl.() -> Unit = {},
    ): CfnDBProxyEndpoint {
        val builder = CfnDBProxyEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBProxyEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxyEndpointProps cfnDBProxyEndpointProps = CfnDBProxyEndpointProps.builder()
     * .dbProxyEndpointName("dbProxyEndpointName")
     * .dbProxyName("dbProxyName")
     * .vpcSubnetIds(List.of("vpcSubnetIds"))
     * // the properties below are optional
     * .tags(List.of(TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetRole("targetRole")
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html)
     */
    public inline fun cfnDBProxyEndpointProps(
        block: CfnDBProxyEndpointPropsDsl.() -> Unit = {}
    ): CfnDBProxyEndpointProps {
        val builder = CfnDBProxyEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata assigned to a DB proxy endpoint consisting of a key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * TagFormatProperty tagFormatProperty = TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html)
     */
    public inline fun cfnDBProxyEndpointTagFormatProperty(
        block: CfnDBProxyEndpointTagFormatPropertyDsl.() -> Unit = {}
    ): CfnDBProxyEndpoint.TagFormatProperty {
        val builder = CfnDBProxyEndpointTagFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBProxy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxyProps cfnDBProxyProps = CfnDBProxyProps.builder()
     * .auth(List.of(AuthFormatProperty.builder()
     * .authScheme("authScheme")
     * .clientPasswordAuthType("clientPasswordAuthType")
     * .description("description")
     * .iamAuth("iamAuth")
     * .secretArn("secretArn")
     * .build()))
     * .dbProxyName("dbProxyName")
     * .engineFamily("engineFamily")
     * .roleArn("roleArn")
     * .vpcSubnetIds(List.of("vpcSubnetIds"))
     * // the properties below are optional
     * .debugLogging(false)
     * .idleClientTimeout(123)
     * .requireTls(false)
     * .tags(List.of(TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html)
     */
    public inline fun cfnDBProxyProps(block: CfnDBProxyPropsDsl.() -> Unit = {}): CfnDBProxyProps {
        val builder = CfnDBProxyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata assigned to a DB proxy consisting of a key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * TagFormatProperty tagFormatProperty = TagFormatProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-tagformat.html)
     */
    public inline fun cfnDBProxyTagFormatProperty(
        block: CfnDBProxyTagFormatPropertyDsl.() -> Unit = {}
    ): CfnDBProxy.TagFormatProperty {
        val builder = CfnDBProxyTagFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBProxyTargetGroup` resource represents a set of RDS DB instances, Aurora DB
     * clusters, or both that a proxy can connect to.
     *
     * Currently, each target group is associated with exactly one RDS DB instance or Aurora DB
     * cluster.
     *
     * This data type is used as a response element in the `DescribeDBProxyTargetGroups` action.
     *
     * For information about RDS Proxy for Amazon RDS, see
     * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html)
     * in the *Amazon RDS User Guide* .
     *
     * For information about RDS Proxy for Amazon Aurora, see
     * [Managing Connections with Amazon RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html)
     * in the *Amazon Aurora User Guide* .
     *
     * For a sample template that creates a DB proxy and registers a DB instance, see
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#aws-resource-rds-dbproxy--examples)
     * in AWS::RDS::DBProxy.
     *
     * Limitations apply to RDS Proxy, including DB engine version limitations and AWS Region
     * limitations.
     *
     * For information about limitations that apply to RDS Proxy for Amazon RDS, see
     * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy.limitations)
     * in the *Amazon RDS User Guide* .
     *
     * For information about that apply to RDS Proxy for Amazon Aurora, see
     * [Limitations for RDS Proxy](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-proxy.html#rds-proxy.limitations)
     * in the *Amazon Aurora User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxyTargetGroup cfnDBProxyTargetGroup = CfnDBProxyTargetGroup.Builder.create(this,
     * "MyCfnDBProxyTargetGroup")
     * .dbProxyName("dbProxyName")
     * .targetGroupName("targetGroupName")
     * // the properties below are optional
     * .connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty.builder()
     * .connectionBorrowTimeout(123)
     * .initQuery("initQuery")
     * .maxConnectionsPercent(123)
     * .maxIdleConnectionsPercent(123)
     * .sessionPinningFilters(List.of("sessionPinningFilters"))
     * .build())
     * .dbClusterIdentifiers(List.of("dbClusterIdentifiers"))
     * .dbInstanceIdentifiers(List.of("dbInstanceIdentifiers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html)
     */
    public inline fun cfnDBProxyTargetGroup(
        scope: Construct,
        id: String,
        block: CfnDBProxyTargetGroupDsl.() -> Unit = {},
    ): CfnDBProxyTargetGroup {
        val builder = CfnDBProxyTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the settings that control the size and behavior of the connection pool associated
     * with a `DBProxyTargetGroup` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ConnectionPoolConfigurationInfoFormatProperty connectionPoolConfigurationInfoFormatProperty =
     * ConnectionPoolConfigurationInfoFormatProperty.builder()
     * .connectionBorrowTimeout(123)
     * .initQuery("initQuery")
     * .maxConnectionsPercent(123)
     * .maxIdleConnectionsPercent(123)
     * .sessionPinningFilters(List.of("sessionPinningFilters"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html)
     */
    public inline fun cfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatProperty(
        block: CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl.() -> Unit = {}
    ): CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty {
        val builder = CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBProxyTargetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBProxyTargetGroupProps cfnDBProxyTargetGroupProps = CfnDBProxyTargetGroupProps.builder()
     * .dbProxyName("dbProxyName")
     * .targetGroupName("targetGroupName")
     * // the properties below are optional
     * .connectionPoolConfigurationInfo(ConnectionPoolConfigurationInfoFormatProperty.builder()
     * .connectionBorrowTimeout(123)
     * .initQuery("initQuery")
     * .maxConnectionsPercent(123)
     * .maxIdleConnectionsPercent(123)
     * .sessionPinningFilters(List.of("sessionPinningFilters"))
     * .build())
     * .dbClusterIdentifiers(List.of("dbClusterIdentifiers"))
     * .dbInstanceIdentifiers(List.of("dbInstanceIdentifiers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html)
     */
    public inline fun cfnDBProxyTargetGroupProps(
        block: CfnDBProxyTargetGroupPropsDsl.() -> Unit = {}
    ): CfnDBProxyTargetGroupProps {
        val builder = CfnDBProxyTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBSecurityGroup` resource creates or updates an Amazon RDS DB security group.
     *
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a
     * VPC, we recommend that you migrate as soon as possible. For more information, see
     * [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html)
     * in the *Amazon EC2 User Guide* , the blog
     * [EC2-Classic Networking is Retiring – Here’s How to Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/)
     * , and
     * [Moving a DB instance not in a VPC into a VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html)
     * in the *Amazon RDS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSecurityGroup cfnDBSecurityGroup = CfnDBSecurityGroup.Builder.create(this,
     * "MyCfnDBSecurityGroup")
     * .dbSecurityGroupIngress(List.of(IngressProperty.builder()
     * .cidrip("cidrip")
     * .ec2SecurityGroupId("ec2SecurityGroupId")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build()))
     * .groupDescription("groupDescription")
     * // the properties below are optional
     * .ec2VpcId("ec2VpcId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html)
     */
    public inline fun cfnDBSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnDBSecurityGroupDsl.() -> Unit = {},
    ): CfnDBSecurityGroup {
        val builder = CfnDBSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBSecurityGroupIngress` resource enables ingress to a DB security group using
     * one of two forms of authorization.
     *
     * First, you can add EC2 or VPC security groups to the DB security group if the application
     * using the database is running on EC2 or VPC instances. Second, IP ranges are available if the
     * application accessing your database is running on the Internet.
     *
     * This type supports updates. For more information about updating stacks, see
     * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
     * .
     *
     * For details about the settings for DB security group ingress, see
     * [AuthorizeDBSecurityGroupIngress](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_AuthorizeDBSecurityGroupIngress.html)
     * .
     *
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a
     * VPC, we recommend that you migrate as soon as possible. For more information, see
     * [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html)
     * in the *Amazon EC2 User Guide* , the blog
     * [EC2-Classic Networking is Retiring – Here’s How to Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/)
     * , and
     * [Moving a DB instance not in a VPC into a VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html)
     * in the *Amazon RDS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSecurityGroupIngress cfnDBSecurityGroupIngress =
     * CfnDBSecurityGroupIngress.Builder.create(this, "MyCfnDBSecurityGroupIngress")
     * .dbSecurityGroupName("dbSecurityGroupName")
     * // the properties below are optional
     * .cidrip("cidrip")
     * .ec2SecurityGroupId("ec2SecurityGroupId")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html)
     */
    public inline fun cfnDBSecurityGroupIngress(
        scope: Construct,
        id: String,
        block: CfnDBSecurityGroupIngressDsl.() -> Unit = {},
    ): CfnDBSecurityGroupIngress {
        val builder = CfnDBSecurityGroupIngressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Ingress` property type specifies an individual ingress rule within an
     * `AWS::RDS::DBSecurityGroup` resource.
     *
     * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a
     * VPC, we recommend that you migrate as soon as possible. For more information, see
     * [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html)
     * in the *Amazon EC2 User Guide* , the blog
     * [EC2-Classic Networking is Retiring – Here’s How to Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/)
     * , and
     * [Moving a DB instance not in a VPC into a VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html)
     * in the *Amazon RDS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * IngressProperty ingressProperty = IngressProperty.builder()
     * .cidrip("cidrip")
     * .ec2SecurityGroupId("ec2SecurityGroupId")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html)
     */
    public inline fun cfnDBSecurityGroupIngressProperty(
        block: CfnDBSecurityGroupIngressPropertyDsl.() -> Unit = {}
    ): CfnDBSecurityGroup.IngressProperty {
        val builder = CfnDBSecurityGroupIngressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBSecurityGroupIngress`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSecurityGroupIngressProps cfnDBSecurityGroupIngressProps =
     * CfnDBSecurityGroupIngressProps.builder()
     * .dbSecurityGroupName("dbSecurityGroupName")
     * // the properties below are optional
     * .cidrip("cidrip")
     * .ec2SecurityGroupId("ec2SecurityGroupId")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html)
     */
    public inline fun cfnDBSecurityGroupIngressProps(
        block: CfnDBSecurityGroupIngressPropsDsl.() -> Unit = {}
    ): CfnDBSecurityGroupIngressProps {
        val builder = CfnDBSecurityGroupIngressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBSecurityGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSecurityGroupProps cfnDBSecurityGroupProps = CfnDBSecurityGroupProps.builder()
     * .dbSecurityGroupIngress(List.of(IngressProperty.builder()
     * .cidrip("cidrip")
     * .ec2SecurityGroupId("ec2SecurityGroupId")
     * .ec2SecurityGroupName("ec2SecurityGroupName")
     * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
     * .build()))
     * .groupDescription("groupDescription")
     * // the properties below are optional
     * .ec2VpcId("ec2VpcId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html)
     */
    public inline fun cfnDBSecurityGroupProps(
        block: CfnDBSecurityGroupPropsDsl.() -> Unit = {}
    ): CfnDBSecurityGroupProps {
        val builder = CfnDBSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::DBSubnetGroup` resource creates a database subnet group.
     *
     * Subnet groups must contain at least two subnets in two different Availability Zones in the
     * same region.
     *
     * For more information, see
     * [Working with DB subnet groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Subnets)
     * in the *Amazon RDS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSubnetGroup cfnDBSubnetGroup = CfnDBSubnetGroup.Builder.create(this, "MyCfnDBSubnetGroup")
     * .dbSubnetGroupDescription("dbSubnetGroupDescription")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html)
     */
    public inline fun cfnDBSubnetGroup(
        scope: Construct,
        id: String,
        block: CfnDBSubnetGroupDsl.() -> Unit = {},
    ): CfnDBSubnetGroup {
        val builder = CfnDBSubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDBSubnetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnDBSubnetGroupProps cfnDBSubnetGroupProps = CfnDBSubnetGroupProps.builder()
     * .dbSubnetGroupDescription("dbSubnetGroupDescription")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .dbSubnetGroupName("dbSubnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html)
     */
    public inline fun cfnDBSubnetGroupProps(
        block: CfnDBSubnetGroupPropsDsl.() -> Unit = {}
    ): CfnDBSubnetGroupProps {
        val builder = CfnDBSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::EventSubscription` resource allows you to receive notifications for Amazon
     * Relational Database Service events through the Amazon Simple Notification Service (Amazon
     * SNS).
     *
     * For more information, see
     * [Using Amazon RDS Event Notification](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html)
     * in the *Amazon RDS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
     * "MyCfnEventSubscription")
     * .snsTopicArn("snsTopicArn")
     * // the properties below are optional
     * .enabled(false)
     * .eventCategories(List.of("eventCategories"))
     * .sourceIds(List.of("sourceIds"))
     * .sourceType("sourceType")
     * .subscriptionName("subscriptionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
     */
    public inline fun cfnEventSubscription(
        scope: Construct,
        id: String,
        block: CfnEventSubscriptionDsl.() -> Unit = {},
    ): CfnEventSubscription {
        val builder = CfnEventSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventSubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
     * .snsTopicArn("snsTopicArn")
     * // the properties below are optional
     * .enabled(false)
     * .eventCategories(List.of("eventCategories"))
     * .sourceIds(List.of("sourceIds"))
     * .sourceType("sourceType")
     * .subscriptionName("subscriptionName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
     */
    public inline fun cfnEventSubscriptionProps(
        block: CfnEventSubscriptionPropsDsl.() -> Unit = {}
    ): CfnEventSubscriptionProps {
        val builder = CfnEventSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::GlobalCluster` resource creates or updates an Amazon Aurora global database
     * spread across multiple AWS Regions.
     *
     * The global database contains a single primary cluster with read-write capability, and a
     * read-only secondary cluster that receives data from the primary cluster through high-speed
     * replication performed by the Aurora storage subsystem.
     *
     * You can create a global database that is initially empty, and then add a primary cluster and
     * a secondary cluster to it.
     *
     * For information about Aurora global databases, see
     * [Working with Amazon Aurora Global Databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)
     * in the *Amazon Aurora User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnGlobalCluster cfnGlobalCluster = CfnGlobalCluster.Builder.create(this, "MyCfnGlobalCluster")
     * .deletionProtection(false)
     * .engine("engine")
     * .engineVersion("engineVersion")
     * .globalClusterIdentifier("globalClusterIdentifier")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .storageEncrypted(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
     */
    public inline fun cfnGlobalCluster(
        scope: Construct,
        id: String,
        block: CfnGlobalClusterDsl.() -> Unit = {},
    ): CfnGlobalCluster {
        val builder = CfnGlobalClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGlobalCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnGlobalClusterProps cfnGlobalClusterProps = CfnGlobalClusterProps.builder()
     * .deletionProtection(false)
     * .engine("engine")
     * .engineVersion("engineVersion")
     * .globalClusterIdentifier("globalClusterIdentifier")
     * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
     * .storageEncrypted(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
     */
    public inline fun cfnGlobalClusterProps(
        block: CfnGlobalClusterPropsDsl.() -> Unit = {}
    ): CfnGlobalClusterProps {
        val builder = CfnGlobalClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A zero-ETL integration with Amazon Redshift.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
     * .sourceArn("sourceArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .integrationName("integrationName")
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html)
     */
    public inline fun cfnIntegration(
        scope: Construct,
        id: String,
        block: CfnIntegrationDsl.() -> Unit = {},
    ): CfnIntegration {
        val builder = CfnIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
     * .sourceArn("sourceArn")
     * .targetArn("targetArn")
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .integrationName("integrationName")
     * .kmsKeyId("kmsKeyId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html)
     */
    public inline fun cfnIntegrationProps(
        block: CfnIntegrationPropsDsl.() -> Unit = {}
    ): CfnIntegrationProps {
        val builder = CfnIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RDS::OptionGroup` resource creates or updates an option group, to enable and
     * configure features that are specific to a particular DB engine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnOptionGroup cfnOptionGroup = CfnOptionGroup.Builder.create(this, "MyCfnOptionGroup")
     * .engineName("engineName")
     * .majorEngineVersion("majorEngineVersion")
     * .optionGroupDescription("optionGroupDescription")
     * // the properties below are optional
     * .optionConfigurations(List.of(OptionConfigurationProperty.builder()
     * .optionName("optionName")
     * // the properties below are optional
     * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
     * .optionSettings(List.of(OptionSettingProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .optionVersion("optionVersion")
     * .port(123)
     * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
     * .build()))
     * .optionGroupName("optionGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
     */
    public inline fun cfnOptionGroup(
        scope: Construct,
        id: String,
        block: CfnOptionGroupDsl.() -> Unit = {},
    ): CfnOptionGroup {
        val builder = CfnOptionGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `OptionConfiguration` property type specifies an individual option, and its settings,
     * within an `AWS::RDS::OptionGroup` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OptionConfigurationProperty optionConfigurationProperty = OptionConfigurationProperty.builder()
     * .optionName("optionName")
     * // the properties below are optional
     * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
     * .optionSettings(List.of(OptionSettingProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .optionVersion("optionVersion")
     * .port(123)
     * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfiguration.html)
     */
    public inline fun cfnOptionGroupOptionConfigurationProperty(
        block: CfnOptionGroupOptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnOptionGroup.OptionConfigurationProperty {
        val builder = CfnOptionGroupOptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `OptionSetting` property type specifies the value for an option within an `OptionSetting`
     * property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OptionSettingProperty optionSettingProperty = OptionSettingProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionsetting.html)
     */
    public inline fun cfnOptionGroupOptionSettingProperty(
        block: CfnOptionGroupOptionSettingPropertyDsl.() -> Unit = {}
    ): CfnOptionGroup.OptionSettingProperty {
        val builder = CfnOptionGroupOptionSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOptionGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * CfnOptionGroupProps cfnOptionGroupProps = CfnOptionGroupProps.builder()
     * .engineName("engineName")
     * .majorEngineVersion("majorEngineVersion")
     * .optionGroupDescription("optionGroupDescription")
     * // the properties below are optional
     * .optionConfigurations(List.of(OptionConfigurationProperty.builder()
     * .optionName("optionName")
     * // the properties below are optional
     * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
     * .optionSettings(List.of(OptionSettingProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .optionVersion("optionVersion")
     * .port(123)
     * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
     * .build()))
     * .optionGroupName("optionGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
     */
    public inline fun cfnOptionGroupProps(
        block: CfnOptionGroupPropsDsl.() -> Unit = {}
    ): CfnOptionGroupProps {
        val builder = CfnOptionGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The extra options passed to the `IClusterEngine.bindToCluster` method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroup parameterGroup;
     * Role role;
     * ClusterEngineBindOptions clusterEngineBindOptions = ClusterEngineBindOptions.builder()
     * .parameterGroup(parameterGroup)
     * .s3ExportRole(role)
     * .s3ImportRole(role)
     * .build();
     * ```
     */
    public inline fun clusterEngineBindOptions(
        block: ClusterEngineBindOptionsDsl.() -> Unit = {}
    ): ClusterEngineBindOptions {
        val builder = ClusterEngineBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type returned from the `IClusterEngine.bindToCluster` method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroup parameterGroup;
     * ClusterEngineConfig clusterEngineConfig = ClusterEngineConfig.builder()
     * .features(ClusterEngineFeatures.builder()
     * .s3Export("s3Export")
     * .s3Import("s3Import")
     * .build())
     * .parameterGroup(parameterGroup)
     * .port(123)
     * .build();
     * ```
     */
    public inline fun clusterEngineConfig(
        block: ClusterEngineConfigDsl.() -> Unit = {}
    ): ClusterEngineConfig {
        val builder = ClusterEngineConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents Database Engine features.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ClusterEngineFeatures clusterEngineFeatures = ClusterEngineFeatures.builder()
     * .s3Export("s3Export")
     * .s3Import("s3Import")
     * .build();
     * ```
     */
    public inline fun clusterEngineFeatures(
        block: ClusterEngineFeaturesDsl.() -> Unit = {}
    ): ClusterEngineFeatures {
        val builder = ClusterEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for binding the instance to the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.rds.*;
     * Role role;
     * SubnetGroup subnetGroup;
     * ClusterInstanceBindOptions clusterInstanceBindOptions = ClusterInstanceBindOptions.builder()
     * .monitoringInterval(Duration.minutes(30))
     * .monitoringRole(role)
     * .promotionTier(123)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .subnetGroup(subnetGroup)
     * .build();
     * ```
     */
    public inline fun clusterInstanceBindOptions(
        block: ClusterInstanceBindOptionsDsl.() -> Unit = {}
    ): ClusterInstanceBindOptions {
        val builder = ClusterInstanceBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common options for creating a cluster instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.rds.*;
     * CaCertificate caCertificate;
     * Key key;
     * ParameterGroup parameterGroup;
     * ClusterInstanceOptions clusterInstanceOptions = ClusterInstanceOptions.builder()
     * .allowMajorVersionUpgrade(false)
     * .autoMinorVersionUpgrade(false)
     * .caCertificate(caCertificate)
     * .enablePerformanceInsights(false)
     * .instanceIdentifier("instanceIdentifier")
     * .isFromLegacyInstanceProps(false)
     * .parameterGroup(parameterGroup)
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .performanceInsightEncryptionKey(key)
     * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
     * .publiclyAccessible(false)
     * .build();
     * ```
     */
    public inline fun clusterInstanceOptions(
        block: ClusterInstanceOptionsDsl.() -> Unit = {}
    ): ClusterInstanceOptions {
        val builder = ClusterInstanceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common options for creating cluster instances (both serverless and provisioned).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.rds.*;
     * CaCertificate caCertificate;
     * ClusterInstanceType clusterInstanceType;
     * Key key;
     * ParameterGroup parameterGroup;
     * ClusterInstanceProps clusterInstanceProps = ClusterInstanceProps.builder()
     * .instanceType(clusterInstanceType)
     * // the properties below are optional
     * .allowMajorVersionUpgrade(false)
     * .autoMinorVersionUpgrade(false)
     * .caCertificate(caCertificate)
     * .enablePerformanceInsights(false)
     * .instanceIdentifier("instanceIdentifier")
     * .isFromLegacyInstanceProps(false)
     * .parameterGroup(parameterGroup)
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .performanceInsightEncryptionKey(key)
     * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
     * .promotionTier(123)
     * .publiclyAccessible(false)
     * .build();
     * ```
     */
    public inline fun clusterInstanceProps(
        block: ClusterInstancePropsDsl.() -> Unit = {}
    ): ClusterInstanceProps {
        val builder = ClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties common to single-user and multi-user rotation options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * InterfaceVpcEndpoint interfaceVpcEndpoint;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * CommonRotationUserOptions commonRotationUserOptions = CommonRotationUserOptions.builder()
     * .automaticallyAfter(Duration.minutes(30))
     * .endpoint(interfaceVpcEndpoint)
     * .excludeCharacters("excludeCharacters")
     * .rotateImmediatelyOnUpdate(false)
     * .securityGroup(securityGroup)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun commonRotationUserOptions(
        block: CommonRotationUserOptionsDsl.() -> Unit = {}
    ): CommonRotationUserOptions {
        val builder = CommonRotationUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base options for creating Credentials.
     *
     * Example:
     * ```
     * Vpc vpc;
     * IInstanceEngine engine =
     * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
     * Key myKey = new Key(this, "MyKey");
     * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
     * .engine(engine)
     * .vpc(vpc)
     * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
     * .secretName("my-cool-name")
     * .encryptionKey(myKey)
     * .excludeCharacters("!&amp;*^#&#64;()")
     * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
     * ReplicaRegion.builder().region("eu-west-2").build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun credentialsBaseOptions(
        block: CredentialsBaseOptionsDsl.() -> Unit = {}
    ): CredentialsBaseOptions {
        val builder = CredentialsBaseOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating Credentials from a username.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_2).build()))
     * .credentials(Credentials.fromUsername("adminuser",
     * CredentialsFromUsernameOptions.builder().password(SecretValue.unsafePlainText("7959866cacc02c2d243ecfe177464fe6")).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .publiclyAccessible(false)
     * .build()))
     * .readers(List.of(ClusterInstance.provisioned("reader")))
     * .storageType(DBClusterStorageType.AURORA_IOPT1)
     * .vpcSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build())
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun credentialsFromUsernameOptions(
        block: CredentialsFromUsernameOptionsDsl.() -> Unit = {}
    ): CredentialsFromUsernameOptions {
        val builder = CredentialsFromUsernameOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a clustered database with a given number of instances.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
     * .build()))
     * .serverlessV2MinCapacity(6.5)
     * .serverlessV2MaxCapacity(64)
     * .readers(List.of(ClusterInstance.serverlessV2("reader1",
     * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
     * ClusterInstance.serverlessV2("reader2")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseCluster(
        scope: Construct,
        id: String,
        block: DatabaseClusterDsl.() -> Unit = {},
    ): DatabaseCluster {
        val builder = DatabaseClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing cluster instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * IClusterEngine clusterEngine;
     * SecurityGroup securityGroup;
     * DatabaseClusterAttributes databaseClusterAttributes = DatabaseClusterAttributes.builder()
     * .clusterIdentifier("clusterIdentifier")
     * // the properties below are optional
     * .clusterEndpointAddress("clusterEndpointAddress")
     * .clusterResourceIdentifier("clusterResourceIdentifier")
     * .engine(clusterEngine)
     * .instanceEndpointAddresses(List.of("instanceEndpointAddresses"))
     * .instanceIdentifiers(List.of("instanceIdentifiers"))
     * .port(123)
     * .readerEndpointAddress("readerEndpointAddress")
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun databaseClusterAttributes(
        block: DatabaseClusterAttributesDsl.() -> Unit = {}
    ): DatabaseClusterAttributes {
        val builder = DatabaseClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A database cluster restored from a snapshot.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
     * .writer(ClusterInstance.provisioned("writer"))
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .build();
     * ```
     */
    public inline fun databaseClusterFromSnapshot(
        scope: Construct,
        id: String,
        block: DatabaseClusterFromSnapshotDsl.() -> Unit = {},
    ): DatabaseClusterFromSnapshot {
        val builder = DatabaseClusterFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `DatabaseClusterFromSnapshot`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
     * .writer(ClusterInstance.provisioned("writer"))
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .build();
     * ```
     */
    public inline fun databaseClusterFromSnapshotProps(
        block: DatabaseClusterFromSnapshotPropsDsl.() -> Unit = {}
    ): DatabaseClusterFromSnapshotProps {
        val builder = DatabaseClusterFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new database cluster.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
     * .build()))
     * .serverlessV2MinCapacity(6.5)
     * .serverlessV2MaxCapacity(64)
     * .readers(List.of(ClusterInstance.serverlessV2("reader1",
     * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
     * ClusterInstance.serverlessV2("reader2")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseClusterProps(
        block: DatabaseClusterPropsDsl.() -> Unit = {}
    ): DatabaseClusterProps {
        val builder = DatabaseClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A database instance.
     *
     * Example:
     * ```
     * IVpc vpc;
     * DatabaseInstance instance1 = DatabaseInstance.Builder.create(this, "PostgresInstance1")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * // Generate the secret with admin username `postgres` and random password
     * .credentials(Credentials.fromGeneratedSecret("postgres"))
     * .vpc(vpc)
     * .build();
     * // Templated secret with username and password fields
     * Secret templatedSecret = Secret.Builder.create(this, "TemplatedSecret")
     * .generateSecretString(SecretStringGenerator.builder()
     * .secretStringTemplate(JSON.stringify(Map.of("username", "postgres")))
     * .generateStringKey("password")
     * .excludeCharacters("/&#64;\"")
     * .build())
     * .build();
     * // Using the templated secret as credentials
     * DatabaseInstance instance2 = DatabaseInstance.Builder.create(this, "PostgresInstance2")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * .credentials(Map.of(
     * "username", templatedSecret.secretValueFromJson("username").toString(),
     * "password", templatedSecret.secretValueFromJson("password")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstance(
        scope: Construct,
        id: String,
        block: DatabaseInstanceDsl.() -> Unit = {},
    ): DatabaseInstance {
        val builder = DatabaseInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * IInstanceEngine instanceEngine;
     * SecurityGroup securityGroup;
     * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
     * .instanceEndpointAddress("instanceEndpointAddress")
     * .instanceIdentifier("instanceIdentifier")
     * .port(123)
     * .securityGroups(List.of(securityGroup))
     * // the properties below are optional
     * .engine(instanceEngine)
     * .instanceResourceId("instanceResourceId")
     * .build();
     * ```
     */
    public inline fun databaseInstanceAttributes(
        block: DatabaseInstanceAttributesDsl.() -> Unit = {}
    ): DatabaseInstanceAttributes {
        val builder = DatabaseInstanceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A database instance restored from a snapshot.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance sourceInstance;
     * DatabaseInstanceFromSnapshot.Builder.create(this, "Instance")
     * .snapshotIdentifier("my-snapshot")
     * .engine(DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build()))
     * // optional, defaults to m5.large
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * DatabaseInstanceReadReplica.Builder.create(this, "ReadReplica")
     * .sourceDatabaseInstance(sourceInstance)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstanceFromSnapshot(
        scope: Construct,
        id: String,
        block: DatabaseInstanceFromSnapshotDsl.() -> Unit = {},
    ): DatabaseInstanceFromSnapshot {
        val builder = DatabaseInstanceFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseInstanceFromSnapshot.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance sourceInstance;
     * DatabaseInstanceFromSnapshot.Builder.create(this, "Instance")
     * .snapshotIdentifier("my-snapshot")
     * .engine(DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build()))
     * // optional, defaults to m5.large
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * DatabaseInstanceReadReplica.Builder.create(this, "ReadReplica")
     * .sourceDatabaseInstance(sourceInstance)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstanceFromSnapshotProps(
        block: DatabaseInstanceFromSnapshotPropsDsl.() -> Unit = {}
    ): DatabaseInstanceFromSnapshotProps {
        val builder = DatabaseInstanceFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseInstanceNew.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.rds.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * CaCertificate caCertificate;
     * Key key;
     * OptionGroup optionGroup;
     * ParameterGroup parameterGroup;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * SubnetGroup subnetGroup;
     * Vpc vpc;
     * DatabaseInstanceNewProps databaseInstanceNewProps = DatabaseInstanceNewProps.builder()
     * .vpc(vpc)
     * // the properties below are optional
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .backupRetention(Duration.minutes(30))
     * .caCertificate(caCertificate)
     * .cloudwatchLogsExports(List.of("cloudwatchLogsExports"))
     * .cloudwatchLogsRetention(RetentionDays.ONE_DAY)
     * .cloudwatchLogsRetentionRole(role)
     * .copyTagsToSnapshot(false)
     * .deleteAutomatedBackups(false)
     * .deletionProtection(false)
     * .domain("domain")
     * .domainRole(role)
     * .enablePerformanceInsights(false)
     * .iamAuthentication(false)
     * .instanceIdentifier("instanceIdentifier")
     * .iops(123)
     * .maxAllocatedStorage(123)
     * .monitoringInterval(Duration.minutes(30))
     * .monitoringRole(role)
     * .multiAz(false)
     * .networkType(NetworkType.IPV4)
     * .optionGroup(optionGroup)
     * .parameterGroup(parameterGroup)
     * .performanceInsightEncryptionKey(key)
     * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
     * .port(123)
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .processorFeatures(ProcessorFeatures.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build())
     * .publiclyAccessible(false)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .s3ExportBuckets(List.of(bucket))
     * .s3ExportRole(role)
     * .s3ImportBuckets(List.of(bucket))
     * .s3ImportRole(role)
     * .securityGroups(List.of(securityGroup))
     * .storageThroughput(123)
     * .storageType(StorageType.STANDARD)
     * .subnetGroup(subnetGroup)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun databaseInstanceNewProps(
        block: DatabaseInstanceNewPropsDsl.() -> Unit = {}
    ): DatabaseInstanceNewProps {
        val builder = DatabaseInstanceNewPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseInstance.
     *
     * Example:
     * ```
     * IVpc vpc;
     * DatabaseInstance instance1 = DatabaseInstance.Builder.create(this, "PostgresInstance1")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * // Generate the secret with admin username `postgres` and random password
     * .credentials(Credentials.fromGeneratedSecret("postgres"))
     * .vpc(vpc)
     * .build();
     * // Templated secret with username and password fields
     * Secret templatedSecret = Secret.Builder.create(this, "TemplatedSecret")
     * .generateSecretString(SecretStringGenerator.builder()
     * .secretStringTemplate(JSON.stringify(Map.of("username", "postgres")))
     * .generateStringKey("password")
     * .excludeCharacters("/&#64;\"")
     * .build())
     * .build();
     * // Using the templated secret as credentials
     * DatabaseInstance instance2 = DatabaseInstance.Builder.create(this, "PostgresInstance2")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * .credentials(Map.of(
     * "username", templatedSecret.secretValueFromJson("username").toString(),
     * "password", templatedSecret.secretValueFromJson("password")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstanceProps(
        block: DatabaseInstancePropsDsl.() -> Unit = {}
    ): DatabaseInstanceProps {
        val builder = DatabaseInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A read replica database instance.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance sourceInstance;
     * DatabaseInstanceFromSnapshot.Builder.create(this, "Instance")
     * .snapshotIdentifier("my-snapshot")
     * .engine(DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build()))
     * // optional, defaults to m5.large
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * DatabaseInstanceReadReplica.Builder.create(this, "ReadReplica")
     * .sourceDatabaseInstance(sourceInstance)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstanceReadReplica(
        scope: Construct,
        id: String,
        block: DatabaseInstanceReadReplicaDsl.() -> Unit = {},
    ): DatabaseInstanceReadReplica {
        val builder = DatabaseInstanceReadReplicaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseInstanceReadReplica.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance sourceInstance;
     * DatabaseInstanceFromSnapshot.Builder.create(this, "Instance")
     * .snapshotIdentifier("my-snapshot")
     * .engine(DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build()))
     * // optional, defaults to m5.large
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * DatabaseInstanceReadReplica.Builder.create(this, "ReadReplica")
     * .sourceDatabaseInstance(sourceInstance)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.LARGE))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun databaseInstanceReadReplicaProps(
        block: DatabaseInstanceReadReplicaPropsDsl.() -> Unit = {}
    ): DatabaseInstanceReadReplicaProps {
        val builder = DatabaseInstanceReadReplicaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseInstanceSource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.rds.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * CaCertificate caCertificate;
     * IInstanceEngine instanceEngine;
     * InstanceType instanceType;
     * Key key;
     * OptionGroup optionGroup;
     * ParameterGroup parameterGroup;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * SubnetGroup subnetGroup;
     * Vpc vpc;
     * DatabaseInstanceSourceProps databaseInstanceSourceProps = DatabaseInstanceSourceProps.builder()
     * .engine(instanceEngine)
     * .vpc(vpc)
     * // the properties below are optional
     * .allocatedStorage(123)
     * .allowMajorVersionUpgrade(false)
     * .autoMinorVersionUpgrade(false)
     * .availabilityZone("availabilityZone")
     * .backupRetention(Duration.minutes(30))
     * .caCertificate(caCertificate)
     * .cloudwatchLogsExports(List.of("cloudwatchLogsExports"))
     * .cloudwatchLogsRetention(RetentionDays.ONE_DAY)
     * .cloudwatchLogsRetentionRole(role)
     * .copyTagsToSnapshot(false)
     * .databaseName("databaseName")
     * .deleteAutomatedBackups(false)
     * .deletionProtection(false)
     * .domain("domain")
     * .domainRole(role)
     * .enablePerformanceInsights(false)
     * .iamAuthentication(false)
     * .instanceIdentifier("instanceIdentifier")
     * .instanceType(instanceType)
     * .iops(123)
     * .licenseModel(LicenseModel.LICENSE_INCLUDED)
     * .maxAllocatedStorage(123)
     * .monitoringInterval(Duration.minutes(30))
     * .monitoringRole(role)
     * .multiAz(false)
     * .networkType(NetworkType.IPV4)
     * .optionGroup(optionGroup)
     * .parameterGroup(parameterGroup)
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .performanceInsightEncryptionKey(key)
     * .performanceInsightRetention(PerformanceInsightRetention.DEFAULT)
     * .port(123)
     * .preferredBackupWindow("preferredBackupWindow")
     * .preferredMaintenanceWindow("preferredMaintenanceWindow")
     * .processorFeatures(ProcessorFeatures.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build())
     * .publiclyAccessible(false)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .s3ExportBuckets(List.of(bucket))
     * .s3ExportRole(role)
     * .s3ImportBuckets(List.of(bucket))
     * .s3ImportRole(role)
     * .securityGroups(List.of(securityGroup))
     * .storageThroughput(123)
     * .storageType(StorageType.STANDARD)
     * .subnetGroup(subnetGroup)
     * .timezone("timezone")
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun databaseInstanceSourceProps(
        block: DatabaseInstanceSourcePropsDsl.() -> Unit = {}
    ): DatabaseInstanceSourceProps {
        val builder = DatabaseInstanceSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * RDS Database Proxy.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .writer(ClusterInstance.provisioned("writer"))
     * .vpc(vpc)
     * .build();
     * DatabaseProxy proxy = DatabaseProxy.Builder.create(this, "Proxy")
     * .proxyTarget(ProxyTarget.fromCluster(cluster))
     * .secrets(List.of(cluster.getSecret()))
     * .vpc(vpc)
     * .clientPasswordAuthType(ClientPasswordAuthType.MYSQL_NATIVE_PASSWORD)
     * .build();
     * ```
     */
    public inline fun databaseProxy(
        scope: Construct,
        id: String,
        block: DatabaseProxyDsl.() -> Unit = {},
    ): DatabaseProxy {
        val builder = DatabaseProxyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing DB Proxy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * SecurityGroup securityGroup;
     * DatabaseProxyAttributes databaseProxyAttributes = DatabaseProxyAttributes.builder()
     * .dbProxyArn("dbProxyArn")
     * .dbProxyName("dbProxyName")
     * .endpoint("endpoint")
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun databaseProxyAttributes(
        block: DatabaseProxyAttributesDsl.() -> Unit = {}
    ): DatabaseProxyAttributes {
        val builder = DatabaseProxyAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a new DatabaseProxy.
     *
     * Example:
     * ```
     * Vpc vpc;
     * SecurityGroup securityGroup;
     * Secret[] secrets;
     * DatabaseInstance dbInstance;
     * DatabaseProxy proxy = dbInstance.addProxy("proxy", DatabaseProxyOptions.builder()
     * .borrowTimeout(Duration.seconds(30))
     * .maxConnectionsPercent(50)
     * .secrets(secrets)
     * .vpc(vpc)
     * .build());
     * ```
     */
    public inline fun databaseProxyOptions(
        block: DatabaseProxyOptionsDsl.() -> Unit = {}
    ): DatabaseProxyOptions {
        val builder = DatabaseProxyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseProxy.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder()
     * .version(AuroraMysqlEngineVersion.VER_3_03_0)
     * .build()))
     * .writer(ClusterInstance.provisioned("writer"))
     * .vpc(vpc)
     * .build();
     * DatabaseProxy proxy = DatabaseProxy.Builder.create(this, "Proxy")
     * .proxyTarget(ProxyTarget.fromCluster(cluster))
     * .secrets(List.of(cluster.getSecret()))
     * .vpc(vpc)
     * .build();
     * Role role = Role.Builder.create(this, "DBProxyRole").assumedBy(new
     * AccountPrincipal(this.account)).build();
     * proxy.grantConnect(role, "admin");
     * ```
     */
    public inline fun databaseProxyProps(
        block: DatabaseProxyPropsDsl.() -> Unit = {}
    ): DatabaseProxyProps {
        val builder = DatabaseProxyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A database secret.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun databaseSecret(
        scope: Construct,
        id: String,
        block: DatabaseSecretDsl.() -> Unit = {},
    ): DatabaseSecret {
        val builder = DatabaseSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a DatabaseSecret.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun databaseSecretProps(
        block: DatabaseSecretPropsDsl.() -> Unit = {}
    ): DatabaseSecretProps {
        val builder = DatabaseSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A version of an engine - for either a cluster, or instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * EngineVersion engineVersion = EngineVersion.builder()
     * .majorVersion("majorVersion")
     * // the properties below are optional
     * .fullVersion("fullVersion")
     * .build();
     * ```
     */
    public inline fun engineVersion(block: EngineVersionDsl.() -> Unit = {}): EngineVersion {
        val builder = EngineVersionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options passed to `IInstanceEngine.bind`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.rds.*;
     * OptionGroup optionGroup;
     * Role role;
     * InstanceEngineBindOptions instanceEngineBindOptions = InstanceEngineBindOptions.builder()
     * .domain("domain")
     * .optionGroup(optionGroup)
     * .s3ExportRole(role)
     * .s3ImportRole(role)
     * .timezone("timezone")
     * .build();
     * ```
     */
    public inline fun instanceEngineBindOptions(
        block: InstanceEngineBindOptionsDsl.() -> Unit = {}
    ): InstanceEngineBindOptions {
        val builder = InstanceEngineBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type returned from the `IInstanceEngine.bind` method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OptionGroup optionGroup;
     * InstanceEngineConfig instanceEngineConfig = InstanceEngineConfig.builder()
     * .features(InstanceEngineFeatures.builder()
     * .s3Export("s3Export")
     * .s3Import("s3Import")
     * .build())
     * .optionGroup(optionGroup)
     * .build();
     * ```
     */
    public inline fun instanceEngineConfig(
        block: InstanceEngineConfigDsl.() -> Unit = {}
    ): InstanceEngineConfig {
        val builder = InstanceEngineConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents Database Engine features.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * InstanceEngineFeatures instanceEngineFeatures = InstanceEngineFeatures.builder()
     * .s3Export("s3Export")
     * .s3Import("s3Import")
     * .build();
     * ```
     */
    public inline fun instanceEngineFeatures(
        block: InstanceEngineFeaturesDsl.() -> Unit = {}
    ): InstanceEngineFeatures {
        val builder = InstanceEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instance properties for database instances.
     *
     * Example:
     * ```
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(stack, "Database")
     * .engine(DatabaseClusterEngine.AURORA)
     * .instanceProps(InstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .vpc(vpc)
     * .build())
     * .build();
     * cluster.addRotationSingleUser();
     * DatabaseCluster clusterWithCustomRotationOptions = DatabaseCluster.Builder.create(stack,
     * "CustomRotationOptions")
     * .engine(DatabaseClusterEngine.AURORA)
     * .instanceProps(InstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .vpc(vpc)
     * .build())
     * .build();
     * clusterWithCustomRotationOptions.addRotationSingleUser(RotationSingleUserOptions.builder()
     * .automaticallyAfter(Duration.days(7))
     * .excludeCharacters("!&#64;#$%^&amp;*")
     * .securityGroup(securityGroup)
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_WITH_EGRESS).build())
     * .endpoint(endpoint)
     * .build());
     * ```
     */
    public inline fun instanceProps(block: InstancePropsDsl.() -> Unit = {}): InstanceProps {
        val builder = InstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for MariaDB instance engines.
     *
     * Used in `DatabaseInstanceEngine.mariaDb`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * MariaDbEngineVersion mariaDbEngineVersion;
     * MariaDbInstanceEngineProps mariaDbInstanceEngineProps = MariaDbInstanceEngineProps.builder()
     * .version(mariaDbEngineVersion)
     * .build();
     * ```
     */
    public inline fun mariaDbInstanceEngineProps(
        block: MariaDbInstanceEnginePropsDsl.() -> Unit = {}
    ): MariaDbInstanceEngineProps {
        val builder = MariaDbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for MySQL instance engines.
     *
     * Used in `DatabaseInstanceEngine.mysql`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance iopsInstance = DatabaseInstance.Builder.create(this, "IopsInstance")
     * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
     * .vpc(vpc)
     * .storageType(StorageType.IO1)
     * .iops(5000)
     * .build();
     * DatabaseInstance gp3Instance = DatabaseInstance.Builder.create(this, "Gp3Instance")
     * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
     * .vpc(vpc)
     * .allocatedStorage(500)
     * .storageType(StorageType.GP3)
     * .storageThroughput(500)
     * .build();
     * ```
     */
    public inline fun mySqlInstanceEngineProps(
        block: MySqlInstanceEnginePropsDsl.() -> Unit = {}
    ): MySqlInstanceEngineProps {
        val builder = MySqlInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties for an option.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * SecurityGroup securityGroup;
     * Vpc vpc;
     * OptionConfiguration optionConfiguration = OptionConfiguration.builder()
     * .name("name")
     * // the properties below are optional
     * .port(123)
     * .securityGroups(List.of(securityGroup))
     * .settings(Map.of(
     * "settingsKey", "settings"))
     * .version("version")
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun optionConfiguration(
        block: OptionConfigurationDsl.() -> Unit = {}
    ): OptionConfiguration {
        val builder = OptionConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An option group.
     *
     * Example:
     * ```
     * // Set open cursors with parameter group
     * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .parameters(Map.of(
     * "open_cursors", "2500"))
     * .build();
     * OptionGroup optionGroup = OptionGroup.Builder.create(this, "OptionGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .configurations(List.of(OptionConfiguration.builder()
     * .name("LOCATOR")
     * .build(), OptionConfiguration.builder()
     * .name("OEM")
     * .port(1158)
     * .vpc(vpc)
     * .build()))
     * .build();
     * // Allow connections to OEM
     * optionGroup.optionConnections.OEM.connections.allowDefaultPortFromAnyIpv4();
     * // Database instance with production values
     * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .licenseModel(LicenseModel.BRING_YOUR_OWN_LICENSE)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.MEDIUM))
     * .multiAz(true)
     * .storageType(StorageType.IO1)
     * .credentials(Credentials.fromUsername("syscdk"))
     * .vpc(vpc)
     * .databaseName("ORCL")
     * .storageEncrypted(true)
     * .backupRetention(Duration.days(7))
     * .monitoringInterval(Duration.seconds(60))
     * .enablePerformanceInsights(true)
     * .cloudwatchLogsExports(List.of("trace", "audit", "alert", "listener"))
     * .cloudwatchLogsRetention(RetentionDays.ONE_MONTH)
     * .autoMinorVersionUpgrade(true) // required to be true if LOCATOR is used in the option group
     * .optionGroup(optionGroup)
     * .parameterGroup(parameterGroup)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * // Allow connections on default port from any IPV4
     * instance.connections.allowDefaultPortFromAnyIpv4();
     * // Rotate the master user password every 30 days
     * instance.addRotationSingleUser();
     * // Add alarm for high CPU
     * // Add alarm for high CPU
     * Alarm.Builder.create(this, "HighCPU")
     * .metric(instance.metricCPUUtilization())
     * .threshold(90)
     * .evaluationPeriods(1)
     * .build();
     * // Trigger Lambda function on instance availability events
     * Function fn = Function.Builder.create(this, "Function")
     * .code(Code.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * Rule availabilityRule = instance.onEvent("Availability", OnEventOptions.builder().target(new
     * LambdaFunction(fn)).build());
     * availabilityRule.addEventPattern(EventPattern.builder()
     * .detail(Map.of(
     * "EventCategories", List.of("availability")))
     * .build());
     * ```
     */
    public inline fun optionGroup(
        scope: Construct,
        id: String,
        block: OptionGroupDsl.() -> Unit = {},
    ): OptionGroup {
        val builder = OptionGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for an OptionGroup.
     *
     * Example:
     * ```
     * // Set open cursors with parameter group
     * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .parameters(Map.of(
     * "open_cursors", "2500"))
     * .build();
     * OptionGroup optionGroup = OptionGroup.Builder.create(this, "OptionGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .configurations(List.of(OptionConfiguration.builder()
     * .name("LOCATOR")
     * .build(), OptionConfiguration.builder()
     * .name("OEM")
     * .port(1158)
     * .vpc(vpc)
     * .build()))
     * .build();
     * // Allow connections to OEM
     * optionGroup.optionConnections.OEM.connections.allowDefaultPortFromAnyIpv4();
     * // Database instance with production values
     * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .licenseModel(LicenseModel.BRING_YOUR_OWN_LICENSE)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.MEDIUM))
     * .multiAz(true)
     * .storageType(StorageType.IO1)
     * .credentials(Credentials.fromUsername("syscdk"))
     * .vpc(vpc)
     * .databaseName("ORCL")
     * .storageEncrypted(true)
     * .backupRetention(Duration.days(7))
     * .monitoringInterval(Duration.seconds(60))
     * .enablePerformanceInsights(true)
     * .cloudwatchLogsExports(List.of("trace", "audit", "alert", "listener"))
     * .cloudwatchLogsRetention(RetentionDays.ONE_MONTH)
     * .autoMinorVersionUpgrade(true) // required to be true if LOCATOR is used in the option group
     * .optionGroup(optionGroup)
     * .parameterGroup(parameterGroup)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * // Allow connections on default port from any IPV4
     * instance.connections.allowDefaultPortFromAnyIpv4();
     * // Rotate the master user password every 30 days
     * instance.addRotationSingleUser();
     * // Add alarm for high CPU
     * // Add alarm for high CPU
     * Alarm.Builder.create(this, "HighCPU")
     * .metric(instance.metricCPUUtilization())
     * .threshold(90)
     * .evaluationPeriods(1)
     * .build();
     * // Trigger Lambda function on instance availability events
     * Function fn = Function.Builder.create(this, "Function")
     * .code(Code.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * Rule availabilityRule = instance.onEvent("Availability", OnEventOptions.builder().target(new
     * LambdaFunction(fn)).build());
     * availabilityRule.addEventPattern(EventPattern.builder()
     * .detail(Map.of(
     * "EventCategories", List.of("availability")))
     * .build());
     * ```
     */
    public inline fun optionGroupProps(
        block: OptionGroupPropsDsl.() -> Unit = {}
    ): OptionGroupProps {
        val builder = OptionGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for Oracle Enterprise Edition (CDB) instance engines.
     *
     * Used in `DatabaseInstanceEngine.oracleEeCdb`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OracleEngineVersion oracleEngineVersion;
     * OracleEeCdbInstanceEngineProps oracleEeCdbInstanceEngineProps =
     * OracleEeCdbInstanceEngineProps.builder()
     * .version(oracleEngineVersion)
     * .build();
     * ```
     */
    public inline fun oracleEeCdbInstanceEngineProps(
        block: OracleEeCdbInstanceEnginePropsDsl.() -> Unit = {}
    ): OracleEeCdbInstanceEngineProps {
        val builder = OracleEeCdbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for Oracle Enterprise Edition instance engines.
     *
     * Used in `DatabaseInstanceEngine.oracleEe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OracleEngineVersion oracleEngineVersion;
     * OracleEeInstanceEngineProps oracleEeInstanceEngineProps = OracleEeInstanceEngineProps.builder()
     * .version(oracleEngineVersion)
     * .build();
     * ```
     */
    public inline fun oracleEeInstanceEngineProps(
        block: OracleEeInstanceEnginePropsDsl.() -> Unit = {}
    ): OracleEeInstanceEngineProps {
        val builder = OracleEeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for Oracle Standard Edition 2 (CDB) instance engines.
     *
     * Used in `DatabaseInstanceEngine.oracleSe2Cdb`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * OracleEngineVersion oracleEngineVersion;
     * OracleSe2CdbInstanceEngineProps oracleSe2CdbInstanceEngineProps =
     * OracleSe2CdbInstanceEngineProps.builder()
     * .version(oracleEngineVersion)
     * .build();
     * ```
     */
    public inline fun oracleSe2CdbInstanceEngineProps(
        block: OracleSe2CdbInstanceEnginePropsDsl.() -> Unit = {}
    ): OracleSe2CdbInstanceEngineProps {
        val builder = OracleSe2CdbInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for Oracle Standard Edition 2 instance engines.
     *
     * Used in `DatabaseInstanceEngine.oracleSe2`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * // optional, defaults to m5.large
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
     * .credentials(Credentials.fromGeneratedSecret("syscdk")) // Optional - will default to 'admin'
     * username and generated password
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
     * .build())
     * .build();
     * ```
     */
    public inline fun oracleSe2InstanceEngineProps(
        block: OracleSe2InstanceEnginePropsDsl.() -> Unit = {}
    ): OracleSe2InstanceEngineProps {
        val builder = OracleSe2InstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A parameter group.
     *
     * Represents both a cluster parameter group, and an instance parameter group.
     *
     * Example:
     * ```
     * BackupPlan plan;
     * Vpc vpc;
     * ITable myTable = Table.fromTableName(this, "Table", "myTableName");
     * DatabaseInstance myDatabaseInstance = DatabaseInstance.Builder.create(this, "DatabaseInstance")
     * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_26).build()))
     * .vpc(vpc)
     * .build();
     * DatabaseCluster myDatabaseCluster = DatabaseCluster.Builder.create(this, "DatabaseCluster")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
     * .credentials(Credentials.fromGeneratedSecret("clusteradmin"))
     * .instanceProps(InstanceProps.builder()
     * .vpc(vpc)
     * .build())
     * .build();
     * ServerlessCluster myServerlessCluster = ServerlessCluster.Builder.create(this,
     * "ServerlessCluster")
     * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
     * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
     * "default.aurora-postgresql11"))
     * .vpc(vpc)
     * .build();
     * Construct myCoolConstruct = new Construct(this, "MyCoolConstruct");
     * plan.addSelection("Selection", BackupSelectionOptions.builder()
     * .resources(List.of(BackupResource.fromDynamoDbTable(myTable),
     * BackupResource.fromRdsDatabaseInstance(myDatabaseInstance),
     * BackupResource.fromRdsDatabaseCluster(myDatabaseCluster),
     * BackupResource.fromRdsServerlessCluster(myServerlessCluster), BackupResource.fromTag("stage",
     * "prod"), BackupResource.fromConstruct(myCoolConstruct)))
     * .build());
     * ```
     */
    public inline fun parameterGroup(
        scope: Construct,
        id: String,
        block: ParameterGroupDsl.() -> Unit = {},
    ): ParameterGroup {
        val builder = ParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `IParameterGroup.bindToCluster`. Empty for now, but can be extended later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroupClusterBindOptions parameterGroupClusterBindOptions =
     * ParameterGroupClusterBindOptions.builder().build();
     * ```
     */
    public inline fun parameterGroupClusterBindOptions(
        block: ParameterGroupClusterBindOptionsDsl.() -> Unit = {}
    ): ParameterGroupClusterBindOptions {
        val builder = ParameterGroupClusterBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type returned from `IParameterGroup.bindToCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroupClusterConfig parameterGroupClusterConfig = ParameterGroupClusterConfig.builder()
     * .parameterGroupName("parameterGroupName")
     * .build();
     * ```
     */
    public inline fun parameterGroupClusterConfig(
        block: ParameterGroupClusterConfigDsl.() -> Unit = {}
    ): ParameterGroupClusterConfig {
        val builder = ParameterGroupClusterConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `IParameterGroup.bindToInstance`. Empty for now, but can be extended later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroupInstanceBindOptions parameterGroupInstanceBindOptions =
     * ParameterGroupInstanceBindOptions.builder().build();
     * ```
     */
    public inline fun parameterGroupInstanceBindOptions(
        block: ParameterGroupInstanceBindOptionsDsl.() -> Unit = {}
    ): ParameterGroupInstanceBindOptions {
        val builder = ParameterGroupInstanceBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type returned from `IParameterGroup.bindToInstance`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ParameterGroupInstanceConfig parameterGroupInstanceConfig =
     * ParameterGroupInstanceConfig.builder()
     * .parameterGroupName("parameterGroupName")
     * .build();
     * ```
     */
    public inline fun parameterGroupInstanceConfig(
        block: ParameterGroupInstanceConfigDsl.() -> Unit = {}
    ): ParameterGroupInstanceConfig {
        val builder = ParameterGroupInstanceConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a parameter group.
     *
     * Example:
     * ```
     * // Set open cursors with parameter group
     * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .parameters(Map.of(
     * "open_cursors", "2500"))
     * .build();
     * OptionGroup optionGroup = OptionGroup.Builder.create(this, "OptionGroup")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .configurations(List.of(OptionConfiguration.builder()
     * .name("LOCATOR")
     * .build(), OptionConfiguration.builder()
     * .name("OEM")
     * .port(1158)
     * .vpc(vpc)
     * .build()))
     * .build();
     * // Allow connections to OEM
     * optionGroup.optionConnections.OEM.connections.allowDefaultPortFromAnyIpv4();
     * // Database instance with production values
     * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
     * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
     * .licenseModel(LicenseModel.BRING_YOUR_OWN_LICENSE)
     * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.MEDIUM))
     * .multiAz(true)
     * .storageType(StorageType.IO1)
     * .credentials(Credentials.fromUsername("syscdk"))
     * .vpc(vpc)
     * .databaseName("ORCL")
     * .storageEncrypted(true)
     * .backupRetention(Duration.days(7))
     * .monitoringInterval(Duration.seconds(60))
     * .enablePerformanceInsights(true)
     * .cloudwatchLogsExports(List.of("trace", "audit", "alert", "listener"))
     * .cloudwatchLogsRetention(RetentionDays.ONE_MONTH)
     * .autoMinorVersionUpgrade(true) // required to be true if LOCATOR is used in the option group
     * .optionGroup(optionGroup)
     * .parameterGroup(parameterGroup)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .build();
     * // Allow connections on default port from any IPV4
     * instance.connections.allowDefaultPortFromAnyIpv4();
     * // Rotate the master user password every 30 days
     * instance.addRotationSingleUser();
     * // Add alarm for high CPU
     * // Add alarm for high CPU
     * Alarm.Builder.create(this, "HighCPU")
     * .metric(instance.metricCPUUtilization())
     * .threshold(90)
     * .evaluationPeriods(1)
     * .build();
     * // Trigger Lambda function on instance availability events
     * Function fn = Function.Builder.create(this, "Function")
     * .code(Code.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * Rule availabilityRule = instance.onEvent("Availability", OnEventOptions.builder().target(new
     * LambdaFunction(fn)).build());
     * availabilityRule.addEventPattern(EventPattern.builder()
     * .detail(Map.of(
     * "EventCategories", List.of("availability")))
     * .build());
     * ```
     */
    public inline fun parameterGroupProps(
        block: ParameterGroupPropsDsl.() -> Unit = {}
    ): ParameterGroupProps {
        val builder = ParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Features supported by the Postgres database engine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * PostgresEngineFeatures postgresEngineFeatures = PostgresEngineFeatures.builder()
     * .s3Export(false)
     * .s3Import(false)
     * .build();
     * ```
     */
    public inline fun postgresEngineFeatures(
        block: PostgresEngineFeaturesDsl.() -> Unit = {}
    ): PostgresEngineFeatures {
        val builder = PostgresEngineFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for PostgreSQL instance engines.
     *
     * Used in `DatabaseInstanceEngine.postgres`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * IInstanceEngine engine =
     * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
     * Key myKey = new Key(this, "MyKey");
     * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
     * .engine(engine)
     * .vpc(vpc)
     * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
     * .secretName("my-cool-name")
     * .encryptionKey(myKey)
     * .excludeCharacters("!&amp;*^#&#64;()")
     * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
     * ReplicaRegion.builder().region("eu-west-2").build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun postgresInstanceEngineProps(
        block: PostgresInstanceEnginePropsDsl.() -> Unit = {}
    ): PostgresInstanceEngineProps {
        val builder = PostgresInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The processor features.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * ProcessorFeatures processorFeatures = ProcessorFeatures.builder()
     * .coreCount(123)
     * .threadsPerCore(123)
     * .build();
     * ```
     */
    public inline fun processorFeatures(
        block: ProcessorFeaturesDsl.() -> Unit = {}
    ): ProcessorFeatures {
        val builder = ProcessorFeaturesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a provisioned instance.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
     * .build()))
     * .serverlessV2MinCapacity(6.5)
     * .serverlessV2MaxCapacity(64)
     * .readers(List.of(ClusterInstance.serverlessV2("reader1",
     * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
     * ClusterInstance.serverlessV2("reader2")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun provisionedClusterInstanceProps(
        block: ProvisionedClusterInstancePropsDsl.() -> Unit = {}
    ): ProvisionedClusterInstanceProps {
        val builder = ProvisionedClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The result of binding a `ProxyTarget` to a `DatabaseProxy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * DatabaseCluster databaseCluster;
     * DatabaseInstance databaseInstance;
     * ProxyTargetConfig proxyTargetConfig = ProxyTargetConfig.builder()
     * .engineFamily("engineFamily")
     * // the properties below are optional
     * .dbClusters(List.of(databaseCluster))
     * .dbInstances(List.of(databaseInstance))
     * .build();
     * ```
     */
    public inline fun proxyTargetConfig(
        block: ProxyTargetConfigDsl.() -> Unit = {}
    ): ProxyTargetConfig {
        val builder = ProxyTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add the multi user rotation.
     *
     * Example:
     * ```
     * DatabaseInstance instance;
     * DatabaseSecret myImportedSecret;
     * instance.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
     * .secret(myImportedSecret)
     * .build());
     * ```
     */
    public inline fun rotationMultiUserOptions(
        block: RotationMultiUserOptionsDsl.() -> Unit = {}
    ): RotationMultiUserOptions {
        val builder = RotationMultiUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add the multi user rotation.
     *
     * Example:
     * ```
     * DatabaseInstance instance;
     * SecurityGroup mySecurityGroup;
     * instance.addRotationSingleUser(RotationSingleUserOptions.builder()
     * .automaticallyAfter(Duration.days(7)) // defaults to 30 days
     * .excludeCharacters("!&#64;#$%^&amp;*") // defaults to the set " %+~`#///
     * here*()|[]{}:;&lt;&gt;?!'/&#64;\"\\"
     * .securityGroup(mySecurityGroup) // defaults to an auto-created security group
     * .rotateImmediatelyOnUpdate(false)
     * .build());
     * ```
     */
    public inline fun rotationSingleUserOptions(
        block: RotationSingleUserOptionsDsl.() -> Unit = {}
    ): RotationSingleUserOptions {
        val builder = RotationSingleUserOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create an Aurora Serverless Cluster.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun serverlessCluster(
        scope: Construct,
        id: String,
        block: ServerlessClusterDsl.() -> Unit = {},
    ): ServerlessCluster {
        val builder = ServerlessClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing cluster instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * SecurityGroup securityGroup;
     * ServerlessClusterAttributes serverlessClusterAttributes = ServerlessClusterAttributes.builder()
     * .clusterIdentifier("clusterIdentifier")
     * // the properties below are optional
     * .clusterEndpointAddress("clusterEndpointAddress")
     * .port(123)
     * .readerEndpointAddress("readerEndpointAddress")
     * .secret(secret)
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun serverlessClusterAttributes(
        block: ServerlessClusterAttributesDsl.() -> Unit = {}
    ): ServerlessClusterAttributes {
        val builder = ServerlessClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Aurora Serverless Cluster restored from a snapshot.
     *
     * Example:
     * ```
     * Vpc vpc;
     * ServerlessClusterFromSnapshot.Builder.create(this, "Cluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .build();
     * ```
     */
    public inline fun serverlessClusterFromSnapshot(
        scope: Construct,
        id: String,
        block: ServerlessClusterFromSnapshotDsl.() -> Unit = {},
    ): ServerlessClusterFromSnapshot {
        val builder = ServerlessClusterFromSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `ServerlessClusterFromSnapshot`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * ServerlessClusterFromSnapshot.Builder.create(this, "Cluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .build();
     * ```
     */
    public inline fun serverlessClusterFromSnapshotProps(
        block: ServerlessClusterFromSnapshotPropsDsl.() -> Unit = {}
    ): ServerlessClusterFromSnapshotProps {
        val builder = ServerlessClusterFromSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a new Aurora Serverless Cluster.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun serverlessClusterProps(
        block: ServerlessClusterPropsDsl.() -> Unit = {}
    ): ServerlessClusterProps {
        val builder = ServerlessClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring scaling on an Aurora Serverless cluster.
     *
     * Example:
     * ```
     * Vpc vpc;
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AnotherCluster")
     * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
     * .copyTagsToSnapshot(true) // whether to save the cluster tags when creating the snapshot.
     * Default is 'true'
     * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
     * "default.aurora-postgresql11"))
     * .vpc(vpc)
     * .scaling(ServerlessScalingOptions.builder()
     * .autoPause(Duration.minutes(10)) // default is to pause after 5 minutes of idle time
     * .minCapacity(AuroraCapacityUnit.ACU_8) // default is 2 Aurora capacity units (ACUs)
     * .maxCapacity(AuroraCapacityUnit.ACU_32) // default is 16 Aurora capacity units (ACUs)
     * .timeout(Duration.seconds(100)) // default is 5 minutes
     * .timeoutAction(TimeoutAction.FORCE_APPLY_CAPACITY_CHANGE)
     * .build())
     * .build();
     * ```
     */
    public inline fun serverlessScalingOptions(
        block: ServerlessScalingOptionsDsl.() -> Unit = {}
    ): ServerlessScalingOptions {
        val builder = ServerlessScalingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a serverless v2 instance.
     *
     * Example:
     * ```
     * Vpc vpc;
     * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
     * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
     * .caCertificate(CaCertificate.RDS_CA_RDS2048_G1)
     * .build()))
     * .readers(List.of(ClusterInstance.serverlessV2("reader",
     * ServerlessV2ClusterInstanceProps.builder()
     * .caCertificate(CaCertificate.of("custom-ca"))
     * .build())))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun serverlessV2ClusterInstanceProps(
        block: ServerlessV2ClusterInstancePropsDsl.() -> Unit = {}
    ): ServerlessV2ClusterInstanceProps {
        val builder = ServerlessV2ClusterInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options used in the `SnapshotCredentials.fromGeneratedPassword` method.
     *
     * Example:
     * ```
     * Vpc vpc;
     * IInstanceEngine engine =
     * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
     * Key myKey = new Key(this, "MyKey");
     * DatabaseInstanceFromSnapshot.Builder.create(this, "InstanceFromSnapshotWithCustomizedSecret")
     * .engine(engine)
     * .vpc(vpc)
     * .snapshotIdentifier("mySnapshot")
     * .credentials(SnapshotCredentials.fromGeneratedSecret("username",
     * SnapshotCredentialsFromGeneratedPasswordOptions.builder()
     * .encryptionKey(myKey)
     * .excludeCharacters("!&amp;*^#&#64;()")
     * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
     * ReplicaRegion.builder().region("eu-west-2").build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun snapshotCredentialsFromGeneratedPasswordOptions(
        block: SnapshotCredentialsFromGeneratedPasswordOptionsDsl.() -> Unit = {}
    ): SnapshotCredentialsFromGeneratedPasswordOptions {
        val builder = SnapshotCredentialsFromGeneratedPasswordOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SQL Server Enterprise Edition instance engines.
     *
     * Used in `DatabaseInstanceEngine.sqlServerEe`.
     *
     * Example:
     * ```
     * Vpc vpc;
     * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
     * .engine(DatabaseInstanceEngine.sqlServerEe(SqlServerEeInstanceEngineProps.builder()
     * .version(SqlServerEngineVersion.VER_11)
     * .build()))
     * .parameters(Map.of(
     * "locks", "100"))
     * .build();
     * DatabaseInstance.Builder.create(this, "Database")
     * .engine(DatabaseInstanceEngine.SQL_SERVER_EE)
     * .vpc(vpc)
     * .parameterGroup(parameterGroup)
     * .build();
     * ```
     */
    public inline fun sqlServerEeInstanceEngineProps(
        block: SqlServerEeInstanceEnginePropsDsl.() -> Unit = {}
    ): SqlServerEeInstanceEngineProps {
        val builder = SqlServerEeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SQL Server Express Edition instance engines.
     *
     * Used in `DatabaseInstanceEngine.sqlServerEx`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * SqlServerEngineVersion sqlServerEngineVersion;
     * SqlServerExInstanceEngineProps sqlServerExInstanceEngineProps =
     * SqlServerExInstanceEngineProps.builder()
     * .version(sqlServerEngineVersion)
     * .build();
     * ```
     */
    public inline fun sqlServerExInstanceEngineProps(
        block: SqlServerExInstanceEnginePropsDsl.() -> Unit = {}
    ): SqlServerExInstanceEngineProps {
        val builder = SqlServerExInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SQL Server Standard Edition instance engines.
     *
     * Used in `DatabaseInstanceEngine.sqlServerSe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * SqlServerEngineVersion sqlServerEngineVersion;
     * SqlServerSeInstanceEngineProps sqlServerSeInstanceEngineProps =
     * SqlServerSeInstanceEngineProps.builder()
     * .version(sqlServerEngineVersion)
     * .build();
     * ```
     */
    public inline fun sqlServerSeInstanceEngineProps(
        block: SqlServerSeInstanceEnginePropsDsl.() -> Unit = {}
    ): SqlServerSeInstanceEngineProps {
        val builder = SqlServerSeInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SQL Server Web Edition instance engines.
     *
     * Used in `DatabaseInstanceEngine.sqlServerWeb`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rds.*;
     * SqlServerEngineVersion sqlServerEngineVersion;
     * SqlServerWebInstanceEngineProps sqlServerWebInstanceEngineProps =
     * SqlServerWebInstanceEngineProps.builder()
     * .version(sqlServerEngineVersion)
     * .build();
     * ```
     */
    public inline fun sqlServerWebInstanceEngineProps(
        block: SqlServerWebInstanceEnginePropsDsl.() -> Unit = {}
    ): SqlServerWebInstanceEngineProps {
        val builder = SqlServerWebInstanceEnginePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class for creating a RDS DB subnet group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * SubnetGroup subnetGroup = SubnetGroup.Builder.create(this, "MySubnetGroup")
     * .description("description")
     * .vpc(vpc)
     * // the properties below are optional
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .subnetGroupName("subnetGroupName")
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun subnetGroup(
        scope: Construct,
        id: String,
        block: SubnetGroupDsl.() -> Unit = {},
    ): SubnetGroup {
        val builder = SubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a SubnetGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.rds.*;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * SubnetGroupProps subnetGroupProps = SubnetGroupProps.builder()
     * .description("description")
     * .vpc(vpc)
     * // the properties below are optional
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .subnetGroupName("subnetGroupName")
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun subnetGroupProps(
        block: SubnetGroupPropsDsl.() -> Unit = {}
    ): SubnetGroupProps {
        val builder = SubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
