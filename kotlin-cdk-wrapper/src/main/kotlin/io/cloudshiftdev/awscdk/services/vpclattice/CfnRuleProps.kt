@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .action(ActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build())
 * .match(MatchProperty.builder()
 * .httpMatch(HttpMatchProperty.builder()
 * .headerMatches(List.of(HeaderMatchProperty.builder()
 * .match(HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .caseSensitive(false)
 * .build()))
 * .method("method")
 * .pathMatch(PathMatchProperty.builder()
 * .match(PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .caseSensitive(false)
 * .build())
 * .build())
 * .build())
 * .priority(123)
 * // the properties below are optional
 * .listenerIdentifier("listenerIdentifier")
 * .name("name")
 * .serviceIdentifier("serviceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html)
 */
public interface CfnRuleProps {
  /**
   * Describes the action for a rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
   */
  public fun action(): Any

  /**
   * The ID or ARN of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-listeneridentifier)
   */
  public fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

  /**
   * The rule match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
   */
  public fun match(): Any

  /**
   * The name of the rule.
   *
   * The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
   * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The priority assigned to the rule.
   *
   * Each rule for a specific listener must have a unique priority. The lower the priority number
   * the higher the priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-priority)
   */
  public fun priority(): Number

  /**
   * The ID or ARN of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-serviceidentifier)
   */
  public fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The tags for the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Describes the action for a rule. 
     */
    public fun action(action: IResolvable)

    /**
     * @param action Describes the action for a rule. 
     */
    public fun action(action: CfnRule.ActionProperty)

    /**
     * @param action Describes the action for a rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54cbe22d0181539e49be36eaa8bba893d0ad33e35080c801e9264fe9f1b3f7d8")
    public fun action(action: CfnRule.ActionProperty.Builder.() -> Unit)

    /**
     * @param listenerIdentifier The ID or ARN of the listener.
     */
    public fun listenerIdentifier(listenerIdentifier: String)

    /**
     * @param match The rule match. 
     */
    public fun match(match: IResolvable)

    /**
     * @param match The rule match. 
     */
    public fun match(match: CfnRule.MatchProperty)

    /**
     * @param match The rule match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("193d9602e4b0bfb37d41527fd8192a8dbb2a7b360221f5ae5921759b1ea13709")
    public fun match(match: CfnRule.MatchProperty.Builder.() -> Unit)

    /**
     * @param name The name of the rule.
     * The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String)

    /**
     * @param priority The priority assigned to the rule. 
     * Each rule for a specific listener must have a unique priority. The lower the priority number
     * the higher the priority.
     */
    public fun priority(priority: Number)

    /**
     * @param serviceIdentifier The ID or ARN of the service.
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * @param tags The tags for the rule.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the rule.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnRuleProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnRuleProps.builder()

    /**
     * @param action Describes the action for a rule. 
     */
    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param action Describes the action for a rule. 
     */
    override fun action(action: CfnRule.ActionProperty) {
      cdkBuilder.action(action.let(CfnRule.ActionProperty.Companion::unwrap))
    }

    /**
     * @param action Describes the action for a rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54cbe22d0181539e49be36eaa8bba893d0ad33e35080c801e9264fe9f1b3f7d8")
    override fun action(action: CfnRule.ActionProperty.Builder.() -> Unit): Unit =
        action(CfnRule.ActionProperty(action))

    /**
     * @param listenerIdentifier The ID or ARN of the listener.
     */
    override fun listenerIdentifier(listenerIdentifier: String) {
      cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    /**
     * @param match The rule match. 
     */
    override fun match(match: IResolvable) {
      cdkBuilder.match(match.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param match The rule match. 
     */
    override fun match(match: CfnRule.MatchProperty) {
      cdkBuilder.match(match.let(CfnRule.MatchProperty.Companion::unwrap))
    }

    /**
     * @param match The rule match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("193d9602e4b0bfb37d41527fd8192a8dbb2a7b360221f5ae5921759b1ea13709")
    override fun match(match: CfnRule.MatchProperty.Builder.() -> Unit): Unit =
        match(CfnRule.MatchProperty(match))

    /**
     * @param name The name of the rule.
     * The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param priority The priority assigned to the rule. 
     * Each rule for a specific listener must have a unique priority. The lower the priority number
     * the higher the priority.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param serviceIdentifier The ID or ARN of the service.
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * @param tags The tags for the rule.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the rule.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnRuleProps,
  ) : CdkObject(cdkObject),
      CfnRuleProps {
    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     */
    override fun action(): Any = unwrap(this).getAction()

    /**
     * The ID or ARN of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-listeneridentifier)
     */
    override fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     */
    override fun match(): Any = unwrap(this).getMatch()

    /**
     * The name of the rule.
     *
     * The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The priority assigned to the rule.
     *
     * Each rule for a specific listener must have a unique priority. The lower the priority number
     * the higher the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The ID or ARN of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-serviceidentifier)
     */
    override fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

    /**
     * The tags for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRuleProps):
        CfnRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps):
        software.amazon.awscdk.services.vpclattice.CfnRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.vpclattice.CfnRuleProps
  }
}
