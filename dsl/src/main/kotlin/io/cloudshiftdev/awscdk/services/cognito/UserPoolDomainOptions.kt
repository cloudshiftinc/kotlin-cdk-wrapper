package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface UserPoolDomainOptions {
  public fun cognitoDomain(): CognitoDomainOptions? =
      unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

  public fun customDomain(): CustomDomainOptions? =
      unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)

  public interface Builder {
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit)

    public fun customDomain(customDomain: CustomDomainOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions.builder()

    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions,
  ) : UserPoolDomainOptions {
    override fun cognitoDomain(): CognitoDomainOptions? =
        unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

    override fun customDomain(): CustomDomainOptions? =
        unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions):
        UserPoolDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomainOptions):
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions = (wrapped as
        Wrapper).cdkObject
  }
}
