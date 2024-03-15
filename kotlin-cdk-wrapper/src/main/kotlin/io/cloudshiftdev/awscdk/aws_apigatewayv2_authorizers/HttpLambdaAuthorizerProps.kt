@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpLambdaAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  public fun responseTypes(): List<HttpLambdaResponseType> =
      unwrap(this).getResponseTypes()?.map(HttpLambdaResponseType::wrap) ?: emptyList()

  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun responseTypes(responseTypes: List<HttpLambdaResponseType>)

    public fun responseTypes(vararg responseTypes: HttpLambdaResponseType)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps.builder()

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun responseTypes(responseTypes: List<HttpLambdaResponseType>) {
      cdkBuilder.responseTypes(responseTypes.map(HttpLambdaResponseType::unwrap))
    }

    override fun responseTypes(vararg responseTypes: HttpLambdaResponseType): Unit =
        responseTypes(responseTypes.toList())

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps,
  ) : CdkObject(cdkObject), HttpLambdaAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    override fun responseTypes(): List<HttpLambdaResponseType> =
        unwrap(this).getResponseTypes()?.map(HttpLambdaResponseType::wrap) ?: emptyList()

    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpLambdaAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps):
        HttpLambdaAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps
  }
}
