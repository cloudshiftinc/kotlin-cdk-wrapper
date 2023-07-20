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
import software.amazon.awscdk.services.managedblockchain.CfnMember
import kotlin.String

@CdkDslMarker
public class CfnMemberMemberFabricConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.MemberFabricConfigurationProperty.Builder =
        CfnMember.MemberFabricConfigurationProperty.builder()

    public fun adminPassword(adminPassword: String) {
        cdkBuilder.adminPassword(adminPassword)
    }

    public fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
    }

    public fun build(): CfnMember.MemberFabricConfigurationProperty = cdkBuilder.build()
}
