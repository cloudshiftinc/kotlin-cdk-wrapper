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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.refactorspaces.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceLambdaEndpointInputPropertyDsl {
    private val cdkBuilder: CfnService.LambdaEndpointInputProperty.Builder =
        CfnService.LambdaEndpointInputProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnService.LambdaEndpointInputProperty = cdkBuilder.build()
}
