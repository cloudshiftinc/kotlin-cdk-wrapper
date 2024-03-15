@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface UserPoolDomainOptions {
  public fun cognitoDomain(): CognitoDomainOptions? =
      unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

  public fun customDomain(): CustomDomainOptions? =
      unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit)

    public fun customDomain(customDomain: CustomDomainOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions.builder()

    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions,
  ) : CdkObject(cdkObject), UserPoolDomainOptions {
    override fun cognitoDomain(): CognitoDomainOptions? =
        unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

    override fun customDomain(): CustomDomainOptions? =
        unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions):
        UserPoolDomainOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomainOptions):
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolDomainOptions
  }
}
