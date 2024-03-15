@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSigningProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.signer.*;
 * CfnSigningProfileProps cfnSigningProfileProps = CfnSigningProfileProps.builder()
 * .platformId("platformId")
 * // the properties below are optional
 * .signatureValidityPeriod(SignatureValidityPeriodProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html)
 */
public interface CfnSigningProfileProps {
  /**
   * The ID of a platform that is available for use by a signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
   */
  public fun platformId(): String

  /**
   * The validity period override for any signature generated using this signing profile.
   *
   * If unspecified, the default is 135 months.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
   */
  public fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

  /**
   * A list of tags associated with the signing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSigningProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param platformId The ID of a platform that is available for use by a signing profile. 
     */
    public fun platformId(platformId: String)

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable)

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    public
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty)

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04fd5c1330d5fc95523eacd0c7d05a88d15f20cb83f51757c828e0bed179c773")
    public
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit)

    /**
     * @param tags A list of tags associated with the signing profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags associated with the signing profile.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnSigningProfileProps.Builder =
        software.amazon.awscdk.services.signer.CfnSigningProfileProps.builder()

    /**
     * @param platformId The ID of a platform that is available for use by a signing profile. 
     */
    override fun platformId(platformId: String) {
      cdkBuilder.platformId(platformId)
    }

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    override fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(IResolvable::unwrap))
    }

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    override
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(CfnSigningProfile.SignatureValidityPeriodProperty::unwrap))
    }

    /**
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile.
     * If unspecified, the default is 135 months.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04fd5c1330d5fc95523eacd0c7d05a88d15f20cb83f51757c828e0bed179c773")
    override
        fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty.Builder.() -> Unit):
        Unit =
        signatureValidityPeriod(CfnSigningProfile.SignatureValidityPeriodProperty(signatureValidityPeriod))

    /**
     * @param tags A list of tags associated with the signing profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags associated with the signing profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.signer.CfnSigningProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfileProps,
  ) : CdkObject(cdkObject), CfnSigningProfileProps {
    /**
     * The ID of a platform that is available for use by a signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
     */
    override fun platformId(): String = unwrap(this).getPlatformId()

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     */
    override fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSigningProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfileProps):
        CfnSigningProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSigningProfileProps):
        software.amazon.awscdk.services.signer.CfnSigningProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.CfnSigningProfileProps
  }
}
