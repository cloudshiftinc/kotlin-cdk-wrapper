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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import software.constructs.Construct

/**
 * The `AWS::CE::AnomalyMonitor` resource is a Cost Explorer resource type that continuously
 * inspects your account's cost data for anomalies, based on `MonitorType` and
 * `MonitorSpecification` .
 *
 * The content consists of detailed metadata and the current status of the monitor object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ce.*;
 * CfnAnomalyMonitor cfnAnomalyMonitor = CfnAnomalyMonitor.Builder.create(this,
 * "MyCfnAnomalyMonitor")
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
public class CfnAnomalyMonitorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnomalyMonitor.Builder = CfnAnomalyMonitor.Builder.create(scope, id)

    private val _resourceTags: MutableList<Any> = mutableListOf()

    /**
     * The dimensions to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitordimension)
     *
     * @param monitorDimension The dimensions to evaluate.
     */
    public fun monitorDimension(monitorDimension: String) {
        cdkBuilder.monitorDimension(monitorDimension)
    }

    /**
     * The name of the monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorname)
     *
     * @param monitorName The name of the monitor.
     */
    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    /**
     * The array of `MonitorSpecification` in JSON array format.
     *
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorspecification)
     *
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format.
     */
    public fun monitorSpecification(monitorSpecification: String) {
        cdkBuilder.monitorSpecification(monitorSpecification)
    }

    /**
     * The possible type values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitortype)
     *
     * @param monitorType The possible type values.
     */
    public fun monitorType(monitorType: String) {
        cdkBuilder.monitorType(monitorType)
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     *
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(vararg resourceTags: Any) {
        _resourceTags.addAll(listOf(*resourceTags))
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     *
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(resourceTags: Collection<Any>) {
        _resourceTags.addAll(resourceTags)
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     *
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    public fun build(): CfnAnomalyMonitor {
        if (_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
        return cdkBuilder.build()
    }
}
