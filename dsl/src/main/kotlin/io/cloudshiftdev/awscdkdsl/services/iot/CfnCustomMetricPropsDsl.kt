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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnCustomMetricProps

/**
 * Properties for defining a `CfnCustomMetric`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnCustomMetricProps cfnCustomMetricProps = CfnCustomMetricProps.builder()
 * .metricType("metricType")
 * // the properties below are optional
 * .displayName("displayName")
 * .metricName("metricName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html)
 */
@CdkDslMarker
public class CfnCustomMetricPropsDsl {
    private val cdkBuilder: CfnCustomMetricProps.Builder = CfnCustomMetricProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param displayName The friendly name in the console for the custom metric. This name doesn't
     *   have to be unique. Don't use this name as the metric identifier in the device metric
     *   report. You can update the friendly name after you define it.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param metricName The name of the custom metric. This will be used in the metric report
     *   submitted from the device/thing. The name can't begin with `aws:` . You can’t change the
     *   name after you define it.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param metricType The type of the custom metric. Types include `string-list` ,
     *   `ip-address-list` , `number-list` , and `number` .
     *
     * The type `number` only takes a single metric value as an input, but when you submit the
     * metrics value in the DeviceMetrics report, you must pass it as an array with a single value.
     */
    public fun metricType(metricType: String) {
        cdkBuilder.metricType(metricType)
    }

    /** @param tags Metadata that can be used to manage the custom metric. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata that can be used to manage the custom metric. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCustomMetricProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
