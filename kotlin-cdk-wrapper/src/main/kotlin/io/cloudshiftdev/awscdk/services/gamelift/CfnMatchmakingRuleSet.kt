@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new rule set for FlexMatch matchmaking.
 *
 * A rule set describes the type of match to create, such as the number and size of teams. It also
 * sets the parameters for acceptable player matches, such as minimum skill level or character type.
 *
 * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON
 * format. Rule sets must be defined in the same Region as the matchmaking configuration they are used
 * with.
 *
 * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax.
 *
 * *Learn more*
 *
 * * [Build a rule
 * set](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html)
 * * [Design a
 * matchmaker](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html)
 * * [Matchmaking with
 * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-intro.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnMatchmakingRuleSet cfnMatchmakingRuleSet = CfnMatchmakingRuleSet.Builder.create(this,
 * "MyCfnMatchmakingRuleSet")
 * .name("name")
 * .ruleSetBody("ruleSetBody")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html)
 */
public open class CfnMatchmakingRuleSet(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMatchmakingRuleSetProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMatchmakingRuleSetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMatchmakingRuleSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMatchmakingRuleSetProps(props)
  )

  /**
   * The unique Amazon Resource Name (ARN) assigned to the rule set.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A time stamp indicating when this data object was created.
   *
   * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The unique name of the rule set.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique identifier for the matchmaking rule set.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A unique identifier for the matchmaking rule set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A collection of matchmaking rules, formatted as a JSON string.
   */
  public open fun ruleSetBody(): String = unwrap(this).getRuleSetBody()

  /**
   * A collection of matchmaking rules, formatted as a JSON string.
   */
  public open fun ruleSetBody(`value`: String) {
    unwrap(this).setRuleSetBody(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of labels to assign to the new matchmaking rule set resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of labels to assign to the new matchmaking rule set resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of labels to assign to the new matchmaking rule set resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnMatchmakingRuleSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique identifier for the matchmaking rule set.
     *
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-name)
     * @param name A unique identifier for the matchmaking rule set. 
     */
    public fun name(name: String)

    /**
     * A collection of matchmaking rules, formatted as a JSON string.
     *
     * Comments are not allowed in JSON, but most elements support a description field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-rulesetbody)
     * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string. 
     */
    public fun ruleSetBody(ruleSetBody: String)

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     * @param tags A list of labels to assign to the new matchmaking rule set resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     * @param tags A list of labels to assign to the new matchmaking rule set resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder.create(scope, id)

    /**
     * A unique identifier for the matchmaking rule set.
     *
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-name)
     * @param name A unique identifier for the matchmaking rule set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A collection of matchmaking rules, formatted as a JSON string.
     *
     * Comments are not allowed in JSON, but most elements support a description field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-rulesetbody)
     * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string. 
     */
    override fun ruleSetBody(ruleSetBody: String) {
      cdkBuilder.ruleSetBody(ruleSetBody)
    }

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     * @param tags A list of labels to assign to the new matchmaking rule set resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     * @param tags A list of labels to assign to the new matchmaking rule set resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchmakingRuleSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchmakingRuleSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet):
        CfnMatchmakingRuleSet = CfnMatchmakingRuleSet(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingRuleSet):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet = wrapped.cdkObject as
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
  }
}
