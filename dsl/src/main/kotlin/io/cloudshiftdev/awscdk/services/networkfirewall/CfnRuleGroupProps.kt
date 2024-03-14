package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRuleGroupProps {
  /**
   * The maximum operating resources that this rule group can use.
   *
   * You can't change a rule group's capacity setting after you create the rule group. When you
   * update a rule group, you are limited to this capacity. When you reference a rule group from a
   * firewall policy, Network Firewall reserves this capacity for the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
   */
  public fun capacity(): Number

  /**
   * A description of the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An object that defines the rule group rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
   */
  public fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

  /**
   * The descriptive name of the rule group.
   *
   * You can't change the name of a rule group after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
   */
  public fun ruleGroupName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Indicates whether the rule group is stateless or stateful.
   *
   * If the rule group is stateless, it contains
   * stateless rules. If it is stateful, it contains stateful rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnRuleGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacity The maximum operating resources that this rule group can use. 
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     */
    public fun capacity(capacity: Number)

    /**
     * @param description A description of the rule group.
     */
    public fun description(description: String)

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    public fun ruleGroup(ruleGroup: IResolvable)

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty)

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c01b9e353913eb43595796867c8a1afe9cc044bfb514b27796a926356a2c393")
    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit)

    /**
     * @param ruleGroupName The descriptive name of the rule group. 
     * You can't change the name of a rule group after you create it.
     */
    public fun ruleGroupName(ruleGroupName: String)

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

    /**
     * @param type Indicates whether the rule group is stateless or stateful. 
     * If the rule group is stateless, it contains
     * stateless rules. If it is stateful, it contains stateful rules.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps.builder()

    /**
     * @param capacity The maximum operating resources that this rule group can use. 
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     */
    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    /**
     * @param description A description of the rule group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    override fun ruleGroup(ruleGroup: IResolvable) {
      cdkBuilder.ruleGroup(ruleGroup.let(IResolvable::unwrap))
    }

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    override fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
      cdkBuilder.ruleGroup(ruleGroup.let(CfnRuleGroup.RuleGroupProperty::unwrap))
    }

    /**
     * @param ruleGroup An object that defines the rule group rules.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c01b9e353913eb43595796867c8a1afe9cc044bfb514b27796a926356a2c393")
    override fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit): Unit =
        ruleGroup(CfnRuleGroup.RuleGroupProperty(ruleGroup))

    /**
     * @param ruleGroupName The descriptive name of the rule group. 
     * You can't change the name of a rule group after you create it.
     */
    override fun ruleGroupName(ruleGroupName: String) {
      cdkBuilder.ruleGroupName(ruleGroupName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type Indicates whether the rule group is stateless or stateful. 
     * If the rule group is stateless, it contains
     * stateless rules. If it is stateful, it contains stateful rules.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps,
  ) : CdkObject(cdkObject), CfnRuleGroupProps {
    /**
     * The maximum operating resources that this rule group can use.
     *
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
     */
    override fun capacity(): Number = unwrap(this).getCapacity()

    /**
     * A description of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     */
    override fun ruleGroup(): Any? = unwrap(this).getRuleGroup()

    /**
     * The descriptive name of the rule group.
     *
     * You can't change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
     */
    override fun ruleGroupName(): String = unwrap(this).getRuleGroupName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Indicates whether the rule group is stateless or stateful.
     *
     * If the rule group is stateless, it contains
     * stateless rules. If it is stateful, it contains stateful rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps):
        CfnRuleGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupProps):
        software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps
  }
}
