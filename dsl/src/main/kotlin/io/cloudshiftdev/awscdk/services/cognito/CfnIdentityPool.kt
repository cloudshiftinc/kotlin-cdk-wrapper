package io.cloudshiftdev.awscdk.services.cognito

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

public open class CfnIdentityPool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

  public open fun allowClassicFlow(`value`: Boolean) {
    unwrap(this).setAllowClassicFlow(`value`)
  }

  public open fun allowClassicFlow(`value`: IResolvable) {
    unwrap(this).setAllowClassicFlow(`value`.let(IResolvable::unwrap))
  }

  public open fun allowUnauthenticatedIdentities(): Any =
      unwrap(this).getAllowUnauthenticatedIdentities()

  public open fun allowUnauthenticatedIdentities(`value`: Boolean) {
    unwrap(this).setAllowUnauthenticatedIdentities(`value`)
  }

  public open fun allowUnauthenticatedIdentities(`value`: IResolvable) {
    unwrap(this).setAllowUnauthenticatedIdentities(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

  public open fun cognitoEvents(`value`: Any) {
    unwrap(this).setCognitoEvents(`value`)
  }

  public open fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

  public open fun cognitoIdentityProviders(`value`: IResolvable) {
    unwrap(this).setCognitoIdentityProviders(`value`.let(IResolvable::unwrap))
  }

  public open fun cognitoIdentityProviders(__idx_ac66f0: List<Any>) {
    unwrap(this).setCognitoIdentityProviders(__idx_ac66f0)
  }

  public open fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

  public open fun cognitoStreams(`value`: IResolvable) {
    unwrap(this).setCognitoStreams(`value`.let(IResolvable::unwrap))
  }

  public open fun cognitoStreams(`value`: CognitoStreamsProperty) {
    unwrap(this).setCognitoStreams(`value`.let(CognitoStreamsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa885a07e4fb84c14e3c14025f3c030f9bea5bdd938707ae42c3801e043e7d4b")
  public open fun cognitoStreams(`value`: CognitoStreamsProperty.Builder.() -> Unit): Unit =
      cognitoStreams(CognitoStreamsProperty(`value`))

  public open fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

  public open fun developerProviderName(`value`: String) {
    unwrap(this).setDeveloperProviderName(`value`)
  }

  public open fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

  public open fun identityPoolName(`value`: String) {
    unwrap(this).setIdentityPoolName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun openIdConnectProviderArns(): List<String> =
      unwrap(this).getOpenIdConnectProviderArns() ?: emptyList()

  public open fun openIdConnectProviderArns(`value`: List<String>) {
    unwrap(this).setOpenIdConnectProviderArns(`value`)
  }

  public open fun pushSync(): Any? = unwrap(this).getPushSync()

  public open fun pushSync(`value`: IResolvable) {
    unwrap(this).setPushSync(`value`.let(IResolvable::unwrap))
  }

  public open fun pushSync(`value`: PushSyncProperty) {
    unwrap(this).setPushSync(`value`.let(PushSyncProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76cb3757a18be8045a8aa6ce599d12caa89a8c5a6adccada41f342c7ce868ce8")
  public open fun pushSync(`value`: PushSyncProperty.Builder.() -> Unit): Unit =
      pushSync(PushSyncProperty(`value`))

  public open fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?:
      emptyList()

  public open fun samlProviderArns(`value`: List<String>) {
    unwrap(this).setSamlProviderArns(`value`)
  }

  public open fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()

  public open fun supportedLoginProviders(`value`: Any) {
    unwrap(this).setSupportedLoginProviders(`value`)
  }

  public interface Builder {
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    public fun allowClassicFlow(allowClassicFlow: IResolvable)

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable)

    public fun cognitoEvents(cognitoEvents: Any)

    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable)

    public fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>)

    public fun cognitoStreams(cognitoStreams: IResolvable)

    public fun cognitoStreams(cognitoStreams: CognitoStreamsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7b28bad24809a271d41e21c713d6fad090f0b50d4de21405b2607e954d38d3")
    public fun cognitoStreams(cognitoStreams: CognitoStreamsProperty.Builder.() -> Unit)

    public fun developerProviderName(developerProviderName: String)

    public fun identityPoolName(identityPoolName: String)

    public fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>)

    public fun pushSync(pushSync: IResolvable)

    public fun pushSync(pushSync: PushSyncProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab1604b65b10c62917c7a1248716a843ab7b22445c7854708a8209b63596cff1")
    public fun pushSync(pushSync: PushSyncProperty.Builder.() -> Unit)

    public fun samlProviderArns(samlProviderArns: List<String>)

    public fun supportedLoginProviders(supportedLoginProviders: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnIdentityPool.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPool.Builder.create(scope, id)

    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    override fun allowClassicFlow(allowClassicFlow: IResolvable) {
      cdkBuilder.allowClassicFlow(allowClassicFlow.let(IResolvable::unwrap))
    }

    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities.let(IResolvable::unwrap))
    }

    override fun cognitoEvents(cognitoEvents: Any) {
      cdkBuilder.cognitoEvents(cognitoEvents)
    }

    override fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders.let(IResolvable::unwrap))
    }

    override fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    override fun cognitoStreams(cognitoStreams: IResolvable) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(IResolvable::unwrap))
    }

    override fun cognitoStreams(cognitoStreams: CognitoStreamsProperty) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(CognitoStreamsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7b28bad24809a271d41e21c713d6fad090f0b50d4de21405b2607e954d38d3")
    override fun cognitoStreams(cognitoStreams: CognitoStreamsProperty.Builder.() -> Unit): Unit =
        cognitoStreams(CognitoStreamsProperty(cognitoStreams))

    override fun developerProviderName(developerProviderName: String) {
      cdkBuilder.developerProviderName(developerProviderName)
    }

    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    override fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>) {
      cdkBuilder.openIdConnectProviderArns(openIdConnectProviderArns)
    }

    override fun pushSync(pushSync: IResolvable) {
      cdkBuilder.pushSync(pushSync.let(IResolvable::unwrap))
    }

    override fun pushSync(pushSync: PushSyncProperty) {
      cdkBuilder.pushSync(pushSync.let(PushSyncProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab1604b65b10c62917c7a1248716a843ab7b22445c7854708a8209b63596cff1")
    override fun pushSync(pushSync: PushSyncProperty.Builder.() -> Unit): Unit =
        pushSync(PushSyncProperty(pushSync))

    override fun samlProviderArns(samlProviderArns: List<String>) {
      cdkBuilder.samlProviderArns(samlProviderArns)
    }

    override fun supportedLoginProviders(supportedLoginProviders: Any) {
      cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPool = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool):
        CfnIdentityPool = CfnIdentityPool(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPool):
        software.amazon.awscdk.services.cognito.CfnIdentityPool = wrapped.cdkObject
  }

  public interface CognitoIdentityProviderProperty {
    public fun clientId(): String

    public fun providerName(): String

    public fun serverSideTokenCheck(): Any? = unwrap(this).getServerSideTokenCheck()

    public interface Builder {
      public fun clientId(clientId: String)

      public fun providerName(providerName: String)

      public fun serverSideTokenCheck(serverSideTokenCheck: Boolean)

      public fun serverSideTokenCheck(serverSideTokenCheck: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.builder()

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
      }

      override fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
      }

      override fun serverSideTokenCheck(serverSideTokenCheck: IResolvable) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty,
    ) : CognitoIdentityProviderProperty {
      override fun clientId(): String = unwrap(this).getClientId()

      override fun providerName(): String = unwrap(this).getProviderName()

      override fun serverSideTokenCheck(): Any? = unwrap(this).getServerSideTokenCheck()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoIdentityProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty):
          CognitoIdentityProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoIdentityProviderProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CognitoStreamsProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun streamName(): String? = unwrap(this).getStreamName()

    public fun streamingStatus(): String? = unwrap(this).getStreamingStatus()

    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun streamName(streamName: String)

      public fun streamingStatus(streamingStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      override fun streamingStatus(streamingStatus: String) {
        cdkBuilder.streamingStatus(streamingStatus)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty,
    ) : CognitoStreamsProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun streamName(): String? = unwrap(this).getStreamName()

      override fun streamingStatus(): String? = unwrap(this).getStreamingStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoStreamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty):
          CognitoStreamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoStreamsProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PushSyncProperty {
    public fun applicationArns(): List<String> = unwrap(this).getApplicationArns() ?: emptyList()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun applicationArns(applicationArns: List<String>)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.builder()

      override fun applicationArns(applicationArns: List<String>) {
        cdkBuilder.applicationArns(applicationArns)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty,
    ) : PushSyncProperty {
      override fun applicationArns(): List<String> = unwrap(this).getApplicationArns() ?:
          emptyList()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PushSyncProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty):
          PushSyncProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PushSyncProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
