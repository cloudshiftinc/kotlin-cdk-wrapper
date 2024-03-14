package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProductStack internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStack,
) : Stack(cdkObject) {
  public override fun templateFile(): String = unwrap(this).getTemplateFile()

  public interface Builder {
    public fun assetBucket(assetBucket: IBucket) {
    }

    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
    }

    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStack.Builder =
        software.amazon.awscdk.services.servicecatalog.ProductStack.Builder.create(scope, id)

    public override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    public override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    public override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
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
