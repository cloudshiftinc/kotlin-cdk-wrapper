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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateColumnGroupSchemaPropertyDsl {
    private val cdkBuilder: CfnTemplate.ColumnGroupSchemaProperty.Builder =
        CfnTemplate.ColumnGroupSchemaProperty.builder()

    private val _columnGroupColumnSchemaList: MutableList<Any> = mutableListOf()

    public fun columnGroupColumnSchemaList(vararg columnGroupColumnSchemaList: Any) {
        _columnGroupColumnSchemaList.addAll(listOf(*columnGroupColumnSchemaList))
    }

    public fun columnGroupColumnSchemaList(columnGroupColumnSchemaList: Collection<Any>) {
        _columnGroupColumnSchemaList.addAll(columnGroupColumnSchemaList)
    }

    public fun columnGroupColumnSchemaList(columnGroupColumnSchemaList: IResolvable) {
        cdkBuilder.columnGroupColumnSchemaList(columnGroupColumnSchemaList)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTemplate.ColumnGroupSchemaProperty {
        if (_columnGroupColumnSchemaList.isNotEmpty()) {
            cdkBuilder.columnGroupColumnSchemaList(_columnGroupColumnSchemaList)
        }
        return cdkBuilder.build()
    }
}
