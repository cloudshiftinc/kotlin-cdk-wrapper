@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.constructs.Construct

/**
 * Creates a new rule set for FlexMatch matchmaking.
 *
 * A rule set describes the type of match to create, such as the number and size of teams. It also
 * sets the parameters for acceptable player matches, such as minimum skill level or character type.
 *
 * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON
 * format. Rule sets must be defined in the same Region as the matchmaking configuration they are
 * used with.
 *
 * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax.
 *
 * *Learn more*
 * * [Build a rule
 *   set](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html)
 * * [Design a
 *   matchmaker](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html)
 * * [Matchmaking with
 *   FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-intro.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
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
@CdkDslMarker
public class CfnMatchmakingRuleSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMatchmakingRuleSet.Builder =
        CfnMatchmakingRuleSet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A unique identifier for the matchmaking rule set.
     *
     * A matchmaking configuration identifies the rule set it uses by this name value. Note that the
     * rule set name is different from the optional `name` field in the rule set body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-name)
     *
     * @param name A unique identifier for the matchmaking rule set.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A collection of matchmaking rules, formatted as a JSON string.
     *
     * Comments are not allowed in JSON, but most elements support a description field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-rulesetbody)
     *
     * @param ruleSetBody A collection of matchmaking rules, formatted as a JSON string.
     */
    public fun ruleSetBody(ruleSetBody: String) {
        cdkBuilder.ruleSetBody(ruleSetBody)
    }

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     *
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of labels to assign to the new matchmaking rule set resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html#cfn-gamelift-matchmakingruleset-tags)
     *
     * @param tags A list of labels to assign to the new matchmaking rule set resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMatchmakingRuleSet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
