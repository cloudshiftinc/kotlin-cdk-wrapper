@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
 * Creates a new analysis template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnAnalysisTemplate cfnAnalysisTemplate = CfnAnalysisTemplate.Builder.create(this,
 * "MyCfnAnalysisTemplate")
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
public open class CfnAnalysisTemplate(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnalysisTemplateProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAnalysisTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnalysisTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAnalysisTemplateProps(props)
  )

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(`value`: IResolvable) {
    unwrap(this).setAnalysisParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(`value`: List<Any>) {
    unwrap(this).setAnalysisParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(vararg `value`: Any): Unit =
      analysisParameters(`value`.toList())

  /**
   * Returns the identifier for the analysis template.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE2222`
   */
  public open fun attrAnalysisTemplateIdentifier(): String =
      unwrap(this).getAttrAnalysisTemplateIdentifier()

  /**
   * Returns the Amazon Resource Name (ARN) of the analysis template.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:membership/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111/analysistemplates/a1b2c3d4-5678-90ab-cdef-EXAMPLE2222`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the unique ARN for the analysis template’s associated collaboration.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:collaboration/a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  /**
   * Returns the unique ID for the associated collaboration of the analysis template.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  /**
   * Returns the Amazon Resource Name (ARN) of the member who created the analysis template.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:membership/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
   */
  public open fun attrMembershipArn(): String = unwrap(this).getAttrMembershipArn()

  /**
   *
   */
  public open fun attrSchema(): IResolvable = unwrap(this).getAttrSchema().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrSchemaReferencedTables(): List<String> =
      unwrap(this).getAttrSchemaReferencedTables()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the analysis template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the analysis template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The format of the analysis template.
   */
  public open fun format(): String = unwrap(this).getFormat()

  /**
   * The format of the analysis template.
   */
  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
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
   * The identifier for a membership resource.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The identifier for a membership resource.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * The name of the analysis template.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the analysis template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The entire schema object.
   */
  public open fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The entire schema object.
   */
  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The entire schema object.
   */
  public open fun schema(`value`: AnalysisSchemaProperty) {
    unwrap(this).setSchema(`value`.let(AnalysisSchemaProperty.Companion::unwrap))
  }

  /**
   * The entire schema object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d461ee8d2ebcc51cd697698839c7c12136e8593e449420f7f9c9fd6aa5f791d")
  public open fun schema(`value`: AnalysisSchemaProperty.Builder.() -> Unit): Unit =
      schema(AnalysisSchemaProperty(`value`))

  /**
   * The source of the analysis template.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The source of the analysis template.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The source of the analysis template.
   */
  public open fun source(`value`: AnalysisSourceProperty) {
    unwrap(this).setSource(`value`.let(AnalysisSourceProperty.Companion::unwrap))
  }

  /**
   * The source of the analysis template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("997162caadb96ba6b460c4c52a6c9188fe25ed68b37dcf8f64d12c265909dd23")
  public open fun source(`value`: AnalysisSourceProperty.Builder.() -> Unit): Unit =
      source(AnalysisSourceProperty(`value`))

  /**
   * The source metadata for the analysis template.
   */
  public open fun sourceMetadata(): Any? = unwrap(this).getSourceMetadata()

  /**
   * The source metadata for the analysis template.
   */
  public open fun sourceMetadata(`value`: IResolvable) {
    unwrap(this).setSourceMetadata(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The source metadata for the analysis template.
   */
  public open fun sourceMetadata(`value`: AnalysisSourceMetadataProperty) {
    unwrap(this).setSourceMetadata(`value`.let(AnalysisSourceMetadataProperty.Companion::unwrap))
  }

  /**
   * The source metadata for the analysis template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("de6175ce3eb33ecbd54bf48af0a7921c46d2a76446acb6eac77e0b4f060e02d3")
  public open fun sourceMetadata(`value`: AnalysisSourceMetadataProperty.Builder.() -> Unit): Unit =
      sourceMetadata(AnalysisSourceMetadataProperty(`value`))

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanrooms.CfnAnalysisTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    public fun analysisParameters(analysisParameters: IResolvable)

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    public fun analysisParameters(analysisParameters: List<Any>)

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    public fun analysisParameters(vararg analysisParameters: Any)

    /**
     * The description of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
     * @param description The description of the analysis template. 
     */
    public fun description(description: String)

    /**
     * The format of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
     * @param format The format of the analysis template. 
     */
    public fun format(format: String)

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * The name of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
     * @param name The name of the analysis template. 
     */
    public fun name(name: String)

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    public fun schema(schema: IResolvable)

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    public fun schema(schema: AnalysisSchemaProperty)

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("297d834c4f30a35948549893b5556f89397bed8bdca1d5f750ed9f113cb48e54")
    public fun schema(schema: AnalysisSchemaProperty.Builder.() -> Unit)

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    public fun source(source: IResolvable)

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    public fun source(source: AnalysisSourceProperty)

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    public fun source(source: AnalysisSourceProperty.Builder.() -> Unit)

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    public fun sourceMetadata(sourceMetadata: IResolvable)

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    public fun sourceMetadata(sourceMetadata: AnalysisSourceMetadataProperty)

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("351f73b93a3b5be1ed4d5005f28e7060b69946afacf01663a40cd83024d48be3")
    public fun sourceMetadata(sourceMetadata: AnalysisSourceMetadataProperty.Builder.() -> Unit)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.Builder.create(scope, id)

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    override fun analysisParameters(analysisParameters: IResolvable) {
      cdkBuilder.analysisParameters(analysisParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    override fun analysisParameters(analysisParameters: List<Any>) {
      cdkBuilder.analysisParameters(analysisParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    override fun analysisParameters(vararg analysisParameters: Any): Unit =
        analysisParameters(analysisParameters.toList())

    /**
     * The description of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-description)
     * @param description The description of the analysis template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The format of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-format)
     * @param format The format of the analysis template. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * The identifier for a membership resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-membershipidentifier)
     * @param membershipIdentifier The identifier for a membership resource. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-name)
     * @param name The name of the analysis template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    override fun schema(schema: AnalysisSchemaProperty) {
      cdkBuilder.schema(schema.let(AnalysisSchemaProperty.Companion::unwrap))
    }

    /**
     * The entire schema object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-schema)
     * @param schema The entire schema object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("297d834c4f30a35948549893b5556f89397bed8bdca1d5f750ed9f113cb48e54")
    override fun schema(schema: AnalysisSchemaProperty.Builder.() -> Unit): Unit =
        schema(AnalysisSchemaProperty(schema))

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    override fun source(source: AnalysisSourceProperty) {
      cdkBuilder.source(source.let(AnalysisSourceProperty.Companion::unwrap))
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    override fun source(source: AnalysisSourceProperty.Builder.() -> Unit): Unit =
        source(AnalysisSourceProperty(source))

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    override fun sourceMetadata(sourceMetadata: IResolvable) {
      cdkBuilder.sourceMetadata(sourceMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    override fun sourceMetadata(sourceMetadata: AnalysisSourceMetadataProperty) {
      cdkBuilder.sourceMetadata(sourceMetadata.let(AnalysisSourceMetadataProperty.Companion::unwrap))
    }

    /**
     * The source metadata for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-sourcemetadata)
     * @param sourceMetadata The source metadata for the analysis template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("351f73b93a3b5be1ed4d5005f28e7060b69946afacf01663a40cd83024d48be3")
    override fun sourceMetadata(sourceMetadata: AnalysisSourceMetadataProperty.Builder.() -> Unit):
        Unit = sourceMetadata(AnalysisSourceMetadataProperty(sourceMetadata))

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnalysisTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnalysisTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate):
        CfnAnalysisTemplate = CfnAnalysisTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisTemplate):
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate
  }

  /**
   * Optional.
   *
   * The member who can query can provide this placeholder for a literal data value in an analysis
   * template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisParameterProperty analysisParameterProperty = AnalysisParameterProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .defaultValue("defaultValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html)
   */
  public interface AnalysisParameterProperty {
    /**
     * Optional.
     *
     * The default value that is applied in the analysis template. The member who can query can
     * override this value in the query editor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The name of the parameter.
     *
     * The name must use only alphanumeric, underscore (_), or hyphen (-) characters but cannot
     * start or end with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-name)
     */
    public fun name(): String

    /**
     * The type of parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-type)
     */
    public fun type(): String

    /**
     * A builder for [AnalysisParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue Optional.
       * The default value that is applied in the analysis template. The member who can query can
       * override this value in the query editor.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param name The name of the parameter. 
       * The name must use only alphanumeric, underscore (_), or hyphen (-) characters but cannot
       * start or end with a hyphen.
       */
      public fun name(name: String)

      /**
       * @param type The type of parameter. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty.builder()

      /**
       * @param defaultValue Optional.
       * The default value that is applied in the analysis template. The member who can query can
       * override this value in the query editor.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param name The name of the parameter. 
       * The name must use only alphanumeric, underscore (_), or hyphen (-) characters but cannot
       * start or end with a hyphen.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of parameter. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty,
    ) : CdkObject(cdkObject),
        AnalysisParameterProperty {
      /**
       * Optional.
       *
       * The default value that is applied in the analysis template. The member who can query can
       * override this value in the query editor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The name of the parameter.
       *
       * The name must use only alphanumeric, underscore (_), or hyphen (-) characters but cannot
       * start or end with a hyphen.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html#cfn-cleanrooms-analysistemplate-analysisparameter-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty):
          AnalysisParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisParameterProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty
    }
  }

  /**
   * A relation within an analysis.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisSchemaProperty analysisSchemaProperty = AnalysisSchemaProperty.builder()
   * .referencedTables(List.of("referencedTables"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisschema.html)
   */
  public interface AnalysisSchemaProperty {
    /**
     * The tables referenced in the analysis schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisschema.html#cfn-cleanrooms-analysistemplate-analysisschema-referencedtables)
     */
    public fun referencedTables(): List<String>

    /**
     * A builder for [AnalysisSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param referencedTables The tables referenced in the analysis schema. 
       */
      public fun referencedTables(referencedTables: List<String>)

      /**
       * @param referencedTables The tables referenced in the analysis schema. 
       */
      public fun referencedTables(vararg referencedTables: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty.builder()

      /**
       * @param referencedTables The tables referenced in the analysis schema. 
       */
      override fun referencedTables(referencedTables: List<String>) {
        cdkBuilder.referencedTables(referencedTables)
      }

      /**
       * @param referencedTables The tables referenced in the analysis schema. 
       */
      override fun referencedTables(vararg referencedTables: String): Unit =
          referencedTables(referencedTables.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty,
    ) : CdkObject(cdkObject),
        AnalysisSchemaProperty {
      /**
       * The tables referenced in the analysis schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisschema.html#cfn-cleanrooms-analysistemplate-analysisschema-referencedtables)
       */
      override fun referencedTables(): List<String> = unwrap(this).getReferencedTables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty):
          AnalysisSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? AnalysisSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSchemaProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty
    }
  }

  /**
   * The analysis source metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisSourceMetadataProperty analysisSourceMetadataProperty =
   * AnalysisSourceMetadataProperty.builder()
   * .artifacts(AnalysisTemplateArtifactMetadataProperty.builder()
   * .entryPointHash(HashProperty.builder()
   * .sha256("sha256")
   * .build())
   * // the properties below are optional
   * .additionalArtifactHashes(List.of(HashProperty.builder()
   * .sha256("sha256")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissourcemetadata.html)
   */
  public interface AnalysisSourceMetadataProperty {
    /**
     * The artifacts of the analysis source metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissourcemetadata.html#cfn-cleanrooms-analysistemplate-analysissourcemetadata-artifacts)
     */
    public fun artifacts(): Any

    /**
     * A builder for [AnalysisSourceMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      public fun artifacts(artifacts: IResolvable)

      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      public fun artifacts(artifacts: AnalysisTemplateArtifactMetadataProperty)

      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4f163a2abe0da38fef54352332e230e067efdd2c73ecae6fa3f3db9c23df99e")
      public fun artifacts(artifacts: AnalysisTemplateArtifactMetadataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty.builder()

      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      override fun artifacts(artifacts: IResolvable) {
        cdkBuilder.artifacts(artifacts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      override fun artifacts(artifacts: AnalysisTemplateArtifactMetadataProperty) {
        cdkBuilder.artifacts(artifacts.let(AnalysisTemplateArtifactMetadataProperty.Companion::unwrap))
      }

      /**
       * @param artifacts The artifacts of the analysis source metadata. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4f163a2abe0da38fef54352332e230e067efdd2c73ecae6fa3f3db9c23df99e")
      override
          fun artifacts(artifacts: AnalysisTemplateArtifactMetadataProperty.Builder.() -> Unit):
          Unit = artifacts(AnalysisTemplateArtifactMetadataProperty(artifacts))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty,
    ) : CdkObject(cdkObject),
        AnalysisSourceMetadataProperty {
      /**
       * The artifacts of the analysis source metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissourcemetadata.html#cfn-cleanrooms-analysistemplate-analysissourcemetadata-artifacts)
       */
      override fun artifacts(): Any = unwrap(this).getArtifacts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSourceMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty):
          AnalysisSourceMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisSourceMetadataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSourceMetadataProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceMetadataProperty
    }
  }

  /**
   * The structure that defines the body of the analysis template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisSourceProperty analysisSourceProperty = AnalysisSourceProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html)
   */
  public interface AnalysisSourceProperty {
    /**
     * The artifacts of the analysis source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-artifacts)
     */
    public fun artifacts(): Any? = unwrap(this).getArtifacts()

    /**
     * The query text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * A builder for [AnalysisSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifacts The artifacts of the analysis source.
       */
      public fun artifacts(artifacts: IResolvable)

      /**
       * @param artifacts The artifacts of the analysis source.
       */
      public fun artifacts(artifacts: AnalysisTemplateArtifactsProperty)

      /**
       * @param artifacts The artifacts of the analysis source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800ecd77403886610735a33f83d8327b2a0dd5dd69f4c78e6d93a6b76b2b95ae")
      public fun artifacts(artifacts: AnalysisTemplateArtifactsProperty.Builder.() -> Unit)

      /**
       * @param text The query text.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty.builder()

      /**
       * @param artifacts The artifacts of the analysis source.
       */
      override fun artifacts(artifacts: IResolvable) {
        cdkBuilder.artifacts(artifacts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param artifacts The artifacts of the analysis source.
       */
      override fun artifacts(artifacts: AnalysisTemplateArtifactsProperty) {
        cdkBuilder.artifacts(artifacts.let(AnalysisTemplateArtifactsProperty.Companion::unwrap))
      }

      /**
       * @param artifacts The artifacts of the analysis source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800ecd77403886610735a33f83d8327b2a0dd5dd69f4c78e6d93a6b76b2b95ae")
      override fun artifacts(artifacts: AnalysisTemplateArtifactsProperty.Builder.() -> Unit): Unit
          = artifacts(AnalysisTemplateArtifactsProperty(artifacts))

      /**
       * @param text The query text.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty,
    ) : CdkObject(cdkObject),
        AnalysisSourceProperty {
      /**
       * The artifacts of the analysis source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-artifacts)
       */
      override fun artifacts(): Any? = unwrap(this).getArtifacts()

      /**
       * The query text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty):
          AnalysisSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? AnalysisSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSourceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty
    }
  }

  /**
   * The analysis template artifact metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisTemplateArtifactMetadataProperty analysisTemplateArtifactMetadataProperty =
   * AnalysisTemplateArtifactMetadataProperty.builder()
   * .entryPointHash(HashProperty.builder()
   * .sha256("sha256")
   * .build())
   * // the properties below are optional
   * .additionalArtifactHashes(List.of(HashProperty.builder()
   * .sha256("sha256")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifactmetadata.html)
   */
  public interface AnalysisTemplateArtifactMetadataProperty {
    /**
     * Additional artifact hashes for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifactmetadata.html#cfn-cleanrooms-analysistemplate-analysistemplateartifactmetadata-additionalartifacthashes)
     */
    public fun additionalArtifactHashes(): Any? = unwrap(this).getAdditionalArtifactHashes()

    /**
     * The hash of the entry point for the analysis template artifact metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifactmetadata.html#cfn-cleanrooms-analysistemplate-analysistemplateartifactmetadata-entrypointhash)
     */
    public fun entryPointHash(): Any

    /**
     * A builder for [AnalysisTemplateArtifactMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      public fun additionalArtifactHashes(additionalArtifactHashes: IResolvable)

      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      public fun additionalArtifactHashes(additionalArtifactHashes: List<Any>)

      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      public fun additionalArtifactHashes(vararg additionalArtifactHashes: Any)

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      public fun entryPointHash(entryPointHash: IResolvable)

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      public fun entryPointHash(entryPointHash: HashProperty)

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddd170ff0ed57892c52bc9b3445e700f5a34ee7be8329b0c60613ae59cf767a")
      public fun entryPointHash(entryPointHash: HashProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty.builder()

      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      override fun additionalArtifactHashes(additionalArtifactHashes: IResolvable) {
        cdkBuilder.additionalArtifactHashes(additionalArtifactHashes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      override fun additionalArtifactHashes(additionalArtifactHashes: List<Any>) {
        cdkBuilder.additionalArtifactHashes(additionalArtifactHashes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param additionalArtifactHashes Additional artifact hashes for the analysis template.
       */
      override fun additionalArtifactHashes(vararg additionalArtifactHashes: Any): Unit =
          additionalArtifactHashes(additionalArtifactHashes.toList())

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      override fun entryPointHash(entryPointHash: IResolvable) {
        cdkBuilder.entryPointHash(entryPointHash.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      override fun entryPointHash(entryPointHash: HashProperty) {
        cdkBuilder.entryPointHash(entryPointHash.let(HashProperty.Companion::unwrap))
      }

      /**
       * @param entryPointHash The hash of the entry point for the analysis template artifact
       * metadata. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddd170ff0ed57892c52bc9b3445e700f5a34ee7be8329b0c60613ae59cf767a")
      override fun entryPointHash(entryPointHash: HashProperty.Builder.() -> Unit): Unit =
          entryPointHash(HashProperty(entryPointHash))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty,
    ) : CdkObject(cdkObject),
        AnalysisTemplateArtifactMetadataProperty {
      /**
       * Additional artifact hashes for the analysis template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifactmetadata.html#cfn-cleanrooms-analysistemplate-analysistemplateartifactmetadata-additionalartifacthashes)
       */
      override fun additionalArtifactHashes(): Any? = unwrap(this).getAdditionalArtifactHashes()

      /**
       * The hash of the entry point for the analysis template artifact metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifactmetadata.html#cfn-cleanrooms-analysistemplate-analysistemplateartifactmetadata-entrypointhash)
       */
      override fun entryPointHash(): Any = unwrap(this).getEntryPointHash()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisTemplateArtifactMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty):
          AnalysisTemplateArtifactMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisTemplateArtifactMetadataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisTemplateArtifactMetadataProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactMetadataProperty
    }
  }

  /**
   * The analysis template artifact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisTemplateArtifactProperty analysisTemplateArtifactProperty =
   * AnalysisTemplateArtifactProperty.builder()
   * .location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifact.html)
   */
  public interface AnalysisTemplateArtifactProperty {
    /**
     * The artifact location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifact.html#cfn-cleanrooms-analysistemplate-analysistemplateartifact-location)
     */
    public fun location(): Any

    /**
     * A builder for [AnalysisTemplateArtifactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location The artifact location. 
       */
      public fun location(location: IResolvable)

      /**
       * @param location The artifact location. 
       */
      public fun location(location: S3LocationProperty)

      /**
       * @param location The artifact location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11c4d0800872cc37016f271a1463cca56bd48b05dc487b376d7113fd0c44f9e6")
      public fun location(location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty.builder()

      /**
       * @param location The artifact location. 
       */
      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param location The artifact location. 
       */
      override fun location(location: S3LocationProperty) {
        cdkBuilder.location(location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param location The artifact location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11c4d0800872cc37016f271a1463cca56bd48b05dc487b376d7113fd0c44f9e6")
      override fun location(location: S3LocationProperty.Builder.() -> Unit): Unit =
          location(S3LocationProperty(location))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty,
    ) : CdkObject(cdkObject),
        AnalysisTemplateArtifactProperty {
      /**
       * The artifact location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifact.html#cfn-cleanrooms-analysistemplate-analysistemplateartifact-location)
       */
      override fun location(): Any = unwrap(this).getLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisTemplateArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty):
          AnalysisTemplateArtifactProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisTemplateArtifactProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisTemplateArtifactProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactProperty
    }
  }

  /**
   * The analysis template artifacts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * AnalysisTemplateArtifactsProperty analysisTemplateArtifactsProperty =
   * AnalysisTemplateArtifactsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html)
   */
  public interface AnalysisTemplateArtifactsProperty {
    /**
     * Additional artifacts for the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-additionalartifacts)
     */
    public fun additionalArtifacts(): Any? = unwrap(this).getAdditionalArtifacts()

    /**
     * The entry point for the analysis template artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-entrypoint)
     */
    public fun entryPoint(): Any

    /**
     * The role ARN for the analysis template artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [AnalysisTemplateArtifactsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      public fun additionalArtifacts(additionalArtifacts: IResolvable)

      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      public fun additionalArtifacts(additionalArtifacts: List<Any>)

      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      public fun additionalArtifacts(vararg additionalArtifacts: Any)

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      public fun entryPoint(entryPoint: IResolvable)

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      public fun entryPoint(entryPoint: AnalysisTemplateArtifactProperty)

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53ab607d07d54986005443bc1f5a67b1b32415bc1ff8761c188fc5f6f8877037")
      public fun entryPoint(entryPoint: AnalysisTemplateArtifactProperty.Builder.() -> Unit)

      /**
       * @param roleArn The role ARN for the analysis template artifacts. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty.builder()

      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      override fun additionalArtifacts(additionalArtifacts: IResolvable) {
        cdkBuilder.additionalArtifacts(additionalArtifacts.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      override fun additionalArtifacts(additionalArtifacts: List<Any>) {
        cdkBuilder.additionalArtifacts(additionalArtifacts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param additionalArtifacts Additional artifacts for the analysis template.
       */
      override fun additionalArtifacts(vararg additionalArtifacts: Any): Unit =
          additionalArtifacts(additionalArtifacts.toList())

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      override fun entryPoint(entryPoint: IResolvable) {
        cdkBuilder.entryPoint(entryPoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      override fun entryPoint(entryPoint: AnalysisTemplateArtifactProperty) {
        cdkBuilder.entryPoint(entryPoint.let(AnalysisTemplateArtifactProperty.Companion::unwrap))
      }

      /**
       * @param entryPoint The entry point for the analysis template artifacts. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53ab607d07d54986005443bc1f5a67b1b32415bc1ff8761c188fc5f6f8877037")
      override fun entryPoint(entryPoint: AnalysisTemplateArtifactProperty.Builder.() -> Unit): Unit
          = entryPoint(AnalysisTemplateArtifactProperty(entryPoint))

      /**
       * @param roleArn The role ARN for the analysis template artifacts. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty,
    ) : CdkObject(cdkObject),
        AnalysisTemplateArtifactsProperty {
      /**
       * Additional artifacts for the analysis template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-additionalartifacts)
       */
      override fun additionalArtifacts(): Any? = unwrap(this).getAdditionalArtifacts()

      /**
       * The entry point for the analysis template artifacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-entrypoint)
       */
      override fun entryPoint(): Any = unwrap(this).getEntryPoint()

      /**
       * The role ARN for the analysis template artifacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysistemplateartifacts.html#cfn-cleanrooms-analysistemplate-analysistemplateartifacts-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnalysisTemplateArtifactsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty):
          AnalysisTemplateArtifactsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisTemplateArtifactsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisTemplateArtifactsProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisTemplateArtifactsProperty
    }
  }

  /**
   * Hash.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * HashProperty hashProperty = HashProperty.builder()
   * .sha256("sha256")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-hash.html)
   */
  public interface HashProperty {
    /**
     * The SHA-256 hash value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-hash.html#cfn-cleanrooms-analysistemplate-hash-sha256)
     */
    public fun sha256(): String? = unwrap(this).getSha256()

    /**
     * A builder for [HashProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sha256 The SHA-256 hash value.
       */
      public fun sha256(sha256: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty.Builder =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty.builder()

      /**
       * @param sha256 The SHA-256 hash value.
       */
      override fun sha256(sha256: String) {
        cdkBuilder.sha256(sha256)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty,
    ) : CdkObject(cdkObject),
        HashProperty {
      /**
       * The SHA-256 hash value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-hash.html#cfn-cleanrooms-analysistemplate-hash-sha256)
       */
      override fun sha256(): String? = unwrap(this).getSha256()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HashProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty):
          HashProperty = CdkObjectWrappers.wrap(cdkObject) as? HashProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HashProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.HashProperty
    }
  }

  /**
   * The S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-s3location.html#cfn-cleanrooms-analysistemplate-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The object key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-s3location.html#cfn-cleanrooms-analysistemplate-s3location-key)
     */
    public fun key(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The bucket name. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The object key. 
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty.builder()

      /**
       * @param bucket The bucket name. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The object key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-s3location.html#cfn-cleanrooms-analysistemplate-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The object key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-s3location.html#cfn-cleanrooms-analysistemplate-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.S3LocationProperty
    }
  }
}
