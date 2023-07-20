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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import kotlin.String

@CdkDslMarker
public class CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl {
    private val cdkBuilder: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder =
        CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.builder()

    public fun amazonId(amazonId: String) {
        cdkBuilder.amazonId(amazonId)
    }

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun fingerprint(fingerprint: String) {
        cdkBuilder.fingerprint(fingerprint)
    }

    public fun build(): CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty =
        cdkBuilder.build()
}
