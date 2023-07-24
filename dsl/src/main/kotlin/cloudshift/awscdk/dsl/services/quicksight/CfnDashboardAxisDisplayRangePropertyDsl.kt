@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.Unit

/**
 * The range setup of a numeric axis display range.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * AxisDisplayRangeProperty axisDisplayRangeProperty = AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-axisdisplayrange.html)
 */
@CdkDslMarker
public class CfnDashboardAxisDisplayRangePropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisDisplayRangeProperty.Builder =
        CfnDashboard.AxisDisplayRangeProperty.builder()

    /**
     * @param dataDriven The data-driven setup of an axis display range.
     */
    public fun dataDriven(dataDriven: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataDriven)
        cdkBuilder.dataDriven(builder.map)
    }

    /**
     * @param dataDriven The data-driven setup of an axis display range.
     */
    public fun dataDriven(dataDriven: Any) {
        cdkBuilder.dataDriven(dataDriven)
    }

    /**
     * @param minMax The minimum and maximum setup of an axis display range.
     */
    public fun minMax(minMax: IResolvable) {
        cdkBuilder.minMax(minMax)
    }

    /**
     * @param minMax The minimum and maximum setup of an axis display range.
     */
    public fun minMax(minMax: CfnDashboard.AxisDisplayMinMaxRangeProperty) {
        cdkBuilder.minMax(minMax)
    }

    public fun build(): CfnDashboard.AxisDisplayRangeProperty = cdkBuilder.build()
}
