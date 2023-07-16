@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.memorydb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnACL
import software.amazon.awscdk.services.memorydb.CfnACLProps
import software.amazon.awscdk.services.memorydb.CfnCluster
import software.amazon.awscdk.services.memorydb.CfnClusterProps
import software.amazon.awscdk.services.memorydb.CfnParameterGroup
import software.amazon.awscdk.services.memorydb.CfnParameterGroupProps
import software.amazon.awscdk.services.memorydb.CfnSubnetGroup
import software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps
import software.amazon.awscdk.services.memorydb.CfnUser
import software.amazon.awscdk.services.memorydb.CfnUserProps
import software.constructs.Construct

public object memorydb {
  public inline fun cfnACL(
    scope: Construct,
    id: String,
    block: CfnACLDsl.() -> Unit = {},
  ): CfnACL {
    val builder = CfnACLDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnACLProps(block: CfnACLPropsDsl.() -> Unit = {}): CfnACLProps {
    val builder = CfnACLPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCluster(
    scope: Construct,
    id: String,
    block: CfnClusterDsl.() -> Unit = {},
  ): CfnCluster {
    val builder = CfnClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClusterEndpointProperty(block: CfnClusterEndpointPropertyDsl.() -> Unit =
      {}): CfnCluster.EndpointProperty {
    val builder = CfnClusterEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
    val builder = CfnClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterGroup(
    scope: Construct,
    id: String,
    block: CfnParameterGroupDsl.() -> Unit = {},
  ): CfnParameterGroup {
    val builder = CfnParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterGroupProps(block: CfnParameterGroupPropsDsl.() -> Unit = {}):
      CfnParameterGroupProps {
    val builder = CfnParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetGroup(
    scope: Construct,
    id: String,
    block: CfnSubnetGroupDsl.() -> Unit = {},
  ): CfnSubnetGroup {
    val builder = CfnSubnetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetGroupProps(block: CfnSubnetGroupPropsDsl.() -> Unit = {}):
      CfnSubnetGroupProps {
    val builder = CfnSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUser(
    scope: Construct,
    id: String,
    block: CfnUserDsl.() -> Unit = {},
  ): CfnUser {
    val builder = CfnUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserAuthenticationModeProperty(block: CfnUserAuthenticationModePropertyDsl.() -> Unit =
      {}): CfnUser.AuthenticationModeProperty {
    val builder = CfnUserAuthenticationModePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
    val builder = CfnUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
