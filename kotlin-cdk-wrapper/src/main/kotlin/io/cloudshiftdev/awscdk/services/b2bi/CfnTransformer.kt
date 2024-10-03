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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a transformer.
 *
 * A transformer describes how to process the incoming EDI documents and extract the necessary
 * information to the output file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnTransformer cfnTransformer = CfnTransformer.Builder.create(this, "MyCfnTransformer")
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
   * Returns the details for the EDI standard that is being used for the transformer.
   */
  public open fun ediType(): Any = unwrap(this).getEdiType()

  /**
   * Returns the details for the EDI standard that is being used for the transformer.
   */
  public open fun ediType(`value`: IResolvable) {
    unwrap(this).setEdiType(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Returns the details for the EDI standard that is being used for the transformer.
   */
  public open fun ediType(`value`: EdiTypeProperty) {
    unwrap(this).setEdiType(`value`.let(EdiTypeProperty.Companion::unwrap))
  }

  /**
   * Returns the details for the EDI standard that is being used for the transformer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29258a7ce16a2d224867c8765eb0a3ee84d47c152f097310fd6e8b6ac2af3c9e")
  public open fun ediType(`value`: EdiTypeProperty.Builder.() -> Unit): Unit =
      ediType(EdiTypeProperty(`value`))

  /**
   * Returns that the currently supported file formats for EDI transformations are `JSON` and `XML`
   * .
   */
  public open fun fileFormat(): String = unwrap(this).getFileFormat()

  /**
   * Returns that the currently supported file formats for EDI transformations are `JSON` and `XML`
   * .
   */
  public open fun fileFormat(`value`: String) {
    unwrap(this).setFileFormat(`value`)
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
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   */
  public open fun mappingTemplate(): String = unwrap(this).getMappingTemplate()

  /**
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   */
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
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   */
  public open fun sampleDocument(): String? = unwrap(this).getSampleDocument()

  /**
   * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
   * data.
   */
  public open fun sampleDocument(`value`: String) {
    unwrap(this).setSampleDocument(`value`)
  }

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
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    public fun ediType(ediType: IResolvable)

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    public fun ediType(ediType: EdiTypeProperty)

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    public fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit)

    /**
     * Returns that the currently supported file formats for EDI transformations are `JSON` and
     * `XML` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     * @param fileFormat Returns that the currently supported file formats for EDI transformations
     * are `JSON` and `XML` . 
     */
    public fun fileFormat(fileFormat: String)

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     * @param mappingTemplate Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
    public fun mappingTemplate(mappingTemplate: String)

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     * @param name Returns the descriptive name for the transformer. 
     */
    public fun name(name: String)

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     * @param sampleDocument Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
    public fun sampleDocument(sampleDocument: String)

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
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable.Companion::unwrap))
    }

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    override fun ediType(ediType: EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(EdiTypeProperty.Companion::unwrap))
    }

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     * @param ediType Returns the details for the EDI standard that is being used for the
     * transformer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    override fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(EdiTypeProperty(ediType))

    /**
     * Returns that the currently supported file formats for EDI transformations are `JSON` and
     * `XML` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     * @param fileFormat Returns that the currently supported file formats for EDI transformations
     * are `JSON` and `XML` . 
     */
    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     * @param mappingTemplate Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
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
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     * @param sampleDocument Returns a sample EDI document that is used by a transformer as a guide
     * for processing the EDI data. 
     */
    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

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
   * Specifies the details for the EDI standard that is being used for the transformer.
   *
   * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
   * define specific business documents.
   *
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
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-editype.html#cfn-b2bi-transformer-editype-x12details)
     */
    public fun x12Details(): Any

    /**
     * A builder for [EdiTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      public fun x12Details(x12Details: IResolvable)

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      public fun x12Details(x12Details: X12DetailsProperty)

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
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
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      override fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       */
      override fun x12Details(x12Details: X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details.let(X12DetailsProperty.Companion::unwrap))
      }

      /**
       * @param x12Details Returns the details for the EDI standard that is being used for the
       * transformer. 
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
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
       * Returns the details for the EDI standard that is being used for the transformer.
       *
       * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
       * define specific business documents.
       *
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
}
