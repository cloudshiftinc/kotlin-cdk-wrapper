@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an new set of frequently asked question (FAQ) questions and answers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendra.*;
 * CfnFaq cfnFaq = CfnFaq.Builder.create(this, "MyCfnFaq")
 * .indexId("indexId")
 * .name("name")
 * .roleArn("roleArn")
 * .s3Path(S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .fileFormat("fileFormat")
 * .languageCode("languageCode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html)
 */
public open class CfnFaq internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kendra.CfnFaq,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * `arn:aws:kendra:us-west-2:111122223333:index/335c3741-41df-46a6-b5d3-61f85b787884/faq/f61995a6-cd5c-4e99-9cfc-58816d8bfaa7`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The identifier for the FAQ. For example:.
   *
   * `f61995a6-cd5c-4e99-9cfc-58816d8bfaa7`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description for the FAQ.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the FAQ.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The format of the input file.
   */
  public open fun fileFormat(): String? = unwrap(this).getFileFormat()

  /**
   * The format of the input file.
   */
  public open fun fileFormat(`value`: String) {
    unwrap(this).setFileFormat(`value`)
  }

  /**
   * The identifier of the index that contains the FAQ.
   */
  public open fun indexId(): String = unwrap(this).getIndexId()

  /**
   * The identifier of the index that contains the FAQ.
   */
  public open fun indexId(`value`: String) {
    unwrap(this).setIndexId(`value`)
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
   * The code for a language.
   */
  public open fun languageCode(): String? = unwrap(this).getLanguageCode()

  /**
   * The code for a language.
   */
  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  /**
   * The name that you assigned the FAQ when you created or updated the FAQ.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name that you assigned the FAQ when you created or updated the FAQ.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains
   * the FAQ.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains
   * the FAQ.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
   */
  public open fun s3Path(): Any = unwrap(this).getS3Path()

  /**
   * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
   */
  public open fun s3Path(`value`: IResolvable) {
    unwrap(this).setS3Path(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
   */
  public open fun s3Path(`value`: S3PathProperty) {
    unwrap(this).setS3Path(`value`.let(S3PathProperty::unwrap))
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2ee32c5cf7c6bf3aecdb829e9cfd564efb0de1f3fc9a25cc38e18bfe50ec44f")
  public open fun s3Path(`value`: S3PathProperty.Builder.() -> Unit): Unit =
      s3Path(S3PathProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kendra.CfnFaq].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-description)
     * @param description A description for the FAQ. 
     */
    public fun description(description: String)

    /**
     * The format of the input file.
     *
     * You can choose between a basic CSV format, a CSV format that includes customs attributes in a
     * header, and a JSON format that includes custom attributes.
     *
     * The format must match the format of the file stored in the S3 bucket identified in the S3Path
     * parameter.
     *
     * Valid values are:
     *
     * * `CSV`
     * * `CSV_WITH_HEADER`
     * * `JSON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-fileformat)
     * @param fileFormat The format of the input file. 
     */
    public fun fileFormat(fileFormat: String)

    /**
     * The identifier of the index that contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-indexid)
     * @param indexId The identifier of the index that contains the FAQ. 
     */
    public fun indexId(indexId: String)

    /**
     * The code for a language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-languagecode)
     * @param languageCode The code for a language. 
     */
    public fun languageCode(languageCode: String)

    /**
     * The name that you assigned the FAQ when you created or updated the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-name)
     * @param name The name that you assigned the FAQ when you created or updated the FAQ. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that
     * contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQ. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    public fun s3Path(s3Path: IResolvable)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    public fun s3Path(s3Path: S3PathProperty)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0148d928706a8212ce1eeb005579e2999c3f08f5d0389b43b8264c1df05eab20")
    public fun s3Path(s3Path: S3PathProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaq.Builder =
        software.amazon.awscdk.services.kendra.CfnFaq.Builder.create(scope, id)

    /**
     * A description for the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-description)
     * @param description A description for the FAQ. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The format of the input file.
     *
     * You can choose between a basic CSV format, a CSV format that includes customs attributes in a
     * header, and a JSON format that includes custom attributes.
     *
     * The format must match the format of the file stored in the S3 bucket identified in the S3Path
     * parameter.
     *
     * Valid values are:
     *
     * * `CSV`
     * * `CSV_WITH_HEADER`
     * * `JSON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-fileformat)
     * @param fileFormat The format of the input file. 
     */
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * The identifier of the index that contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-indexid)
     * @param indexId The identifier of the index that contains the FAQ. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * The code for a language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-languagecode)
     * @param languageCode The code for a language. 
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * The name that you assigned the FAQ when you created or updated the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-name)
     * @param name The name that you assigned the FAQ when you created or updated the FAQ. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that
     * contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQ. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    override fun s3Path(s3Path: IResolvable) {
      cdkBuilder.s3Path(s3Path.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    override fun s3Path(s3Path: S3PathProperty) {
      cdkBuilder.s3Path(s3Path.let(S3PathProperty::unwrap))
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0148d928706a8212ce1eeb005579e2999c3f08f5d0389b43b8264c1df05eab20")
    override fun s3Path(s3Path: S3PathProperty.Builder.() -> Unit): Unit =
        s3Path(S3PathProperty(s3Path))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnFaq = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kendra.CfnFaq.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFaq {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFaq(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaq): CfnFaq =
        CfnFaq(cdkObject)

    internal fun unwrap(wrapped: CfnFaq): software.amazon.awscdk.services.kendra.CfnFaq =
        wrapped.cdkObject
  }

  /**
   * Information required to find a specific file in an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * S3PathProperty s3PathProperty = S3PathProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html)
   */
  public interface S3PathProperty {
    /**
     * The name of the S3 bucket that contains the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html#cfn-kendra-faq-s3path-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html#cfn-kendra-faq-s3path-key)
     */
    public fun key(): String

    /**
     * A builder for [S3PathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name of the file. 
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty.builder()

      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name of the file. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty,
    ) : CdkObject(cdkObject), S3PathProperty {
      /**
       * The name of the S3 bucket that contains the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html#cfn-kendra-faq-s3path-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html#cfn-kendra-faq-s3path-key)
       */
      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3PathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty):
          S3PathProperty = CdkObjectWrappers.wrap(cdkObject) as S3PathProperty

      internal fun unwrap(wrapped: S3PathProperty):
          software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty
    }
  }
}
