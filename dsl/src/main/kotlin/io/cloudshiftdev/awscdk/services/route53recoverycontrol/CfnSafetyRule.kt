package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnSafetyRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assertionRule(): Any? = unwrap(this).getAssertionRule()

  public open fun assertionRule(`value`: IResolvable) {
    unwrap(this).setAssertionRule(`value`.let(IResolvable::unwrap))
  }

  public open fun assertionRule(`value`: AssertionRuleProperty) {
    unwrap(this).setAssertionRule(`value`.let(AssertionRuleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e330001a2d197a409de6a89957588985b3ea604b7f3e83dff76e65a243f234a")
  public open fun assertionRule(`value`: AssertionRuleProperty.Builder.() -> Unit): Unit =
      assertionRule(AssertionRuleProperty(`value`))

  public open fun attrSafetyRuleArn(): String = unwrap(this).getAttrSafetyRuleArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun controlPanelArn(): String = unwrap(this).getControlPanelArn()

  public open fun controlPanelArn(`value`: String) {
    unwrap(this).setControlPanelArn(`value`)
  }

  public open fun gatingRule(): Any? = unwrap(this).getGatingRule()

  public open fun gatingRule(`value`: IResolvable) {
    unwrap(this).setGatingRule(`value`.let(IResolvable::unwrap))
  }

  public open fun gatingRule(`value`: GatingRuleProperty) {
    unwrap(this).setGatingRule(`value`.let(GatingRuleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5c3ea7e792d75f457a3266f6b0b6005063a6a36764cb79caeb501455dd765d2")
  public open fun gatingRule(`value`: GatingRuleProperty.Builder.() -> Unit): Unit =
      gatingRule(GatingRuleProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ruleConfig(): Any = unwrap(this).getRuleConfig()

  public open fun ruleConfig(`value`: IResolvable) {
    unwrap(this).setRuleConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun ruleConfig(`value`: RuleConfigProperty) {
    unwrap(this).setRuleConfig(`value`.let(RuleConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("58d6415b9a45ab757e8a6969532a5d3ee581d130cdeb5bca7ecd3d59a8ca065d")
  public open fun ruleConfig(`value`: RuleConfigProperty.Builder.() -> Unit): Unit =
      ruleConfig(RuleConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun assertionRule(assertionRule: IResolvable)

    public fun assertionRule(assertionRule: AssertionRuleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("186b309aa6ebe3b2679b8546e369a7e8a0a2b6129a17050605aeacfd9971ab74")
    public fun assertionRule(assertionRule: AssertionRuleProperty.Builder.() -> Unit)

    public fun controlPanelArn(controlPanelArn: String)

    public fun gatingRule(gatingRule: IResolvable)

    public fun gatingRule(gatingRule: GatingRuleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38748a228e93e98b70b10d493d909939dbe988b5cfd4cdca14b2e21fa727a1e7")
    public fun gatingRule(gatingRule: GatingRuleProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun ruleConfig(ruleConfig: IResolvable)

    public fun ruleConfig(ruleConfig: RuleConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4623aa1709d6b596c85e289ae2b6c3b6b09955006887d6c00ac8fabc70b5fff0")
    public fun ruleConfig(ruleConfig: RuleConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.Builder.create(scope,
        id)

    override fun assertionRule(assertionRule: IResolvable) {
      cdkBuilder.assertionRule(assertionRule.let(IResolvable::unwrap))
    }

    override fun assertionRule(assertionRule: AssertionRuleProperty) {
      cdkBuilder.assertionRule(assertionRule.let(AssertionRuleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("186b309aa6ebe3b2679b8546e369a7e8a0a2b6129a17050605aeacfd9971ab74")
    override fun assertionRule(assertionRule: AssertionRuleProperty.Builder.() -> Unit): Unit =
        assertionRule(AssertionRuleProperty(assertionRule))

    override fun controlPanelArn(controlPanelArn: String) {
      cdkBuilder.controlPanelArn(controlPanelArn)
    }

    override fun gatingRule(gatingRule: IResolvable) {
      cdkBuilder.gatingRule(gatingRule.let(IResolvable::unwrap))
    }

    override fun gatingRule(gatingRule: GatingRuleProperty) {
      cdkBuilder.gatingRule(gatingRule.let(GatingRuleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38748a228e93e98b70b10d493d909939dbe988b5cfd4cdca14b2e21fa727a1e7")
    override fun gatingRule(gatingRule: GatingRuleProperty.Builder.() -> Unit): Unit =
        gatingRule(GatingRuleProperty(gatingRule))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleConfig(ruleConfig: IResolvable) {
      cdkBuilder.ruleConfig(ruleConfig.let(IResolvable::unwrap))
    }

    override fun ruleConfig(ruleConfig: RuleConfigProperty) {
      cdkBuilder.ruleConfig(ruleConfig.let(RuleConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4623aa1709d6b596c85e289ae2b6c3b6b09955006887d6c00ac8fabc70b5fff0")
    override fun ruleConfig(ruleConfig: RuleConfigProperty.Builder.() -> Unit): Unit =
        ruleConfig(RuleConfigProperty(ruleConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSafetyRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSafetyRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule):
        CfnSafetyRule = CfnSafetyRule(cdkObject)

    internal fun unwrap(wrapped: CfnSafetyRule):
        software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule = wrapped.cdkObject
  }

  public interface RuleConfigProperty {
    public fun inverted(): Any

    public fun threshold(): Number

    public fun type(): String

    public interface Builder {
      public fun inverted(inverted: Boolean)

      public fun inverted(inverted: IResolvable)

      public fun threshold(threshold: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty.builder()

      override fun inverted(inverted: Boolean) {
        cdkBuilder.inverted(inverted)
      }

      override fun inverted(inverted: IResolvable) {
        cdkBuilder.inverted(inverted.let(IResolvable::unwrap))
      }

      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty,
    ) : RuleConfigProperty {
      override fun inverted(): Any = unwrap(this).getInverted()

      override fun threshold(): Number = unwrap(this).getThreshold()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty):
          RuleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleConfigProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.RuleConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GatingRuleProperty {
    public fun gatingControls(): List<String>

    public fun targetControls(): List<String>

    public fun waitPeriodMs(): Number

    public interface Builder {
      public fun gatingControls(gatingControls: List<String>)

      public fun targetControls(targetControls: List<String>)

      public fun waitPeriodMs(waitPeriodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty.builder()

      override fun gatingControls(gatingControls: List<String>) {
        cdkBuilder.gatingControls(gatingControls)
      }

      override fun targetControls(targetControls: List<String>) {
        cdkBuilder.targetControls(targetControls)
      }

      override fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty,
    ) : GatingRuleProperty {
      override fun gatingControls(): List<String> = unwrap(this).getGatingControls() ?: emptyList()

      override fun targetControls(): List<String> = unwrap(this).getTargetControls() ?: emptyList()

      override fun waitPeriodMs(): Number = unwrap(this).getWaitPeriodMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty):
          GatingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatingRuleProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.GatingRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AssertionRuleProperty {
    public fun assertedControls(): List<String>

    public fun waitPeriodMs(): Number

    public interface Builder {
      public fun assertedControls(assertedControls: List<String>)

      public fun waitPeriodMs(waitPeriodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty.builder()

      override fun assertedControls(assertedControls: List<String>) {
        cdkBuilder.assertedControls(assertedControls)
      }

      override fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty,
    ) : AssertionRuleProperty {
      override fun assertedControls(): List<String> = unwrap(this).getAssertedControls() ?:
          emptyList()

      override fun waitPeriodMs(): Number = unwrap(this).getWaitPeriodMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssertionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty):
          AssertionRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssertionRuleProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule.AssertionRuleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
