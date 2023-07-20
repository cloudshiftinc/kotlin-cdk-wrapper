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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateRowAlternateColorOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.RowAlternateColorOptionsProperty.Builder =
        CfnTemplate.RowAlternateColorOptionsProperty.builder()

    private val _rowAlternateColors: MutableList<String> = mutableListOf()

    public fun rowAlternateColors(vararg rowAlternateColors: String) {
        _rowAlternateColors.addAll(listOf(*rowAlternateColors))
    }

    public fun rowAlternateColors(rowAlternateColors: Collection<String>) {
        _rowAlternateColors.addAll(rowAlternateColors)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnTemplate.RowAlternateColorOptionsProperty {
        if (_rowAlternateColors.isNotEmpty()) cdkBuilder.rowAlternateColors(_rowAlternateColors)
        return cdkBuilder.build()
    }
}
