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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/**
 * An object representing the payment responsibilities accepted by the collaboration member.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * MembershipPaymentConfigurationProperty membershipPaymentConfigurationProperty =
 * MembershipPaymentConfigurationProperty.builder()
 * .queryCompute(MembershipQueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershippaymentconfiguration.html)
 */
@CdkDslMarker
public class CfnMembershipMembershipPaymentConfigurationPropertyDsl {
    private val cdkBuilder: CfnMembership.MembershipPaymentConfigurationProperty.Builder =
        CfnMembership.MembershipPaymentConfigurationProperty.builder()

    /**
     * @param queryCompute The payment responsibilities accepted by the collaboration member for
     *   query compute costs.
     */
    public fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute)
    }

    /**
     * @param queryCompute The payment responsibilities accepted by the collaboration member for
     *   query compute costs.
     */
    public fun queryCompute(
        queryCompute: CfnMembership.MembershipQueryComputePaymentConfigProperty
    ) {
        cdkBuilder.queryCompute(queryCompute)
    }

    public fun build(): CfnMembership.MembershipPaymentConfigurationProperty = cdkBuilder.build()
}
