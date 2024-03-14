package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrAuthorizerId(): String = unwrap(this).getAttrAuthorizerId()

  public open fun authorizerCredentialsArn(): String? = unwrap(this).getAuthorizerCredentialsArn()

  public open fun authorizerCredentialsArn(`value`: String) {
    unwrap(this).setAuthorizerCredentialsArn(`value`)
  }

  public open fun authorizerPayloadFormatVersion(): String? =
      unwrap(this).getAuthorizerPayloadFormatVersion()

  public open fun authorizerPayloadFormatVersion(`value`: String) {
    unwrap(this).setAuthorizerPayloadFormatVersion(`value`)
  }

  public open fun authorizerResultTtlInSeconds(): Number? =
      unwrap(this).getAuthorizerResultTtlInSeconds()

  public open fun authorizerResultTtlInSeconds(`value`: Number) {
    unwrap(this).setAuthorizerResultTtlInSeconds(`value`)
  }

  public open fun authorizerType(): String = unwrap(this).getAuthorizerType()

  public open fun authorizerType(`value`: String) {
    unwrap(this).setAuthorizerType(`value`)
  }

  public open fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public open fun authorizerUri(`value`: String) {
    unwrap(this).setAuthorizerUri(`value`)
  }

  public open fun enableSimpleResponses(): Any? = unwrap(this).getEnableSimpleResponses()

  public open fun enableSimpleResponses(`value`: Boolean) {
    unwrap(this).setEnableSimpleResponses(`value`)
  }

  public open fun enableSimpleResponses(`value`: IResolvable) {
    unwrap(this).setEnableSimpleResponses(`value`.let(IResolvable::unwrap))
  }

  public open fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  public open fun identitySource(`value`: List<String>) {
    unwrap(this).setIdentitySource(`value`)
  }

  public open fun identitySource(vararg `value`: String): Unit = identitySource(`value`.toList())

  public open fun identityValidationExpression(): String? =
      unwrap(this).getIdentityValidationExpression()

  public open fun identityValidationExpression(`value`: String) {
    unwrap(this).setIdentityValidationExpression(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jwtConfiguration(): Any? = unwrap(this).getJwtConfiguration()

  public open fun jwtConfiguration(`value`: IResolvable) {
    unwrap(this).setJwtConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun jwtConfiguration(`value`: JWTConfigurationProperty) {
    unwrap(this).setJwtConfiguration(`value`.let(JWTConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7749c24721a741ada0617685d46a66f9ad0a0e7684058bd9e57e5d7410224bc2")
  public open fun jwtConfiguration(`value`: JWTConfigurationProperty.Builder.() -> Unit): Unit =
      jwtConfiguration(JWTConfigurationProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

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

    public fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e27125f0db7456c147dc77c030c5a26fe0b613bb82de1d4a8a9d63760df2af6c")
    public fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.Builder.create(scope, id)

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

    override fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty) {
      cdkBuilder.jwtConfiguration(jwtConfiguration.let(JWTConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e27125f0db7456c147dc77c030c5a26fe0b613bb82de1d4a8a9d63760df2af6c")
    override fun jwtConfiguration(jwtConfiguration: JWTConfigurationProperty.Builder.() -> Unit):
        Unit = jwtConfiguration(JWTConfigurationProperty(jwtConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer):
        CfnAuthorizer = CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer = wrapped.cdkObject
  }

  public interface JWTConfigurationProperty {
    public fun audience(): List<String> = unwrap(this).getAudience() ?: emptyList()

    public fun issuer(): String? = unwrap(this).getIssuer()

    public interface Builder {
      public fun audience(audience: List<String>)

      public fun audience(vararg audience: String)

      public fun issuer(issuer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty.builder()

      override fun audience(audience: List<String>) {
        cdkBuilder.audience(audience)
      }

      override fun audience(vararg audience: String): Unit = audience(audience.toList())

      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty,
    ) : JWTConfigurationProperty {
      override fun audience(): List<String> = unwrap(this).getAudience() ?: emptyList()

      override fun issuer(): String? = unwrap(this).getIssuer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JWTConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty):
          JWTConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JWTConfigurationProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
