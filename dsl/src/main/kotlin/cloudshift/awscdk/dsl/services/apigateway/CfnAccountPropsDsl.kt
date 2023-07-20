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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import kotlin.String

@CdkDslMarker
public class CfnAccountPropsDsl {
    private val cdkBuilder: CfnAccountProps.Builder = CfnAccountProps.builder()

    public fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
        cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): CfnAccountProps = cdkBuilder.build()
}
