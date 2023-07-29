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

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.constructs.Construct

/**
 * Creates a cell in recovery group in Amazon Route 53 Application Recovery Controller.
 *
 * A cell in Route 53 ARC represents replicas or independent units of failover in your application.
 * It groups within it all the AWS resources that are necessary for your application to run
 * independently. Typically, you would have define one set of resources in a primary cell and
 * another set in a standby cell in your recovery group.
 *
 * After you set up the cells for your application, you can create readiness checks in Route 53 ARC
 * to continually audit readiness for AWS resource quotas, capacity, network routing policies, and
 * other predefined rules.
 *
 * You can set up notifications about changes that would affect your ability to fail over to a
 * replica and recover. However, you should make decisions about whether to fail away from or to a
 * replica based on your monitoring and health check systems. You should consider readiness checks
 * as a complementary service to those systems.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnCell cfnCell = CfnCell.Builder.create(this, "MyCfnCell")
 * .cellName("cellName")
 * .cells(List.of("cells"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html)
 */
@CdkDslMarker
public class CfnCellDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCell.Builder = CfnCell.Builder.create(scope, id)

    private val _cells: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the cell to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cellname)
     *
     * @param cellName The name of the cell to create.
     */
    public fun cellName(cellName: String) {
        cdkBuilder.cellName(cellName)
    }

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     *
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     *   in nested cells.
     */
    public fun cells(vararg cells: String) {
        _cells.addAll(listOf(*cells))
    }

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested
     * cells.
     *
     * For example, Availability Zones within specific AWS Regions .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-cells)
     *
     * @param cells A list of cell Amazon Resource Names (ARNs) contained within this cell, for use
     *   in nested cells.
     */
    public fun cells(cells: Collection<String>) {
        _cells.addAll(cells)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     *
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-cell.html#cfn-route53recoveryreadiness-cell-tags)
     *
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCell {
        if (_cells.isNotEmpty()) cdkBuilder.cells(_cells)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
