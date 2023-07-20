@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.constructs.Construct

@CdkDslMarker
public class CfnGroupMembershipDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGroupMembership.Builder = CfnGroupMembership.Builder.create(scope, id)

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun identityStoreId(identityStoreId: String) {
    cdkBuilder.identityStoreId(identityStoreId)
  }

  public fun memberId(memberId: IResolvable) {
    cdkBuilder.memberId(memberId)
  }

  public fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
    cdkBuilder.memberId(memberId)
  }

  public fun build(): CfnGroupMembership = cdkBuilder.build()
}
