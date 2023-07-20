@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnBranch

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

public inline fun CfnBranch.setBasicAuthConfig(block: CfnBranchBasicAuthConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBranchBasicAuthConfigPropertyDsl()
  builder.apply(block)
  return setBasicAuthConfig(builder.build())
}
