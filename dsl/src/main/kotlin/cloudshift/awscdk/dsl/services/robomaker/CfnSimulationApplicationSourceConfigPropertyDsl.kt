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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html)
 */
@CdkDslMarker
public class CfnSimulationApplicationSourceConfigPropertyDsl {
    private val cdkBuilder: CfnSimulationApplication.SourceConfigProperty.Builder =
        CfnSimulationApplication.SourceConfigProperty.builder()

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

    public fun build(): CfnSimulationApplication.SourceConfigProperty = cdkBuilder.build()
}
