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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * Identifies an Amazon Kinesis stream as the streaming source.
 *
 * You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon
 * Kinesis Analytics to access the stream on your behalf.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html)
 */
@CdkDslMarker
public class CfnApplicationKinesisStreamsInputPropertyDsl {
    private val cdkBuilder: CfnApplication.KinesisStreamsInputProperty.Builder =
        CfnApplication.KinesisStreamsInputProperty.builder()

    /** @param resourceArn ARN of the input Amazon Kinesis stream to read. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
     *   stream on your behalf. You need to grant the necessary permissions to this role.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnApplication.KinesisStreamsInputProperty = cdkBuilder.build()
}
