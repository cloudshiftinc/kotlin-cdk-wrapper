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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration
import software.constructs.Construct

/**
 * Creates a new collaboration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnCollaboration cfnCollaboration = CfnCollaboration.Builder.create(this, "MyCfnCollaboration")
 * .creatorDisplayName("creatorDisplayName")
 * .creatorMemberAbilities(List.of("creatorMemberAbilities"))
 * .description("description")
 * .members(List.of(MemberSpecificationProperty.builder()
 * .accountId("accountId")
 * .displayName("displayName")
 * .memberAbilities(List.of("memberAbilities"))
 * // the properties below are optional
 * .paymentConfiguration(PaymentConfigurationProperty.builder()
 * .queryCompute(QueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build())
 * .build()))
 * .name("name")
 * .queryLogStatus("queryLogStatus")
 * // the properties below are optional
 * .creatorPaymentConfiguration(PaymentConfigurationProperty.builder()
 * .queryCompute(QueryComputePaymentConfigProperty.builder()
 * .isResponsible(false)
 * .build())
 * .build())
 * .dataEncryptionMetadata(DataEncryptionMetadataProperty.builder()
 * .allowCleartext(false)
 * .allowDuplicates(false)
 * .allowJoinsOnColumnsWithDifferentNames(false)
 * .preserveNulls(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html)
 */
@CdkDslMarker
public class CfnCollaborationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCollaboration.Builder = CfnCollaboration.Builder.create(scope, id)

    private val _creatorMemberAbilities: MutableList<String> = mutableListOf()

    private val _members: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A display name of the collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatordisplayname)
     *
     * @param creatorDisplayName A display name of the collaboration creator.
     */
    public fun creatorDisplayName(creatorDisplayName: String) {
        cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     *
     * @param creatorMemberAbilities The abilities granted to the collaboration creator.
     */
    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String) {
        _creatorMemberAbilities.addAll(listOf(*creatorMemberAbilities))
    }

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     *
     * @param creatorMemberAbilities The abilities granted to the collaboration creator.
     */
    public fun creatorMemberAbilities(creatorMemberAbilities: Collection<String>) {
        _creatorMemberAbilities.addAll(creatorMemberAbilities)
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     *
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     *   responsibilities set by the collaboration creator.
     */
    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
        cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration)
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     *
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     *   responsibilities set by the collaboration creator.
     */
    public fun creatorPaymentConfiguration(
        creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty
    ) {
        cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration)
    }

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     *
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     *   computing.
     */
    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
        cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata)
    }

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     *
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     *   computing.
     */
    public fun dataEncryptionMetadata(
        dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty
    ) {
        cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata)
    }

    /**
     * A description of the collaboration provided by the collaboration owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-description)
     *
     * @param description A description of the collaboration provided by the collaboration owner.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     *
     * @param members A list of initial members, not including the creator.
     */
    public fun members(vararg members: Any) {
        _members.addAll(listOf(*members))
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     *
     * @param members A list of initial members, not including the creator.
     */
    public fun members(members: Collection<Any>) {
        _members.addAll(members)
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     *
     * @param members A list of initial members, not including the creator.
     */
    public fun members(members: IResolvable) {
        cdkBuilder.members(members)
    }

    /**
     * A human-readable identifier provided by the collaboration owner.
     *
     * Display names are not unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-name)
     *
     * @param name A human-readable identifier provided by the collaboration owner.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-querylogstatus)
     *
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     *   for the collaboration.
     */
    public fun queryLogStatus(queryLogStatus: String) {
        cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     *
     * @param tags An optional label that you can assign to a resource when you create it.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCollaboration {
        if (_creatorMemberAbilities.isNotEmpty())
            cdkBuilder.creatorMemberAbilities(_creatorMemberAbilities)
        if (_members.isNotEmpty()) cdkBuilder.members(_members)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
