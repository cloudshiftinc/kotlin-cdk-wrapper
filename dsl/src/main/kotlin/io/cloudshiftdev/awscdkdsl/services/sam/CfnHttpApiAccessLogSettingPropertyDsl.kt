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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnHttpApi

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html)
 */
@CdkDslMarker
public class CfnHttpApiAccessLogSettingPropertyDsl {
    private val cdkBuilder: CfnHttpApi.AccessLogSettingProperty.Builder =
        CfnHttpApi.AccessLogSettingProperty.builder()

    /** @param destinationArn the value to be set. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /** @param format the value to be set. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnHttpApi.AccessLogSettingProperty = cdkBuilder.build()
}
