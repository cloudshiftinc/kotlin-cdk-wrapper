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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/**
 * An object representing the payment responsibilities accepted by the collaboration member for
 * query compute costs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * MembershipQueryComputePaymentConfigProperty membershipQueryComputePaymentConfigProperty =
 * MembershipQueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipquerycomputepaymentconfig.html)
 */
@CdkDslMarker
public class CfnMembershipMembershipQueryComputePaymentConfigPropertyDsl {
    private val cdkBuilder: CfnMembership.MembershipQueryComputePaymentConfigProperty.Builder =
        CfnMembership.MembershipQueryComputePaymentConfigProperty.builder()

    /**
     * @param isResponsible Indicates whether the collaboration member has accepted to pay for query
     *   compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ). If
     *   the collaboration creator has not specified anyone to pay for query compute costs, then the
     *   member who can query is the default payer.
     *
     * An error message is returned for the following reasons:
     * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for query compute costs.
     */
    public fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
    }

    /**
     * @param isResponsible Indicates whether the collaboration member has accepted to pay for query
     *   compute costs ( `TRUE` ) or has not accepted to pay for query compute costs ( `FALSE` ). If
     *   the collaboration creator has not specified anyone to pay for query compute costs, then the
     *   member who can query is the default payer.
     *
     * An error message is returned for the following reasons:
     * * If you set the value to `FALSE` but you are responsible to pay for query compute costs.
     * * If you set the value to `TRUE` but you are not responsible to pay for query compute costs.
     */
    public fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible)
    }

    public fun build(): CfnMembership.MembershipQueryComputePaymentConfigProperty =
        cdkBuilder.build()
}
