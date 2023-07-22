@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointPublicAccessBlockConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder =
      CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

  /**
   * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
   * (ACLs) for this bucket and objects in this bucket.
   * Setting this element to `TRUE` causes the following behavior:
   *
   * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
   * * PUT Object calls fail if the request includes a public ACL.
   * * PUT Bucket calls fail if the request includes a public ACL.
   *
   * Enabling this setting doesn't affect existing policies or ACLs.
   */
  public fun blockPublicAcls(blockPublicAcls: Boolean) {
    cdkBuilder.blockPublicAcls(blockPublicAcls)
  }

  /**
   * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
   * (ACLs) for this bucket and objects in this bucket.
   * Setting this element to `TRUE` causes the following behavior:
   *
   * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
   * * PUT Object calls fail if the request includes a public ACL.
   * * PUT Bucket calls fail if the request includes a public ACL.
   *
   * Enabling this setting doesn't affect existing policies or ACLs.
   */
  public fun blockPublicAcls(blockPublicAcls: IResolvable) {
    cdkBuilder.blockPublicAcls(blockPublicAcls)
  }

  /**
   * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies for
   * this bucket.
   * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
   * specified bucket policy allows public access.
   *
   * Enabling this setting doesn't affect existing bucket policies.
   */
  public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  /**
   * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies for
   * this bucket.
   * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
   * specified bucket policy allows public access.
   *
   * Enabling this setting doesn't affect existing bucket policies.
   */
  public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
    cdkBuilder.blockPublicPolicy(blockPublicPolicy)
  }

  /**
   * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this bucket
   * and objects in this bucket.
   * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and
   * objects in this bucket.
   *
   * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
   * new public ACLs from being set.
   */
  public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
    cdkBuilder.ignorePublicAcls(ignorePublicAcls)
  }

  /**
   * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this bucket
   * and objects in this bucket.
   * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and
   * objects in this bucket.
   *
   * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
   * new public ACLs from being set.
   */
  public fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
    cdkBuilder.ignorePublicAcls(ignorePublicAcls)
  }

  /**
   * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket policies
   * for this bucket.
   * Setting this element to `TRUE` restricts access to this bucket to only AWS service principals
   * and authorized users within this account if the bucket has a public policy.
   *
   * Enabling this setting doesn't affect previously stored bucket policies, except that public and
   * cross-account access within any public bucket policy, including non-public delegation to specific
   * accounts, is blocked.
   */
  public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
    cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
  }

  /**
   * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket policies
   * for this bucket.
   * Setting this element to `TRUE` restricts access to this bucket to only AWS service principals
   * and authorized users within this account if the bucket has a public policy.
   *
   * Enabling this setting doesn't affect previously stored bucket policies, except that public and
   * cross-account access within any public bucket policy, including non-public delegation to specific
   * accounts, is blocked.
   */
  public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
    cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
  }

  public fun build(): CfnAccessPoint.PublicAccessBlockConfigurationProperty = cdkBuilder.build()
}
