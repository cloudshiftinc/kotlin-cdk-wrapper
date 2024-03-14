package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The `As2Id` is the *AS2-name* , as defined in the [RFC
   * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
   * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For outbound
   * connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using the
   * `StartFileTransfer` API operation. This ID cannot include spaces.
   */
  public open fun as2Id(): String = unwrap(this).getAs2Id()

  /**
   * The `As2Id` is the *AS2-name* , as defined in the [RFC
   * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
   * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For outbound
   * connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using the
   * `StartFileTransfer` API operation. This ID cannot include spaces.
   */
  public open fun as2Id(`value`: String) {
    unwrap(this).setAs2Id(`value`)
  }

  /**
   * The Amazon Resource Name associated with the profile, in the form
   * `arn:aws:transfer:region:account-id:profile/profile-id/` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier for the AS2 profile, returned after the API call succeeds.
   */
  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  /**
   * An array of identifiers for the imported certificates.
   */
  public open fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

  /**
   * An array of identifiers for the imported certificates.
   */
  public open fun certificateIds(`value`: List<String>) {
    unwrap(this).setCertificateIds(`value`)
  }

  /**
   * An array of identifiers for the imported certificates.
   */
  public open fun certificateIds(vararg `value`: String): Unit = certificateIds(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
   */
  public open fun profileType(): String = unwrap(this).getProfileType()

  /**
   * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
   */
  public open fun profileType(`value`: String) {
    unwrap(this).setProfileType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for profiles.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for profiles.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for profiles.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-as2id)
     * @param as2Id The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces. 
     */
    public fun as2Id(as2Id: String)

    /**
     * An array of identifiers for the imported certificates.
     *
     * You use this identifier for working with profiles and partner profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
     * @param certificateIds An array of identifiers for the imported certificates. 
     */
    public fun certificateIds(certificateIds: List<String>)

    /**
     * An array of identifiers for the imported certificates.
     *
     * You use this identifier for working with profiles and partner profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
     * @param certificateIds An array of identifiers for the imported certificates. 
     */
    public fun certificateIds(vararg certificateIds: String)

    /**
     * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
     *
     * If not supplied in the request, the command lists all types of profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-profiletype)
     * @param profileType Indicates whether to list only `LOCAL` type profiles or only `PARTNER`
     * type profiles. 
     */
    public fun profileType(profileType: String)

    /**
     * Key-value pairs that can be used to group and search for profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
     * @param tags Key-value pairs that can be used to group and search for profiles. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
     * @param tags Key-value pairs that can be used to group and search for profiles. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnProfile.Builder =
        software.amazon.awscdk.services.transfer.CfnProfile.Builder.create(scope, id)

    /**
     * The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-as2id)
     * @param as2Id The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces. 
     */
    override fun as2Id(as2Id: String) {
      cdkBuilder.as2Id(as2Id)
    }

    /**
     * An array of identifiers for the imported certificates.
     *
     * You use this identifier for working with profiles and partner profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
     * @param certificateIds An array of identifiers for the imported certificates. 
     */
    override fun certificateIds(certificateIds: List<String>) {
      cdkBuilder.certificateIds(certificateIds)
    }

    /**
     * An array of identifiers for the imported certificates.
     *
     * You use this identifier for working with profiles and partner profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
     * @param certificateIds An array of identifiers for the imported certificates. 
     */
    override fun certificateIds(vararg certificateIds: String): Unit =
        certificateIds(certificateIds.toList())

    /**
     * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
     *
     * If not supplied in the request, the command lists all types of profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-profiletype)
     * @param profileType Indicates whether to list only `LOCAL` type profiles or only `PARTNER`
     * type profiles. 
     */
    override fun profileType(profileType: String) {
      cdkBuilder.profileType(profileType)
    }

    /**
     * Key-value pairs that can be used to group and search for profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
     * @param tags Key-value pairs that can be used to group and search for profiles. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
     * @param tags Key-value pairs that can be used to group and search for profiles. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnProfile): CfnProfile =
        CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile): software.amazon.awscdk.services.transfer.CfnProfile =
        wrapped.cdkObject
  }
}
