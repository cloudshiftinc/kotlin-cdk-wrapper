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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount

/**
 * Sidewalk update.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * SidewalkUpdateAccountProperty sidewalkUpdateAccountProperty =
 * SidewalkUpdateAccountProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkupdateaccount.html)
 */
@CdkDslMarker
public class CfnPartnerAccountSidewalkUpdateAccountPropertyDsl {
    private val cdkBuilder: CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder =
        CfnPartnerAccount.SidewalkUpdateAccountProperty.builder()

    /** @param appServerPrivateKey The new Sidewalk application server private key. */
    public fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
    }

    public fun build(): CfnPartnerAccount.SidewalkUpdateAccountProperty = cdkBuilder.build()
}
