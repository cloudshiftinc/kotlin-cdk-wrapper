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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html.
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
public open class CfnStudio(
  cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioProps,
  ) :
      this(software.amazon.awscdk.services.nimblestudio.CfnStudio(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStudioProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStudioProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStudioProps(props)
  )

  /**
   * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>.
   */
  public open fun adminRoleArn(): String = unwrap(this).getAdminRoleArn()

  /**
   * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>.
   */
  public open fun adminRoleArn(`value`: String) {
    unwrap(this).setAdminRoleArn(`value`)
  }

  /**
   * The Amazon Web Services Region where the studio resource is located.</p>.
   */
  public open fun attrHomeRegion(): String = unwrap(this).getAttrHomeRegion()

  /**
   * The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services
   * SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.</p>.
   */
  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  /**
   *
   */
  public open fun attrStudioId(): String = unwrap(this).getAttrStudioId()

  /**
   * The address of the web page for the studio.</p>.
   */
  public open fun attrStudioUrl(): String = unwrap(this).getAttrStudioUrl()

  /**
   * A friendly name for the studio.</p>.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * A friendly name for the studio.</p>.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Configuration of the encryption method that is used for the studio.</p>.
   */
  public open fun studioEncryptionConfiguration(): Any? =
      unwrap(this).getStudioEncryptionConfiguration()

  /**
   * Configuration of the encryption method that is used for the studio.</p>.
   */
  public open fun studioEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration of the encryption method that is used for the studio.</p>.
   */
  public open fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(StudioEncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration of the encryption method that is used for the studio.</p>.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcbcad26b4f26f6724978b3351a27a58963a1c98c1b0d99212bf363d8962cbcf")
  public open
      fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(`value`))

  /**
   * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble
   * Studio users.</p>.
   */
  public open fun studioName(): String = unwrap(this).getStudioName()

  /**
   * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble
   * Studio users.</p>.
   */
  public open fun studioName(`value`: String) {
    unwrap(this).setStudioName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>.
   */
  public open fun userRoleArn(): String = unwrap(this).getUserRoleArn()

  /**
   * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>.
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
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
     * @param adminRoleArn The IAM role that Studio Admins will assume when logging in to the Nimble
     * Studio portal.</p>. 
     */
    public fun adminRoleArn(adminRoleArn: String)

    /**
     * A friendly name for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
     * @param displayName A friendly name for the studio.</p>. 
     */
    public fun displayName(displayName: String)

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable)

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty)

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble
     * Studio users.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
     * @param studioName The studio name that is used in the URL of the Nimble Studio portal when
     * accessed by Nimble Studio users.</p>. 
     */
    public fun studioName(studioName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
     * @param userRoleArn The IAM role that Studio Users will assume when logging in to the Nimble
     * Studio portal.</p>. 
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
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
     * @param adminRoleArn The IAM role that Studio Admins will assume when logging in to the Nimble
     * Studio portal.</p>. 
     */
    override fun adminRoleArn(adminRoleArn: String) {
      cdkBuilder.adminRoleArn(adminRoleArn)
    }

    /**
     * A friendly name for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
     * @param displayName A friendly name for the studio.</p>. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    override fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(StudioEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration of the encryption method that is used for the studio.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.</p>. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(studioEncryptionConfiguration))

    /**
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble
     * Studio users.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
     * @param studioName The studio name that is used in the URL of the Nimble Studio portal when
     * accessed by Nimble Studio users.</p>. 
     */
    override fun studioName(studioName: String) {
      cdkBuilder.studioName(studioName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
     * @param userRoleArn The IAM role that Studio Users will assume when logging in to the Nimble
     * Studio portal.</p>. 
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
        = wrapped.cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudio
  }

  /**
   * Configuration of the encryption method that is used for the studio.</p>.
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
     * The ARN for a KMS key that is used to encrypt studio data.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The type of KMS key that is used to encrypt studio data.</p>.
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
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.</p>.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data.</p>. 
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.builder()

      /**
       * @param keyArn The ARN for a KMS key that is used to encrypt studio data.</p>.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param keyType The type of KMS key that is used to encrypt studio data.</p>. 
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        StudioEncryptionConfigurationProperty {
      /**
       * The ARN for a KMS key that is used to encrypt studio data.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html#cfn-nimblestudio-studio-studioencryptionconfiguration-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The type of KMS key that is used to encrypt studio data.</p>.
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
          StudioEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StudioEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
    }
  }
}
