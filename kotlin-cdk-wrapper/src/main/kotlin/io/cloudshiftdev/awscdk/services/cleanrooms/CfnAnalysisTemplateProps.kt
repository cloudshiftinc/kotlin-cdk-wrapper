@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * Properties for defining a `CfnAnalysisTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnAnalysisTemplateProps cfnAnalysisTemplateProps = CfnAnalysisTemplateProps.builder()
 * .format("format")
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * .source(AnalysisSourceProperty.builder()
 * .artifacts(AnalysisTemplateArtifactsProperty.builder()
 * .entryPoint(AnalysisTemplateArtifactProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .additionalArtifacts(List.of(AnalysisTemplateArtifactProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build()))
 * .build())
 * .text("text")
 * .build())
 * // the properties below are optional
 * .analysisParameters(List.of(AnalysisParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .build()))
 * .description("description")
 * .schema(AnalysisSchemaProperty.builder()
 * .referencedTables(List.of("referencedTables"))
 * .build())
 * .sourceMetadata(AnalysisSourceMetadataProperty.builder()
 * .artifacts(AnalysisTemplateArtifactMetadataProperty.builder()
 * .entryPointHash(HashProperty.builder()
 * .sha256("sha256")
 * .build())
 * // the properties below are optional
 * .additionalArtifactHashes(List.of(HashProperty.builder()
 * .sha256("sha256")
 * .build()))
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html)
 */
public interface CfnAnalysisTemplateProps {
  /**
   * The parameters of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
   */
  public fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  /**
   * The description of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The format of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
   */
  public fun format(): String

  /**
   * The identifier for a membership resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
   */
  public fun name(): String

  /**
   * The entire schema object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The source of the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
   */
  public fun source(): Any

  /**
   * The source metadata for the analysis template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
   */
  public fun sourceMetadata(): Any? = unwrap(this).getSourceMetadata()

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAnalysisTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: IResolvable)

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(analysisParameters: List<Any>)

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    public fun analysisParameters(vararg analysisParameters: Any)

    /**
     * @param description The description of the analysis template.
     */
    public fun description(description: String)

    /**
     * @param format The format of the analysis template. 
     */
    public fun format(format: String)

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of the analysis template. 
     */
    public fun name(name: String)

    /**
     * @param schema The entire schema object.
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema The entire schema object.
     */
    public fun schema(schema: CfnAnalysisTemplate.AnalysisSchemaProperty)

    /**
     * @param schema The entire schema object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40203d9a73fe74217243d2de4dee20042286da6553adcabd030f3c81e6ce04d7")
    public fun schema(schema: CfnAnalysisTemplate.AnalysisSchemaProperty.Builder.() -> Unit)

    /**
     * @param source The source of the analysis template. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The source of the analysis template. 
     */
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty)

    /**
     * @param source The source of the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit)

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    public fun sourceMetadata(sourceMetadata: IResolvable)

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    public fun sourceMetadata(sourceMetadata: CfnAnalysisTemplate.AnalysisSourceMetadataProperty)

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8209928b948aa4cae7a7fc72fe7645644f1a720e43c1bad4728afb3b8b039d9")
    public
        fun sourceMetadata(sourceMetadata: CfnAnalysisTemplate.AnalysisSourceMetadataProperty.Builder.() -> Unit)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.builder()

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(analysisParameters: IResolvable) {
      cdkBuilder.analysisParameters(analysisParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(analysisParameters: List<Any>) {
      cdkBuilder.analysisParameters(analysisParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param analysisParameters The parameters of the analysis template.
     */
    override fun analysisParameters(vararg analysisParameters: Any): Unit =
        analysisParameters(analysisParameters.toList())

    /**
     * @param description The description of the analysis template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param format The format of the analysis template. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the analysis template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schema The entire schema object.
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schema The entire schema object.
     */
    override fun schema(schema: CfnAnalysisTemplate.AnalysisSchemaProperty) {
      cdkBuilder.schema(schema.let(CfnAnalysisTemplate.AnalysisSchemaProperty.Companion::unwrap))
    }

    /**
     * @param schema The entire schema object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40203d9a73fe74217243d2de4dee20042286da6553adcabd030f3c81e6ce04d7")
    override fun schema(schema: CfnAnalysisTemplate.AnalysisSchemaProperty.Builder.() -> Unit): Unit
        = schema(CfnAnalysisTemplate.AnalysisSchemaProperty(schema))

    /**
     * @param source The source of the analysis template. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param source The source of the analysis template. 
     */
    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty) {
      cdkBuilder.source(source.let(CfnAnalysisTemplate.AnalysisSourceProperty.Companion::unwrap))
    }

    /**
     * @param source The source of the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit): Unit
        = source(CfnAnalysisTemplate.AnalysisSourceProperty(source))

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    override fun sourceMetadata(sourceMetadata: IResolvable) {
      cdkBuilder.sourceMetadata(sourceMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    override
        fun sourceMetadata(sourceMetadata: CfnAnalysisTemplate.AnalysisSourceMetadataProperty) {
      cdkBuilder.sourceMetadata(sourceMetadata.let(CfnAnalysisTemplate.AnalysisSourceMetadataProperty.Companion::unwrap))
    }

    /**
     * @param sourceMetadata The source metadata for the analysis template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8209928b948aa4cae7a7fc72fe7645644f1a720e43c1bad4728afb3b8b039d9")
    override
        fun sourceMetadata(sourceMetadata: CfnAnalysisTemplate.AnalysisSourceMetadataProperty.Builder.() -> Unit):
        Unit = sourceMetadata(CfnAnalysisTemplate.AnalysisSourceMetadataProperty(sourceMetadata))

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps,
  ) : CdkObject(cdkObject),
      CfnAnalysisTemplateProps {
    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     */
    override fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

    /**
     * The description of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The format of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
     */
    override fun format(): String = unwrap(this).getFormat()

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     */
    override fun schema(): Any? = unwrap(this).getSchema()

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     */
    override fun source(): Any = unwrap(this).getSource()

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     */
    override fun sourceMetadata(): Any? = unwrap(this).getSourceMetadata()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalysisTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps):
        CfnAnalysisTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnalysisTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisTemplateProps):
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps
  }
}
