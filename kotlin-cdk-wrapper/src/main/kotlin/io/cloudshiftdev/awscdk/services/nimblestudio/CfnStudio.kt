@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::NimbleStudio::Studio` resource creates a new studio resource. In  , all other resources
 * are contained in a studio.
 *
 * When creating a studio, two IAM roles must be provided: the admin role and the user role. These
 * roles are assumed by your users when they log in to the  portal. The user role must have the
 * AmazonNimbleStudio-StudioUser managed policy attached for the portal to function properly. The Admin
 * Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function
 * properly.
 *
 * You can optionally specify an AWS Key Management Service key in the
 * StudioEncryptionConfiguration. In Nimble Studio, resource names, descriptions, initialization
 * scripts, and other data you provide are always encrypted at rest using an AWS Key Management Service
 * key. By default, this key is owned by AWS and managed on your behalf. You may provide your own AWS
 * Key Management Service key when calling CreateStudio to encrypt this data using a key that you own
 * and manage. When providing an AWS Key Management Service key during studio creation,  creates AWS
 * Key Management Service grants in your account to provide your studio user and admin roles access to
 * these AWS Key Management Service keys. If you delete this grant, the studio will no longer be
 * accessible to your portal users. If you delete the studio AWS Key Management Service key, your
 * studio will no longer be accessible.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnStudio cfnStudio = CfnStudio.Builder.create(this, "MyCfnStudio")
 * .adminRoleArn("adminRoleArn")
 * .displayName("displayName")
 * .studioName("studioName")
 * .userRoleArn("userRoleArn")
 * // the properties below are optional
 * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
 */
public open class CfnStudio internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
   */
  public open fun adminRoleArn(): String = unwrap(this).getAdminRoleArn()

  /**
   * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
   */
  public open fun adminRoleArn(`value`: String) {
    unwrap(this).setAdminRoleArn(`value`)
  }

  /**
   * The AWS Region where the studio resource is located.
   *
   * For example, `us-west-2` .
   */
  public open fun attrHomeRegion(): String = unwrap(this).getAttrHomeRegion()

  /**
   * The IAM Identity Center application client ID that is used to integrate with IAM Identity
   * Center , which enables IAM Identity Center users to log into the  portal.
   */
  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  /**
   * The unique identifier for the studio resource.
   */
  public open fun attrStudioId(): String = unwrap(this).getAttrStudioId()

  /**
   * The unique identifier for the studio resource.
   */
  public open fun attrStudioUrl(): String = unwrap(this).getAttrStudioUrl()

  /**
   * A friendly name for the studio.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * A friendly name for the studio.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * Configuration of the encryption method that is used for the studio.
   */
  public open fun studioEncryptionConfiguration(): Any? =
      unwrap(this).getStudioEncryptionConfiguration()

  /**
   * Configuration of the encryption method that is used for the studio.
   */
  public open fun studioEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration of the encryption method that is used for the studio.
   */
  public open fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(StudioEncryptionConfigurationProperty::unwrap))
  }

  /**
   * Configuration of the encryption method that is used for the studio.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcbcad26b4f26f6724978b3351a27a58963a1c98c1b0d99212bf363d8962cbcf")
  public open
      fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(`value`))

  /**
   * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
   */
  public open fun studioName(): String = unwrap(this).getStudioName()

  /**
   * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
   */
  public open fun studioName(`value`: String) {
    unwrap(this).setStudioName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The IAM role that studio users assume when logging in to the Nimble Studio portal.
   */
  public open fun userRoleArn(): String = unwrap(this).getUserRoleArn()

  /**
   * The IAM role that studio users assume when logging in to the Nimble Studio portal.
   */
  public open fun userRoleArn(`value`: String) {
    unwrap(this).setUserRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.nimblestudio.CfnStudio].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
     * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble
     * Studio portal. 
     */
    public fun adminRoleArn(adminRoleArn: String)

    /**
     * A friendly name for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
     * @param displayName A friendly name for the studio. 
     */
    public fun displayName(displayName: String)

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable)

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty)

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
     * @param studioName The name of the studio, as included in the URL when accessing it in the
     * Nimble Studio portal. 
     */
    public fun studioName(studioName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
     * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
     * portal. 
     */
    public fun userRoleArn(userRoleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudio.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudio.Builder.create(scope, id)

    /**
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
     * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble
     * Studio portal. 
     */
    override fun adminRoleArn(adminRoleArn: String) {
      cdkBuilder.adminRoleArn(adminRoleArn)
    }

    /**
     * A friendly name for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
     * @param displayName A friendly name for the studio. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    override fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(StudioEncryptionConfigurationProperty::unwrap))
    }

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(studioEncryptionConfiguration))

    /**
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
     * @param studioName The name of the studio, as included in the URL when accessing it in the
     * Nimble Studio portal. 
     */
    override fun studioName(studioName: String) {
      cdkBuilder.studioName(studioName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
     * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
     * portal. 
     */
    override fun userRoleArn(userRoleArn: String) {
      cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudio = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnStudio.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudio {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudio(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio): CfnStudio
        = CfnStudio(cdkObject)

    internal fun unwrap(wrapped: CfnStudio): software.amazon.awscdk.services.nimblestudio.CfnStudio
        = wrapped.cdkObject
  }

  /**
   * Configuration of the encryption method that is used for the studio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StudioEncryptionConfigurationProperty studioEncryptionConfigurationProperty =
   * StudioEncryptionConfigurationProperty.builder()
   * .keyType("keyType")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html)
   */
  public interface StudioEncryptionConfigurationProperty {
    /**
     * The ARN for a KMS key that is used to encrypt studio data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The type of KMS key that is used to encrypt studio data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [StudioEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data. 
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.builder()

      /**
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data. 
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), StudioEncryptionConfigurationProperty {
      /**
       * The ARN for a KMS key that is used to encrypt studio data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The type of KMS key that is used to encrypt studio data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keytype)
       */
      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty):
          StudioEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
    }
  }
}
