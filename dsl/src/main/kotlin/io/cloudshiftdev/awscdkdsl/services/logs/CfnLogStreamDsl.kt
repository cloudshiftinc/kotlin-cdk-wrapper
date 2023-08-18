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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnLogStream
import software.constructs.Construct

/**
 * The `AWS::Logs::LogStream` resource specifies an Amazon CloudWatch Logs log stream in a specific
 * log group.
 *
 * A log stream represents the sequence of events coming from an application instance or resource
 * that you are monitoring.
 *
 * There is no limit on the number of log streams that you can create for a log group.
 *
 * You must use the following guidelines when naming a log stream:
 * * Log stream names must be unique within the log group.
 * * Log stream names can be between 1 and 512 characters long.
 * * The ':' (colon) and '*' (asterisk) characters are not allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnLogStream cfnLogStream = CfnLogStream.Builder.create(this, "MyCfnLogStream")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
@CdkDslMarker
public class CfnLogStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLogStream.Builder = CfnLogStream.Builder.create(scope, id)

    /**
     * The name of the log group where the log stream is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
     *
     * @param logGroupName The name of the log group where the log stream is created.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The name of the log stream.
     *
     * The name must be unique within the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
     *
     * @param logStreamName The name of the log stream.
     */
    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): CfnLogStream = cdkBuilder.build()
}
