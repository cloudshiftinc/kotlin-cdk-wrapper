package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface UserPoolDomainOptions {
  /**
   * Associate a cognito prefix domain with your user pool Either `customDomain` or `cognitoDomain`
   * must be specified.
   *
   * Default: - not set if `customDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
   */
  public fun cognitoDomain(): CognitoDomainOptions? =
      unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

  /**
   * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must be
   * specified.
   *
   * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
   */
  public fun customDomain(): CustomDomainOptions? =
      unwrap(this).getCustomDomain()?.let(CustomDomainOptions::wrap)

  /**
   * A builder for [UserPoolDomainOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions)

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit)

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    public fun customDomain(customDomain: CustomDomainOptions)

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions.builder()

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions::unwrap))
    }

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions::unwrap))
    }

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions,
  ) : CdkObject(cdkObject), UserPoolDomainOptions {
    /**
     * Associate a cognito prefix domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     *
     * Default: - not set if `customDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     */
    override fun cognitoDomain(): CognitoDomainOptions? =
        unwrap(this).getCognitoDomain()?.let(CognitoDomainOptions::wrap)

    /**
     * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must
     * be specified.
     *
     * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     */
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