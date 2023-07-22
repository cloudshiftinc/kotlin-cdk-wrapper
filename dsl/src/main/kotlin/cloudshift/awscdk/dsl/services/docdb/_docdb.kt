@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.BackupProps
import software.amazon.awscdk.services.docdb.CfnDBCluster
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.docdb.CfnDBClusterProps
import software.amazon.awscdk.services.docdb.CfnDBInstance
import software.amazon.awscdk.services.docdb.CfnDBInstanceProps
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroup
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps
import software.amazon.awscdk.services.docdb.ClusterParameterGroup
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.docdb.DatabaseClusterAttributes
import software.amazon.awscdk.services.docdb.DatabaseClusterProps
import software.amazon.awscdk.services.docdb.DatabaseInstance
import software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes
import software.amazon.awscdk.services.docdb.DatabaseInstanceProps
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.docdb.DatabaseSecretProps
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.docdb.RotationMultiUserOptions
import software.constructs.Construct

public object docdb {
  /**
   * Backup configuration for DocumentDB databases.
   *
   * Default: - The retention period for automated backups is 1 day.
   * The preferred backup window will be a 30-minute window selected at random
   * from an 8-hour block of time for each AWS Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.docdb.*;
   * BackupProps backupProps = BackupProps.builder()
   * .retention(Duration.minutes(30))
   * // the properties below are optional
   * .preferredWindow("preferredWindow")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/backup-restore.db-cluster-snapshots.html#backup-restore.backup-window)
   */
  public inline fun backupProps(block: BackupPropsDsl.() -> Unit = {}): BackupProps {
    val builder = BackupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::DocDB::DBCluster` Amazon DocumentDB (with MongoDB compatibility) resource describes a
   * DBCluster.
   *
   * Amazon DocumentDB is a fully managed, MongoDB-compatible document database engine. For more
   * information, see
   * [DBCluster](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBCluster.html) in
   * the *Amazon DocumentDB Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
   * .availabilityZones(List.of("availabilityZones"))
   * .backupRetentionPeriod(123)
   * .copyTagsToSnapshot(false)
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .deletionProtection(false)
   * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
   * .engineVersion("engineVersion")
   * .kmsKeyId("kmsKeyId")
   * .masterUsername("masterUsername")
   * .masterUserPassword("masterUserPassword")
   * .port(123)
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .restoreToTime("restoreToTime")
   * .restoreType("restoreType")
   * .snapshotIdentifier("snapshotIdentifier")
   * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
   * .storageEncrypted(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .useLatestRestorableTime(false)
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html)
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
   * The `AWS::DocDB::DBClusterParameterGroup` Amazon DocumentDB (with MongoDB compatibility)
   * resource describes a DBClusterParameterGroup.
   *
   * For more information, see
   * [DBClusterParameterGroup](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBClusterParameterGroup.html)
   * in the *Amazon DocumentDB Developer Guide* .
   *
   * Parameters in a cluster parameter group apply to all of the instances in a cluster.
   *
   * A cluster parameter group is initially created with the default parameters for the database
   * engine used by instances in the cluster. To provide custom values for any of the parameters, you
   * must modify the group after you create it. After you create a DB cluster parameter group, you must
   * associate it with your cluster. For the new cluster parameter group and associated settings to
   * take effect, you must then reboot the DB instances in the cluster without failover.
   *
   *
   * After you create a cluster parameter group, you should wait at least 5 minutes before creating
   * your first cluster that uses that cluster parameter group as the default parameter group. This
   * allows Amazon DocumentDB to fully complete the create action before the cluster parameter group is
   * used as the default for a new cluster. This step is especially important for parameters that are
   * critical when creating the default database for a cluster, such as the character set for the
   * default database defined by the `character_set_database` parameter.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * Object parameters;
   * CfnDBClusterParameterGroup cfnDBClusterParameterGroup =
   * CfnDBClusterParameterGroup.Builder.create(this, "MyCfnDBClusterParameterGroup")
   * .description("description")
   * .family("family")
   * .parameters(parameters)
   * // the properties below are optional
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html)
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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * Object parameters;
   * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
   * CfnDBClusterParameterGroupProps.builder()
   * .description("description")
   * .family("family")
   * .parameters(parameters)
   * // the properties below are optional
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html)
   */
  public inline
      fun cfnDBClusterParameterGroupProps(block: CfnDBClusterParameterGroupPropsDsl.() -> Unit =
      {}): CfnDBClusterParameterGroupProps {
    val builder = CfnDBClusterParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDBCluster`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
   * .availabilityZones(List.of("availabilityZones"))
   * .backupRetentionPeriod(123)
   * .copyTagsToSnapshot(false)
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .deletionProtection(false)
   * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
   * .engineVersion("engineVersion")
   * .kmsKeyId("kmsKeyId")
   * .masterUsername("masterUsername")
   * .masterUserPassword("masterUserPassword")
   * .port(123)
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .restoreToTime("restoreToTime")
   * .restoreType("restoreType")
   * .snapshotIdentifier("snapshotIdentifier")
   * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
   * .storageEncrypted(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .useLatestRestorableTime(false)
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbcluster.html)
   */
  public inline fun cfnDBClusterProps(block: CfnDBClusterPropsDsl.() -> Unit = {}):
      CfnDBClusterProps {
    val builder = CfnDBClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::DocDB::DBInstance` Amazon DocumentDB (with MongoDB compatibility) resource describes
   * a DBInstance.
   *
   * For more information, see
   * [DBInstance](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBInstance.html) in
   * the *Amazon DocumentDB Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * CfnDBInstance cfnDBInstance = CfnDBInstance.Builder.create(this, "MyCfnDBInstance")
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbInstanceClass("dbInstanceClass")
   * // the properties below are optional
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .enablePerformanceInsights(false)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html)
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
   * Properties for defining a `CfnDBInstance`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbInstanceClass("dbInstanceClass")
   * // the properties below are optional
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .enablePerformanceInsights(false)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html)
   */
  public inline fun cfnDBInstanceProps(block: CfnDBInstancePropsDsl.() -> Unit = {}):
      CfnDBInstanceProps {
    val builder = CfnDBInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::DocDB::DBSubnetGroup` Amazon DocumentDB (with MongoDB compatibility) resource
   * describes a DBSubnetGroup.
   *
   * subnet groups must contain at least one subnet in at least two Availability Zones in the AWS
   * Region . For more information, see
   * [DBSubnetGroup](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBSubnetGroup.html)
   * in the *Amazon DocumentDB Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html)
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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html)
   */
  public inline fun cfnDBSubnetGroupProps(block: CfnDBSubnetGroupPropsDsl.() -> Unit = {}):
      CfnDBSubnetGroupProps {
    val builder = CfnDBSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A cluster parameter group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * ClusterParameterGroup clusterParameterGroup = ClusterParameterGroup.Builder.create(this,
   * "MyClusterParameterGroup")
   * .family("family")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * // the properties below are optional
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .description("description")
   * .build();
   * ```
   */
  public inline fun clusterParameterGroup(
    scope: Construct,
    id: String,
    block: ClusterParameterGroupDsl.() -> Unit = {},
  ): ClusterParameterGroup {
    val builder = ClusterParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a cluster parameter group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * ClusterParameterGroupProps clusterParameterGroupProps = ClusterParameterGroupProps.builder()
   * .family("family")
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * // the properties below are optional
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .description("description")
   * .build();
   * ```
   */
  public inline fun clusterParameterGroupProps(block: ClusterParameterGroupPropsDsl.() -> Unit =
      {}): ClusterParameterGroupProps {
    val builder = ClusterParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Create a clustered database with a given number of instances.
   *
   * Example:
   *
   * ```
   * Vpc vpc;
   * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
   * .masterUser(Login.builder()
   * .username("myuser")
   * .build())
   * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
   * .vpcSubnets(SubnetSelection.builder()
   * .subnetType(SubnetType.PUBLIC)
   * .build())
   * .vpc(vpc)
   * .deletionProtection(true)
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
   *
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
  public inline fun databaseClusterAttributes(block: DatabaseClusterAttributesDsl.() -> Unit = {}):
      DatabaseClusterAttributes {
    val builder = DatabaseClusterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a new database cluster.
   *
   * Example:
   *
   * ```
   * Vpc vpc;
   * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
   * .masterUser(Login.builder()
   * .username("myuser")
   * .build())
   * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
   * .vpcSubnets(SubnetSelection.builder()
   * .subnetType(SubnetType.PUBLIC)
   * .build())
   * .vpc(vpc)
   * .deletionProtection(true)
   * .build();
   * ```
   */
  public inline fun databaseClusterProps(block: DatabaseClusterPropsDsl.() -> Unit = {}):
      DatabaseClusterProps {
    val builder = DatabaseClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A database instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.docdb.*;
   * import software.amazon.awscdk.services.ec2.*;
   * DatabaseCluster databaseCluster;
   * InstanceType instanceType;
   * DatabaseInstance databaseInstance = DatabaseInstance.Builder.create(this, "MyDatabaseInstance")
   * .cluster(databaseCluster)
   * .instanceType(instanceType)
   * // the properties below are optional
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbInstanceName("dbInstanceName")
   * .enablePerformanceInsights(false)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .removalPolicy(RemovalPolicy.DESTROY)
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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.docdb.*;
   * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
   * .instanceEndpointAddress("instanceEndpointAddress")
   * .instanceIdentifier("instanceIdentifier")
   * .port(123)
   * .build();
   * ```
   */
  public inline fun databaseInstanceAttributes(block: DatabaseInstanceAttributesDsl.() -> Unit =
      {}): DatabaseInstanceAttributes {
    val builder = DatabaseInstanceAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for a DatabaseInstanceNew.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.docdb.*;
   * import software.amazon.awscdk.services.ec2.*;
   * DatabaseCluster databaseCluster;
   * InstanceType instanceType;
   * DatabaseInstanceProps databaseInstanceProps = DatabaseInstanceProps.builder()
   * .cluster(databaseCluster)
   * .instanceType(instanceType)
   * // the properties below are optional
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbInstanceName("dbInstanceName")
   * .enablePerformanceInsights(false)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .removalPolicy(RemovalPolicy.DESTROY)
   * .build();
   * ```
   */
  public inline fun databaseInstanceProps(block: DatabaseInstancePropsDsl.() -> Unit = {}):
      DatabaseInstanceProps {
    val builder = DatabaseInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A database secret.
   *
   * Example:
   *
   * ```
   * DatabaseCluster cluster;
   * DatabaseSecret myUserSecret = DatabaseSecret.Builder.create(this, "MyUserSecret")
   * .username("myuser")
   * .masterSecret(cluster.getSecret())
   * .build();
   * ISecret myUserSecretAttached = myUserSecret.attach(cluster); // Adds DB connections information
   * in the secret
   * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder() // Add rotation using
   * the multi user scheme
   * .secret(myUserSecretAttached).build());
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
   *
   * ```
   * DatabaseCluster cluster;
   * DatabaseSecret myUserSecret = DatabaseSecret.Builder.create(this, "MyUserSecret")
   * .username("myuser")
   * .masterSecret(cluster.getSecret())
   * .build();
   * ISecret myUserSecretAttached = myUserSecret.attach(cluster); // Adds DB connections information
   * in the secret
   * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder() // Add rotation using
   * the multi user scheme
   * .secret(myUserSecretAttached).build());
   * ```
   */
  public inline fun databaseSecretProps(block: DatabaseSecretPropsDsl.() -> Unit = {}):
      DatabaseSecretProps {
    val builder = DatabaseSecretPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Login credentials for a database cluster.
   *
   * Example:
   *
   * ```
   * Vpc vpc;
   * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
   * .masterUser(Login.builder()
   * .username("myuser")
   * .build())
   * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
   * .vpcSubnets(SubnetSelection.builder()
   * .subnetType(SubnetType.PUBLIC)
   * .build())
   * .vpc(vpc)
   * .deletionProtection(true)
   * .build();
   * ```
   */
  public inline fun login(block: LoginDsl.() -> Unit = {}): Login {
    val builder = LoginDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options to add the multi user rotation.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.secretsmanager.*;
   * Secret myImportedSecret;
   * DatabaseCluster cluster;
   * cluster.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
   * .secret(myImportedSecret)
   * .build());
   * ```
   */
  public inline fun rotationMultiUserOptions(block: RotationMultiUserOptionsDsl.() -> Unit = {}):
      RotationMultiUserOptions {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
