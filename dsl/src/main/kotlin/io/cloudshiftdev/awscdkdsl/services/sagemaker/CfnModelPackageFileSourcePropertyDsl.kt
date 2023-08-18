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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Contains details regarding the file source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * FileSourceProperty fileSourceProperty = FileSourceProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .contentType("contentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-filesource.html)
 */
@CdkDslMarker
public class CfnModelPackageFileSourcePropertyDsl {
    private val cdkBuilder: CfnModelPackage.FileSourceProperty.Builder =
        CfnModelPackage.FileSourceProperty.builder()

    /** @param contentDigest The digest of the file source. */
    public fun contentDigest(contentDigest: String) {
        cdkBuilder.contentDigest(contentDigest)
    }

    /** @param contentType The type of content stored in the file source. */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param s3Uri The Amazon S3 URI for the file source. */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelPackage.FileSourceProperty = cdkBuilder.build()
}
