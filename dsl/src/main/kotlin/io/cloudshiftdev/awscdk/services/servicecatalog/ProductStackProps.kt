package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.String
import kotlin.Unit

public interface ProductStackProps {
  /**
   * A Bucket can be passed to store assets, enabling ProductStack Asset support.
   *
   * Default: - No Bucket provided and Assets will not be supported.
   */
  public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

  /**
   * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
   *
   * Default: - No encryption is used
   */
  public fun serverSideEncryption(): ServerSideEncryption? =
      unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

  /**
   * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
   * assets.
   *
   * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
   */
  public fun serverSideEncryptionAwsKmsKeyId(): String? =
      unwrap(this).getServerSideEncryptionAwsKmsKeyId()

  /**
   * A builder for [ProductStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support.
     */
    public fun assetBucket(assetBucket: IBucket)

    /**
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket.
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets.
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStackProps.Builder
        = software.amazon.awscdk.services.servicecatalog.ProductStackProps.builder()

    /**
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support.
     */
    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    /**
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket.
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    /**
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets.
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackProps,
  ) : CdkObject(cdkObject), ProductStackProps {
    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     */
    override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     */
    override fun serverSideEncryption(): ServerSideEncryption? =
        unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     */
    override fun serverSideEncryptionAwsKmsKeyId(): String? =
        unwrap(this).getServerSideEncryptionAwsKmsKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProductStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackProps):
        ProductStackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProductStackProps):
        software.amazon.awscdk.services.servicecatalog.ProductStackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.ProductStackProps
  }
}
