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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.String

@CdkDslMarker
public class CfnApiAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnApi.AccessLogSettingProperty.Builder =
        CfnApi.AccessLogSettingProperty.builder()

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnApi.AccessLogSettingProperty = cdkBuilder.build()
}
