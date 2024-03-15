@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource creates an app block.
 *
 * App blocks store details about the virtual hard disk that contains the files for the application
 * in an S3 bucket. It also stores the setup script with details about how to mount the virtual hard
 * disk. App blocks are only supported for Elastic fleets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnAppBlock cfnAppBlock = CfnAppBlock.Builder.create(this, "MyCfnAppBlock")
 * .name("name")
 * .sourceS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .displayName("displayName")
 * .packagingType("packagingType")
 * .postSetupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .setupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
 */
public open class CfnAppBlock internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the app block.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time when the app block was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The description of the app block.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the app block.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the app block.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the app block.
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
   * The name of the app block.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the app block.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The packaging type of the app block.
   */
  public open fun packagingType(): String? = unwrap(this).getPackagingType()

  /**
   * The packaging type of the app block.
   */
  public open fun packagingType(`value`: String) {
    unwrap(this).setPackagingType(`value`)
  }

  /**
   * The post setup script details of the app block.
   */
  public open fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

  /**
   * The post setup script details of the app block.
   */
  public open fun postSetupScriptDetails(`value`: IResolvable) {
    unwrap(this).setPostSetupScriptDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The post setup script details of the app block.
   */
  public open fun postSetupScriptDetails(`value`: ScriptDetailsProperty) {
    unwrap(this).setPostSetupScriptDetails(`value`.let(ScriptDetailsProperty::unwrap))
  }

  /**
   * The post setup script details of the app block.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64a79332a90ee99f1012a568aa5ddfeaf52a7319753cedede01466c36eeff787")
  public open fun postSetupScriptDetails(`value`: ScriptDetailsProperty.Builder.() -> Unit): Unit =
      postSetupScriptDetails(ScriptDetailsProperty(`value`))

  /**
   * The setup script details of the app block.
   */
  public open fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

  /**
   * The setup script details of the app block.
   */
  public open fun setupScriptDetails(`value`: IResolvable) {
    unwrap(this).setSetupScriptDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The setup script details of the app block.
   */
  public open fun setupScriptDetails(`value`: ScriptDetailsProperty) {
    unwrap(this).setSetupScriptDetails(`value`.let(ScriptDetailsProperty::unwrap))
  }

  /**
   * The setup script details of the app block.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4312b6f2e56c4725b8a59b738054eca29c85d2cc138c83e12357a20d6814fa8")
  public open fun setupScriptDetails(`value`: ScriptDetailsProperty.Builder.() -> Unit): Unit =
      setupScriptDetails(ScriptDetailsProperty(`value`))

  /**
   * The source S3 location of the app block.
   */
  public open fun sourceS3Location(): Any = unwrap(this).getSourceS3Location()

  /**
   * The source S3 location of the app block.
   */
  public open fun sourceS3Location(`value`: IResolvable) {
    unwrap(this).setSourceS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source S3 location of the app block.
   */
  public open fun sourceS3Location(`value`: S3LocationProperty) {
    unwrap(this).setSourceS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   * The source S3 location of the app block.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07d132ccb2c4b41af14ffd0c4e69b4877c7881541f9a69bb10c8d4f5f0607bdc")
  public open fun sourceS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      sourceS3Location(S3LocationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the app block.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags of the app block.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags of the app block.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnAppBlock].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-description)
     * @param description The description of the app block. 
     */
    public fun description(description: String)

    /**
     * The display name of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-displayname)
     * @param displayName The display name of the app block. 
     */
    public fun displayName(displayName: String)

    /**
     * The name of the app block.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-name)
     * @param name The name of the app block. 
     */
    public fun name(name: String)

    /**
     * The packaging type of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-packagingtype)
     * @param packagingType The packaging type of the app block. 
     */
    public fun packagingType(packagingType: String)

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable)

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty)

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0261eb80ac8d55b73ee29b146ce1d646eb5819f177742e5c2f23ed9bbe524184")
    public
        fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit)

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    public fun sourceS3Location(sourceS3Location: IResolvable)

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    public fun sourceS3Location(sourceS3Location: S3LocationProperty)

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("060d0dd50b3f7cd7d93df0c357873251449b8988d54269f8c6cce069f5039165")
    public fun sourceS3Location(sourceS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     * @param tags The tags of the app block. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     * @param tags The tags of the app block. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    public fun upScriptDetails(setupScriptDetails: IResolvable)

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    public fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty)

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7acea0a2b75f58dc64d95ddd807c88fa359b8dae5432710bdd03baec04bf7e4")
    public fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlock.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlock.Builder.create(scope, id)

    /**
     * The description of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-description)
     * @param description The description of the app block. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-displayname)
     * @param displayName The display name of the app block. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the app block.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-name)
     * @param name The name of the app block. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The packaging type of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-packagingtype)
     * @param packagingType The packaging type of the app block. 
     */
    override fun packagingType(packagingType: String) {
      cdkBuilder.packagingType(packagingType)
    }

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    override fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(IResolvable::unwrap))
    }

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    override fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(ScriptDetailsProperty::unwrap))
    }

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     * @param postSetupScriptDetails The post setup script details of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0261eb80ac8d55b73ee29b146ce1d646eb5819f177742e5c2f23ed9bbe524184")
    override
        fun postSetupScriptDetails(postSetupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit):
        Unit = postSetupScriptDetails(ScriptDetailsProperty(postSetupScriptDetails))

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    override fun sourceS3Location(sourceS3Location: IResolvable) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(IResolvable::unwrap))
    }

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    override fun sourceS3Location(sourceS3Location: S3LocationProperty) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(S3LocationProperty::unwrap))
    }

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     * @param sourceS3Location The source S3 location of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("060d0dd50b3f7cd7d93df0c357873251449b8988d54269f8c6cce069f5039165")
    override fun sourceS3Location(sourceS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        sourceS3Location(S3LocationProperty(sourceS3Location))

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     * @param tags The tags of the app block. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     * @param tags The tags of the app block. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    override fun upScriptDetails(setupScriptDetails: IResolvable) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(IResolvable::unwrap))
    }

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    override fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(ScriptDetailsProperty::unwrap))
    }

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     * @param setupScriptDetails The setup script details of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7acea0a2b75f58dc64d95ddd807c88fa359b8dae5432710bdd03baec04bf7e4")
    override fun upScriptDetails(setupScriptDetails: ScriptDetailsProperty.Builder.() -> Unit): Unit
        = upScriptDetails(ScriptDetailsProperty(setupScriptDetails))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlock = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnAppBlock.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock): CfnAppBlock
        = CfnAppBlock(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlock): software.amazon.awscdk.services.appstream.CfnAppBlock
        = wrapped.cdkObject
  }

  /**
   * The S3 location of the app block.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .s3Bucket("s3Bucket")
   * // the properties below are optional
   * .s3Key("s3Key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The S3 bucket of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html#cfn-appstream-appblock-s3location-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The S3 key of the S3 object of the virtual hard disk.
     *
     * This is required when it's used by `SetupScriptDetails` and `PostSetupScriptDetails` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html#cfn-appstream-appblock-s3location-s3key)
     */
    public fun s3Key(): String? = unwrap(this).getS3Key()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket of the app block. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The S3 key of the S3 object of the virtual hard disk.
       * This is required when it's used by `SetupScriptDetails` and `PostSetupScriptDetails` .
       */
      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty.builder()

      /**
       * @param s3Bucket The S3 bucket of the app block. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The S3 key of the S3 object of the virtual hard disk.
       * This is required when it's used by `SetupScriptDetails` and `PostSetupScriptDetails` .
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The S3 bucket of the app block.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html#cfn-appstream-appblock-s3location-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The S3 key of the S3 object of the virtual hard disk.
       *
       * This is required when it's used by `SetupScriptDetails` and `PostSetupScriptDetails` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-s3location.html#cfn-appstream-appblock-s3location-s3key)
       */
      override fun s3Key(): String? = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty
    }
  }

  /**
   * The details of the script.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * ScriptDetailsProperty scriptDetailsProperty = ScriptDetailsProperty.builder()
   * .executablePath("executablePath")
   * .scriptS3Location(S3LocationProperty.builder()
   * .s3Bucket("s3Bucket")
   * // the properties below are optional
   * .s3Key("s3Key")
   * .build())
   * .timeoutInSeconds(123)
   * // the properties below are optional
   * .executableParameters("executableParameters")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html)
   */
  public interface ScriptDetailsProperty {
    /**
     * The parameters used in the run path for the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-executableparameters)
     */
    public fun executableParameters(): String? = unwrap(this).getExecutableParameters()

    /**
     * The run path for the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-executablepath)
     */
    public fun executablePath(): String

    /**
     * The S3 object location of the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-scripts3location)
     */
    public fun scriptS3Location(): Any

    /**
     * The run timeout, in seconds, for the script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number

    /**
     * A builder for [ScriptDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executableParameters The parameters used in the run path for the script.
       */
      public fun executableParameters(executableParameters: String)

      /**
       * @param executablePath The run path for the script. 
       */
      public fun executablePath(executablePath: String)

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      public fun scriptS3Location(scriptS3Location: IResolvable)

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      public fun scriptS3Location(scriptS3Location: S3LocationProperty)

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb15631ef25ec0ab9e92de22f1b2fbc0f3822a3921383f3efb5193afbdd6f4f0")
      public fun scriptS3Location(scriptS3Location: S3LocationProperty.Builder.() -> Unit)

      /**
       * @param timeoutInSeconds The run timeout, in seconds, for the script. 
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty.builder()

      /**
       * @param executableParameters The parameters used in the run path for the script.
       */
      override fun executableParameters(executableParameters: String) {
        cdkBuilder.executableParameters(executableParameters)
      }

      /**
       * @param executablePath The run path for the script. 
       */
      override fun executablePath(executablePath: String) {
        cdkBuilder.executablePath(executablePath)
      }

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      override fun scriptS3Location(scriptS3Location: IResolvable) {
        cdkBuilder.scriptS3Location(scriptS3Location.let(IResolvable::unwrap))
      }

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      override fun scriptS3Location(scriptS3Location: S3LocationProperty) {
        cdkBuilder.scriptS3Location(scriptS3Location.let(S3LocationProperty::unwrap))
      }

      /**
       * @param scriptS3Location The S3 object location of the script. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb15631ef25ec0ab9e92de22f1b2fbc0f3822a3921383f3efb5193afbdd6f4f0")
      override fun scriptS3Location(scriptS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          scriptS3Location(S3LocationProperty(scriptS3Location))

      /**
       * @param timeoutInSeconds The run timeout, in seconds, for the script. 
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty,
    ) : CdkObject(cdkObject), ScriptDetailsProperty {
      /**
       * The parameters used in the run path for the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-executableparameters)
       */
      override fun executableParameters(): String? = unwrap(this).getExecutableParameters()

      /**
       * The run path for the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-executablepath)
       */
      override fun executablePath(): String = unwrap(this).getExecutablePath()

      /**
       * The S3 object location of the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-scripts3location)
       */
      override fun scriptS3Location(): Any = unwrap(this).getScriptS3Location()

      /**
       * The run timeout, in seconds, for the script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblock-scriptdetails.html#cfn-appstream-appblock-scriptdetails-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty):
          ScriptDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptDetailsProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty
    }
  }
}
