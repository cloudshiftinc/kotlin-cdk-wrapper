@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BucketAttributes

@CdkDslMarker
public class BucketAttributesDsl {
  private val cdkBuilder: BucketAttributes.Builder = BucketAttributes.builder()

  /**
   * @param account The account this existing bucket belongs to.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param bucketArn The ARN of the bucket.
   * At least one of bucketArn or bucketName must be
   * defined in order to initialize a bucket ref.
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param bucketDomainName The domain name of the bucket.
   */
  public fun bucketDomainName(bucketDomainName: String) {
    cdkBuilder.bucketDomainName(bucketDomainName)
  }

  /**
   * @param bucketDualStackDomainName The IPv6 DNS name of the specified bucket.
   */
  public fun bucketDualStackDomainName(bucketDualStackDomainName: String) {
    cdkBuilder.bucketDualStackDomainName(bucketDualStackDomainName)
  }

  /**
   * @param bucketName The name of the bucket.
   * If the underlying value of ARN is a string, the
   * name will be parsed from the ARN. Otherwise, the name is optional, but
   * some features that require the bucket name such as auto-creating a bucket
   * policy, won't work.
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketRegionalDomainName The regional domain name of the specified bucket.
   */
  public fun bucketRegionalDomainName(bucketRegionalDomainName: String) {
    cdkBuilder.bucketRegionalDomainName(bucketRegionalDomainName)
  }

  /**
   * @param bucketWebsiteNewUrlFormat Force the format of the website URL of the bucket.
   * This should be true for
   * regions launched since 2014.
   * @deprecated The correct website url format can be inferred automatically from the bucket
   * `region`.
   * Always provide the bucket region if the `bucketWebsiteUrl` will be used.
   * Alternatively provide the full `bucketWebsiteUrl` manually.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat: Boolean) {
    cdkBuilder.bucketWebsiteNewUrlFormat(bucketWebsiteNewUrlFormat)
  }

  /**
   * @param bucketWebsiteUrl The website URL of the bucket (if static web hosting is enabled).
   */
  public fun bucketWebsiteUrl(bucketWebsiteUrl: String) {
    cdkBuilder.bucketWebsiteUrl(bucketWebsiteUrl)
  }

  /**
   * @param encryptionKey KMS encryption key associated with this bucket.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param isWebsite If this bucket has been configured for static website hosting.
   */
  public fun isWebsite(isWebsite: Boolean) {
    cdkBuilder.isWebsite(isWebsite)
  }

  /**
   * @param notificationsHandlerRole The role to be used by the notifications handler.
   */
  public fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
    cdkBuilder.notificationsHandlerRole(notificationsHandlerRole)
  }

  /**
   * @param region The region this existing bucket is in.
   * Features that require the region (e.g. `bucketWebsiteUrl`) won't fully work
   * if the region cannot be correctly inferred.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): BucketAttributes = cdkBuilder.build()
}
