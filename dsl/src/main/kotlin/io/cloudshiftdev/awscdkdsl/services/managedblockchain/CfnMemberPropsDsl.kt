@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.managedblockchain

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps

/**
 * Properties for defining a `CfnMember`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnMemberProps cfnMemberProps = CfnMemberProps.builder()
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
public class CfnMemberPropsDsl {
    private val cdkBuilder: CfnMemberProps.Builder = CfnMemberProps.builder()

    /**
     * @param invitationId The unique identifier of the invitation to join the network sent to the
     *   account that creates the member.
     */
    public fun invitationId(invitationId: String) {
        cdkBuilder.invitationId(invitationId)
    }

    /** @param memberConfiguration Configuration properties of the member. */
    public fun memberConfiguration(memberConfiguration: IResolvable) {
        cdkBuilder.memberConfiguration(memberConfiguration)
    }

    /** @param memberConfiguration Configuration properties of the member. */
    public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
        cdkBuilder.memberConfiguration(memberConfiguration)
    }

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     *   belongs.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration Configuration properties of the network to which the member
     *   belongs.
     */
    public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /** @param networkId The unique identifier of the network to which the member belongs. */
    public fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
    }

    public fun build(): CfnMemberProps = cdkBuilder.build()
}
