@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.deployment.ServerSideEncryption
import kotlin.String
import kotlin.Unit

public interface ProductStackProps {
  public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

  public fun serverSideEncryption(): ServerSideEncryption? =
      unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

  public fun serverSideEncryptionAwsKmsKeyId(): String? =
      unwrap(this).getServerSideEncryptionAwsKmsKeyId()

  @CdkDslMarker
  public interface Builder {
    public fun assetBucket(assetBucket: IBucket)

    public fun serverSideEncryption(serverSideEncryption: ServerSideEncryption)

    public fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.ProductStackProps.Builder
        = software.amazon.awscdk.services.servicecatalog.ProductStackProps.builder()

    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption) {
      cdkBuilder.serverSideEncryption(serverSideEncryption.let(ServerSideEncryption::unwrap))
    }

    override fun serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId: String) {
      cdkBuilder.serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.ProductStackProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.ProductStackProps,
  ) : CdkObject(cdkObject), ProductStackProps {
    override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    override fun serverSideEncryption(): ServerSideEncryption? =
        unwrap(this).getServerSideEncryption()?.let(ServerSideEncryption::wrap)

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
