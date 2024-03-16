@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
 * Properties for defining a `CfnTransformer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnTransformerProps cfnTransformerProps = CfnTransformerProps.builder()
 * .ediType(EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .fileFormat("fileFormat")
 * .mappingTemplate("mappingTemplate")
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .modifiedAt("modifiedAt")
 * .sampleDocument("sampleDocument")
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
   * Returns the details for the EDI standard that is being used for the transformer.
   *
   * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
   * define specific business documents.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
   */
  public fun ediType(): Any

  /**
   * Returns that the currently supported file formats for EDI transformations are `JSON` and `XML`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
   */
  public fun fileFormat(): String

  /**
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
   */
  public fun mappingTemplate(): String

  /**
   * Returns a timestamp representing the date and time for the most recent change for the
   * transformer object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-modifiedat)
   */
  public fun modifiedAt(): String? = unwrap(this).getModifiedAt()

  /**
   * Returns the descriptive name for the transformer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
   */
  public fun name(): String

  /**
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
   */
  public fun sampleDocument(): String? = unwrap(this).getSampleDocument()

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
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    public fun ediType(ediType: IResolvable)

    /**
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty)

    /**
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit)

    /**
     * @param fileFormat Returns that the currently supported file formats for EDI transformations
     * are `JSON` and `XML` . 
     */
    public fun fileFormat(fileFormat: String)

    /**
     * @param mappingTemplate Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
    public fun mappingTemplate(mappingTemplate: String)

    /**
     * @param modifiedAt Returns a timestamp representing the date and time for the most recent
     * change for the transformer object.
     */
    public fun modifiedAt(modifiedAt: String)

    /**
     * @param name Returns the descriptive name for the transformer. 
     */
    public fun name(name: String)

    /**
     * @param sampleDocument Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data.
     */
    public fun sampleDocument(sampleDocument: String)

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
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable::unwrap))
    }

    /**
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    override fun ediType(ediType: CfnTransformer.EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(CfnTransformer.EdiTypeProperty::unwrap))
    }

    /**
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    override fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(CfnTransformer.EdiTypeProperty(ediType))

    /**
     * @param fileFormat Returns that the currently supported file formats for EDI transformations
     * are `JSON` and `XML` . 
     */
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * @param mappingTemplate Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
    override fun mappingTemplate(mappingTemplate: String) {
      cdkBuilder.mappingTemplate(mappingTemplate)
    }

    /**
     * @param modifiedAt Returns a timestamp representing the date and time for the most recent
     * change for the transformer object.
     */
    override fun modifiedAt(modifiedAt: String) {
      cdkBuilder.modifiedAt(modifiedAt)
    }

    /**
     * @param name Returns the descriptive name for the transformer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sampleDocument Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data.
     */
    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformerProps,
  ) : CdkObject(cdkObject), CfnTransformerProps {
    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     */
    override fun ediType(): Any = unwrap(this).getEdiType()

    /**
     * Returns that the currently supported file formats for EDI transformations are `JSON` and
     * `XML` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     */
    override fun fileFormat(): String = unwrap(this).getFileFormat()

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     */
    override fun mappingTemplate(): String = unwrap(this).getMappingTemplate()

    /**
     * Returns a timestamp representing the date and time for the most recent change for the
     * transformer object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-modifiedat)
     */
    override fun modifiedAt(): String? = unwrap(this).getModifiedAt()

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     */
    override fun sampleDocument(): String? = unwrap(this).getSampleDocument()

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
        CfnTransformerProps = CdkObjectWrappers.wrap(cdkObject) as CfnTransformerProps

    internal fun unwrap(wrapped: CfnTransformerProps):
        software.amazon.awscdk.services.b2bi.CfnTransformerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnTransformerProps
  }
}
