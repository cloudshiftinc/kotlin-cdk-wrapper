package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRuleGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrRuleGroupArn(): String = unwrap(this).getAttrRuleGroupArn()

  public open fun attrRuleGroupId(): String = unwrap(this).getAttrRuleGroupId()

  public open fun capacity(): Number = unwrap(this).getCapacity()

  public open fun capacity(`value`: Number) {
    unwrap(this).setCapacity(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

  public open fun ruleGroup(`value`: IResolvable) {
    unwrap(this).setRuleGroup(`value`.let(IResolvable::unwrap))
  }

  public open fun ruleGroup(`value`: RuleGroupProperty) {
    unwrap(this).setRuleGroup(`value`.let(RuleGroupProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f2b4cc462dc31260c3fd3bc65906106600a8a21bb20b96f6fc5ddfbd6c514bb")
  public open fun ruleGroup(`value`: RuleGroupProperty.Builder.() -> Unit): Unit =
      ruleGroup(RuleGroupProperty(`value`))

  public open fun ruleGroupName(): String = unwrap(this).getRuleGroupName()

  public open fun ruleGroupName(`value`: String) {
    unwrap(this).setRuleGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun capacity(capacity: Number)

    public fun description(description: String)

    public fun ruleGroup(ruleGroup: IResolvable)

    public fun ruleGroup(ruleGroup: RuleGroupProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f97f50c945728d3bfee62d7d343aa3aec64ffad7a90b5cb1cfbe0777365775ca")
    public fun ruleGroup(ruleGroup: RuleGroupProperty.Builder.() -> Unit)

    public fun ruleGroupName(ruleGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.Builder.create(scope, id)

    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ruleGroup(ruleGroup: IResolvable) {
      cdkBuilder.ruleGroup(ruleGroup.let(IResolvable::unwrap))
    }

    override fun ruleGroup(ruleGroup: RuleGroupProperty) {
      cdkBuilder.ruleGroup(ruleGroup.let(RuleGroupProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f97f50c945728d3bfee62d7d343aa3aec64ffad7a90b5cb1cfbe0777365775ca")
    override fun ruleGroup(ruleGroup: RuleGroupProperty.Builder.() -> Unit): Unit =
        ruleGroup(RuleGroupProperty(ruleGroup))

    override fun ruleGroupName(ruleGroupName: String) {
      cdkBuilder.ruleGroupName(ruleGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup):
        CfnRuleGroup = CfnRuleGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroup):
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup = wrapped.cdkObject
  }

  public interface IPSetProperty {
    public fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()

    public interface Builder {
      public fun definition(definition: List<String>)

      public fun definition(vararg definition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty.builder()

      override fun definition(definition: List<String>) {
        cdkBuilder.definition(definition)
      }

      override fun definition(vararg definition: String): Unit = definition(definition.toList())

      public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty,
    ) : IPSetProperty {
      override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty):
          IPSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomActionProperty {
    public fun actionDefinition(): Any

    public fun actionName(): String

    public interface Builder {
      public fun actionDefinition(actionDefinition: IResolvable)

      public fun actionDefinition(actionDefinition: ActionDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f29bbdc6da9197eb1f20b3dfcf148d5dcc23a03144d9046c74fc8417071e576f")
      public fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit)

      public fun actionName(actionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty.builder()

      override fun actionDefinition(actionDefinition: IResolvable) {
        cdkBuilder.actionDefinition(actionDefinition.let(IResolvable::unwrap))
      }

      override fun actionDefinition(actionDefinition: ActionDefinitionProperty) {
        cdkBuilder.actionDefinition(actionDefinition.let(ActionDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f29bbdc6da9197eb1f20b3dfcf148d5dcc23a03144d9046c74fc8417071e576f")
      override fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit):
          Unit = actionDefinition(ActionDefinitionProperty(actionDefinition))

      override fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty,
    ) : CustomActionProperty {
      override fun actionDefinition(): Any = unwrap(this).getActionDefinition()

      override fun actionName(): String = unwrap(this).getActionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty):
          CustomActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RulesSourceProperty {
    public fun rulesSourceList(): Any? = unwrap(this).getRulesSourceList()

    public fun rulesString(): String? = unwrap(this).getRulesString()

    public fun statefulRules(): Any? = unwrap(this).getStatefulRules()

    public fun statelessRulesAndCustomActions(): Any? =
        unwrap(this).getStatelessRulesAndCustomActions()

    public interface Builder {
      public fun rulesSourceList(rulesSourceList: IResolvable)

      public fun rulesSourceList(rulesSourceList: RulesSourceListProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c7c626f64d529118eaa4e54bb67e966574361929b99cc5af792bcd0b173bb69")
      public fun rulesSourceList(rulesSourceList: RulesSourceListProperty.Builder.() -> Unit)

      public fun rulesString(rulesString: String)

      public fun statefulRules(statefulRules: IResolvable)

      public fun statefulRules(statefulRules: List<Any>)

      public fun statefulRules(vararg statefulRules: Any)

      public fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable)

      public
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f0a5148e36d61899ba2f443efda913fa8b21432f14729eb6f802a14e2625fb0")
      public
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.builder()

      override fun rulesSourceList(rulesSourceList: IResolvable) {
        cdkBuilder.rulesSourceList(rulesSourceList.let(IResolvable::unwrap))
      }

      override fun rulesSourceList(rulesSourceList: RulesSourceListProperty) {
        cdkBuilder.rulesSourceList(rulesSourceList.let(RulesSourceListProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c7c626f64d529118eaa4e54bb67e966574361929b99cc5af792bcd0b173bb69")
      override fun rulesSourceList(rulesSourceList: RulesSourceListProperty.Builder.() -> Unit):
          Unit = rulesSourceList(RulesSourceListProperty(rulesSourceList))

      override fun rulesString(rulesString: String) {
        cdkBuilder.rulesString(rulesString)
      }

      override fun statefulRules(statefulRules: IResolvable) {
        cdkBuilder.statefulRules(statefulRules.let(IResolvable::unwrap))
      }

      override fun statefulRules(statefulRules: List<Any>) {
        cdkBuilder.statefulRules(statefulRules)
      }

      override fun statefulRules(vararg statefulRules: Any): Unit =
          statefulRules(statefulRules.toList())

      override fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions.let(IResolvable::unwrap))
      }

      override
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions.let(StatelessRulesAndCustomActionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f0a5148e36d61899ba2f443efda913fa8b21432f14729eb6f802a14e2625fb0")
      override
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty.Builder.() -> Unit):
          Unit =
          statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty(statelessRulesAndCustomActions))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty,
    ) : RulesSourceProperty {
      override fun rulesSourceList(): Any? = unwrap(this).getRulesSourceList()

      override fun rulesString(): String? = unwrap(this).getRulesString()

      override fun statefulRules(): Any? = unwrap(this).getStatefulRules()

      override fun statelessRulesAndCustomActions(): Any? =
          unwrap(this).getStatelessRulesAndCustomActions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RulesSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty):
          RulesSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesSourceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatelessRulesAndCustomActionsProperty {
    public fun customActions(): Any? = unwrap(this).getCustomActions()

    public fun statelessRules(): Any

    public interface Builder {
      public fun customActions(customActions: IResolvable)

      public fun customActions(customActions: List<Any>)

      public fun customActions(vararg customActions: Any)

      public fun statelessRules(statelessRules: IResolvable)

      public fun statelessRules(statelessRules: List<Any>)

      public fun statelessRules(vararg statelessRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.builder()

      override fun customActions(customActions: IResolvable) {
        cdkBuilder.customActions(customActions.let(IResolvable::unwrap))
      }

      override fun customActions(customActions: List<Any>) {
        cdkBuilder.customActions(customActions)
      }

      override fun customActions(vararg customActions: Any): Unit =
          customActions(customActions.toList())

      override fun statelessRules(statelessRules: IResolvable) {
        cdkBuilder.statelessRules(statelessRules.let(IResolvable::unwrap))
      }

      override fun statelessRules(statelessRules: List<Any>) {
        cdkBuilder.statelessRules(statelessRules)
      }

      override fun statelessRules(vararg statelessRules: Any): Unit =
          statelessRules(statelessRules.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty,
    ) : StatelessRulesAndCustomActionsProperty {
      override fun customActions(): Any? = unwrap(this).getCustomActions()

      override fun statelessRules(): Any = unwrap(this).getStatelessRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatelessRulesAndCustomActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty):
          StatelessRulesAndCustomActionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRulesAndCustomActionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortRangeProperty {
    public fun fromPort(): Number

    public fun toPort(): Number

    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty,
    ) : PortRangeProperty {
      override fun fromPort(): Number = unwrap(this).getFromPort()

      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuleDefinitionProperty {
    public fun actions(): List<String>

    public fun matchAttributes(): Any

    public interface Builder {
      public fun actions(actions: List<String>)

      public fun actions(vararg actions: String)

      public fun matchAttributes(matchAttributes: IResolvable)

      public fun matchAttributes(matchAttributes: MatchAttributesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49946981ce0bea8247a6726d3b4ecc81fddd180a7d520f19c5edb1676fcccb")
      public fun matchAttributes(matchAttributes: MatchAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.builder()

      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      override fun matchAttributes(matchAttributes: IResolvable) {
        cdkBuilder.matchAttributes(matchAttributes.let(IResolvable::unwrap))
      }

      override fun matchAttributes(matchAttributes: MatchAttributesProperty) {
        cdkBuilder.matchAttributes(matchAttributes.let(MatchAttributesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49946981ce0bea8247a6726d3b4ecc81fddd180a7d520f19c5edb1676fcccb")
      override fun matchAttributes(matchAttributes: MatchAttributesProperty.Builder.() -> Unit):
          Unit = matchAttributes(MatchAttributesProperty(matchAttributes))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty,
    ) : RuleDefinitionProperty {
      override fun actions(): List<String> = unwrap(this).getActions()

      override fun matchAttributes(): Any = unwrap(this).getMatchAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty):
          RuleDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatefulRuleProperty {
    public fun action(): String

    public fun `header`(): Any

    public fun ruleOptions(): Any

    public interface Builder {
      public fun action(action: String)

      public fun `header`(`header`: IResolvable)

      public fun `header`(`header`: HeaderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47c83241672bba57efea9b623ce5228ca59fdf785b34a8abd5df7a45b2ec11e6")
      public fun `header`(`header`: HeaderProperty.Builder.() -> Unit)

      public fun ruleOptions(ruleOptions: IResolvable)

      public fun ruleOptions(ruleOptions: List<Any>)

      public fun ruleOptions(vararg ruleOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      override fun `header`(`header`: HeaderProperty) {
        cdkBuilder.`header`(`header`.let(HeaderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47c83241672bba57efea9b623ce5228ca59fdf785b34a8abd5df7a45b2ec11e6")
      override fun `header`(`header`: HeaderProperty.Builder.() -> Unit): Unit =
          `header`(HeaderProperty(`header`))

      override fun ruleOptions(ruleOptions: IResolvable) {
        cdkBuilder.ruleOptions(ruleOptions.let(IResolvable::unwrap))
      }

      override fun ruleOptions(ruleOptions: List<Any>) {
        cdkBuilder.ruleOptions(ruleOptions)
      }

      override fun ruleOptions(vararg ruleOptions: Any): Unit = ruleOptions(ruleOptions.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty,
    ) : StatefulRuleProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun `header`(): Any = unwrap(this).getHeader()

      override fun ruleOptions(): Any = unwrap(this).getRuleOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty):
          StatefulRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MatchAttributesProperty {
    public fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

    public fun destinations(): Any? = unwrap(this).getDestinations()

    public fun protocols(): Any? = unwrap(this).getProtocols()

    public fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

    public fun sources(): Any? = unwrap(this).getSources()

    public fun tcpFlags(): Any? = unwrap(this).getTcpFlags()

    public interface Builder {
      public fun destinationPorts(destinationPorts: IResolvable)

      public fun destinationPorts(destinationPorts: List<Any>)

      public fun destinationPorts(vararg destinationPorts: Any)

      public fun destinations(destinations: IResolvable)

      public fun destinations(destinations: List<Any>)

      public fun destinations(vararg destinations: Any)

      public fun protocols(protocols: IResolvable)

      public fun protocols(protocols: List<Number>)

      public fun protocols(vararg protocols: Number)

      public fun sourcePorts(sourcePorts: IResolvable)

      public fun sourcePorts(sourcePorts: List<Any>)

      public fun sourcePorts(vararg sourcePorts: Any)

      public fun sources(sources: IResolvable)

      public fun sources(sources: List<Any>)

      public fun sources(vararg sources: Any)

      public fun tcpFlags(tcpFlags: IResolvable)

      public fun tcpFlags(tcpFlags: List<Any>)

      public fun tcpFlags(vararg tcpFlags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty.builder()

      override fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts.let(IResolvable::unwrap))
      }

      override fun destinationPorts(destinationPorts: List<Any>) {
        cdkBuilder.destinationPorts(destinationPorts)
      }

      override fun destinationPorts(vararg destinationPorts: Any): Unit =
          destinationPorts(destinationPorts.toList())

      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      override fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols.let(IResolvable::unwrap))
      }

      override fun protocols(protocols: List<Number>) {
        cdkBuilder.protocols(protocols)
      }

      override fun protocols(vararg protocols: Number): Unit = protocols(protocols.toList())

      override fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts.let(IResolvable::unwrap))
      }

      override fun sourcePorts(sourcePorts: List<Any>) {
        cdkBuilder.sourcePorts(sourcePorts)
      }

      override fun sourcePorts(vararg sourcePorts: Any): Unit = sourcePorts(sourcePorts.toList())

      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable::unwrap))
      }

      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources)
      }

      override fun sources(vararg sources: Any): Unit = sources(sources.toList())

      override fun tcpFlags(tcpFlags: IResolvable) {
        cdkBuilder.tcpFlags(tcpFlags.let(IResolvable::unwrap))
      }

      override fun tcpFlags(tcpFlags: List<Any>) {
        cdkBuilder.tcpFlags(tcpFlags)
      }

      override fun tcpFlags(vararg tcpFlags: Any): Unit = tcpFlags(tcpFlags.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty,
    ) : MatchAttributesProperty {
      override fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

      override fun destinations(): Any? = unwrap(this).getDestinations()

      override fun protocols(): Any? = unwrap(this).getProtocols()

      override fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

      override fun sources(): Any? = unwrap(this).getSources()

      override fun tcpFlags(): Any? = unwrap(this).getTcpFlags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty):
          MatchAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchAttributesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatefulRuleOptionsProperty {
    public fun ruleOrder(): String? = unwrap(this).getRuleOrder()

    public interface Builder {
      public fun ruleOrder(ruleOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty.builder()

      override fun ruleOrder(ruleOrder: String) {
        cdkBuilder.ruleOrder(ruleOrder)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty,
    ) : StatefulRuleOptionsProperty {
      override fun ruleOrder(): String? = unwrap(this).getRuleOrder()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulRuleOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty):
          StatefulRuleOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleOptionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuleOptionProperty {
    public fun keyword(): String

    public fun settings(): List<String> = unwrap(this).getSettings() ?: emptyList()

    public interface Builder {
      public fun keyword(keyword: String)

      public fun tings(settings: List<String>)

      public fun tings(vararg settings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty.builder()

      override fun keyword(keyword: String) {
        cdkBuilder.keyword(keyword)
      }

      override fun tings(settings: List<String>) {
        cdkBuilder.settings(settings)
      }

      override fun tings(vararg settings: String): Unit = tings(settings.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty,
    ) : RuleOptionProperty {
      override fun keyword(): String = unwrap(this).getKeyword()

      override fun settings(): List<String> = unwrap(this).getSettings() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty):
          RuleOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleOptionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PortSetProperty {
    public fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()

    public interface Builder {
      public fun definition(definition: List<String>)

      public fun definition(vararg definition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty.builder()

      override fun definition(definition: List<String>) {
        cdkBuilder.definition(definition)
      }

      override fun definition(vararg definition: String): Unit = definition(definition.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty,
    ) : PortSetProperty {
      override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty):
          PortSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StatelessRuleProperty {
    public fun priority(): Number

    public fun ruleDefinition(): Any

    public interface Builder {
      public fun priority(priority: Number)

      public fun ruleDefinition(ruleDefinition: IResolvable)

      public fun ruleDefinition(ruleDefinition: RuleDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c34ade5d18e8bd5988d3b80759936fc07623d0552b77d061fbdfc8c246238e")
      public fun ruleDefinition(ruleDefinition: RuleDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.builder()

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun ruleDefinition(ruleDefinition: IResolvable) {
        cdkBuilder.ruleDefinition(ruleDefinition.let(IResolvable::unwrap))
      }

      override fun ruleDefinition(ruleDefinition: RuleDefinitionProperty) {
        cdkBuilder.ruleDefinition(ruleDefinition.let(RuleDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c34ade5d18e8bd5988d3b80759936fc07623d0552b77d061fbdfc8c246238e")
      override fun ruleDefinition(ruleDefinition: RuleDefinitionProperty.Builder.() -> Unit): Unit =
          ruleDefinition(RuleDefinitionProperty(ruleDefinition))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty,
    ) : StatelessRuleProperty {
      override fun priority(): Number = unwrap(this).getPriority()

      override fun ruleDefinition(): Any = unwrap(this).getRuleDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatelessRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty):
          StatelessRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRuleProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DimensionProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty,
    ) : DimensionProperty {
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuleVariablesProperty {
    public fun ipSets(): Any? = unwrap(this).getIpSets()

    public fun portSets(): Any? = unwrap(this).getPortSets()

    public interface Builder {
      public fun ipSets(ipSets: IResolvable)

      public fun ipSets(ipSets: Map<String, Any>)

      public fun portSets(portSets: IResolvable)

      public fun portSets(portSets: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty.builder()

      override fun ipSets(ipSets: IResolvable) {
        cdkBuilder.ipSets(ipSets.let(IResolvable::unwrap))
      }

      override fun ipSets(ipSets: Map<String, Any>) {
        cdkBuilder.ipSets(ipSets)
      }

      override fun portSets(portSets: IResolvable) {
        cdkBuilder.portSets(portSets.let(IResolvable::unwrap))
      }

      override fun portSets(portSets: Map<String, Any>) {
        cdkBuilder.portSets(portSets)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty,
    ) : RuleVariablesProperty {
      override fun ipSets(): Any? = unwrap(this).getIpSets()

      override fun portSets(): Any? = unwrap(this).getPortSets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleVariablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty):
          RuleVariablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleVariablesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReferenceSetsProperty {
    public fun ipSetReferences(): Any? = unwrap(this).getIpSetReferences()

    public interface Builder {
      public fun ipSetReferences(ipSetReferences: IResolvable)

      public fun ipSetReferences(ipSetReferences: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty.builder()

      override fun ipSetReferences(ipSetReferences: IResolvable) {
        cdkBuilder.ipSetReferences(ipSetReferences.let(IResolvable::unwrap))
      }

      override fun ipSetReferences(ipSetReferences: Map<String, Any>) {
        cdkBuilder.ipSetReferences(ipSetReferences)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty,
    ) : ReferenceSetsProperty {
      override fun ipSetReferences(): Any? = unwrap(this).getIpSetReferences()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty):
          ReferenceSetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSetsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RulesSourceListProperty {
    public fun generatedRulesType(): String

    public fun targetTypes(): List<String>

    public fun targets(): List<String>

    public interface Builder {
      public fun generatedRulesType(generatedRulesType: String)

      public fun targetTypes(targetTypes: List<String>)

      public fun targetTypes(vararg targetTypes: String)

      public fun targets(targets: List<String>)

      public fun targets(vararg targets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.builder()

      override fun generatedRulesType(generatedRulesType: String) {
        cdkBuilder.generatedRulesType(generatedRulesType)
      }

      override fun targetTypes(targetTypes: List<String>) {
        cdkBuilder.targetTypes(targetTypes)
      }

      override fun targetTypes(vararg targetTypes: String): Unit = targetTypes(targetTypes.toList())

      override fun targets(targets: List<String>) {
        cdkBuilder.targets(targets)
      }

      override fun targets(vararg targets: String): Unit = targets(targets.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty,
    ) : RulesSourceListProperty {
      override fun generatedRulesType(): String = unwrap(this).getGeneratedRulesType()

      override fun targetTypes(): List<String> = unwrap(this).getTargetTypes()

      override fun targets(): List<String> = unwrap(this).getTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RulesSourceListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty):
          RulesSourceListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesSourceListProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionDefinitionProperty {
    public fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()

    public interface Builder {
      public fun publishMetricAction(publishMetricAction: IResolvable)

      public fun publishMetricAction(publishMetricAction: PublishMetricActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c709e38e77861004c23b0b23e18c692c5afae875be2890cf84ebfddc0c185d9")
      public
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty.builder()

      override fun publishMetricAction(publishMetricAction: IResolvable) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(IResolvable::unwrap))
      }

      override fun publishMetricAction(publishMetricAction: PublishMetricActionProperty) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(PublishMetricActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c709e38e77861004c23b0b23e18c692c5afae875be2890cf84ebfddc0c185d9")
      override
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit):
          Unit = publishMetricAction(PublishMetricActionProperty(publishMetricAction))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty,
    ) : ActionDefinitionProperty {
      override fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty):
          ActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PublishMetricActionProperty {
    public fun dimensions(): Any

    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty,
    ) : PublishMetricActionProperty {
      override fun dimensions(): Any = unwrap(this).getDimensions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublishMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty):
          PublishMetricActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishMetricActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetReferenceProperty {
    public fun referenceArn(): String? = unwrap(this).getReferenceArn()

    public interface Builder {
      public fun referenceArn(referenceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty.builder()

      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty,
    ) : IPSetReferenceProperty {
      override fun referenceArn(): String? = unwrap(this).getReferenceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty):
          IPSetReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuleGroupProperty {
    public fun referenceSets(): Any? = unwrap(this).getReferenceSets()

    public fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

    public fun rulesSource(): Any

    public fun statefulRuleOptions(): Any? = unwrap(this).getStatefulRuleOptions()

    public interface Builder {
      public fun referenceSets(referenceSets: IResolvable)

      public fun referenceSets(referenceSets: ReferenceSetsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1577f3e6419db0c8458a5cdac88441f1950350eadcc541cbcb17e3d1ca51d9e6")
      public fun referenceSets(referenceSets: ReferenceSetsProperty.Builder.() -> Unit)

      public fun ruleVariables(ruleVariables: IResolvable)

      public fun ruleVariables(ruleVariables: RuleVariablesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62687cd1cde86cf76a66787e1727f8e8d85bf027028723533321731ccd238059")
      public fun ruleVariables(ruleVariables: RuleVariablesProperty.Builder.() -> Unit)

      public fun rulesSource(rulesSource: IResolvable)

      public fun rulesSource(rulesSource: RulesSourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bc6cd492ad37eca2db2a12580d1d86fbfb46d3f4c5588e3007f9ac9e14eaefd")
      public fun rulesSource(rulesSource: RulesSourceProperty.Builder.() -> Unit)

      public fun statefulRuleOptions(statefulRuleOptions: IResolvable)

      public fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("745a88ef4d06c5778c2314ae57d8e53da7108f628231f00a66a0eabd68805809")
      public
          fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.builder()

      override fun referenceSets(referenceSets: IResolvable) {
        cdkBuilder.referenceSets(referenceSets.let(IResolvable::unwrap))
      }

      override fun referenceSets(referenceSets: ReferenceSetsProperty) {
        cdkBuilder.referenceSets(referenceSets.let(ReferenceSetsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1577f3e6419db0c8458a5cdac88441f1950350eadcc541cbcb17e3d1ca51d9e6")
      override fun referenceSets(referenceSets: ReferenceSetsProperty.Builder.() -> Unit): Unit =
          referenceSets(ReferenceSetsProperty(referenceSets))

      override fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables.let(IResolvable::unwrap))
      }

      override fun ruleVariables(ruleVariables: RuleVariablesProperty) {
        cdkBuilder.ruleVariables(ruleVariables.let(RuleVariablesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62687cd1cde86cf76a66787e1727f8e8d85bf027028723533321731ccd238059")
      override fun ruleVariables(ruleVariables: RuleVariablesProperty.Builder.() -> Unit): Unit =
          ruleVariables(RuleVariablesProperty(ruleVariables))

      override fun rulesSource(rulesSource: IResolvable) {
        cdkBuilder.rulesSource(rulesSource.let(IResolvable::unwrap))
      }

      override fun rulesSource(rulesSource: RulesSourceProperty) {
        cdkBuilder.rulesSource(rulesSource.let(RulesSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bc6cd492ad37eca2db2a12580d1d86fbfb46d3f4c5588e3007f9ac9e14eaefd")
      override fun rulesSource(rulesSource: RulesSourceProperty.Builder.() -> Unit): Unit =
          rulesSource(RulesSourceProperty(rulesSource))

      override fun statefulRuleOptions(statefulRuleOptions: IResolvable) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions.let(IResolvable::unwrap))
      }

      override fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions.let(StatefulRuleOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("745a88ef4d06c5778c2314ae57d8e53da7108f628231f00a66a0eabd68805809")
      override
          fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty.Builder.() -> Unit):
          Unit = statefulRuleOptions(StatefulRuleOptionsProperty(statefulRuleOptions))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty,
    ) : RuleGroupProperty {
      override fun referenceSets(): Any? = unwrap(this).getReferenceSets()

      override fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

      override fun rulesSource(): Any = unwrap(this).getRulesSource()

      override fun statefulRuleOptions(): Any? = unwrap(this).getStatefulRuleOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty):
          RuleGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AddressProperty {
    public fun addressDefinition(): String

    public interface Builder {
      public fun addressDefinition(addressDefinition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty.builder()

      override fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty,
    ) : AddressProperty {
      override fun addressDefinition(): String = unwrap(this).getAddressDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty):
          AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddressProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HeaderProperty {
    public fun destination(): String

    public fun destinationPort(): String

    public fun direction(): String

    public fun protocol(): String

    public fun source(): String

    public fun sourcePort(): String

    public interface Builder {
      public fun destination(destination: String)

      public fun destinationPort(destinationPort: String)

      public fun direction(direction: String)

      public fun protocol(protocol: String)

      public fun source(source: String)

      public fun sourcePort(sourcePort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      override fun destinationPort(destinationPort: String) {
        cdkBuilder.destinationPort(destinationPort)
      }

      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun sourcePort(sourcePort: String) {
        cdkBuilder.sourcePort(sourcePort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty,
    ) : HeaderProperty {
      override fun destination(): String = unwrap(this).getDestination()

      override fun destinationPort(): String = unwrap(this).getDestinationPort()

      override fun direction(): String = unwrap(this).getDirection()

      override fun protocol(): String = unwrap(this).getProtocol()

      override fun source(): String = unwrap(this).getSource()

      override fun sourcePort(): String = unwrap(this).getSourcePort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty):
          HeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TCPFlagFieldProperty {
    public fun flags(): List<String>

    public fun masks(): List<String> = unwrap(this).getMasks() ?: emptyList()

    public interface Builder {
      public fun flags(flags: List<String>)

      public fun flags(vararg flags: String)

      public fun masks(masks: List<String>)

      public fun masks(vararg masks: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty.builder()

      override fun flags(flags: List<String>) {
        cdkBuilder.flags(flags)
      }

      override fun flags(vararg flags: String): Unit = flags(flags.toList())

      override fun masks(masks: List<String>) {
        cdkBuilder.masks(masks)
      }

      override fun masks(vararg masks: String): Unit = masks(masks.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty,
    ) : TCPFlagFieldProperty {
      override fun flags(): List<String> = unwrap(this).getFlags()

      override fun masks(): List<String> = unwrap(this).getMasks() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TCPFlagFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty):
          TCPFlagFieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TCPFlagFieldProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
