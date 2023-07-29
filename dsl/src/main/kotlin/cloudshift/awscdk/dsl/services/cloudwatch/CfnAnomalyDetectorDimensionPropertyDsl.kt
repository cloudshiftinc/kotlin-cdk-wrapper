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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

/**
 * A dimension is a name/value pair that is part of the identity of a metric.
 *
 * Because dimensions are part of the unique identifier for a metric, whenever you add a unique
 * name/value pair to one of your metrics, you are creating a new variation of that metric. For
 * example, many Amazon EC2 metrics publish `InstanceId` as a dimension name, and the actual
 * instance ID as the value for that dimension.
 *
 * You can assign up to 30 dimensions to a metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * DimensionProperty dimensionProperty = DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorDimensionPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.DimensionProperty.Builder =
        CfnAnomalyDetector.DimensionProperty.builder()

    /** @param name The name of the dimension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value The value of the dimension. Dimension values must contain only ASCII characters
     *   and must include at least one non-whitespace character. ASCII control characters are not
     *   supported as part of dimension values.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnomalyDetector.DimensionProperty = cdkBuilder.build()
}
