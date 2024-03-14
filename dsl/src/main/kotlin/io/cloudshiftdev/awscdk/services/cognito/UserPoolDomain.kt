package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomain,
) : Resource(cdkObject), IUserPoolDomain {
  /**
   * The URL to the hosted UI associated with this domain.
   *
   * @param options options to customize baseUrl.
   */
  public open fun baseUrl(): String = unwrap(this).baseUrl()

  /**
   * The URL to the hosted UI associated with this domain.
   *
   * @param options options to customize baseUrl.
   */
  public open fun baseUrl(options: BaseUrlOptions): String =
      unwrap(this).baseUrl(options.let(BaseUrlOptions::unwrap))

  /**
   * The URL to the hosted UI associated with this domain.
   *
   * @param options options to customize baseUrl.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbce9e5406430247f9f9b6f1e760a8c938f6735eb79e08961bbfffd4ad1c779a")
  public open fun baseUrl(options: BaseUrlOptions.Builder.() -> Unit): String =
      baseUrl(BaseUrlOptions(options))

  /**
   * The domain name of the CloudFront distribution associated with the user pool domain.
   */
  public open fun cloudFrontDomainName(): String = unwrap(this).getCloudFrontDomainName()

  /**
   * The domain that was specified to be created.
   *
   * If `customDomain` was selected, this holds the full domain name that was specified.
   * If the `cognitoDomain` was used, it contains the prefix to the Cognito hosted domain.
   */
  public override fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The URL to the sign in page in this domain using a specific UserPoolClient.
   *
   * @param client [disable-awslint:ref-via-interface] the user pool client that the UI will use to
   * interact with the UserPool. 
   * @param options options to customize signInUrl. 
   */
  public open fun signInUrl(client: UserPoolClient, options: SignInUrlOptions): String =
      unwrap(this).signInUrl(client.let(UserPoolClient::unwrap),
      options.let(SignInUrlOptions::unwrap))

  /**
   * The URL to the sign in page in this domain using a specific UserPoolClient.
   *
   * @param client [disable-awslint:ref-via-interface] the user pool client that the UI will use to
   * interact with the UserPool. 
   * @param options options to customize signInUrl. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b54993e702335fda607f81a1fca80662f47d283172da434012f700f3aa4a879f")
  public open fun signInUrl(client: UserPoolClient, options: SignInUrlOptions.Builder.() -> Unit):
      String = signInUrl(client, SignInUrlOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Associate a cognito prefix domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     *
     * Default: - not set if `customDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified. 
     */
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions)

    /**
     * Associate a cognito prefix domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     *
     * Default: - not set if `customDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("974887aefd4b5de147eb00e9c0eb24fcb3e389c98e00bd5e3e345ca23d6881c7")
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit)

    /**
     * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must
     * be specified.
     *
     * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified. 
     */
    public fun customDomain(customDomain: CustomDomainOptions)

    /**
     * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must
     * be specified.
     *
     * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b96f3b76d1a0792b2db97811e072124454ea754c392879b0b317ae4cdd98107")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)

    /**
     * The user pool to which this domain should be associated.
     *
     * @param userPool The user pool to which this domain should be associated. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomain.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomain.Builder.create(scope, id)

    /**
     * Associate a cognito prefix domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     *
     * Default: - not set if `customDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified. 
     */
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
      cdkBuilder.cognitoDomain(cognitoDomain.let(CognitoDomainOptions::unwrap))
    }

    /**
     * Associate a cognito prefix domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified.
     *
     * Default: - not set if `customDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     * `customDomain` or `cognitoDomain` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("974887aefd4b5de147eb00e9c0eb24fcb3e389c98e00bd5e3e345ca23d6881c7")
    override fun cognitoDomain(cognitoDomain: CognitoDomainOptions.Builder.() -> Unit): Unit =
        cognitoDomain(CognitoDomainOptions(cognitoDomain))

    /**
     * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must
     * be specified.
     *
     * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified. 
     */
    override fun customDomain(customDomain: CustomDomainOptions) {
      cdkBuilder.customDomain(customDomain.let(CustomDomainOptions::unwrap))
    }

    /**
     * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must
     * be specified.
     *
     * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     * `cognitoDomain` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b96f3b76d1a0792b2db97811e072124454ea754c392879b0b317ae4cdd98107")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    /**
     * The user pool to which this domain should be associated.
     *
     * @param userPool The user pool to which this domain should be associated. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomain = cdkBuilder.build()
  }

  public companion object {
    public fun fromDomainName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolDomainName: String,
    ): IUserPoolDomain =
        software.amazon.awscdk.services.cognito.UserPoolDomain.fromDomainName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userPoolDomainName).let(IUserPoolDomain::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomain):
        UserPoolDomain = UserPoolDomain(cdkObject)

    internal fun unwrap(wrapped: UserPoolDomain):
        software.amazon.awscdk.services.cognito.UserPoolDomain = wrapped.cdkObject
  }
}
