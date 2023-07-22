@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.constructs.Construct

/**
 * Creates a member within a Managed Blockchain network.
 *
 * Applies only to Hyperledger Fabric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnMember cfnMember = CfnMember.Builder.create(this, "MyCfnMember")
 * .memberConfiguration(MemberConfigurationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
 * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
 * .adminPassword("adminPassword")
 * .adminUsername("adminUsername")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .invitationId("invitationId")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .name("name")
 * .votingPolicy(VotingPolicyProperty.builder()
 * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
 * .proposalDurationInHours(123)
 * .thresholdComparator("thresholdComparator")
 * .thresholdPercentage(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
 * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
 * .edition("edition")
 * .build())
 * .build())
 * .build())
 * .networkId("networkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html)
 */
@CdkDslMarker
public class CfnMemberDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMember.Builder = CfnMember.Builder.create(scope, id)

  /**
   * The unique identifier of the invitation to join the network sent to the account that creates
   * the member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-invitationid)
   * @param invitationId The unique identifier of the invitation to join the network sent to the
   * account that creates the member. 
   */
  public fun invitationId(invitationId: String) {
    cdkBuilder.invitationId(invitationId)
  }

  /**
   * Configuration properties of the member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
   * @param memberConfiguration Configuration properties of the member. 
   */
  public fun memberConfiguration(memberConfiguration: IResolvable) {
    cdkBuilder.memberConfiguration(memberConfiguration)
  }

  /**
   * Configuration properties of the member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-memberconfiguration)
   * @param memberConfiguration Configuration properties of the member. 
   */
  public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
    cdkBuilder.memberConfiguration(memberConfiguration)
  }

  /**
   * Configuration properties of the network to which the member belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
   * @param networkConfiguration Configuration properties of the network to which the member
   * belongs. 
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * Configuration properties of the network to which the member belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkconfiguration)
   * @param networkConfiguration Configuration properties of the network to which the member
   * belongs. 
   */
  public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * The unique identifier of the network to which the member belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html#cfn-managedblockchain-member-networkid)
   * @param networkId The unique identifier of the network to which the member belongs. 
   */
  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  public fun build(): CfnMember = cdkBuilder.build()
}
