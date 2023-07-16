@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.identitystore.CfnGroup
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

public inline fun CfnGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGroupMembership.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGroupMembership.setMemberId(block: CfnGroupMembershipMemberIdPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGroupMembershipMemberIdPropertyDsl()
  builder.apply(block)
  return setMemberId(builder.build())
}
