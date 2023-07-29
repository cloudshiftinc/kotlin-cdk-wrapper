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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html)
 */
@CdkDslMarker
public class CfnApiAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnApi.AccessLogSettingProperty.Builder =
        CfnApi.AccessLogSettingProperty.builder()

    /** @param destinationArn the value to be set. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /** @param format the value to be set. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnApi.AccessLogSettingProperty = cdkBuilder.build()
}
