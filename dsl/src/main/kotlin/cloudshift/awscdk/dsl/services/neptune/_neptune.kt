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
  public inline fun cfnDBCluster(
    scope: Construct,
    id: String,
    block: CfnDBClusterDsl.() -> Unit = {},
  ): CfnDBCluster {
    val builder = CfnDBClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDBClusterDBClusterRoleProperty(block: CfnDBClusterDBClusterRolePropertyDsl.() -> Unit =
      {}): CfnDBCluster.DBClusterRoleProperty {
    val builder = CfnDBClusterDBClusterRolePropertyDsl()
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

  public inline
      fun cfnDBClusterServerlessScalingConfigurationProperty(block: CfnDBClusterServerlessScalingConfigurationPropertyDsl.() -> Unit
      = {}): CfnDBCluster.ServerlessScalingConfigurationProperty {
    val builder = CfnDBClusterServerlessScalingConfigurationPropertyDsl()
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

  public inline fun cfnDBParameterGroup(
    scope: Construct,
    id: String,
    block: CfnDBParameterGroupDsl.() -> Unit = {},
  ): CfnDBParameterGroup {
    val builder = CfnDBParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDBParameterGroupProps(block: CfnDBParameterGroupPropsDsl.() -> Unit = {}):
      CfnDBParameterGroupProps {
    val builder = CfnDBParameterGroupPropsDsl()
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
}
