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

package io.cloudshiftdev.awscdkdsl.services.detective

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnGraphProps

/**
 * Properties for defining a `CfnGraph`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.detective.*;
 * CfnGraphProps cfnGraphProps = CfnGraphProps.builder()
 * .autoEnableMembers(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-graph.html)
 */
@CdkDslMarker
public class CfnGraphPropsDsl {
    private val cdkBuilder: CfnGraphProps.Builder = CfnGraphProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     *   as member accounts in the organization behavior graph. By default, this property is set to
     *   `false` . If you want to change the value of this property, you must be the Detective
     *   administrator for the organization. For more information on setting a Detective
     *   administrator account, see
     *   [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    public fun autoEnableMembers(autoEnableMembers: Boolean) {
        cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    /**
     * @param autoEnableMembers Indicates whether to automatically enable new organization accounts
     *   as member accounts in the organization behavior graph. By default, this property is set to
     *   `false` . If you want to change the value of this property, you must be the Detective
     *   administrator for the organization. For more information on setting a Detective
     *   administrator account, see
     *   [AWS::Detective::OrganizationAdmin](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
     */
    public fun autoEnableMembers(autoEnableMembers: IResolvable) {
        cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    /** @param tags The tag values to assign to the new behavior graph. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tag values to assign to the new behavior graph. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGraphProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
