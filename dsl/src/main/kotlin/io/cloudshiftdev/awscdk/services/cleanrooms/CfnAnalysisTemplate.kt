package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnalysisTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(`value`: IResolvable) {
    unwrap(this).setAnalysisParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnalysisParameters(__idx_ac66f0)
  }

  /**
   * The parameters of the analysis template.
   */
  public open fun analysisParameters(vararg __idx_ac66f0: Any): Unit =
      analysisParameters(__idx_ac66f0.toList())

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * The source of the analysis template.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The source of the analysis template.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source of the analysis template.
   */
  public open fun source(`value`: AnalysisSourceProperty) {
    unwrap(this).setSource(`value`.let(AnalysisSourceProperty::unwrap))
  }

  /**
   * The source of the analysis template.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("997162caadb96ba6b460c4c52a6c9188fe25ed68b37dcf8f64d12c265909dd23")
  public open fun source(`value`: AnalysisSourceProperty.Builder.() -> Unit): Unit =
      source(AnalysisSourceProperty(`value`))

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    public fun source(source: AnalysisSourceProperty.Builder.() -> Unit)

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
      cdkBuilder.analysisParameters(analysisParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-analysisparameters)
     * @param analysisParameters The parameters of the analysis template. 
     */
    override fun analysisParameters(analysisParameters: List<Any>) {
      cdkBuilder.analysisParameters(analysisParameters)
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
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    override fun source(source: AnalysisSourceProperty) {
      cdkBuilder.source(source.let(AnalysisSourceProperty::unwrap))
    }

    /**
     * The source of the analysis template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-analysistemplate.html#cfn-cleanrooms-analysistemplate-source)
     * @param source The source of the analysis template. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    override fun source(source: AnalysisSourceProperty.Builder.() -> Unit): Unit =
        source(AnalysisSourceProperty(source))

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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate = wrapped.cdkObject
  }

  public interface AnalysisSourceProperty {
    /**
     * The query text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-text)
     */
    public fun text(): String

    /**
     * A builder for [AnalysisSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty,
    ) : CdkObject(cdkObject), AnalysisSourceProperty {
      /**
       * The query text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysissource.html#cfn-cleanrooms-analysistemplate-analysissource-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty):
          AnalysisSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSourceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty,
    ) : CdkObject(cdkObject), AnalysisSchemaProperty {
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
          AnalysisSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSchemaProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty,
    ) : CdkObject(cdkObject), AnalysisParameterProperty {
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
          AnalysisParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisParameterProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty
    }
  }
}
