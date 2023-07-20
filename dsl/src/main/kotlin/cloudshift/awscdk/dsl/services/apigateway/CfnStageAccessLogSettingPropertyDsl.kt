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
import software.amazon.awscdk.services.apigateway.CfnStage
import kotlin.String

@CdkDslMarker
public class CfnStageAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnStage.AccessLogSettingProperty.Builder =
        CfnStage.AccessLogSettingProperty.builder()

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnStage.AccessLogSettingProperty = cdkBuilder.build()
}
