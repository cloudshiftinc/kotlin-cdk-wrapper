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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount
import software.constructs.Construct

/**
 * A partner account.
 *
 * If `PartnerAccountId` and `PartnerType` are `null` , returns all partner accounts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnPartnerAccount cfnPartnerAccount = CfnPartnerAccount.Builder.create(this,
 * "MyCfnPartnerAccount")
 * .accountLinked(false)
 * .partnerAccountId("partnerAccountId")
 * .partnerType("partnerType")
 * .sidewalk(SidewalkAccountInfoProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty.builder()
 * .amazonId("amazonId")
 * .arn("arn")
 * .fingerprint("fingerprint")
 * .build())
 * .sidewalkUpdate(SidewalkUpdateAccountProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html)
 */
@CdkDslMarker
public class CfnPartnerAccountDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPartnerAccount.Builder = CfnPartnerAccount.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     *
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    public fun accountLinked(accountLinked: Boolean) {
        cdkBuilder.accountLinked(accountLinked)
    }

    /**
     * Whether the partner account is linked to the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-accountlinked)
     *
     * @param accountLinked Whether the partner account is linked to the AWS account.
     */
    public fun accountLinked(accountLinked: IResolvable) {
        cdkBuilder.accountLinked(accountLinked)
    }

    /**
     * The ID of the partner account to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partneraccountid)
     *
     * @param partnerAccountId The ID of the partner account to update.
     */
    public fun partnerAccountId(partnerAccountId: String) {
        cdkBuilder.partnerAccountId(partnerAccountId)
    }

    /**
     * The partner type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-partnertype)
     *
     * @param partnerType The partner type.
     */
    public fun partnerType(partnerType: String) {
        cdkBuilder.partnerType(partnerType)
    }

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     *
     * @param sidewalk The Sidewalk account credentials.
     */
    public fun sidewalk(sidewalk: IResolvable) {
        cdkBuilder.sidewalk(sidewalk)
    }

    /**
     * The Sidewalk account credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalk)
     *
     * @param sidewalk The Sidewalk account credentials.
     */
    public fun sidewalk(sidewalk: CfnPartnerAccount.SidewalkAccountInfoProperty) {
        cdkBuilder.sidewalk(sidewalk)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     *
     * @param sidewalkResponse
     */
    public fun sidewalkResponse(sidewalkResponse: IResolvable) {
        cdkBuilder.sidewalkResponse(sidewalkResponse)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkresponse)
     *
     * @param sidewalkResponse
     */
    public fun sidewalkResponse(
        sidewalkResponse: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
    ) {
        cdkBuilder.sidewalkResponse(sidewalkResponse)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     *
     * @param sidewalkUpdate
     */
    public fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
        cdkBuilder.sidewalkUpdate(sidewalkUpdate)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-sidewalkupdate)
     *
     * @param sidewalkUpdate
     */
    public fun sidewalkUpdate(sidewalkUpdate: CfnPartnerAccount.SidewalkUpdateAccountProperty) {
        cdkBuilder.sidewalkUpdate(sidewalkUpdate)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-partneraccount.html#cfn-iotwireless-partneraccount-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPartnerAccount {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
