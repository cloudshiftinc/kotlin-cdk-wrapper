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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Configuration information for exporting Identity Resolution results, for example, to an S3
 * bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ExportingConfigProperty exportingConfigProperty = ExportingConfigProperty.builder()
 * .s3Exporting(S3ExportingConfigProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .s3KeyName("s3KeyName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-exportingconfig.html)
 */
@CdkDslMarker
public class CfnDomainExportingConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.ExportingConfigProperty.Builder =
        CfnDomain.ExportingConfigProperty.builder()

    /** @param s3Exporting The S3 location where Identity Resolution Jobs write result files. */
    public fun s3Exporting(s3Exporting: IResolvable) {
        cdkBuilder.s3Exporting(s3Exporting)
    }

    /** @param s3Exporting The S3 location where Identity Resolution Jobs write result files. */
    public fun s3Exporting(s3Exporting: CfnDomain.S3ExportingConfigProperty) {
        cdkBuilder.s3Exporting(s3Exporting)
    }

    public fun build(): CfnDomain.ExportingConfigProperty = cdkBuilder.build()
}
