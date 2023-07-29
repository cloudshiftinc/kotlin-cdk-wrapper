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

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Configuration properties of the network to which the member belongs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.NetworkConfigurationProperty.Builder =
        CfnMember.NetworkConfigurationProperty.builder()

    /** @param description Attributes of the blockchain framework for the network. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param framework The blockchain framework that the network uses. */
    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    /** @param frameworkVersion The version of the blockchain framework that the network uses. */
    public fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
    }

    /** @param name The name of the network. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param networkFrameworkConfiguration Configuration properties relevant to the network for the
     *   blockchain framework that the network uses.
     */
    public fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration)
    }

    /**
     * @param networkFrameworkConfiguration Configuration properties relevant to the network for the
     *   blockchain framework that the network uses.
     */
    public fun networkFrameworkConfiguration(
        networkFrameworkConfiguration: CfnMember.NetworkFrameworkConfigurationProperty
    ) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration)
    }

    /**
     * @param votingPolicy The voting rules that the network uses to decide if a proposal is
     *   accepted.
     */
    public fun votingPolicy(votingPolicy: IResolvable) {
        cdkBuilder.votingPolicy(votingPolicy)
    }

    /**
     * @param votingPolicy The voting rules that the network uses to decide if a proposal is
     *   accepted.
     */
    public fun votingPolicy(votingPolicy: CfnMember.VotingPolicyProperty) {
        cdkBuilder.votingPolicy(votingPolicy)
    }

    public fun build(): CfnMember.NetworkConfigurationProperty = cdkBuilder.build()
}
