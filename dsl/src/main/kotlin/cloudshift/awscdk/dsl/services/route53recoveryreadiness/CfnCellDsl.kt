@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCellDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCell.Builder = CfnCell.Builder.create(scope, id)

    private val _cells: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cellName(cellName: String) {
        cdkBuilder.cellName(cellName)
    }

    public fun cells(vararg cells: String) {
        _cells.addAll(listOf(*cells))
    }

    public fun cells(cells: Collection<String>) {
        _cells.addAll(cells)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCell {
        if (_cells.isNotEmpty()) cdkBuilder.cells(_cells)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
