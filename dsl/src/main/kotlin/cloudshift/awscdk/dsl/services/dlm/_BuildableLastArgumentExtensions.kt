@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

public inline fun CfnLifecyclePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLifecyclePolicy.setPolicyDetails(block: CfnLifecyclePolicyPolicyDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLifecyclePolicyPolicyDetailsPropertyDsl()
  builder.apply(block)
  return setPolicyDetails(builder.build())
}
