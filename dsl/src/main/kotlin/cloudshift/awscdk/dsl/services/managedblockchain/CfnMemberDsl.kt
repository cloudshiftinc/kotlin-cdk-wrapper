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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnMemberDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMember.Builder = CfnMember.Builder.create(scope, id)

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

    public fun build(): CfnMember = cdkBuilder.build()
}
