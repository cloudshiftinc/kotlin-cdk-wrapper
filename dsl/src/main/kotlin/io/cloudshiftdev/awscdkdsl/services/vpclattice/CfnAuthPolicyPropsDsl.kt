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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps

/**
 * Properties for defining a `CfnAuthPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * Object policy;
 * CfnAuthPolicyProps cfnAuthPolicyProps = CfnAuthPolicyProps.builder()
 * .policy(policy)
 * .resourceIdentifier("resourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
 */
@CdkDslMarker
public class CfnAuthPolicyPropsDsl {
    private val cdkBuilder: CfnAuthPolicyProps.Builder = CfnAuthPolicyProps.builder()

    /** @param policy The auth policy. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy The auth policy. */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     *   service for which the policy is created.
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): CfnAuthPolicyProps = cdkBuilder.build()
}
