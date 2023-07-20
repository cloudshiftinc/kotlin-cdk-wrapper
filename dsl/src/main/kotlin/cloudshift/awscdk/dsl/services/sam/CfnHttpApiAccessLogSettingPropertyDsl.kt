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
import software.amazon.awscdk.services.sam.CfnHttpApi
import kotlin.String

@CdkDslMarker
public class CfnHttpApiAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnHttpApi.AccessLogSettingProperty.Builder =
        CfnHttpApi.AccessLogSettingProperty.builder()

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnHttpApi.AccessLogSettingProperty = cdkBuilder.build()
}
