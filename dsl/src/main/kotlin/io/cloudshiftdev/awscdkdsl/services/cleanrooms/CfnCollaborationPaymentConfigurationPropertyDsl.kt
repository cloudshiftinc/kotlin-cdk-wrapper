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
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration

/**
 * An object representing the collaboration member's payment responsibilities set by the
 * collaboration creator.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * PaymentConfigurationProperty paymentConfigurationProperty =
 * PaymentConfigurationProperty.builder()
 * .queryCompute(QueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-paymentconfiguration.html)
 */
@CdkDslMarker
public class CfnCollaborationPaymentConfigurationPropertyDsl {
    private val cdkBuilder: CfnCollaboration.PaymentConfigurationProperty.Builder =
        CfnCollaboration.PaymentConfigurationProperty.builder()

    /**
     * @param queryCompute The collaboration member's payment responsibilities set by the
     *   collaboration creator for query compute costs.
     */
    public fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute)
    }

    /**
     * @param queryCompute The collaboration member's payment responsibilities set by the
     *   collaboration creator for query compute costs.
     */
    public fun queryCompute(queryCompute: CfnCollaboration.QueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute)
    }

    public fun build(): CfnCollaboration.PaymentConfigurationProperty = cdkBuilder.build()
}
