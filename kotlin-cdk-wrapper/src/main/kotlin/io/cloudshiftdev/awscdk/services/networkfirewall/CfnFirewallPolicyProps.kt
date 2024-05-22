@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFirewallPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnFirewallPolicyProps cfnFirewallPolicyProps = CfnFirewallPolicyProps.builder()
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
public interface CfnFirewallPolicyProps {
  /**
   * A description of the firewall policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
   * stateful rule groups and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
   */
  public fun firewallPolicy(): Any

  /**
   * The descriptive name of the firewall policy.
   *
   * You can't change the name of a firewall policy after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicyname)
   */
  public fun firewallPolicyName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFirewallPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the firewall policy.
     */
    public fun description(description: String)

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    public fun firewallPolicy(firewallPolicy: IResolvable)

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty)

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f6a994ff4df48a44dadb2bebc99c8b73450dbe1460b659c17a481fdb0e275b")
    public
        fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty.Builder.() -> Unit)

    /**
     * @param firewallPolicyName The descriptive name of the firewall policy. 
     * You can't change the name of a firewall policy after you create it.
     */
    public fun firewallPolicyName(firewallPolicyName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps.builder()

    /**
     * @param description A description of the firewall policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    override fun firewallPolicy(firewallPolicy: IResolvable) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    override fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(CfnFirewallPolicy.FirewallPolicyProperty.Companion::unwrap))
    }

    /**
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     * collection of stateless and stateful rule groups and other settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f6a994ff4df48a44dadb2bebc99c8b73450dbe1460b659c17a481fdb0e275b")
    override
        fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty.Builder.() -> Unit):
        Unit = firewallPolicy(CfnFirewallPolicy.FirewallPolicyProperty(firewallPolicy))

    /**
     * @param firewallPolicyName The descriptive name of the firewall policy. 
     * You can't change the name of a firewall policy after you create it.
     */
    override fun firewallPolicyName(firewallPolicyName: String) {
      cdkBuilder.firewallPolicyName(firewallPolicyName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps,
  ) : CdkObject(cdkObject), CfnFirewallPolicyProps {
    /**
     * A description of the firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     */
    override fun firewallPolicy(): Any = unwrap(this).getFirewallPolicy()

    /**
     * The descriptive name of the firewall policy.
     *
     * You can't change the name of a firewall policy after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicyname)
     */
    override fun firewallPolicyName(): String = unwrap(this).getFirewallPolicyName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps):
        CfnFirewallPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFirewallPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallPolicyProps):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
  }
}
