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
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRecoveryGroupPropsDsl {
    private val cdkBuilder: CfnRecoveryGroupProps.Builder = CfnRecoveryGroupProps.builder()

    private val _cells: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cells(vararg cells: String) {
        _cells.addAll(listOf(*cells))
    }

    public fun cells(cells: Collection<String>) {
        _cells.addAll(cells)
    }

    public fun recoveryGroupName(recoveryGroupName: String) {
        cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRecoveryGroupProps {
        if (_cells.isNotEmpty()) cdkBuilder.cells(_cells)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
