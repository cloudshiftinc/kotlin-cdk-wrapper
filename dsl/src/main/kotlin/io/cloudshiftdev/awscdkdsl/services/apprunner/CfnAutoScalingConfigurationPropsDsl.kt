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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfigurationProps

/**
 * Properties for defining a `CfnAutoScalingConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnAutoScalingConfigurationProps cfnAutoScalingConfigurationProps =
 * CfnAutoScalingConfigurationProps.builder()
 * .autoScalingConfigurationName("autoScalingConfigurationName")
 * .maxConcurrency(123)
 * .maxSize(123)
 * .minSize(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html)
 */
@CdkDslMarker
public class CfnAutoScalingConfigurationPropsDsl {
    private val cdkBuilder: CfnAutoScalingConfigurationProps.Builder =
        CfnAutoScalingConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name. It
     *   can be used in multiple revisions of a configuration.
     */
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
        cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    /**
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes.
     *   If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxSize The maximum number of instances that a service scales up to. At most `MaxSize`
     *   instances actively serve traffic for your service.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum number of instances that App Runner provisions for a service. The
     *   service always has at least `MinSize` provisioned instances. Some of them actively serve
     *   traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     *   capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     *   provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     *   configuration resource. A tag is a key-value pair.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of metadata items that you can associate with your auto scaling
     *   configuration resource. A tag is a key-value pair.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAutoScalingConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
