package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener,
) : CfnResource(cdkObject), IInspectable {
  public open fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

  public open fun alpnPolicy(`value`: List<String>) {
    unwrap(this).setAlpnPolicy(`value`)
  }

  public open fun attrListenerArn(): String = unwrap(this).getAttrListenerArn()

  public open fun certificates(): Any? = unwrap(this).getCertificates()

  public open fun certificates(`value`: IResolvable) {
    unwrap(this).setCertificates(`value`.let(IResolvable::unwrap))
  }

  public open fun certificates(__idx_ac66f0: List<Any>) {
    unwrap(this).setCertificates(__idx_ac66f0)
  }

  public open fun defaultActions(): Any = unwrap(this).getDefaultActions()

  public open fun defaultActions(`value`: IResolvable) {
    unwrap(this).setDefaultActions(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultActions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaultActions(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

  public open fun loadBalancerArn(`value`: String) {
    unwrap(this).setLoadBalancerArn(`value`)
  }

  public open fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

  public open fun mutualAuthentication(`value`: IResolvable) {
    unwrap(this).setMutualAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun mutualAuthentication(`value`: MutualAuthenticationProperty) {
    unwrap(this).setMutualAuthentication(`value`.let(MutualAuthenticationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c9e407a19512c871db899a37b3eb962268ef3790578f834e35f148510992c13")
  public open fun mutualAuthentication(`value`: MutualAuthenticationProperty.Builder.() -> Unit):
      Unit = mutualAuthentication(MutualAuthenticationProperty(`value`))

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun protocol(): String? = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun sslPolicy(): String? = unwrap(this).getSslPolicy()

  public open fun sslPolicy(`value`: String) {
    unwrap(this).setSslPolicy(`value`)
  }

  public interface Builder {
    public fun alpnPolicy(alpnPolicy: List<String>)

    public fun certificates(certificates: IResolvable)

    public fun certificates(certificates: List<Any>)

    public fun defaultActions(defaultActions: IResolvable)

    public fun defaultActions(defaultActions: List<Any>)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun mutualAuthentication(mutualAuthentication: IResolvable)

    public fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5e9974f3e8e426d9a6c1f4b1089bd12c1c53d8336253e472d8a2e4cc5077c")
    public
        fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty.Builder.() -> Unit)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun sslPolicy(sslPolicy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.Builder.create(scope, id)

    override fun alpnPolicy(alpnPolicy: List<String>) {
      cdkBuilder.alpnPolicy(alpnPolicy)
    }

    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    override fun defaultActions(defaultActions: IResolvable) {
      cdkBuilder.defaultActions(defaultActions.let(IResolvable::unwrap))
    }

    override fun defaultActions(defaultActions: List<Any>) {
      cdkBuilder.defaultActions(defaultActions)
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun mutualAuthentication(mutualAuthentication: IResolvable) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
    }

    override fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(MutualAuthenticationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5e9974f3e8e426d9a6c1f4b1089bd12c1c53d8336253e472d8a2e4cc5077c")
    override
        fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualAuthentication(MutualAuthenticationProperty(mutualAuthentication))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun sslPolicy(sslPolicy: String) {
      cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListener(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener):
        CfnListener = CfnListener(cdkObject)

    internal fun unwrap(wrapped: CfnListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener = wrapped.cdkObject
  }

  public interface MutualAuthenticationProperty {
    public fun ignoreClientCertificateExpiry(): Any? =
        unwrap(this).getIgnoreClientCertificateExpiry()

    public fun mode(): String? = unwrap(this).getMode()

    public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

    public interface Builder {
      public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean)

      public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: IResolvable)

      public fun mode(mode: String)

      public fun trustStoreArn(trustStoreArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty.builder()

      override fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean) {
        cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry)
      }

      override fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: IResolvable) {
        cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry.let(IResolvable::unwrap))
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty,
    ) : MutualAuthenticationProperty {
      override fun ignoreClientCertificateExpiry(): Any? =
          unwrap(this).getIgnoreClientCertificateExpiry()

      override fun mode(): String? = unwrap(this).getMode()

      override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MutualAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty):
          MutualAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualAuthenticationProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupTupleProperty {
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun targetGroupArn(targetGroupArn: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty.builder()

      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty,
    ) : TargetGroupTupleProperty {
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty):
          TargetGroupTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupTupleProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FixedResponseConfigProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun messageBody(): String? = unwrap(this).getMessageBody()

    public fun statusCode(): String

    public interface Builder {
      public fun contentType(contentType: String)

      public fun messageBody(messageBody: String)

      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty.builder()

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      override fun messageBody(messageBody: String) {
        cdkBuilder.messageBody(messageBody)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty,
    ) : FixedResponseConfigProperty {
      override fun contentType(): String? = unwrap(this).getContentType()

      override fun messageBody(): String? = unwrap(this).getMessageBody()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty):
          FixedResponseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupStickinessConfigProperty {
    public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun durationSeconds(durationSeconds: Number)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty.builder()

      override fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty,
    ) : TargetGroupStickinessConfigProperty {
      override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetGroupStickinessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty):
          TargetGroupStickinessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupStickinessConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ForwardConfigProperty {
    public fun targetGroupStickinessConfig(): Any? = unwrap(this).getTargetGroupStickinessConfig()

    public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

    public interface Builder {
      public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable)

      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99f6637a85351cd3698125d7a5a5d7f3d544a374d5bc8cdf8f39ba6a59a24924")
      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit)

      public fun targetGroups(targetGroups: IResolvable)

      public fun targetGroups(targetGroups: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty.builder()

      override fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(IResolvable::unwrap))
      }

      override
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(TargetGroupStickinessConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99f6637a85351cd3698125d7a5a5d7f3d544a374d5bc8cdf8f39ba6a59a24924")
      override
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit):
          Unit =
          targetGroupStickinessConfig(TargetGroupStickinessConfigProperty(targetGroupStickinessConfig))

      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty,
    ) : ForwardConfigProperty {
      override fun targetGroupStickinessConfig(): Any? =
          unwrap(this).getTargetGroupStickinessConfig()

      override fun targetGroups(): Any? = unwrap(this).getTargetGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty):
          ForwardConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun authenticateCognitoConfig(): Any? = unwrap(this).getAuthenticateCognitoConfig()

    public fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

    public fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

    public fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

    public fun order(): Number? = unwrap(this).getOrder()

    public fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    public fun type(): String

    public interface Builder {
      public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable)

      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cfeea4b49561bdc6feb9f4a60a5021f2a1e580a6b079128d183fa90e53840ee")
      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit)

      public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable)

      public fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97ccd3442f5f1be7bb075d5d14d1278ef600cfa68d463c4e1284ef706743762a")
      public
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit)

      public fun fixedResponseConfig(fixedResponseConfig: IResolvable)

      public fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e689ad8c6214b741e6712db92a23bc2fe13065c763917aabd257dbc6b09faa59")
      public
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit)

      public fun forwardConfig(forwardConfig: IResolvable)

      public fun forwardConfig(forwardConfig: ForwardConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3634d8453b2a4e945ba0da08c10536d1f9821e671ce33ff1f9bb5a8da159ebb5")
      public fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit)

      public fun order(order: Number)

      public fun redirectConfig(redirectConfig: IResolvable)

      public fun redirectConfig(redirectConfig: RedirectConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a437908f5f7ed34380a4ccc3edfd03464aaf72d917ec3bf8ac2d6f1e5873aa3")
      public fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit)

      public fun targetGroupArn(targetGroupArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty.builder()

      override fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(IResolvable::unwrap))
      }

      override
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(AuthenticateCognitoConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cfeea4b49561bdc6feb9f4a60a5021f2a1e580a6b079128d183fa90e53840ee")
      override
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit):
          Unit =
          authenticateCognitoConfig(AuthenticateCognitoConfigProperty(authenticateCognitoConfig))

      override fun authenticateOidcConfig(authenticateOidcConfig: IResolvable) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig.let(IResolvable::unwrap))
      }

      override fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig.let(AuthenticateOidcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97ccd3442f5f1be7bb075d5d14d1278ef600cfa68d463c4e1284ef706743762a")
      override
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit):
          Unit = authenticateOidcConfig(AuthenticateOidcConfigProperty(authenticateOidcConfig))

      override fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(IResolvable::unwrap))
      }

      override fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(FixedResponseConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e689ad8c6214b741e6712db92a23bc2fe13065c763917aabd257dbc6b09faa59")
      override
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit):
          Unit = fixedResponseConfig(FixedResponseConfigProperty(fixedResponseConfig))

      override fun forwardConfig(forwardConfig: IResolvable) {
        cdkBuilder.forwardConfig(forwardConfig.let(IResolvable::unwrap))
      }

      override fun forwardConfig(forwardConfig: ForwardConfigProperty) {
        cdkBuilder.forwardConfig(forwardConfig.let(ForwardConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3634d8453b2a4e945ba0da08c10536d1f9821e671ce33ff1f9bb5a8da159ebb5")
      override fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit): Unit =
          forwardConfig(ForwardConfigProperty(forwardConfig))

      override fun order(order: Number) {
        cdkBuilder.order(order)
      }

      override fun redirectConfig(redirectConfig: IResolvable) {
        cdkBuilder.redirectConfig(redirectConfig.let(IResolvable::unwrap))
      }

      override fun redirectConfig(redirectConfig: RedirectConfigProperty) {
        cdkBuilder.redirectConfig(redirectConfig.let(RedirectConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a437908f5f7ed34380a4ccc3edfd03464aaf72d917ec3bf8ac2d6f1e5873aa3")
      override fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit): Unit =
          redirectConfig(RedirectConfigProperty(redirectConfig))

      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty,
    ) : ActionProperty {
      override fun authenticateCognitoConfig(): Any? = unwrap(this).getAuthenticateCognitoConfig()

      override fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

      override fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

      override fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

      override fun order(): Number? = unwrap(this).getOrder()

      override fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CertificateProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public interface Builder {
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty,
    ) : CertificateProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty):
          CertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuthenticateOidcConfigProperty {
    public fun authenticationRequestExtraParams(): Any? =
        unwrap(this).getAuthenticationRequestExtraParams()

    public fun authorizationEndpoint(): String

    public fun clientId(): String

    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    public fun issuer(): String

    public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

    public fun scope(): String? = unwrap(this).getScope()

    public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    public fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

    public fun tokenEndpoint(): String

    public fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

    public fun userInfoEndpoint(): String

    public interface Builder {
      public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable)

      public
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

      public fun authorizationEndpoint(authorizationEndpoint: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun issuer(issuer: String)

      public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

      public fun scope(scope: String)

      public fun sessionCookieName(sessionCookieName: String)

      public fun sessionTimeout(sessionTimeout: String)

      public fun tokenEndpoint(tokenEndpoint: String)

      public fun useExistingClientSecret(useExistingClientSecret: Boolean)

      public fun useExistingClientSecret(useExistingClientSecret: IResolvable)

      public fun userInfoEndpoint(userInfoEndpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty.builder()

      override fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams.let(IResolvable::unwrap))
      }

      override
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
      }

      override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      override fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
      }

      override fun sessionTimeout(sessionTimeout: String) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      override fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
      }

      override fun useExistingClientSecret(useExistingClientSecret: Boolean) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret)
      }

      override fun useExistingClientSecret(useExistingClientSecret: IResolvable) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret.let(IResolvable::unwrap))
      }

      override fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty,
    ) : AuthenticateOidcConfigProperty {
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      override fun issuer(): String = unwrap(this).getIssuer()

      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      override fun scope(): String? = unwrap(this).getScope()

      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      override fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

      override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

      override fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

      override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateOidcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty):
          AuthenticateOidcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateOidcConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedirectConfigProperty {
    public fun host(): String? = unwrap(this).getHost()

    public fun path(): String? = unwrap(this).getPath()

    public fun port(): String? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun query(): String? = unwrap(this).getQuery()

    public fun statusCode(): String

    public interface Builder {
      public fun host(host: String)

      public fun path(path: String)

      public fun port(port: String)

      public fun protocol(protocol: String)

      public fun query(query: String)

      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty.builder()

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun query(query: String) {
        cdkBuilder.query(query)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty,
    ) : RedirectConfigProperty {
      override fun host(): String? = unwrap(this).getHost()

      override fun path(): String? = unwrap(this).getPath()

      override fun port(): String? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun query(): String? = unwrap(this).getQuery()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedirectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty):
          RedirectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedirectConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuthenticateCognitoConfigProperty {
    public fun authenticationRequestExtraParams(): Any? =
        unwrap(this).getAuthenticationRequestExtraParams()

    public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

    public fun scope(): String? = unwrap(this).getScope()

    public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    public fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

    public fun userPoolArn(): String

    public fun userPoolClientId(): String

    public fun userPoolDomain(): String

    public interface Builder {
      public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable)

      public
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

      public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

      public fun scope(scope: String)

      public fun sessionCookieName(sessionCookieName: String)

      public fun sessionTimeout(sessionTimeout: String)

      public fun userPoolArn(userPoolArn: String)

      public fun userPoolClientId(userPoolClientId: String)

      public fun userPoolDomain(userPoolDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty.builder()

      override fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams.let(IResolvable::unwrap))
      }

      override
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
      }

      override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      override fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
      }

      override fun sessionTimeout(sessionTimeout: String) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      override fun userPoolClientId(userPoolClientId: String) {
        cdkBuilder.userPoolClientId(userPoolClientId)
      }

      override fun userPoolDomain(userPoolDomain: String) {
        cdkBuilder.userPoolDomain(userPoolDomain)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty,
    ) : AuthenticateCognitoConfigProperty {
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      override fun scope(): String? = unwrap(this).getScope()

      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      override fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

      override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

      override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

      override fun userPoolDomain(): String = unwrap(this).getUserPoolDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticateCognitoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty):
          AuthenticateCognitoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateCognitoConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
