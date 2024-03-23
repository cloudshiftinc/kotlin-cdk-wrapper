@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFaq`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendra.*;
 * CfnFaqProps cfnFaqProps = CfnFaqProps.builder()
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
public interface CfnFaqProps {
  /**
   * A description for the FAQ.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun fileFormat(): String? = unwrap(this).getFileFormat()

  /**
   * The identifier of the index that contains the FAQ.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-indexid)
   */
  public fun indexId(): String

  /**
   * The code for a language.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-languagecode)
   */
  public fun languageCode(): String? = unwrap(this).getLanguageCode()

  /**
   * The name that you assigned the FAQ when you created or updated the FAQ.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains
   * the FAQ.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-rolearn)
   */
  public fun roleArn(): String

  /**
   * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
   */
  public fun s3Path(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFaqProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the FAQ.
     */
    public fun description(description: String)

    /**
     * @param fileFormat The format of the input file.
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
     */
    public fun fileFormat(fileFormat: String)

    /**
     * @param indexId The identifier of the index that contains the FAQ. 
     */
    public fun indexId(indexId: String)

    /**
     * @param languageCode The code for a language.
     */
    public fun languageCode(languageCode: String)

    /**
     * @param name The name that you assigned the FAQ when you created or updated the FAQ. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQ. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    public fun s3Path(s3Path: IResolvable)

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    public fun s3Path(s3Path: CfnFaq.S3PathProperty)

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28942ef96ec3eba1e198857272a2ab193774b3114e655be715d32fc24fc396f2")
    public fun s3Path(s3Path: CfnFaq.S3PathProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaqProps.Builder =
        software.amazon.awscdk.services.kendra.CfnFaqProps.builder()

    /**
     * @param description A description for the FAQ.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fileFormat The format of the input file.
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
     */
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * @param indexId The identifier of the index that contains the FAQ. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * @param languageCode The code for a language.
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param name The name that you assigned the FAQ when you created or updated the FAQ. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     * bucket that contains the FAQ. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    override fun s3Path(s3Path: IResolvable) {
      cdkBuilder.s3Path(s3Path.let(IResolvable::unwrap))
    }

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    override fun s3Path(s3Path: CfnFaq.S3PathProperty) {
      cdkBuilder.s3Path(s3Path.let(CfnFaq.S3PathProperty::unwrap))
    }

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28942ef96ec3eba1e198857272a2ab193774b3114e655be715d32fc24fc396f2")
    override fun s3Path(s3Path: CfnFaq.S3PathProperty.Builder.() -> Unit): Unit =
        s3Path(CfnFaq.S3PathProperty(s3Path))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnFaqProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kendra.CfnFaqProps,
  ) : CdkObject(cdkObject), CfnFaqProps {
    /**
     * A description for the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun fileFormat(): String? = unwrap(this).getFileFormat()

    /**
     * The identifier of the index that contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-indexid)
     */
    override fun indexId(): String = unwrap(this).getIndexId()

    /**
     * The code for a language.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-languagecode)
     */
    override fun languageCode(): String? = unwrap(this).getLanguageCode()

    /**
     * The name that you assigned the FAQ when you created or updated the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that
     * contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     */
    override fun s3Path(): Any = unwrap(this).getS3Path()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFaqProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaqProps): CfnFaqProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnFaqProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFaqProps): software.amazon.awscdk.services.kendra.CfnFaqProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kendra.CfnFaqProps
  }
}
