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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroup
import software.constructs.Construct

/**
 * The `AWS::DocDB::DBSubnetGroup` Amazon DocumentDB (with MongoDB compatibility) resource describes
 * a DBSubnetGroup.
 *
 * subnet groups must contain at least one subnet in at least two Availability Zones in the AWS
 * Region . For more information, see
 * [DBSubnetGroup](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBSubnetGroup.html)
 * in the *Amazon DocumentDB Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnDBSubnetGroup cfnDBSubnetGroup = CfnDBSubnetGroup.Builder.create(this, "MyCfnDBSubnetGroup")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html)
 */
@CdkDslMarker
public class CfnDBSubnetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBSubnetGroup.Builder = CfnDBSubnetGroup.Builder.create(scope, id)

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-dbsubnetgroupdescription)
     *
     * @param dbSubnetGroupDescription The description for the subnet group.
     */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
        cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * The name for the subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 letters, numbers, periods, underscores, spaces, or
     * hyphens. Must not be default.
     *
     * Example: `mySubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-dbsubnetgroupname)
     *
     * @param dbSubnetGroupName The name for the subnet group. This value is stored as a lowercase
     *   string.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * The Amazon EC2 subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-subnetids)
     *
     * @param subnetIds The Amazon EC2 subnet IDs for the subnet group.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The Amazon EC2 subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-subnetids)
     *
     * @param subnetIds The Amazon EC2 subnet IDs for the subnet group.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * The tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-tags)
     *
     * @param tags The tags to be assigned to the subnet group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbsubnetgroup.html#cfn-docdb-dbsubnetgroup-tags)
     *
     * @param tags The tags to be assigned to the subnet group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBSubnetGroup {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
