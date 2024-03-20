@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Glue::Classifier` resource creates an AWS Glue classifier that categorizes data sources
 * and specifies schemas.
 *
 * For more information, see [Adding Classifiers to a
 * Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-classifier.html) and [Classifier
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-classifiers.html#aws-glue-api-crawler-classifiers-Classifier)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnClassifier cfnClassifier = CfnClassifier.Builder.create(this, "MyCfnClassifier")
 * .csvClassifier(CsvClassifierProperty.builder()
 * .allowSingleColumn(false)
 * .containsCustomDatatype(List.of("containsCustomDatatype"))
 * .containsHeader("containsHeader")
 * .customDatatypeConfigured(false)
 * .delimiter("delimiter")
 * .disableValueTrimming(false)
 * .header(List.of("header"))
 * .name("name")
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .grokClassifier(GrokClassifierProperty.builder()
 * .classification("classification")
 * .grokPattern("grokPattern")
 * // the properties below are optional
 * .customPatterns("customPatterns")
 * .name("name")
 * .build())
 * .jsonClassifier(JsonClassifierProperty.builder()
 * .jsonPath("jsonPath")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .xmlClassifier(XMLClassifierProperty.builder()
 * .classification("classification")
 * .rowTag("rowTag")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
 */
public open class CfnClassifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnClassifier,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.glue.CfnClassifier(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClassifierProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnClassifier(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnClassifierProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClassifierProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClassifierProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A classifier for comma-separated values (CSV).
   */
  public open fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

  /**
   * A classifier for comma-separated values (CSV).
   */
  public open fun csvClassifier(`value`: IResolvable) {
    unwrap(this).setCsvClassifier(`value`.let(IResolvable::unwrap))
  }

  /**
   * A classifier for comma-separated values (CSV).
   */
  public open fun csvClassifier(`value`: CsvClassifierProperty) {
    unwrap(this).setCsvClassifier(`value`.let(CsvClassifierProperty::unwrap))
  }

  /**
   * A classifier for comma-separated values (CSV).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d42a195581c9d7499e99e21bfa83b5e6c077e0646353b1d6f9ec36fd9b12d4")
  public open fun csvClassifier(`value`: CsvClassifierProperty.Builder.() -> Unit): Unit =
      csvClassifier(CsvClassifierProperty(`value`))

  /**
   * A classifier that uses `grok` .
   */
  public open fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

  /**
   * A classifier that uses `grok` .
   */
  public open fun grokClassifier(`value`: IResolvable) {
    unwrap(this).setGrokClassifier(`value`.let(IResolvable::unwrap))
  }

  /**
   * A classifier that uses `grok` .
   */
  public open fun grokClassifier(`value`: GrokClassifierProperty) {
    unwrap(this).setGrokClassifier(`value`.let(GrokClassifierProperty::unwrap))
  }

  /**
   * A classifier that uses `grok` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c25cd51d3a198da2df2a79387516cbcc747b5bc9228546a7337eb7e36b2e176")
  public open fun grokClassifier(`value`: GrokClassifierProperty.Builder.() -> Unit): Unit =
      grokClassifier(GrokClassifierProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A classifier for JSON content.
   */
  public open fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

  /**
   * A classifier for JSON content.
   */
  public open fun jsonClassifier(`value`: IResolvable) {
    unwrap(this).setJsonClassifier(`value`.let(IResolvable::unwrap))
  }

  /**
   * A classifier for JSON content.
   */
  public open fun jsonClassifier(`value`: JsonClassifierProperty) {
    unwrap(this).setJsonClassifier(`value`.let(JsonClassifierProperty::unwrap))
  }

  /**
   * A classifier for JSON content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0108531123dff689ff9883aaaafa8a8b195482264346a018d795f3c4650099f1")
  public open fun jsonClassifier(`value`: JsonClassifierProperty.Builder.() -> Unit): Unit =
      jsonClassifier(JsonClassifierProperty(`value`))

  /**
   * A classifier for XML content.
   */
  public open fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()

  /**
   * A classifier for XML content.
   */
  public open fun xmlClassifier(`value`: IResolvable) {
    unwrap(this).setXmlClassifier(`value`.let(IResolvable::unwrap))
  }

  /**
   * A classifier for XML content.
   */
  public open fun xmlClassifier(`value`: XMLClassifierProperty) {
    unwrap(this).setXmlClassifier(`value`.let(XMLClassifierProperty::unwrap))
  }

  /**
   * A classifier for XML content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f6703481404f179339b6132bf758a32462f982975c50b1d515696776f516f30")
  public open fun xmlClassifier(`value`: XMLClassifierProperty.Builder.() -> Unit): Unit =
      xmlClassifier(XMLClassifierProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnClassifier].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    public fun csvClassifier(csvClassifier: IResolvable)

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    public fun csvClassifier(csvClassifier: CsvClassifierProperty)

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60a6f760c1629132bf7a085003785fc36dc516fed7fc6bcd3e6d075ac4994736")
    public fun csvClassifier(csvClassifier: CsvClassifierProperty.Builder.() -> Unit)

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    public fun grokClassifier(grokClassifier: IResolvable)

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    public fun grokClassifier(grokClassifier: GrokClassifierProperty)

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8cd8b96e073bdb847bc460ed59f4f7357908441cfcd779bb731890445b35b2")
    public fun grokClassifier(grokClassifier: GrokClassifierProperty.Builder.() -> Unit)

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    public fun jsonClassifier(jsonClassifier: IResolvable)

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    public fun jsonClassifier(jsonClassifier: JsonClassifierProperty)

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5deea49f8ca1c3de74ecacde35e74f6854219187c2773523245488e79e45a4")
    public fun jsonClassifier(jsonClassifier: JsonClassifierProperty.Builder.() -> Unit)

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    public fun xmlClassifier(xmlClassifier: IResolvable)

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    public fun xmlClassifier(xmlClassifier: XMLClassifierProperty)

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23edc8214c9ed72c2206a65bc69461e3cbe1492253dd565ee3fd78fc1c82b19")
    public fun xmlClassifier(xmlClassifier: XMLClassifierProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnClassifier.Builder =
        software.amazon.awscdk.services.glue.CfnClassifier.Builder.create(scope, id)

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    override fun csvClassifier(csvClassifier: IResolvable) {
      cdkBuilder.csvClassifier(csvClassifier.let(IResolvable::unwrap))
    }

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    override fun csvClassifier(csvClassifier: CsvClassifierProperty) {
      cdkBuilder.csvClassifier(csvClassifier.let(CsvClassifierProperty::unwrap))
    }

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     * @param csvClassifier A classifier for comma-separated values (CSV). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60a6f760c1629132bf7a085003785fc36dc516fed7fc6bcd3e6d075ac4994736")
    override fun csvClassifier(csvClassifier: CsvClassifierProperty.Builder.() -> Unit): Unit =
        csvClassifier(CsvClassifierProperty(csvClassifier))

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    override fun grokClassifier(grokClassifier: IResolvable) {
      cdkBuilder.grokClassifier(grokClassifier.let(IResolvable::unwrap))
    }

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    override fun grokClassifier(grokClassifier: GrokClassifierProperty) {
      cdkBuilder.grokClassifier(grokClassifier.let(GrokClassifierProperty::unwrap))
    }

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     * @param grokClassifier A classifier that uses `grok` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8cd8b96e073bdb847bc460ed59f4f7357908441cfcd779bb731890445b35b2")
    override fun grokClassifier(grokClassifier: GrokClassifierProperty.Builder.() -> Unit): Unit =
        grokClassifier(GrokClassifierProperty(grokClassifier))

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    override fun jsonClassifier(jsonClassifier: IResolvable) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(IResolvable::unwrap))
    }

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    override fun jsonClassifier(jsonClassifier: JsonClassifierProperty) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(JsonClassifierProperty::unwrap))
    }

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     * @param jsonClassifier A classifier for JSON content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5deea49f8ca1c3de74ecacde35e74f6854219187c2773523245488e79e45a4")
    override fun jsonClassifier(jsonClassifier: JsonClassifierProperty.Builder.() -> Unit): Unit =
        jsonClassifier(JsonClassifierProperty(jsonClassifier))

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    override fun xmlClassifier(xmlClassifier: IResolvable) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(IResolvable::unwrap))
    }

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    override fun xmlClassifier(xmlClassifier: XMLClassifierProperty) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(XMLClassifierProperty::unwrap))
    }

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     * @param xmlClassifier A classifier for XML content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23edc8214c9ed72c2206a65bc69461e3cbe1492253dd565ee3fd78fc1c82b19")
    override fun xmlClassifier(xmlClassifier: XMLClassifierProperty.Builder.() -> Unit): Unit =
        xmlClassifier(XMLClassifierProperty(xmlClassifier))

    public fun build(): software.amazon.awscdk.services.glue.CfnClassifier = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnClassifier.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClassifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClassifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier): CfnClassifier
        = CfnClassifier(cdkObject)

    internal fun unwrap(wrapped: CfnClassifier): software.amazon.awscdk.services.glue.CfnClassifier
        = wrapped.cdkObject
  }

  /**
   * A classifier for `JSON` content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * JsonClassifierProperty jsonClassifierProperty = JsonClassifierProperty.builder()
   * .jsonPath("jsonPath")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html)
   */
  public interface JsonClassifierProperty {
    /**
     * A `JsonPath` string defining the JSON data for the classifier to classify.
     *
     * AWS Glue supports a subset of `JsonPath` , as described in [Writing JsonPath Custom
     * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath)
     */
    public fun jsonPath(): String

    /**
     * The name of the classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [JsonClassifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify. 
       * AWS Glue supports a subset of `JsonPath` , as described in [Writing JsonPath Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
       * .
       */
      public fun jsonPath(jsonPath: String)

      /**
       * @param name The name of the classifier.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.builder()

      /**
       * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify. 
       * AWS Glue supports a subset of `JsonPath` , as described in [Writing JsonPath Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
       * .
       */
      override fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
      }

      /**
       * @param name The name of the classifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty,
    ) : CdkObject(cdkObject), JsonClassifierProperty {
      /**
       * A `JsonPath` string defining the JSON data for the classifier to classify.
       *
       * AWS Glue supports a subset of `JsonPath` , as described in [Writing JsonPath Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath)
       */
      override fun jsonPath(): String = unwrap(this).getJsonPath()

      /**
       * The name of the classifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty):
          JsonClassifierProperty = CdkObjectWrappers.wrap(cdkObject) as? JsonClassifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty
    }
  }

  /**
   * A classifier that uses `grok` patterns.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * GrokClassifierProperty grokClassifierProperty = GrokClassifierProperty.builder()
   * .classification("classification")
   * .grokPattern("grokPattern")
   * // the properties below are optional
   * .customPatterns("customPatterns")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html)
   */
  public interface GrokClassifierProperty {
    /**
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture
     * logs, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
     */
    public fun classification(): String

    /**
     * Optional custom grok patterns defined by this classifier.
     *
     * For more information, see custom patterns in [Writing Custom
     * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
     */
    public fun customPatterns(): String? = unwrap(this).getCustomPatterns()

    /**
     * The grok pattern applied to a data store by this classifier.
     *
     * For more information, see built-in patterns in [Writing Custom
     * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
     */
    public fun grokPattern(): String

    /**
     * The name of the classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [GrokClassifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification An identifier of the data format that the classifier matches, such as
       * Twitter, JSON, Omniture logs, and so on. 
       */
      public fun classification(classification: String)

      /**
       * @param customPatterns Optional custom grok patterns defined by this classifier.
       * For more information, see custom patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       */
      public fun customPatterns(customPatterns: String)

      /**
       * @param grokPattern The grok pattern applied to a data store by this classifier. 
       * For more information, see built-in patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       */
      public fun grokPattern(grokPattern: String)

      /**
       * @param name The name of the classifier.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.builder()

      /**
       * @param classification An identifier of the data format that the classifier matches, such as
       * Twitter, JSON, Omniture logs, and so on. 
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param customPatterns Optional custom grok patterns defined by this classifier.
       * For more information, see custom patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       */
      override fun customPatterns(customPatterns: String) {
        cdkBuilder.customPatterns(customPatterns)
      }

      /**
       * @param grokPattern The grok pattern applied to a data store by this classifier. 
       * For more information, see built-in patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       */
      override fun grokPattern(grokPattern: String) {
        cdkBuilder.grokPattern(grokPattern)
      }

      /**
       * @param name The name of the classifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty,
    ) : CdkObject(cdkObject), GrokClassifierProperty {
      /**
       * An identifier of the data format that the classifier matches, such as Twitter, JSON,
       * Omniture logs, and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
       */
      override fun classification(): String = unwrap(this).getClassification()

      /**
       * Optional custom grok patterns defined by this classifier.
       *
       * For more information, see custom patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
       */
      override fun customPatterns(): String? = unwrap(this).getCustomPatterns()

      /**
       * The grok pattern applied to a data store by this classifier.
       *
       * For more information, see built-in patterns in [Writing Custom
       * Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
       */
      override fun grokPattern(): String = unwrap(this).getGrokPattern()

      /**
       * The name of the classifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrokClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty):
          GrokClassifierProperty = CdkObjectWrappers.wrap(cdkObject) as? GrokClassifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrokClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty
    }
  }

  /**
   * A classifier for custom `CSV` content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * CsvClassifierProperty csvClassifierProperty = CsvClassifierProperty.builder()
   * .allowSingleColumn(false)
   * .containsCustomDatatype(List.of("containsCustomDatatype"))
   * .containsHeader("containsHeader")
   * .customDatatypeConfigured(false)
   * .delimiter("delimiter")
   * .disableValueTrimming(false)
   * .header(List.of("header"))
   * .name("name")
   * .quoteSymbol("quoteSymbol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html)
   */
  public interface CsvClassifierProperty {
    /**
     * Enables the processing of files that contain only one column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn)
     */
    public fun allowSingleColumn(): Any? = unwrap(this).getAllowSingleColumn()

    /**
     * Indicates whether the CSV file contains custom data types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containscustomdatatype)
     */
    public fun containsCustomDatatype(): List<String> = unwrap(this).getContainsCustomDatatype() ?:
        emptyList()

    /**
     * Indicates whether the CSV file contains a header.
     *
     * A value of `UNKNOWN` specifies that the classifier will detect whether the CSV file contains
     * headings.
     *
     * A value of `PRESENT` specifies that the CSV file contains headings.
     *
     * A value of `ABSENT` specifies that the CSV file does not contain headings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader)
     */
    public fun containsHeader(): String? = unwrap(this).getContainsHeader()

    /**
     * Enables the configuration of custom data types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-customdatatypeconfigured)
     */
    public fun customDatatypeConfigured(): Any? = unwrap(this).getCustomDatatypeConfigured()

    /**
     * A custom symbol to denote what separates each column entry in the row.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * Specifies not to trim values before identifying the type of column values.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming)
     */
    public fun disableValueTrimming(): Any? = unwrap(this).getDisableValueTrimming()

    /**
     * A list of strings representing column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header)
     */
    public fun `header`(): List<String> = unwrap(this).getHeader() ?: emptyList()

    /**
     * The name of the classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A custom symbol to denote what combines content into a single column value.
     *
     * It must be different from the column delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol)
     */
    public fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()

    /**
     * A builder for [CsvClassifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowSingleColumn Enables the processing of files that contain only one column.
       */
      public fun allowSingleColumn(allowSingleColumn: Boolean)

      /**
       * @param allowSingleColumn Enables the processing of files that contain only one column.
       */
      public fun allowSingleColumn(allowSingleColumn: IResolvable)

      /**
       * @param containsCustomDatatype Indicates whether the CSV file contains custom data types.
       */
      public fun containsCustomDatatype(containsCustomDatatype: List<String>)

      /**
       * @param containsCustomDatatype Indicates whether the CSV file contains custom data types.
       */
      public fun containsCustomDatatype(vararg containsCustomDatatype: String)

      /**
       * @param containsHeader Indicates whether the CSV file contains a header.
       * A value of `UNKNOWN` specifies that the classifier will detect whether the CSV file
       * contains headings.
       *
       * A value of `PRESENT` specifies that the CSV file contains headings.
       *
       * A value of `ABSENT` specifies that the CSV file does not contain headings.
       */
      public fun containsHeader(containsHeader: String)

      /**
       * @param customDatatypeConfigured Enables the configuration of custom data types.
       */
      public fun customDatatypeConfigured(customDatatypeConfigured: Boolean)

      /**
       * @param customDatatypeConfigured Enables the configuration of custom data types.
       */
      public fun customDatatypeConfigured(customDatatypeConfigured: IResolvable)

      /**
       * @param delimiter A custom symbol to denote what separates each column entry in the row.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param disableValueTrimming Specifies not to trim values before identifying the type of
       * column values.
       * The default value is `true` .
       */
      public fun disableValueTrimming(disableValueTrimming: Boolean)

      /**
       * @param disableValueTrimming Specifies not to trim values before identifying the type of
       * column values.
       * The default value is `true` .
       */
      public fun disableValueTrimming(disableValueTrimming: IResolvable)

      /**
       * @param header A list of strings representing column names.
       */
      public fun `header`(`header`: List<String>)

      /**
       * @param header A list of strings representing column names.
       */
      public fun `header`(vararg `header`: String)

      /**
       * @param name The name of the classifier.
       */
      public fun name(name: String)

      /**
       * @param quoteSymbol A custom symbol to denote what combines content into a single column
       * value.
       * It must be different from the column delimiter.
       */
      public fun quoteSymbol(quoteSymbol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty.builder()

      /**
       * @param allowSingleColumn Enables the processing of files that contain only one column.
       */
      override fun allowSingleColumn(allowSingleColumn: Boolean) {
        cdkBuilder.allowSingleColumn(allowSingleColumn)
      }

      /**
       * @param allowSingleColumn Enables the processing of files that contain only one column.
       */
      override fun allowSingleColumn(allowSingleColumn: IResolvable) {
        cdkBuilder.allowSingleColumn(allowSingleColumn.let(IResolvable::unwrap))
      }

      /**
       * @param containsCustomDatatype Indicates whether the CSV file contains custom data types.
       */
      override fun containsCustomDatatype(containsCustomDatatype: List<String>) {
        cdkBuilder.containsCustomDatatype(containsCustomDatatype)
      }

      /**
       * @param containsCustomDatatype Indicates whether the CSV file contains custom data types.
       */
      override fun containsCustomDatatype(vararg containsCustomDatatype: String): Unit =
          containsCustomDatatype(containsCustomDatatype.toList())

      /**
       * @param containsHeader Indicates whether the CSV file contains a header.
       * A value of `UNKNOWN` specifies that the classifier will detect whether the CSV file
       * contains headings.
       *
       * A value of `PRESENT` specifies that the CSV file contains headings.
       *
       * A value of `ABSENT` specifies that the CSV file does not contain headings.
       */
      override fun containsHeader(containsHeader: String) {
        cdkBuilder.containsHeader(containsHeader)
      }

      /**
       * @param customDatatypeConfigured Enables the configuration of custom data types.
       */
      override fun customDatatypeConfigured(customDatatypeConfigured: Boolean) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured)
      }

      /**
       * @param customDatatypeConfigured Enables the configuration of custom data types.
       */
      override fun customDatatypeConfigured(customDatatypeConfigured: IResolvable) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured.let(IResolvable::unwrap))
      }

      /**
       * @param delimiter A custom symbol to denote what separates each column entry in the row.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param disableValueTrimming Specifies not to trim values before identifying the type of
       * column values.
       * The default value is `true` .
       */
      override fun disableValueTrimming(disableValueTrimming: Boolean) {
        cdkBuilder.disableValueTrimming(disableValueTrimming)
      }

      /**
       * @param disableValueTrimming Specifies not to trim values before identifying the type of
       * column values.
       * The default value is `true` .
       */
      override fun disableValueTrimming(disableValueTrimming: IResolvable) {
        cdkBuilder.disableValueTrimming(disableValueTrimming.let(IResolvable::unwrap))
      }

      /**
       * @param header A list of strings representing column names.
       */
      override fun `header`(`header`: List<String>) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param header A list of strings representing column names.
       */
      override fun `header`(vararg `header`: String): Unit = `header`(`header`.toList())

      /**
       * @param name The name of the classifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param quoteSymbol A custom symbol to denote what combines content into a single column
       * value.
       * It must be different from the column delimiter.
       */
      override fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty,
    ) : CdkObject(cdkObject), CsvClassifierProperty {
      /**
       * Enables the processing of files that contain only one column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-allowsinglecolumn)
       */
      override fun allowSingleColumn(): Any? = unwrap(this).getAllowSingleColumn()

      /**
       * Indicates whether the CSV file contains custom data types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containscustomdatatype)
       */
      override fun containsCustomDatatype(): List<String> = unwrap(this).getContainsCustomDatatype()
          ?: emptyList()

      /**
       * Indicates whether the CSV file contains a header.
       *
       * A value of `UNKNOWN` specifies that the classifier will detect whether the CSV file
       * contains headings.
       *
       * A value of `PRESENT` specifies that the CSV file contains headings.
       *
       * A value of `ABSENT` specifies that the CSV file does not contain headings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-containsheader)
       */
      override fun containsHeader(): String? = unwrap(this).getContainsHeader()

      /**
       * Enables the configuration of custom data types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-customdatatypeconfigured)
       */
      override fun customDatatypeConfigured(): Any? = unwrap(this).getCustomDatatypeConfigured()

      /**
       * A custom symbol to denote what separates each column entry in the row.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * Specifies not to trim values before identifying the type of column values.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-disablevaluetrimming)
       */
      override fun disableValueTrimming(): Any? = unwrap(this).getDisableValueTrimming()

      /**
       * A list of strings representing column names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-header)
       */
      override fun `header`(): List<String> = unwrap(this).getHeader() ?: emptyList()

      /**
       * The name of the classifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A custom symbol to denote what combines content into a single column value.
       *
       * It must be different from the column delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html#cfn-glue-classifier-csvclassifier-quotesymbol)
       */
      override fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty):
          CsvClassifierProperty = CdkObjectWrappers.wrap(cdkObject) as? CsvClassifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty
    }
  }

  /**
   * A classifier for `XML` content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * XMLClassifierProperty xMLClassifierProperty = XMLClassifierProperty.builder()
   * .classification("classification")
   * .rowTag("rowTag")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html)
   */
  public interface XMLClassifierProperty {
    /**
     * An identifier of the data format that the classifier matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification)
     */
    public fun classification(): String

    /**
     * The name of the classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The XML tag designating the element that contains each record in an XML document being
     * parsed.
     *
     * This can't identify a self-closing element (closed by `/&gt;` ). An empty row element that
     * contains only attributes can be parsed as long as it ends with a closing tag (for example,
     * `&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;` is okay, but `&lt;row item_a="A" item_b="B"
     * /&gt;` is not).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag)
     */
    public fun rowTag(): String

    /**
     * A builder for [XMLClassifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification An identifier of the data format that the classifier matches. 
       */
      public fun classification(classification: String)

      /**
       * @param name The name of the classifier.
       */
      public fun name(name: String)

      /**
       * @param rowTag The XML tag designating the element that contains each record in an XML
       * document being parsed. 
       * This can't identify a self-closing element (closed by `/&gt;` ). An empty row element that
       * contains only attributes can be parsed as long as it ends with a closing tag (for example,
       * `&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;` is okay, but `&lt;row item_a="A" item_b="B"
       * /&gt;` is not).
       */
      public fun rowTag(rowTag: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.builder()

      /**
       * @param classification An identifier of the data format that the classifier matches. 
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param name The name of the classifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param rowTag The XML tag designating the element that contains each record in an XML
       * document being parsed. 
       * This can't identify a self-closing element (closed by `/&gt;` ). An empty row element that
       * contains only attributes can be parsed as long as it ends with a closing tag (for example,
       * `&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;` is okay, but `&lt;row item_a="A" item_b="B"
       * /&gt;` is not).
       */
      override fun rowTag(rowTag: String) {
        cdkBuilder.rowTag(rowTag)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty,
    ) : CdkObject(cdkObject), XMLClassifierProperty {
      /**
       * An identifier of the data format that the classifier matches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification)
       */
      override fun classification(): String = unwrap(this).getClassification()

      /**
       * The name of the classifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The XML tag designating the element that contains each record in an XML document being
       * parsed.
       *
       * This can't identify a self-closing element (closed by `/&gt;` ). An empty row element that
       * contains only attributes can be parsed as long as it ends with a closing tag (for example,
       * `&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;` is okay, but `&lt;row item_a="A" item_b="B"
       * /&gt;` is not).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag)
       */
      override fun rowTag(): String = unwrap(this).getRowTag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): XMLClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty):
          XMLClassifierProperty = CdkObjectWrappers.wrap(cdkObject) as? XMLClassifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: XMLClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty
    }
  }
}
