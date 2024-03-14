package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProductStack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStack,
) : Stack(cdkObject) {
  /**
   * The name of the CloudFormation template file emitted to the output directory during synthesis.
   *
   * Example value: `MyStack.template.json`
   */
  public override fun templateFile(): String = unwrap(this).getTemplateFile()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.ProductStack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     *
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support. 
     */
    public fun assetBucket(assetBucket: IBucket)

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     *
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket. 
     */
    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     *
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets. 
     */
    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStack.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStack.Builder.create(scope, id)

    /**
     * A Bucket can be passed to store assets, enabling ProductStack Asset support.
     *
     * Default: - No Bucket provided and Assets will not be supported.
     *
     * @param assetBucket A Bucket can be passed to store assets, enabling ProductStack Asset
     * support. 
     */
    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    /**
     * A ServerSideEncryption can be enabled to encrypt assets that are put into assetBucket.
     *
     * Default: - No encryption is used
     *
     * @param serverSideEncryption A ServerSideEncryption can be enabled to encrypt assets that are
     * put into assetBucket. 
     */
    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    /**
     * For AWS_KMS ServerSideEncryption a KMS KeyId must be provided which will be used to encrypt
     * assets.
     *
     * Default: - No KMS KeyId and SSE_KMS encryption cannot be used
     *
     * @param serverSideEncryptionAwsKmsKeyId For AWS_KMS ServerSideEncryption a KMS KeyId must be
     * provided which will be used to encrypt assets. 
     */
    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStack =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ProductStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ProductStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStack):
        ProductStack = ProductStack(cdkObject)

    internal fun unwrap(wrapped: ProductStack):
        software.amazon.awscdk.services.servicecatalog.ProductStack = wrapped.cdkObject
  }
}
