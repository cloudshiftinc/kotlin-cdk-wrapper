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
import software.amazon.awscdk.services.apigateway.CfnDeployment
import kotlin.String

@CdkDslMarker
public class CfnDeploymentAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnDeployment.AccessLogSettingProperty.Builder =
        CfnDeployment.AccessLogSettingProperty.builder()

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnDeployment.AccessLogSettingProperty = cdkBuilder.build()
}
