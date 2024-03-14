package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public interface CognitoDomainOptions {
  public fun domainPrefix(): String

  public interface Builder {
    public fun domainPrefix(domainPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CognitoDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.CognitoDomainOptions.builder()

    override fun domainPrefix(domainPrefix: String) {
      cdkBuilder.domainPrefix(domainPrefix)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions,
  ) : CognitoDomainOptions {
    override fun domainPrefix(): String = unwrap(this).getDomainPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CognitoDomainOptions):
        CognitoDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoDomainOptions):
        software.amazon.awscdk.services.cognito.CognitoDomainOptions = (wrapped as
        Wrapper).cdkObject
  }
}
