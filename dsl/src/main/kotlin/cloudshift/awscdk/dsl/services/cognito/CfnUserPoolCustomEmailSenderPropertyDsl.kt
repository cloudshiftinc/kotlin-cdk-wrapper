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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.String

@CdkDslMarker
public class CfnUserPoolCustomEmailSenderPropertyDsl {
    private val cdkBuilder: CfnUserPool.CustomEmailSenderProperty.Builder =
        CfnUserPool.CustomEmailSenderProperty.builder()

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
    }

    public fun build(): CfnUserPool.CustomEmailSenderProperty = cdkBuilder.build()
}
