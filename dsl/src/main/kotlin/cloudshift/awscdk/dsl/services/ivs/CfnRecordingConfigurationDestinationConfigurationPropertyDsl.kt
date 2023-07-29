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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

/**
 * The DestinationConfiguration property type describes the location where recorded videos will be
 * stored.
 *
 * Each member represents a type of destination configuration. For recording, you define one and
 * only one type of destination configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivs.*;
 * DestinationConfigurationProperty destinationConfigurationProperty =
 * DestinationConfigurationProperty.builder()
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
 */
@CdkDslMarker
public class CfnRecordingConfigurationDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder =
        CfnRecordingConfiguration.DestinationConfigurationProperty.builder()

    /**
     * @param s3 An S3 destination configuration where recorded videos will be stored. See the
     *   [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
     *   property type for more information.
     */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /**
     * @param s3 An S3 destination configuration where recorded videos will be stored. See the
     *   [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
     *   property type for more information.
     */
    public fun s3(s3: CfnRecordingConfiguration.S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnRecordingConfiguration.DestinationConfigurationProperty =
        cdkBuilder.build()
}
