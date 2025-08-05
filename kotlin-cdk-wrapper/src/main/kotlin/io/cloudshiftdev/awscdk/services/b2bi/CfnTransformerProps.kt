@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTransformer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnTransformerProps cfnTransformerProps = CfnTransformerProps.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .ediType(EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .fileFormat("fileFormat")
 * .inputConversion(InputConversionProperty.builder()
 * .fromFormat("fromFormat")
 * // the properties below are optional
 * .advancedOptions(AdvancedOptionsProperty.builder()
 * .x12(X12AdvancedOptionsProperty.builder()
 * .splitOptions(X12SplitOptionsProperty.builder()
 * .splitBy("splitBy")
 * .build())
 * .build())
 * .build())
 * .formatOptions(FormatOptionsProperty.builder()
 * .x12(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .mapping(MappingProperty.builder()
 * .templateLanguage("templateLanguage")
 * // the properties below are optional
 * .template("template")
 * .build())
 * .mappingTemplate("mappingTemplate")
 * .outputConversion(OutputConversionProperty.builder()
 * .toFormat("toFormat")
 * // the properties below are optional
 * .formatOptions(FormatOptionsProperty.builder()
 * .x12(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .sampleDocument("sampleDocument")
 * .sampleDocuments(SampleDocumentsProperty.builder()
 * .bucketName("bucketName")
 * .keys(List.of(SampleDocumentKeysProperty.builder()
 * .input("input")
 * .output("output")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html)
 */
public interface CfnTransformerProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ediType(): Any? = unwrap(this).getEdiType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun fileFormat(): String? = unwrap(this).getFileFormat()

  /**
   * Returns a structure that contains the format options for the transformation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
   */
  public fun inputConversion(): Any? = unwrap(this).getInputConversion()

  /**
   * Returns the structure that contains the mapping template and its language (either XSLT or
   * JSONATA).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
   */
  public fun mapping(): Any? = unwrap(this).getMapping()

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * Please use input-conversion or output-conversion.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun mappingTemplate(): String? = unwrap(this).getMappingTemplate()

  /**
   * Returns the descriptive name for the transformer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
   */
  public fun name(): String

  /**
   * Returns the `OutputConversion` object, which contains the format options for the outbound
   * transformation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
   */
  public fun outputConversion(): Any? = unwrap(this).getOutputConversion()

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * Please use input-conversion or output-conversion.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun sampleDocument(): String? = unwrap(this).getSampleDocument()

  /**
   * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
   * used to identify the location for your sample documents.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
   */
  public fun sampleDocuments(): Any? = unwrap(this).getSampleDocuments()

  /**
   * Returns the state of the newly created transformer.
   *
   * The transformer can be either `active` or `inactive` . For the transformer to be used in a
   * capability, its status must `active` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-status)
   */
  public fun status(): String

  /**
   * A key-value pair for a specific transformer.
   *
   * Tags are metadata that you can use to search for and group capabilities for various purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTransformerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ediType(ediType: IResolvable)

    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty)

    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit)

    /**
     * @param fileFormat the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun fileFormat(fileFormat: String)

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    public fun inputConversion(inputConversion: IResolvable)

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    public fun inputConversion(inputConversion: CfnTransformer.InputConversionProperty)

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e260c284e11f0e6e7488069b08e86d6d956d35825cf2d4ae1a7016acd1440d")
    public
        fun inputConversion(inputConversion: CfnTransformer.InputConversionProperty.Builder.() -> Unit)

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    public fun mapping(mapping: IResolvable)

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    public fun mapping(mapping: CfnTransformer.MappingProperty)

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31e14afbec53144d7ce4c6400d338b21159608ccb6d7f34a4da5ecef252c831d")
    public fun mapping(mapping: CfnTransformer.MappingProperty.Builder.() -> Unit)

    /**
     * @param mappingTemplate This shape is deprecated: This is a legacy trait.
     * Please use input-conversion or output-conversion.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun mappingTemplate(mappingTemplate: String)

    /**
     * @param name Returns the descriptive name for the transformer. 
     */
    public fun name(name: String)

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    public fun outputConversion(outputConversion: IResolvable)

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    public fun outputConversion(outputConversion: CfnTransformer.OutputConversionProperty)

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5e62116b655edc3870471034bbec299fae41a8f535c2b1d4599074447369d0b")
    public
        fun outputConversion(outputConversion: CfnTransformer.OutputConversionProperty.Builder.() -> Unit)

    /**
     * @param sampleDocument This shape is deprecated: This is a legacy trait.
     * Please use input-conversion or output-conversion.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun sampleDocument(sampleDocument: String)

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    public fun sampleDocuments(sampleDocuments: IResolvable)

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    public fun sampleDocuments(sampleDocuments: CfnTransformer.SampleDocumentsProperty)

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d662ef231818fe606614ac499f99cd52b2e4a879d031a3e63e621872d309c40")
    public
        fun sampleDocuments(sampleDocuments: CfnTransformer.SampleDocumentsProperty.Builder.() -> Unit)

    /**
     * @param status Returns the state of the newly created transformer. 
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     */
    public fun status(status: String)

    /**
     * @param tags A key-value pair for a specific transformer.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key-value pair for a specific transformer.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnTransformerProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnTransformerProps.builder()

    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ediType(ediType: CfnTransformer.EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(CfnTransformer.EdiTypeProperty.Companion::unwrap))
    }

    /**
     * @param ediType the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    override fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(CfnTransformer.EdiTypeProperty(ediType))

    /**
     * @param fileFormat the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    override fun inputConversion(inputConversion: IResolvable) {
      cdkBuilder.inputConversion(inputConversion.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    override fun inputConversion(inputConversion: CfnTransformer.InputConversionProperty) {
      cdkBuilder.inputConversion(inputConversion.let(CfnTransformer.InputConversionProperty.Companion::unwrap))
    }

    /**
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e260c284e11f0e6e7488069b08e86d6d956d35825cf2d4ae1a7016acd1440d")
    override
        fun inputConversion(inputConversion: CfnTransformer.InputConversionProperty.Builder.() -> Unit):
        Unit = inputConversion(CfnTransformer.InputConversionProperty(inputConversion))

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    override fun mapping(mapping: IResolvable) {
      cdkBuilder.mapping(mapping.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    override fun mapping(mapping: CfnTransformer.MappingProperty) {
      cdkBuilder.mapping(mapping.let(CfnTransformer.MappingProperty.Companion::unwrap))
    }

    /**
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31e14afbec53144d7ce4c6400d338b21159608ccb6d7f34a4da5ecef252c831d")
    override fun mapping(mapping: CfnTransformer.MappingProperty.Builder.() -> Unit): Unit =
        mapping(CfnTransformer.MappingProperty(mapping))

    /**
     * @param mappingTemplate This shape is deprecated: This is a legacy trait.
     * Please use input-conversion or output-conversion.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun mappingTemplate(mappingTemplate: String) {
      cdkBuilder.mappingTemplate(mappingTemplate)
    }

    /**
     * @param name Returns the descriptive name for the transformer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    override fun outputConversion(outputConversion: IResolvable) {
      cdkBuilder.outputConversion(outputConversion.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    override fun outputConversion(outputConversion: CfnTransformer.OutputConversionProperty) {
      cdkBuilder.outputConversion(outputConversion.let(CfnTransformer.OutputConversionProperty.Companion::unwrap))
    }

    /**
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5e62116b655edc3870471034bbec299fae41a8f535c2b1d4599074447369d0b")
    override
        fun outputConversion(outputConversion: CfnTransformer.OutputConversionProperty.Builder.() -> Unit):
        Unit = outputConversion(CfnTransformer.OutputConversionProperty(outputConversion))

    /**
     * @param sampleDocument This shape is deprecated: This is a legacy trait.
     * Please use input-conversion or output-conversion.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    override fun sampleDocuments(sampleDocuments: IResolvable) {
      cdkBuilder.sampleDocuments(sampleDocuments.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    override fun sampleDocuments(sampleDocuments: CfnTransformer.SampleDocumentsProperty) {
      cdkBuilder.sampleDocuments(sampleDocuments.let(CfnTransformer.SampleDocumentsProperty.Companion::unwrap))
    }

    /**
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d662ef231818fe606614ac499f99cd52b2e4a879d031a3e63e621872d309c40")
    override
        fun sampleDocuments(sampleDocuments: CfnTransformer.SampleDocumentsProperty.Builder.() -> Unit):
        Unit = sampleDocuments(CfnTransformer.SampleDocumentsProperty(sampleDocuments))

    /**
     * @param status Returns the state of the newly created transformer. 
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags A key-value pair for a specific transformer.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A key-value pair for a specific transformer.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformerProps,
  ) : CdkObject(cdkObject),
      CfnTransformerProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ediType(): Any? = unwrap(this).getEdiType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun fileFormat(): String? = unwrap(this).getFileFormat()

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     */
    override fun inputConversion(): Any? = unwrap(this).getInputConversion()

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     */
    override fun mapping(): Any? = unwrap(this).getMapping()

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun mappingTemplate(): String? = unwrap(this).getMappingTemplate()

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     */
    override fun outputConversion(): Any? = unwrap(this).getOutputConversion()

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun sampleDocument(): String? = unwrap(this).getSampleDocument()

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     */
    override fun sampleDocuments(): Any? = unwrap(this).getSampleDocuments()

    /**
     * Returns the state of the newly created transformer.
     *
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-status)
     */
    override fun status(): String = unwrap(this).getStatus()

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransformerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformerProps):
        CfnTransformerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTransformerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransformerProps):
        software.amazon.awscdk.services.b2bi.CfnTransformerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnTransformerProps
  }
}
