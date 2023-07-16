@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnDomain

public inline fun CfnApp.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApp.setAutoBranchCreationConfig(block: CfnAppAutoBranchCreationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAppAutoBranchCreationConfigPropertyDsl()
  builder.apply(block)
  return setAutoBranchCreationConfig(builder.build())
}

public inline fun CfnApp.setBasicAuthConfig(block: CfnAppBasicAuthConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAppBasicAuthConfigPropertyDsl()
  builder.apply(block)
  return setBasicAuthConfig(builder.build())
}

public inline fun CfnBranch.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnBranch.setBasicAuthConfig(block: CfnBranchBasicAuthConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBranchBasicAuthConfigPropertyDsl()
  builder.apply(block)
  return setBasicAuthConfig(builder.build())
}

public inline fun CfnDomain.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
