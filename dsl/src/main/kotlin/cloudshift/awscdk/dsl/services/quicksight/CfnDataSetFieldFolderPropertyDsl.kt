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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetFieldFolderPropertyDsl {
    private val cdkBuilder: CfnDataSet.FieldFolderProperty.Builder =
        CfnDataSet.FieldFolderProperty.builder()

    private val _columns: MutableList<String> = mutableListOf()

    public fun columns(vararg columns: String) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<String>) {
        _columns.addAll(columns)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnDataSet.FieldFolderProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
