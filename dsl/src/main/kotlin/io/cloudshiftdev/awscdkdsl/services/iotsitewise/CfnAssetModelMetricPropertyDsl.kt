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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Contains an asset metric property.
 *
 * With metrics, you can calculate aggregate functions, such as an average, maximum, or minimum, as
 * specified through an expression. A metric maps several values to a single value (such as a sum).
 *
 * The maximum number of dependent/cascading variables used in any one metric calculation is 10.
 * Therefore, a *root* metric can have up to 10 cascading metrics in its computational dependency
 * tree. Additionally, a metric can only have a data type of `DOUBLE` and consume properties with
 * data types of `INTEGER` or `DOUBLE` .
 *
 * For more information, see
 * [Defining data properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#metrics)
 * in the *AWS IoT SiteWise User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * MetricProperty metricProperty = MetricProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .window(MetricWindowProperty.builder()
 * .tumbling(TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html)
 */
@CdkDslMarker
public class CfnAssetModelMetricPropertyDsl {
    private val cdkBuilder: CfnAssetModel.MetricProperty.Builder =
        CfnAssetModel.MetricProperty.builder()

    private val _variables: MutableList<Any> = mutableListOf()

    /**
     * @param expression The mathematical expression that defines the metric aggregation function.
     *   You can specify up to 10 variables per expression. You can specify up to 10 functions per
     *   expression.
     *
     * For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
     * IoT SiteWise User Guide* .
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(vararg variables: Any) {
        _variables.addAll(listOf(*variables))
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(variables: Collection<Any>) {
        _variables.addAll(variables)
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    /**
     * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
     *   aggregation expression. AWS IoT SiteWise computes one data point per `window` .
     */
    public fun window(window: IResolvable) {
        cdkBuilder.window(window)
    }

    /**
     * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
     *   aggregation expression. AWS IoT SiteWise computes one data point per `window` .
     */
    public fun window(window: CfnAssetModel.MetricWindowProperty) {
        cdkBuilder.window(window)
    }

    public fun build(): CfnAssetModel.MetricProperty {
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        return cdkBuilder.build()
    }
}
