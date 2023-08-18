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

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/**
 * The `PublicAccessBlock` configuration that you want to apply to this Amazon S3 account.
 *
 * You can enable the configuration options in any combination. For more information about when
 * Amazon S3 considers a bucket or object public, see
 * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
 * in the *Amazon S3 User Guide* .
 *
 * This data type is not supported for Amazon S3 on Outposts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
 * PublicAccessBlockConfigurationProperty.builder()
 * .blockPublicAcls(false)
 * .blockPublicPolicy(false)
 * .ignorePublicAcls(false)
 * .restrictPublicBuckets(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-publicaccessblockconfiguration.html)
 */
@CdkDslMarker
public class CfnAccessPointPublicAccessBlockConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder =
        CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

    /**
     * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
     *   (ACLs) for buckets in this account. Setting this element to `TRUE` causes the following
     *   behavior:
     * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    /**
     * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
     *   (ACLs) for buckets in this account. Setting this element to `TRUE` causes the following
     *   behavior:
     * * `PutBucketAcl` and `PutObjectAcl` calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    /**
     * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies for
     *   buckets in this account. Setting this element to `TRUE` causes Amazon S3 to reject calls to
     *   PUT Bucket policy if the specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies for
     *   buckets in this account. Setting this element to `TRUE` causes Amazon S3 to reject calls to
     *   PUT Bucket policy if the specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets in
     *   this account. Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on
     *   buckets in this account and any objects that they contain.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
     * new public ACLs from being set.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    /**
     * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for buckets in
     *   this account. Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on
     *   buckets in this account and any objects that they contain.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
     * new public ACLs from being set.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    /**
     * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
     *   policies for buckets in this account. Setting this element to `TRUE` restricts access to
     *   buckets with public policies to only AWS service principals and authorized users within
     *   this account.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public
     * and cross-account access within any public bucket policy, including non-public delegation to
     * specific accounts, is blocked.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    /**
     * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
     *   policies for buckets in this account. Setting this element to `TRUE` restricts access to
     *   buckets with public policies to only AWS service principals and authorized users within
     *   this account.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public
     * and cross-account access within any public bucket policy, including non-public delegation to
     * specific accounts, is blocked.
     *
     * This property is not supported for Amazon S3 on Outposts.
     */
    public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): CfnAccessPoint.PublicAccessBlockConfigurationProperty = cdkBuilder.build()
}
