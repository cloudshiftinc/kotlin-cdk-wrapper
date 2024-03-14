package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit

public interface SourceAccessConfiguration {
  public fun type(): SourceAccessConfigurationType

  public fun uri(): String

  public interface Builder {
    public fun type(type: SourceAccessConfigurationType) {
    }

    public fun uri(uri: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.SourceAccessConfiguration.Builder
        = software.amazon.awscdk.services.lambda.SourceAccessConfiguration.builder()

    public override fun type(type: SourceAccessConfigurationType) {
      cdkBuilder.type(type.let(SourceAccessConfigurationType::unwrap))
    }

    public override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.lambda.SourceAccessConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration,
  ) : SourceAccessConfiguration {
    public override fun type(): SourceAccessConfigurationType =
        unwrap(this).getType().let(SourceAccessConfigurationType::wrap)

    public override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceAccessConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SourceAccessConfiguration):
        SourceAccessConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceAccessConfiguration):
        software.amazon.awscdk.services.lambda.SourceAccessConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
