package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MTLSConfig.Builder =
        software.amazon.awscdk.services.apigateway.MTLSConfig.builder()

    /**
     * @param bucket The bucket that the trust store is hosted in. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
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

    public fun build(): software.amazon.awscdk.services.apigateway.MTLSConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MTLSConfig,
  ) : CdkObject(cdkObject), MTLSConfig {
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MTLSConfig): MTLSConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MTLSConfig): software.amazon.awscdk.services.apigateway.MTLSConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.MTLSConfig
  }
}
