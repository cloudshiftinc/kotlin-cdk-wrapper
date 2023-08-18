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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnChannel

/**
 * The access log configuration parameters for your channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-logconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.LogConfigurationProperty.Builder =
        CfnChannel.LogConfigurationProperty.builder()

    /** @param logGroupName Sets a custom Amazon CloudWatch log group name. */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnChannel.LogConfigurationProperty = cdkBuilder.build()
}
