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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import kotlin.String

@CdkDslMarker
public class CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl {
    private val cdkBuilder: CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder =
        CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun build(): CfnInputSecurityGroup.InputWhitelistRuleCidrProperty = cdkBuilder.build()
}
