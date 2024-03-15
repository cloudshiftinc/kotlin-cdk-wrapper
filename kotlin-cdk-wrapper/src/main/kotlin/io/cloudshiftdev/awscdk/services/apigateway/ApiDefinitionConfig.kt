@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ApiDefinitionConfig {
  public fun inlineDefinition(): Any? = unwrap(this).getInlineDefinition()

  public fun s3Location(): ApiDefinitionS3Location? =
      unwrap(this).getS3Location()?.let(ApiDefinitionS3Location::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun inlineDefinition(inlineDefinition: Any)

    public fun s3Location(s3Location: ApiDefinitionS3Location)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4eceb3142d927046d2ff9f8c231ea40847b258880f47c118a3b88b7a29b4b7d7")
    public fun s3Location(s3Location: ApiDefinitionS3Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig.Builder =
        software.amazon.awscdk.services.apigateway.ApiDefinitionConfig.builder()

    override fun inlineDefinition(inlineDefinition: Any) {
      cdkBuilder.inlineDefinition(inlineDefinition)
    }

    override fun s3Location(s3Location: ApiDefinitionS3Location) {
      cdkBuilder.s3Location(s3Location.let(ApiDefinitionS3Location::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4eceb3142d927046d2ff9f8c231ea40847b258880f47c118a3b88b7a29b4b7d7")
    override fun s3Location(s3Location: ApiDefinitionS3Location.Builder.() -> Unit): Unit =
        s3Location(ApiDefinitionS3Location(s3Location))

    public fun build(): software.amazon.awscdk.services.apigateway.ApiDefinitionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig,
  ) : CdkObject(cdkObject), ApiDefinitionConfig {
    override fun inlineDefinition(): Any? = unwrap(this).getInlineDefinition()

    override fun s3Location(): ApiDefinitionS3Location? =
        unwrap(this).getS3Location()?.let(ApiDefinitionS3Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDefinitionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionConfig):
        ApiDefinitionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinitionConfig):
        software.amazon.awscdk.services.apigateway.ApiDefinitionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
  }
}
