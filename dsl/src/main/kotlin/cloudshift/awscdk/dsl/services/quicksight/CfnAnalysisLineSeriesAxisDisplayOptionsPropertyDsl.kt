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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisLineSeriesAxisDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineSeriesAxisDisplayOptionsProperty.Builder =
        CfnAnalysis.LineSeriesAxisDisplayOptionsProperty.builder()

    private val _missingDataConfigurations: MutableList<Any> = mutableListOf()

    public fun axisOptions(axisOptions: IResolvable) {
        cdkBuilder.axisOptions(axisOptions)
    }

    public fun axisOptions(axisOptions: CfnAnalysis.AxisDisplayOptionsProperty) {
        cdkBuilder.axisOptions(axisOptions)
    }

    public fun missingDataConfigurations(vararg missingDataConfigurations: Any) {
        _missingDataConfigurations.addAll(listOf(*missingDataConfigurations))
    }

    public fun missingDataConfigurations(missingDataConfigurations: Collection<Any>) {
        _missingDataConfigurations.addAll(missingDataConfigurations)
    }

    public fun missingDataConfigurations(missingDataConfigurations: IResolvable) {
        cdkBuilder.missingDataConfigurations(missingDataConfigurations)
    }

    public fun build(): CfnAnalysis.LineSeriesAxisDisplayOptionsProperty {
        if (_missingDataConfigurations.isNotEmpty()) {
            cdkBuilder.missingDataConfigurations(_missingDataConfigurations)
        }
        return cdkBuilder.build()
    }
}
