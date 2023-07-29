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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.emr.CfnCluster

/**
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

    /** @param idleTimeout the value to be set. */
    public fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun build(): CfnCluster.AutoTerminationPolicyProperty = cdkBuilder.build()
}
