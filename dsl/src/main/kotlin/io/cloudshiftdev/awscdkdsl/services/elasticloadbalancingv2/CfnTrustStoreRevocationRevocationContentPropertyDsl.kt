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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation

/**
 * Information about a revocation file.
 *
 * You must specify `S3Bucket` and `S3Key` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * RevocationContentProperty revocationContentProperty = RevocationContentProperty.builder()
 * .revocationType("revocationType")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html)
 */
@CdkDslMarker
public class CfnTrustStoreRevocationRevocationContentPropertyDsl {
    private val cdkBuilder: CfnTrustStoreRevocation.RevocationContentProperty.Builder =
        CfnTrustStoreRevocation.RevocationContentProperty.builder()

    /** @param revocationType The type of revocation file. */
    public fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
    }

    /** @param s3Bucket The Amazon S3 bucket for the revocation file. */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /** @param s3Key The Amazon S3 path for the revocation file. */
    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    /** @param s3ObjectVersion The Amazon S3 object version of the revocation file. */
    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    public fun build(): CfnTrustStoreRevocation.RevocationContentProperty = cdkBuilder.build()
}
