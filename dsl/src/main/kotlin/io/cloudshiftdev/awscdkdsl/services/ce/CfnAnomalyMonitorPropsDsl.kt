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

package io.cloudshiftdev.awscdkdsl.services.ce

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps

/**
 * Properties for defining a `CfnAnomalyMonitor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ce.*;
 * CfnAnomalyMonitorProps cfnAnomalyMonitorProps = CfnAnomalyMonitorProps.builder()
 * .monitorName("monitorName")
 * .monitorType("monitorType")
 * // the properties below are optional
 * .monitorDimension("monitorDimension")
 * .monitorSpecification("monitorSpecification")
 * .resourceTags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html)
 */
@CdkDslMarker
public class CfnAnomalyMonitorPropsDsl {
    private val cdkBuilder: CfnAnomalyMonitorProps.Builder = CfnAnomalyMonitorProps.builder()

    private val _resourceTags: MutableList<Any> = mutableListOf()

    /** @param monitorDimension The dimensions to evaluate. */
    public fun monitorDimension(monitorDimension: String) {
        cdkBuilder.monitorDimension(monitorDimension)
    }

    /** @param monitorName The name of the monitor. */
    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    /**
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format. For
     *   instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     *   account for your custom anomaly monitor. For further information, see the
     *   [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     *   section of this page.
     */
    public fun monitorSpecification(monitorSpecification: String) {
        cdkBuilder.monitorSpecification(monitorSpecification)
    }

    /** @param monitorType The possible type values. */
    public fun monitorType(monitorType: String) {
        cdkBuilder.monitorType(monitorType)
    }

    /** @param resourceTags Tags to assign to monitor. */
    public fun resourceTags(vararg resourceTags: Any) {
        _resourceTags.addAll(listOf(*resourceTags))
    }

    /** @param resourceTags Tags to assign to monitor. */
    public fun resourceTags(resourceTags: Collection<Any>) {
        _resourceTags.addAll(resourceTags)
    }

    /** @param resourceTags Tags to assign to monitor. */
    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    public fun build(): CfnAnomalyMonitorProps {
        if (_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
        return cdkBuilder.build()
    }
}
