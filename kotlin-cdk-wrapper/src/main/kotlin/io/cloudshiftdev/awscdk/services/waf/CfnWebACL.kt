@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultAction(`value`: WafActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(WafActionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db8dbc68e23f66549d01f6d2fd7a0ce5f4d2e8f7e60054a88e1cf2d7080089e6")
  public open fun defaultAction(`value`: WafActionProperty.Builder.() -> Unit): Unit =
      defaultAction(WafActionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rules(): Any? = unwrap(this).getRules()

  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  public open fun rules(vararg __idx_ac66f0: Any): Unit = rules(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun defaultAction(defaultAction: IResolvable)

    public fun defaultAction(defaultAction: WafActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f896ef269b8e39c5f47fdfba351903d562854031eb70b233406eb744fac9736")
    public fun defaultAction(defaultAction: WafActionProperty.Builder.() -> Unit)

    public fun metricName(metricName: String)

    public fun name(name: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnWebACL.Builder =
        software.amazon.awscdk.services.waf.CfnWebACL.Builder.create(scope, id)

    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    override fun defaultAction(defaultAction: WafActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(WafActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f896ef269b8e39c5f47fdfba351903d562854031eb70b233406eb744fac9736")
    override fun defaultAction(defaultAction: WafActionProperty.Builder.() -> Unit): Unit =
        defaultAction(WafActionProperty(defaultAction))

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.waf.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.CfnWebACL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL): CfnWebACL =
        CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.waf.CfnWebACL =
        wrapped.cdkObject
  }

  public interface ActivatedRuleProperty {
    public fun action(): Any? = unwrap(this).getAction()

    public fun priority(): Number

    public fun ruleId(): String

    @CdkDslMarker
    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: WafActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f42e12f782edd9b7e90a0dad395911c5b19e0fce76436c5ad2f12be7320d600")
      public fun action(action: WafActionProperty.Builder.() -> Unit)

      public fun priority(priority: Number)

      public fun ruleId(ruleId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder =
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: WafActionProperty) {
        cdkBuilder.action(action.let(WafActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f42e12f782edd9b7e90a0dad395911c5b19e0fce76436c5ad2f12be7320d600")
      override fun action(action: WafActionProperty.Builder.() -> Unit): Unit =
          action(WafActionProperty(action))

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty,
    ) : CdkObject(cdkObject), ActivatedRuleProperty {
      override fun action(): Any? = unwrap(this).getAction()

      override fun priority(): Number = unwrap(this).getPriority()

      override fun ruleId(): String = unwrap(this).getRuleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActivatedRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty):
          ActivatedRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActivatedRuleProperty):
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty
    }
  }

  public interface WafActionProperty {
    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder =
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty,
    ) : CdkObject(cdkObject), WafActionProperty {
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WafActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty):
          WafActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WafActionProperty):
          software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty
    }
  }
}
