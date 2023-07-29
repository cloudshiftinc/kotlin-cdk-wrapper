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

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies the configuration for experiment logging to Amazon S3 .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-s3configuration.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateS3ConfigurationPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.S3ConfigurationProperty.Builder =
        CfnExperimentTemplate.S3ConfigurationProperty.builder()

    /** @param bucketName The name of the destination bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param prefix The bucket prefix. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnExperimentTemplate.S3ConfigurationProperty = cdkBuilder.build()
}
