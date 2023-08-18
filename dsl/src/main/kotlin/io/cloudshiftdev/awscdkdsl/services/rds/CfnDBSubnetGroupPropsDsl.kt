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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps

/**
 * Properties for defining a `CfnDBSubnetGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBSubnetGroupProps cfnDBSubnetGroupProps = CfnDBSubnetGroupProps.builder()
 * .dbSubnetGroupDescription("dbSubnetGroupDescription")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html)
 */
@CdkDslMarker
public class CfnDBSubnetGroupPropsDsl {
    private val cdkBuilder: CfnDBSubnetGroupProps.Builder = CfnDBSubnetGroupProps.builder()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param dbSubnetGroupDescription The description for the DB subnet group. */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
        cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
     *   lowercase string. Constraints: Must contain no more than 255 lowercase alphanumeric
     *   characters or hyphens. Must not be "Default".
     *
     * Example: `mysubnetgroup`
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /** @param subnetIds The EC2 Subnet IDs for the DB subnet group. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds The EC2 Subnet IDs for the DB subnet group. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param tags An optional array of key-value pairs to apply to this DB subnet group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An optional array of key-value pairs to apply to this DB subnet group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBSubnetGroupProps {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
