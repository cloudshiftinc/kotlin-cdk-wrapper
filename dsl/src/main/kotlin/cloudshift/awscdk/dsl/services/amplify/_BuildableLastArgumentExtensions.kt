@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnBranch

/**
 * Sets the configuration for your automatic branch creation.
 */
public inline
    fun CfnApp.setAutoBranchCreationConfig(block: CfnAppAutoBranchCreationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAppAutoBranchCreationConfigPropertyDsl()
  builder.apply(block)
  return setAutoBranchCreationConfig(builder.build())
}

/**
 * The credentials for basic authorization for an Amplify app.
 */
public inline fun CfnApp.setBasicAuthConfig(block: CfnAppBasicAuthConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAppBasicAuthConfigPropertyDsl()
  builder.apply(block)
  return setBasicAuthConfig(builder.build())
}

/**
 * The basic authorization credentials for a branch of an Amplify app.
 */
public inline fun CfnBranch.setBasicAuthConfig(block: CfnBranchBasicAuthConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBranchBasicAuthConfigPropertyDsl()
  builder.apply(block)
  return setBasicAuthConfig(builder.build())
}
