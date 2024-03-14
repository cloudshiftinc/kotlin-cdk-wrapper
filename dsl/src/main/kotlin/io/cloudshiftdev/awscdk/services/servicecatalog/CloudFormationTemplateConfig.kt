package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface CloudFormationTemplateConfig {
  public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

  public fun httpUrl(): String

  public interface Builder {
    public fun assetBucket(assetBucket: IBucket) {
    }

    public fun httpUrl(httpUrl: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.builder()

    public override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    public override fun httpUrl(httpUrl: String) {
      cdkBuilder.httpUrl(httpUrl)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig,
  ) : CloudFormationTemplateConfig {
    public override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    public override fun httpUrl(): String = unwrap(this).getHttpUrl()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationTemplateConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig):
        CloudFormationTemplateConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationTemplateConfig):
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig = (wrapped as
        Wrapper).cdkObject
  }
}
