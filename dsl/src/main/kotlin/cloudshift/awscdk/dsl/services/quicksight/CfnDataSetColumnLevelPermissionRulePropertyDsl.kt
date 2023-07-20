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
public class CfnDataSetColumnLevelPermissionRulePropertyDsl {
    private val cdkBuilder: CfnDataSet.ColumnLevelPermissionRuleProperty.Builder =
        CfnDataSet.ColumnLevelPermissionRuleProperty.builder()

    private val _columnNames: MutableList<String> = mutableListOf()

    private val _principals: MutableList<String> = mutableListOf()

    public fun columnNames(vararg columnNames: String) {
        _columnNames.addAll(listOf(*columnNames))
    }

    public fun columnNames(columnNames: Collection<String>) {
        _columnNames.addAll(columnNames)
    }

    public fun principals(vararg principals: String) {
        _principals.addAll(listOf(*principals))
    }

    public fun principals(principals: Collection<String>) {
        _principals.addAll(principals)
    }

    public fun build(): CfnDataSet.ColumnLevelPermissionRuleProperty {
        if (_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
        if (_principals.isNotEmpty()) cdkBuilder.principals(_principals)
        return cdkBuilder.build()
    }
}
