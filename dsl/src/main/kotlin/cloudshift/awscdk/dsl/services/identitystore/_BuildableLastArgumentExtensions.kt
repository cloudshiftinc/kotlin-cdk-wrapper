@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.identitystore

import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

public inline
    fun CfnGroupMembership.setMemberId(block: CfnGroupMembershipMemberIdPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGroupMembershipMemberIdPropertyDsl()
  builder.apply(block)
  return setMemberId(builder.build())
}
