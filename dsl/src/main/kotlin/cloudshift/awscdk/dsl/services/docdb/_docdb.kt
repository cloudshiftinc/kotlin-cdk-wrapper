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
  public inline fun backupProps(block: BackupPropsDsl.() -> Unit = {}): BackupProps {
    val builder = BackupPropsDsl()
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

  public inline fun cfnDBClusterParameterGroup(
    scope: Construct,
    id: String,
    block: CfnDBClusterParameterGroupDsl.() -> Unit = {},
  ): CfnDBClusterParameterGroup {
    val builder = CfnDBClusterParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDBClusterParameterGroupProps(block: CfnDBClusterParameterGroupPropsDsl.() -> Unit =
      {}): CfnDBClusterParameterGroupProps {
    val builder = CfnDBClusterParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDBClusterProps(block: CfnDBClusterPropsDsl.() -> Unit = {}):
      CfnDBClusterProps {
    val builder = CfnDBClusterPropsDsl()
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

  public inline fun cfnDBInstanceProps(block: CfnDBInstancePropsDsl.() -> Unit = {}):
      CfnDBInstanceProps {
    val builder = CfnDBInstancePropsDsl()
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

  public inline fun cfnDBSubnetGroupProps(block: CfnDBSubnetGroupPropsDsl.() -> Unit = {}):
      CfnDBSubnetGroupProps {
    val builder = CfnDBSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun clusterParameterGroup(
    scope: Construct,
    id: String,
    block: ClusterParameterGroupDsl.() -> Unit = {},
  ): ClusterParameterGroup {
    val builder = ClusterParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun clusterParameterGroupProps(block: ClusterParameterGroupPropsDsl.() -> Unit =
      {}): ClusterParameterGroupProps {
    val builder = ClusterParameterGroupPropsDsl()
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

  public inline fun databaseClusterAttributes(block: DatabaseClusterAttributesDsl.() -> Unit = {}):
      DatabaseClusterAttributes {
    val builder = DatabaseClusterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun databaseClusterProps(block: DatabaseClusterPropsDsl.() -> Unit = {}):
      DatabaseClusterProps {
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

  public inline fun databaseInstanceAttributes(block: DatabaseInstanceAttributesDsl.() -> Unit =
      {}): DatabaseInstanceAttributes {
    val builder = DatabaseInstanceAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun databaseInstanceProps(block: DatabaseInstancePropsDsl.() -> Unit = {}):
      DatabaseInstanceProps {
    val builder = DatabaseInstancePropsDsl()
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

  public inline fun databaseSecretProps(block: DatabaseSecretPropsDsl.() -> Unit = {}):
      DatabaseSecretProps {
    val builder = DatabaseSecretPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun login(block: LoginDsl.() -> Unit = {}): Login {
    val builder = LoginDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun rotationMultiUserOptions(block: RotationMultiUserOptionsDsl.() -> Unit = {}):
      RotationMultiUserOptions {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
