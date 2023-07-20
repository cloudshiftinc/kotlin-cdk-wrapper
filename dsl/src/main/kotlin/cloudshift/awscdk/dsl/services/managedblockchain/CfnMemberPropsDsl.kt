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
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps
import kotlin.String

@CdkDslMarker
public class CfnMemberPropsDsl {
    private val cdkBuilder: CfnMemberProps.Builder = CfnMemberProps.builder()

    public fun invitationId(invitationId: String) {
        cdkBuilder.invitationId(invitationId)
    }

    public fun memberConfiguration(memberConfiguration: IResolvable) {
        cdkBuilder.memberConfiguration(memberConfiguration)
    }

    public fun memberConfiguration(memberConfiguration: CfnMember.MemberConfigurationProperty) {
        cdkBuilder.memberConfiguration(memberConfiguration)
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun networkConfiguration(networkConfiguration: CfnMember.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
    }

    public fun build(): CfnMemberProps = cdkBuilder.build()
}
