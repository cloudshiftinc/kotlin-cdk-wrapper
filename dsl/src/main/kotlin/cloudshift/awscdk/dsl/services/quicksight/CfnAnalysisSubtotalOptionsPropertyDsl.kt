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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisSubtotalOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SubtotalOptionsProperty.Builder =
        CfnAnalysis.SubtotalOptionsProperty.builder()

    private val _fieldLevelOptions: MutableList<Any> = mutableListOf()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun fieldLevel(fieldLevel: String) {
        cdkBuilder.fieldLevel(fieldLevel)
    }

    public fun fieldLevelOptions(vararg fieldLevelOptions: Any) {
        _fieldLevelOptions.addAll(listOf(*fieldLevelOptions))
    }

    public fun fieldLevelOptions(fieldLevelOptions: Collection<Any>) {
        _fieldLevelOptions.addAll(fieldLevelOptions)
    }

    public fun fieldLevelOptions(fieldLevelOptions: IResolvable) {
        cdkBuilder.fieldLevelOptions(fieldLevelOptions)
    }

    public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    public fun totalCellStyle(totalCellStyle: IResolvable) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalCellStyle(totalCellStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalsVisibility(totalsVisibility: String) {
        cdkBuilder.totalsVisibility(totalsVisibility)
    }

    public fun valueCellStyle(valueCellStyle: IResolvable) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    public fun valueCellStyle(valueCellStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    public fun build(): CfnAnalysis.SubtotalOptionsProperty {
        if (_fieldLevelOptions.isNotEmpty()) cdkBuilder.fieldLevelOptions(_fieldLevelOptions)
        return cdkBuilder.build()
    }
}
