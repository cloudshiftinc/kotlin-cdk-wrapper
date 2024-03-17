@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnClassifier`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnClassifierProps cfnClassifierProps = CfnClassifierProps.builder()
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
public interface CfnClassifierProps {
  /**
   * A classifier for comma-separated values (CSV).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
   */
  public fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

  /**
   * A classifier that uses `grok` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
   */
  public fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

  /**
   * A classifier for JSON content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
   */
  public fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

  /**
   * A classifier for XML content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
   */
  public fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()

  /**
   * A builder for [CfnClassifierProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    public fun csvClassifier(csvClassifier: IResolvable)

    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty)

    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7559b7c2b913f0afc5a442b810dc5a7adf35815d2973a0b9b255b6e565168595")
    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty.Builder.() -> Unit)

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    public fun grokClassifier(grokClassifier: IResolvable)

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty)

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d8f13e8767596333d6fe10a942ea6a7c64b4e6fa5e982df49b75f2124506ce")
    public
        fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit)

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    public fun jsonClassifier(jsonClassifier: IResolvable)

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty)

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ff448ecc147eb235b6df53d9e732339c04409d6a37ccf00c5afff7459a9e0a9")
    public
        fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty.Builder.() -> Unit)

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    public fun xmlClassifier(xmlClassifier: IResolvable)

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty)

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a4c9481a500041da74fef2eaa130373aace84cf1e2307b3a4a198a612a78e2")
    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnClassifierProps.Builder =
        software.amazon.awscdk.services.glue.CfnClassifierProps.builder()

    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    override fun csvClassifier(csvClassifier: IResolvable) {
      cdkBuilder.csvClassifier(csvClassifier.let(IResolvable::unwrap))
    }

    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    override fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
      cdkBuilder.csvClassifier(csvClassifier.let(CfnClassifier.CsvClassifierProperty::unwrap))
    }

    /**
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7559b7c2b913f0afc5a442b810dc5a7adf35815d2973a0b9b255b6e565168595")
    override
        fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty.Builder.() -> Unit):
        Unit = csvClassifier(CfnClassifier.CsvClassifierProperty(csvClassifier))

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    override fun grokClassifier(grokClassifier: IResolvable) {
      cdkBuilder.grokClassifier(grokClassifier.let(IResolvable::unwrap))
    }

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    override fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
      cdkBuilder.grokClassifier(grokClassifier.let(CfnClassifier.GrokClassifierProperty::unwrap))
    }

    /**
     * @param grokClassifier A classifier that uses `grok` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d8f13e8767596333d6fe10a942ea6a7c64b4e6fa5e982df49b75f2124506ce")
    override
        fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit):
        Unit = grokClassifier(CfnClassifier.GrokClassifierProperty(grokClassifier))

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    override fun jsonClassifier(jsonClassifier: IResolvable) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(IResolvable::unwrap))
    }

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    override fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(CfnClassifier.JsonClassifierProperty::unwrap))
    }

    /**
     * @param jsonClassifier A classifier for JSON content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ff448ecc147eb235b6df53d9e732339c04409d6a37ccf00c5afff7459a9e0a9")
    override
        fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty.Builder.() -> Unit):
        Unit = jsonClassifier(CfnClassifier.JsonClassifierProperty(jsonClassifier))

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    override fun xmlClassifier(xmlClassifier: IResolvable) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(IResolvable::unwrap))
    }

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    override fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(CfnClassifier.XMLClassifierProperty::unwrap))
    }

    /**
     * @param xmlClassifier A classifier for XML content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a4c9481a500041da74fef2eaa130373aace84cf1e2307b3a4a198a612a78e2")
    override
        fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty.Builder.() -> Unit):
        Unit = xmlClassifier(CfnClassifier.XMLClassifierProperty(xmlClassifier))

    public fun build(): software.amazon.awscdk.services.glue.CfnClassifierProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnClassifierProps,
  ) : CdkObject(cdkObject), CfnClassifierProps {
    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     */
    override fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     */
    override fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     */
    override fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     */
    override fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClassifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifierProps):
        CfnClassifierProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClassifierProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClassifierProps):
        software.amazon.awscdk.services.glue.CfnClassifierProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnClassifierProps
  }
}
