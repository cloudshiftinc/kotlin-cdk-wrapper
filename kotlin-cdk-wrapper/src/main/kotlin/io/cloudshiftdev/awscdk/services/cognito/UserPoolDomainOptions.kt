@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options to create a UserPoolDomain.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
 * .cognitoDomain(CognitoDomainOptions.builder()
 * .domainPrefix("my-awesome-app")
 * .build())
 * .build());
 * String certificateArn =
 * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
 * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
 * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
 * .customDomain(CustomDomainOptions.builder()
 * .domainName("user.myapp.com")
 * .certificate(domainCert)
 * .build())
 * .build());
 * ```
 */
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
   * A version that indicates the state of managed login.
   *
   * This choice applies to all app clients that host services at the domain.
   *
   * Default: undefined - Cognito default setting is ManagedLoginVersion.CLASSIC_HOSTED_UI
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
   */
  public fun managedLoginVersion(): ManagedLoginVersion? =
      unwrap(this).getManagedLoginVersion()?.let(ManagedLoginVersion::wrap)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)

    /**
     * @param managedLoginVersion A version that indicates the state of managed login.
     * This choice applies to all app clients that host services at the domain.
     */
    public fun managedLoginVersion(managedLoginVersion: ManagedLoginVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions.builder()

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions.Companion::unwrap))
    }

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dfdf999a6c80351b51e24ba1c5f7ce7cc7ab381feb8e2c28c960c6bfd9cc595")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions.Companion::unwrap))
    }

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f355c33c3329c4211feb603e44fea910ca6b9b83eaaf1260b1432a8479eb8b3f")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    /**
     * @param managedLoginVersion A version that indicates the state of managed login.
     * This choice applies to all app clients that host services at the domain.
     */
    override fun managedLoginVersion(managedLoginVersion: ManagedLoginVersion) {
      cdkBuilder.managedLoginVersion(managedLoginVersion.let(ManagedLoginVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions,
  ) : CdkObject(cdkObject),
      UserPoolDomainOptions {
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

    /**
     * A version that indicates the state of managed login.
     *
     * This choice applies to all app clients that host services at the domain.
     *
     * Default: undefined - Cognito default setting is ManagedLoginVersion.CLASSIC_HOSTED_UI
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     */
    override fun managedLoginVersion(): ManagedLoginVersion? =
        unwrap(this).getManagedLoginVersion()?.let(ManagedLoginVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainOptions):
        UserPoolDomainOptions = CdkObjectWrappers.wrap(cdkObject) as? UserPoolDomainOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomainOptions):
        software.amazon.awscdk.services.cognito.UserPoolDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolDomainOptions
  }
}
