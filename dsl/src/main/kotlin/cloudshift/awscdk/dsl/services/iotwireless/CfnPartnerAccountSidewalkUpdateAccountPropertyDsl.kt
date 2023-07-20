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
public class CfnPartnerAccountSidewalkUpdateAccountPropertyDsl {
    private val cdkBuilder: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder =
        CfnPartnerAccount.SidewalkUpdateAccountProperty.builder()

    public fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
    }

    public fun build(): CfnPartnerAccount.SidewalkUpdateAccountProperty = cdkBuilder.build()
}
