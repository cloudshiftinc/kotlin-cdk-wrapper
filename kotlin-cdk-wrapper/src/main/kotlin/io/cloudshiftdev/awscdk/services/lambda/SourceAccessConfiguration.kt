@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SourceAccessConfiguration {
  public fun type(): SourceAccessConfigurationType

  public fun uri(): String

  @CdkDslMarker
  public interface Builder {
    public fun type(type: SourceAccessConfigurationType)

    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.SourceAccessConfiguration.Builder
        = software.amazon.awscdk.services.lambda.SourceAccessConfiguration.builder()

    override fun type(type: SourceAccessConfigurationType) {
      cdkBuilder.type(type.let(SourceAccessConfigurationType::unwrap))
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.lambda.SourceAccessConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration,
  ) : CdkObject(cdkObject), SourceAccessConfiguration {
    override fun type(): SourceAccessConfigurationType =
        unwrap(this).getType().let(SourceAccessConfigurationType::wrap)

    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceAccessConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration):
        SourceAccessConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfiguration):
        software.amazon.awscdk.services.lambda.SourceAccessConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.SourceAccessConfiguration
  }
}
