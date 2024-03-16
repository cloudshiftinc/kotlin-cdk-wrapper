@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMatchmakingRuleSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnMatchmakingRuleSetProps cfnMatchmakingRuleSetProps = CfnMatchmakingRuleSetProps.builder()
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
public interface CfnMatchmakingRuleSetProps {
  /**
   * A unique identifier for the matchmaking rule set.
   *
   * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
   * rule set name is different from the optional `name` field in the rule set body.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-name)
   */
  public fun name(): String

  /**
   * A collection of matchmaking rules, formatted as a JSON string.
   *
   * Comments are not allowed in JSON, but most elements support a description field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-rulesetbody)
   */
  public fun ruleSetBody(): String

  /**
   * A list of labels to assign to the new matchmaking rule set resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMatchmakingRuleSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A unique identifier for the matchmaking rule set. 
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     */
    public fun name(name: String)

    /**
     * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string. 
     * Comments are not allowed in JSON, but most elements support a description field.
     */
    public fun ruleSetBody(ruleSetBody: String)

    /**
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.builder()

    /**
     * @param name A unique identifier for the matchmaking rule set. 
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string. 
     * Comments are not allowed in JSON, but most elements support a description field.
     */
    override fun ruleSetBody(ruleSetBody: String) {
      cdkBuilder.ruleSetBody(ruleSetBody)
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps,
  ) : CdkObject(cdkObject), CfnMatchmakingRuleSetProps {
    /**
     * A unique identifier for the matchmaking rule set.
     *
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A collection of matchmaking rules, formatted as a JSON string.
     *
     * Comments are not allowed in JSON, but most elements support a description field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-rulesetbody)
     */
    override fun ruleSetBody(): String = unwrap(this).getRuleSetBody()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchmakingRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps):
        CfnMatchmakingRuleSetProps = CdkObjectWrappers.wrap(cdkObject) as CfnMatchmakingRuleSetProps

    internal fun unwrap(wrapped: CfnMatchmakingRuleSetProps):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
  }
}
