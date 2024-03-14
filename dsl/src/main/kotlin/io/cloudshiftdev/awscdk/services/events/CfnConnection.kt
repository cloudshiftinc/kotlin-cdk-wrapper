package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.CfnConnection,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSecretArn(): String = unwrap(this).getAttrSecretArn()

  public open fun authParameters(): Any? = unwrap(this).getAuthParameters()

  public open fun authParameters(`value`: IResolvable) {
    unwrap(this).setAuthParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun authParameters(`value`: AuthParametersProperty) {
    unwrap(this).setAuthParameters(`value`.let(AuthParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec5f6b852a44a1435db3f6d1f7c0a6b8f7fbc35da4d12cb8215710bee5e0daa4")
  public open fun authParameters(`value`: AuthParametersProperty.Builder.() -> Unit): Unit =
      authParameters(AuthParametersProperty(`value`))

  public open fun authorizationType(): String = unwrap(this).getAuthorizationType()

  public open fun authorizationType(`value`: String) {
    unwrap(this).setAuthorizationType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun authParameters(authParameters: IResolvable)

    public fun authParameters(authParameters: AuthParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94678fbe23b8920d06561e2226c4cfaf721f1b3ec79ed52a301a0ffc478061ed")
    public fun authParameters(authParameters: AuthParametersProperty.Builder.() -> Unit)

    public fun authorizationType(authorizationType: String)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnConnection.Builder =
        software.amazon.awscdk.services.events.CfnConnection.Builder.create(scope, id)

    override fun authParameters(authParameters: IResolvable) {
      cdkBuilder.authParameters(authParameters.let(IResolvable::unwrap))
    }

    override fun authParameters(authParameters: AuthParametersProperty) {
      cdkBuilder.authParameters(authParameters.let(AuthParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94678fbe23b8920d06561e2226c4cfaf721f1b3ec79ed52a301a0ffc478061ed")
    override fun authParameters(authParameters: AuthParametersProperty.Builder.() -> Unit): Unit =
        authParameters(AuthParametersProperty(authParameters))

    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection):
        CfnConnection = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection):
        software.amazon.awscdk.services.events.CfnConnection = wrapped.cdkObject
  }

  public interface BasicAuthParametersProperty {
    public fun password(): String

    public fun username(): String

    public interface Builder {
      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty,
    ) : BasicAuthParametersProperty {
      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty):
          BasicAuthParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.BasicAuthParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientParametersProperty {
    public fun clientId(): String

    public fun clientSecret(): String

    public interface Builder {
      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty.builder()

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty,
    ) : ClientParametersProperty {
      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty):
          ClientParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ClientParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ApiKeyAuthParametersProperty {
    public fun apiKeyName(): String

    public fun apiKeyValue(): String

    public interface Builder {
      public fun apiKeyName(apiKeyName: String)

      public fun apiKeyValue(apiKeyValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty.builder()

      override fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
      }

      override fun apiKeyValue(apiKeyValue: String) {
        cdkBuilder.apiKeyValue(apiKeyValue)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty,
    ) : ApiKeyAuthParametersProperty {
      override fun apiKeyName(): String = unwrap(this).getApiKeyName()

      override fun apiKeyValue(): String = unwrap(this).getApiKeyValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty):
          ApiKeyAuthParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ApiKeyAuthParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParameterProperty {
    public fun isValueSecret(): Any? = unwrap(this).getIsValueSecret()

    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun isValueSecret(isValueSecret: Boolean)

      public fun isValueSecret(isValueSecret: IResolvable)

      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty.builder()

      override fun isValueSecret(isValueSecret: Boolean) {
        cdkBuilder.isValueSecret(isValueSecret)
      }

      override fun isValueSecret(isValueSecret: IResolvable) {
        cdkBuilder.isValueSecret(isValueSecret.let(IResolvable::unwrap))
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnConnection.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty,
    ) : ParameterProperty {
      override fun isValueSecret(): Any? = unwrap(this).getIsValueSecret()

      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.events.CfnConnection.ParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConnectionHttpParametersProperty {
    public fun bodyParameters(): Any? = unwrap(this).getBodyParameters()

    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    public interface Builder {
      public fun bodyParameters(bodyParameters: IResolvable)

      public fun bodyParameters(bodyParameters: List<Any>)

      public fun bodyParameters(vararg bodyParameters: Any)

      public fun headerParameters(headerParameters: IResolvable)

      public fun headerParameters(headerParameters: List<Any>)

      public fun headerParameters(vararg headerParameters: Any)

      public fun queryStringParameters(queryStringParameters: IResolvable)

      public fun queryStringParameters(queryStringParameters: List<Any>)

      public fun queryStringParameters(vararg queryStringParameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty.builder()

      override fun bodyParameters(bodyParameters: IResolvable) {
        cdkBuilder.bodyParameters(bodyParameters.let(IResolvable::unwrap))
      }

      override fun bodyParameters(bodyParameters: List<Any>) {
        cdkBuilder.bodyParameters(bodyParameters)
      }

      override fun bodyParameters(vararg bodyParameters: Any): Unit =
          bodyParameters(bodyParameters.toList())

      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      override fun headerParameters(headerParameters: List<Any>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      override fun headerParameters(vararg headerParameters: Any): Unit =
          headerParameters(headerParameters.toList())

      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      override fun queryStringParameters(queryStringParameters: List<Any>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      override fun queryStringParameters(vararg queryStringParameters: Any): Unit =
          queryStringParameters(queryStringParameters.toList())

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty,
    ) : ConnectionHttpParametersProperty {
      override fun bodyParameters(): Any? = unwrap(this).getBodyParameters()

      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty):
          ConnectionHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionHttpParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.ConnectionHttpParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuthParametersProperty {
    public fun apiKeyAuthParameters(): Any? = unwrap(this).getApiKeyAuthParameters()

    public fun basicAuthParameters(): Any? = unwrap(this).getBasicAuthParameters()

    public fun invocationHttpParameters(): Any? = unwrap(this).getInvocationHttpParameters()

    public fun oAuthParameters(): Any? = unwrap(this).getOAuthParameters()

    public interface Builder {
      public fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable)

      public fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("723a82afcbbfa2ecd48766393c12b31448f0fac2c63f0643fcc5587494b8dccf")
      public
          fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty.Builder.() -> Unit)

      public fun basicAuthParameters(basicAuthParameters: IResolvable)

      public fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8391c04181ee307d13f27c4c07e9b7cb8da421d5c7083f0daa00b60cb0c742c")
      public
          fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty.Builder.() -> Unit)

      public fun invocationHttpParameters(invocationHttpParameters: IResolvable)

      public
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f4a8ec205c8ce9c11affdb1ec143bf824588bd19130a147201673fc31b12db")
      public
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit)

      public fun oAuthParameters(oAuthParameters: IResolvable)

      public fun oAuthParameters(oAuthParameters: OAuthParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1971362123bfe5682d0da49ac80108ae47f27a7beb3908b1961a0c1574b9db2e")
      public fun oAuthParameters(oAuthParameters: OAuthParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty.builder()

      override fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters.let(IResolvable::unwrap))
      }

      override fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty) {
        cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters.let(ApiKeyAuthParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("723a82afcbbfa2ecd48766393c12b31448f0fac2c63f0643fcc5587494b8dccf")
      override
          fun apiKeyAuthParameters(apiKeyAuthParameters: ApiKeyAuthParametersProperty.Builder.() -> Unit):
          Unit = apiKeyAuthParameters(ApiKeyAuthParametersProperty(apiKeyAuthParameters))

      override fun basicAuthParameters(basicAuthParameters: IResolvable) {
        cdkBuilder.basicAuthParameters(basicAuthParameters.let(IResolvable::unwrap))
      }

      override fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty) {
        cdkBuilder.basicAuthParameters(basicAuthParameters.let(BasicAuthParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8391c04181ee307d13f27c4c07e9b7cb8da421d5c7083f0daa00b60cb0c742c")
      override
          fun basicAuthParameters(basicAuthParameters: BasicAuthParametersProperty.Builder.() -> Unit):
          Unit = basicAuthParameters(BasicAuthParametersProperty(basicAuthParameters))

      override fun invocationHttpParameters(invocationHttpParameters: IResolvable) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters.let(IResolvable::unwrap))
      }

      override
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty) {
        cdkBuilder.invocationHttpParameters(invocationHttpParameters.let(ConnectionHttpParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f4a8ec205c8ce9c11affdb1ec143bf824588bd19130a147201673fc31b12db")
      override
          fun invocationHttpParameters(invocationHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit):
          Unit =
          invocationHttpParameters(ConnectionHttpParametersProperty(invocationHttpParameters))

      override fun oAuthParameters(oAuthParameters: IResolvable) {
        cdkBuilder.oAuthParameters(oAuthParameters.let(IResolvable::unwrap))
      }

      override fun oAuthParameters(oAuthParameters: OAuthParametersProperty) {
        cdkBuilder.oAuthParameters(oAuthParameters.let(OAuthParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1971362123bfe5682d0da49ac80108ae47f27a7beb3908b1961a0c1574b9db2e")
      override fun oAuthParameters(oAuthParameters: OAuthParametersProperty.Builder.() -> Unit):
          Unit = oAuthParameters(OAuthParametersProperty(oAuthParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty,
    ) : AuthParametersProperty {
      override fun apiKeyAuthParameters(): Any? = unwrap(this).getApiKeyAuthParameters()

      override fun basicAuthParameters(): Any? = unwrap(this).getBasicAuthParameters()

      override fun invocationHttpParameters(): Any? = unwrap(this).getInvocationHttpParameters()

      override fun oAuthParameters(): Any? = unwrap(this).getOAuthParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty):
          AuthParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.AuthParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OAuthParametersProperty {
    public fun authorizationEndpoint(): String

    public fun clientParameters(): Any

    public fun httpMethod(): String

    public fun oAuthHttpParameters(): Any? = unwrap(this).getOAuthHttpParameters()

    public interface Builder {
      public fun authorizationEndpoint(authorizationEndpoint: String)

      public fun clientParameters(clientParameters: IResolvable)

      public fun clientParameters(clientParameters: ClientParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69449c8ef7149b345eee5d7a1b69718c7908ca77a8c2da1131b583a13753e758")
      public fun clientParameters(clientParameters: ClientParametersProperty.Builder.() -> Unit)

      public fun httpMethod(httpMethod: String)

      public fun oAuthHttpParameters(oAuthHttpParameters: IResolvable)

      public fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e35f666f3d23291168480c694ab8d9cc79dd9dbbce39449a8b35b7755a6e1fb")
      public
          fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty.builder()

      override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      override fun clientParameters(clientParameters: IResolvable) {
        cdkBuilder.clientParameters(clientParameters.let(IResolvable::unwrap))
      }

      override fun clientParameters(clientParameters: ClientParametersProperty) {
        cdkBuilder.clientParameters(clientParameters.let(ClientParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69449c8ef7149b345eee5d7a1b69718c7908ca77a8c2da1131b583a13753e758")
      override fun clientParameters(clientParameters: ClientParametersProperty.Builder.() -> Unit):
          Unit = clientParameters(ClientParametersProperty(clientParameters))

      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      override fun oAuthHttpParameters(oAuthHttpParameters: IResolvable) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters.let(IResolvable::unwrap))
      }

      override fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty) {
        cdkBuilder.oAuthHttpParameters(oAuthHttpParameters.let(ConnectionHttpParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e35f666f3d23291168480c694ab8d9cc79dd9dbbce39449a8b35b7755a6e1fb")
      override
          fun oAuthHttpParameters(oAuthHttpParameters: ConnectionHttpParametersProperty.Builder.() -> Unit):
          Unit = oAuthHttpParameters(ConnectionHttpParametersProperty(oAuthHttpParameters))

      public fun build():
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty,
    ) : OAuthParametersProperty {
      override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

      override fun clientParameters(): Any = unwrap(this).getClientParameters()

      override fun httpMethod(): String = unwrap(this).getHttpMethod()

      override fun oAuthHttpParameters(): Any? = unwrap(this).getOAuthHttpParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty):
          OAuthParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthParametersProperty):
          software.amazon.awscdk.services.events.CfnConnection.OAuthParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
