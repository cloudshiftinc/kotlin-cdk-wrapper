@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * S3 origin configuration for CloudFront.
 *
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * ViewerCertificate viewerCertificate = ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("MYALIAS"))
 * .build());
 * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(viewerCertificate)
 * .build();
 * ```
 */
public interface S3OriginConfig {
  /**
   * The optional Origin Access Identity of the origin identity cloudfront will use when calling
   * your s3 bucket.
   *
   * Default: No Origin Access Identity which requires the S3 bucket to be public accessible
   */
  public fun originAccessIdentity(): IOriginAccessIdentity? =
      unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

  /**
   * Any additional headers to pass to the origin.
   *
   * Default: - No additional headers are passed.
   */
  public fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?: emptyMap()

  /**
   * The relative path to the origin root to use for sources.
   *
   * Default: /
   */
  public fun originPath(): String? = unwrap(this).getOriginPath()

  /**
   * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin, you
   * can get better network performance.
   *
   * Default: - origin shield not enabled
   */
  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  /**
   * The source bucket to serve content from.
   */
  public fun s3BucketSource(): IBucket

  /**
   * A builder for [S3OriginConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param originAccessIdentity The optional Origin Access Identity of the origin identity
     * cloudfront will use when calling your s3 bucket.
     */
    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity)

    /**
     * @param originHeaders Any additional headers to pass to the origin.
     */
    public fun originHeaders(originHeaders: Map<String, String>)

    /**
     * @param originPath The relative path to the origin root to use for sources.
     */
    public fun originPath(originPath: String)

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String)

    /**
     * @param s3BucketSource The source bucket to serve content from. 
     */
    public fun s3BucketSource(s3BucketSource: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder =
        software.amazon.awscdk.services.cloudfront.S3OriginConfig.builder()

    /**
     * @param originAccessIdentity The optional Origin Access Identity of the origin identity
     * cloudfront will use when calling your s3 bucket.
     */
    override fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
      cdkBuilder.originAccessIdentity(originAccessIdentity.let(IOriginAccessIdentity::unwrap))
    }

    /**
     * @param originHeaders Any additional headers to pass to the origin.
     */
    override fun originHeaders(originHeaders: Map<String, String>) {
      cdkBuilder.originHeaders(originHeaders)
    }

    /**
     * @param originPath The relative path to the origin root to use for sources.
     */
    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /**
     * @param s3BucketSource The source bucket to serve content from. 
     */
    override fun s3BucketSource(s3BucketSource: IBucket) {
      cdkBuilder.s3BucketSource(s3BucketSource.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.S3OriginConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginConfig,
  ) : CdkObject(cdkObject), S3OriginConfig {
    /**
     * The optional Origin Access Identity of the origin identity cloudfront will use when calling
     * your s3 bucket.
     *
     * Default: No Origin Access Identity which requires the S3 bucket to be public accessible
     */
    override fun originAccessIdentity(): IOriginAccessIdentity? =
        unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

    /**
     * Any additional headers to pass to the origin.
     *
     * Default: - No additional headers are passed.
     */
    override fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?:
        emptyMap()

    /**
     * The relative path to the origin root to use for sources.
     *
     * Default: /
     */
    override fun originPath(): String? = unwrap(this).getOriginPath()

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     */
    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    /**
     * The source bucket to serve content from.
     */
    override fun s3BucketSource(): IBucket = unwrap(this).getS3BucketSource().let(IBucket::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginConfig):
        S3OriginConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3OriginConfig):
        software.amazon.awscdk.services.cloudfront.S3OriginConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.S3OriginConfig
  }
}
