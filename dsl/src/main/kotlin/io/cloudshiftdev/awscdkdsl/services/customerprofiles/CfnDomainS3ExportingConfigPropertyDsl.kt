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
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * The S3 location where Identity Resolution Jobs write result files.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * S3ExportingConfigProperty s3ExportingConfigProperty = S3ExportingConfigProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .s3KeyName("s3KeyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html)
 */
@CdkDslMarker
public class CfnDomainS3ExportingConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.S3ExportingConfigProperty.Builder =
        CfnDomain.S3ExportingConfigProperty.builder()

    /**
     * @param s3BucketName The name of the S3 bucket where Identity Resolution Jobs write result
     *   files.
     */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * @param s3KeyName The S3 key name of the location where Identity Resolution Jobs write result
     *   files.
     */
    public fun s3KeyName(s3KeyName: String) {
        cdkBuilder.s3KeyName(s3KeyName)
    }

    public fun build(): CfnDomain.S3ExportingConfigProperty = cdkBuilder.build()
}
