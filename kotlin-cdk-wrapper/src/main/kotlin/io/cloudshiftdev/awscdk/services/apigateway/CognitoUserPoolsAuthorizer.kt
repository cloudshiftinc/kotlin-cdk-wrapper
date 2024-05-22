@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Cognito user pools based custom authorizer.
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
public open class CognitoUserPoolsAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CognitoUserPoolsAuthorizerProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CognitoUserPoolsAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CognitoUserPoolsAuthorizerProps.Builder.() -> Unit,
  ) : this(scope, id, CognitoUserPoolsAuthorizerProps(props)
  )

  /**
   * The authorization type of this authorizer.
   */
  public override fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  /**
   * The ARN of the authorizer to be used in permission policies, such as IAM and resource-based
   * grants.
   */
  public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

  /**
   * The id of the authorizer.
   */
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CognitoUserPoolsAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional human friendly name for the authorizer.
     *
     * Note that, this is not the primary identifier of the authorizer.
     *
     * Default: - the unique construct ID
     *
     * @param authorizerName An optional human friendly name for the authorizer. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * The user pools to associate with this authorizer.
     *
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    public fun cognitoUserPools(cognitoUserPools: List<IUserPool>)

    /**
     * The user pools to associate with this authorizer.
     *
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    public fun cognitoUserPools(vararg cognitoUserPools: IUserPool)

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
     * @param identitySource The request header mapping expression for the bearer token. 
     */
    public fun identitySource(identitySource: String)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer.Builder.create(scope,
        id)

    /**
     * An optional human friendly name for the authorizer.
     *
     * Note that, this is not the primary identifier of the authorizer.
     *
     * Default: - the unique construct ID
     *
     * @param authorizerName An optional human friendly name for the authorizer. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The user pools to associate with this authorizer.
     *
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    override fun cognitoUserPools(cognitoUserPools: List<IUserPool>) {
      cdkBuilder.cognitoUserPools(cognitoUserPools.map(IUserPool.Companion::unwrap))
    }

    /**
     * The user pools to associate with this authorizer.
     *
     * @param cognitoUserPools The user pools to associate with this authorizer. 
     */
    override fun cognitoUserPools(vararg cognitoUserPools: IUserPool): Unit =
        cognitoUserPools(cognitoUserPools.toList())

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
     * @param identitySource The request header mapping expression for the bearer token. 
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CognitoUserPoolsAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CognitoUserPoolsAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer):
        CognitoUserPoolsAuthorizer = CognitoUserPoolsAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CognitoUserPoolsAuthorizer):
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
  }
}
