@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
 * .as2Id("as2Id")
 * .profileType("profileType")
 * // the properties below are optional
 * .certificateIds(List.of("certificateIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html)
 */
public interface CfnProfileProps {
  /**
   * The `As2Id` is the *AS2-name* , as defined in the [RFC
   * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
   * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For outbound
   * connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using the
   * `StartFileTransfer` API operation. This ID cannot include spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-as2id)
   */
  public fun as2Id(): String

  /**
   * An array of identifiers for the imported certificates.
   *
   * You use this identifier for working with profiles and partner profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
   */
  public fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

  /**
   * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
   *
   * If not supplied in the request, the command lists all types of profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-profiletype)
   */
  public fun profileType(): String

  /**
   * Key-value pairs that can be used to group and search for profiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param as2Id The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces. 
     */
    public fun as2Id(as2Id: String)

    /**
     * @param certificateIds An array of identifiers for the imported certificates.
     * You use this identifier for working with profiles and partner profiles.
     */
    public fun certificateIds(certificateIds: List<String>)

    /**
     * @param certificateIds An array of identifiers for the imported certificates.
     * You use this identifier for working with profiles and partner profiles.
     */
    public fun certificateIds(vararg certificateIds: String)

    /**
     * @param profileType Indicates whether to list only `LOCAL` type profiles or only `PARTNER`
     * type profiles. 
     * If not supplied in the request, the command lists all types of profiles.
     */
    public fun profileType(profileType: String)

    /**
     * @param tags Key-value pairs that can be used to group and search for profiles.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for profiles.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnProfileProps.Builder =
        software.amazon.awscdk.services.transfer.CfnProfileProps.builder()

    /**
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
     * @param certificateIds An array of identifiers for the imported certificates.
     * You use this identifier for working with profiles and partner profiles.
     */
    override fun certificateIds(certificateIds: List<String>) {
      cdkBuilder.certificateIds(certificateIds)
    }

    /**
     * @param certificateIds An array of identifiers for the imported certificates.
     * You use this identifier for working with profiles and partner profiles.
     */
    override fun certificateIds(vararg certificateIds: String): Unit =
        certificateIds(certificateIds.toList())

    /**
     * @param profileType Indicates whether to list only `LOCAL` type profiles or only `PARTNER`
     * type profiles. 
     * If not supplied in the request, the command lists all types of profiles.
     */
    override fun profileType(profileType: String) {
      cdkBuilder.profileType(profileType)
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for profiles.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for profiles.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    /**
     * The `As2Id` is the *AS2-name* , as defined in the [RFC
     * 4130](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc4130) . For inbound
     * transfers, this is the `AS2-From` header for the AS2 messages sent from the partner. For
     * outbound connectors, this is the `AS2-To` header for the AS2 messages sent to the partner using
     * the `StartFileTransfer` API operation. This ID cannot include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-as2id)
     */
    override fun as2Id(): String = unwrap(this).getAs2Id()

    /**
     * An array of identifiers for the imported certificates.
     *
     * You use this identifier for working with profiles and partner profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-certificateids)
     */
    override fun certificateIds(): List<String> = unwrap(this).getCertificateIds() ?: emptyList()

    /**
     * Indicates whether to list only `LOCAL` type profiles or only `PARTNER` type profiles.
     *
     * If not supplied in the request, the command lists all types of profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-profiletype)
     */
    override fun profileType(): String = unwrap(this).getProfileType()

    /**
     * Key-value pairs that can be used to group and search for profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-profile.html#cfn-transfer-profile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnProfileProps):
        CfnProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.transfer.CfnProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnProfileProps
  }
}
