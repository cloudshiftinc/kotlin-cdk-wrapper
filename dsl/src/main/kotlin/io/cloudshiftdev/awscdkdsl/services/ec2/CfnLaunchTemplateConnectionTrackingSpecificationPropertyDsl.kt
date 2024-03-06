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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * A security group connection tracking specification that enables you to set the idle timeout for
 * connection tracking on an Elastic network interface.
 *
 * For more information, see
 * [Connection tracking timeouts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts)
 * in the *Amazon Elastic Compute Cloud User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ConnectionTrackingSpecificationProperty connectionTrackingSpecificationProperty =
 * ConnectionTrackingSpecificationProperty.builder()
 * .tcpEstablishedTimeout(123)
 * .udpStreamTimeout(123)
 * .udpTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateConnectionTrackingSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.Builder =
        CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.builder()

    /**
     * @param tcpEstablishedTimeout Timeout (in seconds) for idle TCP connections in an established
     *   state. Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended:
     *   Less than 432000 seconds.
     */
    public fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
        cdkBuilder.tcpEstablishedTimeout(tcpEstablishedTimeout)
    }

    /**
     * @param udpStreamTimeout Timeout (in seconds) for idle UDP flows classified as streams which
     *   have seen more than one request-response transaction. Min: 60 seconds. Max: 180 seconds (3
     *   minutes). Default: 180 seconds.
     */
    public fun udpStreamTimeout(udpStreamTimeout: Number) {
        cdkBuilder.udpStreamTimeout(udpStreamTimeout)
    }

    /**
     * @param udpTimeout Timeout (in seconds) for idle UDP flows that have seen traffic only in a
     *   single direction or a single request-response transaction. Min: 30 seconds. Max: 60
     *   seconds. Default: 30 seconds.
     */
    public fun udpTimeout(udpTimeout: Number) {
        cdkBuilder.udpTimeout(udpTimeout)
    }

    public fun build(): CfnLaunchTemplate.ConnectionTrackingSpecificationProperty =
        cdkBuilder.build()
}
