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

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.constructs.Construct

/**
 * Creates a billing group that resembles a consolidated billing family that AWS charges, based off
 * of the predefined pricing plan computation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
 * .accountGrouping(AccountGroupingProperty.builder()
 * .linkedAccountIds(List.of("linkedAccountIds"))
 * // the properties below are optional
 * .autoAssociate(false)
 * .build())
 * .computationPreference(ComputationPreferenceProperty.builder()
 * .pricingPlanArn("pricingPlanArn")
 * .build())
 * .name("name")
 * .primaryAccountId("primaryAccountId")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html)
 */
@CdkDslMarker
public class CfnBillingGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBillingGroup.Builder = CfnBillingGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     *
     * @param accountGrouping The set of accounts that will be under the billing group.
     */
    public fun accountGrouping(accountGrouping: IResolvable) {
        cdkBuilder.accountGrouping(accountGrouping)
    }

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     *
     * @param accountGrouping The set of accounts that will be under the billing group.
     */
    public fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty) {
        cdkBuilder.accountGrouping(accountGrouping)
    }

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     *
     * @param computationPreference The preferences and settings that will be used to compute the
     *   AWS charges for a billing group.
     */
    public fun computationPreference(computationPreference: IResolvable) {
        cdkBuilder.computationPreference(computationPreference)
    }

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     *
     * @param computationPreference The preferences and settings that will be used to compute the
     *   AWS charges for a billing group.
     */
    public fun computationPreference(
        computationPreference: CfnBillingGroup.ComputationPreferenceProperty
    ) {
        cdkBuilder.computationPreference(computationPreference)
    }

    /**
     * The description of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-description)
     *
     * @param description The description of the billing group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The billing group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-name)
     *
     * @param name The billing group's name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The account ID that serves as the main account in a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-primaryaccountid)
     *
     * @param primaryAccountId The account ID that serves as the main account in a billing group.
     */
    public fun primaryAccountId(primaryAccountId: String) {
        cdkBuilder.primaryAccountId(primaryAccountId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     *
     * @param tags
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     *
     * @param tags
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBillingGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
