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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field well configuration of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-gaugechartfieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisGaugeChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GaugeChartFieldWellsProperty.Builder =
        CfnAnalysis.GaugeChartFieldWellsProperty.builder()

    private val _targetValues: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param targetValues The target value field wells of a `GaugeChartVisual` . */
    public fun targetValues(vararg targetValues: Any) {
        _targetValues.addAll(listOf(*targetValues))
    }

    /** @param targetValues The target value field wells of a `GaugeChartVisual` . */
    public fun targetValues(targetValues: Collection<Any>) {
        _targetValues.addAll(targetValues)
    }

    /** @param targetValues The target value field wells of a `GaugeChartVisual` . */
    public fun targetValues(targetValues: IResolvable) {
        cdkBuilder.targetValues(targetValues)
    }

    /** @param values The value field wells of a `GaugeChartVisual` . */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /** @param values The value field wells of a `GaugeChartVisual` . */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /** @param values The value field wells of a `GaugeChartVisual` . */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnAnalysis.GaugeChartFieldWellsProperty {
        if (_targetValues.isNotEmpty()) cdkBuilder.targetValues(_targetValues)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
