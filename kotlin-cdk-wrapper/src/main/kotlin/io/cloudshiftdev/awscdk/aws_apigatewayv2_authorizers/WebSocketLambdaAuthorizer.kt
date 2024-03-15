@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

public open class WebSocketLambdaAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer,
) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions):
      WebSocketRouteAuthorizerConfig =
      unwrap(this).bind(options.let(WebSocketRouteAuthorizerBindOptions::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)
  }

  private class BuilderImpl(
    id: String,
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer.Builder.create(id,
        handler)

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      block: Builder.() -> Unit = {},
    ): WebSocketLambdaAuthorizer {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return WebSocketLambdaAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer):
        WebSocketLambdaAuthorizer = WebSocketLambdaAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer =
        wrapped.cdkObject
  }
}
