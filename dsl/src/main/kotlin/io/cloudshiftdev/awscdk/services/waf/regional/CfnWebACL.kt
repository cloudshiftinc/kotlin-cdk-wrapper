package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebACL internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultAction(`value`: ActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(ActionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3af383f8c6f7654aa5a7f095018e4bdd76ac0baa8f95fc646dae670971d70085")
  public open fun defaultAction(`value`: ActionProperty.Builder.() -> Unit): Unit =
      defaultAction(ActionProperty(`value`))

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

  public interface Builder {
    public fun defaultAction(defaultAction: IResolvable) {
    }

    public fun defaultAction(defaultAction: ActionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60275178e198fc9462460ff93c97d208f7e2ec67c457a96b330c95e9656eb93f")
    public fun defaultAction(defaultAction: ActionProperty.Builder.() -> Unit) {
    }

    public fun metricName(metricName: String) {
    }

    public fun name(name: String) {
    }

    public fun rules(rules: IResolvable) {
    }

    public fun rules(rules: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnWebACL.Builder =
        software.amazon.awscdk.services.waf.regional.CfnWebACL.Builder.create(scope, id)

    public override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable::unwrap))
    }

    public override fun defaultAction(defaultAction: ActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(ActionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60275178e198fc9462460ff93c97d208f7e2ec67c457a96b330c95e9656eb93f")
    public override fun defaultAction(defaultAction: ActionProperty.Builder.() -> Unit): Unit =
        defaultAction(ActionProperty(defaultAction))

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    public override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL): CfnWebACL
        = CfnWebACL(cdkObject)

    internal fun unwrap(wrapped: CfnWebACL): software.amazon.awscdk.services.waf.regional.CfnWebACL
        = wrapped.cdkObject
  }

  public interface RuleProperty {
    public fun action(): Any

    public fun priority(): Number

    public fun ruleId(): String

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: ActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b783c1213464d7662dc5b33ae8544518f0c083311fc75b45412a9e96634f8284")
      public fun action(action: ActionProperty.Builder.() -> Unit) {
      }

      public fun priority(priority: Number) {
      }

      public fun ruleId(ruleId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b783c1213464d7662dc5b33ae8544518f0c083311fc75b45412a9e96634f8284")
      public override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
      }

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty,
    ) : RuleProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun priority(): Number = unwrap(this).getPriority()

      public override fun ruleId(): String = unwrap(this).getRuleId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun type(): String

    public interface Builder {
      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty,
    ) : ActionProperty {
      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
