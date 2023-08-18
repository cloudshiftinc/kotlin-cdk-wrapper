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
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.constructs.Construct

/**
 * Specify an AWS App Runner Automatic Scaling configuration by using the
 * `AWS::AppRunner::AutoScalingConfiguration` resource in an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::AutoScalingConfiguration` resource is an AWS App Runner resource type that
 * specifies an App Runner automatic scaling configuration.
 *
 * App Runner requires this resource to set non-default auto scaling settings for instances used to
 * process the web requests. You can share an auto scaling configuration across multiple services.
 *
 * Create multiple revisions of a configuration by calling this action multiple times using the same
 * `AutoScalingConfigurationName` . The call returns incremental `AutoScalingConfigurationRevision`
 * values. When you create a service and configure an auto scaling configuration resource, the
 * service uses the latest active revision of the auto scaling configuration by default. You can
 * optionally configure the service to use a specific revision.
 *
 * Configure a higher `MinSize` to increase the spread of your App Runner service over more
 * Availability Zones in the AWS Region . The tradeoff is a higher minimal cost.
 *
 * Configure a lower `MaxSize` to control your cost. The tradeoff is lower responsiveness during
 * peak demand.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnAutoScalingConfiguration cfnAutoScalingConfiguration =
 * CfnAutoScalingConfiguration.Builder.create(this, "MyCfnAutoScalingConfiguration")
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
public class CfnAutoScalingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAutoScalingConfiguration.Builder =
        CfnAutoScalingConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The customer-provided auto scaling configuration name.
     *
     * It can be used in multiple revisions of a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
     *
     * @param autoScalingConfigurationName The customer-provided auto scaling configuration name.
     */
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
        cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    /**
     * The maximum number of concurrent requests that an instance processes.
     *
     * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
     *
     * @param maxConcurrency The maximum number of concurrent requests that an instance processes.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * The maximum number of instances that a service scales up to.
     *
     * At most `MaxSize` instances actively serve traffic for your service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
     *
     * @param maxSize The maximum number of instances that a service scales up to.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * The minimum number of instances that App Runner provisions for a service.
     *
     * The service always has at least `MinSize` provisioned instances. Some of them actively serve
     * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
     * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
     * provisioned instances. You pay for CPU usage of only the active subset.
     *
     * App Runner temporarily doubles the number of provisioned instances during deployments, to
     * maintain the same capacity for both old and new code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-minsize)
     *
     * @param minSize The minimum number of instances that App Runner provisions for a service.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     *
     * @param tags A list of metadata items that you can associate with your auto scaling
     *   configuration resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of metadata items that you can associate with your auto scaling configuration
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
     *
     * @param tags A list of metadata items that you can associate with your auto scaling
     *   configuration resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAutoScalingConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
