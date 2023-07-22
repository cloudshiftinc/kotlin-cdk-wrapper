@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBCluster
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps
import software.amazon.awscdk.services.neptune.CfnDBClusterProps
import software.amazon.awscdk.services.neptune.CfnDBInstance
import software.amazon.awscdk.services.neptune.CfnDBInstanceProps
import software.amazon.awscdk.services.neptune.CfnDBParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroup
import software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps
import software.constructs.Construct

public object neptune {
  /**
   * The `AWS::Neptune::DBCluster` resource creates an Amazon Neptune DB cluster. Neptune is a fully
   * managed graph database.
   *
   *
   * Currently, you can create this resource only in AWS Regions in which Amazon Neptune is
   * supported.
   *
   *
   * If no `DeletionPolicy` is set for `AWS::Neptune::DBCluster` resources, the default deletion
   * behavior is that the entire volume will be deleted without a snapshot. To retain a backup of the
   * volume, the `DeletionPolicy` should be set to `Snapshot` . For more information about how AWS
   * CloudFormation deletes resources, see [DeletionPolicy
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
   * .
   *
   * You can use `AWS::Neptune::DBCluster.DeletionProtection` to help guard against unintended
   * deletion of your DB cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * CfnDBCluster cfnDBCluster = CfnDBCluster.Builder.create(this, "MyCfnDBCluster")
   * .associatedRoles(List.of(DBClusterRoleProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .featureName("featureName")
   * .build()))
   * .availabilityZones(List.of("availabilityZones"))
   * .backupRetentionPeriod(123)
   * .copyTagsToSnapshot(false)
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .deletionProtection(false)
   * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
   * .engineVersion("engineVersion")
   * .iamAuthEnabled(false)
   * .kmsKeyId("kmsKeyId")
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .restoreToTime("restoreToTime")
   * .restoreType("restoreType")
   * .serverlessScalingConfiguration(ServerlessScalingConfigurationProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html)
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
   * Describes an Amazon Identity and Access Management (IAM) role that is associated with a DB
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * DBClusterRoleProperty dBClusterRoleProperty = DBClusterRoleProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .featureName("featureName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html)
   */
  public inline
      fun cfnDBClusterDBClusterRoleProperty(block: CfnDBClusterDBClusterRolePropertyDsl.() -> Unit =
      {}): CfnDBCluster.DBClusterRoleProperty {
    val builder = CfnDBClusterDBClusterRolePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Neptune::DBClusterParameterGroup` resource creates a new Amazon Neptune DB cluster
   * parameter group.
   *
   *
   * Applying a parameter group to a DB cluster might require instances to reboot, resulting in a
   * database outage while the instances reboot. &gt; If you provide a custom `DBClusterParameterGroup`
   * that you associate with the `DBCluster` , it is best to specify an `EngineVersion` property in the
   * `DBCluster` . That `EngineVersion` needs to be compatible with the value of the `Family` property
   * in the `DBClusterParameterGroup` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html)
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
   * import software.amazon.awscdk.services.neptune.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html)
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
   * import software.amazon.awscdk.services.neptune.*;
   * CfnDBClusterProps cfnDBClusterProps = CfnDBClusterProps.builder()
   * .associatedRoles(List.of(DBClusterRoleProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .featureName("featureName")
   * .build()))
   * .availabilityZones(List.of("availabilityZones"))
   * .backupRetentionPeriod(123)
   * .copyTagsToSnapshot(false)
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbClusterParameterGroupName("dbClusterParameterGroupName")
   * .dbInstanceParameterGroupName("dbInstanceParameterGroupName")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .deletionProtection(false)
   * .enableCloudwatchLogsExports(List.of("enableCloudwatchLogsExports"))
   * .engineVersion("engineVersion")
   * .iamAuthEnabled(false)
   * .kmsKeyId("kmsKeyId")
   * .preferredBackupWindow("preferredBackupWindow")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .restoreToTime("restoreToTime")
   * .restoreType("restoreType")
   * .serverlessScalingConfiguration(ServerlessScalingConfigurationProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html)
   */
  public inline fun cfnDBClusterProps(block: CfnDBClusterPropsDsl.() -> Unit = {}):
      CfnDBClusterProps {
    val builder = CfnDBClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains the scaling configuration of an Neptune Serverless DB cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * ServerlessScalingConfigurationProperty serverlessScalingConfigurationProperty =
   * ServerlessScalingConfigurationProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html)
   */
  public inline
      fun cfnDBClusterServerlessScalingConfigurationProperty(block: CfnDBClusterServerlessScalingConfigurationPropertyDsl.() -> Unit
      = {}): CfnDBCluster.ServerlessScalingConfigurationProperty {
    val builder = CfnDBClusterServerlessScalingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Neptune::DBInstance` type creates an Amazon Neptune DB instance.
   *
   * *Updating DB Instances*
   *
   * You can set a deletion policy for your DB instance to control how AWS CloudFormation handles
   * the instance when the stack is deleted. For Neptune DB instances, you can choose to *retain* the
   * instance, to *delete* the instance, or to *create a snapshot* of the instance. The default AWS
   * CloudFormation behavior depends on the `DBClusterIdentifier` property:
   *
   * * For `AWS::Neptune::DBInstance` resources that don't specify the `DBClusterIdentifier`
   * property, AWS CloudFormation saves a snapshot of the DB instance.
   * * For `AWS::Neptune::DBInstance` resources that do specify the `DBClusterIdentifier` property,
   * AWS CloudFormation deletes the DB instance.
   *
   * *Deleting DB Instances*
   *
   *
   * If a DB instance is deleted or replaced during an update, AWS CloudFormation deletes all
   * automated snapshots. However, it retains manual DB snapshots. During an update that requires
   * replacement, you can apply a stack policy to prevent DB instances from being replaced.
   *
   *
   * When properties labeled *Update requires: Replacement* are updated, AWS CloudFormation first
   * creates a replacement DB instance, changes references from other dependent resources to point to
   * the replacement DB instance, and finally deletes the old DB instance.
   *
   *
   * We highly recommend that you take a snapshot of the database before updating the stack. If you
   * don't, you lose the data when AWS CloudFormation replaces your DB instance. To preserve your data,
   * perform the following procedure:
   *
   * * Deactivate any applications that are using the DB instance so that there's no activity on the
   * DB instance.
   * * Create a snapshot of the DB instance.
   * * If you want to restore your instance using a DB snapshot, modify the updated template with
   * your DB instance changes and add the `DBSnapshotIdentifier` property with the ID of the DB
   * snapshot that you want to use.
   * * Update the stack.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * CfnDBInstance cfnDBInstance = CfnDBInstance.Builder.create(this, "MyCfnDBInstance")
   * .dbInstanceClass("dbInstanceClass")
   * // the properties below are optional
   * .allowMajorVersionUpgrade(false)
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .dbParameterGroupName("dbParameterGroupName")
   * .dbSnapshotIdentifier("dbSnapshotIdentifier")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html)
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
   * import software.amazon.awscdk.services.neptune.*;
   * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
   * .dbInstanceClass("dbInstanceClass")
   * // the properties below are optional
   * .allowMajorVersionUpgrade(false)
   * .autoMinorVersionUpgrade(false)
   * .availabilityZone("availabilityZone")
   * .dbClusterIdentifier("dbClusterIdentifier")
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .dbParameterGroupName("dbParameterGroupName")
   * .dbSnapshotIdentifier("dbSnapshotIdentifier")
   * .dbSubnetGroupName("dbSubnetGroupName")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html)
   */
  public inline fun cfnDBInstanceProps(block: CfnDBInstancePropsDsl.() -> Unit = {}):
      CfnDBInstanceProps {
    val builder = CfnDBInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `AWS::Neptune::DBParameterGroup` creates a new DB parameter group.
   *
   * This type can be declared in a template and referenced in the `DBParameterGroupName` parameter
   * of `AWS::Neptune::DBInstance` .
   *
   *
   * Applying a parameter group to a DB instance might require the instance to reboot, resulting in
   * a database outage for the duration of the reboot. &gt; If you provide a custom `DBParameterGroup`
   * that you associate with `DBInstance` , it is best to specify an `EngineVersion` property in
   * `DBCluster` . That `EngineVersion` needs to be compatible with the value of the `Family` property
   * in the `DBParameterGroup` .
   *
   *
   * A DB parameter group is initially created with the default parameters for the database engine
   * used by the DB instance. To provide custom values for any of the parameters, you must modify the
   * group after creating it using *ModifyDBParameterGroup* . Once you've created a DB parameter group,
   * you need to associate it with your DB instance using *ModifyDBInstance* . When you associate a new
   * DB parameter group with a running DB instance, you need to reboot the DB instance without failover
   * for the new DB parameter group and associated settings to take effect.
   *
   *
   * After you create a DB parameter group, you should wait at least 5 minutes before creating your
   * first DB instance that uses that DB parameter group as the default parameter group. This allows
   * Amazon Neptune to fully complete the create action before the parameter group is used as the
   * default for a new DB instance. This is especially important for parameters that are critical when
   * creating the default database for a DB instance, such as the character set for the default
   * database defined by the `character_set_database` parameter. You can use the *Parameter Groups*
   * option of the Amazon Neptune console or the *DescribeDBParameters* command to verify that your DB
   * parameter group has been created or modified.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * Object parameters;
   * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
   * "MyCfnDBParameterGroup")
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html)
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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
   * Object parameters;
   * CfnDBParameterGroupProps cfnDBParameterGroupProps = CfnDBParameterGroupProps.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html)
   */
  public inline fun cfnDBParameterGroupProps(block: CfnDBParameterGroupPropsDsl.() -> Unit = {}):
      CfnDBParameterGroupProps {
    val builder = CfnDBParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Neptune::DBSubnetGroup` type creates an Amazon Neptune DB subnet group.
   *
   * Subnet groups must contain at least two subnets in two different Availability Zones in the same
   * AWS Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.neptune.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html)
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
   * import software.amazon.awscdk.services.neptune.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html)
   */
  public inline fun cfnDBSubnetGroupProps(block: CfnDBSubnetGroupPropsDsl.() -> Unit = {}):
      CfnDBSubnetGroupProps {
    val builder = CfnDBSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
