package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizer,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAuthorizerId(): String = unwrap(this).getAttrAuthorizerId()

  public open fun authType(): String? = unwrap(this).getAuthType()

  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  public open fun authorizerCredentials(): String? = unwrap(this).getAuthorizerCredentials()

  public open fun authorizerCredentials(`value`: String) {
    unwrap(this).setAuthorizerCredentials(`value`)
  }

  public open fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  public open fun authorizerResultTtlInSeconds(`value`: Number) {
    unwrap(this).setAuthorizerResultTtlInSeconds(`value`)
  }

  public open fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public open fun authorizerUri(`value`: String) {
    unwrap(this).setAuthorizerUri(`value`)
  }

  public open fun identitySource(): String? = unwrap(this).getIdentitySource()

  public open fun identitySource(`value`: String) {
    unwrap(this).setIdentitySource(`value`)
  }

  public open fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  public open fun identityValidationExpression(`value`: String) {
    unwrap(this).setIdentityValidationExpression(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun providerArns(): List<String> = unwrap(this).getProviderArns() ?: emptyList()

  public open fun providerArns(`value`: List<String>) {
    unwrap(this).setProviderArns(`value`)
  }

  public open fun providerArns(vararg `value`: String): Unit = providerArns(`value`.toList())

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.CfnAuthorizer.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAuthorizer):
        CfnAuthorizer = CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer):
        software.amazon.awscdk.services.apigateway.CfnAuthorizer = wrapped.cdkObject
  }
}
