@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class HttpJwtAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun jwtAudience(jwtAudience: List<String>)

    public fun jwtAudience(vararg jwtAudience: String)
  }

  private class BuilderImpl(
    id: String,
    jwtIssuer: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer.Builder.create(id,
        jwtIssuer)

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      jwtIssuer: String,
      block: Builder.() -> Unit = {},
    ): HttpJwtAuthorizer {
      val builderImpl = BuilderImpl(id, jwtIssuer)
      return HttpJwtAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer):
        HttpJwtAuthorizer = HttpJwtAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpJwtAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer = wrapped.cdkObject
  }
}
