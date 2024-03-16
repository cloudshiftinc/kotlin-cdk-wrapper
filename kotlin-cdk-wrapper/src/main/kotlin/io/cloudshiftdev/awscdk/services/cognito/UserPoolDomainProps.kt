@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Props for UserPoolDomain construct.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Vpc vpc;
 * Certificate certificate;
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * UserPool userPool = new UserPool(this, "UserPool");
 * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "Client")
 * .userPool(userPool)
 * // Required minimal configuration for use with an ELB
 * .generateSecret(true)
 * .authFlows(AuthFlow.builder()
 * .userPassword(true)
 * .build())
 * .oAuth(OAuthSettings.builder()
 * .flows(OAuthFlows.builder()
 * .authorizationCodeGrant(true)
 * .build())
 * .scopes(List.of(OAuthScope.EMAIL))
 * .callbackUrls(List.of(String.format("https://%s/oauth2/idpresponse",
 * lb.getLoadBalancerDnsName())))
 * .build())
 * .build();
 * CfnUserPoolClient cfnClient = (CfnUserPoolClient)userPoolClient.getNode().getDefaultChild();
 * cfnClient.addPropertyOverride("RefreshTokenValidity", 1);
 * cfnClient.addPropertyOverride("SupportedIdentityProviders", List.of("COGNITO"));
 * UserPoolDomain userPoolDomain = UserPoolDomain.Builder.create(this, "Domain")
 * .userPool(userPool)
 * .cognitoDomain(CognitoDomainOptions.builder()
 * .domainPrefix("test-cdk-prefix")
 * .build())
 * .build();
 * lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(443)
 * .certificates(List.of(certificate))
 * .defaultAction(AuthenticateCognitoAction.Builder.create()
 * .userPool(userPool)
 * .userPoolClient(userPoolClient)
 * .userPoolDomain(userPoolDomain)
 * .next(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
 * .contentType("text/plain")
 * .messageBody("Authenticated")
 * .build()))
 * .build())
 * .build());
 * CfnOutput.Builder.create(this, "DNS")
 * .value(lb.getLoadBalancerDnsName())
 * .build();
 * ```
 */
public interface UserPoolDomainProps : UserPoolDomainOptions {
  /**
   * The user pool to which this domain should be associated.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolDomainProps]
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
    @JvmName("45e7891c358bdcd153323443516ebc1ce5c93e417d97bdc86e306547a7308e24")
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
    @JvmName("dea3e603365ec92e799e55d9c0c7220dc06e3cf4f9e6ccfdf2fcb5c27805d7dc")
    public fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit)

    /**
     * @param userPool The user pool to which this domain should be associated. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolDomainProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolDomainProps.builder()

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e7891c358bdcd153323443516ebc1ce5c93e417d97bdc86e306547a7308e24")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dea3e603365ec92e799e55d9c0c7220dc06e3cf4f9e6ccfdf2fcb5c27805d7dc")
    override fun customDomain(customDomain: CustomDomainOptions.Builder.() -> Unit): Unit =
        customDomain(CustomDomainOptions(customDomain))

    /**
     * @param userPool The user pool to which this domain should be associated. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainProps,
  ) : CdkObject(cdkObject), UserPoolDomainProps {
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
     * The user pool to which this domain should be associated.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolDomainProps):
        UserPoolDomainProps = CdkObjectWrappers.wrap(cdkObject) as UserPoolDomainProps

    internal fun unwrap(wrapped: UserPoolDomainProps):
        software.amazon.awscdk.services.cognito.UserPoolDomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolDomainProps
  }
}
