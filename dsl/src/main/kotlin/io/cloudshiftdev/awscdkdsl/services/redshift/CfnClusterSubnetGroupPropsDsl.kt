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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps

/**
 * Properties for defining a `CfnClusterSubnetGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSubnetGroupProps cfnClusterSubnetGroupProps = CfnClusterSubnetGroupProps.builder()
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
 */
@CdkDslMarker
public class CfnClusterSubnetGroupPropsDsl {
    private val cdkBuilder: CfnClusterSubnetGroupProps.Builder =
        CfnClusterSubnetGroupProps.builder()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description for the subnet group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     *   single request.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a
     *   single request.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   subnet group. Use tags to manage your resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   subnet group. Use tags to manage your resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClusterSubnetGroupProps {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
