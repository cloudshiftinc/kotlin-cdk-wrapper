@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ram

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnPermission
import software.amazon.awscdk.services.ram.CfnPermissionProps
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.amazon.awscdk.services.ram.CfnResourceShareProps
import software.constructs.Construct

public object ram {
  public inline fun cfnPermission(
    scope: Construct,
    id: String,
    block: CfnPermissionDsl.() -> Unit = {},
  ): CfnPermission {
    val builder = CfnPermissionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPermissionProps(block: CfnPermissionPropsDsl.() -> Unit = {}):
      CfnPermissionProps {
    val builder = CfnPermissionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceShare(
    scope: Construct,
    id: String,
    block: CfnResourceShareDsl.() -> Unit = {},
  ): CfnResourceShare {
    val builder = CfnResourceShareDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceShareProps(block: CfnResourceSharePropsDsl.() -> Unit = {}):
      CfnResourceShareProps {
    val builder = CfnResourceSharePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
