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

public open class CognitoUserPoolsAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
  public override fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun cognitoUserPools(cognitoUserPools: List<IUserPool>)

    public fun cognitoUserPools(vararg cognitoUserPools: IUserPool)

    public fun identitySource(identitySource: String)

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

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun cognitoUserPools(cognitoUserPools: List<IUserPool>) {
      cdkBuilder.cognitoUserPools(cognitoUserPools.map(IUserPool::unwrap))
    }

    override fun cognitoUserPools(vararg cognitoUserPools: IUserPool): Unit =
        cognitoUserPools(cognitoUserPools.toList())

    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
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
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer = wrapped.cdkObject
  }
}