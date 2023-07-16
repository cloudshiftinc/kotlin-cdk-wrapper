@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.finspace.CfnEnvironment

public inline fun CfnEnvironment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEnvironment.setFederationParameters(block: CfnEnvironmentFederationParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentFederationParametersPropertyDsl()
  builder.apply(block)
  return setFederationParameters(builder.build())
}

public inline
    fun CfnEnvironment.setSuperuserParameters(block: CfnEnvironmentSuperuserParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentSuperuserParametersPropertyDsl()
  builder.apply(block)
  return setSuperuserParameters(builder.build())
}
