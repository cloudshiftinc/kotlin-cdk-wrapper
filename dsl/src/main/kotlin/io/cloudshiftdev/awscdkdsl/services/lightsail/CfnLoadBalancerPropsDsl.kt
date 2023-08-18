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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps

/**
 * Properties for defining a `CfnLoadBalancer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
 * .instancePort(123)
 * .loadBalancerName("loadBalancerName")
 * // the properties below are optional
 * .attachedInstances(List.of("attachedInstances"))
 * .healthCheckPath("healthCheckPath")
 * .ipAddressType("ipAddressType")
 * .sessionStickinessEnabled(false)
 * .sessionStickinessLbCookieDurationSeconds("sessionStickinessLbCookieDurationSeconds")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tlsPolicyName("tlsPolicyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html)
 */
@CdkDslMarker
public class CfnLoadBalancerPropsDsl {
    private val cdkBuilder: CfnLoadBalancerProps.Builder = CfnLoadBalancerProps.builder()

    private val _attachedInstances: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param attachedInstances The Lightsail instances to attach to the load balancer. */
    public fun attachedInstances(vararg attachedInstances: String) {
        _attachedInstances.addAll(listOf(*attachedInstances))
    }

    /** @param attachedInstances The Lightsail instances to attach to the load balancer. */
    public fun attachedInstances(attachedInstances: Collection<String>) {
        _attachedInstances.addAll(attachedInstances)
    }

    /**
     * @param healthCheckPath The path on the attached instance where the health check will be
     *   performed. If no path is specified, the load balancer tries to make a request to the
     *   default (root) page ( `/index.html` ).
     */
    public fun healthCheckPath(healthCheckPath: String) {
        cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param instancePort The port that the load balancer uses to direct traffic to your Lightsail
     *   instances. For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     */
    public fun instancePort(instancePort: Number) {
        cdkBuilder.instancePort(instancePort)
    }

    /**
     * @param ipAddressType The IP address type of the load balancer. The possible values are `ipv4`
     *   for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /** @param loadBalancerName The name of the load balancer. */
    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     *   enabled. Enable session stickiness (also known as *session affinity* ) to bind a user's
     *   session to a specific instance. This ensures that all requests from the user during the
     *   session are sent to the same instance.
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
        cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
    }

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     *   enabled. Enable session stickiness (also known as *session affinity* ) to bind a user's
     *   session to a specific instance. This ensures that all requests from the user during the
     *   session are sent to the same instance.
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
        cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
    }

    /**
     * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
     *   load balancer session stickiness cookie should be considered stale. If you do not specify
     *   this parameter, the default value is 0, which indicates that the sticky session should last
     *   for the duration of the browser session.
     */
    public fun sessionStickinessLbCookieDurationSeconds(
        sessionStickinessLbCookieDurationSeconds: String
    ) {
        cdkBuilder.sessionStickinessLbCookieDurationSeconds(
            sessionStickinessLbCookieDurationSeconds
        )
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param tlsPolicyName The name of the TLS security policy for the load balancer. */
    public fun tlsPolicyName(tlsPolicyName: String) {
        cdkBuilder.tlsPolicyName(tlsPolicyName)
    }

    public fun build(): CfnLoadBalancerProps {
        if (_attachedInstances.isNotEmpty()) cdkBuilder.attachedInstances(_attachedInstances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
