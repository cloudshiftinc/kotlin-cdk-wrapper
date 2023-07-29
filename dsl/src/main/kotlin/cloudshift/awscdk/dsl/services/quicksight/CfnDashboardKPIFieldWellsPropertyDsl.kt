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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field well configuration of a KPI visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-kpifieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardKPIFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.KPIFieldWellsProperty.Builder =
        CfnDashboard.KPIFieldWellsProperty.builder()

    private val _targetValues: MutableList<Any> = mutableListOf()

    private val _trendGroups: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    /** @param targetValues The target value field wells of a KPI visual. */
    public fun targetValues(vararg targetValues: Any) {
        _targetValues.addAll(listOf(*targetValues))
    }

    /** @param targetValues The target value field wells of a KPI visual. */
    public fun targetValues(targetValues: Collection<Any>) {
        _targetValues.addAll(targetValues)
    }

    /** @param targetValues The target value field wells of a KPI visual. */
    public fun targetValues(targetValues: IResolvable) {
        cdkBuilder.targetValues(targetValues)
    }

    /** @param trendGroups The trend group field wells of a KPI visual. */
    public fun trendGroups(vararg trendGroups: Any) {
        _trendGroups.addAll(listOf(*trendGroups))
    }

    /** @param trendGroups The trend group field wells of a KPI visual. */
    public fun trendGroups(trendGroups: Collection<Any>) {
        _trendGroups.addAll(trendGroups)
    }

    /** @param trendGroups The trend group field wells of a KPI visual. */
    public fun trendGroups(trendGroups: IResolvable) {
        cdkBuilder.trendGroups(trendGroups)
    }

    /** @param values The value field wells of a KPI visual. */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /** @param values The value field wells of a KPI visual. */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /** @param values The value field wells of a KPI visual. */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.KPIFieldWellsProperty {
        if (_targetValues.isNotEmpty()) cdkBuilder.targetValues(_targetValues)
        if (_trendGroups.isNotEmpty()) cdkBuilder.trendGroups(_trendGroups)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
