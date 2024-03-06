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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration

/**
 * Basic metadata used to construct a new member.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * MemberSpecificationProperty memberSpecificationProperty = MemberSpecificationProperty.builder()
 * .accountId("accountId")
 * .displayName("displayName")
 * .memberAbilities(List.of("memberAbilities"))
 * // the properties below are optional
 * .paymentConfiguration(PaymentConfigurationProperty.builder()
 * .queryCompute(QueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html)
 */
@CdkDslMarker
public class CfnCollaborationMemberSpecificationPropertyDsl {
    private val cdkBuilder: CfnCollaboration.MemberSpecificationProperty.Builder =
        CfnCollaboration.MemberSpecificationProperty.builder()

    private val _memberAbilities: MutableList<String> = mutableListOf()

    /**
     * @param accountId The identifier used to reference members of the collaboration. Currently
     *   only supports AWS account ID.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /** @param displayName The member's display name. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param memberAbilities The abilities granted to the collaboration member. *Allowed Values* :
     *   `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun memberAbilities(vararg memberAbilities: String) {
        _memberAbilities.addAll(listOf(*memberAbilities))
    }

    /**
     * @param memberAbilities The abilities granted to the collaboration member. *Allowed Values* :
     *   `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun memberAbilities(memberAbilities: Collection<String>) {
        _memberAbilities.addAll(memberAbilities)
    }

    /**
     * @param paymentConfiguration The collaboration member's payment responsibilities set by the
     *   collaboration creator. If the collaboration creator hasn't speciﬁed anyone as the member
     *   paying for query compute costs, then the member who can query is the default payer.
     */
    public fun paymentConfiguration(paymentConfiguration: IResolvable) {
        cdkBuilder.paymentConfiguration(paymentConfiguration)
    }

    /**
     * @param paymentConfiguration The collaboration member's payment responsibilities set by the
     *   collaboration creator. If the collaboration creator hasn't speciﬁed anyone as the member
     *   paying for query compute costs, then the member who can query is the default payer.
     */
    public fun paymentConfiguration(
        paymentConfiguration: CfnCollaboration.PaymentConfigurationProperty
    ) {
        cdkBuilder.paymentConfiguration(paymentConfiguration)
    }

    public fun build(): CfnCollaboration.MemberSpecificationProperty {
        if (_memberAbilities.isNotEmpty()) cdkBuilder.memberAbilities(_memberAbilities)
        return cdkBuilder.build()
    }
}
