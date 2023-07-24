@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
import kotlin.Any
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.organizations.*;
 * Object content;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .content(content)
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param content The policy text of the organization resource policy.
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     */
    public fun content(content: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(content)
        cdkBuilder.content(builder.map)
    }

    /**
     * @param content The policy text of the organization resource policy.
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     */
    public fun content(content: Any) {
        cdkBuilder.content(content)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to
     * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to
     * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourcePolicyProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
