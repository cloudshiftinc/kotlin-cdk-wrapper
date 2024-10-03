@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom plugin using the specified properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
 * CfnCustomPlugin cfnCustomPlugin = CfnCustomPlugin.Builder.create(this, "MyCfnCustomPlugin")
 * .contentType("contentType")
 * .location(CustomPluginLocationProperty.builder()
 * .s3Location(S3LocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html)
 */
public open class CfnCustomPlugin(
  cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomPluginProps,
  ) :
      this(software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomPluginProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomPluginProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomPluginProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the custom plugin.
   */
  public open fun attrCustomPluginArn(): String = unwrap(this).getAttrCustomPluginArn()

  /**
   * Details about the custom plugin file.
   */
  public open fun attrFileDescription(): IResolvable =
      unwrap(this).getAttrFileDescription().let(IResolvable::wrap)

  /**
   * The revision of the custom plugin.
   */
  public open fun attrRevision(): Number = unwrap(this).getAttrRevision()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The format of the plugin file.
   */
  public open fun contentType(): String = unwrap(this).getContentType()

  /**
   * The format of the plugin file.
   */
  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  /**
   * The description of the custom plugin.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the custom plugin.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Information about the location of the custom plugin.
   */
  public open fun location(): Any = unwrap(this).getLocation()

  /**
   * Information about the location of the custom plugin.
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the location of the custom plugin.
   */
  public open fun location(`value`: CustomPluginLocationProperty) {
    unwrap(this).setLocation(`value`.let(CustomPluginLocationProperty.Companion::unwrap))
  }

  /**
   * Information about the location of the custom plugin.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9add07cf83bb16177e7e7e7375583a148b131c8f43d0660d4a3e082a97112415")
  public open fun location(`value`: CustomPluginLocationProperty.Builder.() -> Unit): Unit =
      location(CustomPluginLocationProperty(`value`))

  /**
   * The name of the custom plugin.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the custom plugin.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kafkaconnect.CfnCustomPlugin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The format of the plugin file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-contenttype)
     * @param contentType The format of the plugin file. 
     */
    public fun contentType(contentType: String)

    /**
     * The description of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-description)
     * @param description The description of the custom plugin. 
     */
    public fun description(description: String)

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    public fun location(location: IResolvable)

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    public fun location(location: CustomPluginLocationProperty)

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5db55bcf24d6595d33a1637ab826ab16c091dc4c398e31428e4c2d5c676d57fd")
    public fun location(location: CustomPluginLocationProperty.Builder.() -> Unit)

    /**
     * The name of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-name)
     * @param name The name of the custom plugin. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.Builder.create(scope, id)

    /**
     * The format of the plugin file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-contenttype)
     * @param contentType The format of the plugin file. 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * The description of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-description)
     * @param description The description of the custom plugin. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    override fun location(location: CustomPluginLocationProperty) {
      cdkBuilder.location(location.let(CustomPluginLocationProperty.Companion::unwrap))
    }

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     * @param location Information about the location of the custom plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5db55bcf24d6595d33a1637ab826ab16c091dc4c398e31428e4c2d5c676d57fd")
    override fun location(location: CustomPluginLocationProperty.Builder.() -> Unit): Unit =
        location(CustomPluginLocationProperty(location))

    /**
     * The name of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-name)
     * @param name The name of the custom plugin. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomPlugin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomPlugin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin):
        CfnCustomPlugin = CfnCustomPlugin(cdkObject)

    internal fun unwrap(wrapped: CfnCustomPlugin):
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin = wrapped.cdkObject as
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin
  }

  /**
   * Details about a custom plugin file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * CustomPluginFileDescriptionProperty customPluginFileDescriptionProperty =
   * CustomPluginFileDescriptionProperty.builder()
   * .fileMd5("fileMd5")
   * .fileSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginfiledescription.html)
   */
  public interface CustomPluginFileDescriptionProperty {
    /**
     * The hex-encoded MD5 checksum of the custom plugin file.
     *
     * You can use it to validate the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginfiledescription.html#cfn-kafkaconnect-customplugin-custompluginfiledescription-filemd5)
     */
    public fun fileMd5(): String? = unwrap(this).getFileMd5()

    /**
     * The size in bytes of the custom plugin file.
     *
     * You can use it to validate the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginfiledescription.html#cfn-kafkaconnect-customplugin-custompluginfiledescription-filesize)
     */
    public fun fileSize(): Number? = unwrap(this).getFileSize()

    /**
     * A builder for [CustomPluginFileDescriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileMd5 The hex-encoded MD5 checksum of the custom plugin file.
       * You can use it to validate the file.
       */
      public fun fileMd5(fileMd5: String)

      /**
       * @param fileSize The size in bytes of the custom plugin file.
       * You can use it to validate the file.
       */
      public fun fileSize(fileSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty.builder()

      /**
       * @param fileMd5 The hex-encoded MD5 checksum of the custom plugin file.
       * You can use it to validate the file.
       */
      override fun fileMd5(fileMd5: String) {
        cdkBuilder.fileMd5(fileMd5)
      }

      /**
       * @param fileSize The size in bytes of the custom plugin file.
       * You can use it to validate the file.
       */
      override fun fileSize(fileSize: Number) {
        cdkBuilder.fileSize(fileSize)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty,
    ) : CdkObject(cdkObject),
        CustomPluginFileDescriptionProperty {
      /**
       * The hex-encoded MD5 checksum of the custom plugin file.
       *
       * You can use it to validate the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginfiledescription.html#cfn-kafkaconnect-customplugin-custompluginfiledescription-filemd5)
       */
      override fun fileMd5(): String? = unwrap(this).getFileMd5()

      /**
       * The size in bytes of the custom plugin file.
       *
       * You can use it to validate the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginfiledescription.html#cfn-kafkaconnect-customplugin-custompluginfiledescription-filesize)
       */
      override fun fileSize(): Number? = unwrap(this).getFileSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomPluginFileDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty):
          CustomPluginFileDescriptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomPluginFileDescriptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPluginFileDescriptionProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginFileDescriptionProperty
    }
  }

  /**
   * Information about the location of a custom plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * CustomPluginLocationProperty customPluginLocationProperty =
   * CustomPluginLocationProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginlocation.html)
   */
  public interface CustomPluginLocationProperty {
    /**
     * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the plugin file
     * stored in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginlocation.html#cfn-kafkaconnect-customplugin-custompluginlocation-s3location)
     */
    public fun s3Location(): Any

    /**
     * A builder for [CustomPluginLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14228f548df427acdbc9e30c14e9ca69100a12e3a21c387117a73e904d3b4f00")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty.Builder
          =
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty.builder()

      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3Location The S3 bucket Amazon Resource Name (ARN), file key, and object version of
       * the plugin file stored in Amazon S3. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14228f548df427acdbc9e30c14e9ca69100a12e3a21c387117a73e904d3b4f00")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty,
    ) : CdkObject(cdkObject),
        CustomPluginLocationProperty {
      /**
       * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the plugin file
       * stored in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-custompluginlocation.html#cfn-kafkaconnect-customplugin-custompluginlocation-s3location)
       */
      override fun s3Location(): Any = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPluginLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty):
          CustomPluginLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomPluginLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPluginLocationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.CustomPluginLocationProperty
    }
  }

  /**
   * The location of an object in Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The Amazon Resource Name (ARN) of an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The file key for an object in an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-filekey)
     */
    public fun fileKey(): String

    /**
     * The version of an object in an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of an S3 bucket. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param fileKey The file key for an object in an S3 bucket. 
       */
      public fun fileKey(fileKey: String)

      /**
       * @param objectVersion The version of an object in an S3 bucket.
       */
      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty.Builder =
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of an S3 bucket. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param fileKey The file key for an object in an S3 bucket. 
       */
      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      /**
       * @param objectVersion The version of an object in an S3 bucket.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The Amazon Resource Name (ARN) of an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The file key for an object in an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-filekey)
       */
      override fun fileKey(): String = unwrap(this).getFileKey()

      /**
       * The version of an object in an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-customplugin-s3location.html#cfn-kafkaconnect-customplugin-s3location-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin.S3LocationProperty
    }
  }
}
