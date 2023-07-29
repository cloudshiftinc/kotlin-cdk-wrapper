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

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
import software.constructs.Construct

/**
 * The `AWS::APS::RuleGroupsNamespace` resource creates or updates a rule groups namespace within a
 * Amazon Managed Service for Prometheus workspace.
 *
 * For more information, see
 * [Recording rules and alerting rules](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.aps.*;
 * CfnRuleGroupsNamespace cfnRuleGroupsNamespace = CfnRuleGroupsNamespace.Builder.create(this,
 * "MyCfnRuleGroupsNamespace")
 * .data("data")
 * .name("name")
 * .workspace("workspace")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html)
 */
@CdkDslMarker
public class CfnRuleGroupsNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRuleGroupsNamespace.Builder =
        CfnRuleGroupsNamespace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The rules definition file for this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-data)
     *
     * @param data The rules definition file for this namespace.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /**
     * The name of the rule groups namespace.
     *
     * This property is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-name)
     *
     * @param name The name of the rule groups namespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of key and value pairs for the workspace resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     *
     * @param tags A list of key and value pairs for the workspace resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key and value pairs for the workspace resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     *
     * @param tags A list of key and value pairs for the workspace resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the workspace that contains this rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-workspace)
     *
     * @param workspace The ARN of the workspace that contains this rule groups namespace.
     */
    public fun workspace(workspace: String) {
        cdkBuilder.workspace(workspace)
    }

    public fun build(): CfnRuleGroupsNamespace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
