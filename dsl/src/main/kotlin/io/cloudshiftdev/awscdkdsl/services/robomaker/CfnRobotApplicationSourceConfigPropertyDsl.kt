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

package io.cloudshiftdev.awscdkdsl.services.robomaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplication

/**
 * Information about a source configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * SourceConfigProperty sourceConfigProperty = SourceConfigProperty.builder()
 * .architecture("architecture")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html)
 */
@CdkDslMarker
public class CfnRobotApplicationSourceConfigPropertyDsl {
    private val cdkBuilder: CfnRobotApplication.SourceConfigProperty.Builder =
        CfnRobotApplication.SourceConfigProperty.builder()

    /** @param architecture The target processor architecture for the application. */
    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    /** @param s3Bucket The Amazon S3 bucket name. */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /** @param s3Key The s3 object key. */
    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnRobotApplication.SourceConfigProperty = cdkBuilder.build()
}
