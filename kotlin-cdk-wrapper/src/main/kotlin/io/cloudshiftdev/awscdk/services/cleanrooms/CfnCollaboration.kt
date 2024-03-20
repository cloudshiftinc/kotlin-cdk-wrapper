@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new collaboration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
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
public open class CfnCollaboration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCollaborationProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnCollaboration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCollaborationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCollaborationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCollaborationProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the specified collaboration.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:collaboration/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the unique identifier of the specified collaboration.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A display name of the collaboration creator.
   */
  public open fun creatorDisplayName(): String = unwrap(this).getCreatorDisplayName()

  /**
   * A display name of the collaboration creator.
   */
  public open fun creatorDisplayName(`value`: String) {
    unwrap(this).setCreatorDisplayName(`value`)
  }

  /**
   * The abilities granted to the collaboration creator.
   */
  public open fun creatorMemberAbilities(): List<String> = unwrap(this).getCreatorMemberAbilities()

  /**
   * The abilities granted to the collaboration creator.
   */
  public open fun creatorMemberAbilities(`value`: List<String>) {
    unwrap(this).setCreatorMemberAbilities(`value`)
  }

  /**
   * The abilities granted to the collaboration creator.
   */
  public open fun creatorMemberAbilities(vararg `value`: String): Unit =
      creatorMemberAbilities(`value`.toList())

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   */
  public open fun creatorPaymentConfiguration(): Any? =
      unwrap(this).getCreatorPaymentConfiguration()

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   */
  public open fun creatorPaymentConfiguration(`value`: IResolvable) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   */
  public open fun creatorPaymentConfiguration(`value`: PaymentConfigurationProperty) {
    unwrap(this).setCreatorPaymentConfiguration(`value`.let(PaymentConfigurationProperty::unwrap))
  }

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dbd986315571017bbf59c18cf58744e0cdcf02966530c18e1fc388fa546a854")
  public open
      fun creatorPaymentConfiguration(`value`: PaymentConfigurationProperty.Builder.() -> Unit):
      Unit = creatorPaymentConfiguration(PaymentConfigurationProperty(`value`))

  /**
   * The settings for client-side encryption for cryptographic computing.
   */
  public open fun dataEncryptionMetadata(): Any? = unwrap(this).getDataEncryptionMetadata()

  /**
   * The settings for client-side encryption for cryptographic computing.
   */
  public open fun dataEncryptionMetadata(`value`: IResolvable) {
    unwrap(this).setDataEncryptionMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for client-side encryption for cryptographic computing.
   */
  public open fun dataEncryptionMetadata(`value`: DataEncryptionMetadataProperty) {
    unwrap(this).setDataEncryptionMetadata(`value`.let(DataEncryptionMetadataProperty::unwrap))
  }

  /**
   * The settings for client-side encryption for cryptographic computing.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea0367267c811fc409a655638f5bb787a5f4d6bbbb1fb8df5aa3540fe088f11")
  public open
      fun dataEncryptionMetadata(`value`: DataEncryptionMetadataProperty.Builder.() -> Unit): Unit =
      dataEncryptionMetadata(DataEncryptionMetadataProperty(`value`))

  /**
   * A description of the collaboration provided by the collaboration owner.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description of the collaboration provided by the collaboration owner.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A list of initial members, not including the creator.
   */
  public open fun members(): Any = unwrap(this).getMembers()

  /**
   * A list of initial members, not including the creator.
   */
  public open fun members(`value`: IResolvable) {
    unwrap(this).setMembers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of initial members, not including the creator.
   */
  public open fun members(`value`: List<Any>) {
    unwrap(this).setMembers(`value`)
  }

  /**
   * A list of initial members, not including the creator.
   */
  public open fun members(vararg `value`: Any): Unit = members(`value`.toList())

  /**
   * A human-readable identifier provided by the collaboration owner.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A human-readable identifier provided by the collaboration owner.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An indicator as to whether query logging has been enabled or disabled for the collaboration.
   */
  public open fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

  /**
   * An indicator as to whether query logging has been enabled or disabled for the collaboration.
   */
  public open fun queryLogStatus(`value`: String) {
    unwrap(this).setQueryLogStatus(`value`)
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnCollaboration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A display name of the collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatordisplayname)
     * @param creatorDisplayName A display name of the collaboration creator. 
     */
    public fun creatorDisplayName(creatorDisplayName: String)

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     */
    public fun creatorMemberAbilities(creatorMemberAbilities: List<String>)

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     */
    public fun creatorMemberAbilities(vararg creatorMemberAbilities: String)

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    public fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable)

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty)

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    public
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit)

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    public fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable)

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    public fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty)

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    public
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit)

    /**
     * A description of the collaboration provided by the collaboration owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-description)
     * @param description A description of the collaboration provided by the collaboration owner. 
     */
    public fun description(description: String)

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    public fun members(members: IResolvable)

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    public fun members(members: List<Any>)

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    public fun members(vararg members: Any)

    /**
     * A human-readable identifier provided by the collaboration owner.
     *
     * Display names are not unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-name)
     * @param name A human-readable identifier provided by the collaboration owner. 
     */
    public fun name(name: String)

    /**
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-querylogstatus)
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the collaboration. 
     */
    public fun queryLogStatus(queryLogStatus: String)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration.Builder.create(scope, id)

    /**
     * A display name of the collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatordisplayname)
     * @param creatorDisplayName A display name of the collaboration creator. 
     */
    override fun creatorDisplayName(creatorDisplayName: String) {
      cdkBuilder.creatorDisplayName(creatorDisplayName)
    }

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     */
    override fun creatorMemberAbilities(creatorMemberAbilities: List<String>) {
      cdkBuilder.creatorMemberAbilities(creatorMemberAbilities)
    }

    /**
     * The abilities granted to the collaboration creator.
     *
     * *Allowed values* `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatormemberabilities)
     * @param creatorMemberAbilities The abilities granted to the collaboration creator. 
     */
    override fun creatorMemberAbilities(vararg creatorMemberAbilities: String): Unit =
        creatorMemberAbilities(creatorMemberAbilities.toList())

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    override fun creatorPaymentConfiguration(creatorPaymentConfiguration: IResolvable) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty) {
      cdkBuilder.creatorPaymentConfiguration(creatorPaymentConfiguration.let(PaymentConfigurationProperty::unwrap))
    }

    /**
     * An object representing the collaboration member's payment responsibilities set by the
     * collaboration creator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-creatorpaymentconfiguration)
     * @param creatorPaymentConfiguration An object representing the collaboration member's payment
     * responsibilities set by the collaboration creator. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9881ba8f65accaca98fab8be01e5349ad5c421b1be9fd1c5b2df4e9aa4006398")
    override
        fun creatorPaymentConfiguration(creatorPaymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        creatorPaymentConfiguration(PaymentConfigurationProperty(creatorPaymentConfiguration))

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    override fun dataEncryptionMetadata(dataEncryptionMetadata: IResolvable) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(IResolvable::unwrap))
    }

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    override fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty) {
      cdkBuilder.dataEncryptionMetadata(dataEncryptionMetadata.let(DataEncryptionMetadataProperty::unwrap))
    }

    /**
     * The settings for client-side encryption for cryptographic computing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-dataencryptionmetadata)
     * @param dataEncryptionMetadata The settings for client-side encryption for cryptographic
     * computing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656599c92756a39c63decd3f4368484a397187171f0b4b32ea3e38ea82b5f7dd")
    override
        fun dataEncryptionMetadata(dataEncryptionMetadata: DataEncryptionMetadataProperty.Builder.() -> Unit):
        Unit = dataEncryptionMetadata(DataEncryptionMetadataProperty(dataEncryptionMetadata))

    /**
     * A description of the collaboration provided by the collaboration owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-description)
     * @param description A description of the collaboration provided by the collaboration owner. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable::unwrap))
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    override fun members(members: List<Any>) {
      cdkBuilder.members(members)
    }

    /**
     * A list of initial members, not including the creator.
     *
     * This list is immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-members)
     * @param members A list of initial members, not including the creator. 
     */
    override fun members(vararg members: Any): Unit = members(members.toList())

    /**
     * A human-readable identifier provided by the collaboration owner.
     *
     * Display names are not unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-name)
     * @param name A human-readable identifier provided by the collaboration owner. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An indicator as to whether query logging has been enabled or disabled for the collaboration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-querylogstatus)
     * @param queryLogStatus An indicator as to whether query logging has been enabled or disabled
     * for the collaboration. 
     */
    override fun queryLogStatus(queryLogStatus: String) {
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
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-collaboration.html#cfn-cleanrooms-collaboration-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnCollaboration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCollaboration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCollaboration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration):
        CfnCollaboration = CfnCollaboration(cdkObject)

    internal fun unwrap(wrapped: CfnCollaboration):
        software.amazon.awscdk.services.cleanrooms.CfnCollaboration = wrapped.cdkObject
  }

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
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
  public interface PaymentConfigurationProperty {
    /**
     * The collaboration member's payment responsibilities set by the collaboration creator for
     * query compute costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-paymentconfiguration.html#cfn-cleanrooms-collaboration-paymentconfiguration-querycompute)
     */
    public fun queryCompute(): Any

    /**
     * A builder for [PaymentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      public fun queryCompute(queryCompute: IResolvable)

      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty)

      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      public fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty.builder()

      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable::unwrap))
      }

      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      override fun queryCompute(queryCompute: QueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(QueryComputePaymentConfigProperty::unwrap))
      }

      /**
       * @param queryCompute The collaboration member's payment responsibilities set by the
       * collaboration creator for query compute costs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1619053f2bed07c05e5bf24c29eab5e69eae176b5c877da7734215b91901bed6")
      override fun queryCompute(queryCompute: QueryComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = queryCompute(QueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty,
    ) : CdkObject(cdkObject), PaymentConfigurationProperty {
      /**
       * The collaboration member's payment responsibilities set by the collaboration creator for
       * query compute costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-paymentconfiguration.html#cfn-cleanrooms-collaboration-paymentconfiguration-querycompute)
       */
      override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty):
          PaymentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PaymentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.PaymentConfigurationProperty
    }
  }

  /**
   * Basic metadata used to construct a new member.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
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
  public interface MemberSpecificationProperty {
    /**
     * The identifier used to reference members of the collaboration.
     *
     * Currently only supports AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-accountid)
     */
    public fun accountId(): String

    /**
     * The member's display name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-displayname)
     */
    public fun displayName(): String

    /**
     * The abilities granted to the collaboration member.
     *
     * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-memberabilities)
     */
    public fun memberAbilities(): List<String>

    /**
     * The collaboration member's payment responsibilities set by the collaboration creator.
     *
     * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
     * costs, then the member who can query is the default payer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-paymentconfiguration)
     */
    public fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

    /**
     * A builder for [MemberSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountId The identifier used to reference members of the collaboration. 
       * Currently only supports AWS account ID.
       */
      public fun accountId(accountId: String)

      /**
       * @param displayName The member's display name. 
       */
      public fun displayName(displayName: String)

      /**
       * @param memberAbilities The abilities granted to the collaboration member. 
       * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
       */
      public fun memberAbilities(memberAbilities: List<String>)

      /**
       * @param memberAbilities The abilities granted to the collaboration member. 
       * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
       */
      public fun memberAbilities(vararg memberAbilities: String)

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      public fun paymentConfiguration(paymentConfiguration: IResolvable)

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      public fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty)

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      public
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty.builder()

      /**
       * @param accountId The identifier used to reference members of the collaboration. 
       * Currently only supports AWS account ID.
       */
      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      /**
       * @param displayName The member's display name. 
       */
      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      /**
       * @param memberAbilities The abilities granted to the collaboration member. 
       * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
       */
      override fun memberAbilities(memberAbilities: List<String>) {
        cdkBuilder.memberAbilities(memberAbilities)
      }

      /**
       * @param memberAbilities The abilities granted to the collaboration member. 
       * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
       */
      override fun memberAbilities(vararg memberAbilities: String): Unit =
          memberAbilities(memberAbilities.toList())

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      override fun paymentConfiguration(paymentConfiguration: IResolvable) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      override fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty) {
        cdkBuilder.paymentConfiguration(paymentConfiguration.let(PaymentConfigurationProperty::unwrap))
      }

      /**
       * @param paymentConfiguration The collaboration member's payment responsibilities set by the
       * collaboration creator.
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d5a06511b955a4195335af93a8d0e1f041a053f94cec081565a6d60775ea448")
      override
          fun paymentConfiguration(paymentConfiguration: PaymentConfigurationProperty.Builder.() -> Unit):
          Unit = paymentConfiguration(PaymentConfigurationProperty(paymentConfiguration))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty,
    ) : CdkObject(cdkObject), MemberSpecificationProperty {
      /**
       * The identifier used to reference members of the collaboration.
       *
       * Currently only supports AWS account ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-accountid)
       */
      override fun accountId(): String = unwrap(this).getAccountId()

      /**
       * The member's display name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-displayname)
       */
      override fun displayName(): String = unwrap(this).getDisplayName()

      /**
       * The abilities granted to the collaboration member.
       *
       * *Allowed Values* : `CAN_QUERY` | `CAN_RECEIVE_RESULTS`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-memberabilities)
       */
      override fun memberAbilities(): List<String> = unwrap(this).getMemberAbilities()

      /**
       * The collaboration member's payment responsibilities set by the collaboration creator.
       *
       * If the collaboration creator hasn't speciﬁed anyone as the member paying for query compute
       * costs, then the member who can query is the default payer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-memberspecification.html#cfn-cleanrooms-collaboration-memberspecification-paymentconfiguration)
       */
      override fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty):
          MemberSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MemberSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberSpecificationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.MemberSpecificationProperty
    }
  }

  /**
   * An object representing the collaboration member's payment responsibilities set by the
   * collaboration creator for query compute costs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * QueryComputePaymentConfigProperty queryComputePaymentConfigProperty =
   * QueryComputePaymentConfigProperty.builder()
   * .isResponsible(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-querycomputepaymentconfig.html)
   */
  public interface QueryComputePaymentConfigProperty {
    /**
     * Indicates whether the collaboration creator has configured the collaboration member to pay
     * for query compute costs ( `TRUE` ) or has not configured the collaboration member to pay for
     * query compute costs ( `FALSE` ).
     *
     * Exactly one member can be configured to pay for query compute costs. An error is returned if
     * the collaboration creator sets a `TRUE` value for more than one member in the collaboration.
     *
     * If the collaboration creator hasn't specified anyone as the member paying for query compute
     * costs, then the member who can query is the default payer. An error is returned if the
     * collaboration creator sets a `FALSE` value for the member who can query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-querycomputepaymentconfig.html#cfn-cleanrooms-collaboration-querycomputepaymentconfig-isresponsible)
     */
    public fun isResponsible(): Any

    /**
     * A builder for [QueryComputePaymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isResponsible Indicates whether the collaboration creator has configured the
       * collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
       * collaboration member to pay for query compute costs ( `FALSE` ). 
       * Exactly one member can be configured to pay for query compute costs. An error is returned
       * if the collaboration creator sets a `TRUE` value for more than one member in the
       * collaboration.
       *
       * If the collaboration creator hasn't specified anyone as the member paying for query compute
       * costs, then the member who can query is the default payer. An error is returned if the
       * collaboration creator sets a `FALSE` value for the member who can query.
       */
      public fun isResponsible(isResponsible: Boolean)

      /**
       * @param isResponsible Indicates whether the collaboration creator has configured the
       * collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
       * collaboration member to pay for query compute costs ( `FALSE` ). 
       * Exactly one member can be configured to pay for query compute costs. An error is returned
       * if the collaboration creator sets a `TRUE` value for more than one member in the
       * collaboration.
       *
       * If the collaboration creator hasn't specified anyone as the member paying for query compute
       * costs, then the member who can query is the default payer. An error is returned if the
       * collaboration creator sets a `FALSE` value for the member who can query.
       */
      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty.builder()

      /**
       * @param isResponsible Indicates whether the collaboration creator has configured the
       * collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
       * collaboration member to pay for query compute costs ( `FALSE` ). 
       * Exactly one member can be configured to pay for query compute costs. An error is returned
       * if the collaboration creator sets a `TRUE` value for more than one member in the
       * collaboration.
       *
       * If the collaboration creator hasn't specified anyone as the member paying for query compute
       * costs, then the member who can query is the default payer. An error is returned if the
       * collaboration creator sets a `FALSE` value for the member who can query.
       */
      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      /**
       * @param isResponsible Indicates whether the collaboration creator has configured the
       * collaboration member to pay for query compute costs ( `TRUE` ) or has not configured the
       * collaboration member to pay for query compute costs ( `FALSE` ). 
       * Exactly one member can be configured to pay for query compute costs. An error is returned
       * if the collaboration creator sets a `TRUE` value for more than one member in the
       * collaboration.
       *
       * If the collaboration creator hasn't specified anyone as the member paying for query compute
       * costs, then the member who can query is the default payer. An error is returned if the
       * collaboration creator sets a `FALSE` value for the member who can query.
       */
      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty,
    ) : CdkObject(cdkObject), QueryComputePaymentConfigProperty {
      /**
       * Indicates whether the collaboration creator has configured the collaboration member to pay
       * for query compute costs ( `TRUE` ) or has not configured the collaboration member to pay for
       * query compute costs ( `FALSE` ).
       *
       * Exactly one member can be configured to pay for query compute costs. An error is returned
       * if the collaboration creator sets a `TRUE` value for more than one member in the
       * collaboration.
       *
       * If the collaboration creator hasn't specified anyone as the member paying for query compute
       * costs, then the member who can query is the default payer. An error is returned if the
       * collaboration creator sets a `FALSE` value for the member who can query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-querycomputepaymentconfig.html#cfn-cleanrooms-collaboration-querycomputepaymentconfig-isresponsible)
       */
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          QueryComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty):
          QueryComputePaymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryComputePaymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.QueryComputePaymentConfigProperty
    }
  }

  /**
   * The settings for client-side encryption for cryptographic computing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * DataEncryptionMetadataProperty dataEncryptionMetadataProperty =
   * DataEncryptionMetadataProperty.builder()
   * .allowCleartext(false)
   * .allowDuplicates(false)
   * .allowJoinsOnColumnsWithDifferentNames(false)
   * .preserveNulls(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html)
   */
  public interface DataEncryptionMetadataProperty {
    /**
     * Indicates whether encrypted tables can contain cleartext data ( `TRUE` ) or are to
     * cryptographically process every column ( `FALSE` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowcleartext)
     */
    public fun allowCleartext(): Any

    /**
     * Indicates whether Fingerprint columns can contain duplicate entries ( `TRUE` ) or are to
     * contain only non-repeated values ( `FALSE` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowduplicates)
     */
    public fun allowDuplicates(): Any

    /**
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a
     * different name ( `TRUE` ) or can only be joined on Fingerprint columns of the same name (
     * `FALSE` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowjoinsoncolumnswithdifferentnames)
     */
    public fun allowJoinsOnColumnsWithDifferentNames(): Any

    /**
     * Indicates whether NULL values are to be copied as NULL to encrypted tables ( `TRUE` ) or
     * cryptographically processed ( `FALSE` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-preservenulls)
     */
    public fun preserveNulls(): Any

    /**
     * A builder for [DataEncryptionMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCleartext Indicates whether encrypted tables can contain cleartext data (
       * `TRUE` ) or are to cryptographically process every column ( `FALSE` ). 
       */
      public fun allowCleartext(allowCleartext: Boolean)

      /**
       * @param allowCleartext Indicates whether encrypted tables can contain cleartext data (
       * `TRUE` ) or are to cryptographically process every column ( `FALSE` ). 
       */
      public fun allowCleartext(allowCleartext: IResolvable)

      /**
       * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries
       * ( `TRUE` ) or are to contain only non-repeated values ( `FALSE` ). 
       */
      public fun allowDuplicates(allowDuplicates: Boolean)

      /**
       * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries
       * ( `TRUE` ) or are to contain only non-repeated values ( `FALSE` ). 
       */
      public fun allowDuplicates(allowDuplicates: IResolvable)

      /**
       * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
       * joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be joined
       * on Fingerprint columns of the same name ( `FALSE` ). 
       */
      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean)

      /**
       * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
       * joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be joined
       * on Fingerprint columns of the same name ( `FALSE` ). 
       */
      public
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable)

      /**
       * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
       * tables ( `TRUE` ) or cryptographically processed ( `FALSE` ). 
       */
      public fun preserveNulls(preserveNulls: Boolean)

      /**
       * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
       * tables ( `TRUE` ) or cryptographically processed ( `FALSE` ). 
       */
      public fun preserveNulls(preserveNulls: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty.builder()

      /**
       * @param allowCleartext Indicates whether encrypted tables can contain cleartext data (
       * `TRUE` ) or are to cryptographically process every column ( `FALSE` ). 
       */
      override fun allowCleartext(allowCleartext: Boolean) {
        cdkBuilder.allowCleartext(allowCleartext)
      }

      /**
       * @param allowCleartext Indicates whether encrypted tables can contain cleartext data (
       * `TRUE` ) or are to cryptographically process every column ( `FALSE` ). 
       */
      override fun allowCleartext(allowCleartext: IResolvable) {
        cdkBuilder.allowCleartext(allowCleartext.let(IResolvable::unwrap))
      }

      /**
       * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries
       * ( `TRUE` ) or are to contain only non-repeated values ( `FALSE` ). 
       */
      override fun allowDuplicates(allowDuplicates: Boolean) {
        cdkBuilder.allowDuplicates(allowDuplicates)
      }

      /**
       * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries
       * ( `TRUE` ) or are to contain only non-repeated values ( `FALSE` ). 
       */
      override fun allowDuplicates(allowDuplicates: IResolvable) {
        cdkBuilder.allowDuplicates(allowDuplicates.let(IResolvable::unwrap))
      }

      /**
       * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
       * joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be joined
       * on Fingerprint columns of the same name ( `FALSE` ). 
       */
      override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: Boolean) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames)
      }

      /**
       * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
       * joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be joined
       * on Fingerprint columns of the same name ( `FALSE` ). 
       */
      override
          fun allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames: IResolvable) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames.let(IResolvable::unwrap))
      }

      /**
       * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
       * tables ( `TRUE` ) or cryptographically processed ( `FALSE` ). 
       */
      override fun preserveNulls(preserveNulls: Boolean) {
        cdkBuilder.preserveNulls(preserveNulls)
      }

      /**
       * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
       * tables ( `TRUE` ) or cryptographically processed ( `FALSE` ). 
       */
      override fun preserveNulls(preserveNulls: IResolvable) {
        cdkBuilder.preserveNulls(preserveNulls.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty,
    ) : CdkObject(cdkObject), DataEncryptionMetadataProperty {
      /**
       * Indicates whether encrypted tables can contain cleartext data ( `TRUE` ) or are to
       * cryptographically process every column ( `FALSE` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowcleartext)
       */
      override fun allowCleartext(): Any = unwrap(this).getAllowCleartext()

      /**
       * Indicates whether Fingerprint columns can contain duplicate entries ( `TRUE` ) or are to
       * contain only non-repeated values ( `FALSE` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowduplicates)
       */
      override fun allowDuplicates(): Any = unwrap(this).getAllowDuplicates()

      /**
       * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a
       * different name ( `TRUE` ) or can only be joined on Fingerprint columns of the same name (
       * `FALSE` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-allowjoinsoncolumnswithdifferentnames)
       */
      override fun allowJoinsOnColumnsWithDifferentNames(): Any =
          unwrap(this).getAllowJoinsOnColumnsWithDifferentNames()

      /**
       * Indicates whether NULL values are to be copied as NULL to encrypted tables ( `TRUE` ) or
       * cryptographically processed ( `FALSE` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html#cfn-cleanrooms-collaboration-dataencryptionmetadata-preservenulls)
       */
      override fun preserveNulls(): Any = unwrap(this).getPreserveNulls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataEncryptionMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty):
          DataEncryptionMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataEncryptionMetadataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataEncryptionMetadataProperty):
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnCollaboration.DataEncryptionMetadataProperty
    }
  }
}
