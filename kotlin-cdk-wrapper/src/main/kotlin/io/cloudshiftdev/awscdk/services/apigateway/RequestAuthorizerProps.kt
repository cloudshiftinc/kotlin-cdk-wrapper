@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RequestAuthorizerProps : LambdaAuthorizerProps {
  public fun identitySources(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun assumeRole(assumeRole: IRole)

    public fun authorizerName(authorizerName: String)

    public fun handler(handler: IFunction)

    public fun identitySources(identitySources: List<String>)

    public fun identitySources(vararg identitySources: String)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps.builder()

    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    override fun identitySources(identitySources: List<String>) {
      cdkBuilder.identitySources(identitySources)
    }

    override fun identitySources(vararg identitySources: String): Unit =
        identitySources(identitySources.toList())

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizerProps,
  ) : CdkObject(cdkObject), RequestAuthorizerProps {
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    override fun identitySources(): List<String> = unwrap(this).getIdentitySources()

    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizerProps):
        RequestAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestAuthorizerProps):
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
  }
}
