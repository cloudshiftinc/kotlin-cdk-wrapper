package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnForm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique ID of the Amplify app associated with the form.
   */
  public open fun appId(): String? = unwrap(this).getAppId()

  /**
   * The unique ID of the Amplify app associated with the form.
   */
  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  /**
   * The ID for the form.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   */
  public open fun cta(): Any? = unwrap(this).getCta()

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   */
  public open fun cta(`value`: IResolvable) {
    unwrap(this).setCta(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   */
  public open fun cta(`value`: FormCTAProperty) {
    unwrap(this).setCta(`value`.let(FormCTAProperty::unwrap))
  }

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb1076f673b3e089f5685bc0b079fb595cc3459b471bdc7028a3ade3c4f3a4c")
  public open fun cta(`value`: FormCTAProperty.Builder.() -> Unit): Unit =
      cta(FormCTAProperty(`value`))

  /**
   * The type of data source to use to create the form.
   */
  public open fun dataType(): Any? = unwrap(this).getDataType()

  /**
   * The type of data source to use to create the form.
   */
  public open fun dataType(`value`: IResolvable) {
    unwrap(this).setDataType(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of data source to use to create the form.
   */
  public open fun dataType(`value`: FormDataTypeConfigProperty) {
    unwrap(this).setDataType(`value`.let(FormDataTypeConfigProperty::unwrap))
  }

  /**
   * The type of data source to use to create the form.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7806b80e888f87440ae112b606ae21263e313438bf0df89f99efc789ee46edf8")
  public open fun dataType(`value`: FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
      dataType(FormDataTypeConfigProperty(`value`))

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  /**
   * The configuration information for the form's fields.
   */
  public open fun fields(): Any? = unwrap(this).getFields()

  /**
   * The configuration information for the form's fields.
   */
  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration information for the form's fields.
   */
  public open fun fields(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setFields(__item_ac66f0)
  }

  /**
   * Specifies whether to perform a create or update action on the form.
   */
  public open fun formActionType(): String? = unwrap(this).getFormActionType()

  /**
   * Specifies whether to perform a create or update action on the form.
   */
  public open fun formActionType(`value`: String) {
    unwrap(this).setFormActionType(`value`)
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
   * Specifies an icon or decoration to display on the form.
   */
  public open fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

  /**
   * Specifies an icon or decoration to display on the form.
   */
  public open fun labelDecorator(`value`: String) {
    unwrap(this).setLabelDecorator(`value`)
  }

  /**
   * The name of the form.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the form.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schema version of the form.
   */
  public open fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  /**
   * The schema version of the form.
   */
  public open fun schemaVersion(`value`: String) {
    unwrap(this).setSchemaVersion(`value`)
  }

  /**
   * The configuration information for the visual helper elements for the form.
   */
  public open fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

  /**
   * The configuration information for the visual helper elements for the form.
   */
  public open fun sectionalElements(`value`: IResolvable) {
    unwrap(this).setSectionalElements(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration information for the visual helper elements for the form.
   */
  public open fun sectionalElements(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setSectionalElements(__item_ac66f0)
  }

  /**
   * The configuration for the form's style.
   */
  public open fun style(): Any? = unwrap(this).getStyle()

  /**
   * The configuration for the form's style.
   */
  public open fun style(`value`: IResolvable) {
    unwrap(this).setStyle(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the form's style.
   */
  public open fun style(`value`: FormStyleProperty) {
    unwrap(this).setStyle(`value`.let(FormStyleProperty::unwrap))
  }

  /**
   * The configuration for the form's style.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("efa1f309835fe17a6183f637d4d3d70e80726ff953c5c375773f1b5481382e29")
  public open fun style(`value`: FormStyleProperty.Builder.() -> Unit): Unit =
      style(FormStyleProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more key-value pairs to use when tagging the form data.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * One or more key-value pairs to use when tagging the form data.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplifyuibuilder.CfnForm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID of the Amplify app associated with the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-appid)
     * @param appId The unique ID of the Amplify app associated with the form. 
     */
    public fun appId(appId: String)

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    public fun cta(cta: IResolvable)

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    public fun cta(cta: FormCTAProperty)

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73d6a8098e1d4f4e193c57cb283688503c9689880c83a0eecbd6552e4762df03")
    public fun cta(cta: FormCTAProperty.Builder.() -> Unit)

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    public fun dataType(dataType: IResolvable)

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    public fun dataType(dataType: FormDataTypeConfigProperty)

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bc3170471ecc0ebfaea6e8b3dba9bf4efabffb0f5dbcd11cac2470b510221b2")
    public fun dataType(dataType: FormDataTypeConfigProperty.Builder.() -> Unit)

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    public fun environmentName(environmentName: String)

    /**
     * The configuration information for the form's fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
     * @param fields The configuration information for the form's fields. 
     */
    public fun fields(fields: IResolvable)

    /**
     * The configuration information for the form's fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
     * @param fields The configuration information for the form's fields. 
     */
    public fun fields(fields: Map<String, Any>)

    /**
     * Specifies whether to perform a create or update action on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-formactiontype)
     * @param formActionType Specifies whether to perform a create or update action on the form. 
     */
    public fun formActionType(formActionType: String)

    /**
     * Specifies an icon or decoration to display on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-labeldecorator)
     * @param labelDecorator Specifies an icon or decoration to display on the form. 
     */
    public fun labelDecorator(labelDecorator: String)

    /**
     * The name of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-name)
     * @param name The name of the form. 
     */
    public fun name(name: String)

    /**
     * The schema version of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-schemaversion)
     * @param schemaVersion The schema version of the form. 
     */
    public fun schemaVersion(schemaVersion: String)

    /**
     * The configuration information for the visual helper elements for the form.
     *
     * These elements are not associated with any data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form. 
     */
    public fun sectionalElements(sectionalElements: IResolvable)

    /**
     * The configuration information for the visual helper elements for the form.
     *
     * These elements are not associated with any data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form. 
     */
    public fun sectionalElements(sectionalElements: Map<String, Any>)

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    public fun style(style: IResolvable)

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    public fun style(style: FormStyleProperty)

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2634a16848ce7a3e78cc5d2160df60325ece2be95a5fa3ff0ba9456a1f0880ed")
    public fun style(style: FormStyleProperty.Builder.() -> Unit)

    /**
     * One or more key-value pairs to use when tagging the form data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-tags)
     * @param tags One or more key-value pairs to use when tagging the form data. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnForm.Builder.create(scope, id)

    /**
     * The unique ID of the Amplify app associated with the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-appid)
     * @param appId The unique ID of the Amplify app associated with the form. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    override fun cta(cta: IResolvable) {
      cdkBuilder.cta(cta.let(IResolvable::unwrap))
    }

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    override fun cta(cta: FormCTAProperty) {
      cdkBuilder.cta(cta.let(FormCTAProperty::unwrap))
    }

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73d6a8098e1d4f4e193c57cb283688503c9689880c83a0eecbd6552e4762df03")
    override fun cta(cta: FormCTAProperty.Builder.() -> Unit): Unit = cta(FormCTAProperty(cta))

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    override fun dataType(dataType: IResolvable) {
      cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
    }

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    override fun dataType(dataType: FormDataTypeConfigProperty) {
      cdkBuilder.dataType(dataType.let(FormDataTypeConfigProperty::unwrap))
    }

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     * @param dataType The type of data source to use to create the form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bc3170471ecc0ebfaea6e8b3dba9bf4efabffb0f5dbcd11cac2470b510221b2")
    override fun dataType(dataType: FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
        dataType(FormDataTypeConfigProperty(dataType))

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * The configuration information for the form's fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
     * @param fields The configuration information for the form's fields. 
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    /**
     * The configuration information for the form's fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
     * @param fields The configuration information for the form's fields. 
     */
    override fun fields(fields: Map<String, Any>) {
      cdkBuilder.fields(fields)
    }

    /**
     * Specifies whether to perform a create or update action on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-formactiontype)
     * @param formActionType Specifies whether to perform a create or update action on the form. 
     */
    override fun formActionType(formActionType: String) {
      cdkBuilder.formActionType(formActionType)
    }

    /**
     * Specifies an icon or decoration to display on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-labeldecorator)
     * @param labelDecorator Specifies an icon or decoration to display on the form. 
     */
    override fun labelDecorator(labelDecorator: String) {
      cdkBuilder.labelDecorator(labelDecorator)
    }

    /**
     * The name of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-name)
     * @param name The name of the form. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schema version of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-schemaversion)
     * @param schemaVersion The schema version of the form. 
     */
    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    /**
     * The configuration information for the visual helper elements for the form.
     *
     * These elements are not associated with any data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form. 
     */
    override fun sectionalElements(sectionalElements: IResolvable) {
      cdkBuilder.sectionalElements(sectionalElements.let(IResolvable::unwrap))
    }

    /**
     * The configuration information for the visual helper elements for the form.
     *
     * These elements are not associated with any data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form. 
     */
    override fun sectionalElements(sectionalElements: Map<String, Any>) {
      cdkBuilder.sectionalElements(sectionalElements)
    }

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    override fun style(style: IResolvable) {
      cdkBuilder.style(style.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    override fun style(style: FormStyleProperty) {
      cdkBuilder.style(style.let(FormStyleProperty::unwrap))
    }

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     * @param style The configuration for the form's style. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2634a16848ce7a3e78cc5d2160df60325ece2be95a5fa3ff0ba9456a1f0880ed")
    override fun style(style: FormStyleProperty.Builder.() -> Unit): Unit =
        style(FormStyleProperty(style))

    /**
     * One or more key-value pairs to use when tagging the form data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-tags)
     * @param tags One or more key-value pairs to use when tagging the form data. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnForm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnForm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm): CfnForm
        = CfnForm(cdkObject)

    internal fun unwrap(wrapped: CfnForm): software.amazon.awscdk.services.amplifyuibuilder.CfnForm
        = wrapped.cdkObject
  }

  public interface FormStyleProperty {
    /**
     * The spacing for the horizontal gap.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-horizontalgap)
     */
    public fun horizontalGap(): Any? = unwrap(this).getHorizontalGap()

    /**
     * The size of the outer padding for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-outerpadding)
     */
    public fun outerPadding(): Any? = unwrap(this).getOuterPadding()

    /**
     * The spacing for the vertical gap.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-verticalgap)
     */
    public fun verticalGap(): Any? = unwrap(this).getVerticalGap()

    /**
     * A builder for [FormStyleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      public fun horizontalGap(horizontalGap: IResolvable)

      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      public fun horizontalGap(horizontalGap: FormStyleConfigProperty)

      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8a12023b55a24b6429e79c0814ac53caaf170936f4d8368e65dff1446a4d3b6")
      public fun horizontalGap(horizontalGap: FormStyleConfigProperty.Builder.() -> Unit)

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      public fun outerPadding(outerPadding: IResolvable)

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      public fun outerPadding(outerPadding: FormStyleConfigProperty)

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce45d7f38411ba695c26d1741ceb0e0d065e1c6077f4fd619309a3ca38008f19")
      public fun outerPadding(outerPadding: FormStyleConfigProperty.Builder.() -> Unit)

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      public fun verticalGap(verticalGap: IResolvable)

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      public fun verticalGap(verticalGap: FormStyleConfigProperty)

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f105ff7e1666f9fc3e9461df44db047b2bf72dcd40425ca3d5e5224856a53e57")
      public fun verticalGap(verticalGap: FormStyleConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty.builder()

      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      override fun horizontalGap(horizontalGap: IResolvable) {
        cdkBuilder.horizontalGap(horizontalGap.let(IResolvable::unwrap))
      }

      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      override fun horizontalGap(horizontalGap: FormStyleConfigProperty) {
        cdkBuilder.horizontalGap(horizontalGap.let(FormStyleConfigProperty::unwrap))
      }

      /**
       * @param horizontalGap The spacing for the horizontal gap.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8a12023b55a24b6429e79c0814ac53caaf170936f4d8368e65dff1446a4d3b6")
      override fun horizontalGap(horizontalGap: FormStyleConfigProperty.Builder.() -> Unit): Unit =
          horizontalGap(FormStyleConfigProperty(horizontalGap))

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      override fun outerPadding(outerPadding: IResolvable) {
        cdkBuilder.outerPadding(outerPadding.let(IResolvable::unwrap))
      }

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      override fun outerPadding(outerPadding: FormStyleConfigProperty) {
        cdkBuilder.outerPadding(outerPadding.let(FormStyleConfigProperty::unwrap))
      }

      /**
       * @param outerPadding The size of the outer padding for the form.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce45d7f38411ba695c26d1741ceb0e0d065e1c6077f4fd619309a3ca38008f19")
      override fun outerPadding(outerPadding: FormStyleConfigProperty.Builder.() -> Unit): Unit =
          outerPadding(FormStyleConfigProperty(outerPadding))

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      override fun verticalGap(verticalGap: IResolvable) {
        cdkBuilder.verticalGap(verticalGap.let(IResolvable::unwrap))
      }

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      override fun verticalGap(verticalGap: FormStyleConfigProperty) {
        cdkBuilder.verticalGap(verticalGap.let(FormStyleConfigProperty::unwrap))
      }

      /**
       * @param verticalGap The spacing for the vertical gap.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f105ff7e1666f9fc3e9461df44db047b2bf72dcd40425ca3d5e5224856a53e57")
      override fun verticalGap(verticalGap: FormStyleConfigProperty.Builder.() -> Unit): Unit =
          verticalGap(FormStyleConfigProperty(verticalGap))

      public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty,
    ) : FormStyleProperty {
      /**
       * The spacing for the horizontal gap.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-horizontalgap)
       */
      override fun horizontalGap(): Any? = unwrap(this).getHorizontalGap()

      /**
       * The size of the outer padding for the form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-outerpadding)
       */
      override fun outerPadding(): Any? = unwrap(this).getOuterPadding()

      /**
       * The spacing for the vertical gap.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyle.html#cfn-amplifyuibuilder-form-formstyle-verticalgap)
       */
      override fun verticalGap(): Any? = unwrap(this).getVerticalGap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty):
          FormStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormStyleProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormInputValuePropertyProperty {
    /**
     * The information to bind fields to data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-bindingproperties)
     */
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * A list of form properties to concatenate to create the value to assign to this field
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-concat)
     */
    public fun concat(): Any? = unwrap(this).getConcat()

    /**
     * The value to assign to the input field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [FormInputValuePropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      public fun bindingProperties(bindingProperties: IResolvable)

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      public
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty)

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07939339dd165ac82ec59948a81aac59321a5986d4f3ed9a39e58c1b5f19abc")
      public
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty.Builder.() -> Unit)

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      public fun concat(concat: IResolvable)

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      public fun concat(concat: List<Any>)

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      public fun concat(vararg concat: Any)

      /**
       * @param value The value to assign to the input field.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty.builder()

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      override
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(FormInputValuePropertyBindingPropertiesProperty::unwrap))
      }

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07939339dd165ac82ec59948a81aac59321a5986d4f3ed9a39e58c1b5f19abc")
      override
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(FormInputValuePropertyBindingPropertiesProperty(bindingProperties))

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      override fun concat(concat: IResolvable) {
        cdkBuilder.concat(concat.let(IResolvable::unwrap))
      }

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      override fun concat(concat: List<Any>) {
        cdkBuilder.concat(concat)
      }

      /**
       * @param concat A list of form properties to concatenate to create the value to assign to
       * this field property.
       */
      override fun concat(vararg concat: Any): Unit = concat(concat.toList())

      /**
       * @param value The value to assign to the input field.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty,
    ) : FormInputValuePropertyProperty {
      /**
       * The information to bind fields to data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-bindingproperties)
       */
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      /**
       * A list of form properties to concatenate to create the value to assign to this field
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-concat)
       */
      override fun concat(): Any? = unwrap(this).getConcat()

      /**
       * The value to assign to the input field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvalueproperty.html#cfn-amplifyuibuilder-form-forminputvalueproperty-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormInputValuePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty):
          FormInputValuePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputValuePropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldValidationConfigurationProperty {
    /**
     * The validation to perform on a number value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-numvalues)
     */
    public fun numValues(): Any? = unwrap(this).getNumValues()

    /**
     * The validation to perform on a string value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-strvalues)
     */
    public fun strValues(): List<String> = unwrap(this).getStrValues() ?: emptyList()

    /**
     * The validation to perform on an object type.
     *
     * ``
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-type)
     */
    public fun type(): String

    /**
     * The validation message to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-validationmessage)
     */
    public fun validationMessage(): String? = unwrap(this).getValidationMessage()

    /**
     * A builder for [FieldValidationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numValues The validation to perform on a number value.
       */
      public fun numValues(numValues: IResolvable)

      /**
       * @param numValues The validation to perform on a number value.
       */
      public fun numValues(numValues: List<Number>)

      /**
       * @param numValues The validation to perform on a number value.
       */
      public fun numValues(vararg numValues: Number)

      /**
       * @param strValues The validation to perform on a string value.
       */
      public fun strValues(strValues: List<String>)

      /**
       * @param strValues The validation to perform on a string value.
       */
      public fun strValues(vararg strValues: String)

      /**
       * @param type The validation to perform on an object type. 
       * ``
       */
      public fun type(type: String)

      /**
       * @param validationMessage The validation message to display.
       */
      public fun validationMessage(validationMessage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty.builder()

      /**
       * @param numValues The validation to perform on a number value.
       */
      override fun numValues(numValues: IResolvable) {
        cdkBuilder.numValues(numValues.let(IResolvable::unwrap))
      }

      /**
       * @param numValues The validation to perform on a number value.
       */
      override fun numValues(numValues: List<Number>) {
        cdkBuilder.numValues(numValues)
      }

      /**
       * @param numValues The validation to perform on a number value.
       */
      override fun numValues(vararg numValues: Number): Unit = numValues(numValues.toList())

      /**
       * @param strValues The validation to perform on a string value.
       */
      override fun strValues(strValues: List<String>) {
        cdkBuilder.strValues(strValues)
      }

      /**
       * @param strValues The validation to perform on a string value.
       */
      override fun strValues(vararg strValues: String): Unit = strValues(strValues.toList())

      /**
       * @param type The validation to perform on an object type. 
       * ``
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param validationMessage The validation message to display.
       */
      override fun validationMessage(validationMessage: String) {
        cdkBuilder.validationMessage(validationMessage)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty,
    ) : FieldValidationConfigurationProperty {
      /**
       * The validation to perform on a number value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-numvalues)
       */
      override fun numValues(): Any? = unwrap(this).getNumValues()

      /**
       * The validation to perform on a string value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-strvalues)
       */
      override fun strValues(): List<String> = unwrap(this).getStrValues() ?: emptyList()

      /**
       * The validation to perform on an object type.
       *
       * ``
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The validation message to display.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldvalidationconfiguration.html#cfn-amplifyuibuilder-form-fieldvalidationconfiguration-validationmessage)
       */
      override fun validationMessage(): String? = unwrap(this).getValidationMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FieldValidationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty):
          FieldValidationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldValidationConfigurationProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileUploaderFieldConfigProperty {
    /**
     * The file types that are allowed to be uploaded by the file uploader.
     *
     * Provide this information in an array of strings specifying the valid file extensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-acceptedfiletypes)
     */
    public fun acceptedFileTypes(): List<String>

    /**
     * The access level to assign to the uploaded files in the Amazon S3 bucket where they are
     * stored.
     *
     * The valid values for this property are `private` , `protected` , or `public` . For detailed
     * information about the permissions associated with each access level, see [File access
     * levels](https://docs.aws.amazon.com/https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/)
     * in the *Amplify documentation* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-accesslevel)
     */
    public fun accessLevel(): String

    /**
     * Allows the file upload operation to be paused and resumed. The default value is `false` .
     *
     * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break the
     * files into chunks before upload. The progress of the upload isn't continuous, because the file
     * uploader uploads a chunk at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-isresumable)
     */
    public fun isResumable(): Any? = unwrap(this).getIsResumable()

    /**
     * Specifies the maximum number of files that can be selected to upload.
     *
     * The default value is an unlimited number of files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-maxfilecount)
     */
    public fun maxFileCount(): Number? = unwrap(this).getMaxFileCount()

    /**
     * The maximum file size in bytes that the file uploader will accept.
     *
     * The default value is an unlimited file size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-maxsize)
     */
    public fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * Specifies whether to display or hide the image preview after selecting a file for upload.
     *
     * The default value is `true` to display the image preview.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-showthumbnails)
     */
    public fun showThumbnails(): Any? = unwrap(this).getShowThumbnails()

    /**
     * A builder for [FileUploaderFieldConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceptedFileTypes The file types that are allowed to be uploaded by the file
       * uploader. 
       * Provide this information in an array of strings specifying the valid file extensions.
       */
      public fun acceptedFileTypes(acceptedFileTypes: List<String>)

      /**
       * @param acceptedFileTypes The file types that are allowed to be uploaded by the file
       * uploader. 
       * Provide this information in an array of strings specifying the valid file extensions.
       */
      public fun acceptedFileTypes(vararg acceptedFileTypes: String)

      /**
       * @param accessLevel The access level to assign to the uploaded files in the Amazon S3 bucket
       * where they are stored. 
       * The valid values for this property are `private` , `protected` , or `public` . For detailed
       * information about the permissions associated with each access level, see [File access
       * levels](https://docs.aws.amazon.com/https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/)
       * in the *Amplify documentation* .
       */
      public fun accessLevel(accessLevel: String)

      /**
       * @param isResumable Allows the file upload operation to be paused and resumed. The default
       * value is `false` .
       * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break
       * the files into chunks before upload. The progress of the upload isn't continuous, because the
       * file uploader uploads a chunk at a time.
       */
      public fun isResumable(isResumable: Boolean)

      /**
       * @param isResumable Allows the file upload operation to be paused and resumed. The default
       * value is `false` .
       * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break
       * the files into chunks before upload. The progress of the upload isn't continuous, because the
       * file uploader uploads a chunk at a time.
       */
      public fun isResumable(isResumable: IResolvable)

      /**
       * @param maxFileCount Specifies the maximum number of files that can be selected to upload.
       * The default value is an unlimited number of files.
       */
      public fun maxFileCount(maxFileCount: Number)

      /**
       * @param maxSize The maximum file size in bytes that the file uploader will accept.
       * The default value is an unlimited file size.
       */
      public fun maxSize(maxSize: Number)

      /**
       * @param showThumbnails Specifies whether to display or hide the image preview after
       * selecting a file for upload.
       * The default value is `true` to display the image preview.
       */
      public fun showThumbnails(showThumbnails: Boolean)

      /**
       * @param showThumbnails Specifies whether to display or hide the image preview after
       * selecting a file for upload.
       * The default value is `true` to display the image preview.
       */
      public fun showThumbnails(showThumbnails: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty.builder()

      /**
       * @param acceptedFileTypes The file types that are allowed to be uploaded by the file
       * uploader. 
       * Provide this information in an array of strings specifying the valid file extensions.
       */
      override fun acceptedFileTypes(acceptedFileTypes: List<String>) {
        cdkBuilder.acceptedFileTypes(acceptedFileTypes)
      }

      /**
       * @param acceptedFileTypes The file types that are allowed to be uploaded by the file
       * uploader. 
       * Provide this information in an array of strings specifying the valid file extensions.
       */
      override fun acceptedFileTypes(vararg acceptedFileTypes: String): Unit =
          acceptedFileTypes(acceptedFileTypes.toList())

      /**
       * @param accessLevel The access level to assign to the uploaded files in the Amazon S3 bucket
       * where they are stored. 
       * The valid values for this property are `private` , `protected` , or `public` . For detailed
       * information about the permissions associated with each access level, see [File access
       * levels](https://docs.aws.amazon.com/https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/)
       * in the *Amplify documentation* .
       */
      override fun accessLevel(accessLevel: String) {
        cdkBuilder.accessLevel(accessLevel)
      }

      /**
       * @param isResumable Allows the file upload operation to be paused and resumed. The default
       * value is `false` .
       * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break
       * the files into chunks before upload. The progress of the upload isn't continuous, because the
       * file uploader uploads a chunk at a time.
       */
      override fun isResumable(isResumable: Boolean) {
        cdkBuilder.isResumable(isResumable)
      }

      /**
       * @param isResumable Allows the file upload operation to be paused and resumed. The default
       * value is `false` .
       * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break
       * the files into chunks before upload. The progress of the upload isn't continuous, because the
       * file uploader uploads a chunk at a time.
       */
      override fun isResumable(isResumable: IResolvable) {
        cdkBuilder.isResumable(isResumable.let(IResolvable::unwrap))
      }

      /**
       * @param maxFileCount Specifies the maximum number of files that can be selected to upload.
       * The default value is an unlimited number of files.
       */
      override fun maxFileCount(maxFileCount: Number) {
        cdkBuilder.maxFileCount(maxFileCount)
      }

      /**
       * @param maxSize The maximum file size in bytes that the file uploader will accept.
       * The default value is an unlimited file size.
       */
      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      /**
       * @param showThumbnails Specifies whether to display or hide the image preview after
       * selecting a file for upload.
       * The default value is `true` to display the image preview.
       */
      override fun showThumbnails(showThumbnails: Boolean) {
        cdkBuilder.showThumbnails(showThumbnails)
      }

      /**
       * @param showThumbnails Specifies whether to display or hide the image preview after
       * selecting a file for upload.
       * The default value is `true` to display the image preview.
       */
      override fun showThumbnails(showThumbnails: IResolvable) {
        cdkBuilder.showThumbnails(showThumbnails.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty,
    ) : FileUploaderFieldConfigProperty {
      /**
       * The file types that are allowed to be uploaded by the file uploader.
       *
       * Provide this information in an array of strings specifying the valid file extensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-acceptedfiletypes)
       */
      override fun acceptedFileTypes(): List<String> = unwrap(this).getAcceptedFileTypes()

      /**
       * The access level to assign to the uploaded files in the Amazon S3 bucket where they are
       * stored.
       *
       * The valid values for this property are `private` , `protected` , or `public` . For detailed
       * information about the permissions associated with each access level, see [File access
       * levels](https://docs.aws.amazon.com/https://docs.amplify.aws/lib/storage/configureaccess/q/platform/js/)
       * in the *Amplify documentation* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-accesslevel)
       */
      override fun accessLevel(): String = unwrap(this).getAccessLevel()

      /**
       * Allows the file upload operation to be paused and resumed. The default value is `false` .
       *
       * When `isResumable` is set to `true` , the file uploader uses a multipart upload to break
       * the files into chunks before upload. The progress of the upload isn't continuous, because the
       * file uploader uploads a chunk at a time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-isresumable)
       */
      override fun isResumable(): Any? = unwrap(this).getIsResumable()

      /**
       * Specifies the maximum number of files that can be selected to upload.
       *
       * The default value is an unlimited number of files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-maxfilecount)
       */
      override fun maxFileCount(): Number? = unwrap(this).getMaxFileCount()

      /**
       * The maximum file size in bytes that the file uploader will accept.
       *
       * The default value is an unlimited file size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-maxsize)
       */
      override fun maxSize(): Number? = unwrap(this).getMaxSize()

      /**
       * Specifies whether to display or hide the image preview after selecting a file for upload.
       *
       * The default value is `true` to display the image preview.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fileuploaderfieldconfig.html#cfn-amplifyuibuilder-form-fileuploaderfieldconfig-showthumbnails)
       */
      override fun showThumbnails(): Any? = unwrap(this).getShowThumbnails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileUploaderFieldConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty):
          FileUploaderFieldConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileUploaderFieldConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormInputBindingPropertiesValueProperty {
    /**
     * Describes the properties to customize with data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalue.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalue-bindingproperties)
     */
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * The property type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalue.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalue-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [FormInputBindingPropertiesValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      public fun bindingProperties(bindingProperties: IResolvable)

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      public
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty)

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068d8d4bfa9fce6e7705c4e49fec73461aa875f27d186222db7d59a13f9c65ae")
      public
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty.Builder.() -> Unit)

      /**
       * @param type The property type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty.builder()

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      override
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(FormInputBindingPropertiesValuePropertiesProperty::unwrap))
      }

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068d8d4bfa9fce6e7705c4e49fec73461aa875f27d186222db7d59a13f9c65ae")
      override
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(FormInputBindingPropertiesValuePropertiesProperty(bindingProperties))

      /**
       * @param type The property type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty,
    ) : FormInputBindingPropertiesValueProperty {
      /**
       * Describes the properties to customize with data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalue.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalue-bindingproperties)
       */
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      /**
       * The property type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalue.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalue-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputBindingPropertiesValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty):
          FormInputBindingPropertiesValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputBindingPropertiesValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormCTAProperty {
    /**
     * Displays a cancel button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-cancel)
     */
    public fun cancel(): Any? = unwrap(this).getCancel()

    /**
     * Displays a clear button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-clear)
     */
    public fun clear(): Any? = unwrap(this).getClear()

    /**
     * The position of the button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-position)
     */
    public fun position(): String? = unwrap(this).getPosition()

    /**
     * Displays a submit button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-submit)
     */
    public fun submit(): Any? = unwrap(this).getSubmit()

    /**
     * A builder for [FormCTAProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cancel Displays a cancel button.
       */
      public fun cancel(cancel: IResolvable)

      /**
       * @param cancel Displays a cancel button.
       */
      public fun cancel(cancel: FormButtonProperty)

      /**
       * @param cancel Displays a cancel button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e10ffc6077cfdea59b4b69d4aba771b4edabf72c7e985b24a609acb520ad0c29")
      public fun cancel(cancel: FormButtonProperty.Builder.() -> Unit)

      /**
       * @param clear Displays a clear button.
       */
      public fun clear(clear: IResolvable)

      /**
       * @param clear Displays a clear button.
       */
      public fun clear(clear: FormButtonProperty)

      /**
       * @param clear Displays a clear button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2368f12872aac3777c653e431f7b0f7aec0c02dae3f26efd5c2947552f2c9f")
      public fun clear(clear: FormButtonProperty.Builder.() -> Unit)

      /**
       * @param position The position of the button.
       */
      public fun position(position: String)

      /**
       * @param submit Displays a submit button.
       */
      public fun submit(submit: IResolvable)

      /**
       * @param submit Displays a submit button.
       */
      public fun submit(submit: FormButtonProperty)

      /**
       * @param submit Displays a submit button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f04f26d3e185a85d2564ea012630e118c35b0d78826c61679dabad9da7f557")
      public fun submit(submit: FormButtonProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty.builder()

      /**
       * @param cancel Displays a cancel button.
       */
      override fun cancel(cancel: IResolvable) {
        cdkBuilder.cancel(cancel.let(IResolvable::unwrap))
      }

      /**
       * @param cancel Displays a cancel button.
       */
      override fun cancel(cancel: FormButtonProperty) {
        cdkBuilder.cancel(cancel.let(FormButtonProperty::unwrap))
      }

      /**
       * @param cancel Displays a cancel button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e10ffc6077cfdea59b4b69d4aba771b4edabf72c7e985b24a609acb520ad0c29")
      override fun cancel(cancel: FormButtonProperty.Builder.() -> Unit): Unit =
          cancel(FormButtonProperty(cancel))

      /**
       * @param clear Displays a clear button.
       */
      override fun clear(clear: IResolvable) {
        cdkBuilder.clear(clear.let(IResolvable::unwrap))
      }

      /**
       * @param clear Displays a clear button.
       */
      override fun clear(clear: FormButtonProperty) {
        cdkBuilder.clear(clear.let(FormButtonProperty::unwrap))
      }

      /**
       * @param clear Displays a clear button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2368f12872aac3777c653e431f7b0f7aec0c02dae3f26efd5c2947552f2c9f")
      override fun clear(clear: FormButtonProperty.Builder.() -> Unit): Unit =
          clear(FormButtonProperty(clear))

      /**
       * @param position The position of the button.
       */
      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      /**
       * @param submit Displays a submit button.
       */
      override fun submit(submit: IResolvable) {
        cdkBuilder.submit(submit.let(IResolvable::unwrap))
      }

      /**
       * @param submit Displays a submit button.
       */
      override fun submit(submit: FormButtonProperty) {
        cdkBuilder.submit(submit.let(FormButtonProperty::unwrap))
      }

      /**
       * @param submit Displays a submit button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f04f26d3e185a85d2564ea012630e118c35b0d78826c61679dabad9da7f557")
      override fun submit(submit: FormButtonProperty.Builder.() -> Unit): Unit =
          submit(FormButtonProperty(submit))

      public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty,
    ) : FormCTAProperty {
      /**
       * Displays a cancel button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-cancel)
       */
      override fun cancel(): Any? = unwrap(this).getCancel()

      /**
       * Displays a clear button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-clear)
       */
      override fun clear(): Any? = unwrap(this).getClear()

      /**
       * The position of the button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-position)
       */
      override fun position(): String? = unwrap(this).getPosition()

      /**
       * Displays a submit button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formcta.html#cfn-amplifyuibuilder-form-formcta-submit)
       */
      override fun submit(): Any? = unwrap(this).getSubmit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormCTAProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty):
          FormCTAProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormCTAProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormInputValuePropertyBindingPropertiesProperty {
    /**
     * The data field to bind the property to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvaluepropertybindingproperties.html#cfn-amplifyuibuilder-form-forminputvaluepropertybindingproperties-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The form property to bind to the data field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvaluepropertybindingproperties.html#cfn-amplifyuibuilder-form-forminputvaluepropertybindingproperties-property)
     */
    public fun `property`(): String

    /**
     * A builder for [FormInputValuePropertyBindingPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The data field to bind the property to.
       */
      public fun `field`(`field`: String)

      /**
       * @param property The form property to bind to the data field. 
       */
      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty.builder()

      /**
       * @param field The data field to bind the property to.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param property The form property to bind to the data field. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty,
    ) : FormInputValuePropertyBindingPropertiesProperty {
      /**
       * The data field to bind the property to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvaluepropertybindingproperties.html#cfn-amplifyuibuilder-form-forminputvaluepropertybindingproperties-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The form property to bind to the data field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputvaluepropertybindingproperties.html#cfn-amplifyuibuilder-form-forminputvaluepropertybindingproperties-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputValuePropertyBindingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty):
          FormInputValuePropertyBindingPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputValuePropertyBindingPropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormButtonProperty {
    /**
     * Describes the button's properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-children)
     */
    public fun children(): String? = unwrap(this).getChildren()

    /**
     * Specifies whether the button is visible on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-excluded)
     */
    public fun excluded(): Any? = unwrap(this).getExcluded()

    /**
     * The position of the button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-position)
     */
    public fun position(): Any? = unwrap(this).getPosition()

    /**
     * A builder for [FormButtonProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param children Describes the button's properties.
       */
      public fun children(children: String)

      /**
       * @param excluded Specifies whether the button is visible on the form.
       */
      public fun excluded(excluded: Boolean)

      /**
       * @param excluded Specifies whether the button is visible on the form.
       */
      public fun excluded(excluded: IResolvable)

      /**
       * @param position The position of the button.
       */
      public fun position(position: IResolvable)

      /**
       * @param position The position of the button.
       */
      public fun position(position: FieldPositionProperty)

      /**
       * @param position The position of the button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dd5d47f0a18ebc35782bbd119ab231637ce6f836228b583012f274916f67995")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty.builder()

      /**
       * @param children Describes the button's properties.
       */
      override fun children(children: String) {
        cdkBuilder.children(children)
      }

      /**
       * @param excluded Specifies whether the button is visible on the form.
       */
      override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      /**
       * @param excluded Specifies whether the button is visible on the form.
       */
      override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      /**
       * @param position The position of the button.
       */
      override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      /**
       * @param position The position of the button.
       */
      override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      /**
       * @param position The position of the button.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dd5d47f0a18ebc35782bbd119ab231637ce6f836228b583012f274916f67995")
      override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty,
    ) : FormButtonProperty {
      /**
       * Describes the button's properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-children)
       */
      override fun children(): String? = unwrap(this).getChildren()

      /**
       * Specifies whether the button is visible on the form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-excluded)
       */
      override fun excluded(): Any? = unwrap(this).getExcluded()

      /**
       * The position of the button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formbutton.html#cfn-amplifyuibuilder-form-formbutton-position)
       */
      override fun position(): Any? = unwrap(this).getPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty):
          FormButtonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormButtonProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormStyleConfigProperty {
    /**
     * A reference to a design token to use to bind the form's style properties to an existing
     * theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html#cfn-amplifyuibuilder-form-formstyleconfig-tokenreference)
     */
    public fun tokenReference(): String? = unwrap(this).getTokenReference()

    /**
     * The value of the style setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html#cfn-amplifyuibuilder-form-formstyleconfig-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [FormStyleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tokenReference A reference to a design token to use to bind the form's style
       * properties to an existing theme.
       */
      public fun tokenReference(tokenReference: String)

      /**
       * @param value The value of the style setting.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty.builder()

      /**
       * @param tokenReference A reference to a design token to use to bind the form's style
       * properties to an existing theme.
       */
      override fun tokenReference(tokenReference: String) {
        cdkBuilder.tokenReference(tokenReference)
      }

      /**
       * @param value The value of the style setting.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty,
    ) : FormStyleConfigProperty {
      /**
       * A reference to a design token to use to bind the form's style properties to an existing
       * theme.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html#cfn-amplifyuibuilder-form-formstyleconfig-tokenreference)
       */
      override fun tokenReference(): String? = unwrap(this).getTokenReference()

      /**
       * The value of the style setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formstyleconfig.html#cfn-amplifyuibuilder-form-formstyleconfig-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormStyleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty):
          FormStyleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormStyleConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldInputConfigProperty {
    /**
     * Specifies whether a field has a default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultchecked)
     */
    public fun defaultChecked(): Any? = unwrap(this).getDefaultChecked()

    /**
     * The default country code for a phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultcountrycode)
     */
    public fun defaultCountryCode(): String? = unwrap(this).getDefaultCountryCode()

    /**
     * The default value for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The text to display to describe the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-descriptivetext)
     */
    public fun descriptiveText(): String? = unwrap(this).getDescriptiveText()

    /**
     * The configuration for the file uploader field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-fileuploaderconfig)
     */
    public fun fileUploaderConfig(): Any? = unwrap(this).getFileUploaderConfig()

    /**
     * Specifies whether to render the field as an array.
     *
     * This property is ignored if the `dataSourceType` for the form is a Data Store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-isarray)
     */
    public fun isArray(): Any? = unwrap(this).getIsArray()

    /**
     * The maximum value to display for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-maxvalue)
     */
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    /**
     * The minimum value to display for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-minvalue)
     */
    public fun minValue(): Number? = unwrap(this).getMinValue()

    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The text to display as a placeholder for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-placeholder)
     */
    public fun placeholder(): String? = unwrap(this).getPlaceholder()

    /**
     * Specifies a read only field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * Specifies a field that requires input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-required)
     */
    public fun required(): Any? = unwrap(this).getRequired()

    /**
     * The stepping increment for a numeric value in a field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-step)
     */
    public fun step(): Number? = unwrap(this).getStep()

    /**
     * The input type for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-type)
     */
    public fun type(): String

    /**
     * The value for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * The information to use to customize the input fields with data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-valuemappings)
     */
    public fun valueMappings(): Any? = unwrap(this).getValueMappings()

    /**
     * A builder for [FieldInputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultChecked Specifies whether a field has a default value.
       */
      public fun defaultChecked(defaultChecked: Boolean)

      /**
       * @param defaultChecked Specifies whether a field has a default value.
       */
      public fun defaultChecked(defaultChecked: IResolvable)

      /**
       * @param defaultCountryCode The default country code for a phone number.
       */
      public fun defaultCountryCode(defaultCountryCode: String)

      /**
       * @param defaultValue The default value for the field.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param descriptiveText The text to display to describe the field.
       */
      public fun descriptiveText(descriptiveText: String)

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      public fun fileUploaderConfig(fileUploaderConfig: IResolvable)

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      public fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty)

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d72304510be7d4f339609e15528c03a344679c2b87ce1714ad3f07bb096ea0c9")
      public
          fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty.Builder.() -> Unit)

      /**
       * @param isArray Specifies whether to render the field as an array.
       * This property is ignored if the `dataSourceType` for the form is a Data Store.
       */
      public fun isArray(isArray: Boolean)

      /**
       * @param isArray Specifies whether to render the field as an array.
       * This property is ignored if the `dataSourceType` for the form is a Data Store.
       */
      public fun isArray(isArray: IResolvable)

      /**
       * @param maxValue The maximum value to display for the field.
       */
      public fun maxValue(maxValue: Number)

      /**
       * @param minValue The minimum value to display for the field.
       */
      public fun minValue(minValue: Number)

      /**
       * @param name The name of the field.
       */
      public fun name(name: String)

      /**
       * @param placeholder The text to display as a placeholder for the field.
       */
      public fun placeholder(placeholder: String)

      /**
       * @param readOnly Specifies a read only field.
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly Specifies a read only field.
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param required Specifies a field that requires input.
       */
      public fun required(required: Boolean)

      /**
       * @param required Specifies a field that requires input.
       */
      public fun required(required: IResolvable)

      /**
       * @param step The stepping increment for a numeric value in a field.
       */
      public fun step(step: Number)

      /**
       * @param type The input type for the field. 
       */
      public fun type(type: String)

      /**
       * @param value The value for the field.
       */
      public fun `value`(`value`: String)

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      public fun valueMappings(valueMappings: IResolvable)

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      public fun valueMappings(valueMappings: ValueMappingsProperty)

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24dc45d8d1e745487188d349d0ad4e6938c2c88ccad6784f1ce749cc82d20433")
      public fun valueMappings(valueMappings: ValueMappingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty.builder()

      /**
       * @param defaultChecked Specifies whether a field has a default value.
       */
      override fun defaultChecked(defaultChecked: Boolean) {
        cdkBuilder.defaultChecked(defaultChecked)
      }

      /**
       * @param defaultChecked Specifies whether a field has a default value.
       */
      override fun defaultChecked(defaultChecked: IResolvable) {
        cdkBuilder.defaultChecked(defaultChecked.let(IResolvable::unwrap))
      }

      /**
       * @param defaultCountryCode The default country code for a phone number.
       */
      override fun defaultCountryCode(defaultCountryCode: String) {
        cdkBuilder.defaultCountryCode(defaultCountryCode)
      }

      /**
       * @param defaultValue The default value for the field.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param descriptiveText The text to display to describe the field.
       */
      override fun descriptiveText(descriptiveText: String) {
        cdkBuilder.descriptiveText(descriptiveText)
      }

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      override fun fileUploaderConfig(fileUploaderConfig: IResolvable) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig.let(IResolvable::unwrap))
      }

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      override fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig.let(FileUploaderFieldConfigProperty::unwrap))
      }

      /**
       * @param fileUploaderConfig The configuration for the file uploader field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d72304510be7d4f339609e15528c03a344679c2b87ce1714ad3f07bb096ea0c9")
      override
          fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty.Builder.() -> Unit):
          Unit = fileUploaderConfig(FileUploaderFieldConfigProperty(fileUploaderConfig))

      /**
       * @param isArray Specifies whether to render the field as an array.
       * This property is ignored if the `dataSourceType` for the form is a Data Store.
       */
      override fun isArray(isArray: Boolean) {
        cdkBuilder.isArray(isArray)
      }

      /**
       * @param isArray Specifies whether to render the field as an array.
       * This property is ignored if the `dataSourceType` for the form is a Data Store.
       */
      override fun isArray(isArray: IResolvable) {
        cdkBuilder.isArray(isArray.let(IResolvable::unwrap))
      }

      /**
       * @param maxValue The maximum value to display for the field.
       */
      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue The minimum value to display for the field.
       */
      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      /**
       * @param name The name of the field.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param placeholder The text to display as a placeholder for the field.
       */
      override fun placeholder(placeholder: String) {
        cdkBuilder.placeholder(placeholder)
      }

      /**
       * @param readOnly Specifies a read only field.
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly Specifies a read only field.
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      /**
       * @param required Specifies a field that requires input.
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required Specifies a field that requires input.
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      /**
       * @param step The stepping increment for a numeric value in a field.
       */
      override fun step(step: Number) {
        cdkBuilder.step(step)
      }

      /**
       * @param type The input type for the field. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The value for the field.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      override fun valueMappings(valueMappings: IResolvable) {
        cdkBuilder.valueMappings(valueMappings.let(IResolvable::unwrap))
      }

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      override fun valueMappings(valueMappings: ValueMappingsProperty) {
        cdkBuilder.valueMappings(valueMappings.let(ValueMappingsProperty::unwrap))
      }

      /**
       * @param valueMappings The information to use to customize the input fields with data at
       * runtime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24dc45d8d1e745487188d349d0ad4e6938c2c88ccad6784f1ce749cc82d20433")
      override fun valueMappings(valueMappings: ValueMappingsProperty.Builder.() -> Unit): Unit =
          valueMappings(ValueMappingsProperty(valueMappings))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty,
    ) : FieldInputConfigProperty {
      /**
       * Specifies whether a field has a default value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultchecked)
       */
      override fun defaultChecked(): Any? = unwrap(this).getDefaultChecked()

      /**
       * The default country code for a phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultcountrycode)
       */
      override fun defaultCountryCode(): String? = unwrap(this).getDefaultCountryCode()

      /**
       * The default value for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The text to display to describe the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-descriptivetext)
       */
      override fun descriptiveText(): String? = unwrap(this).getDescriptiveText()

      /**
       * The configuration for the file uploader field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-fileuploaderconfig)
       */
      override fun fileUploaderConfig(): Any? = unwrap(this).getFileUploaderConfig()

      /**
       * Specifies whether to render the field as an array.
       *
       * This property is ignored if the `dataSourceType` for the form is a Data Store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-isarray)
       */
      override fun isArray(): Any? = unwrap(this).getIsArray()

      /**
       * The maximum value to display for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-maxvalue)
       */
      override fun maxValue(): Number? = unwrap(this).getMaxValue()

      /**
       * The minimum value to display for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-minvalue)
       */
      override fun minValue(): Number? = unwrap(this).getMinValue()

      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The text to display as a placeholder for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-placeholder)
       */
      override fun placeholder(): String? = unwrap(this).getPlaceholder()

      /**
       * Specifies a read only field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * Specifies a field that requires input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-required)
       */
      override fun required(): Any? = unwrap(this).getRequired()

      /**
       * The stepping increment for a numeric value in a field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-step)
       */
      override fun step(): Number? = unwrap(this).getStep()

      /**
       * The input type for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The value for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()

      /**
       * The information to use to customize the input fields with data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html#cfn-amplifyuibuilder-form-fieldinputconfig-valuemappings)
       */
      override fun valueMappings(): Any? = unwrap(this).getValueMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldInputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty):
          FieldInputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldInputConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SectionalElementProperty {
    /**
     * Excludes a sectional element that was generated by default for a specified data model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-excluded)
     */
    public fun excluded(): Any? = unwrap(this).getExcluded()

    /**
     * Specifies the size of the font for a `Heading` sectional element.
     *
     * Valid values are `1 | 2 | 3 | 4 | 5 | 6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-level)
     */
    public fun level(): Number? = unwrap(this).getLevel()

    /**
     * Specifies the orientation for a `Divider` sectional element.
     *
     * Valid values are `horizontal` or `vertical` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-orientation)
     */
    public fun orientation(): String? = unwrap(this).getOrientation()

    /**
     * Specifies the position of the text in a field for a `Text` sectional element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-position)
     */
    public fun position(): Any? = unwrap(this).getPosition()

    /**
     * The text for a `Text` sectional element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * The type of sectional element.
     *
     * Valid values are `Heading` , `Text` , and `Divider` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-type)
     */
    public fun type(): String

    /**
     * A builder for [SectionalElementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excluded Excludes a sectional element that was generated by default for a specified
       * data model.
       */
      public fun excluded(excluded: Boolean)

      /**
       * @param excluded Excludes a sectional element that was generated by default for a specified
       * data model.
       */
      public fun excluded(excluded: IResolvable)

      /**
       * @param level Specifies the size of the font for a `Heading` sectional element.
       * Valid values are `1 | 2 | 3 | 4 | 5 | 6` .
       */
      public fun level(level: Number)

      /**
       * @param orientation Specifies the orientation for a `Divider` sectional element.
       * Valid values are `horizontal` or `vertical` .
       */
      public fun orientation(orientation: String)

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      public fun position(position: IResolvable)

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      public fun position(position: FieldPositionProperty)

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29f5995b373681bbb8afd12257b52048879f0802b7450f689680aa8c60c76bea")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit)

      /**
       * @param text The text for a `Text` sectional element.
       */
      public fun text(text: String)

      /**
       * @param type The type of sectional element. 
       * Valid values are `Heading` , `Text` , and `Divider` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty.builder()

      /**
       * @param excluded Excludes a sectional element that was generated by default for a specified
       * data model.
       */
      override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      /**
       * @param excluded Excludes a sectional element that was generated by default for a specified
       * data model.
       */
      override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      /**
       * @param level Specifies the size of the font for a `Heading` sectional element.
       * Valid values are `1 | 2 | 3 | 4 | 5 | 6` .
       */
      override fun level(level: Number) {
        cdkBuilder.level(level)
      }

      /**
       * @param orientation Specifies the orientation for a `Divider` sectional element.
       * Valid values are `horizontal` or `vertical` .
       */
      override fun orientation(orientation: String) {
        cdkBuilder.orientation(orientation)
      }

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      /**
       * @param position Specifies the position of the text in a field for a `Text` sectional
       * element.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29f5995b373681bbb8afd12257b52048879f0802b7450f689680aa8c60c76bea")
      override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      /**
       * @param text The text for a `Text` sectional element.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param type The type of sectional element. 
       * Valid values are `Heading` , `Text` , and `Divider` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty,
    ) : SectionalElementProperty {
      /**
       * Excludes a sectional element that was generated by default for a specified data model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-excluded)
       */
      override fun excluded(): Any? = unwrap(this).getExcluded()

      /**
       * Specifies the size of the font for a `Heading` sectional element.
       *
       * Valid values are `1 | 2 | 3 | 4 | 5 | 6` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-level)
       */
      override fun level(): Number? = unwrap(this).getLevel()

      /**
       * Specifies the orientation for a `Divider` sectional element.
       *
       * Valid values are `horizontal` or `vertical` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-orientation)
       */
      override fun orientation(): String? = unwrap(this).getOrientation()

      /**
       * Specifies the position of the text in a field for a `Text` sectional element.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-position)
       */
      override fun position(): Any? = unwrap(this).getPosition()

      /**
       * The text for a `Text` sectional element.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-text)
       */
      override fun text(): String? = unwrap(this).getText()

      /**
       * The type of sectional element.
       *
       * Valid values are `Heading` , `Text` , and `Divider` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html#cfn-amplifyuibuilder-form-sectionalelement-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SectionalElementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty):
          SectionalElementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SectionalElementProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormInputBindingPropertiesValuePropertiesProperty {
    /**
     * An Amplify DataStore model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalueproperties-model)
     */
    public fun model(): String? = unwrap(this).getModel()

    /**
     * A builder for [FormInputBindingPropertiesValuePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param model An Amplify DataStore model.
       */
      public fun model(model: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty.builder()

      /**
       * @param model An Amplify DataStore model.
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty,
    ) : FormInputBindingPropertiesValuePropertiesProperty {
      /**
       * An Amplify DataStore model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-forminputbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-form-forminputbindingpropertiesvalueproperties-model)
       */
      override fun model(): String? = unwrap(this).getModel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputBindingPropertiesValuePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty):
          FormInputBindingPropertiesValuePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputBindingPropertiesValuePropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormDataTypeConfigProperty {
    /**
     * The data source type, either an Amplify DataStore model or a custom data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html#cfn-amplifyuibuilder-form-formdatatypeconfig-datasourcetype)
     */
    public fun dataSourceType(): String

    /**
     * The unique name of the data type you are using as the data source for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html#cfn-amplifyuibuilder-form-formdatatypeconfig-datatypename)
     */
    public fun dataTypeName(): String

    /**
     * A builder for [FormDataTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceType The data source type, either an Amplify DataStore model or a custom
       * data type. 
       */
      public fun dataSourceType(dataSourceType: String)

      /**
       * @param dataTypeName The unique name of the data type you are using as the data source for
       * the form. 
       */
      public fun dataTypeName(dataTypeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty.builder()

      /**
       * @param dataSourceType The data source type, either an Amplify DataStore model or a custom
       * data type. 
       */
      override fun dataSourceType(dataSourceType: String) {
        cdkBuilder.dataSourceType(dataSourceType)
      }

      /**
       * @param dataTypeName The unique name of the data type you are using as the data source for
       * the form. 
       */
      override fun dataTypeName(dataTypeName: String) {
        cdkBuilder.dataTypeName(dataTypeName)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty,
    ) : FormDataTypeConfigProperty {
      /**
       * The data source type, either an Amplify DataStore model or a custom data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html#cfn-amplifyuibuilder-form-formdatatypeconfig-datasourcetype)
       */
      override fun dataSourceType(): String = unwrap(this).getDataSourceType()

      /**
       * The unique name of the data type you are using as the data source for the form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html#cfn-amplifyuibuilder-form-formdatatypeconfig-datatypename)
       */
      override fun dataTypeName(): String = unwrap(this).getDataTypeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormDataTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty):
          FormDataTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormDataTypeConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldPositionProperty {
    /**
     * The field position is below the field specified by the string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-below)
     */
    public fun below(): String? = unwrap(this).getBelow()

    /**
     * The field position is fixed and doesn't change in relation to other fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-fixed)
     */
    public fun fixed(): String? = unwrap(this).getFixed()

    /**
     * The field position is to the right of the field specified by the string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-rightof)
     */
    public fun rightOf(): String? = unwrap(this).getRightOf()

    /**
     * A builder for [FieldPositionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param below The field position is below the field specified by the string.
       */
      public fun below(below: String)

      /**
       * @param fixed The field position is fixed and doesn't change in relation to other fields.
       */
      public fun fixed(fixed: String)

      /**
       * @param rightOf The field position is to the right of the field specified by the string.
       */
      public fun rightOf(rightOf: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty.builder()

      /**
       * @param below The field position is below the field specified by the string.
       */
      override fun below(below: String) {
        cdkBuilder.below(below)
      }

      /**
       * @param fixed The field position is fixed and doesn't change in relation to other fields.
       */
      override fun fixed(fixed: String) {
        cdkBuilder.fixed(fixed)
      }

      /**
       * @param rightOf The field position is to the right of the field specified by the string.
       */
      override fun rightOf(rightOf: String) {
        cdkBuilder.rightOf(rightOf)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty,
    ) : FieldPositionProperty {
      /**
       * The field position is below the field specified by the string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-below)
       */
      override fun below(): String? = unwrap(this).getBelow()

      /**
       * The field position is fixed and doesn't change in relation to other fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-fixed)
       */
      override fun fixed(): String? = unwrap(this).getFixed()

      /**
       * The field position is to the right of the field specified by the string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html#cfn-amplifyuibuilder-form-fieldposition-rightof)
       */
      override fun rightOf(): String? = unwrap(this).getRightOf()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldPositionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty):
          FieldPositionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldPositionProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ValueMappingsProperty {
    /**
     * The information to bind fields to data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemappings.html#cfn-amplifyuibuilder-form-valuemappings-bindingproperties)
     */
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * The value and display value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemappings.html#cfn-amplifyuibuilder-form-valuemappings-values)
     */
    public fun values(): Any

    /**
     * A builder for [ValueMappingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      public fun bindingProperties(bindingProperties: IResolvable)

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      public fun bindingProperties(bindingProperties: Map<String, Any>)

      /**
       * @param values The value and display value pairs. 
       */
      public fun values(values: IResolvable)

      /**
       * @param values The value and display value pairs. 
       */
      public fun values(values: List<Any>)

      /**
       * @param values The value and display value pairs. 
       */
      public fun values(vararg values: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty.builder()

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param bindingProperties The information to bind fields to data at runtime.
       */
      override fun bindingProperties(bindingProperties: Map<String, Any>) {
        cdkBuilder.bindingProperties(bindingProperties)
      }

      /**
       * @param values The value and display value pairs. 
       */
      override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable::unwrap))
      }

      /**
       * @param values The value and display value pairs. 
       */
      override fun values(values: List<Any>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The value and display value pairs. 
       */
      override fun values(vararg values: Any): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty,
    ) : ValueMappingsProperty {
      /**
       * The information to bind fields to data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemappings.html#cfn-amplifyuibuilder-form-valuemappings-bindingproperties)
       */
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      /**
       * The value and display value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemappings.html#cfn-amplifyuibuilder-form-valuemappings-values)
       */
      override fun values(): Any = unwrap(this).getValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValueMappingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty):
          ValueMappingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValueMappingsProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FieldConfigProperty {
    /**
     * Specifies whether to hide a field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-excluded)
     */
    public fun excluded(): Any? = unwrap(this).getExcluded()

    /**
     * Describes the configuration for the default input value to display for a field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-inputtype)
     */
    public fun inputType(): Any? = unwrap(this).getInputType()

    /**
     * The label for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-label)
     */
    public fun label(): String? = unwrap(this).getLabel()

    /**
     * Specifies the field position.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-position)
     */
    public fun position(): Any? = unwrap(this).getPosition()

    /**
     * The validations to perform on the value in the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-validations)
     */
    public fun validations(): Any? = unwrap(this).getValidations()

    /**
     * A builder for [FieldConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excluded Specifies whether to hide a field.
       */
      public fun excluded(excluded: Boolean)

      /**
       * @param excluded Specifies whether to hide a field.
       */
      public fun excluded(excluded: IResolvable)

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      public fun inputType(inputType: IResolvable)

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      public fun inputType(inputType: FieldInputConfigProperty)

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64032d2e345e9547d0f3723ea7d0e92e4b928e6587669dd5bb3f6dc3742b141")
      public fun inputType(inputType: FieldInputConfigProperty.Builder.() -> Unit)

      /**
       * @param label The label for the field.
       */
      public fun label(label: String)

      /**
       * @param position Specifies the field position.
       */
      public fun position(position: IResolvable)

      /**
       * @param position Specifies the field position.
       */
      public fun position(position: FieldPositionProperty)

      /**
       * @param position Specifies the field position.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d0acb41da5497eb76185a9fa1f05138d22a493616d0de6fdae657e8289e1d15")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit)

      /**
       * @param validations The validations to perform on the value in the field.
       */
      public fun validations(validations: IResolvable)

      /**
       * @param validations The validations to perform on the value in the field.
       */
      public fun validations(validations: List<Any>)

      /**
       * @param validations The validations to perform on the value in the field.
       */
      public fun validations(vararg validations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty.builder()

      /**
       * @param excluded Specifies whether to hide a field.
       */
      override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      /**
       * @param excluded Specifies whether to hide a field.
       */
      override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      override fun inputType(inputType: IResolvable) {
        cdkBuilder.inputType(inputType.let(IResolvable::unwrap))
      }

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      override fun inputType(inputType: FieldInputConfigProperty) {
        cdkBuilder.inputType(inputType.let(FieldInputConfigProperty::unwrap))
      }

      /**
       * @param inputType Describes the configuration for the default input value to display for a
       * field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64032d2e345e9547d0f3723ea7d0e92e4b928e6587669dd5bb3f6dc3742b141")
      override fun inputType(inputType: FieldInputConfigProperty.Builder.() -> Unit): Unit =
          inputType(FieldInputConfigProperty(inputType))

      /**
       * @param label The label for the field.
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      /**
       * @param position Specifies the field position.
       */
      override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      /**
       * @param position Specifies the field position.
       */
      override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      /**
       * @param position Specifies the field position.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d0acb41da5497eb76185a9fa1f05138d22a493616d0de6fdae657e8289e1d15")
      override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      /**
       * @param validations The validations to perform on the value in the field.
       */
      override fun validations(validations: IResolvable) {
        cdkBuilder.validations(validations.let(IResolvable::unwrap))
      }

      /**
       * @param validations The validations to perform on the value in the field.
       */
      override fun validations(validations: List<Any>) {
        cdkBuilder.validations(validations)
      }

      /**
       * @param validations The validations to perform on the value in the field.
       */
      override fun validations(vararg validations: Any): Unit = validations(validations.toList())

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty,
    ) : FieldConfigProperty {
      /**
       * Specifies whether to hide a field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-excluded)
       */
      override fun excluded(): Any? = unwrap(this).getExcluded()

      /**
       * Describes the configuration for the default input value to display for a field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-inputtype)
       */
      override fun inputType(): Any? = unwrap(this).getInputType()

      /**
       * The label for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-label)
       */
      override fun label(): String? = unwrap(this).getLabel()

      /**
       * Specifies the field position.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-position)
       */
      override fun position(): Any? = unwrap(this).getPosition()

      /**
       * The validations to perform on the value in the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldconfig.html#cfn-amplifyuibuilder-form-fieldconfig-validations)
       */
      override fun validations(): Any? = unwrap(this).getValidations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty):
          FieldConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ValueMappingProperty {
    /**
     * The value to display for the complex object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html#cfn-amplifyuibuilder-form-valuemapping-displayvalue)
     */
    public fun displayValue(): Any? = unwrap(this).getDisplayValue()

    /**
     * The complex object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html#cfn-amplifyuibuilder-form-valuemapping-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [ValueMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param displayValue The value to display for the complex object.
       */
      public fun displayValue(displayValue: IResolvable)

      /**
       * @param displayValue The value to display for the complex object.
       */
      public fun displayValue(displayValue: FormInputValuePropertyProperty)

      /**
       * @param displayValue The value to display for the complex object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d66ecd117a0518e7526fb410cb6fd154848ed15171575daf97d7c89f93274")
      public fun displayValue(displayValue: FormInputValuePropertyProperty.Builder.() -> Unit)

      /**
       * @param value The complex object. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The complex object. 
       */
      public fun `value`(`value`: FormInputValuePropertyProperty)

      /**
       * @param value The complex object. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d5251c5427e224c5f176efeba18536c54d33b5366e834e5700aa70bcb9ebc2a")
      public fun `value`(`value`: FormInputValuePropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty.builder()

      /**
       * @param displayValue The value to display for the complex object.
       */
      override fun displayValue(displayValue: IResolvable) {
        cdkBuilder.displayValue(displayValue.let(IResolvable::unwrap))
      }

      /**
       * @param displayValue The value to display for the complex object.
       */
      override fun displayValue(displayValue: FormInputValuePropertyProperty) {
        cdkBuilder.displayValue(displayValue.let(FormInputValuePropertyProperty::unwrap))
      }

      /**
       * @param displayValue The value to display for the complex object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d66ecd117a0518e7526fb410cb6fd154848ed15171575daf97d7c89f93274")
      override fun displayValue(displayValue: FormInputValuePropertyProperty.Builder.() -> Unit):
          Unit = displayValue(FormInputValuePropertyProperty(displayValue))

      /**
       * @param value The complex object. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The complex object. 
       */
      override fun `value`(`value`: FormInputValuePropertyProperty) {
        cdkBuilder.`value`(`value`.let(FormInputValuePropertyProperty::unwrap))
      }

      /**
       * @param value The complex object. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d5251c5427e224c5f176efeba18536c54d33b5366e834e5700aa70bcb9ebc2a")
      override fun `value`(`value`: FormInputValuePropertyProperty.Builder.() -> Unit): Unit =
          `value`(FormInputValuePropertyProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty,
    ) : ValueMappingProperty {
      /**
       * The value to display for the complex object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html#cfn-amplifyuibuilder-form-valuemapping-displayvalue)
       */
      override fun displayValue(): Any? = unwrap(this).getDisplayValue()

      /**
       * The complex object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-valuemapping.html#cfn-amplifyuibuilder-form-valuemapping-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValueMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty):
          ValueMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValueMappingProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
