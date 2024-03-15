@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAuthorizerProps {
  public fun authType(): String? = unwrap(this).getAuthType()

  public fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

  public fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  public fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  public fun name(): String

  public fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

  public fun restApiId(): String

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun authorizerCredentials(authorizerCredentials: String)

    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

    public fun authorizerUri(authorizerUri: String)

    public fun identitySource(identitySource: String)

    public fun identityValidationExpression(identityValidationExpression: String)

    public fun name(name: String)

    public fun providerArns(providerArns: List<String>)

    public fun providerArns(vararg providerArns: String)

    public fun restApiId(restApiId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnAuthorizerProps.builder()

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun authorizerCredentials(authorizerCredentials: String) {
      cdkBuilder.authorizerCredentials(authorizerCredentials)
    }

    override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
      cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identityValidationExpression(identityValidationExpression: String) {
      cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun providerArns(providerArns: List<String>) {
      cdkBuilder.providerArns(providerArns)
    }

    override fun providerArns(vararg providerArns: String): Unit =
        providerArns(providerArns.toList())

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps,
  ) : CdkObject(cdkObject), CfnAuthorizerProps {
    override fun authType(): String? = unwrap(this).getAuthType()

    override fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

    override fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    override fun identitySource(): String? = unwrap(this).getIdentitySource()

    override fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    override fun name(): String = unwrap(this).getName()

    override fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizerProps):
        CfnAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizerProps):
        software.amazon.awscdk.services.apigateway.CfnAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
  }
}
