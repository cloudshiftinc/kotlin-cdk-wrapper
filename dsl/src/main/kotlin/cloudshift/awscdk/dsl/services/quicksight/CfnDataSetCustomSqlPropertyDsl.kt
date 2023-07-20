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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetCustomSqlPropertyDsl {
    private val cdkBuilder: CfnDataSet.CustomSqlProperty.Builder =
        CfnDataSet.CustomSqlProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
    }

    public fun build(): CfnDataSet.CustomSqlProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
