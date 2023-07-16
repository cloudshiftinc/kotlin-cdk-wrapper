@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.amazon.awscdk.services.signer.CfnSigningProfile

public inline fun CfnProfilePermission.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSigningProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSigningProfile.setSignatureValidityPeriod(block: CfnSigningProfileSignatureValidityPeriodPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSigningProfileSignatureValidityPeriodPropertyDsl()
  builder.apply(block)
  return setSignatureValidityPeriod(builder.build())
}
