@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a signing profile.
 *
 * A signing profile is a code-signing template that can be used to carry out a pre-defined signing
 * job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.signer.*;
 * CfnSigningProfile cfnSigningProfile = CfnSigningProfile.Builder.create(this,
 * "MyCfnSigningProfile")
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
public open class CfnSigningProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the signing profile created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the signing profile created.
   */
  public open fun attrProfileName(): String = unwrap(this).getAttrProfileName()

  /**
   * The version of the signing profile created.
   */
  public open fun attrProfileVersion(): String = unwrap(this).getAttrProfileVersion()

  /**
   * The signing profile ARN, including the profile version.
   */
  public open fun attrProfileVersionArn(): String = unwrap(this).getAttrProfileVersionArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of a platform that is available for use by a signing profile.
   */
  public open fun platformId(): String = unwrap(this).getPlatformId()

  /**
   * The ID of a platform that is available for use by a signing profile.
   */
  public open fun platformId(`value`: String) {
    unwrap(this).setPlatformId(`value`)
  }

  /**
   * The validity period override for any signature generated using this signing profile.
   */
  public open fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

  /**
   * The validity period override for any signature generated using this signing profile.
   */
  public open fun signatureValidityPeriod(`value`: IResolvable) {
    unwrap(this).setSignatureValidityPeriod(`value`.let(IResolvable::unwrap))
  }

  /**
   * The validity period override for any signature generated using this signing profile.
   */
  public open fun signatureValidityPeriod(`value`: SignatureValidityPeriodProperty) {
    unwrap(this).setSignatureValidityPeriod(`value`.let(SignatureValidityPeriodProperty::unwrap))
  }

  /**
   * The validity period override for any signature generated using this signing profile.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("30dfd32a0fc87344ddf1d8406dc8817aaf4356cac7ded8734697eb18258b5eff")
  public open
      fun signatureValidityPeriod(`value`: SignatureValidityPeriodProperty.Builder.() -> Unit): Unit
      = signatureValidityPeriod(SignatureValidityPeriodProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags associated with the signing profile.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags associated with the signing profile.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags associated with the signing profile.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.signer.CfnSigningProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of a platform that is available for use by a signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
     * @param platformId The ID of a platform that is available for use by a signing profile. 
     */
    public fun platformId(platformId: String)

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable)

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    public fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty)

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("217bf12acd10a17e8fca01118986e25b33b7d553a303676eb001019a69f8b954")
    public
        fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty.Builder.() -> Unit)

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     * @param tags A list of tags associated with the signing profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     * @param tags A list of tags associated with the signing profile. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnSigningProfile.Builder =
        software.amazon.awscdk.services.signer.CfnSigningProfile.Builder.create(scope, id)

    /**
     * The ID of a platform that is available for use by a signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
     * @param platformId The ID of a platform that is available for use by a signing profile. 
     */
    override fun platformId(platformId: String) {
      cdkBuilder.platformId(platformId)
    }

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    override fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(IResolvable::unwrap))
    }

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    override fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(SignatureValidityPeriodProperty::unwrap))
    }

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     * @param signatureValidityPeriod The validity period override for any signature generated using
     * this signing profile. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("217bf12acd10a17e8fca01118986e25b33b7d553a303676eb001019a69f8b954")
    override
        fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty.Builder.() -> Unit):
        Unit = signatureValidityPeriod(SignatureValidityPeriodProperty(signatureValidityPeriod))

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     * @param tags A list of tags associated with the signing profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     * @param tags A list of tags associated with the signing profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.signer.CfnSigningProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.signer.CfnSigningProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSigningProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSigningProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile):
        CfnSigningProfile = CfnSigningProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSigningProfile):
        software.amazon.awscdk.services.signer.CfnSigningProfile = wrapped.cdkObject
  }

  /**
   * The validity period for the signing job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.signer.*;
   * SignatureValidityPeriodProperty signatureValidityPeriodProperty =
   * SignatureValidityPeriodProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html)
   */
  public interface SignatureValidityPeriodProperty {
    /**
     * The time unit for signature validity: DAYS | MONTHS | YEARS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html#cfn-signer-signingprofile-signaturevalidityperiod-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The numerical value of the time unit for signature validity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html#cfn-signer-signingprofile-signaturevalidityperiod-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [SignatureValidityPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The time unit for signature validity: DAYS | MONTHS | YEARS.
       */
      public fun type(type: String)

      /**
       * @param value The numerical value of the time unit for signature validity.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty.Builder
          =
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty.builder()

      /**
       * @param type The time unit for signature validity: DAYS | MONTHS | YEARS.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The numerical value of the time unit for signature validity.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty,
    ) : CdkObject(cdkObject), SignatureValidityPeriodProperty {
      /**
       * The time unit for signature validity: DAYS | MONTHS | YEARS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html#cfn-signer-signingprofile-signaturevalidityperiod-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The numerical value of the time unit for signature validity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html#cfn-signer-signingprofile-signaturevalidityperiod-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SignatureValidityPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty):
          SignatureValidityPeriodProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SignatureValidityPeriodProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignatureValidityPeriodProperty):
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty
    }
  }
}
