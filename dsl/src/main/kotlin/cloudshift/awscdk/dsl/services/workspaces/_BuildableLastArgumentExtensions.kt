@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.amazon.awscdk.services.workspaces.CfnWorkspace

public inline fun CfnConnectionAlias.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnWorkspace.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWorkspace.setWorkspaceProperties(block: CfnWorkspaceWorkspacePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkspaceWorkspacePropertiesPropertyDsl()
  builder.apply(block)
  return setWorkspaceProperties(builder.build())
}
