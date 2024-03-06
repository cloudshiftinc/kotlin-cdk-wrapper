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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * An auto-termination policy for an Amazon EMR cluster.
 *
 * An auto-termination policy defines the amount of idle time in seconds after which a cluster
 * automatically terminates. For alternative cluster termination options, see
 * [Control cluster termination](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * AutoTerminationPolicyProperty autoTerminationPolicyProperty =
 * AutoTerminationPolicyProperty.builder()
 * .idleTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-autoterminationpolicy.html)
 */
@CdkDslMarker
public class CfnClusterAutoTerminationPolicyPropertyDsl {
    private val cdkBuilder: CfnCluster.AutoTerminationPolicyProperty.Builder =
        CfnCluster.AutoTerminationPolicyProperty.builder()

    /**
     * @param idleTimeout Specifies the amount of idle time in seconds after which the cluster
     *   automatically terminates. You can specify a minimum of 60 seconds and a maximum of 604800
     *   seconds (seven days).
     */
    public fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun build(): CfnCluster.AutoTerminationPolicyProperty = cdkBuilder.build()
}
