@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

@CdkDslMarker
public class CfnGroupMembershipMemberIdPropertyDsl {
  private val cdkBuilder: CfnGroupMembership.MemberIdProperty.Builder =
      CfnGroupMembership.MemberIdProperty.builder()

  /**
   * @param userId The identifier for a user in the identity store. 
   */
  public fun userId(userId: String) {
    cdkBuilder.userId(userId)
  }

  public fun build(): CfnGroupMembership.MemberIdProperty = cdkBuilder.build()
}
