@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

public interface TokenAuthorizerProps : LambdaAuthorizerProps {
  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  public fun validationRegex(): String? = unwrap(this).getValidationRegex()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRole(assumeRole: IRole)

    public fun authorizerName(authorizerName: String)

    public fun handler(handler: IFunction)

    public fun identitySource(identitySource: String)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    public fun validationRegex(validationRegex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigateway.TokenAuthorizerProps.builder()

    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.TokenAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps,
  ) : CdkObject(cdkObject), TokenAuthorizerProps {
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    override fun identitySource(): String? = unwrap(this).getIdentitySource()

    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    override fun validationRegex(): String? = unwrap(this).getValidationRegex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TokenAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps):
        TokenAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TokenAuthorizerProps):
        software.amazon.awscdk.services.apigateway.TokenAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
  }
}