@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps

/**
 * Properties for defining a `CfnMatchmakingRuleSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
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
@CdkDslMarker
public class CfnMatchmakingRuleSetPropsDsl {
  private val cdkBuilder: CfnMatchmakingRuleSetProps.Builder = CfnMatchmakingRuleSetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param name A unique identifier for the matchmaking rule set. 
   * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
   * rule set name is different from the optional `name` field in the rule set body.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string. 
   * Comments are not allowed in JSON, but most elements support a description field.
   */
  public fun ruleSetBody(ruleSetBody: String) {
    cdkBuilder.ruleSetBody(ruleSetBody)
  }

  /**
   * @param tags A list of labels to assign to the new matchmaking rule set resource.
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of labels to assign to the new matchmaking rule set resource.
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMatchmakingRuleSetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
