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
 * Use the `FirewallPolicy` to define the stateless and stateful network traffic filtering behavior
 * for your `Firewall` .
 *
 * You can use one firewall policy for multiple firewalls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnFirewallPolicy cfnFirewallPolicy = CfnFirewallPolicy.Builder.create(this,
 * "MyCfnFirewallPolicy")
 * .firewallPolicy(FirewallPolicyProperty.builder()
 * .statelessDefaultActions(List.of("statelessDefaultActions"))
 * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
 * // the properties below are optional
 * .policyVariables(PolicyVariablesProperty.builder()
 * .ruleVariables(Map.of(
 * "ruleVariablesKey", Map.of(
 * "definition", List.of("definition"))))
 * .build())
 * .statefulDefaultActions(List.of("statefulDefaultActions"))
 * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .streamExceptionPolicy("streamExceptionPolicy")
 * .build())
 * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .override(StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build())
 * .priority(123)
 * .build()))
 * .statelessCustomActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
 * .priority(123)
 * .resourceArn("resourceArn")
 * .build()))
 * .tlsInspectionConfigurationArn("tlsInspectionConfigurationArn")
 * .build())
 * .firewallPolicyName("firewallPolicyName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html)
 */
public open class CfnFirewallPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the `FirewallPolicy` .
   */
  public open fun attrFirewallPolicyArn(): String = unwrap(this).getAttrFirewallPolicyArn()

  /**
   * The unique ID of the `FirewallPolicy` resource.
   */
  public open fun attrFirewallPolicyId(): String = unwrap(this).getAttrFirewallPolicyId()

  /**
   * A description of the firewall policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the firewall policy.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   */
  public open fun firewallPolicy(): Any = unwrap(this).getFirewallPolicy()

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   */
  public open fun firewallPolicy(`value`: IResolvable) {
    unwrap(this).setFirewallPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   */
  public open fun firewallPolicy(`value`: FirewallPolicyProperty) {
    unwrap(this).setFirewallPolicy(`value`.let(FirewallPolicyProperty::unwrap))
  }

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66edb5975d0bddaf613db66a61a50392b0c450cd02e6d941688225a25a5bd985")
  public open fun firewallPolicy(`value`: FirewallPolicyProperty.Builder.() -> Unit): Unit =
      firewallPolicy(FirewallPolicyProperty(`value`))

  /**
   * The descriptive name of the firewall policy.
   */
  public open fun firewallPolicyName(): String = unwrap(this).getFirewallPolicyName()

  /**
   * The descriptive name of the firewall policy.
   */
  public open fun firewallPolicyName(`value`: String) {
    unwrap(this).setFirewallPolicyName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkfirewall.CfnFirewallPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-description)
     * @param description A description of the firewall policy. 
     */
    public fun description(description: String)

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    public fun firewallPolicy(firewallPolicy: IResolvable)

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    public fun firewallPolicy(firewallPolicy: FirewallPolicyProperty)

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fee919add41f58ca28ef0fb97d6fecde780687581df81b1424651353d73dd1c")
    public fun firewallPolicy(firewallPolicy: FirewallPolicyProperty.Builder.() -> Unit)

    /**
     * The descriptive name of the firewall policy.
     *
     * You can't change the name of a firewall policy after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicyname)
     * @param firewallPolicyName The descriptive name of the firewall policy. 
     */
    public fun firewallPolicyName(firewallPolicyName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder.create(scope, id)

    /**
     * A description of the firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-description)
     * @param description A description of the firewall policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    override fun firewallPolicy(firewallPolicy: IResolvable) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(IResolvable::unwrap))
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    override fun firewallPolicy(firewallPolicy: FirewallPolicyProperty) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(FirewallPolicyProperty::unwrap))
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fee919add41f58ca28ef0fb97d6fecde780687581df81b1424651353d73dd1c")
    override fun firewallPolicy(firewallPolicy: FirewallPolicyProperty.Builder.() -> Unit): Unit =
        firewallPolicy(FirewallPolicyProperty(firewallPolicy))

    /**
     * The descriptive name of the firewall policy.
     *
     * You can't change the name of a firewall policy after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicyname)
     * @param firewallPolicyName The descriptive name of the firewall policy. 
     */
    override fun firewallPolicyName(firewallPolicyName: String) {
      cdkBuilder.firewallPolicyName(firewallPolicyName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy):
        CfnFirewallPolicy = CfnFirewallPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallPolicy):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy = wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-publishmetricaction.html)
   */
  public interface PublishMetricActionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-publishmetricaction.html#cfn-networkfirewall-firewallpolicy-publishmetricaction-dimensions)
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
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty.builder()

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
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions the value to be set. 
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty,
    ) : CdkObject(cdkObject), PublishMetricActionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-publishmetricaction.html#cfn-networkfirewall-firewallpolicy-publishmetricaction-dimensions)
       */
      override fun dimensions(): Any = unwrap(this).getDimensions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PublishMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty):
          PublishMetricActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishMetricActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty
    }
  }

  /**
   * Configuration settings for the handling of the stateful rule groups in a firewall policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatefulEngineOptionsProperty statefulEngineOptionsProperty =
   * StatefulEngineOptionsProperty.builder()
   * .ruleOrder("ruleOrder")
   * .streamExceptionPolicy("streamExceptionPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html)
   */
  public interface StatefulEngineOptionsProperty {
    /**
     * Indicates how to manage the order of stateful rule evaluation for the policy.
     *
     * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
     * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
     * For more information, see [Evaluation order for stateful
     * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html#cfn-networkfirewall-firewallpolicy-statefulengineoptions-ruleorder)
     */
    public fun ruleOrder(): String? = unwrap(this).getRuleOrder()

    /**
     * Configures how Network Firewall processes traffic when a network connection breaks midstream.
     *
     * Network connections can break due to disruptions in external networks or within the firewall
     * itself.
     *
     * * `DROP` - Network Firewall fails closed and drops all subsequent traffic going to the
     * firewall. This is the default behavior.
     * * `CONTINUE` - Network Firewall continues to apply rules to the subsequent traffic without
     * context from traffic before the break. This impacts the behavior of rules that depend on this
     * context. For example, if you have a stateful rule to `drop http` traffic, Network Firewall won't
     * match the traffic for this rule because the service won't have the context from session
     * initialization defining the application layer protocol as HTTP. However, this behavior is rule
     * dependent—a TCP-layer rule using a `flow:stateless` rule would still match, as would the
     * `aws:drop_strict` default action.
     * * `REJECT` - Network Firewall fails closed and drops all subsequent traffic going to the
     * firewall. Network Firewall also sends a TCP reject packet back to your client so that the client
     * can immediately establish a new session. Network Firewall will have context about the new
     * session and will apply rules to the subsequent traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html#cfn-networkfirewall-firewallpolicy-statefulengineoptions-streamexceptionpolicy)
     */
    public fun streamExceptionPolicy(): String? = unwrap(this).getStreamExceptionPolicy()

    /**
     * A builder for [StatefulEngineOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ruleOrder Indicates how to manage the order of stateful rule evaluation for the
       * policy.
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun ruleOrder(ruleOrder: String)

      /**
       * @param streamExceptionPolicy Configures how Network Firewall processes traffic when a
       * network connection breaks midstream.
       * Network connections can break due to disruptions in external networks or within the
       * firewall itself.
       *
       * * `DROP` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. This is the default behavior.
       * * `CONTINUE` - Network Firewall continues to apply rules to the subsequent traffic without
       * context from traffic before the break. This impacts the behavior of rules that depend on this
       * context. For example, if you have a stateful rule to `drop http` traffic, Network Firewall
       * won't match the traffic for this rule because the service won't have the context from session
       * initialization defining the application layer protocol as HTTP. However, this behavior is rule
       * dependent—a TCP-layer rule using a `flow:stateless` rule would still match, as would the
       * `aws:drop_strict` default action.
       * * `REJECT` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. Network Firewall also sends a TCP reject packet back to your client so that the
       * client can immediately establish a new session. Network Firewall will have context about the
       * new session and will apply rules to the subsequent traffic.
       */
      public fun streamExceptionPolicy(streamExceptionPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty.builder()

      /**
       * @param ruleOrder Indicates how to manage the order of stateful rule evaluation for the
       * policy.
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun ruleOrder(ruleOrder: String) {
        cdkBuilder.ruleOrder(ruleOrder)
      }

      /**
       * @param streamExceptionPolicy Configures how Network Firewall processes traffic when a
       * network connection breaks midstream.
       * Network connections can break due to disruptions in external networks or within the
       * firewall itself.
       *
       * * `DROP` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. This is the default behavior.
       * * `CONTINUE` - Network Firewall continues to apply rules to the subsequent traffic without
       * context from traffic before the break. This impacts the behavior of rules that depend on this
       * context. For example, if you have a stateful rule to `drop http` traffic, Network Firewall
       * won't match the traffic for this rule because the service won't have the context from session
       * initialization defining the application layer protocol as HTTP. However, this behavior is rule
       * dependent—a TCP-layer rule using a `flow:stateless` rule would still match, as would the
       * `aws:drop_strict` default action.
       * * `REJECT` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. Network Firewall also sends a TCP reject packet back to your client so that the
       * client can immediately establish a new session. Network Firewall will have context about the
       * new session and will apply rules to the subsequent traffic.
       */
      override fun streamExceptionPolicy(streamExceptionPolicy: String) {
        cdkBuilder.streamExceptionPolicy(streamExceptionPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty,
    ) : CdkObject(cdkObject), StatefulEngineOptionsProperty {
      /**
       * Indicates how to manage the order of stateful rule evaluation for the policy.
       *
       * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule
       * engine as Suricata compatible strings, and Suricata evaluates them based on certain settings.
       * For more information, see [Evaluation order for stateful
       * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html#cfn-networkfirewall-firewallpolicy-statefulengineoptions-ruleorder)
       */
      override fun ruleOrder(): String? = unwrap(this).getRuleOrder()

      /**
       * Configures how Network Firewall processes traffic when a network connection breaks
       * midstream.
       *
       * Network connections can break due to disruptions in external networks or within the
       * firewall itself.
       *
       * * `DROP` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. This is the default behavior.
       * * `CONTINUE` - Network Firewall continues to apply rules to the subsequent traffic without
       * context from traffic before the break. This impacts the behavior of rules that depend on this
       * context. For example, if you have a stateful rule to `drop http` traffic, Network Firewall
       * won't match the traffic for this rule because the service won't have the context from session
       * initialization defining the application layer protocol as HTTP. However, this behavior is rule
       * dependent—a TCP-layer rule using a `flow:stateless` rule would still match, as would the
       * `aws:drop_strict` default action.
       * * `REJECT` - Network Firewall fails closed and drops all subsequent traffic going to the
       * firewall. Network Firewall also sends a TCP reject packet back to your client so that the
       * client can immediately establish a new session. Network Firewall will have context about the
       * new session and will apply rules to the subsequent traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html#cfn-networkfirewall-firewallpolicy-statefulengineoptions-streamexceptionpolicy)
       */
      override fun streamExceptionPolicy(): String? = unwrap(this).getStreamExceptionPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulEngineOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty):
          StatefulEngineOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulEngineOptionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-actiondefinition.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-actiondefinition.html#cfn-networkfirewall-firewallpolicy-actiondefinition-publishmetricaction)
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
      @JvmName("e772170dc06f618e19273f007b7bc90f71cf467c4d9bcee90ac01ff1a1ea81ba")
      public
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty.builder()

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
      @JvmName("e772170dc06f618e19273f007b7bc90f71cf467c4d9bcee90ac01ff1a1ea81ba")
      override
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit):
          Unit = publishMetricAction(PublishMetricActionProperty(publishMetricAction))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-actiondefinition.html#cfn-networkfirewall-firewallpolicy-actiondefinition-publishmetricaction)
       */
      override fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty):
          ActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty
    }
  }

  /**
   * Identifier for a single stateless rule group, used in a firewall policy to refer to the rule
   * group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatelessRuleGroupReferenceProperty statelessRuleGroupReferenceProperty =
   * StatelessRuleGroupReferenceProperty.builder()
   * .priority(123)
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html)
   */
  public interface StatelessRuleGroupReferenceProperty {
    /**
     * An integer setting that indicates the order in which to run the stateless rule groups in a
     * single `FirewallPolicy` .
     *
     * Network Firewall applies each stateless rule group to a packet starting with the group that
     * has the lowest priority setting. You must ensure that the priority settings are unique within
     * each policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statelessrulegroupreference-priority)
     */
    public fun priority(): Number

    /**
     * The Amazon Resource Name (ARN) of the stateless rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statelessrulegroupreference-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [StatelessRuleGroupReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param priority An integer setting that indicates the order in which to run the stateless
       * rule groups in a single `FirewallPolicy` . 
       * Network Firewall applies each stateless rule group to a packet starting with the group that
       * has the lowest priority setting. You must ensure that the priority settings are unique within
       * each policy.
       */
      public fun priority(priority: Number)

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the stateless rule group. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder()

      /**
       * @param priority An integer setting that indicates the order in which to run the stateless
       * rule groups in a single `FirewallPolicy` . 
       * Network Firewall applies each stateless rule group to a packet starting with the group that
       * has the lowest priority setting. You must ensure that the priority settings are unique within
       * each policy.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the stateless rule group. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty,
    ) : CdkObject(cdkObject), StatelessRuleGroupReferenceProperty {
      /**
       * An integer setting that indicates the order in which to run the stateless rule groups in a
       * single `FirewallPolicy` .
       *
       * Network Firewall applies each stateless rule group to a packet starting with the group that
       * has the lowest priority setting. You must ensure that the priority settings are unique within
       * each policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statelessrulegroupreference-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * The Amazon Resource Name (ARN) of the stateless rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statelessrulegroupreference-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatelessRuleGroupReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty):
          StatelessRuleGroupReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRuleGroupReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty
    }
  }

  /**
   * Identifier for a single stateful rule group, used in a firewall policy to refer to a rule
   * group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatefulRuleGroupReferenceProperty statefulRuleGroupReferenceProperty =
   * StatefulRuleGroupReferenceProperty.builder()
   * .resourceArn("resourceArn")
   * // the properties below are optional
   * .override(StatefulRuleGroupOverrideProperty.builder()
   * .action("action")
   * .build())
   * .priority(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html)
   */
  public interface StatefulRuleGroupReferenceProperty {
    /**
     * The action that allows the policy owner to override the behavior of the rule group within a
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-override)
     */
    public fun `override`(): Any? = unwrap(this).getOverride()

    /**
     * An integer setting that indicates the order in which to run the stateful rule groups in a
     * single `FirewallPolicy` .
     *
     * This setting only applies to firewall policies that specify the `STRICT_ORDER` rule order in
     * the stateful engine options settings.
     *
     * Network Firewall evalutes each stateful rule group against a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique
     * within each policy.
     *
     * You can change the priority settings of your rule groups at any time. To make it easier to
     * insert rule groups later, number them so there's a wide range in between, for example use 100,
     * 200, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The Amazon Resource Name (ARN) of the stateful rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [StatefulRuleGroupReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      public fun `override`(`override`: IResolvable)

      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      public fun `override`(`override`: StatefulRuleGroupOverrideProperty)

      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("063e3edbf8a3a4bb75a758da399ab9da795146a21d0554e262127c3bacfb8fff")
      public fun `override`(`override`: StatefulRuleGroupOverrideProperty.Builder.() -> Unit)

      /**
       * @param priority An integer setting that indicates the order in which to run the stateful
       * rule groups in a single `FirewallPolicy` .
       * This setting only applies to firewall policies that specify the `STRICT_ORDER` rule order
       * in the stateful engine options settings.
       *
       * Network Firewall evalutes each stateful rule group against a packet starting with the group
       * that has the lowest priority setting. You must ensure that the priority settings are unique
       * within each policy.
       *
       * You can change the priority settings of your rule groups at any time. To make it easier to
       * insert rule groups later, number them so there's a wide range in between, for example use 100,
       * 200, and so on.
       */
      public fun priority(priority: Number)

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the stateful rule group. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder()

      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      override fun `override`(`override`: StatefulRuleGroupOverrideProperty) {
        cdkBuilder.`override`(`override`.let(StatefulRuleGroupOverrideProperty::unwrap))
      }

      /**
       * @param override The action that allows the policy owner to override the behavior of the
       * rule group within a policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("063e3edbf8a3a4bb75a758da399ab9da795146a21d0554e262127c3bacfb8fff")
      override fun `override`(`override`: StatefulRuleGroupOverrideProperty.Builder.() -> Unit):
          Unit = `override`(StatefulRuleGroupOverrideProperty(`override`))

      /**
       * @param priority An integer setting that indicates the order in which to run the stateful
       * rule groups in a single `FirewallPolicy` .
       * This setting only applies to firewall policies that specify the `STRICT_ORDER` rule order
       * in the stateful engine options settings.
       *
       * Network Firewall evalutes each stateful rule group against a packet starting with the group
       * that has the lowest priority setting. You must ensure that the priority settings are unique
       * within each policy.
       *
       * You can change the priority settings of your rule groups at any time. To make it easier to
       * insert rule groups later, number them so there's a wide range in between, for example use 100,
       * 200, and so on.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the stateful rule group. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty,
    ) : CdkObject(cdkObject), StatefulRuleGroupReferenceProperty {
      /**
       * The action that allows the policy owner to override the behavior of the rule group within a
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-override)
       */
      override fun `override`(): Any? = unwrap(this).getOverride()

      /**
       * An integer setting that indicates the order in which to run the stateful rule groups in a
       * single `FirewallPolicy` .
       *
       * This setting only applies to firewall policies that specify the `STRICT_ORDER` rule order
       * in the stateful engine options settings.
       *
       * Network Firewall evalutes each stateful rule group against a packet starting with the group
       * that has the lowest priority setting. You must ensure that the priority settings are unique
       * within each policy.
       *
       * You can change the priority settings of your rule groups at any time. To make it easier to
       * insert rule groups later, number them so there's a wide range in between, for example use 100,
       * 200, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * The Amazon Resource Name (ARN) of the stateful rule group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupreference-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatefulRuleGroupReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty):
          StatefulRuleGroupReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleGroupReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-dimension.html)
   */
  public interface DimensionProperty {
    /**
     * The value to use in the custom metric dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-dimension.html#cfn-networkfirewall-firewallpolicy-dimension-value)
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
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty.builder()

      /**
       * @param value The value to use in the custom metric dimension. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty,
    ) : CdkObject(cdkObject), DimensionProperty {
      /**
       * The value to use in the custom metric dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-dimension.html#cfn-networkfirewall-firewallpolicy-dimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty
    }
  }

  /**
   * Contains variables that you can use to override default Suricata settings in your firewall
   * policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * PolicyVariablesProperty policyVariablesProperty = PolicyVariablesProperty.builder()
   * .ruleVariables(Map.of(
   * "ruleVariablesKey", Map.of(
   * "definition", List.of("definition"))))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-policyvariables.html)
   */
  public interface PolicyVariablesProperty {
    /**
     * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata `HOME_NET` variable.
     *
     * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
     * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
     * Network Firewall by default uses the CIDR of your inspection VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-policyvariables.html#cfn-networkfirewall-firewallpolicy-policyvariables-rulevariables)
     */
    public fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

    /**
     * A builder for [PolicyVariablesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
       * `HOME_NET` variable.
       * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
       * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
       * Network Firewall by default uses the CIDR of your inspection VPC.
       */
      public fun ruleVariables(ruleVariables: IResolvable)

      /**
       * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
       * `HOME_NET` variable.
       * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
       * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
       * Network Firewall by default uses the CIDR of your inspection VPC.
       */
      public fun ruleVariables(ruleVariables: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty.builder()

      /**
       * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
       * `HOME_NET` variable.
       * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
       * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
       * Network Firewall by default uses the CIDR of your inspection VPC.
       */
      override fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables.let(IResolvable::unwrap))
      }

      /**
       * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
       * `HOME_NET` variable.
       * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
       * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
       * Network Firewall by default uses the CIDR of your inspection VPC.
       */
      override fun ruleVariables(ruleVariables: Map<String, Any>) {
        cdkBuilder.ruleVariables(ruleVariables)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty,
    ) : CdkObject(cdkObject), PolicyVariablesProperty {
      /**
       * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata `HOME_NET` variable.
       *
       * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
       * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
       * Network Firewall by default uses the CIDR of your inspection VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-policyvariables.html#cfn-networkfirewall-firewallpolicy-policyvariables-rulevariables)
       */
      override fun ruleVariables(): Any? = unwrap(this).getRuleVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyVariablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty):
          PolicyVariablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyVariablesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html)
   */
  public interface CustomActionProperty {
    /**
     * The custom action associated with the action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html#cfn-networkfirewall-firewallpolicy-customaction-actiondefinition)
     */
    public fun actionDefinition(): Any

    /**
     * The descriptive name of the custom action.
     *
     * You can't change the name of a custom action after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html#cfn-networkfirewall-firewallpolicy-customaction-actionname)
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
      @JvmName("dd0a8d1a1cd7ed7b03b5bbc399ff186bb6dc0dce1de8ba5f266af5eb1769d035")
      public fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit)

      /**
       * @param actionName The descriptive name of the custom action. 
       * You can't change the name of a custom action after you create it.
       */
      public fun actionName(actionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty.builder()

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
      @JvmName("dd0a8d1a1cd7ed7b03b5bbc399ff186bb6dc0dce1de8ba5f266af5eb1769d035")
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
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty,
    ) : CdkObject(cdkObject), CustomActionProperty {
      /**
       * The custom action associated with the action name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html#cfn-networkfirewall-firewallpolicy-customaction-actiondefinition)
       */
      override fun actionDefinition(): Any = unwrap(this).getActionDefinition()

      /**
       * The descriptive name of the custom action.
       *
       * You can't change the name of a custom action after you create it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html#cfn-networkfirewall-firewallpolicy-customaction-actionname)
       */
      override fun actionName(): String = unwrap(this).getActionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty):
          CustomActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty
    }
  }

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * FirewallPolicyProperty firewallPolicyProperty = FirewallPolicyProperty.builder()
   * .statelessDefaultActions(List.of("statelessDefaultActions"))
   * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
   * // the properties below are optional
   * .policyVariables(PolicyVariablesProperty.builder()
   * .ruleVariables(Map.of(
   * "ruleVariablesKey", Map.of(
   * "definition", List.of("definition"))))
   * .build())
   * .statefulDefaultActions(List.of("statefulDefaultActions"))
   * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
   * .ruleOrder("ruleOrder")
   * .streamExceptionPolicy("streamExceptionPolicy")
   * .build())
   * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
   * .resourceArn("resourceArn")
   * // the properties below are optional
   * .override(StatefulRuleGroupOverrideProperty.builder()
   * .action("action")
   * .build())
   * .priority(123)
   * .build()))
   * .statelessCustomActions(List.of(CustomActionProperty.builder()
   * .actionDefinition(ActionDefinitionProperty.builder()
   * .publishMetricAction(PublishMetricActionProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .value("value")
   * .build()))
   * .build())
   * .build())
   * .actionName("actionName")
   * .build()))
   * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
   * .priority(123)
   * .resourceArn("resourceArn")
   * .build()))
   * .tlsInspectionConfigurationArn("tlsInspectionConfigurationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html)
   */
  public interface FirewallPolicyProperty {
    /**
     * Contains variables that you can use to override default Suricata settings in your firewall
     * policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-policyvariables)
     */
    public fun policyVariables(): Any? = unwrap(this).getPolicyVariables()

    /**
     * The default actions to take on a packet that doesn't match any stateful rules.
     *
     * The stateful default action is optional, and is only valid when using the strict rule order.
     *
     * Valid values of the stateful default action:
     *
     * * aws:drop_strict
     * * aws:drop_established
     * * aws:alert_strict
     * * aws:alert_established
     *
     * For more information, see [Strict evaluation
     * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefuldefaultactions)
     */
    public fun statefulDefaultActions(): List<String> = unwrap(this).getStatefulDefaultActions() ?:
        emptyList()

    /**
     * Additional options governing how Network Firewall handles stateful rules.
     *
     * The stateful rule groups that you use in your policy must have stateful rule options settings
     * that are compatible with these settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefulengineoptions)
     */
    public fun statefulEngineOptions(): Any? = unwrap(this).getStatefulEngineOptions()

    /**
     * References to the stateful rule groups that are used in the policy.
     *
     * These define the inspection criteria in stateful rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefulrulegroupreferences)
     */
    public fun statefulRuleGroupReferences(): Any? = unwrap(this).getStatefulRuleGroupReferences()

    /**
     * The custom action definitions that are available for use in the firewall policy's
     * `StatelessDefaultActions` setting.
     *
     * You name each custom action that you define, and then you can use it by name in your default
     * actions specifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelesscustomactions)
     */
    public fun statelessCustomActions(): Any? = unwrap(this).getStatelessCustomActions()

    /**
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy.
     *
     * If you want non-matching packets to be forwarded for stateful inspection, specify
     * `aws:forward_to_sfe` .
     *
     * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
     * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     *
     * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
     * “customActionName”]` . For information about compatibility, see the custom action descriptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessdefaultactions)
     */
    public fun statelessDefaultActions(): List<String>

    /**
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in
     * the policy.
     *
     * If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * `aws:forward_to_sfe` .
     *
     * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
     * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     *
     * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
     * “customActionName”]` . For information about compatibility, see the custom action descriptions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessfragmentdefaultactions)
     */
    public fun statelessFragmentDefaultActions(): List<String>

    /**
     * References to the stateless rule groups that are used in the policy.
     *
     * These define the matching criteria in stateless rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessrulegroupreferences)
     */
    public fun statelessRuleGroupReferences(): Any? = unwrap(this).getStatelessRuleGroupReferences()

    /**
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-tlsinspectionconfigurationarn)
     */
    public fun tlsInspectionConfigurationArn(): String? =
        unwrap(this).getTlsInspectionConfigurationArn()

    /**
     * A builder for [FirewallPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      public fun policyVariables(policyVariables: IResolvable)

      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      public fun policyVariables(policyVariables: PolicyVariablesProperty)

      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c1e79b0909d69ac9f8ec9ad77f008dfbf4f5d3aeef304c8d026900b1495d164")
      public fun policyVariables(policyVariables: PolicyVariablesProperty.Builder.() -> Unit)

      /**
       * @param statefulDefaultActions The default actions to take on a packet that doesn't match
       * any stateful rules.
       * The stateful default action is optional, and is only valid when using the strict rule
       * order.
       *
       * Valid values of the stateful default action:
       *
       * * aws:drop_strict
       * * aws:drop_established
       * * aws:alert_strict
       * * aws:alert_established
       *
       * For more information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun statefulDefaultActions(statefulDefaultActions: List<String>)

      /**
       * @param statefulDefaultActions The default actions to take on a packet that doesn't match
       * any stateful rules.
       * The stateful default action is optional, and is only valid when using the strict rule
       * order.
       *
       * Valid values of the stateful default action:
       *
       * * aws:drop_strict
       * * aws:drop_established
       * * aws:alert_strict
       * * aws:alert_established
       *
       * For more information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      public fun statefulDefaultActions(vararg statefulDefaultActions: String)

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      public fun statefulEngineOptions(statefulEngineOptions: IResolvable)

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      public fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty)

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580a3f4be7cfc54fabddc9cd8e0c9ff85d8c1dc2130ff4016fa3b8750d9ca735")
      public
          fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty.Builder.() -> Unit)

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      public fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable)

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      public fun statefulRuleGroupReferences(statefulRuleGroupReferences: List<Any>)

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      public fun statefulRuleGroupReferences(vararg statefulRuleGroupReferences: Any)

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      public fun statelessCustomActions(statelessCustomActions: IResolvable)

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      public fun statelessCustomActions(statelessCustomActions: List<Any>)

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      public fun statelessCustomActions(vararg statelessCustomActions: Any)

      /**
       * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of
       * the stateless rules in the policy. 
       * If you want non-matching packets to be forwarded for stateful inspection, specify
       * `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      public fun statelessDefaultActions(statelessDefaultActions: List<String>)

      /**
       * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of
       * the stateless rules in the policy. 
       * If you want non-matching packets to be forwarded for stateful inspection, specify
       * `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      public fun statelessDefaultActions(vararg statelessDefaultActions: String)

      /**
       * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it
       * doesn't match any of the stateless rules in the policy. 
       * If you want non-matching fragmented packets to be forwarded for stateful inspection,
       * specify `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      public fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: List<String>)

      /**
       * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it
       * doesn't match any of the stateless rules in the policy. 
       * If you want non-matching fragmented packets to be forwarded for stateful inspection,
       * specify `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      public fun statelessFragmentDefaultActions(vararg statelessFragmentDefaultActions: String)

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      public fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable)

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      public fun statelessRuleGroupReferences(statelessRuleGroupReferences: List<Any>)

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      public fun statelessRuleGroupReferences(vararg statelessRuleGroupReferences: Any)

      /**
       * @param tlsInspectionConfigurationArn The Amazon Resource Name (ARN) of the TLS inspection
       * configuration.
       */
      public fun tlsInspectionConfigurationArn(tlsInspectionConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.builder()

      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      override fun policyVariables(policyVariables: IResolvable) {
        cdkBuilder.policyVariables(policyVariables.let(IResolvable::unwrap))
      }

      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      override fun policyVariables(policyVariables: PolicyVariablesProperty) {
        cdkBuilder.policyVariables(policyVariables.let(PolicyVariablesProperty::unwrap))
      }

      /**
       * @param policyVariables Contains variables that you can use to override default Suricata
       * settings in your firewall policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c1e79b0909d69ac9f8ec9ad77f008dfbf4f5d3aeef304c8d026900b1495d164")
      override fun policyVariables(policyVariables: PolicyVariablesProperty.Builder.() -> Unit):
          Unit = policyVariables(PolicyVariablesProperty(policyVariables))

      /**
       * @param statefulDefaultActions The default actions to take on a packet that doesn't match
       * any stateful rules.
       * The stateful default action is optional, and is only valid when using the strict rule
       * order.
       *
       * Valid values of the stateful default action:
       *
       * * aws:drop_strict
       * * aws:drop_established
       * * aws:alert_strict
       * * aws:alert_established
       *
       * For more information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun statefulDefaultActions(statefulDefaultActions: List<String>) {
        cdkBuilder.statefulDefaultActions(statefulDefaultActions)
      }

      /**
       * @param statefulDefaultActions The default actions to take on a packet that doesn't match
       * any stateful rules.
       * The stateful default action is optional, and is only valid when using the strict rule
       * order.
       *
       * Valid values of the stateful default action:
       *
       * * aws:drop_strict
       * * aws:drop_established
       * * aws:alert_strict
       * * aws:alert_established
       *
       * For more information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       */
      override fun statefulDefaultActions(vararg statefulDefaultActions: String): Unit =
          statefulDefaultActions(statefulDefaultActions.toList())

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      override fun statefulEngineOptions(statefulEngineOptions: IResolvable) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions.let(IResolvable::unwrap))
      }

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      override fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions.let(StatefulEngineOptionsProperty::unwrap))
      }

      /**
       * @param statefulEngineOptions Additional options governing how Network Firewall handles
       * stateful rules.
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580a3f4be7cfc54fabddc9cd8e0c9ff85d8c1dc2130ff4016fa3b8750d9ca735")
      override
          fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty.Builder.() -> Unit):
          Unit = statefulEngineOptions(StatefulEngineOptionsProperty(statefulEngineOptions))

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      override fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable) {
        cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences.let(IResolvable::unwrap))
      }

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      override fun statefulRuleGroupReferences(statefulRuleGroupReferences: List<Any>) {
        cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences)
      }

      /**
       * @param statefulRuleGroupReferences References to the stateful rule groups that are used in
       * the policy.
       * These define the inspection criteria in stateful rules.
       */
      override fun statefulRuleGroupReferences(vararg statefulRuleGroupReferences: Any): Unit =
          statefulRuleGroupReferences(statefulRuleGroupReferences.toList())

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      override fun statelessCustomActions(statelessCustomActions: IResolvable) {
        cdkBuilder.statelessCustomActions(statelessCustomActions.let(IResolvable::unwrap))
      }

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      override fun statelessCustomActions(statelessCustomActions: List<Any>) {
        cdkBuilder.statelessCustomActions(statelessCustomActions)
      }

      /**
       * @param statelessCustomActions The custom action definitions that are available for use in
       * the firewall policy's `StatelessDefaultActions` setting.
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       */
      override fun statelessCustomActions(vararg statelessCustomActions: Any): Unit =
          statelessCustomActions(statelessCustomActions.toList())

      /**
       * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of
       * the stateless rules in the policy. 
       * If you want non-matching packets to be forwarded for stateful inspection, specify
       * `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      override fun statelessDefaultActions(statelessDefaultActions: List<String>) {
        cdkBuilder.statelessDefaultActions(statelessDefaultActions)
      }

      /**
       * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of
       * the stateless rules in the policy. 
       * If you want non-matching packets to be forwarded for stateful inspection, specify
       * `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      override fun statelessDefaultActions(vararg statelessDefaultActions: String): Unit =
          statelessDefaultActions(statelessDefaultActions.toList())

      /**
       * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it
       * doesn't match any of the stateless rules in the policy. 
       * If you want non-matching fragmented packets to be forwarded for stateful inspection,
       * specify `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      override fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: List<String>) {
        cdkBuilder.statelessFragmentDefaultActions(statelessFragmentDefaultActions)
      }

      /**
       * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it
       * doesn't match any of the stateless rules in the policy. 
       * If you want non-matching fragmented packets to be forwarded for stateful inspection,
       * specify `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       */
      override fun statelessFragmentDefaultActions(vararg statelessFragmentDefaultActions: String):
          Unit = statelessFragmentDefaultActions(statelessFragmentDefaultActions.toList())

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      override fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable) {
        cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences.let(IResolvable::unwrap))
      }

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      override fun statelessRuleGroupReferences(statelessRuleGroupReferences: List<Any>) {
        cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences)
      }

      /**
       * @param statelessRuleGroupReferences References to the stateless rule groups that are used
       * in the policy.
       * These define the matching criteria in stateless rules.
       */
      override fun statelessRuleGroupReferences(vararg statelessRuleGroupReferences: Any): Unit =
          statelessRuleGroupReferences(statelessRuleGroupReferences.toList())

      /**
       * @param tlsInspectionConfigurationArn The Amazon Resource Name (ARN) of the TLS inspection
       * configuration.
       */
      override fun tlsInspectionConfigurationArn(tlsInspectionConfigurationArn: String) {
        cdkBuilder.tlsInspectionConfigurationArn(tlsInspectionConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty,
    ) : CdkObject(cdkObject), FirewallPolicyProperty {
      /**
       * Contains variables that you can use to override default Suricata settings in your firewall
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-policyvariables)
       */
      override fun policyVariables(): Any? = unwrap(this).getPolicyVariables()

      /**
       * The default actions to take on a packet that doesn't match any stateful rules.
       *
       * The stateful default action is optional, and is only valid when using the strict rule
       * order.
       *
       * Valid values of the stateful default action:
       *
       * * aws:drop_strict
       * * aws:drop_established
       * * aws:alert_strict
       * * aws:alert_established
       *
       * For more information, see [Strict evaluation
       * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefuldefaultactions)
       */
      override fun statefulDefaultActions(): List<String> = unwrap(this).getStatefulDefaultActions()
          ?: emptyList()

      /**
       * Additional options governing how Network Firewall handles stateful rules.
       *
       * The stateful rule groups that you use in your policy must have stateful rule options
       * settings that are compatible with these settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefulengineoptions)
       */
      override fun statefulEngineOptions(): Any? = unwrap(this).getStatefulEngineOptions()

      /**
       * References to the stateful rule groups that are used in the policy.
       *
       * These define the inspection criteria in stateful rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statefulrulegroupreferences)
       */
      override fun statefulRuleGroupReferences(): Any? =
          unwrap(this).getStatefulRuleGroupReferences()

      /**
       * The custom action definitions that are available for use in the firewall policy's
       * `StatelessDefaultActions` setting.
       *
       * You name each custom action that you define, and then you can use it by name in your
       * default actions specifications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelesscustomactions)
       */
      override fun statelessCustomActions(): Any? = unwrap(this).getStatelessCustomActions()

      /**
       * The actions to take on a packet if it doesn't match any of the stateless rules in the
       * policy.
       *
       * If you want non-matching packets to be forwarded for stateful inspection, specify
       * `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessdefaultactions)
       */
      override fun statelessDefaultActions(): List<String> =
          unwrap(this).getStatelessDefaultActions()

      /**
       * The actions to take on a fragmented packet if it doesn't match any of the stateless rules
       * in the policy.
       *
       * If you want non-matching fragmented packets to be forwarded for stateful inspection,
       * specify `aws:forward_to_sfe` .
       *
       * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or
       * `aws:forward_to_sfe` . In addition, you can specify custom actions that are compatible with
       * your standard section choice.
       *
       * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
       * “customActionName”]` . For information about compatibility, see the custom action
       * descriptions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessfragmentdefaultactions)
       */
      override fun statelessFragmentDefaultActions(): List<String> =
          unwrap(this).getStatelessFragmentDefaultActions()

      /**
       * References to the stateless rule groups that are used in the policy.
       *
       * These define the matching criteria in stateless rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-statelessrulegroupreferences)
       */
      override fun statelessRuleGroupReferences(): Any? =
          unwrap(this).getStatelessRuleGroupReferences()

      /**
       * The Amazon Resource Name (ARN) of the TLS inspection configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy-tlsinspectionconfigurationarn)
       */
      override fun tlsInspectionConfigurationArn(): String? =
          unwrap(this).getTlsInspectionConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty):
          FirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirewallPolicyProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty
    }
  }

  /**
   * The setting that allows the policy owner to change the behavior of the rule group within a
   * policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * StatefulRuleGroupOverrideProperty statefulRuleGroupOverrideProperty =
   * StatefulRuleGroupOverrideProperty.builder()
   * .action("action")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupoverride.html)
   */
  public interface StatefulRuleGroupOverrideProperty {
    /**
     * The action that changes the rule group from `DROP` to `ALERT` .
     *
     * This only applies to managed rule groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupoverride.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupoverride-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * A builder for [StatefulRuleGroupOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that changes the rule group from `DROP` to `ALERT` .
       * This only applies to managed rule groups.
       */
      public fun action(action: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder()

      /**
       * @param action The action that changes the rule group from `DROP` to `ALERT` .
       * This only applies to managed rule groups.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty,
    ) : CdkObject(cdkObject), StatefulRuleGroupOverrideProperty {
      /**
       * The action that changes the rule group from `DROP` to `ALERT` .
       *
       * This only applies to managed rule groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupoverride.html#cfn-networkfirewall-firewallpolicy-statefulrulegroupoverride-action)
       */
      override fun action(): String? = unwrap(this).getAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatefulRuleGroupOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty):
          StatefulRuleGroupOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleGroupOverrideProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty
    }
  }

  /**
   * A list of IP addresses and address ranges, in CIDR notation.
   *
   * This is part of a `RuleVariables` .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-ipset.html)
   */
  public interface IPSetProperty {
    /**
     * The list of IP addresses and address ranges, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-ipset.html#cfn-networkfirewall-firewallpolicy-ipset-definition)
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
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty,
    ) : CdkObject(cdkObject), IPSetProperty {
      /**
       * The list of IP addresses and address ranges, in CIDR notation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-ipset.html#cfn-networkfirewall-firewallpolicy-ipset-definition)
       */
      override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty):
          IPSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty
    }
  }
}
