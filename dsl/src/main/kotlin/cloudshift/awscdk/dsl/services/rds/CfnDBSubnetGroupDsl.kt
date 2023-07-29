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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnDBSubnetGroup
import software.constructs.Construct

/**
 * The `AWS::RDS::DBSubnetGroup` resource creates a database subnet group.
 *
 * Subnet groups must contain at least two subnets in two different Availability Zones in the same
 * region.
 *
 * For more information, see
 * [Working with DB subnet groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Subnets)
 * in the *Amazon RDS User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html)
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
     * The description for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
     *
     * @param dbSubnetGroupDescription The description for the DB subnet group.
     */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
        cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * The name for the DB subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 lowercase alphanumeric characters or hyphens. Must
     * not be "Default".
     *
     * Example: `mysubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
     *
     * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
     *   lowercase string.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * The EC2 Subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
     *
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The EC2 Subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
     *
     * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * An optional array of key-value pairs to apply to this DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB subnet group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional array of key-value pairs to apply to this DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB subnet group.
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
