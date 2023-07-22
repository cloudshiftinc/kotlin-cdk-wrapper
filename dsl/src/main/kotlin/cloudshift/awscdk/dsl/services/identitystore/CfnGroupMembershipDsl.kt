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

  /**
   * The unique identifier for a group in the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-groupid)
   * @param groupId The unique identifier for a group in the identity store. 
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  /**
   * The globally unique identifier for the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-identitystoreid)
   * @param identityStoreId The globally unique identifier for the identity store. 
   */
  public fun identityStoreId(identityStoreId: String) {
    cdkBuilder.identityStoreId(identityStoreId)
  }

  /**
   * An object containing the identifier of a group member.
   *
   * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider that
   * User as a group member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
   * @param memberId An object containing the identifier of a group member. 
   */
  public fun memberId(memberId: IResolvable) {
    cdkBuilder.memberId(memberId)
  }

  /**
   * An object containing the identifier of a group member.
   *
   * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider that
   * User as a group member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
   * @param memberId An object containing the identifier of a group member. 
   */
  public fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
    cdkBuilder.memberId(memberId)
  }

  public fun build(): CfnGroupMembership = cdkBuilder.build()
}
