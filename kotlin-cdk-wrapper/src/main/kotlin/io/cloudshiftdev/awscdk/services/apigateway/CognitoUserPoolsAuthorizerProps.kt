@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CognitoUserPoolsAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun cognitoUserPools(): List<IUserPool>

  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun cognitoUserPools(cognitoUserPools: List<IUserPool>)

    public fun cognitoUserPools(vararg cognitoUserPools: IUserPool)

    public fun identitySource(identitySource: String)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.builder()

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

    public fun build(): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps,
  ) : CdkObject(cdkObject), CognitoUserPoolsAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun cognitoUserPools(): List<IUserPool> =
        unwrap(this).getCognitoUserPools().map(IUserPool::wrap)

    override fun identitySource(): String? = unwrap(this).getIdentitySource()

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
        CognitoUserPoolsAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoUserPoolsAuthorizerProps):
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
  }
}
