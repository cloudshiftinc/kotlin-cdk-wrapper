@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember
import kotlin.String

@CdkDslMarker
public class CfnMemberNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.NetworkConfigurationProperty.Builder =
        CfnMember.NetworkConfigurationProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    public fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networkFrameworkConfiguration(networkFrameworkConfiguration: IResolvable) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration)
    }

    public fun networkFrameworkConfiguration(networkFrameworkConfiguration: CfnMember.NetworkFrameworkConfigurationProperty) {
        cdkBuilder.networkFrameworkConfiguration(networkFrameworkConfiguration)
    }

    public fun votingPolicy(votingPolicy: IResolvable) {
        cdkBuilder.votingPolicy(votingPolicy)
    }

    public fun votingPolicy(votingPolicy: CfnMember.VotingPolicyProperty) {
        cdkBuilder.votingPolicy(votingPolicy)
    }

    public fun build(): CfnMember.NetworkConfigurationProperty = cdkBuilder.build()
}
