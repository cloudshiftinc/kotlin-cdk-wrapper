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
import software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps

/**
 * Properties for defining a `CfnCollaboration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * CfnCollaborationProps cfnCollaborationProps = CfnCollaborationProps.builder()
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
public class CfnCollaborationPropsDsl {
    private val cdkBuilder: CfnCollaborationProps.Builder = CfnCollaborationProps.builder()

    private val _creatorMemberAbilities: MutableList<String> = mutableListOf()

    private val _members: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param creatorDisplayName A display name of the collaboration creator. */
    public fun creatorDisplayName(creatorDisplayName: String) {
        cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. *Allowed
     *   values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String) {
        _creatorMemberAbilities.addAll(listOf(*creatorMemberAbilities))
    }

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. *Allowed
     *   values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun creatorMemberAbilities(creatorMemberAbilities: Collection<String>) {
        _creatorMemberAbilities.addAll(creatorMemberAbilities)
    }

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     *   responsibilities set by the collaboration creator.
     */
    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
        cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration)
    }

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     *   responsibilities set by the collaboration creator.
     */
    public fun creatorPaymentConfiguration(
        creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty
    ) {
        cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration)
    }

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     *   computing.
     */
    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
        cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata)
    }

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     *   computing.
     */
    public fun dataEncryptionMetadata(
        dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty
    ) {
        cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata)
    }

    /**
     * @param description A description of the collaboration provided by the collaboration owner.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param members A list of initial members, not including the creator. This list is immutable.
     */
    public fun members(vararg members: Any) {
        _members.addAll(listOf(*members))
    }

    /**
     * @param members A list of initial members, not including the creator. This list is immutable.
     */
    public fun members(members: Collection<Any>) {
        _members.addAll(members)
    }

    /**
     * @param members A list of initial members, not including the creator. This list is immutable.
     */
    public fun members(members: IResolvable) {
        cdkBuilder.members(members)
    }

    /**
     * @param name A human-readable identifier provided by the collaboration owner. Display names
     *   are not unique.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     *   for the collaboration.
     */
    public fun queryLogStatus(queryLogStatus: String) {
        cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it. Each tag
     *   consists of a key and an optional value, both of which you define. When you use tagging,
     *   you can also use tag-based access control in IAM policies to control access to this
     *   resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCollaborationProps {
        if (_creatorMemberAbilities.isNotEmpty())
            cdkBuilder.creatorMemberAbilities(_creatorMemberAbilities)
        if (_members.isNotEmpty()) cdkBuilder.members(_members)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
