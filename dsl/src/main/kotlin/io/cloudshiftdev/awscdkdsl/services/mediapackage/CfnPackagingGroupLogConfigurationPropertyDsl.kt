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
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

/**
 * Sets a custom Amazon CloudWatch log group name for egress logs.
 *
 * If a log group name isn't specified, the default name is used:
 * /aws/MediaPackage/EgressAccessLogs.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-logconfiguration.html)
 */
@CdkDslMarker
public class CfnPackagingGroupLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnPackagingGroup.LogConfigurationProperty.Builder =
        CfnPackagingGroup.LogConfigurationProperty.builder()

    /**
     * @param logGroupName Sets a custom Amazon CloudWatch log group name for egress logs. If a log
     *   group name isn't specified, the default name is used: /aws/MediaPackage/EgressAccessLogs.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnPackagingGroup.LogConfigurationProperty = cdkBuilder.build()
}
