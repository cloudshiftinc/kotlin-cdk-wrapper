@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for CognitoUserPoolsAuthorizer.
 *
 * Example:
 *
 * ```
 * Resource books;
 * UserPool userPool = new UserPool(this, "UserPool");
 * CognitoUserPoolsAuthorizer auth = CognitoUserPoolsAuthorizer.Builder.create(this,
 * "booksAuthorizer")
 * .cognitoUserPools(List.of(userPool))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .authorizationType(AuthorizationType.COGNITO)
 * .build());
 * ```
 */
public interface CognitoUserPoolsAuthorizerProps {
  /**
   * An optional human friendly name for the authorizer.
   *
   * Note that, this is not the primary identifier of the authorizer.
   *
   * Default: - the unique construct ID
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The user pools to associate with this authorizer.
   */
  public fun cognitoUserPools(): List<IUserPool>

  /**
   * The request header mapping expression for the bearer token.
   *
   * This is typically passed as part of the header, in which case
   * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
   * the bearer token.
   *
   * Default: `IdentitySource.header('Authorization')`
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
   */
  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  /**
   * How long APIGateway should cache the results.
   *
   * Max 1 hour.
   * Disable caching by setting this to 0.
   *
   * Default: Duration.minutes(5)
   */
  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  /**
   * A builder for [CognitoUserPoolsAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    public fun cognitoUserPools(cognitoUserPools: List<IUserPool>)

    /**
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    public fun cognitoUserPools(vararg cognitoUserPools: IUserPool)

    /**
     * @param identitySource The request header mapping expression for the bearer token.
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     */
    public fun identitySource(identitySource: String)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.builder()

    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    override fun cognitoUserPools(cognitoUserPools: List<IUserPool>) {
      cdkBuilder.cognitoUserPools(cognitoUserPools.map(IUserPool::unwrap))
    }

    /**
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    override fun cognitoUserPools(vararg cognitoUserPools: IUserPool): Unit =
        cognitoUserPools(cognitoUserPools.toList())

    /**
     * @param identitySource The request header mapping expression for the bearer token.
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps,
  ) : CdkObject(cdkObject), CognitoUserPoolsAuthorizerProps {
    /**
     * An optional human friendly name for the authorizer.
     *
     * Note that, this is not the primary identifier of the authorizer.
     *
     * Default: - the unique construct ID
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The user pools to associate with this authorizer.
     */
    override fun cognitoUserPools(): List<IUserPool> =
        unwrap(this).getCognitoUserPools().map(IUserPool::wrap)

    /**
     * The request header mapping expression for the bearer token.
     *
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     *
     * Default: `IdentitySource.header('Authorization')`
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
     */
    override fun identitySource(): String? = unwrap(this).getIdentitySource()

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: Duration.minutes(5)
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoUserPoolsAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps):
        CognitoUserPoolsAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as?
        CognitoUserPoolsAuthorizerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoUserPoolsAuthorizerProps):
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
  }
}
