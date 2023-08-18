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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The properties that are applied when Amazon S3 is being used as the flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationS3SourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.S3SourcePropertiesProperty.Builder =
        CfnIntegration.S3SourcePropertiesProperty.builder()

    /** @param bucketName The Amazon S3 bucket name where the source files are stored. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
     *   stored.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun build(): CfnIntegration.S3SourcePropertiesProperty = cdkBuilder.build()
}
