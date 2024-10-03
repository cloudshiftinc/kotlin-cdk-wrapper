@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Information about a revocation file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * RevocationContent revocationContent = RevocationContent.builder()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .revocationType(RevocationType.CRL)
 * .version("version")
 * .build();
 * ```
 */
public interface RevocationContent {
  /**
   * The Amazon S3 bucket for the revocation file.
   */
  public fun bucket(): IBucket

  /**
   * The Amazon S3 path for the revocation file.
   */
  public fun key(): String

  /**
   * The type of revocation file.
   *
   * Default: RevocationType.CRL
   */
  public fun revocationType(): RevocationType? =
      unwrap(this).getRevocationType()?.let(RevocationType::wrap)

  /**
   * The Amazon S3 object version of the revocation file.
   *
   * Default: - latest version
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [RevocationContent]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The Amazon S3 bucket for the revocation file. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param key The Amazon S3 path for the revocation file. 
     */
    public fun key(key: String)

    /**
     * @param revocationType The type of revocation file.
     */
    public fun revocationType(revocationType: RevocationType)

    /**
     * @param version The Amazon S3 object version of the revocation file.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent.builder()

    /**
     * @param bucket The Amazon S3 bucket for the revocation file. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param key The Amazon S3 path for the revocation file. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param revocationType The type of revocation file.
     */
    override fun revocationType(revocationType: RevocationType) {
      cdkBuilder.revocationType(revocationType.let(RevocationType.Companion::unwrap))
    }

    /**
     * @param version The Amazon S3 object version of the revocation file.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent,
  ) : CdkObject(cdkObject),
      RevocationContent {
    /**
     * The Amazon S3 bucket for the revocation file.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The Amazon S3 path for the revocation file.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The type of revocation file.
     *
     * Default: RevocationType.CRL
     */
    override fun revocationType(): RevocationType? =
        unwrap(this).getRevocationType()?.let(RevocationType::wrap)

    /**
     * The Amazon S3 object version of the revocation file.
     *
     * Default: - latest version
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RevocationContent {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent):
        RevocationContent = CdkObjectWrappers.wrap(cdkObject) as? RevocationContent ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RevocationContent):
        software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.RevocationContent
  }
}
