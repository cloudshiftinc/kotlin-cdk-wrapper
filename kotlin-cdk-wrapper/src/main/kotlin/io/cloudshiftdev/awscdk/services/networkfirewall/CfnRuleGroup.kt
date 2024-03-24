@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `RuleGroup` to define a reusable collection of stateless or stateful network traffic
 * filtering rules.
 *
 * You use rule groups in an `FirewallPolicy` to specify the filtering behavior of an `Firewall` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnRuleGroup cfnRuleGroup = CfnRuleGroup.Builder.create(this, "MyCfnRuleGroup")
 * .capacity(123)
 * .ruleGroupName("ruleGroupName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .ruleGroup(RuleGroupProperty.builder()
 * .rulesSource(RulesSourceProperty.builder()
 * .rulesSourceList(RulesSourceListProperty.builder()
 * .generatedRulesType("generatedRulesType")
 * .targets(List.of("targets"))
 * .targetTypes(List.of("targetTypes"))
 * .build())
 * .rulesString("rulesString")
 * .statefulRules(List.of(StatefulRuleProperty.builder()
 * .action("action")
 * .header(HeaderProperty.builder()
 * .destination("destination")
 * .destinationPort("destinationPort")
 * .direction("direction")
 * .protocol("protocol")
 * .source("source")
 * .sourcePort("sourcePort")
 * .build())
 * .ruleOptions(List.of(RuleOptionProperty.builder()
 * .keyword("keyword")
 * // the properties below are optional
 * .settings(List.of("settings"))
 * .build()))
 * .build()))
 * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
 * .statelessRules(List.of(StatelessRuleProperty.builder()
 * .priority(123)
 * .ruleDefinition(RuleDefinitionProperty.builder()
 * .actions(List.of("actions"))
 * .matchAttributes(MatchAttributesProperty.builder()
 * .destinationPorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .destinations(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .protocols(List.of(123))
 * .sourcePorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .sources(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
 * .flags(List.of("flags"))
 * // the properties below are optional
 * .masks(List.of("masks"))
 * .build()))
 * .build())
 * .build())
 * .build()))
 * // the properties below are optional
 * .customActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .referenceSets(ReferenceSetsProperty.builder()
 * .ipSetReferences(Map.of(
 * "ipSetReferencesKey", Map.of(
 * "referenceArn", "referenceArn")))
 * .build())
 * .ruleVariables(RuleVariablesProperty.builder()
 * .ipSets(Map.of(
 * "ipSetsKey", Map.of(
 * "definition", List.of("definition"))))
 * .portSets(Map.of(
 * "portSetsKey", PortSetProperty.builder()
 * .definition(List.of("definition"))
 * .build()))
 * .build())
 * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html)
 */
public open class CfnRuleGroup(
  cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleGroupProps,
  ) :
      this(software.amazon.awscdk.services.networkfirewall.CfnRuleGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRuleGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleGroupProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `RuleGroup` .
   */
  public open fun attrRuleGroupArn(): String = unwrap(this).getAttrRuleGroupArn()

  /**
   * The unique ID of the `RuleGroup` resource.
   */
  public open fun attrRuleGroupId(): String = unwrap(this).getAttrRuleGroupId()

  /**
   * The maximum operating resources that this rule group can use.
   */
  public open fun capacity(): Number = unwrap(this).getCapacity()

  /**
   * The maximum operating resources that this rule group can use.
   */
  public open fun capacity(`value`: Number) {
    unwrap(this).setCapacity(`value`)
  }

  /**
   * A description of the rule group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the rule group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An object that defines the rule group rules.
   */
  public open fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

  /**
   * An object that defines the rule group rules.
   */
  public open fun ruleGroup(`value`: IResolvable) {
    unwrap(this).setRuleGroup(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that defines the rule group rules.
   */
  public open fun ruleGroup(`value`: RuleGroupProperty) {
    unwrap(this).setRuleGroup(`value`.let(RuleGroupProperty::unwrap))
  }

  /**
   * An object that defines the rule group rules.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f2b4cc462dc31260c3fd3bc65906106600a8a21bb20b96f6fc5ddfbd6c514bb")
  public open fun ruleGroup(`value`: RuleGroupProperty.Builder.() -> Unit): Unit =
      ruleGroup(RuleGroupProperty(`value`))

  /**
   * The descriptive name of the rule group.
   */
  public open fun ruleGroupName(): String = unwrap(this).getRuleGroupName()

  /**
   * The descriptive name of the rule group.
   */
  public open fun ruleGroupName(`value`: String) {
    unwrap(this).setRuleGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Indicates whether the rule group is stateless or stateful.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Indicates whether the rule group is stateless or stateful.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkfirewall.CfnRuleGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The maximum operating resources that this rule group can use.
     *
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
     * @param capacity The maximum operating resources that this rule group can use. 
     */
    public fun capacity(capacity: Number)

    /**
     * A description of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
     * @param description A description of the rule group. 
     */
    public fun description(description: String)

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    public fun ruleGroup(ruleGroup: IResolvable)

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    public fun ruleGroup(ruleGroup: RuleGroupProperty)

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f97f50c945728d3bfee62d7d343aa3aec64ffad7a90b5cb1cfbe0777365775ca")
    public fun ruleGroup(ruleGroup: RuleGroupProperty.Builder.() -> Unit)

    /**
     * The descriptive name of the rule group.
     *
     * You can't change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
     * @param ruleGroupName The descriptive name of the rule group. 
     */
    public fun ruleGroupName(ruleGroupName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Indicates whether the rule group is stateless or stateful.
     *
     * If the rule group is stateless, it contains
     * stateless rules. If it is stateful, it contains stateful rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
     * @param type Indicates whether the rule group is stateless or stateful. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.Builder.create(scope, id)

    /**
     * The maximum operating resources that this rule group can use.
     *
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
     * @param capacity The maximum operating resources that this rule group can use. 
     */
    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    /**
     * A description of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
     * @param description A description of the rule group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    override fun ruleGroup(ruleGroup: IResolvable) {
      cdkBuilder.ruleGroup(ruleGroup.let(IResolvable::unwrap))
    }

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    override fun ruleGroup(ruleGroup: RuleGroupProperty) {
      cdkBuilder.ruleGroup(ruleGroup.let(RuleGroupProperty::unwrap))
    }

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     * @param ruleGroup An object that defines the rule group rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f97f50c945728d3bfee62d7d343aa3aec64ffad7a90b5cb1cfbe0777365775ca")
    override fun ruleGroup(ruleGroup: RuleGroupProperty.Builder.() -> Unit): Unit =
        ruleGroup(RuleGroupProperty(ruleGroup))

    /**
     * The descriptive name of the rule group.
     *
     * You can't change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
     * @param ruleGroupName The descriptive name of the rule group. 
     */
    override fun ruleGroupName(ruleGroupName: String) {
      cdkBuilder.ruleGroupName(ruleGroupName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Indicates whether the rule group is stateless or stateful.
     *
     * If the rule group is stateless, it contains
     * stateless rules. If it is stateful, it contains stateful rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
     * @param type Indicates whether the rule group is stateless or stateful. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
  }

  /**
   * A custom action to use in stateless rule actions settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * ActionDefinitionProperty actionDefinitionProperty = ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-actiondefinition.html)
   */
  public interface ActionDefinitionProperty {
    /**
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for
     * the matching packet.
     *
     * This setting defines a CloudWatch dimension value to be published.
     *
     * You can pair this custom action with any of the standard stateless rule actions. For example,
     * you could pair this in a rule action with the standard action that forwards the packet for
     * stateful inspection. Then, when a packet matches the rule, Network Firewall publishes metrics
     * for the packet and forwards it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-actiondefinition.html#cfn-networkfirewall-rulegroup-actiondefinition-publishmetricaction)
     */
    public fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()

    /**
     * A builder for [ActionDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      public fun publishMetricAction(publishMetricAction: IResolvable)

      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      public fun publishMetricAction(publishMetricAction: PublishMetricActionProperty)

      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c709e38e77861004c23b0b23e18c692c5afae875be2890cf84ebfddc0c185d9")
      public
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty.builder()

      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      override fun publishMetricAction(publishMetricAction: IResolvable) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(IResolvable::unwrap))
      }

      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      override fun publishMetricAction(publishMetricAction: PublishMetricActionProperty) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(PublishMetricActionProperty::unwrap))
      }

      /**
       * @param publishMetricAction Stateless inspection criteria that publishes the specified
       * metrics to Amazon CloudWatch for the matching packet.
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c709e38e77861004c23b0b23e18c692c5afae875be2890cf84ebfddc0c185d9")
      override
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit):
          Unit = publishMetricAction(PublishMetricActionProperty(publishMetricAction))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty,
    ) : CdkObject(cdkObject), ActionDefinitionProperty {
      /**
       * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for
       * the matching packet.
       *
       * This setting defines a CloudWatch dimension value to be published.
       *
       * You can pair this custom action with any of the standard stateless rule actions. For
       * example, you could pair this in a rule action with the standard action that forwards the
       * packet for stateful inspection. Then, when a packet matches the rule, Network Firewall
       * publishes metrics for the packet and forwards it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-actiondefinition.html#cfn-networkfirewall-rulegroup-actiondefinition-publishmetricaction)
       */
      override fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty):
          ActionDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionDefinitionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ActionDefinitionProperty
    }
  }

  /**
   * A single IP address specification.
   *
   * This is used in the `RuleGroup.MatchAttributes` source and destination specifications.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * AddressProperty addressProperty = AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-address.html)
   */
  public interface AddressProperty {
    /**
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
     * notation.
     *
     * Network Firewall supports all address ranges for IPv4 and IPv6.
     *
     * Examples:
     *
     * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     * `192.0.2.44/32` .
     * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
     * specify `192.0.2.0/24` .
     * * To configure Network Firewall to inspect for the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure Network Firewall to inspect for IP addresses from
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-address.html#cfn-networkfirewall-rulegroup-address-addressdefinition)
     */
    public fun addressDefinition(): String

    /**
     * A builder for [AddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressDefinition Specify an IP address or a block of IP addresses in Classless
       * Inter-Domain Routing (CIDR) notation. 
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      public fun addressDefinition(addressDefinition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty.builder()

      /**
       * @param addressDefinition Specify an IP address or a block of IP addresses in Classless
       * Inter-Domain Routing (CIDR) notation. 
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      override fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty,
    ) : CdkObject(cdkObject), AddressProperty {
      /**
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation.
       *
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-address.html#cfn-networkfirewall-rulegroup-address-addressdefinition)
       */
      override fun addressDefinition(): String = unwrap(this).getAddressDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty):
          AddressProperty = CdkObjectWrappers.wrap(cdkObject) as? AddressProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddressProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty
    }
  }

  /**
   * An optional, non-standard action to use for stateless packet handling.
   *
   * You can define this in addition to the standard action that you must specify.
   *
   * You define and name the custom actions that you want to be able to use, and then you reference
   * them by name in your actions settings.
   *
   * You can use custom actions in the following places:
   *
   * * In an `RuleGroup.StatelessRulesAndCustomActions` . The custom actions are available for use
   * by name inside the `StatelessRulesAndCustomActions` where you define them. You can use them for
   * your stateless rule actions to specify what to do with a packet that matches the rule's match
   * attributes.
   * * In an `FirewallPolicy` specification, in `StatelessCustomActions` . The custom actions are
   * available for use inside the policy where you define them. You can use them for the policy's
   * default stateless actions settings to specify what to do with packets that don't match any of the
   * policy's stateless rules.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * CustomActionProperty customActionProperty = CustomActionProperty.builder()
   * .actionDefinition(ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .actionName("actionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html)
   */
  public interface CustomActionProperty {
    /**
     * The custom action associated with the action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html#cfn-networkfirewall-rulegroup-customaction-actiondefinition)
     */
    public fun actionDefinition(): Any

    /**
     * The descriptive name of the custom action.
     *
     * You can't change the name of a custom action after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html#cfn-networkfirewall-rulegroup-customaction-actionname)
     */
    public fun actionName(): String

    /**
     * A builder for [CustomActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      public fun actionDefinition(actionDefinition: IResolvable)

      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      public fun actionDefinition(actionDefinition: ActionDefinitionProperty)

      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f29bbdc6da9197eb1f20b3dfcf148d5dcc23a03144d9046c74fc8417071e576f")
      public fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit)

      /**
       * @param actionName The descriptive name of the custom action. 
       * You can't change the name of a custom action after you create it.
       */
      public fun actionName(actionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty.builder()

      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      override fun actionDefinition(actionDefinition: IResolvable) {
        cdkBuilder.actionDefinition(actionDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      override fun actionDefinition(actionDefinition: ActionDefinitionProperty) {
        cdkBuilder.actionDefinition(actionDefinition.let(ActionDefinitionProperty::unwrap))
      }

      /**
       * @param actionDefinition The custom action associated with the action name. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f29bbdc6da9197eb1f20b3dfcf148d5dcc23a03144d9046c74fc8417071e576f")
      override fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit):
          Unit = actionDefinition(ActionDefinitionProperty(actionDefinition))

      /**
       * @param actionName The descriptive name of the custom action. 
       * You can't change the name of a custom action after you create it.
       */
      override fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty,
    ) : CdkObject(cdkObject), CustomActionProperty {
      /**
       * The custom action associated with the action name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html#cfn-networkfirewall-rulegroup-customaction-actiondefinition)
       */
      override fun actionDefinition(): Any = unwrap(this).getActionDefinition()

      /**
       * The descriptive name of the custom action.
       *
       * You can't change the name of a custom action after you create it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html#cfn-networkfirewall-rulegroup-customaction-actionname)
       */
      override fun actionName(): String = unwrap(this).getActionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty):
          CustomActionProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.CustomActionProperty
    }
  }

  /**
   * The value to use in an Amazon CloudWatch custom metric dimension.
   *
   * This is used in the `PublishMetrics` custom action. A CloudWatch custom metric dimension is a
   * name/value pair that's part of the identity of a metric.
   *
   * AWS Network Firewall sets the dimension name to `CustomAction` and you provide the dimension
   * value.
   *
   * For more information about CloudWatch custom metric dimensions, see [Publishing Custom
   * Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions)
   * in the [Amazon CloudWatch User
   * Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * DimensionProperty dimensionProperty = DimensionProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-dimension.html)
   */
  public interface DimensionProperty {
    /**
     * The value to use in the custom metric dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-dimension.html#cfn-networkfirewall-rulegroup-dimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [DimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value to use in the custom metric dimension. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty.builder()

      /**
       * @param value The value to use in the custom metric dimension. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty,
    ) : CdkObject(cdkObject), DimensionProperty {
      /**
       * The value to use in the custom metric dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-dimension.html#cfn-networkfirewall-rulegroup-dimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty):
          DimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? DimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.DimensionProperty
    }
  }

  /**
   * The 5-tuple criteria for AWS Network Firewall to use to inspect packet headers in stateful
   * traffic flow inspection.
   *
   * Traffic flows that match the criteria are a match for the corresponding stateful rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * HeaderProperty headerProperty = HeaderProperty.builder()
   * .destination("destination")
   * .destinationPort("destinationPort")
   * .direction("direction")
   * .protocol("protocol")
   * .source("source")
   * .sourcePort("sourcePort")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html)
   */
  public interface HeaderProperty {
    /**
     * The destination IP address or address range to inspect for, in CIDR notation.
     *
     * To match with any address, specify `ANY` .
     *
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
     * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
     *
     * Examples:
     *
     * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     * `192.0.2.44/32` .
     * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
     * specify `192.0.2.0/24` .
     * * To configure Network Firewall to inspect for the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure Network Firewall to inspect for IP addresses from
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-destination)
     */
    public fun destination(): String

    /**
     * The destination port to inspect for.
     *
     * You can specify an individual port, for example `1994` and you can specify a port range, for
     * example `1990:1994` . To match with any port, specify `ANY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-destinationport)
     */
    public fun destinationPort(): String

    /**
     * The direction of traffic flow to inspect.
     *
     * If set to `ANY` , the inspection matches bidirectional traffic, both from the source to the
     * destination and from the destination to the source. If set to `FORWARD` , the inspection only
     * matches traffic going from the source to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-direction)
     */
    public fun direction(): String

    /**
     * The protocol to inspect for.
     *
     * To specify all, you can use `IP` , because all traffic on AWS and on the internet is IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-protocol)
     */
    public fun protocol(): String

    /**
     * The source IP address or address range to inspect for, in CIDR notation.
     *
     * To match with any address, specify `ANY` .
     *
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
     * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
     *
     * Examples:
     *
     * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     * `192.0.2.44/32` .
     * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
     * specify `192.0.2.0/24` .
     * * To configure Network Firewall to inspect for the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure Network Firewall to inspect for IP addresses from
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-source)
     */
    public fun source(): String

    /**
     * The source port to inspect for.
     *
     * You can specify an individual port, for example `1994` and you can specify a port range, for
     * example `1990:1994` . To match with any port, specify `ANY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-sourceport)
     */
    public fun sourcePort(): String

    /**
     * A builder for [HeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The destination IP address or address range to inspect for, in CIDR
       * notation. 
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      public fun destination(destination: String)

      /**
       * @param destinationPort The destination port to inspect for. 
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       */
      public fun destinationPort(destinationPort: String)

      /**
       * @param direction The direction of traffic flow to inspect. 
       * If set to `ANY` , the inspection matches bidirectional traffic, both from the source to the
       * destination and from the destination to the source. If set to `FORWARD` , the inspection only
       * matches traffic going from the source to the destination.
       */
      public fun direction(direction: String)

      /**
       * @param protocol The protocol to inspect for. 
       * To specify all, you can use `IP` , because all traffic on AWS and on the internet is IP.
       */
      public fun protocol(protocol: String)

      /**
       * @param source The source IP address or address range to inspect for, in CIDR notation. 
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      public fun source(source: String)

      /**
       * @param sourcePort The source port to inspect for. 
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       */
      public fun sourcePort(sourcePort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.builder()

      /**
       * @param destination The destination IP address or address range to inspect for, in CIDR
       * notation. 
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param destinationPort The destination port to inspect for. 
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       */
      override fun destinationPort(destinationPort: String) {
        cdkBuilder.destinationPort(destinationPort)
      }

      /**
       * @param direction The direction of traffic flow to inspect. 
       * If set to `ANY` , the inspection matches bidirectional traffic, both from the source to the
       * destination and from the destination to the source. If set to `FORWARD` , the inspection only
       * matches traffic going from the source to the destination.
       */
      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      /**
       * @param protocol The protocol to inspect for. 
       * To specify all, you can use `IP` , because all traffic on AWS and on the internet is IP.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param source The source IP address or address range to inspect for, in CIDR notation. 
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param sourcePort The source port to inspect for. 
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       */
      override fun sourcePort(sourcePort: String) {
        cdkBuilder.sourcePort(sourcePort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty,
    ) : CdkObject(cdkObject), HeaderProperty {
      /**
       * The destination IP address or address range to inspect for, in CIDR notation.
       *
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()

      /**
       * The destination port to inspect for.
       *
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-destinationport)
       */
      override fun destinationPort(): String = unwrap(this).getDestinationPort()

      /**
       * The direction of traffic flow to inspect.
       *
       * If set to `ANY` , the inspection matches bidirectional traffic, both from the source to the
       * destination and from the destination to the source. If set to `FORWARD` , the inspection only
       * matches traffic going from the source to the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-direction)
       */
      override fun direction(): String = unwrap(this).getDirection()

      /**
       * The protocol to inspect for.
       *
       * To specify all, you can use `IP` , because all traffic on AWS and on the internet is IP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The source IP address or address range to inspect for, in CIDR notation.
       *
       * To match with any address, specify `ANY` .
       *
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The source port to inspect for.
       *
       * You can specify an individual port, for example `1994` and you can specify a port range,
       * for example `1990:1994` . To match with any port, specify `ANY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html#cfn-networkfirewall-rulegroup-header-sourceport)
       */
      override fun sourcePort(): String = unwrap(this).getSourcePort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty):
          HeaderProperty = CdkObjectWrappers.wrap(cdkObject) as? HeaderProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty
    }
  }

  /**
   * A list of IP addresses and address ranges, in CIDR notation.
   *
   * This is part of a `RuleGroup.RuleVariables` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * IPSetProperty iPSetProperty = Map.of(
   * "definition", List.of("definition"));
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipset.html)
   */
  public interface IPSetProperty {
    /**
     * The list of IP addresses and address ranges, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipset.html#cfn-networkfirewall-rulegroup-ipset-definition)
     */
    public fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()

    /**
     * A builder for [IPSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition The list of IP addresses and address ranges, in CIDR notation.
       */
      public fun definition(definition: List<String>)

      /**
       * @param definition The list of IP addresses and address ranges, in CIDR notation.
       */
      public fun definition(vararg definition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty.builder()

      /**
       * @param definition The list of IP addresses and address ranges, in CIDR notation.
       */
      override fun definition(definition: List<String>) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param definition The list of IP addresses and address ranges, in CIDR notation.
       */
      override fun definition(vararg definition: String): Unit = definition(definition.toList())

      public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty,
    ) : CdkObject(cdkObject), IPSetProperty {
      /**
       * The list of IP addresses and address ranges, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipset.html#cfn-networkfirewall-rulegroup-ipset-definition)
       */
      override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty):
          IPSetProperty = CdkObjectWrappers.wrap(cdkObject) as? IPSetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetProperty
    }
  }

  /**
   * Configures one or more `IPSetReferences` for a Suricata-compatible rule group.
   *
   * An IP set reference is a rule variable that references a resource that you create and manage in
   * another AWS service, such as an Amazon VPC prefix list. Network Firewall IP set references enable
   * you to dynamically update the contents of your rules. When you create, update, or delete the IP
   * set you are referencing in your rule, Network Firewall automatically updates the rule's content
   * with the changes. For more information about IP set references in Network Firewall , see [Using IP
   * set
   * references](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
   * in the *Network Firewall Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * IPSetReferenceProperty iPSetReferenceProperty = Map.of(
   * "referenceArn", "referenceArn");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipsetreference.html)
   */
  public interface IPSetReferenceProperty {
    /**
     * The Amazon Resource Name (ARN) of the resource to include in the `RuleGroup.IPSetReference` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipsetreference.html#cfn-networkfirewall-rulegroup-ipsetreference-referencearn)
     */
    public fun referenceArn(): String? = unwrap(this).getReferenceArn()

    /**
     * A builder for [IPSetReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param referenceArn The Amazon Resource Name (ARN) of the resource to include in the
       * `RuleGroup.IPSetReference` .
       */
      public fun referenceArn(referenceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty.builder()

      /**
       * @param referenceArn The Amazon Resource Name (ARN) of the resource to include in the
       * `RuleGroup.IPSetReference` .
       */
      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty,
    ) : CdkObject(cdkObject), IPSetReferenceProperty {
      /**
       * The Amazon Resource Name (ARN) of the resource to include in the `RuleGroup.IPSetReference`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipsetreference.html#cfn-networkfirewall-rulegroup-ipsetreference-referencearn)
       */
      override fun referenceArn(): String? = unwrap(this).getReferenceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty):
          IPSetReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? IPSetReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.IPSetReferenceProperty
    }
  }

  /**
   * Criteria for Network Firewall to use to inspect an individual packet in stateless rule
   * inspection.
   *
   * Each match attributes set can include one or more items such as IP address, CIDR range, port
   * number, protocol, and TCP flags.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * MatchAttributesProperty matchAttributesProperty = MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
   */
  public interface MatchAttributesProperty {
    /**
     * The destination ports to inspect for.
     *
     * If not specified, this matches with any destination port. This setting is only used for
     * protocols 6 (TCP) and 17 (UDP).
     *
     * You can specify individual ports, for example `1994` and you can specify port ranges, for
     * example `1990:1994` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-destinationports)
     */
    public fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

    /**
     * The destination IP addresses and address ranges to inspect for, in CIDR notation.
     *
     * If not specified, this matches with any destination address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-destinations)
     */
    public fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * The protocols to inspect for, specified using each protocol's assigned internet protocol
     * number (IANA).
     *
     * If not specified, this matches with any protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-protocols)
     */
    public fun protocols(): Any? = unwrap(this).getProtocols()

    /**
     * The source ports to inspect for.
     *
     * If not specified, this matches with any source port. This setting is only used for protocols
     * 6 (TCP) and 17 (UDP).
     *
     * You can specify individual ports, for example `1994` and you can specify port ranges, for
     * example `1990:1994` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-sourceports)
     */
    public fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

    /**
     * The source IP addresses and address ranges to inspect for, in CIDR notation.
     *
     * If not specified, this matches with any source address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-sources)
     */
    public fun sources(): Any? = unwrap(this).getSources()

    /**
     * The TCP flags and masks to inspect for.
     *
     * If not specified, this matches with any settings. This setting is only used for protocol 6
     * (TCP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-tcpflags)
     */
    public fun tcpFlags(): Any? = unwrap(this).getTcpFlags()

    /**
     * A builder for [MatchAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun destinationPorts(destinationPorts: IResolvable)

      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun destinationPorts(destinationPorts: List<Any>)

      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun destinationPorts(vararg destinationPorts: Any)

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      public fun protocols(protocols: IResolvable)

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      public fun protocols(protocols: List<Number>)

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      public fun protocols(vararg protocols: Number)

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun sourcePorts(sourcePorts: IResolvable)

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun sourcePorts(sourcePorts: List<Any>)

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      public fun sourcePorts(vararg sourcePorts: Any)

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      public fun sources(sources: IResolvable)

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      public fun sources(sources: List<Any>)

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      public fun sources(vararg sources: Any)

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      public fun tcpFlags(tcpFlags: IResolvable)

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      public fun tcpFlags(tcpFlags: List<Any>)

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      public fun tcpFlags(vararg tcpFlags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty.builder()

      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts.let(IResolvable::unwrap))
      }

      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun destinationPorts(destinationPorts: List<Any>) {
        cdkBuilder.destinationPorts(destinationPorts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinationPorts The destination ports to inspect for.
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun destinationPorts(vararg destinationPorts: Any): Unit =
          destinationPorts(destinationPorts.toList())

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
       * notation.
       * If not specified, this matches with any destination address.
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      override fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols.let(IResolvable::unwrap))
      }

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      override fun protocols(protocols: List<Number>) {
        cdkBuilder.protocols(protocols)
      }

      /**
       * @param protocols The protocols to inspect for, specified using each protocol's assigned
       * internet protocol number (IANA).
       * If not specified, this matches with any protocol.
       */
      override fun protocols(vararg protocols: Number): Unit = protocols(protocols.toList())

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts.let(IResolvable::unwrap))
      }

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun sourcePorts(sourcePorts: List<Any>) {
        cdkBuilder.sourcePorts(sourcePorts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourcePorts The source ports to inspect for.
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       */
      override fun sourcePorts(vararg sourcePorts: Any): Unit = sourcePorts(sourcePorts.toList())

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable::unwrap))
      }

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
       * If not specified, this matches with any source address.
       */
      override fun sources(vararg sources: Any): Unit = sources(sources.toList())

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      override fun tcpFlags(tcpFlags: IResolvable) {
        cdkBuilder.tcpFlags(tcpFlags.let(IResolvable::unwrap))
      }

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      override fun tcpFlags(tcpFlags: List<Any>) {
        cdkBuilder.tcpFlags(tcpFlags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tcpFlags The TCP flags and masks to inspect for.
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       */
      override fun tcpFlags(vararg tcpFlags: Any): Unit = tcpFlags(tcpFlags.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty,
    ) : CdkObject(cdkObject), MatchAttributesProperty {
      /**
       * The destination ports to inspect for.
       *
       * If not specified, this matches with any destination port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-destinationports)
       */
      override fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

      /**
       * The destination IP addresses and address ranges to inspect for, in CIDR notation.
       *
       * If not specified, this matches with any destination address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-destinations)
       */
      override fun destinations(): Any? = unwrap(this).getDestinations()

      /**
       * The protocols to inspect for, specified using each protocol's assigned internet protocol
       * number (IANA).
       *
       * If not specified, this matches with any protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-protocols)
       */
      override fun protocols(): Any? = unwrap(this).getProtocols()

      /**
       * The source ports to inspect for.
       *
       * If not specified, this matches with any source port. This setting is only used for
       * protocols 6 (TCP) and 17 (UDP).
       *
       * You can specify individual ports, for example `1994` and you can specify port ranges, for
       * example `1990:1994` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-sourceports)
       */
      override fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

      /**
       * The source IP addresses and address ranges to inspect for, in CIDR notation.
       *
       * If not specified, this matches with any source address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-sources)
       */
      override fun sources(): Any? = unwrap(this).getSources()

      /**
       * The TCP flags and masks to inspect for.
       *
       * If not specified, this matches with any settings. This setting is only used for protocol 6
       * (TCP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html#cfn-networkfirewall-rulegroup-matchattributes-tcpflags)
       */
      override fun tcpFlags(): Any? = unwrap(this).getTcpFlags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty):
          MatchAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchAttributesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty
    }
  }

  /**
   * A single port range specification.
   *
   * This is used for source and destination port ranges in the stateless
   * `RuleGroup.MatchAttributes` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html)
   */
  public interface PortRangeProperty {
    /**
     * The lower limit of the port range.
     *
     * This must be less than or equal to the `ToPort` specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html#cfn-networkfirewall-rulegroup-portrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * The upper limit of the port range.
     *
     * This must be greater than or equal to the `FromPort` specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html#cfn-networkfirewall-rulegroup-portrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [PortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort The lower limit of the port range. 
       * This must be less than or equal to the `ToPort` specification.
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort The upper limit of the port range. 
       * This must be greater than or equal to the `FromPort` specification.
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty.builder()

      /**
       * @param fromPort The lower limit of the port range. 
       * This must be less than or equal to the `ToPort` specification.
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort The upper limit of the port range. 
       * This must be greater than or equal to the `FromPort` specification.
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      /**
       * The lower limit of the port range.
       *
       * This must be less than or equal to the `ToPort` specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html#cfn-networkfirewall-rulegroup-portrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * The upper limit of the port range.
       *
       * This must be greater than or equal to the `FromPort` specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html#cfn-networkfirewall-rulegroup-portrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty):
          PortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? PortRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty
    }
  }

  /**
   * A set of port ranges for use in the rules in a rule group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * PortSetProperty portSetProperty = PortSetProperty.builder()
   * .definition(List.of("definition"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portset.html)
   */
  public interface PortSetProperty {
    /**
     * The set of port ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portset.html#cfn-networkfirewall-rulegroup-portset-definition)
     */
    public fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()

    /**
     * A builder for [PortSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition The set of port ranges.
       */
      public fun definition(definition: List<String>)

      /**
       * @param definition The set of port ranges.
       */
      public fun definition(vararg definition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty.builder()

      /**
       * @param definition The set of port ranges.
       */
      override fun definition(definition: List<String>) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param definition The set of port ranges.
       */
      override fun definition(vararg definition: String): Unit = definition(definition.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty,
    ) : CdkObject(cdkObject), PortSetProperty {
      /**
       * The set of port ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portset.html#cfn-networkfirewall-rulegroup-portset-definition)
       */
      override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty):
          PortSetProperty = CdkObjectWrappers.wrap(cdkObject) as? PortSetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortSetProperty
    }
  }

  /**
   * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the
   * matching packet.
   *
   * This setting defines a CloudWatch dimension value to be published.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * PublishMetricActionProperty publishMetricActionProperty = PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-publishmetricaction.html)
   */
  public interface PublishMetricActionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-publishmetricaction.html#cfn-networkfirewall-rulegroup-publishmetricaction-dimensions)
     */
    public fun dimensions(): Any

    /**
     * A builder for [PublishMetricActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions the value to be set. 
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions the value to be set. 
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions the value to be set. 
       */
      public fun dimensions(vararg dimensions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty.builder()

      /**
       * @param dimensions the value to be set. 
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions the value to be set. 
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensions the value to be set. 
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty,
    ) : CdkObject(cdkObject), PublishMetricActionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-publishmetricaction.html#cfn-networkfirewall-rulegroup-publishmetricaction-dimensions)
       */
      override fun dimensions(): Any = unwrap(this).getDimensions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublishMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty):
          PublishMetricActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublishMetricActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishMetricActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty
    }
  }

  /**
   * Configures the `ReferenceSets` for a stateful rule group.
   *
   * For more information, see the [Using IP set references in Suricata compatible rule
   * groups](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
   * in the *Network Firewall User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * ReferenceSetsProperty referenceSetsProperty = ReferenceSetsProperty.builder()
   * .ipSetReferences(Map.of(
   * "ipSetReferencesKey", Map.of(
   * "referenceArn", "referenceArn")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-referencesets.html)
   */
  public interface ReferenceSetsProperty {
    /**
     * The IP set references to use in the stateful rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-referencesets.html#cfn-networkfirewall-rulegroup-referencesets-ipsetreferences)
     */
    public fun ipSetReferences(): Any? = unwrap(this).getIpSetReferences()

    /**
     * A builder for [ReferenceSetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipSetReferences The IP set references to use in the stateful rule group.
       */
      public fun ipSetReferences(ipSetReferences: IResolvable)

      /**
       * @param ipSetReferences The IP set references to use in the stateful rule group.
       */
      public fun ipSetReferences(ipSetReferences: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty.builder()

      /**
       * @param ipSetReferences The IP set references to use in the stateful rule group.
       */
      override fun ipSetReferences(ipSetReferences: IResolvable) {
        cdkBuilder.ipSetReferences(ipSetReferences.let(IResolvable::unwrap))
      }

      /**
       * @param ipSetReferences The IP set references to use in the stateful rule group.
       */
      override fun ipSetReferences(ipSetReferences: Map<String, Any>) {
        cdkBuilder.ipSetReferences(ipSetReferences.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty,
    ) : CdkObject(cdkObject), ReferenceSetsProperty {
      /**
       * The IP set references to use in the stateful rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-referencesets.html#cfn-networkfirewall-rulegroup-referencesets-ipsetreferences)
       */
      override fun ipSetReferences(): Any? = unwrap(this).getIpSetReferences()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty):
          ReferenceSetsProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceSetsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSetsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.ReferenceSetsProperty
    }
  }

  /**
   * The inspection criteria and action for a single stateless rule.
   *
   * AWS Network Firewall inspects each packet for the specified matching criteria. When a packet
   * matches the criteria, Network Firewall performs the rule's actions on the packet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RuleDefinitionProperty ruleDefinitionProperty = RuleDefinitionProperty.builder()
   * .actions(List.of("actions"))
   * .matchAttributes(MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html)
   */
  public interface RuleDefinitionProperty {
    /**
     * The actions to take on a packet that matches one of the stateless rule definition's match
     * attributes.
     *
     * You must specify a standard action and you can add custom actions.
     *
     *
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
     * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
     * for the `FirewallPolicy` .
     *
     *
     * For every rule, you must specify exactly one of the following standard actions.
     *
     * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its intended
     * destination.
     * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
     * intended destination.
     * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
     * the stateful rule engine for inspection.
     *
     * Additionally, you can specify a custom action. To do this, you define a custom action by name
     * and type, then provide the name you've assigned to the action in this `Actions` setting.
     *
     * To provide more than one action in this setting, separate the settings with a comma. For
     * example, if you have a publish metrics custom action that you've named `MyMetricsAction` , then
     * you could specify the standard action `aws:pass` combined with the custom action using
     * `[“aws:pass”, “MyMetricsAction”]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html#cfn-networkfirewall-rulegroup-ruledefinition-actions)
     */
    public fun actions(): List<String>

    /**
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule
     * inspection.
     *
     * Each match attributes set can include one or more items such as IP address, CIDR range, port
     * number, protocol, and TCP flags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html#cfn-networkfirewall-rulegroup-ruledefinition-matchattributes)
     */
    public fun matchAttributes(): Any

    /**
     * A builder for [RuleDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions to take on a packet that matches one of the stateless rule
       * definition's match attributes. 
       * You must specify a standard action and you can add custom actions.
       *
       *
       * Network Firewall only forwards a packet for stateful rule inspection if you specify
       * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
       * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
       * for the `FirewallPolicy` .
       *
       *
       * For every rule, you must specify exactly one of the following standard actions.
       *
       * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its
       * intended destination.
       * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
       * intended destination.
       * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
       * the stateful rule engine for inspection.
       *
       * Additionally, you can specify a custom action. To do this, you define a custom action by
       * name and type, then provide the name you've assigned to the action in this `Actions` setting.
       *
       * To provide more than one action in this setting, separate the settings with a comma. For
       * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
       * then you could specify the standard action `aws:pass` combined with the custom action using
       * `[“aws:pass”, “MyMetricsAction”]` .
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The actions to take on a packet that matches one of the stateless rule
       * definition's match attributes. 
       * You must specify a standard action and you can add custom actions.
       *
       *
       * Network Firewall only forwards a packet for stateful rule inspection if you specify
       * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
       * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
       * for the `FirewallPolicy` .
       *
       *
       * For every rule, you must specify exactly one of the following standard actions.
       *
       * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its
       * intended destination.
       * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
       * intended destination.
       * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
       * the stateful rule engine for inspection.
       *
       * Additionally, you can specify a custom action. To do this, you define a custom action by
       * name and type, then provide the name you've assigned to the action in this `Actions` setting.
       *
       * To provide more than one action in this setting, separate the settings with a comma. For
       * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
       * then you could specify the standard action `aws:pass` combined with the custom action using
       * `[“aws:pass”, “MyMetricsAction”]` .
       */
      public fun actions(vararg actions: String)

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      public fun matchAttributes(matchAttributes: IResolvable)

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      public fun matchAttributes(matchAttributes: MatchAttributesProperty)

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49946981ce0bea8247a6726d3b4ecc81fddd180a7d520f19c5edb1676fcccb")
      public fun matchAttributes(matchAttributes: MatchAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty.builder()

      /**
       * @param actions The actions to take on a packet that matches one of the stateless rule
       * definition's match attributes. 
       * You must specify a standard action and you can add custom actions.
       *
       *
       * Network Firewall only forwards a packet for stateful rule inspection if you specify
       * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
       * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
       * for the `FirewallPolicy` .
       *
       *
       * For every rule, you must specify exactly one of the following standard actions.
       *
       * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its
       * intended destination.
       * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
       * intended destination.
       * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
       * the stateful rule engine for inspection.
       *
       * Additionally, you can specify a custom action. To do this, you define a custom action by
       * name and type, then provide the name you've assigned to the action in this `Actions` setting.
       *
       * To provide more than one action in this setting, separate the settings with a comma. For
       * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
       * then you could specify the standard action `aws:pass` combined with the custom action using
       * `[“aws:pass”, “MyMetricsAction”]` .
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions to take on a packet that matches one of the stateless rule
       * definition's match attributes. 
       * You must specify a standard action and you can add custom actions.
       *
       *
       * Network Firewall only forwards a packet for stateful rule inspection if you specify
       * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
       * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
       * for the `FirewallPolicy` .
       *
       *
       * For every rule, you must specify exactly one of the following standard actions.
       *
       * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its
       * intended destination.
       * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
       * intended destination.
       * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
       * the stateful rule engine for inspection.
       *
       * Additionally, you can specify a custom action. To do this, you define a custom action by
       * name and type, then provide the name you've assigned to the action in this `Actions` setting.
       *
       * To provide more than one action in this setting, separate the settings with a comma. For
       * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
       * then you could specify the standard action `aws:pass` combined with the custom action using
       * `[“aws:pass”, “MyMetricsAction”]` .
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      override fun matchAttributes(matchAttributes: IResolvable) {
        cdkBuilder.matchAttributes(matchAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      override fun matchAttributes(matchAttributes: MatchAttributesProperty) {
        cdkBuilder.matchAttributes(matchAttributes.let(MatchAttributesProperty::unwrap))
      }

      /**
       * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
       * in stateless rule inspection. 
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be49946981ce0bea8247a6726d3b4ecc81fddd180a7d520f19c5edb1676fcccb")
      override fun matchAttributes(matchAttributes: MatchAttributesProperty.Builder.() -> Unit):
          Unit = matchAttributes(MatchAttributesProperty(matchAttributes))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty,
    ) : CdkObject(cdkObject), RuleDefinitionProperty {
      /**
       * The actions to take on a packet that matches one of the stateless rule definition's match
       * attributes.
       *
       * You must specify a standard action and you can add custom actions.
       *
       *
       * Network Firewall only forwards a packet for stateful rule inspection if you specify
       * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
       * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
       * for the `FirewallPolicy` .
       *
       *
       * For every rule, you must specify exactly one of the following standard actions.
       *
       * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its
       * intended destination.
       * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
       * intended destination.
       * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
       * the stateful rule engine for inspection.
       *
       * Additionally, you can specify a custom action. To do this, you define a custom action by
       * name and type, then provide the name you've assigned to the action in this `Actions` setting.
       *
       * To provide more than one action in this setting, separate the settings with a comma. For
       * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
       * then you could specify the standard action `aws:pass` combined with the custom action using
       * `[“aws:pass”, “MyMetricsAction”]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html#cfn-networkfirewall-rulegroup-ruledefinition-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * Criteria for Network Firewall to use to inspect an individual packet in stateless rule
       * inspection.
       *
       * Each match attributes set can include one or more items such as IP address, CIDR range,
       * port number, protocol, and TCP flags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html#cfn-networkfirewall-rulegroup-ruledefinition-matchattributes)
       */
      override fun matchAttributes(): Any = unwrap(this).getMatchAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty):
          RuleDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleDefinitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty
    }
  }

  /**
   * The object that defines the rules in a rule group.
   *
   * AWS Network Firewall uses a rule group to inspect and control network traffic. You define
   * stateless rule groups to inspect individual packets and you define stateful rule groups to inspect
   * packets in the context of their traffic flow.
   *
   * To use a rule group, you include it by reference in an Network Firewall firewall policy, then
   * you use the policy in a firewall. You can reference a rule group from more than one firewall
   * policy, and you can use a firewall policy in more than one firewall.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
   * .rulesSource(RulesSourceProperty.builder()
   * .rulesSourceList(RulesSourceListProperty.builder()
   * .generatedRulesType("generatedRulesType")
   * .targets(List.of("targets"))
   * .targetTypes(List.of("targetTypes"))
   * .build())
   * .rulesString("rulesString")
   * .statefulRules(List.of(StatefulRuleProperty.builder()
   * .action("action")
   * .header(HeaderProperty.builder()
   * .destination("destination")
   * .destinationPort("destinationPort")
   * .direction("direction")
   * .protocol("protocol")
   * .source("source")
   * .sourcePort("sourcePort")
   * .build())
   * .ruleOptions(List.of(RuleOptionProperty.builder()
   * .keyword("keyword")
   * // the properties below are optional
   * .settings(List.of("settings"))
   * .build()))
   * .build()))
   * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
   * .statelessRules(List.of(StatelessRuleProperty.builder()
   * .priority(123)
   * .ruleDefinition(RuleDefinitionProperty.builder()
   * .actions(List.of("actions"))
   * .matchAttributes(MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .customActions(List.of(CustomActionProperty.builder()
   * .actionDefinition(ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .actionName("actionName")
   * .build()))
   * .build())
   * .build())
   * // the properties below are optional
   * .referenceSets(ReferenceSetsProperty.builder()
   * .ipSetReferences(Map.of(
   * "ipSetReferencesKey", Map.of(
   * "referenceArn", "referenceArn")))
   * .build())
   * .ruleVariables(RuleVariablesProperty.builder()
   * .ipSets(Map.of(
   * "ipSetsKey", Map.of(
   * "definition", List.of("definition"))))
   * .portSets(Map.of(
   * "portSetsKey", PortSetProperty.builder()
   * .definition(List.of("definition"))
   * .build()))
   * .build())
   * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
   * .ruleOrder("ruleOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html)
   */
  public interface RuleGroupProperty {
    /**
     * The reference sets for the stateful rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-referencesets)
     */
    public fun referenceSets(): Any? = unwrap(this).getReferenceSets()

    /**
     * Settings that are available for use in the rules in the rule group.
     *
     * You can only use these for stateful rule groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-rulevariables)
     */
    public fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

    /**
     * The stateful rules or stateless rules for the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-rulessource)
     */
    public fun rulesSource(): Any

    /**
     * Additional options governing how Network Firewall handles stateful rules.
     *
     * The policies where you use your stateful rule group must have stateful rule options settings
     * that are compatible with these settings. Some limitations apply; for more information, see
     * [Strict evaluation
     * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-statefulruleoptions)
     */
    public fun statefulRuleOptions(): Any? = unwrap(this).getStatefulRuleOptions()

    /**
     * A builder for [RuleGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      public fun referenceSets(referenceSets: IResolvable)

      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      public fun referenceSets(referenceSets: ReferenceSetsProperty)

      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1577f3e6419db0c8458a5cdac88441f1950350eadcc541cbcb17e3d1ca51d9e6")
      public fun referenceSets(referenceSets: ReferenceSetsProperty.Builder.() -> Unit)

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      public fun ruleVariables(ruleVariables: IResolvable)

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      public fun ruleVariables(ruleVariables: RuleVariablesProperty)

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62687cd1cde86cf76a66787e1727f8e8d85bf027028723533321731ccd238059")
      public fun ruleVariables(ruleVariables: RuleVariablesProperty.Builder.() -> Unit)

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      public fun rulesSource(rulesSource: IResolvable)

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      public fun rulesSource(rulesSource: RulesSourceProperty)

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bc6cd492ad37eca2db2a12580d1d86fbfb46d3f4c5588e3007f9ac9e14eaefd")
      public fun rulesSource(rulesSource: RulesSourceProperty.Builder.() -> Unit)

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun statefulRuleOptions(statefulRuleOptions: IResolvable)

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty)

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("745a88ef4d06c5778c2314ae57d8e53da7108f628231f00a66a0eabd68805809")
      public
          fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.builder()

      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      override fun referenceSets(referenceSets: IResolvable) {
        cdkBuilder.referenceSets(referenceSets.let(IResolvable::unwrap))
      }

      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      override fun referenceSets(referenceSets: ReferenceSetsProperty) {
        cdkBuilder.referenceSets(referenceSets.let(ReferenceSetsProperty::unwrap))
      }

      /**
       * @param referenceSets The reference sets for the stateful rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1577f3e6419db0c8458a5cdac88441f1950350eadcc541cbcb17e3d1ca51d9e6")
      override fun referenceSets(referenceSets: ReferenceSetsProperty.Builder.() -> Unit): Unit =
          referenceSets(ReferenceSetsProperty(referenceSets))

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      override fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables.let(IResolvable::unwrap))
      }

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      override fun ruleVariables(ruleVariables: RuleVariablesProperty) {
        cdkBuilder.ruleVariables(ruleVariables.let(RuleVariablesProperty::unwrap))
      }

      /**
       * @param ruleVariables Settings that are available for use in the rules in the rule group.
       * You can only use these for stateful rule groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62687cd1cde86cf76a66787e1727f8e8d85bf027028723533321731ccd238059")
      override fun ruleVariables(ruleVariables: RuleVariablesProperty.Builder.() -> Unit): Unit =
          ruleVariables(RuleVariablesProperty(ruleVariables))

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      override fun rulesSource(rulesSource: IResolvable) {
        cdkBuilder.rulesSource(rulesSource.let(IResolvable::unwrap))
      }

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      override fun rulesSource(rulesSource: RulesSourceProperty) {
        cdkBuilder.rulesSource(rulesSource.let(RulesSourceProperty::unwrap))
      }

      /**
       * @param rulesSource The stateful rules or stateless rules for the rule group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0bc6cd492ad37eca2db2a12580d1d86fbfb46d3f4c5588e3007f9ac9e14eaefd")
      override fun rulesSource(rulesSource: RulesSourceProperty.Builder.() -> Unit): Unit =
          rulesSource(RulesSourceProperty(rulesSource))

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun statefulRuleOptions(statefulRuleOptions: IResolvable) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions.let(IResolvable::unwrap))
      }

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions.let(StatefulRuleOptionsProperty::unwrap))
      }

      /**
       * @param statefulRuleOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("745a88ef4d06c5778c2314ae57d8e53da7108f628231f00a66a0eabd68805809")
      override
          fun statefulRuleOptions(statefulRuleOptions: StatefulRuleOptionsProperty.Builder.() -> Unit):
          Unit = statefulRuleOptions(StatefulRuleOptionsProperty(statefulRuleOptions))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty,
    ) : CdkObject(cdkObject), RuleGroupProperty {
      /**
       * The reference sets for the stateful rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-referencesets)
       */
      override fun referenceSets(): Any? = unwrap(this).getReferenceSets()

      /**
       * Settings that are available for use in the rules in the rule group.
       *
       * You can only use these for stateful rule groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-rulevariables)
       */
      override fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

      /**
       * The stateful rules or stateless rules for the rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-rulessource)
       */
      override fun rulesSource(): Any = unwrap(this).getRulesSource()

      /**
       * Additional options governing how Network Firewall handles stateful rules.
       *
       * The policies where you use your stateful rule group must have stateful rule options
       * settings that are compatible with these settings. Some limitations apply; for more
       * information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-limitations-caveats.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup-statefulruleoptions)
       */
      override fun statefulRuleOptions(): Any? = unwrap(this).getStatefulRuleOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty):
          RuleGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty
    }
  }

  /**
   * Additional settings for a stateful rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RuleOptionProperty ruleOptionProperty = RuleOptionProperty.builder()
   * .keyword("keyword")
   * // the properties below are optional
   * .settings(List.of("settings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html)
   */
  public interface RuleOptionProperty {
    /**
     * The Suricata rule option keywords.
     *
     * For Network Firewall , the keyword signature ID (sid) is required in the format `sid:112233`
     * . The sid must be unique within the rule group. For information about Suricata rule option
     * keywords, see [Rule
     * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html#cfn-networkfirewall-rulegroup-ruleoption-keyword)
     */
    public fun keyword(): String

    /**
     * The Suricata rule option settings.
     *
     * Settings have zero or more values, and the number of possible settings and required settings
     * depends on the keyword. The format for Settings is `number` . For information about Suricata
     * rule option settings, see [Rule
     * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html#cfn-networkfirewall-rulegroup-ruleoption-settings)
     */
    public fun settings(): List<String> = unwrap(this).getSettings() ?: emptyList()

    /**
     * A builder for [RuleOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyword The Suricata rule option keywords. 
       * For Network Firewall , the keyword signature ID (sid) is required in the format
       * `sid:112233` . The sid must be unique within the rule group. For information about Suricata
       * rule option keywords, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      public fun keyword(keyword: String)

      /**
       * @param settings The Suricata rule option settings.
       * Settings have zero or more values, and the number of possible settings and required
       * settings depends on the keyword. The format for Settings is `number` . For information about
       * Suricata rule option settings, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      public fun tings(settings: List<String>)

      /**
       * @param settings The Suricata rule option settings.
       * Settings have zero or more values, and the number of possible settings and required
       * settings depends on the keyword. The format for Settings is `number` . For information about
       * Suricata rule option settings, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      public fun tings(vararg settings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty.builder()

      /**
       * @param keyword The Suricata rule option keywords. 
       * For Network Firewall , the keyword signature ID (sid) is required in the format
       * `sid:112233` . The sid must be unique within the rule group. For information about Suricata
       * rule option keywords, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      override fun keyword(keyword: String) {
        cdkBuilder.keyword(keyword)
      }

      /**
       * @param settings The Suricata rule option settings.
       * Settings have zero or more values, and the number of possible settings and required
       * settings depends on the keyword. The format for Settings is `number` . For information about
       * Suricata rule option settings, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      override fun tings(settings: List<String>) {
        cdkBuilder.settings(settings)
      }

      /**
       * @param settings The Suricata rule option settings.
       * Settings have zero or more values, and the number of possible settings and required
       * settings depends on the keyword. The format for Settings is `number` . For information about
       * Suricata rule option settings, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       */
      override fun tings(vararg settings: String): Unit = tings(settings.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty,
    ) : CdkObject(cdkObject), RuleOptionProperty {
      /**
       * The Suricata rule option keywords.
       *
       * For Network Firewall , the keyword signature ID (sid) is required in the format
       * `sid:112233` . The sid must be unique within the rule group. For information about Suricata
       * rule option keywords, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html#cfn-networkfirewall-rulegroup-ruleoption-keyword)
       */
      override fun keyword(): String = unwrap(this).getKeyword()

      /**
       * The Suricata rule option settings.
       *
       * Settings have zero or more values, and the number of possible settings and required
       * settings depends on the keyword. The format for Settings is `number` . For information about
       * Suricata rule option settings, see [Rule
       * options](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html#rule-options)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html#cfn-networkfirewall-rulegroup-ruleoption-settings)
       */
      override fun settings(): List<String> = unwrap(this).getSettings() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty):
          RuleOptionProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleOptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleOptionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleOptionProperty
    }
  }

  /**
   * Settings that are available for use in the rules in the `RuleGroup` where this is defined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RuleVariablesProperty ruleVariablesProperty = RuleVariablesProperty.builder()
   * .ipSets(Map.of(
   * "ipSetsKey", Map.of(
   * "definition", List.of("definition"))))
   * .portSets(Map.of(
   * "portSetsKey", PortSetProperty.builder()
   * .definition(List.of("definition"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html)
   */
  public interface RuleVariablesProperty {
    /**
     * A list of IP addresses and address ranges, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html#cfn-networkfirewall-rulegroup-rulevariables-ipsets)
     */
    public fun ipSets(): Any? = unwrap(this).getIpSets()

    /**
     * A list of port ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html#cfn-networkfirewall-rulegroup-rulevariables-portsets)
     */
    public fun portSets(): Any? = unwrap(this).getPortSets()

    /**
     * A builder for [RuleVariablesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
       */
      public fun ipSets(ipSets: IResolvable)

      /**
       * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
       */
      public fun ipSets(ipSets: Map<String, Any>)

      /**
       * @param portSets A list of port ranges.
       */
      public fun portSets(portSets: IResolvable)

      /**
       * @param portSets A list of port ranges.
       */
      public fun portSets(portSets: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty.builder()

      /**
       * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
       */
      override fun ipSets(ipSets: IResolvable) {
        cdkBuilder.ipSets(ipSets.let(IResolvable::unwrap))
      }

      /**
       * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
       */
      override fun ipSets(ipSets: Map<String, Any>) {
        cdkBuilder.ipSets(ipSets.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param portSets A list of port ranges.
       */
      override fun portSets(portSets: IResolvable) {
        cdkBuilder.portSets(portSets.let(IResolvable::unwrap))
      }

      /**
       * @param portSets A list of port ranges.
       */
      override fun portSets(portSets: Map<String, Any>) {
        cdkBuilder.portSets(portSets.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty,
    ) : CdkObject(cdkObject), RuleVariablesProperty {
      /**
       * A list of IP addresses and address ranges, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html#cfn-networkfirewall-rulegroup-rulevariables-ipsets)
       */
      override fun ipSets(): Any? = unwrap(this).getIpSets()

      /**
       * A list of port ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html#cfn-networkfirewall-rulegroup-rulevariables-portsets)
       */
      override fun portSets(): Any? = unwrap(this).getPortSets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleVariablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty):
          RuleVariablesProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleVariablesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleVariablesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty
    }
  }

  /**
   * Stateful inspection criteria for a domain list rule group.
   *
   * For HTTPS traffic, domain filtering is SNI-based. It uses the server name indicator extension
   * of the TLS handshake.
   *
   * By default, Network Firewall domain list inspection only includes traffic coming from the VPC
   * where you deploy the firewall. To inspect traffic from IP addresses outside of the deployment VPC,
   * you set the `HOME_NET` rule variable to include the CIDR range of the deployment VPC plus the
   * other CIDR ranges. For more information, see `RuleGroup.RuleVariables` in this guide and [Stateful
   * domain list rule groups in AWS Network
   * Firewall](https://docs.aws.amazon.com/network-firewall/latest/developerguide/stateful-rule-groups-domain-names.html)
   * in the *Network Firewall Developer Guide*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RulesSourceListProperty rulesSourceListProperty = RulesSourceListProperty.builder()
   * .generatedRulesType("generatedRulesType")
   * .targets(List.of("targets"))
   * .targetTypes(List.of("targetTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html)
   */
  public interface RulesSourceListProperty {
    /**
     * Whether you want to allow or deny access to the domains in your target list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-generatedrulestype)
     */
    public fun generatedRulesType(): String

    /**
     * The types of targets to inspect for.
     *
     * Valid values are `TLS_SNI` and `HTTP_HOST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-targettypes)
     */
    public fun targetTypes(): List<String>

    /**
     * The domains that you want to inspect for in your traffic flows. Valid domain specifications
     * are the following:.
     *
     * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com` .
     * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For example,
     * `.example.com` matches `example.com` and matches all subdomains of `example.com` , such as
     * `abc.example.com` and `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-targets)
     */
    public fun targets(): List<String>

    /**
     * A builder for [RulesSourceListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param generatedRulesType Whether you want to allow or deny access to the domains in your
       * target list. 
       */
      public fun generatedRulesType(generatedRulesType: String)

      /**
       * @param targetTypes The types of targets to inspect for. 
       * Valid values are `TLS_SNI` and `HTTP_HOST` .
       */
      public fun targetTypes(targetTypes: List<String>)

      /**
       * @param targetTypes The types of targets to inspect for. 
       * Valid values are `TLS_SNI` and `HTTP_HOST` .
       */
      public fun targetTypes(vararg targetTypes: String)

      /**
       * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
       * specifications are the following:. 
       * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com`
       * .
       * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For
       * example, `.example.com` matches `example.com` and matches all subdomains of `example.com` ,
       * such as `abc.example.com` and `www.example.com` .
       */
      public fun targets(targets: List<String>)

      /**
       * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
       * specifications are the following:. 
       * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com`
       * .
       * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For
       * example, `.example.com` matches `example.com` and matches all subdomains of `example.com` ,
       * such as `abc.example.com` and `www.example.com` .
       */
      public fun targets(vararg targets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty.builder()

      /**
       * @param generatedRulesType Whether you want to allow or deny access to the domains in your
       * target list. 
       */
      override fun generatedRulesType(generatedRulesType: String) {
        cdkBuilder.generatedRulesType(generatedRulesType)
      }

      /**
       * @param targetTypes The types of targets to inspect for. 
       * Valid values are `TLS_SNI` and `HTTP_HOST` .
       */
      override fun targetTypes(targetTypes: List<String>) {
        cdkBuilder.targetTypes(targetTypes)
      }

      /**
       * @param targetTypes The types of targets to inspect for. 
       * Valid values are `TLS_SNI` and `HTTP_HOST` .
       */
      override fun targetTypes(vararg targetTypes: String): Unit = targetTypes(targetTypes.toList())

      /**
       * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
       * specifications are the following:. 
       * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com`
       * .
       * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For
       * example, `.example.com` matches `example.com` and matches all subdomains of `example.com` ,
       * such as `abc.example.com` and `www.example.com` .
       */
      override fun targets(targets: List<String>) {
        cdkBuilder.targets(targets)
      }

      /**
       * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
       * specifications are the following:. 
       * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com`
       * .
       * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For
       * example, `.example.com` matches `example.com` and matches all subdomains of `example.com` ,
       * such as `abc.example.com` and `www.example.com` .
       */
      override fun targets(vararg targets: String): Unit = targets(targets.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty,
    ) : CdkObject(cdkObject), RulesSourceListProperty {
      /**
       * Whether you want to allow or deny access to the domains in your target list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-generatedrulestype)
       */
      override fun generatedRulesType(): String = unwrap(this).getGeneratedRulesType()

      /**
       * The types of targets to inspect for.
       *
       * Valid values are `TLS_SNI` and `HTTP_HOST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-targettypes)
       */
      override fun targetTypes(): List<String> = unwrap(this).getTargetTypes()

      /**
       * The domains that you want to inspect for in your traffic flows. Valid domain specifications
       * are the following:.
       *
       * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com`
       * .
       * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For
       * example, `.example.com` matches `example.com` and matches all subdomains of `example.com` ,
       * such as `abc.example.com` and `www.example.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html#cfn-networkfirewall-rulegroup-rulessourcelist-targets)
       */
      override fun targets(): List<String> = unwrap(this).getTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RulesSourceListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty):
          RulesSourceListProperty = CdkObjectWrappers.wrap(cdkObject) as? RulesSourceListProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesSourceListProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty
    }
  }

  /**
   * The stateless or stateful rules definitions for use in a single rule group.
   *
   * Each rule group requires a single `RulesSource` . You can use an instance of this for either
   * stateless rules or stateful rules.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * RulesSourceProperty rulesSourceProperty = RulesSourceProperty.builder()
   * .rulesSourceList(RulesSourceListProperty.builder()
   * .generatedRulesType("generatedRulesType")
   * .targets(List.of("targets"))
   * .targetTypes(List.of("targetTypes"))
   * .build())
   * .rulesString("rulesString")
   * .statefulRules(List.of(StatefulRuleProperty.builder()
   * .action("action")
   * .header(HeaderProperty.builder()
   * .destination("destination")
   * .destinationPort("destinationPort")
   * .direction("direction")
   * .protocol("protocol")
   * .source("source")
   * .sourcePort("sourcePort")
   * .build())
   * .ruleOptions(List.of(RuleOptionProperty.builder()
   * .keyword("keyword")
   * // the properties below are optional
   * .settings(List.of("settings"))
   * .build()))
   * .build()))
   * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
   * .statelessRules(List.of(StatelessRuleProperty.builder()
   * .priority(123)
   * .ruleDefinition(RuleDefinitionProperty.builder()
   * .actions(List.of("actions"))
   * .matchAttributes(MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .customActions(List.of(CustomActionProperty.builder()
   * .actionDefinition(ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .actionName("actionName")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html)
   */
  public interface RulesSourceProperty {
    /**
     * Stateful inspection criteria for a domain list rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-rulessourcelist)
     */
    public fun rulesSourceList(): Any? = unwrap(this).getRulesSourceList()

    /**
     * Stateful inspection criteria, provided in Suricata compatible rules.
     *
     * Suricata is an open-source threat detection framework that includes a standard rule-based
     * language for network traffic inspection.
     *
     * These rules contain the inspection criteria and the action to take for traffic that matches
     * the criteria, so this type of rule group doesn't have a separate action setting.
     *
     *
     * You can't use the `priority` keyword if the `RuleOrder` option in `StatefulRuleOptions` is
     * set to `STRICT_ORDER` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-rulesstring)
     */
    public fun rulesString(): String? = unwrap(this).getRulesString()

    /**
     * An array of individual stateful rules inspection criteria to be used together in a stateful
     * rule group.
     *
     * Use this option to specify simple Suricata rules with protocol, source and destination,
     * ports, direction, and rule options. For information about the Suricata `Rules` format, see
     * [Rules
     * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-statefulrules)
     */
    public fun statefulRules(): Any? = unwrap(this).getStatefulRules()

    /**
     * Stateless inspection criteria to be used in a stateless rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-statelessrulesandcustomactions)
     */
    public fun statelessRulesAndCustomActions(): Any? =
        unwrap(this).getStatelessRulesAndCustomActions()

    /**
     * A builder for [RulesSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      public fun rulesSourceList(rulesSourceList: IResolvable)

      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      public fun rulesSourceList(rulesSourceList: RulesSourceListProperty)

      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c7c626f64d529118eaa4e54bb67e966574361929b99cc5af792bcd0b173bb69")
      public fun rulesSourceList(rulesSourceList: RulesSourceListProperty.Builder.() -> Unit)

      /**
       * @param rulesString Stateful inspection criteria, provided in Suricata compatible rules.
       * Suricata is an open-source threat detection framework that includes a standard rule-based
       * language for network traffic inspection.
       *
       * These rules contain the inspection criteria and the action to take for traffic that matches
       * the criteria, so this type of rule group doesn't have a separate action setting.
       *
       *
       * You can't use the `priority` keyword if the `RuleOrder` option in `StatefulRuleOptions` is
       * set to `STRICT_ORDER` .
       */
      public fun rulesString(rulesString: String)

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      public fun statefulRules(statefulRules: IResolvable)

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      public fun statefulRules(statefulRules: List<Any>)

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      public fun statefulRules(vararg statefulRules: Any)

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      public fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable)

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      public
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty)

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f0a5148e36d61899ba2f443efda913fa8b21432f14729eb6f802a14e2625fb0")
      public
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.builder()

      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      override fun rulesSourceList(rulesSourceList: IResolvable) {
        cdkBuilder.rulesSourceList(rulesSourceList.let(IResolvable::unwrap))
      }

      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      override fun rulesSourceList(rulesSourceList: RulesSourceListProperty) {
        cdkBuilder.rulesSourceList(rulesSourceList.let(RulesSourceListProperty::unwrap))
      }

      /**
       * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c7c626f64d529118eaa4e54bb67e966574361929b99cc5af792bcd0b173bb69")
      override fun rulesSourceList(rulesSourceList: RulesSourceListProperty.Builder.() -> Unit):
          Unit = rulesSourceList(RulesSourceListProperty(rulesSourceList))

      /**
       * @param rulesString Stateful inspection criteria, provided in Suricata compatible rules.
       * Suricata is an open-source threat detection framework that includes a standard rule-based
       * language for network traffic inspection.
       *
       * These rules contain the inspection criteria and the action to take for traffic that matches
       * the criteria, so this type of rule group doesn't have a separate action setting.
       *
       *
       * You can't use the `priority` keyword if the `RuleOrder` option in `StatefulRuleOptions` is
       * set to `STRICT_ORDER` .
       */
      override fun rulesString(rulesString: String) {
        cdkBuilder.rulesString(rulesString)
      }

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      override fun statefulRules(statefulRules: IResolvable) {
        cdkBuilder.statefulRules(statefulRules.let(IResolvable::unwrap))
      }

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      override fun statefulRules(statefulRules: List<Any>) {
        cdkBuilder.statefulRules(statefulRules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param statefulRules An array of individual stateful rules inspection criteria to be used
       * together in a stateful rule group.
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       */
      override fun statefulRules(vararg statefulRules: Any): Unit =
          statefulRules(statefulRules.toList())

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      override fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions.let(IResolvable::unwrap))
      }

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      override
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions.let(StatelessRulesAndCustomActionsProperty::unwrap))
      }

      /**
       * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a
       * stateless rule group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f0a5148e36d61899ba2f443efda913fa8b21432f14729eb6f802a14e2625fb0")
      override
          fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: StatelessRulesAndCustomActionsProperty.Builder.() -> Unit):
          Unit =
          statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty(statelessRulesAndCustomActions))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty,
    ) : CdkObject(cdkObject), RulesSourceProperty {
      /**
       * Stateful inspection criteria for a domain list rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-rulessourcelist)
       */
      override fun rulesSourceList(): Any? = unwrap(this).getRulesSourceList()

      /**
       * Stateful inspection criteria, provided in Suricata compatible rules.
       *
       * Suricata is an open-source threat detection framework that includes a standard rule-based
       * language for network traffic inspection.
       *
       * These rules contain the inspection criteria and the action to take for traffic that matches
       * the criteria, so this type of rule group doesn't have a separate action setting.
       *
       *
       * You can't use the `priority` keyword if the `RuleOrder` option in `StatefulRuleOptions` is
       * set to `STRICT_ORDER` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-rulesstring)
       */
      override fun rulesString(): String? = unwrap(this).getRulesString()

      /**
       * An array of individual stateful rules inspection criteria to be used together in a stateful
       * rule group.
       *
       * Use this option to specify simple Suricata rules with protocol, source and destination,
       * ports, direction, and rule options. For information about the Suricata `Rules` format, see
       * [Rules
       * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-statefulrules)
       */
      override fun statefulRules(): Any? = unwrap(this).getStatefulRules()

      /**
       * Stateless inspection criteria to be used in a stateless rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html#cfn-networkfirewall-rulegroup-rulessource-statelessrulesandcustomactions)
       */
      override fun statelessRulesAndCustomActions(): Any? =
          unwrap(this).getStatelessRulesAndCustomActions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RulesSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty):
          RulesSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? RulesSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesSourceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty
    }
  }

  /**
   * Additional options governing how Network Firewall handles the rule group.
   *
   * You can only use these for stateful rule groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatefulRuleOptionsProperty statefulRuleOptionsProperty = StatefulRuleOptionsProperty.builder()
   * .ruleOrder("ruleOrder")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulruleoptions.html)
   */
  public interface StatefulRuleOptionsProperty {
    /**
     * Indicates how to manage the order of the rule evaluation for the rule group.
     *
     * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
     * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     * For more information, see [Evaluation order for stateful
     * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulruleoptions.html#cfn-networkfirewall-rulegroup-statefulruleoptions-ruleorder)
     */
    public fun ruleOrder(): String? = unwrap(this).getRuleOrder()

    /**
     * A builder for [StatefulRuleOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ruleOrder Indicates how to manage the order of the rule evaluation for the rule
       * group.
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun ruleOrder(ruleOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty.builder()

      /**
       * @param ruleOrder Indicates how to manage the order of the rule evaluation for the rule
       * group.
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun ruleOrder(ruleOrder: String) {
        cdkBuilder.ruleOrder(ruleOrder)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty,
    ) : CdkObject(cdkObject), StatefulRuleOptionsProperty {
      /**
       * Indicates how to manage the order of the rule evaluation for the rule group.
       *
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulruleoptions.html#cfn-networkfirewall-rulegroup-statefulruleoptions-ruleorder)
       */
      override fun ruleOrder(): String? = unwrap(this).getRuleOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulRuleOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty):
          StatefulRuleOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StatefulRuleOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleOptionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty
    }
  }

  /**
   * A single Suricata rules specification, for use in a stateful rule group.
   *
   * Use this option to specify a simple Suricata rule with protocol, source and destination, ports,
   * direction, and rule options. For information about the Suricata `Rules` format, see [Rules
   * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatefulRuleProperty statefulRuleProperty = StatefulRuleProperty.builder()
   * .action("action")
   * .header(HeaderProperty.builder()
   * .destination("destination")
   * .destinationPort("destinationPort")
   * .direction("direction")
   * .protocol("protocol")
   * .source("source")
   * .sourcePort("sourcePort")
   * .build())
   * .ruleOptions(List.of(RuleOptionProperty.builder()
   * .keyword("keyword")
   * // the properties below are optional
   * .settings(List.of("settings"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html)
   */
  public interface StatefulRuleProperty {
    /**
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow
     * matches the stateful rule criteria.
     *
     * For all actions, Network Firewall performs the specified action and discontinues stateful
     * inspection of the traffic flow.
     *
     * The actions for a stateful rule are defined as follows:
     *
     * * *PASS* - Permits the packets to go to the intended destination.
     * * *DROP* - Blocks the packets from going to the intended destination and sends an alert log
     * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
     * * *REJECT* - Drops traffic that matches the conditions of the stateful rule and sends a TCP
     * reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and a
     * `RST` bit contained in the TCP header flags. `REJECT` is available only for TCP traffic.
     * * *ALERT* - Permits the packets to go to the intended destination and sends an alert log
     * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
     *
     * You can use this action to test a rule that you intend to use to drop traffic. You can enable
     * the rule with `ALERT` action, verify in the logs that the rule is filtering as you want, then
     * change the action to `DROP` .
     *
     * * *REJECT* - Drops TCP traffic that matches the conditions of the stateful rule, and sends a
     * TCP reset packet back to sender of the packet. A TCP reset packet is a packet with no payload
     * and a `RST` bit contained in the TCP header flags. Also sends an alert log mesage if alert
     * logging is configured in the `Firewall` `LoggingConfiguration` .
     *
     * `REJECT` isn't currently available for use with IMAP and FTP protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-action)
     */
    public fun action(): String

    /**
     * The stateful inspection criteria for this rule, used to inspect traffic flows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-header)
     */
    public fun `header`(): Any

    /**
     * Additional settings for a stateful rule, provided as keywords and settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-ruleoptions)
     */
    public fun ruleOptions(): Any

    /**
     * A builder for [StatefulRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Defines what Network Firewall should do with the packets in a traffic flow
       * when the flow matches the stateful rule criteria. 
       * For all actions, Network Firewall performs the specified action and discontinues stateful
       * inspection of the traffic flow.
       *
       * The actions for a stateful rule are defined as follows:
       *
       * * *PASS* - Permits the packets to go to the intended destination.
       * * *DROP* - Blocks the packets from going to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       * * *REJECT* - Drops traffic that matches the conditions of the stateful rule and sends a TCP
       * reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and
       * a `RST` bit contained in the TCP header flags. `REJECT` is available only for TCP traffic.
       * * *ALERT* - Permits the packets to go to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * You can use this action to test a rule that you intend to use to drop traffic. You can
       * enable the rule with `ALERT` action, verify in the logs that the rule is filtering as you
       * want, then change the action to `DROP` .
       *
       * * *REJECT* - Drops TCP traffic that matches the conditions of the stateful rule, and sends
       * a TCP reset packet back to sender of the packet. A TCP reset packet is a packet with no
       * payload and a `RST` bit contained in the TCP header flags. Also sends an alert log mesage if
       * alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * `REJECT` isn't currently available for use with IMAP and FTP protocols.
       */
      public fun action(action: String)

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      public fun `header`(`header`: IResolvable)

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      public fun `header`(`header`: HeaderProperty)

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47c83241672bba57efea9b623ce5228ca59fdf785b34a8abd5df7a45b2ec11e6")
      public fun `header`(`header`: HeaderProperty.Builder.() -> Unit)

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      public fun ruleOptions(ruleOptions: IResolvable)

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      public fun ruleOptions(ruleOptions: List<Any>)

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      public fun ruleOptions(vararg ruleOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty.builder()

      /**
       * @param action Defines what Network Firewall should do with the packets in a traffic flow
       * when the flow matches the stateful rule criteria. 
       * For all actions, Network Firewall performs the specified action and discontinues stateful
       * inspection of the traffic flow.
       *
       * The actions for a stateful rule are defined as follows:
       *
       * * *PASS* - Permits the packets to go to the intended destination.
       * * *DROP* - Blocks the packets from going to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       * * *REJECT* - Drops traffic that matches the conditions of the stateful rule and sends a TCP
       * reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and
       * a `RST` bit contained in the TCP header flags. `REJECT` is available only for TCP traffic.
       * * *ALERT* - Permits the packets to go to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * You can use this action to test a rule that you intend to use to drop traffic. You can
       * enable the rule with `ALERT` action, verify in the logs that the rule is filtering as you
       * want, then change the action to `DROP` .
       *
       * * *REJECT* - Drops TCP traffic that matches the conditions of the stateful rule, and sends
       * a TCP reset packet back to sender of the packet. A TCP reset packet is a packet with no
       * payload and a `RST` bit contained in the TCP header flags. Also sends an alert log mesage if
       * alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * `REJECT` isn't currently available for use with IMAP and FTP protocols.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      override fun `header`(`header`: HeaderProperty) {
        cdkBuilder.`header`(`header`.let(HeaderProperty::unwrap))
      }

      /**
       * @param header The stateful inspection criteria for this rule, used to inspect traffic
       * flows. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47c83241672bba57efea9b623ce5228ca59fdf785b34a8abd5df7a45b2ec11e6")
      override fun `header`(`header`: HeaderProperty.Builder.() -> Unit): Unit =
          `header`(HeaderProperty(`header`))

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      override fun ruleOptions(ruleOptions: IResolvable) {
        cdkBuilder.ruleOptions(ruleOptions.let(IResolvable::unwrap))
      }

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      override fun ruleOptions(ruleOptions: List<Any>) {
        cdkBuilder.ruleOptions(ruleOptions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ruleOptions Additional settings for a stateful rule, provided as keywords and
       * settings. 
       */
      override fun ruleOptions(vararg ruleOptions: Any): Unit = ruleOptions(ruleOptions.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty,
    ) : CdkObject(cdkObject), StatefulRuleProperty {
      /**
       * Defines what Network Firewall should do with the packets in a traffic flow when the flow
       * matches the stateful rule criteria.
       *
       * For all actions, Network Firewall performs the specified action and discontinues stateful
       * inspection of the traffic flow.
       *
       * The actions for a stateful rule are defined as follows:
       *
       * * *PASS* - Permits the packets to go to the intended destination.
       * * *DROP* - Blocks the packets from going to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       * * *REJECT* - Drops traffic that matches the conditions of the stateful rule and sends a TCP
       * reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and
       * a `RST` bit contained in the TCP header flags. `REJECT` is available only for TCP traffic.
       * * *ALERT* - Permits the packets to go to the intended destination and sends an alert log
       * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * You can use this action to test a rule that you intend to use to drop traffic. You can
       * enable the rule with `ALERT` action, verify in the logs that the rule is filtering as you
       * want, then change the action to `DROP` .
       *
       * * *REJECT* - Drops TCP traffic that matches the conditions of the stateful rule, and sends
       * a TCP reset packet back to sender of the packet. A TCP reset packet is a packet with no
       * payload and a `RST` bit contained in the TCP header flags. Also sends an alert log mesage if
       * alert logging is configured in the `Firewall` `LoggingConfiguration` .
       *
       * `REJECT` isn't currently available for use with IMAP and FTP protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The stateful inspection criteria for this rule, used to inspect traffic flows.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-header)
       */
      override fun `header`(): Any = unwrap(this).getHeader()

      /**
       * Additional settings for a stateful rule, provided as keywords and settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html#cfn-networkfirewall-rulegroup-statefulrule-ruleoptions)
       */
      override fun ruleOptions(): Any = unwrap(this).getRuleOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty):
          StatefulRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? StatefulRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleProperty
    }
  }

  /**
   * A single stateless rule.
   *
   * This is used in `RuleGroup.StatelessRulesAndCustomActions` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatelessRuleProperty statelessRuleProperty = StatelessRuleProperty.builder()
   * .priority(123)
   * .ruleDefinition(RuleDefinitionProperty.builder()
   * .actions(List.of("actions"))
   * .matchAttributes(MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html)
   */
  public interface StatelessRuleProperty {
    /**
     * Indicates the order in which to run this rule relative to all of the rules that are defined
     * for a stateless rule group.
     *
     * Network Firewall evaluates the rules in a rule group starting with the lowest priority
     * setting. You must ensure that the priority settings are unique for the rule group.
     *
     * Each stateless rule group uses exactly one `StatelessRulesAndCustomActions` object, and each
     * `StatelessRulesAndCustomActions` contains exactly one `StatelessRules` object. To ensure unique
     * priority settings for your rule groups, set unique priorities for the stateless rules that you
     * define inside any single `StatelessRules` object.
     *
     * You can change the priority settings of your rules at any time. To make it easier to insert
     * rules later, number them so there's a wide range in between, for example use 100, 200, and so
     * on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html#cfn-networkfirewall-rulegroup-statelessrule-priority)
     */
    public fun priority(): Number

    /**
     * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet
     * that matches the criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html#cfn-networkfirewall-rulegroup-statelessrule-ruledefinition)
     */
    public fun ruleDefinition(): Any

    /**
     * A builder for [StatelessRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param priority Indicates the order in which to run this rule relative to all of the rules
       * that are defined for a stateless rule group. 
       * Network Firewall evaluates the rules in a rule group starting with the lowest priority
       * setting. You must ensure that the priority settings are unique for the rule group.
       *
       * Each stateless rule group uses exactly one `StatelessRulesAndCustomActions` object, and
       * each `StatelessRulesAndCustomActions` contains exactly one `StatelessRules` object. To ensure
       * unique priority settings for your rule groups, set unique priorities for the stateless rules
       * that you define inside any single `StatelessRules` object.
       *
       * You can change the priority settings of your rules at any time. To make it easier to insert
       * rules later, number them so there's a wide range in between, for example use 100, 200, and so
       * on.
       */
      public fun priority(priority: Number)

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      public fun ruleDefinition(ruleDefinition: IResolvable)

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      public fun ruleDefinition(ruleDefinition: RuleDefinitionProperty)

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c34ade5d18e8bd5988d3b80759936fc07623d0552b77d061fbdfc8c246238e")
      public fun ruleDefinition(ruleDefinition: RuleDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.builder()

      /**
       * @param priority Indicates the order in which to run this rule relative to all of the rules
       * that are defined for a stateless rule group. 
       * Network Firewall evaluates the rules in a rule group starting with the lowest priority
       * setting. You must ensure that the priority settings are unique for the rule group.
       *
       * Each stateless rule group uses exactly one `StatelessRulesAndCustomActions` object, and
       * each `StatelessRulesAndCustomActions` contains exactly one `StatelessRules` object. To ensure
       * unique priority settings for your rule groups, set unique priorities for the stateless rules
       * that you define inside any single `StatelessRules` object.
       *
       * You can change the priority settings of your rules at any time. To make it easier to insert
       * rules later, number them so there's a wide range in between, for example use 100, 200, and so
       * on.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      override fun ruleDefinition(ruleDefinition: IResolvable) {
        cdkBuilder.ruleDefinition(ruleDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      override fun ruleDefinition(ruleDefinition: RuleDefinitionProperty) {
        cdkBuilder.ruleDefinition(ruleDefinition.let(RuleDefinitionProperty::unwrap))
      }

      /**
       * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the
       * action to take on a packet that matches the criteria. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c34ade5d18e8bd5988d3b80759936fc07623d0552b77d061fbdfc8c246238e")
      override fun ruleDefinition(ruleDefinition: RuleDefinitionProperty.Builder.() -> Unit): Unit =
          ruleDefinition(RuleDefinitionProperty(ruleDefinition))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty,
    ) : CdkObject(cdkObject), StatelessRuleProperty {
      /**
       * Indicates the order in which to run this rule relative to all of the rules that are defined
       * for a stateless rule group.
       *
       * Network Firewall evaluates the rules in a rule group starting with the lowest priority
       * setting. You must ensure that the priority settings are unique for the rule group.
       *
       * Each stateless rule group uses exactly one `StatelessRulesAndCustomActions` object, and
       * each `StatelessRulesAndCustomActions` contains exactly one `StatelessRules` object. To ensure
       * unique priority settings for your rule groups, set unique priorities for the stateless rules
       * that you define inside any single `StatelessRules` object.
       *
       * You can change the priority settings of your rules at any time. To make it easier to insert
       * rules later, number them so there's a wide range in between, for example use 100, 200, and so
       * on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html#cfn-networkfirewall-rulegroup-statelessrule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet
       * that matches the criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html#cfn-networkfirewall-rulegroup-statelessrule-ruledefinition)
       */
      override fun ruleDefinition(): Any = unwrap(this).getRuleDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatelessRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty):
          StatelessRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? StatelessRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRuleProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty
    }
  }

  /**
   * Stateless inspection criteria.
   *
   * Each stateless rule group uses exactly one of these data types to define its stateless rules.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatelessRulesAndCustomActionsProperty statelessRulesAndCustomActionsProperty =
   * StatelessRulesAndCustomActionsProperty.builder()
   * .statelessRules(List.of(StatelessRuleProperty.builder()
   * .priority(123)
   * .ruleDefinition(RuleDefinitionProperty.builder()
   * .actions(List.of("actions"))
   * .matchAttributes(MatchAttributesProperty.builder()
   * .destinationPorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .destinations(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .protocols(List.of(123))
   * .sourcePorts(List.of(PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build()))
   * .sources(List.of(AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build()))
   * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build()))
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .customActions(List.of(CustomActionProperty.builder()
   * .actionDefinition(ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .actionName("actionName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html)
   */
  public interface StatelessRulesAndCustomActionsProperty {
    /**
     * Defines an array of individual custom action definitions that are available for use by the
     * stateless rules in this `StatelessRulesAndCustomActions` specification.
     *
     * You name each custom action that you define, and then you can use it by name in your
     * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html#cfn-networkfirewall-rulegroup-statelessrulesandcustomactions-customactions)
     */
    public fun customActions(): Any? = unwrap(this).getCustomActions()

    /**
     * Defines the set of stateless rules for use in a stateless rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html#cfn-networkfirewall-rulegroup-statelessrulesandcustomactions-statelessrules)
     */
    public fun statelessRules(): Any

    /**
     * A builder for [StatelessRulesAndCustomActionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      public fun customActions(customActions: IResolvable)

      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      public fun customActions(customActions: List<Any>)

      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      public fun customActions(vararg customActions: Any)

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      public fun statelessRules(statelessRules: IResolvable)

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      public fun statelessRules(statelessRules: List<Any>)

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      public fun statelessRules(vararg statelessRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty.builder()

      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      override fun customActions(customActions: IResolvable) {
        cdkBuilder.customActions(customActions.let(IResolvable::unwrap))
      }

      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      override fun customActions(customActions: List<Any>) {
        cdkBuilder.customActions(customActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customActions Defines an array of individual custom action definitions that are
       * available for use by the stateless rules in this `StatelessRulesAndCustomActions`
       * specification.
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       */
      override fun customActions(vararg customActions: Any): Unit =
          customActions(customActions.toList())

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      override fun statelessRules(statelessRules: IResolvable) {
        cdkBuilder.statelessRules(statelessRules.let(IResolvable::unwrap))
      }

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      override fun statelessRules(statelessRules: List<Any>) {
        cdkBuilder.statelessRules(statelessRules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param statelessRules Defines the set of stateless rules for use in a stateless rule group.
       * 
       */
      override fun statelessRules(vararg statelessRules: Any): Unit =
          statelessRules(statelessRules.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty,
    ) : CdkObject(cdkObject), StatelessRulesAndCustomActionsProperty {
      /**
       * Defines an array of individual custom action definitions that are available for use by the
       * stateless rules in this `StatelessRulesAndCustomActions` specification.
       *
       * You name each custom action that you define, and then you can use it by name in your
       * stateless rule `RuleGroup.RuleDefinition` `Actions` specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html#cfn-networkfirewall-rulegroup-statelessrulesandcustomactions-customactions)
       */
      override fun customActions(): Any? = unwrap(this).getCustomActions()

      /**
       * Defines the set of stateless rules for use in a stateless rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html#cfn-networkfirewall-rulegroup-statelessrulesandcustomactions-statelessrules)
       */
      override fun statelessRules(): Any = unwrap(this).getStatelessRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatelessRulesAndCustomActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty):
          StatelessRulesAndCustomActionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StatelessRulesAndCustomActionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRulesAndCustomActionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty
    }
  }

  /**
   * TCP flags and masks to inspect packets for. This is used in the `RuleGroup.MatchAttributes`
   * specification.
   *
   * For example:
   *
   * `"TCPFlags": [ { "Flags": [ "ECE", "SYN" ], "Masks": [ "SYN", "ECE" ] } ]`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * TCPFlagFieldProperty tCPFlagFieldProperty = TCPFlagFieldProperty.builder()
   * .flags(List.of("flags"))
   * // the properties below are optional
   * .masks(List.of("masks"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html)
   */
  public interface TCPFlagFieldProperty {
    /**
     * Used in conjunction with the `Masks` setting to define the flags that must be set and flags
     * that must not be set in order for the packet to match.
     *
     * This setting can only specify values that are also specified in the `Masks` setting.
     *
     * For the flags that are specified in the masks setting, the following must be true for the
     * packet to match:
     *
     * * The ones that are set in this flags setting must be set in the packet.
     * * The ones that are not set in this flags setting must also not be set in the packet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html#cfn-networkfirewall-rulegroup-tcpflagfield-flags)
     */
    public fun flags(): List<String>

    /**
     * The set of flags to consider in the inspection.
     *
     * To inspect all flags in the valid values list, leave this with no setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html#cfn-networkfirewall-rulegroup-tcpflagfield-masks)
     */
    public fun masks(): List<String> = unwrap(this).getMasks() ?: emptyList()

    /**
     * A builder for [TCPFlagFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
       * set and flags that must not be set in order for the packet to match. 
       * This setting can only specify values that are also specified in the `Masks` setting.
       *
       * For the flags that are specified in the masks setting, the following must be true for the
       * packet to match:
       *
       * * The ones that are set in this flags setting must be set in the packet.
       * * The ones that are not set in this flags setting must also not be set in the packet.
       */
      public fun flags(flags: List<String>)

      /**
       * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
       * set and flags that must not be set in order for the packet to match. 
       * This setting can only specify values that are also specified in the `Masks` setting.
       *
       * For the flags that are specified in the masks setting, the following must be true for the
       * packet to match:
       *
       * * The ones that are set in this flags setting must be set in the packet.
       * * The ones that are not set in this flags setting must also not be set in the packet.
       */
      public fun flags(vararg flags: String)

      /**
       * @param masks The set of flags to consider in the inspection.
       * To inspect all flags in the valid values list, leave this with no setting.
       */
      public fun masks(masks: List<String>)

      /**
       * @param masks The set of flags to consider in the inspection.
       * To inspect all flags in the valid values list, leave this with no setting.
       */
      public fun masks(vararg masks: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty.builder()

      /**
       * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
       * set and flags that must not be set in order for the packet to match. 
       * This setting can only specify values that are also specified in the `Masks` setting.
       *
       * For the flags that are specified in the masks setting, the following must be true for the
       * packet to match:
       *
       * * The ones that are set in this flags setting must be set in the packet.
       * * The ones that are not set in this flags setting must also not be set in the packet.
       */
      override fun flags(flags: List<String>) {
        cdkBuilder.flags(flags)
      }

      /**
       * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
       * set and flags that must not be set in order for the packet to match. 
       * This setting can only specify values that are also specified in the `Masks` setting.
       *
       * For the flags that are specified in the masks setting, the following must be true for the
       * packet to match:
       *
       * * The ones that are set in this flags setting must be set in the packet.
       * * The ones that are not set in this flags setting must also not be set in the packet.
       */
      override fun flags(vararg flags: String): Unit = flags(flags.toList())

      /**
       * @param masks The set of flags to consider in the inspection.
       * To inspect all flags in the valid values list, leave this with no setting.
       */
      override fun masks(masks: List<String>) {
        cdkBuilder.masks(masks)
      }

      /**
       * @param masks The set of flags to consider in the inspection.
       * To inspect all flags in the valid values list, leave this with no setting.
       */
      override fun masks(vararg masks: String): Unit = masks(masks.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty,
    ) : CdkObject(cdkObject), TCPFlagFieldProperty {
      /**
       * Used in conjunction with the `Masks` setting to define the flags that must be set and flags
       * that must not be set in order for the packet to match.
       *
       * This setting can only specify values that are also specified in the `Masks` setting.
       *
       * For the flags that are specified in the masks setting, the following must be true for the
       * packet to match:
       *
       * * The ones that are set in this flags setting must be set in the packet.
       * * The ones that are not set in this flags setting must also not be set in the packet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html#cfn-networkfirewall-rulegroup-tcpflagfield-flags)
       */
      override fun flags(): List<String> = unwrap(this).getFlags()

      /**
       * The set of flags to consider in the inspection.
       *
       * To inspect all flags in the valid values list, leave this with no setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html#cfn-networkfirewall-rulegroup-tcpflagfield-masks)
       */
      override fun masks(): List<String> = unwrap(this).getMasks() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TCPFlagFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty):
          TCPFlagFieldProperty = CdkObjectWrappers.wrap(cdkObject) as? TCPFlagFieldProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TCPFlagFieldProperty):
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty
    }
  }
}
