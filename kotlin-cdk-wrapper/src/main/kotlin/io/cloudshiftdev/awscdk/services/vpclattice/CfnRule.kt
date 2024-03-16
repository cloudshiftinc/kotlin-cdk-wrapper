@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a listener rule.
 *
 * Each listener has a default rule for checking connection requests, but you can define additional
 * rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more
 * information, see [Listener
 * rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the
 * *Amazon VPC Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
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
public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Describes the action for a rule.
   */
  public open fun action(): Any = unwrap(this).getAction()

  /**
   * Describes the action for a rule.
   */
  public open fun action(`value`: IResolvable) {
    unwrap(this).setAction(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the action for a rule.
   */
  public open fun action(`value`: ActionProperty) {
    unwrap(this).setAction(`value`.let(ActionProperty::unwrap))
  }

  /**
   * Describes the action for a rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e41ebe2c4504f6b68284e140c22a806b55173c36d63b9eaa9849456a7007399")
  public open fun action(`value`: ActionProperty.Builder.() -> Unit): Unit =
      action(ActionProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the rule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the listener.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerIdentifier(): String? = unwrap(this).getListenerIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerIdentifier(`value`: String) {
    unwrap(this).setListenerIdentifier(`value`)
  }

  /**
   * The rule match.
   */
  public open fun match(): Any = unwrap(this).getMatch()

  /**
   * The rule match.
   */
  public open fun match(`value`: IResolvable) {
    unwrap(this).setMatch(`value`.let(IResolvable::unwrap))
  }

  /**
   * The rule match.
   */
  public open fun match(`value`: MatchProperty) {
    unwrap(this).setMatch(`value`.let(MatchProperty::unwrap))
  }

  /**
   * The rule match.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51cfc7aebc89d00e550d45e58cc96d599269141d9060ca5991f544d7332ccab6")
  public open fun match(`value`: MatchProperty.Builder.() -> Unit): Unit =
      match(MatchProperty(`value`))

  /**
   * The name of the rule.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The priority assigned to the rule.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The priority assigned to the rule.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the rule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the rule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the rule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    public fun action(action: IResolvable)

    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    public fun action(action: ActionProperty)

    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cdfa0dc66bc15dc2277561cb0cc0da120c71b67f6f3561f6de721c39cd897b2")
    public fun action(action: ActionProperty.Builder.() -> Unit)

    /**
     * The ID or Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-listeneridentifier)
     * @param listenerIdentifier The ID or Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerIdentifier(listenerIdentifier: String)

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    public fun match(match: IResolvable)

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    public fun match(match: MatchProperty)

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9695a756ba1a6109e12c8b356ec6e7eedda0c35214677257b0f458ff02af6971")
    public fun match(match: MatchProperty.Builder.() -> Unit)

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
     * @param name The name of the rule. 
     */
    public fun name(name: String)

    /**
     * The priority assigned to the rule.
     *
     * Each rule for a specific listener must have a unique priority. The lower the priority number
     * the higher the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-priority)
     * @param priority The priority assigned to the rule. 
     */
    public fun priority(priority: Number)

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * The tags for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
     * @param tags The tags for the rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
     * @param tags The tags for the rule. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnRule.Builder =
        software.amazon.awscdk.services.vpclattice.CfnRule.Builder.create(scope, id)

    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    override fun action(action: ActionProperty) {
      cdkBuilder.action(action.let(ActionProperty::unwrap))
    }

    /**
     * Describes the action for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
     * @param action Describes the action for a rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cdfa0dc66bc15dc2277561cb0cc0da120c71b67f6f3561f6de721c39cd897b2")
    override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
        action(ActionProperty(action))

    /**
     * The ID or Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-listeneridentifier)
     * @param listenerIdentifier The ID or Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerIdentifier(listenerIdentifier: String) {
      cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    override fun match(match: IResolvable) {
      cdkBuilder.match(match.let(IResolvable::unwrap))
    }

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    override fun match(match: MatchProperty) {
      cdkBuilder.match(match.let(MatchProperty::unwrap))
    }

    /**
     * The rule match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
     * @param match The rule match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9695a756ba1a6109e12c8b356ec6e7eedda0c35214677257b0f458ff02af6971")
    override fun match(match: MatchProperty.Builder.() -> Unit): Unit = match(MatchProperty(match))

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
     * @param name The name of the rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The priority assigned to the rule.
     *
     * Each rule for a specific listener must have a unique priority. The lower the priority number
     * the higher the priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-priority)
     * @param priority The priority assigned to the rule. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * The tags for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
     * @param tags The tags for the rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
     * @param tags The tags for the rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.vpclattice.CfnRule =
        wrapped.cdkObject
  }

  /**
   * Describes the action for a rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * ActionProperty actionProperty = ActionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html)
   */
  public interface ActionProperty {
    /**
     * The fixed response action.
     *
     * The rule returns a custom HTTP response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html#cfn-vpclattice-rule-action-fixedresponse)
     */
    public fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

    /**
     * The forward action.
     *
     * Traffic that matches the rule is forwarded to the specified target groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html#cfn-vpclattice-rule-action-forward)
     */
    public fun forward(): Any? = unwrap(this).getForward()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      public fun fixedResponse(fixedResponse: IResolvable)

      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      public fun fixedResponse(fixedResponse: FixedResponseProperty)

      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df1da1bf9c6b9ee1fb3ff32972e833de1241e802607d2c9b9e68ad469a86fce5")
      public fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit)

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      public fun forward(forward: IResolvable)

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      public fun forward(forward: ForwardProperty)

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe455445f49766a9458412bdf9461a35c665b90503285f546ac9908f8fcdd8e9")
      public fun forward(forward: ForwardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty.builder()

      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      override fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse.let(IResolvable::unwrap))
      }

      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      override fun fixedResponse(fixedResponse: FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse.let(FixedResponseProperty::unwrap))
      }

      /**
       * @param fixedResponse The fixed response action.
       * The rule returns a custom HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df1da1bf9c6b9ee1fb3ff32972e833de1241e802607d2c9b9e68ad469a86fce5")
      override fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit): Unit =
          fixedResponse(FixedResponseProperty(fixedResponse))

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      override fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward.let(IResolvable::unwrap))
      }

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      override fun forward(forward: ForwardProperty) {
        cdkBuilder.forward(forward.let(ForwardProperty::unwrap))
      }

      /**
       * @param forward The forward action.
       * Traffic that matches the rule is forwarded to the specified target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe455445f49766a9458412bdf9461a35c665b90503285f546ac9908f8fcdd8e9")
      override fun forward(forward: ForwardProperty.Builder.() -> Unit): Unit =
          forward(ForwardProperty(forward))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * The fixed response action.
       *
       * The rule returns a custom HTTP response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html#cfn-vpclattice-rule-action-fixedresponse)
       */
      override fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

      /**
       * The forward action.
       *
       * Traffic that matches the rule is forwarded to the specified target groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html#cfn-vpclattice-rule-action-forward)
       */
      override fun forward(): Any? = unwrap(this).getForward()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as ActionProperty

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.ActionProperty
    }
  }

  /**
   * Describes the constraints for a header match.
   *
   * Matches incoming requests with rule based on request header value before applying rule action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * HeaderMatchProperty headerMatchProperty = HeaderMatchProperty.builder()
   * .match(HeaderMatchTypeProperty.builder()
   * .contains("contains")
   * .exact("exact")
   * .prefix("prefix")
   * .build())
   * .name("name")
   * // the properties below are optional
   * .caseSensitive(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html)
   */
  public interface HeaderMatchProperty {
    /**
     * Indicates whether the match is case sensitive.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-casesensitive)
     */
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    /**
     * The header match type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-match)
     */
    public fun match(): Any

    /**
     * The name of the header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-name)
     */
    public fun name(): String

    /**
     * A builder for [HeaderMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      public fun caseSensitive(caseSensitive: Boolean)

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      public fun caseSensitive(caseSensitive: IResolvable)

      /**
       * @param match The header match type. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match The header match type. 
       */
      public fun match(match: HeaderMatchTypeProperty)

      /**
       * @param match The header match type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74f1fa1344a5fe6e95184685e8bc22efdb4b10d412031998a58e82f907101084")
      public fun match(match: HeaderMatchTypeProperty.Builder.() -> Unit)

      /**
       * @param name The name of the header. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty.builder()

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
      }

      /**
       * @param match The header match type. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match The header match type. 
       */
      override fun match(match: HeaderMatchTypeProperty) {
        cdkBuilder.match(match.let(HeaderMatchTypeProperty::unwrap))
      }

      /**
       * @param match The header match type. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74f1fa1344a5fe6e95184685e8bc22efdb4b10d412031998a58e82f907101084")
      override fun match(match: HeaderMatchTypeProperty.Builder.() -> Unit): Unit =
          match(HeaderMatchTypeProperty(match))

      /**
       * @param name The name of the header. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty,
    ) : CdkObject(cdkObject), HeaderMatchProperty {
      /**
       * Indicates whether the match is case sensitive.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-casesensitive)
       */
      override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

      /**
       * The header match type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-match)
       */
      override fun match(): Any = unwrap(this).getMatch()

      /**
       * The name of the header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html#cfn-vpclattice-rule-headermatch-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty):
          HeaderMatchProperty = CdkObjectWrappers.wrap(cdkObject) as HeaderMatchProperty

      internal fun unwrap(wrapped: HeaderMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchProperty
    }
  }

  /**
   * Describes a header match type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * HeaderMatchTypeProperty headerMatchTypeProperty = HeaderMatchTypeProperty.builder()
   * .contains("contains")
   * .exact("exact")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html)
   */
  public interface HeaderMatchTypeProperty {
    /**
     * A contains type match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-contains)
     */
    public fun contains(): String? = unwrap(this).getContains()

    /**
     * An exact type match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * A prefix type match.
     *
     * Matches the value with the prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [HeaderMatchTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contains A contains type match.
       */
      public fun contains(contains: String)

      /**
       * @param exact An exact type match.
       */
      public fun exact(exact: String)

      /**
       * @param prefix A prefix type match.
       * Matches the value with the prefix.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty.builder()

      /**
       * @param contains A contains type match.
       */
      override fun contains(contains: String) {
        cdkBuilder.contains(contains)
      }

      /**
       * @param exact An exact type match.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param prefix A prefix type match.
       * Matches the value with the prefix.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty,
    ) : CdkObject(cdkObject), HeaderMatchTypeProperty {
      /**
       * A contains type match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-contains)
       */
      override fun contains(): String? = unwrap(this).getContains()

      /**
       * An exact type match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * A prefix type match.
       *
       * Matches the value with the prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html#cfn-vpclattice-rule-headermatchtype-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty):
          HeaderMatchTypeProperty = CdkObjectWrappers.wrap(cdkObject) as HeaderMatchTypeProperty

      internal fun unwrap(wrapped: HeaderMatchTypeProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HeaderMatchTypeProperty
    }
  }

  /**
   * Describes an action that returns a custom HTTP response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * FixedResponseProperty fixedResponseProperty = FixedResponseProperty.builder()
   * .statusCode(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-fixedresponse.html)
   */
  public interface FixedResponseProperty {
    /**
     * The HTTP response code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-fixedresponse.html#cfn-vpclattice-rule-fixedresponse-statuscode)
     */
    public fun statusCode(): Number

    /**
     * A builder for [FixedResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statusCode The HTTP response code. 
       */
      public fun statusCode(statusCode: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty.builder()

      /**
       * @param statusCode The HTTP response code. 
       */
      override fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty,
    ) : CdkObject(cdkObject), FixedResponseProperty {
      /**
       * The HTTP response code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-fixedresponse.html#cfn-vpclattice-rule-fixedresponse-statuscode)
       */
      override fun statusCode(): Number = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty):
          FixedResponseProperty = CdkObjectWrappers.wrap(cdkObject) as FixedResponseProperty

      internal fun unwrap(wrapped: FixedResponseProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.FixedResponseProperty
    }
  }

  /**
   * Describes a path match type.
   *
   * Each rule can include only one of the following types of paths.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * PathMatchTypeProperty pathMatchTypeProperty = PathMatchTypeProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html)
   */
  public interface PathMatchTypeProperty {
    /**
     * An exact match of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html#cfn-vpclattice-rule-pathmatchtype-exact)
     */
    public fun exact(): String? = unwrap(this).getExact()

    /**
     * A prefix match of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html#cfn-vpclattice-rule-pathmatchtype-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [PathMatchTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exact An exact match of the path.
       */
      public fun exact(exact: String)

      /**
       * @param prefix A prefix match of the path.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty.builder()

      /**
       * @param exact An exact match of the path.
       */
      override fun exact(exact: String) {
        cdkBuilder.exact(exact)
      }

      /**
       * @param prefix A prefix match of the path.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty,
    ) : CdkObject(cdkObject), PathMatchTypeProperty {
      /**
       * An exact match of the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html#cfn-vpclattice-rule-pathmatchtype-exact)
       */
      override fun exact(): String? = unwrap(this).getExact()

      /**
       * A prefix match of the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html#cfn-vpclattice-rule-pathmatchtype-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathMatchTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty):
          PathMatchTypeProperty = CdkObjectWrappers.wrap(cdkObject) as PathMatchTypeProperty

      internal fun unwrap(wrapped: PathMatchTypeProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchTypeProperty
    }
  }

  /**
   * The forward action.
   *
   * Traffic that matches the rule is forwarded to the specified target groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * ForwardProperty forwardProperty = ForwardProperty.builder()
   * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
   * .targetGroupIdentifier("targetGroupIdentifier")
   * // the properties below are optional
   * .weight(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-forward.html)
   */
  public interface ForwardProperty {
    /**
     * The target groups.
     *
     * Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group.
     * This means that requests are distributed to individual target groups based on their weights. For
     * example, if two target groups have the same weight, each target group receives half of the
     * traffic.
     *
     * The default value is 1. This means that if only one target group is provided, there is no
     * need to set the weight; 100% of the traffic goes to that target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-forward.html#cfn-vpclattice-rule-forward-targetgroups)
     */
    public fun targetGroups(): Any

    /**
     * A builder for [ForwardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(targetGroups: IResolvable)

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(targetGroups: List<Any>)

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty.builder()

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty,
    ) : CdkObject(cdkObject), ForwardProperty {
      /**
       * The target groups.
       *
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-forward.html#cfn-vpclattice-rule-forward-targetgroups)
       */
      override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty):
          ForwardProperty = CdkObjectWrappers.wrap(cdkObject) as ForwardProperty

      internal fun unwrap(wrapped: ForwardProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.ForwardProperty
    }
  }

  /**
   * Describes a rule match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * MatchProperty matchProperty = MatchProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-match.html)
   */
  public interface MatchProperty {
    /**
     * The HTTP criteria that a rule must match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-match.html#cfn-vpclattice-rule-match-httpmatch)
     */
    public fun httpMatch(): Any

    /**
     * A builder for [MatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      public fun httpMatch(httpMatch: IResolvable)

      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      public fun httpMatch(httpMatch: HttpMatchProperty)

      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac03b8d70d9360570b784633448685f84a835d082ee07d5773c5640701dba642")
      public fun httpMatch(httpMatch: HttpMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty.builder()

      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      override fun httpMatch(httpMatch: IResolvable) {
        cdkBuilder.httpMatch(httpMatch.let(IResolvable::unwrap))
      }

      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      override fun httpMatch(httpMatch: HttpMatchProperty) {
        cdkBuilder.httpMatch(httpMatch.let(HttpMatchProperty::unwrap))
      }

      /**
       * @param httpMatch The HTTP criteria that a rule must match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac03b8d70d9360570b784633448685f84a835d082ee07d5773c5640701dba642")
      override fun httpMatch(httpMatch: HttpMatchProperty.Builder.() -> Unit): Unit =
          httpMatch(HttpMatchProperty(httpMatch))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty,
    ) : CdkObject(cdkObject), MatchProperty {
      /**
       * The HTTP criteria that a rule must match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-match.html#cfn-vpclattice-rule-match-httpmatch)
       */
      override fun httpMatch(): Any = unwrap(this).getHttpMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty):
          MatchProperty = CdkObjectWrappers.wrap(cdkObject) as MatchProperty

      internal fun unwrap(wrapped: MatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnRule.MatchProperty
    }
  }

  /**
   * Describes the conditions that can be applied when matching a path for incoming requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * PathMatchProperty pathMatchProperty = PathMatchProperty.builder()
   * .match(PathMatchTypeProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .build())
   * // the properties below are optional
   * .caseSensitive(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html)
   */
  public interface PathMatchProperty {
    /**
     * Indicates whether the match is case sensitive.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html#cfn-vpclattice-rule-pathmatch-casesensitive)
     */
    public fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

    /**
     * The type of path match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html#cfn-vpclattice-rule-pathmatch-match)
     */
    public fun match(): Any

    /**
     * A builder for [PathMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      public fun caseSensitive(caseSensitive: Boolean)

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      public fun caseSensitive(caseSensitive: IResolvable)

      /**
       * @param match The type of path match. 
       */
      public fun match(match: IResolvable)

      /**
       * @param match The type of path match. 
       */
      public fun match(match: PathMatchTypeProperty)

      /**
       * @param match The type of path match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4e38510e114fb9aa7bbe175a25af8c12ff95a5d4ea6cc961bd44ea4699b537")
      public fun match(match: PathMatchTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty.builder()

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      override fun caseSensitive(caseSensitive: Boolean) {
        cdkBuilder.caseSensitive(caseSensitive)
      }

      /**
       * @param caseSensitive Indicates whether the match is case sensitive.
       */
      override fun caseSensitive(caseSensitive: IResolvable) {
        cdkBuilder.caseSensitive(caseSensitive.let(IResolvable::unwrap))
      }

      /**
       * @param match The type of path match. 
       */
      override fun match(match: IResolvable) {
        cdkBuilder.match(match.let(IResolvable::unwrap))
      }

      /**
       * @param match The type of path match. 
       */
      override fun match(match: PathMatchTypeProperty) {
        cdkBuilder.match(match.let(PathMatchTypeProperty::unwrap))
      }

      /**
       * @param match The type of path match. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a4e38510e114fb9aa7bbe175a25af8c12ff95a5d4ea6cc961bd44ea4699b537")
      override fun match(match: PathMatchTypeProperty.Builder.() -> Unit): Unit =
          match(PathMatchTypeProperty(match))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty,
    ) : CdkObject(cdkObject), PathMatchProperty {
      /**
       * Indicates whether the match is case sensitive.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html#cfn-vpclattice-rule-pathmatch-casesensitive)
       */
      override fun caseSensitive(): Any? = unwrap(this).getCaseSensitive()

      /**
       * The type of path match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html#cfn-vpclattice-rule-pathmatch-match)
       */
      override fun match(): Any = unwrap(this).getMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty):
          PathMatchProperty = CdkObjectWrappers.wrap(cdkObject) as PathMatchProperty

      internal fun unwrap(wrapped: PathMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.PathMatchProperty
    }
  }

  /**
   * Describes the weight of a target group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * WeightedTargetGroupProperty weightedTargetGroupProperty = WeightedTargetGroupProperty.builder()
   * .targetGroupIdentifier("targetGroupIdentifier")
   * // the properties below are optional
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html)
   */
  public interface WeightedTargetGroupProperty {
    /**
     * The ID of the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html#cfn-vpclattice-rule-weightedtargetgroup-targetgroupidentifier)
     */
    public fun targetGroupIdentifier(): String

    /**
     * Only required if you specify multiple target groups for a forward action.
     *
     * The weight determines how requests are distributed to the target group. For example, if you
     * specify two target groups, each with a weight of 10, each target group receives half the
     * requests. If you specify two target groups, one with a weight of 10 and the other with a weight
     * of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html#cfn-vpclattice-rule-weightedtargetgroup-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [WeightedTargetGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroupIdentifier The ID of the target group. 
       */
      public fun targetGroupIdentifier(targetGroupIdentifier: String)

      /**
       * @param weight Only required if you specify multiple target groups for a forward action.
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty.builder()

      /**
       * @param targetGroupIdentifier The ID of the target group. 
       */
      override fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
      }

      /**
       * @param weight Only required if you specify multiple target groups for a forward action.
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty,
    ) : CdkObject(cdkObject), WeightedTargetGroupProperty {
      /**
       * The ID of the target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html#cfn-vpclattice-rule-weightedtargetgroup-targetgroupidentifier)
       */
      override fun targetGroupIdentifier(): String = unwrap(this).getTargetGroupIdentifier()

      /**
       * Only required if you specify multiple target groups for a forward action.
       *
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html#cfn-vpclattice-rule-weightedtargetgroup-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty):
          WeightedTargetGroupProperty = CdkObjectWrappers.wrap(cdkObject) as
          WeightedTargetGroupProperty

      internal fun unwrap(wrapped: WeightedTargetGroupProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.WeightedTargetGroupProperty
    }
  }

  /**
   * Describes criteria that can be applied to incoming requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * HttpMatchProperty httpMatchProperty = HttpMatchProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html)
   */
  public interface HttpMatchProperty {
    /**
     * The header matches.
     *
     * Matches incoming requests with rule based on request header value before applying rule
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-headermatches)
     */
    public fun headerMatches(): Any? = unwrap(this).getHeaderMatches()

    /**
     * The HTTP method type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-method)
     */
    public fun method(): String? = unwrap(this).getMethod()

    /**
     * The path match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-pathmatch)
     */
    public fun pathMatch(): Any? = unwrap(this).getPathMatch()

    /**
     * A builder for [HttpMatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      public fun headerMatches(headerMatches: IResolvable)

      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      public fun headerMatches(headerMatches: List<Any>)

      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      public fun headerMatches(vararg headerMatches: Any)

      /**
       * @param method The HTTP method type.
       */
      public fun method(method: String)

      /**
       * @param pathMatch The path match.
       */
      public fun pathMatch(pathMatch: IResolvable)

      /**
       * @param pathMatch The path match.
       */
      public fun pathMatch(pathMatch: PathMatchProperty)

      /**
       * @param pathMatch The path match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21de76d3671e887303a3cfb6606976297979e6ca33813a916c73c7ca9015475c")
      public fun pathMatch(pathMatch: PathMatchProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty.builder()

      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      override fun headerMatches(headerMatches: IResolvable) {
        cdkBuilder.headerMatches(headerMatches.let(IResolvable::unwrap))
      }

      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      override fun headerMatches(headerMatches: List<Any>) {
        cdkBuilder.headerMatches(headerMatches)
      }

      /**
       * @param headerMatches The header matches.
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       */
      override fun headerMatches(vararg headerMatches: Any): Unit =
          headerMatches(headerMatches.toList())

      /**
       * @param method The HTTP method type.
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param pathMatch The path match.
       */
      override fun pathMatch(pathMatch: IResolvable) {
        cdkBuilder.pathMatch(pathMatch.let(IResolvable::unwrap))
      }

      /**
       * @param pathMatch The path match.
       */
      override fun pathMatch(pathMatch: PathMatchProperty) {
        cdkBuilder.pathMatch(pathMatch.let(PathMatchProperty::unwrap))
      }

      /**
       * @param pathMatch The path match.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21de76d3671e887303a3cfb6606976297979e6ca33813a916c73c7ca9015475c")
      override fun pathMatch(pathMatch: PathMatchProperty.Builder.() -> Unit): Unit =
          pathMatch(PathMatchProperty(pathMatch))

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty,
    ) : CdkObject(cdkObject), HttpMatchProperty {
      /**
       * The header matches.
       *
       * Matches incoming requests with rule based on request header value before applying rule
       * action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-headermatches)
       */
      override fun headerMatches(): Any? = unwrap(this).getHeaderMatches()

      /**
       * The HTTP method type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-method)
       */
      override fun method(): String? = unwrap(this).getMethod()

      /**
       * The path match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html#cfn-vpclattice-rule-httpmatch-pathmatch)
       */
      override fun pathMatch(): Any? = unwrap(this).getPathMatch()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty):
          HttpMatchProperty = CdkObjectWrappers.wrap(cdkObject) as HttpMatchProperty

      internal fun unwrap(wrapped: HttpMatchProperty):
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnRule.HttpMatchProperty
    }
  }
}
