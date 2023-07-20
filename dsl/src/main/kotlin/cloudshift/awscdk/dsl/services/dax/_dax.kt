@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster
import software.amazon.awscdk.services.dax.CfnClusterProps
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.amazon.awscdk.services.dax.CfnParameterGroupProps
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps
import software.constructs.Construct

public object dax {
  public inline fun cfnCluster(
    scope: Construct,
    id: String,
    block: CfnClusterDsl.() -> Unit = {},
  ): CfnCluster {
    val builder = CfnClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
    val builder = CfnClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnClusterSSESpecificationProperty(block: CfnClusterSSESpecificationPropertyDsl.() -> Unit
      = {}): CfnCluster.SSESpecificationProperty {
    val builder = CfnClusterSSESpecificationPropertyDsl()
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
}
