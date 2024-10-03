@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * The mTLS authentication configuration for a custom domain name.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Bucket bucket;
 * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
 * String domainName = "example.com";
 * DomainName.Builder.create(this, "DomainName")
 * .domainName(domainName)
 * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
 * .mtls(MTLSConfig.builder()
 * .bucket(bucket)
 * .key("someca.pem")
 * .version("version")
 * .build())
 * .build();
 * ```
 */
public interface MTLSConfig {
  /**
   * The bucket that the trust store is hosted in.
   */
  public fun bucket(): IBucket

  /**
   * The key in S3 to look at for the trust store.
   */
  public fun key(): String

  /**
   * The version of the S3 object that contains your truststore.
   *
   * To specify a version, you must have versioning enabled for the S3 bucket.
   *
   * Default: - latest version
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [MTLSConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The bucket that the trust store is hosted in. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param key The key in S3 to look at for the trust store. 
     */
    public fun key(key: String)

    /**
     * @param version The version of the S3 object that contains your truststore.
     * To specify a version, you must have versioning enabled for the S3 bucket.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.MTLSConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.MTLSConfig.builder()

    /**
     * @param bucket The bucket that the trust store is hosted in. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param key The key in S3 to look at for the trust store. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param version The version of the S3 object that contains your truststore.
     * To specify a version, you must have versioning enabled for the S3 bucket.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.MTLSConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.MTLSConfig,
  ) : CdkObject(cdkObject),
      MTLSConfig {
    /**
     * The bucket that the trust store is hosted in.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The key in S3 to look at for the trust store.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The version of the S3 object that contains your truststore.
     *
     * To specify a version, you must have versioning enabled for the S3 bucket.
     *
     * Default: - latest version
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MTLSConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.MTLSConfig):
        MTLSConfig = CdkObjectWrappers.wrap(cdkObject) as? MTLSConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MTLSConfig):
        software.amazon.awscdk.services.apigatewayv2.MTLSConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.MTLSConfig
  }
}
