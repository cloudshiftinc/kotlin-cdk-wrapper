@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAuthorizerProps {
  public fun apiId(): String

  public fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

  public fun authorizerPayloadFormatVersion(): String? =
      unwrap(this).getAuthorizerPayloadFormatVersion()

  public fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  public fun authorizerType(): String

  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  public fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  public fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun authorizerCredentialsArn(authorizerCredentialsArn: String)

    public fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String)

    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

    public fun authorizerType(authorizerType: String)

    public fun authorizerUri(authorizerUri: String)

    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    public fun enableSimpleResponses(enableSimpleResponses: IResolvable)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun identityValidationExpression(identityValidationExpression: String)

    public fun jwtConfiguration(jwtConfiguration: IResolvable)

    public fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b11f8a5034f85dc691738f6d297ffd0d7c87ee055ef978e9caf722477f84da16")
    public
        fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun authorizerCredentialsArn(authorizerCredentialsArn: String) {
      cdkBuilder.authorizerCredentialsArn(authorizerCredentialsArn)
    }

    override fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String) {
      cdkBuilder.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion)
    }

    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    override fun enableSimpleResponses(enableSimpleResponses: IResolvable) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses.let(IResolvable::unwrap))
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    override fun jwtConfiguration(jwtConfiguration: IResolvable) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(IResolvable::unwrap))
    }

    override fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(CfnAuthorizer.JWTConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b11f8a5034f85dc691738f6d297ffd0d7c87ee055ef978e9caf722477f84da16")
    override
        fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit):
        Unit = jwtConfiguration(CfnAuthorizer.JWTConfigurationProperty(jwtConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps,
  ) : CdkObject(cdkObject), CfnAuthorizerProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

    override fun authorizerPayloadFormatVersion(): String? =
        unwrap(this).getAuthorizerPayloadFormatVersion()

    override fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    override fun authorizerType(): String = unwrap(this).getAuthorizerType()

    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    override fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    override fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    override fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps):
        CfnAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps
  }
}
