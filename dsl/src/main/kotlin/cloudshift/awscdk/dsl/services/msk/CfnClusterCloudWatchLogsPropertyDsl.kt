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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Details of the CloudWatch Logs destination for broker logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-cloudwatchlogs.html)
 */
@CdkDslMarker
public class CfnClusterCloudWatchLogsPropertyDsl {
    private val cdkBuilder: CfnCluster.CloudWatchLogsProperty.Builder =
        CfnCluster.CloudWatchLogsProperty.builder()

    /**
     * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
     *   destination.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether broker logs get sent to the specified CloudWatch Logs
     *   destination.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param logGroup The CloudWatch log group that is the destination for broker logs. */
    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnCluster.CloudWatchLogsProperty = cdkBuilder.build()
}
