@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpJwtAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  public fun jwtAudience(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun jwtAudience(jwtAudience: List<String>)

    public fun jwtAudience(vararg jwtAudience: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps.builder()

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

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps,
  ) : CdkObject(cdkObject), HttpJwtAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    override fun jwtAudience(): List<String> = unwrap(this).getJwtAudience()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpJwtAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps):
        HttpJwtAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpJwtAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps
  }
}
