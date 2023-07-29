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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.constructs.Construct

/**
 * Specifies a new Amazon Redshift security group. You use security groups to control access to
 * non-VPC clusters.
 *
 * For information about managing security groups, go to
 * [Amazon Redshift Cluster Security Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html)
 * in the *Amazon Redshift Cluster Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSecurityGroup cfnClusterSecurityGroup = CfnClusterSecurityGroup.Builder.create(this,
 * "MyCfnClusterSecurityGroup")
 * .description("description")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
 */
@CdkDslMarker
public class CfnClusterSecurityGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClusterSecurityGroup.Builder =
        CfnClusterSecurityGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-description)
     *
     * @param description A description for the security group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     *
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   security group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     *
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   security group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClusterSecurityGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
