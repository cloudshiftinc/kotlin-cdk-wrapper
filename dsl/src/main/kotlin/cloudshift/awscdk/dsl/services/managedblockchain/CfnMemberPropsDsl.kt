@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps

@CdkDslMarker
public class CfnMemberPropsDsl {
  private val cdkBuilder: CfnMemberProps.Builder = CfnMemberProps.builder()

  /**
   * @param invitationId The unique identifier of the invitation to join the network sent to the
   * account that creates the member.
   */
  public fun invitationId(invitationId: String) {
    cdkBuilder.invitationId(invitationId)
  }

  /**
   * @param memberConfiguration Configuration properties of the member. 
   */
  public fun memberConfiguration(memberConfiguration: IResolvable) {
    cdkBuilder.memberConfiguration(memberConfiguration)
  }

  /**
   * @param memberConfiguration Configuration properties of the member. 
   */
  public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
    cdkBuilder.memberConfiguration(memberConfiguration)
  }

  /**
   * @param networkConfiguration Configuration properties of the network to which the member
   * belongs.
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param networkConfiguration Configuration properties of the network to which the member
   * belongs.
   */
  public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param networkId The unique identifier of the network to which the member belongs.
   */
  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  public fun build(): CfnMemberProps = cdkBuilder.build()
}
