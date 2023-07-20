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

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import kotlin.String

@CdkDslMarker
public class CfnGroupMembershipMemberIdPropertyDsl {
    private val cdkBuilder: CfnGroupMembership.MemberIdProperty.Builder =
        CfnGroupMembership.MemberIdProperty.builder()

    public fun userId(userId: String) {
        cdkBuilder.userId(userId)
    }

    public fun build(): CfnGroupMembership.MemberIdProperty = cdkBuilder.build()
}
