@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCollaboration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
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
 * .analyticsEngine("analyticsEngine")
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
public interface CfnCollaborationProps {
  /**
   * The analytics engine for the collaboration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-analyticsengine)
   */
  public fun analyticsEngine(): String? = unwrap(this).getAnalyticsEngine()

  /**
   * A display name of the collaboration creator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatordisplayname)
   */
  public fun creatorDisplayName(): String

  /**
   * The abilities granted to the collaboration creator.
   *
   * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
   */
  public fun creatorMemberAbilities(): List<String>

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
   */
  public fun creatorPaymentConfiguration(): Any? = unwrap(this).getCreatorPaymentConfiguration()

  /**
   * The settings for client-side encryption for cryptographic computing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
   */
  public fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

  /**
   * A description of the collaboration provided by the collaboration owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-description)
   */
  public fun description(): String

  /**
   * A list of initial members, not including the creator.
   *
   * This list is immutable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
   */
  public fun members(): Any

  /**
   * A human-readable identifier provided by the collaboration owner.
   *
   * Display names are not unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-name)
   */
  public fun name(): String

  /**
   * An indicator as to whether query logging has been enabled or disabled for the collaboration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-querylogstatus)
   */
  public fun queryLogStatus(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCollaborationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analyticsEngine The analytics engine for the collaboration.
     */
    public fun analyticsEngine(analyticsEngine: String)

    /**
     * @param creatorDisplayName A display name of the collaboration creator. 
     */
    public fun creatorDisplayName(creatorDisplayName: String)

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun creatorMemberAbilities(creatorMemberAbilities: List<String>)

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String)

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable)

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty)

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33da896b017094c5a39cedde484ca720ff659b36909a615f8111b997422befc4")
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable)

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty)

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb309635685efd6c3434160760e8cff2f8c1f0be32fd321b989145b848a2824")
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty.Builder.() -> Unit)

    /**
     * @param description A description of the collaboration provided by the collaboration owner. 
     */
    public fun description(description: String)

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    public fun members(members: IResolvable)

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    public fun members(members: List<Any>)

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    public fun members(vararg members: Any)

    /**
     * @param name A human-readable identifier provided by the collaboration owner. 
     * Display names are not unique.
     */
    public fun name(name: String)

    /**
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the collaboration. 
     */
    public fun queryLogStatus(queryLogStatus: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps.Builder
        = software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps.builder()

    /**
     * @param analyticsEngine The analytics engine for the collaboration.
     */
    override fun analyticsEngine(analyticsEngine: String) {
      cdkBuilder.analyticsEngine(analyticsEngine)
    }

    /**
     * @param creatorDisplayName A display name of the collaboration creator. 
     */
    override fun creatorDisplayName(creatorDisplayName: String) {
      cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    override fun creatorMemberAbilities(creatorMemberAbilities: List<String>) {
      cdkBuilder.creatorMemberAbilities(creatorMemberAbilities)
    }

    /**
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     */
    override fun creatorMemberAbilities(vararg creatorMemberAbilities: String): Unit =
        creatorMemberAbilities(creatorMemberAbilities.toList())

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    override fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(CfnCollaboration.PaymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33da896b017094c5a39cedde484ca720ff659b36909a615f8111b997422befc4")
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: CfnCollaboration.PaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        creatorPaymentConfiguration(CfnCollaboration.PaymentConfigurationProperty(creatorPaymentConfiguration))

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    override fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(CfnCollaboration.DataEncryptionMetadataProperty.Companion::unwrap))
    }

    /**
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deb309635685efd6c3434160760e8cff2f8c1f0be32fd321b989145b848a2824")
    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: CfnCollaboration.DataEncryptionMetadataProperty.Builder.() -> Unit):
        Unit =
        dataEncryptionMetadata(CfnCollaboration.DataEncryptionMetadataProperty(dataEncryptionMetadata))

    /**
     * @param description A description of the collaboration provided by the collaboration owner. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    override fun members(members: List<Any>) {
      cdkBuilder.members(members.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param members A list of initial members, not including the creator. 
     * This list is immutable.
     */
    override fun members(vararg members: Any): Unit = members(members.toList())

    /**
     * @param name A human-readable identifier provided by the collaboration owner. 
     * Display names are not unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the collaboration. 
     */
    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps,
  ) : CdkObject(cdkObject),
      CfnCollaborationProps {
    /**
     * The analytics engine for the collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-analyticsengine)
     */
    override fun analyticsEngine(): String? = unwrap(this).getAnalyticsEngine()

    /**
     * A display name of the collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatordisplayname)
     */
    override fun creatorDisplayName(): String = unwrap(this).getCreatorDisplayName()

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     */
    override fun creatorMemberAbilities(): List<String> = unwrap(this).getCreatorMemberAbilities()

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     */
    override fun creatorPaymentConfiguration(): Any? = unwrap(this).getCreatorPaymentConfiguration()

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     */
    override fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

    /**
     * A description of the collaboration provided by the collaboration owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     */
    override fun members(): Any = unwrap(this).getMembers()

    /**
     * A human-readable identifier provided by the collaboration owner.
     *
     * Display names are not unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-querylogstatus)
     */
    override fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCollaborationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps):
        CfnCollaborationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCollaborationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCollaborationProps):
        software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnCollaborationProps
  }
}
