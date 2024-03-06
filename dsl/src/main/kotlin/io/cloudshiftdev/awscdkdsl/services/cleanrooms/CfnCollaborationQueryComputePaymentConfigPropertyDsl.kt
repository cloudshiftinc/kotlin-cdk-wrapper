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
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration

/**
 * An object representing the collaboration member's payment responsibilities set by the
 * collaboration creator for query compute costs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * QueryComputePaymentConfigProperty queryComputePaymentConfigProperty =
 * QueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-querycomputepaymentconfig.html)
 */
@CdkDslMarker
public class CfnCollaborationQueryComputePaymentConfigPropertyDsl {
    private val cdkBuilder: CfnCollaboration.QueryComputePaymentConfigProperty.Builder =
        CfnCollaboration.QueryComputePaymentConfigProperty.builder()

    /**
     * @param isResponsible Indicates whether the collaboration creator has configured the
     *   collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
     *   collaboration member to pay for query compute costs ( `FALSE` ). Exactly one member can be
     *   configured to pay for query compute costs. An error is returned if the collaboration
     *   creator sets a `TRUE` value for more than one member in the collaboration.
     *
     * If the collaboration creator hasn't specified anyone as the member paying for query compute
     * costs, then the member who can query is the default payer. An error is returned if the
     * collaboration creator sets a `FALSE` value for the member who can query.
     */
    public fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
    }

    /**
     * @param isResponsible Indicates whether the collaboration creator has configured the
     *   collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
     *   collaboration member to pay for query compute costs ( `FALSE` ). Exactly one member can be
     *   configured to pay for query compute costs. An error is returned if the collaboration
     *   creator sets a `TRUE` value for more than one member in the collaboration.
     *
     * If the collaboration creator hasn't specified anyone as the member paying for query compute
     * costs, then the member who can query is the default payer. An error is returned if the
     * collaboration creator sets a `FALSE` value for the member who can query.
     */
    public fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible)
    }

    public fun build(): CfnCollaboration.QueryComputePaymentConfigProperty = cdkBuilder.build()
}
