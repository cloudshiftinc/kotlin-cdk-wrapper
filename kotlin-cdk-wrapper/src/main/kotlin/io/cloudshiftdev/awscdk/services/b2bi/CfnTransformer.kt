@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a transformer. AWS B2B Data Interchange currently supports two scenarios:.
 *
 * * *Inbound EDI* : the AWS customer receives an EDI file from their trading partner. AWS B2B Data
 * Interchange converts this EDI file into a JSON or XML file with a service-defined structure. A
 * mapping template provided by the customer, in JSONata or XSLT format, is optionally applied to this
 * file to produce a JSON or XML file with the structure the customer requires.
 * * *Outbound EDI* : the AWS customer has a JSON or XML file containing data that they wish to use
 * in an EDI file. A mapping template, provided by the customer (in either JSONata or XSLT format) is
 * applied to this file to generate a JSON or XML file in the service-defined structure. This file is
 * then converted to an EDI file.
 *
 *
 * The following fields are provided for backwards compatibility only: `fileFormat` ,
 * `mappingTemplate` , `ediType` , and `sampleDocument` .
 *
 * * Use the `mapping` data type in place of `mappingTemplate` and `fileFormat`
 * * Use the `sampleDocuments` data type in place of `sampleDocument`
 * * Use either the `inputConversion` or `outputConversion` in place of `ediType`
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnTransformer cfnTransformer = CfnTransformer.Builder.create(this, "MyCfnTransformer")
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
public open class CfnTransformer(
  cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransformerProps,
  ) :
      this(software.amazon.awscdk.services.b2bi.CfnTransformer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransformerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransformerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransformerProps(props)
  )

  /**
   * Returns a timestamp indicating when the transformer was created.
   *
   * For example, `2023-07-20T19:58:44.624Z` .
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Returns a timestamp representing the date and time for the most recent change for the
   * transformer object.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Returns an Amazon Resource Name (ARN) for a specific transformer.
   */
  public open fun attrTransformerArn(): String = unwrap(this).getAttrTransformerArn()

  /**
   * The system-assigned unique identifier for the transformer.
   */
  public open fun attrTransformerId(): String = unwrap(this).getAttrTransformerId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun ediType(): Any? = unwrap(this).getEdiType()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun ediType(`value`: IResolvable) {
    unwrap(this).setEdiType(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun ediType(`value`: EdiTypeProperty) {
    unwrap(this).setEdiType(`value`.let(EdiTypeProperty.Companion::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29258a7ce16a2d224867c8765eb0a3ee84d47c152f097310fd6e8b6ac2af3c9e")
  public open fun ediType(`value`: EdiTypeProperty.Builder.() -> Unit): Unit =
      ediType(EdiTypeProperty(`value`))

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun fileFormat(): String? = unwrap(this).getFileFormat()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun fileFormat(`value`: String) {
    unwrap(this).setFileFormat(`value`)
  }

  /**
   * Returns a structure that contains the format options for the transformation.
   */
  public open fun inputConversion(): Any? = unwrap(this).getInputConversion()

  /**
   * Returns a structure that contains the format options for the transformation.
   */
  public open fun inputConversion(`value`: IResolvable) {
    unwrap(this).setInputConversion(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns a structure that contains the format options for the transformation.
   */
  public open fun inputConversion(`value`: InputConversionProperty) {
    unwrap(this).setInputConversion(`value`.let(InputConversionProperty.Companion::unwrap))
  }

  /**
   * Returns a structure that contains the format options for the transformation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aff916af23914b3044967a42f8af0e9ab89fe77a6f7e91b33728a62a087fd3c7")
  public open fun inputConversion(`value`: InputConversionProperty.Builder.() -> Unit): Unit =
      inputConversion(InputConversionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Returns the structure that contains the mapping template and its language (either XSLT or
   * JSONATA).
   */
  public open fun mapping(): Any? = unwrap(this).getMapping()

  /**
   * Returns the structure that contains the mapping template and its language (either XSLT or
   * JSONATA).
   */
  public open fun mapping(`value`: IResolvable) {
    unwrap(this).setMapping(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns the structure that contains the mapping template and its language (either XSLT or
   * JSONATA).
   */
  public open fun mapping(`value`: MappingProperty) {
    unwrap(this).setMapping(`value`.let(MappingProperty.Companion::unwrap))
  }

  /**
   * Returns the structure that contains the mapping template and its language (either XSLT or
   * JSONATA).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c27bef8114ef2c4f3913c10061e42e6d90aca7930fb605f963ae284894175147")
  public open fun mapping(`value`: MappingProperty.Builder.() -> Unit): Unit =
      mapping(MappingProperty(`value`))

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun mappingTemplate(): String? = unwrap(this).getMappingTemplate()

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun mappingTemplate(`value`: String) {
    unwrap(this).setMappingTemplate(`value`)
  }

  /**
   * Returns the descriptive name for the transformer.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Returns the descriptive name for the transformer.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Returns the `OutputConversion` object, which contains the format options for the outbound
   * transformation.
   */
  public open fun outputConversion(): Any? = unwrap(this).getOutputConversion()

  /**
   * Returns the `OutputConversion` object, which contains the format options for the outbound
   * transformation.
   */
  public open fun outputConversion(`value`: IResolvable) {
    unwrap(this).setOutputConversion(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns the `OutputConversion` object, which contains the format options for the outbound
   * transformation.
   */
  public open fun outputConversion(`value`: OutputConversionProperty) {
    unwrap(this).setOutputConversion(`value`.let(OutputConversionProperty.Companion::unwrap))
  }

  /**
   * Returns the `OutputConversion` object, which contains the format options for the outbound
   * transformation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80c1cb4fa04ebc72d3264cb07576806b2aa70a004385e83c866bf8da28273463")
  public open fun outputConversion(`value`: OutputConversionProperty.Builder.() -> Unit): Unit =
      outputConversion(OutputConversionProperty(`value`))

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun sampleDocument(): String? = unwrap(this).getSampleDocument()

  /**
   * (deprecated) This shape is deprecated: This is a legacy trait.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun sampleDocument(`value`: String) {
    unwrap(this).setSampleDocument(`value`)
  }

  /**
   * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
   * used to identify the location for your sample documents.
   */
  public open fun sampleDocuments(): Any? = unwrap(this).getSampleDocuments()

  /**
   * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
   * used to identify the location for your sample documents.
   */
  public open fun sampleDocuments(`value`: IResolvable) {
    unwrap(this).setSampleDocuments(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
   * used to identify the location for your sample documents.
   */
  public open fun sampleDocuments(`value`: SampleDocumentsProperty) {
    unwrap(this).setSampleDocuments(`value`.let(SampleDocumentsProperty.Companion::unwrap))
  }

  /**
   * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
   * used to identify the location for your sample documents.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfe43b0f18d858d51eecb17e82d31a8d39d2cb7f5bb5e3a44a3caa9ce77d0967")
  public open fun sampleDocuments(`value`: SampleDocumentsProperty.Builder.() -> Unit): Unit =
      sampleDocuments(SampleDocumentsProperty(`value`))

  /**
   * Returns the state of the newly created transformer.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * Returns the state of the newly created transformer.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A key-value pair for a specific transformer.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A key-value pair for a specific transformer.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A key-value pair for a specific transformer.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.b2bi.CfnTransformer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ediType(ediType: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ediType(ediType: EdiTypeProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    public fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     * @deprecated this property has been deprecated
     * @param fileFormat 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun fileFormat(fileFormat: String)

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    public fun inputConversion(inputConversion: IResolvable)

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    public fun inputConversion(inputConversion: InputConversionProperty)

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc3e8bd6e38cc9022beaef3df9d2acb573948911a6fd5a9fd04bba588464dc95")
    public fun inputConversion(inputConversion: InputConversionProperty.Builder.() -> Unit)

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    public fun mapping(mapping: IResolvable)

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    public fun mapping(mapping: MappingProperty)

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("809e19db38e67706fdd6d35fe601d05d83e805291f35999f32757051c0fbb17e")
    public fun mapping(mapping: MappingProperty.Builder.() -> Unit)

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     * @deprecated this property has been deprecated
     * @param mappingTemplate This shape is deprecated: This is a legacy trait. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun mappingTemplate(mappingTemplate: String)

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     * @param name Returns the descriptive name for the transformer. 
     */
    public fun name(name: String)

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    public fun outputConversion(outputConversion: IResolvable)

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    public fun outputConversion(outputConversion: OutputConversionProperty)

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31daf070413a2ccf9a65911b3fc96173ffa161ce7c2500b71c87f66360fb9af")
    public fun outputConversion(outputConversion: OutputConversionProperty.Builder.() -> Unit)

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     * @deprecated this property has been deprecated
     * @param sampleDocument This shape is deprecated: This is a legacy trait. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun sampleDocument(sampleDocument: String)

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    public fun sampleDocuments(sampleDocuments: IResolvable)

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    public fun sampleDocuments(sampleDocuments: SampleDocumentsProperty)

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126d67e33fc6de29b1c4e26c8b49d10eed029e7b1b1acf56925fb0ed85abd10e")
    public fun sampleDocuments(sampleDocuments: SampleDocumentsProperty.Builder.() -> Unit)

    /**
     * Returns the state of the newly created transformer.
     *
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-status)
     * @param status Returns the state of the newly created transformer. 
     */
    public fun status(status: String)

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     * @param tags A key-value pair for a specific transformer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     * @param tags A key-value pair for a specific transformer. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnTransformer.Builder =
        software.amazon.awscdk.services.b2bi.CfnTransformer.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ediType(ediType: EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(EdiTypeProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @deprecated this property has been deprecated
     * @param ediType 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    override fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(EdiTypeProperty(ediType))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     * @deprecated this property has been deprecated
     * @param fileFormat 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    override fun inputConversion(inputConversion: IResolvable) {
      cdkBuilder.inputConversion(inputConversion.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    override fun inputConversion(inputConversion: InputConversionProperty) {
      cdkBuilder.inputConversion(inputConversion.let(InputConversionProperty.Companion::unwrap))
    }

    /**
     * Returns a structure that contains the format options for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-inputconversion)
     * @param inputConversion Returns a structure that contains the format options for the
     * transformation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc3e8bd6e38cc9022beaef3df9d2acb573948911a6fd5a9fd04bba588464dc95")
    override fun inputConversion(inputConversion: InputConversionProperty.Builder.() -> Unit): Unit
        = inputConversion(InputConversionProperty(inputConversion))

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    override fun mapping(mapping: IResolvable) {
      cdkBuilder.mapping(mapping.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    override fun mapping(mapping: MappingProperty) {
      cdkBuilder.mapping(mapping.let(MappingProperty.Companion::unwrap))
    }

    /**
     * Returns the structure that contains the mapping template and its language (either XSLT or
     * JSONATA).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mapping)
     * @param mapping Returns the structure that contains the mapping template and its language
     * (either XSLT or JSONATA). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("809e19db38e67706fdd6d35fe601d05d83e805291f35999f32757051c0fbb17e")
    override fun mapping(mapping: MappingProperty.Builder.() -> Unit): Unit =
        mapping(MappingProperty(mapping))

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     * @deprecated this property has been deprecated
     * @param mappingTemplate This shape is deprecated: This is a legacy trait. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun mappingTemplate(mappingTemplate: String) {
      cdkBuilder.mappingTemplate(mappingTemplate)
    }

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     * @param name Returns the descriptive name for the transformer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    override fun outputConversion(outputConversion: IResolvable) {
      cdkBuilder.outputConversion(outputConversion.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    override fun outputConversion(outputConversion: OutputConversionProperty) {
      cdkBuilder.outputConversion(outputConversion.let(OutputConversionProperty.Companion::unwrap))
    }

    /**
     * Returns the `OutputConversion` object, which contains the format options for the outbound
     * transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-outputconversion)
     * @param outputConversion Returns the `OutputConversion` object, which contains the format
     * options for the outbound transformation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31daf070413a2ccf9a65911b3fc96173ffa161ce7c2500b71c87f66360fb9af")
    override fun outputConversion(outputConversion: OutputConversionProperty.Builder.() -> Unit):
        Unit = outputConversion(OutputConversionProperty(outputConversion))

    /**
     * (deprecated) This shape is deprecated: This is a legacy trait.
     *
     * Please use input-conversion or output-conversion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     * @deprecated this property has been deprecated
     * @param sampleDocument This shape is deprecated: This is a legacy trait. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    override fun sampleDocuments(sampleDocuments: IResolvable) {
      cdkBuilder.sampleDocuments(sampleDocuments.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    override fun sampleDocuments(sampleDocuments: SampleDocumentsProperty) {
      cdkBuilder.sampleDocuments(sampleDocuments.let(SampleDocumentsProperty.Companion::unwrap))
    }

    /**
     * Returns a structure that contains the Amazon S3 bucket and an array of the corresponding keys
     * used to identify the location for your sample documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocuments)
     * @param sampleDocuments Returns a structure that contains the Amazon S3 bucket and an array of
     * the corresponding keys used to identify the location for your sample documents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("126d67e33fc6de29b1c4e26c8b49d10eed029e7b1b1acf56925fb0ed85abd10e")
    override fun sampleDocuments(sampleDocuments: SampleDocumentsProperty.Builder.() -> Unit): Unit
        = sampleDocuments(SampleDocumentsProperty(sampleDocuments))

    /**
     * Returns the state of the newly created transformer.
     *
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-status)
     * @param status Returns the state of the newly created transformer. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     * @param tags A key-value pair for a specific transformer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     * @param tags A key-value pair for a specific transformer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.b2bi.CfnTransformer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransformer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransformer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer):
        CfnTransformer = CfnTransformer(cdkObject)

    internal fun unwrap(wrapped: CfnTransformer):
        software.amazon.awscdk.services.b2bi.CfnTransformer = wrapped.cdkObject as
        software.amazon.awscdk.services.b2bi.CfnTransformer
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * AdvancedOptionsProperty advancedOptionsProperty = AdvancedOptionsProperty.builder()
   * .x12(X12AdvancedOptionsProperty.builder()
   * .splitOptions(X12SplitOptionsProperty.builder()
   * .splitBy("splitBy")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-advancedoptions.html)
   */
  public interface AdvancedOptionsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-advancedoptions.html#cfn-b2bi-transformer-advancedoptions-x12)
     */
    public fun x12(): Any? = unwrap(this).getX12()

    /**
     * A builder for [AdvancedOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12 the value to be set.
       */
      public fun x12(x12: IResolvable)

      /**
       * @param x12 the value to be set.
       */
      public fun x12(x12: X12AdvancedOptionsProperty)

      /**
       * @param x12 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98133a5e8b905f78b5ca5d9900a40fad46593c95fa59b2e6978c7d59a3790854")
      public fun x12(x12: X12AdvancedOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty.builder()

      /**
       * @param x12 the value to be set.
       */
      override fun x12(x12: IResolvable) {
        cdkBuilder.x12(x12.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param x12 the value to be set.
       */
      override fun x12(x12: X12AdvancedOptionsProperty) {
        cdkBuilder.x12(x12.let(X12AdvancedOptionsProperty.Companion::unwrap))
      }

      /**
       * @param x12 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98133a5e8b905f78b5ca5d9900a40fad46593c95fa59b2e6978c7d59a3790854")
      override fun x12(x12: X12AdvancedOptionsProperty.Builder.() -> Unit): Unit =
          x12(X12AdvancedOptionsProperty(x12))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty,
    ) : CdkObject(cdkObject),
        AdvancedOptionsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-advancedoptions.html#cfn-b2bi-transformer-advancedoptions-x12)
       */
      override fun x12(): Any? = unwrap(this).getX12()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty):
          AdvancedOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? AdvancedOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.AdvancedOptionsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * EdiTypeProperty ediTypeProperty = EdiTypeProperty.builder()
   * .x12Details(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-editype.html)
   */
  public interface EdiTypeProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-editype.html#cfn-b2bi-transformer-editype-x12details)
     */
    public fun x12Details(): Any

    /**
     * A builder for [EdiTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12Details the value to be set. 
       */
      public fun x12Details(x12Details: IResolvable)

      /**
       * @param x12Details the value to be set. 
       */
      public fun x12Details(x12Details: X12DetailsProperty)

      /**
       * @param x12Details the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7f53f7c8b93292a1154273d61bb66f75775193f21594f4971c63075e5ebc9a")
      public fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty.builder()

      /**
       * @param x12Details the value to be set. 
       */
      override fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param x12Details the value to be set. 
       */
      override fun x12Details(x12Details: X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details.let(X12DetailsProperty.Companion::unwrap))
      }

      /**
       * @param x12Details the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7f53f7c8b93292a1154273d61bb66f75775193f21594f4971c63075e5ebc9a")
      override fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit): Unit =
          x12Details(X12DetailsProperty(x12Details))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty,
    ) : CdkObject(cdkObject),
        EdiTypeProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-editype.html#cfn-b2bi-transformer-editype-x12details)
       */
      override fun x12Details(): Any = unwrap(this).getX12Details()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdiTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty):
          EdiTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? EdiTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiTypeProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * FormatOptionsProperty formatOptionsProperty = FormatOptionsProperty.builder()
   * .x12(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-formatoptions.html)
   */
  public interface FormatOptionsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-formatoptions.html#cfn-b2bi-transformer-formatoptions-x12)
     */
    public fun x12(): Any

    /**
     * A builder for [FormatOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12 the value to be set. 
       */
      public fun x12(x12: IResolvable)

      /**
       * @param x12 the value to be set. 
       */
      public fun x12(x12: X12DetailsProperty)

      /**
       * @param x12 the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3448a33127b836f888128060e1f12322173657ab7e0b9031b88fdacc254bb29")
      public fun x12(x12: X12DetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty.builder()

      /**
       * @param x12 the value to be set. 
       */
      override fun x12(x12: IResolvable) {
        cdkBuilder.x12(x12.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param x12 the value to be set. 
       */
      override fun x12(x12: X12DetailsProperty) {
        cdkBuilder.x12(x12.let(X12DetailsProperty.Companion::unwrap))
      }

      /**
       * @param x12 the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3448a33127b836f888128060e1f12322173657ab7e0b9031b88fdacc254bb29")
      override fun x12(x12: X12DetailsProperty.Builder.() -> Unit): Unit =
          x12(X12DetailsProperty(x12))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty,
    ) : CdkObject(cdkObject),
        FormatOptionsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-formatoptions.html#cfn-b2bi-transformer-formatoptions-x12)
       */
      override fun x12(): Any = unwrap(this).getX12()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty):
          FormatOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? FormatOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormatOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.FormatOptionsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * InputConversionProperty inputConversionProperty = InputConversionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html)
   */
  public interface InputConversionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-advancedoptions)
     */
    public fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-formatoptions)
     */
    public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-fromformat)
     */
    public fun fromFormat(): String

    /**
     * A builder for [InputConversionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param advancedOptions the value to be set.
       */
      public fun advancedOptions(advancedOptions: IResolvable)

      /**
       * @param advancedOptions the value to be set.
       */
      public fun advancedOptions(advancedOptions: AdvancedOptionsProperty)

      /**
       * @param advancedOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("422ee1c3922d18f4429e4f56bff956b09fef302031137555b5ab1a1adff07ce9")
      public fun advancedOptions(advancedOptions: AdvancedOptionsProperty.Builder.() -> Unit)

      /**
       * @param formatOptions the value to be set.
       */
      public fun formatOptions(formatOptions: IResolvable)

      /**
       * @param formatOptions the value to be set.
       */
      public fun formatOptions(formatOptions: FormatOptionsProperty)

      /**
       * @param formatOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9adb574088f5ed3a6520793c99145bdf8075552dbc3d35ed8d29b4cb48c3db0e")
      public fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit)

      /**
       * @param fromFormat the value to be set. 
       */
      public fun fromFormat(fromFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty.builder()

      /**
       * @param advancedOptions the value to be set.
       */
      override fun advancedOptions(advancedOptions: IResolvable) {
        cdkBuilder.advancedOptions(advancedOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param advancedOptions the value to be set.
       */
      override fun advancedOptions(advancedOptions: AdvancedOptionsProperty) {
        cdkBuilder.advancedOptions(advancedOptions.let(AdvancedOptionsProperty.Companion::unwrap))
      }

      /**
       * @param advancedOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("422ee1c3922d18f4429e4f56bff956b09fef302031137555b5ab1a1adff07ce9")
      override fun advancedOptions(advancedOptions: AdvancedOptionsProperty.Builder.() -> Unit):
          Unit = advancedOptions(AdvancedOptionsProperty(advancedOptions))

      /**
       * @param formatOptions the value to be set.
       */
      override fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param formatOptions the value to be set.
       */
      override fun formatOptions(formatOptions: FormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions.let(FormatOptionsProperty.Companion::unwrap))
      }

      /**
       * @param formatOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9adb574088f5ed3a6520793c99145bdf8075552dbc3d35ed8d29b4cb48c3db0e")
      override fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit): Unit =
          formatOptions(FormatOptionsProperty(formatOptions))

      /**
       * @param fromFormat the value to be set. 
       */
      override fun fromFormat(fromFormat: String) {
        cdkBuilder.fromFormat(fromFormat)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty,
    ) : CdkObject(cdkObject),
        InputConversionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-advancedoptions)
       */
      override fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-formatoptions)
       */
      override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-inputconversion.html#cfn-b2bi-transformer-inputconversion-fromformat)
       */
      override fun fromFormat(): String = unwrap(this).getFromFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputConversionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty):
          InputConversionProperty = CdkObjectWrappers.wrap(cdkObject) as? InputConversionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputConversionProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.InputConversionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * MappingProperty mappingProperty = MappingProperty.builder()
   * .templateLanguage("templateLanguage")
   * // the properties below are optional
   * .template("template")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-mapping.html)
   */
  public interface MappingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-mapping.html#cfn-b2bi-transformer-mapping-template)
     */
    public fun template(): String? = unwrap(this).getTemplate()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-mapping.html#cfn-b2bi-transformer-mapping-templatelanguage)
     */
    public fun templateLanguage(): String

    /**
     * A builder for [MappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param template the value to be set.
       */
      public fun template(template: String)

      /**
       * @param templateLanguage the value to be set. 
       */
      public fun templateLanguage(templateLanguage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty.builder()

      /**
       * @param template the value to be set.
       */
      override fun template(template: String) {
        cdkBuilder.template(template)
      }

      /**
       * @param templateLanguage the value to be set. 
       */
      override fun templateLanguage(templateLanguage: String) {
        cdkBuilder.templateLanguage(templateLanguage)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty,
    ) : CdkObject(cdkObject),
        MappingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-mapping.html#cfn-b2bi-transformer-mapping-template)
       */
      override fun template(): String? = unwrap(this).getTemplate()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-mapping.html#cfn-b2bi-transformer-mapping-templatelanguage)
       */
      override fun templateLanguage(): String = unwrap(this).getTemplateLanguage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty):
          MappingProperty = CdkObjectWrappers.wrap(cdkObject) as? MappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.MappingProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * OutputConversionProperty outputConversionProperty = OutputConversionProperty.builder()
   * .toFormat("toFormat")
   * // the properties below are optional
   * .formatOptions(FormatOptionsProperty.builder()
   * .x12(X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-outputconversion.html)
   */
  public interface OutputConversionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-outputconversion.html#cfn-b2bi-transformer-outputconversion-formatoptions)
     */
    public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-outputconversion.html#cfn-b2bi-transformer-outputconversion-toformat)
     */
    public fun toFormat(): String

    /**
     * A builder for [OutputConversionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param formatOptions the value to be set.
       */
      public fun formatOptions(formatOptions: IResolvable)

      /**
       * @param formatOptions the value to be set.
       */
      public fun formatOptions(formatOptions: FormatOptionsProperty)

      /**
       * @param formatOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("628430e93ba46295b973557bd696f9361bc127a816ff4b1cdcd7ec2d4aa31a19")
      public fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit)

      /**
       * @param toFormat the value to be set. 
       */
      public fun toFormat(toFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty.builder()

      /**
       * @param formatOptions the value to be set.
       */
      override fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param formatOptions the value to be set.
       */
      override fun formatOptions(formatOptions: FormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions.let(FormatOptionsProperty.Companion::unwrap))
      }

      /**
       * @param formatOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("628430e93ba46295b973557bd696f9361bc127a816ff4b1cdcd7ec2d4aa31a19")
      override fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit): Unit =
          formatOptions(FormatOptionsProperty(formatOptions))

      /**
       * @param toFormat the value to be set. 
       */
      override fun toFormat(toFormat: String) {
        cdkBuilder.toFormat(toFormat)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty,
    ) : CdkObject(cdkObject),
        OutputConversionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-outputconversion.html#cfn-b2bi-transformer-outputconversion-formatoptions)
       */
      override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-outputconversion.html#cfn-b2bi-transformer-outputconversion-toformat)
       */
      override fun toFormat(): String = unwrap(this).getToFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputConversionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty):
          OutputConversionProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputConversionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputConversionProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.OutputConversionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * SampleDocumentKeysProperty sampleDocumentKeysProperty = SampleDocumentKeysProperty.builder()
   * .input("input")
   * .output("output")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocumentkeys.html)
   */
  public interface SampleDocumentKeysProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocumentkeys.html#cfn-b2bi-transformer-sampledocumentkeys-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocumentkeys.html#cfn-b2bi-transformer-sampledocumentkeys-output)
     */
    public fun output(): String? = unwrap(this).getOutput()

    /**
     * A builder for [SampleDocumentKeysProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param input the value to be set.
       */
      public fun input(input: String)

      /**
       * @param output the value to be set.
       */
      public fun output(output: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty.builder()

      /**
       * @param input the value to be set.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param output the value to be set.
       */
      override fun output(output: String) {
        cdkBuilder.output(output)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty,
    ) : CdkObject(cdkObject),
        SampleDocumentKeysProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocumentkeys.html#cfn-b2bi-transformer-sampledocumentkeys-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocumentkeys.html#cfn-b2bi-transformer-sampledocumentkeys-output)
       */
      override fun output(): String? = unwrap(this).getOutput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SampleDocumentKeysProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty):
          SampleDocumentKeysProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SampleDocumentKeysProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleDocumentKeysProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentKeysProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * SampleDocumentsProperty sampleDocumentsProperty = SampleDocumentsProperty.builder()
   * .bucketName("bucketName")
   * .keys(List.of(SampleDocumentKeysProperty.builder()
   * .input("input")
   * .output("output")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocuments.html)
   */
  public interface SampleDocumentsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocuments.html#cfn-b2bi-transformer-sampledocuments-bucketname)
     */
    public fun bucketName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocuments.html#cfn-b2bi-transformer-sampledocuments-keys)
     */
    public fun keys(): Any

    /**
     * A builder for [SampleDocumentsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName the value to be set. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param keys the value to be set. 
       */
      public fun keys(keys: IResolvable)

      /**
       * @param keys the value to be set. 
       */
      public fun keys(keys: List<Any>)

      /**
       * @param keys the value to be set. 
       */
      public fun keys(vararg keys: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty.builder()

      /**
       * @param bucketName the value to be set. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param keys the value to be set. 
       */
      override fun keys(keys: IResolvable) {
        cdkBuilder.keys(keys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param keys the value to be set. 
       */
      override fun keys(keys: List<Any>) {
        cdkBuilder.keys(keys.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param keys the value to be set. 
       */
      override fun keys(vararg keys: Any): Unit = keys(keys.toList())

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty,
    ) : CdkObject(cdkObject),
        SampleDocumentsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocuments.html#cfn-b2bi-transformer-sampledocuments-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-sampledocuments.html#cfn-b2bi-transformer-sampledocuments-keys)
       */
      override fun keys(): Any = unwrap(this).getKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SampleDocumentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty):
          SampleDocumentsProperty = CdkObjectWrappers.wrap(cdkObject) as? SampleDocumentsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SampleDocumentsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.SampleDocumentsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12AdvancedOptionsProperty x12AdvancedOptionsProperty = X12AdvancedOptionsProperty.builder()
   * .splitOptions(X12SplitOptionsProperty.builder()
   * .splitBy("splitBy")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12advancedoptions.html)
   */
  public interface X12AdvancedOptionsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12advancedoptions.html#cfn-b2bi-transformer-x12advancedoptions-splitoptions)
     */
    public fun splitOptions(): Any? = unwrap(this).getSplitOptions()

    /**
     * A builder for [X12AdvancedOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param splitOptions the value to be set.
       */
      public fun splitOptions(splitOptions: IResolvable)

      /**
       * @param splitOptions the value to be set.
       */
      public fun splitOptions(splitOptions: X12SplitOptionsProperty)

      /**
       * @param splitOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("657e2e1d31315426929978b5a60237e61e83090286dfe15e12acea9ad9ccc8e9")
      public fun splitOptions(splitOptions: X12SplitOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty.builder()

      /**
       * @param splitOptions the value to be set.
       */
      override fun splitOptions(splitOptions: IResolvable) {
        cdkBuilder.splitOptions(splitOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param splitOptions the value to be set.
       */
      override fun splitOptions(splitOptions: X12SplitOptionsProperty) {
        cdkBuilder.splitOptions(splitOptions.let(X12SplitOptionsProperty.Companion::unwrap))
      }

      /**
       * @param splitOptions the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("657e2e1d31315426929978b5a60237e61e83090286dfe15e12acea9ad9ccc8e9")
      override fun splitOptions(splitOptions: X12SplitOptionsProperty.Builder.() -> Unit): Unit =
          splitOptions(X12SplitOptionsProperty(splitOptions))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty,
    ) : CdkObject(cdkObject),
        X12AdvancedOptionsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12advancedoptions.html#cfn-b2bi-transformer-x12advancedoptions-splitoptions)
       */
      override fun splitOptions(): Any? = unwrap(this).getSplitOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12AdvancedOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty):
          X12AdvancedOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          X12AdvancedOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12AdvancedOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12AdvancedOptionsProperty
    }
  }

  /**
   * A structure that contains the X12 transaction set and version.
   *
   * The X12 structure is used when the system transforms an EDI (electronic data interchange) file.
   *
   *
   * If an EDI input file contains more than one transaction, each transaction must have the same
   * transaction set and version, for example 214/4010. If not, the transformer cannot parse the file.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12DetailsProperty x12DetailsProperty = X12DetailsProperty.builder()
   * .transactionSet("transactionSet")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html)
   */
  public interface X12DetailsProperty {
    /**
     * Returns an enumerated type where each value identifies an X12 transaction set.
     *
     * Transaction sets are maintained by the X12 Accredited Standards Committee.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html#cfn-b2bi-transformer-x12details-transactionset)
     */
    public fun transactionSet(): String? = unwrap(this).getTransactionSet()

    /**
     * Returns the version to use for the specified X12 transaction set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html#cfn-b2bi-transformer-x12details-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [X12DetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param transactionSet Returns an enumerated type where each value identifies an X12
       * transaction set.
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       */
      public fun transactionSet(transactionSet: String)

      /**
       * @param version Returns the version to use for the specified X12 transaction set.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty.builder()

      /**
       * @param transactionSet Returns an enumerated type where each value identifies an X12
       * transaction set.
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       */
      override fun transactionSet(transactionSet: String) {
        cdkBuilder.transactionSet(transactionSet)
      }

      /**
       * @param version Returns the version to use for the specified X12 transaction set.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty,
    ) : CdkObject(cdkObject),
        X12DetailsProperty {
      /**
       * Returns an enumerated type where each value identifies an X12 transaction set.
       *
       * Transaction sets are maintained by the X12 Accredited Standards Committee.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html#cfn-b2bi-transformer-x12details-transactionset)
       */
      override fun transactionSet(): String? = unwrap(this).getTransactionSet()

      /**
       * Returns the version to use for the specified X12 transaction set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html#cfn-b2bi-transformer-x12details-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12DetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty):
          X12DetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? X12DetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12DetailsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12SplitOptionsProperty x12SplitOptionsProperty = X12SplitOptionsProperty.builder()
   * .splitBy("splitBy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12splitoptions.html)
   */
  public interface X12SplitOptionsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12splitoptions.html#cfn-b2bi-transformer-x12splitoptions-splitby)
     */
    public fun splitBy(): String? = unwrap(this).getSplitBy()

    /**
     * A builder for [X12SplitOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param splitBy the value to be set.
       */
      public fun splitBy(splitBy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty.builder()

      /**
       * @param splitBy the value to be set.
       */
      override fun splitBy(splitBy: String) {
        cdkBuilder.splitBy(splitBy)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty,
    ) : CdkObject(cdkObject),
        X12SplitOptionsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12splitoptions.html#cfn-b2bi-transformer-x12splitoptions-splitby)
       */
      override fun splitBy(): String? = unwrap(this).getSplitBy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12SplitOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty):
          X12SplitOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? X12SplitOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12SplitOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12SplitOptionsProperty
    }
  }
}
