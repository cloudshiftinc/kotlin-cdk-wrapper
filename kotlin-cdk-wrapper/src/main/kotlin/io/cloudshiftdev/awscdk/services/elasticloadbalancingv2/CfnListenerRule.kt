@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListenerRule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun actions(): Any = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  public open fun actions(vararg __idx_ac66f0: Any): Unit = actions(__idx_ac66f0.toList())

  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  public open fun conditions(): Any = unwrap(this).getConditions()

  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable::unwrap))
  }

  public open fun conditions(__idx_ac66f0: List<Any>) {
    unwrap(this).setConditions(__idx_ac66f0)
  }

  public open fun conditions(vararg __idx_ac66f0: Any): Unit = conditions(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun listenerArn(): String? = unwrap(this).getListenerArn()

  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  public open fun priority(): Number = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun conditions(conditions: IResolvable)

    public fun conditions(conditions: List<Any>)

    public fun conditions(vararg conditions: Any)

    public fun listenerArn(listenerArn: String)

    public fun priority(priority: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder.create(scope,
        id)

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListenerRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListenerRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule):
        CfnListenerRule = CfnListenerRule(cdkObject)

    internal fun unwrap(wrapped: CfnListenerRule):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule = wrapped.cdkObject
  }

  public interface RedirectConfigProperty {
    public fun host(): String? = unwrap(this).getHost()

    public fun path(): String? = unwrap(this).getPath()

    public fun port(): String? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun query(): String? = unwrap(this).getQuery()

    public fun statusCode(): String

    @CdkDslMarker
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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty.builder()

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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty,
    ) : CdkObject(cdkObject), RedirectConfigProperty {
      override fun host(): String? = unwrap(this).getHost()

      override fun path(): String? = unwrap(this).getPath()

      override fun port(): String? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun query(): String? = unwrap(this).getQuery()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedirectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty):
          RedirectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedirectConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable)

      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("378d76cb2e2575288ef5df66fa14f71c0678b9ab6ae162163eb146b97192db7c")
      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit)

      public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable)

      public fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8fbd647e89028c48807d2deca6a6d3defb75b5e15a25146fca7dd7d3bdd073")
      public
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit)

      public fun fixedResponseConfig(fixedResponseConfig: IResolvable)

      public fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0043a9a4d68d3c72e55b5bfbddc78b332dcd268ac9c3b9033dd36530c6995975")
      public
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit)

      public fun forwardConfig(forwardConfig: IResolvable)

      public fun forwardConfig(forwardConfig: ForwardConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11fd118fb9d2b4ce3a3509fa89b339f5e61454798d30be6f7d56e2eddcfa9b1f")
      public fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit)

      public fun order(order: Number)

      public fun redirectConfig(redirectConfig: IResolvable)

      public fun redirectConfig(redirectConfig: RedirectConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347e35c9ecda80593b305009ccbd0ecba03227fdd5b10911275978d2d4aed55c")
      public fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit)

      public fun targetGroupArn(targetGroupArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty.builder()

      override fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(IResolvable::unwrap))
      }

      override
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(AuthenticateCognitoConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("378d76cb2e2575288ef5df66fa14f71c0678b9ab6ae162163eb146b97192db7c")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8fbd647e89028c48807d2deca6a6d3defb75b5e15a25146fca7dd7d3bdd073")
      override
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit):
          Unit = authenticateOidcConfig(AuthenticateOidcConfigProperty(authenticateOidcConfig))

      override fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(IResolvable::unwrap))
      }

      override fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(FixedResponseConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0043a9a4d68d3c72e55b5bfbddc78b332dcd268ac9c3b9033dd36530c6995975")
      override
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit):
          Unit = fixedResponseConfig(FixedResponseConfigProperty(fixedResponseConfig))

      override fun forwardConfig(forwardConfig: IResolvable) {
        cdkBuilder.forwardConfig(forwardConfig.let(IResolvable::unwrap))
      }

      override fun forwardConfig(forwardConfig: ForwardConfigProperty) {
        cdkBuilder.forwardConfig(forwardConfig.let(ForwardConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11fd118fb9d2b4ce3a3509fa89b339f5e61454798d30be6f7d56e2eddcfa9b1f")
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347e35c9ecda80593b305009ccbd0ecba03227fdd5b10911275978d2d4aed55c")
      override fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit): Unit =
          redirectConfig(RedirectConfigProperty(redirectConfig))

      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty
    }
  }

  public interface QueryStringConfigProperty {
    public fun values(): Any? = unwrap(this).getValues()

    @CdkDslMarker
    public interface Builder {
      public fun values(values: IResolvable)

      public fun values(values: List<Any>)

      public fun values(vararg values: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty.builder()

      override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable::unwrap))
      }

      override fun values(values: List<Any>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: Any): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty,
    ) : CdkObject(cdkObject), QueryStringConfigProperty {
      override fun values(): Any? = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty):
          QueryStringConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
    }
  }

  public interface PathPatternConfigProperty {
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty.builder()

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty,
    ) : CdkObject(cdkObject), PathPatternConfigProperty {
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathPatternConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty):
          PathPatternConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathPatternConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
    }
  }

  public interface TargetGroupStickinessConfigProperty {
    public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun durationSeconds(durationSeconds: Number)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty.builder()

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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty,
    ) : CdkObject(cdkObject), TargetGroupStickinessConfigProperty {
      override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetGroupStickinessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty):
          TargetGroupStickinessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupStickinessConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
    }
  }

  public interface TargetGroupTupleProperty {
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun targetGroupArn(targetGroupArn: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty.builder()

      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty,
    ) : CdkObject(cdkObject), TargetGroupTupleProperty {
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty):
          TargetGroupTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupTupleProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
    }
  }

  public interface RuleConditionProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun hostHeaderConfig(): Any? = unwrap(this).getHostHeaderConfig()

    public fun httpHeaderConfig(): Any? = unwrap(this).getHttpHeaderConfig()

    public fun httpRequestMethodConfig(): Any? = unwrap(this).getHttpRequestMethodConfig()

    public fun pathPatternConfig(): Any? = unwrap(this).getPathPatternConfig()

    public fun queryStringConfig(): Any? = unwrap(this).getQueryStringConfig()

    public fun sourceIpConfig(): Any? = unwrap(this).getSourceIpConfig()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun `field`(`field`: String)

      public fun hostHeaderConfig(hostHeaderConfig: IResolvable)

      public fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9d3934c46b2887dcd4030a8dd4f0b1ab037ccdd11c8851f6c6f5ccd31ffe8f")
      public fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty.Builder.() -> Unit)

      public fun httpHeaderConfig(httpHeaderConfig: IResolvable)

      public fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2654036ebad02cf3518a9cb92038f87de2a79fa02bcfc4380ea875d7ddebd5a")
      public fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty.Builder.() -> Unit)

      public fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable)

      public fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8177321ae54582f5b62ecc7be5e4f6abd31aebf954a0265e5c5134032e60f5cf")
      public
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty.Builder.() -> Unit)

      public fun pathPatternConfig(pathPatternConfig: IResolvable)

      public fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6997fe58d1b50a439136930b30ed5927e3072f0777072a081fa7612b42cdfa7b")
      public fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty.Builder.() -> Unit)

      public fun queryStringConfig(queryStringConfig: IResolvable)

      public fun queryStringConfig(queryStringConfig: QueryStringConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82897a687b5ea53096160d48383110ba1c0563bf1618b31f58a2734bbb0adbd5")
      public fun queryStringConfig(queryStringConfig: QueryStringConfigProperty.Builder.() -> Unit)

      public fun sourceIpConfig(sourceIpConfig: IResolvable)

      public fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13e80fa32ee413fe9c4c30fa4989582cb5a1b13afdd202b62beeb9614d8f5bd6")
      public fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty.Builder.() -> Unit)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty.builder()

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun hostHeaderConfig(hostHeaderConfig: IResolvable) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig.let(IResolvable::unwrap))
      }

      override fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig.let(HostHeaderConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9d3934c46b2887dcd4030a8dd4f0b1ab037ccdd11c8851f6c6f5ccd31ffe8f")
      override fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty.Builder.() -> Unit):
          Unit = hostHeaderConfig(HostHeaderConfigProperty(hostHeaderConfig))

      override fun httpHeaderConfig(httpHeaderConfig: IResolvable) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig.let(IResolvable::unwrap))
      }

      override fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig.let(HttpHeaderConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2654036ebad02cf3518a9cb92038f87de2a79fa02bcfc4380ea875d7ddebd5a")
      override fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty.Builder.() -> Unit):
          Unit = httpHeaderConfig(HttpHeaderConfigProperty(httpHeaderConfig))

      override fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig.let(IResolvable::unwrap))
      }

      override
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig.let(HttpRequestMethodConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8177321ae54582f5b62ecc7be5e4f6abd31aebf954a0265e5c5134032e60f5cf")
      override
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty.Builder.() -> Unit):
          Unit = httpRequestMethodConfig(HttpRequestMethodConfigProperty(httpRequestMethodConfig))

      override fun pathPatternConfig(pathPatternConfig: IResolvable) {
        cdkBuilder.pathPatternConfig(pathPatternConfig.let(IResolvable::unwrap))
      }

      override fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty) {
        cdkBuilder.pathPatternConfig(pathPatternConfig.let(PathPatternConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6997fe58d1b50a439136930b30ed5927e3072f0777072a081fa7612b42cdfa7b")
      override
          fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty.Builder.() -> Unit):
          Unit = pathPatternConfig(PathPatternConfigProperty(pathPatternConfig))

      override fun queryStringConfig(queryStringConfig: IResolvable) {
        cdkBuilder.queryStringConfig(queryStringConfig.let(IResolvable::unwrap))
      }

      override fun queryStringConfig(queryStringConfig: QueryStringConfigProperty) {
        cdkBuilder.queryStringConfig(queryStringConfig.let(QueryStringConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82897a687b5ea53096160d48383110ba1c0563bf1618b31f58a2734bbb0adbd5")
      override
          fun queryStringConfig(queryStringConfig: QueryStringConfigProperty.Builder.() -> Unit):
          Unit = queryStringConfig(QueryStringConfigProperty(queryStringConfig))

      override fun sourceIpConfig(sourceIpConfig: IResolvable) {
        cdkBuilder.sourceIpConfig(sourceIpConfig.let(IResolvable::unwrap))
      }

      override fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty) {
        cdkBuilder.sourceIpConfig(sourceIpConfig.let(SourceIpConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13e80fa32ee413fe9c4c30fa4989582cb5a1b13afdd202b62beeb9614d8f5bd6")
      override fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty.Builder.() -> Unit): Unit =
          sourceIpConfig(SourceIpConfigProperty(sourceIpConfig))

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty,
    ) : CdkObject(cdkObject), RuleConditionProperty {
      override fun `field`(): String? = unwrap(this).getField()

      override fun hostHeaderConfig(): Any? = unwrap(this).getHostHeaderConfig()

      override fun httpHeaderConfig(): Any? = unwrap(this).getHttpHeaderConfig()

      override fun httpRequestMethodConfig(): Any? = unwrap(this).getHttpRequestMethodConfig()

      override fun pathPatternConfig(): Any? = unwrap(this).getPathPatternConfig()

      override fun queryStringConfig(): Any? = unwrap(this).getQueryStringConfig()

      override fun sourceIpConfig(): Any? = unwrap(this).getSourceIpConfig()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty):
          RuleConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleConditionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
    }
  }

  public interface QueryStringKeyValueProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty,
    ) : CdkObject(cdkObject), QueryStringKeyValueProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringKeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty):
          QueryStringKeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringKeyValueProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
    }
  }

  public interface HttpRequestMethodConfigProperty {
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty.builder()

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty,
    ) : CdkObject(cdkObject), HttpRequestMethodConfigProperty {
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRequestMethodConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty):
          HttpRequestMethodConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRequestMethodConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
    }
  }

  public interface ForwardConfigProperty {
    public fun targetGroupStickinessConfig(): Any? = unwrap(this).getTargetGroupStickinessConfig()

    public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

    @CdkDslMarker
    public interface Builder {
      public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable)

      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8346cc062be8b2d02d334cf94fabe9c105928903dc00dd8ad5a858022fdf5d88")
      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit)

      public fun targetGroups(targetGroups: IResolvable)

      public fun targetGroups(targetGroups: List<Any>)

      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty.builder()

      override fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(IResolvable::unwrap))
      }

      override
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(TargetGroupStickinessConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8346cc062be8b2d02d334cf94fabe9c105928903dc00dd8ad5a858022fdf5d88")
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

      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty,
    ) : CdkObject(cdkObject), ForwardConfigProperty {
      override fun targetGroupStickinessConfig(): Any? =
          unwrap(this).getTargetGroupStickinessConfig()

      override fun targetGroups(): Any? = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty):
          ForwardConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
    }
  }

  public interface HttpHeaderConfigProperty {
    public fun httpHeaderName(): String? = unwrap(this).getHttpHeaderName()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun httpHeaderName(httpHeaderName: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty.builder()

      override fun httpHeaderName(httpHeaderName: String) {
        cdkBuilder.httpHeaderName(httpHeaderName)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty,
    ) : CdkObject(cdkObject), HttpHeaderConfigProperty {
      override fun httpHeaderName(): String? = unwrap(this).getHttpHeaderName()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty):
          HttpHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpHeaderConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
    }
  }

  public interface AuthenticateCognitoConfigProperty {
    public fun authenticationRequestExtraParams(): Any? =
        unwrap(this).getAuthenticationRequestExtraParams()

    public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

    public fun scope(): String? = unwrap(this).getScope()

    public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    public fun userPoolArn(): String

    public fun userPoolClientId(): String

    public fun userPoolDomain(): String

    @CdkDslMarker
    public interface Builder {
      public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable)

      public
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

      public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

      public fun scope(scope: String)

      public fun sessionCookieName(sessionCookieName: String)

      public fun sessionTimeout(sessionTimeout: Number)

      public fun userPoolArn(userPoolArn: String)

      public fun userPoolClientId(userPoolClientId: String)

      public fun userPoolDomain(userPoolDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty.builder()

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

      override fun sessionTimeout(sessionTimeout: Number) {
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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty,
    ) : CdkObject(cdkObject), AuthenticateCognitoConfigProperty {
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      override fun scope(): String? = unwrap(this).getScope()

      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

      override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

      override fun userPoolDomain(): String = unwrap(this).getUserPoolDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticateCognitoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty):
          AuthenticateCognitoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateCognitoConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
    }
  }

  public interface HostHeaderConfigProperty {
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty.builder()

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty,
    ) : CdkObject(cdkObject), HostHeaderConfigProperty {
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty):
          HostHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostHeaderConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
    }
  }

  public interface SourceIpConfigProperty {
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty.builder()

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty,
    ) : CdkObject(cdkObject), SourceIpConfigProperty {
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceIpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty):
          SourceIpConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceIpConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
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

    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    public fun tokenEndpoint(): String

    public fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

    public fun userInfoEndpoint(): String

    @CdkDslMarker
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

      public fun sessionTimeout(sessionTimeout: Number)

      public fun tokenEndpoint(tokenEndpoint: String)

      public fun useExistingClientSecret(useExistingClientSecret: Boolean)

      public fun useExistingClientSecret(useExistingClientSecret: IResolvable)

      public fun userInfoEndpoint(userInfoEndpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.builder()

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

      override fun sessionTimeout(sessionTimeout: Number) {
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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty,
    ) : CdkObject(cdkObject), AuthenticateOidcConfigProperty {
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      override fun issuer(): String = unwrap(this).getIssuer()

      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      override fun scope(): String? = unwrap(this).getScope()

      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

      override fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

      override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateOidcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty):
          AuthenticateOidcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateOidcConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
    }
  }

  public interface FixedResponseConfigProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun messageBody(): String? = unwrap(this).getMessageBody()

    public fun statusCode(): String

    @CdkDslMarker
    public interface Builder {
      public fun contentType(contentType: String)

      public fun messageBody(messageBody: String)

      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty.builder()

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
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty,
    ) : CdkObject(cdkObject), FixedResponseConfigProperty {
      override fun contentType(): String? = unwrap(this).getContentType()

      override fun messageBody(): String? = unwrap(this).getMessageBody()

      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty):
          FixedResponseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
    }
  }
}
