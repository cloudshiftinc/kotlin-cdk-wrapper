@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnForm`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
 * FormInputValuePropertyProperty formInputValuePropertyProperty_;
 * CfnFormProps cfnFormProps = CfnFormProps.builder()
 * .appId("appId")
 * .cta(FormCTAProperty.builder()
 * .cancel(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .clear(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .position("position")
 * .submit(FormButtonProperty.builder()
 * .children("children")
 * .excluded(false)
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .build())
 * .build())
 * .dataType(FormDataTypeConfigProperty.builder()
 * .dataSourceType("dataSourceType")
 * .dataTypeName("dataTypeName")
 * .build())
 * .environmentName("environmentName")
 * .fields(Map.of(
 * "fieldsKey", FieldConfigProperty.builder()
 * .excluded(false)
 * .inputType(FieldInputConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .defaultChecked(false)
 * .defaultCountryCode("defaultCountryCode")
 * .defaultValue("defaultValue")
 * .descriptiveText("descriptiveText")
 * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
 * .acceptedFileTypes(List.of("acceptedFileTypes"))
 * .accessLevel("accessLevel")
 * // the properties below are optional
 * .isResumable(false)
 * .maxFileCount(123)
 * .maxSize(123)
 * .showThumbnails(false)
 * .build())
 * .isArray(false)
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .placeholder("placeholder")
 * .readOnly(false)
 * .required(false)
 * .step(123)
 * .value("value")
 * .valueMappings(ValueMappingsProperty.builder()
 * .values(List.of(ValueMappingProperty.builder()
 * .value(FormInputValuePropertyProperty.builder()
 * .bindingProperties(FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .concat(List.of(formInputValuePropertyProperty_))
 * .value("value")
 * .build())
 * // the properties below are optional
 * .displayValue(FormInputValuePropertyProperty.builder()
 * .bindingProperties(FormInputValuePropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build())
 * .concat(List.of(formInputValuePropertyProperty_))
 * .value("value")
 * .build())
 * .build()))
 * // the properties below are optional
 * .bindingProperties(Map.of(
 * "bindingPropertiesKey", FormInputBindingPropertiesValueProperty.builder()
 * .bindingProperties(FormInputBindingPropertiesValuePropertiesProperty.builder()
 * .model("model")
 * .build())
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .label("label")
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .validations(List.of(FieldValidationConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .numValues(List.of(123))
 * .strValues(List.of("strValues"))
 * .validationMessage("validationMessage")
 * .build()))
 * .build()))
 * .formActionType("formActionType")
 * .labelDecorator("labelDecorator")
 * .name("name")
 * .schemaVersion("schemaVersion")
 * .sectionalElements(Map.of(
 * "sectionalElementsKey", SectionalElementProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .excluded(false)
 * .level(123)
 * .orientation("orientation")
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .text("text")
 * .build()))
 * .style(FormStyleProperty.builder()
 * .horizontalGap(FormStyleConfigProperty.builder()
 * .tokenReference("tokenReference")
 * .value("value")
 * .build())
 * .outerPadding(FormStyleConfigProperty.builder()
 * .tokenReference("tokenReference")
 * .value("value")
 * .build())
 * .verticalGap(FormStyleConfigProperty.builder()
 * .tokenReference("tokenReference")
 * .value("value")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html)
 */
public interface CfnFormProps {
  /**
   * The unique ID of the Amplify app associated with the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-appid)
   */
  public fun appId(): String? = unwrap(this).getAppId()

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
   */
  public fun cta(): Any? = unwrap(this).getCta()

  /**
   * The type of data source to use to create the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
   */
  public fun dataType(): Any? = unwrap(this).getDataType()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The configuration information for the form's fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
   */
  public fun fields(): Any? = unwrap(this).getFields()

  /**
   * Specifies whether to perform a create or update action on the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-formactiontype)
   */
  public fun formActionType(): String? = unwrap(this).getFormActionType()

  /**
   * Specifies an icon or decoration to display on the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-labeldecorator)
   */
  public fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

  /**
   * The name of the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The schema version of the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-schemaversion)
   */
  public fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  /**
   * The configuration information for the visual helper elements for the form.
   *
   * These elements are not associated with any data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
   */
  public fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

  /**
   * The configuration for the form's style.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
   */
  public fun style(): Any? = unwrap(this).getStyle()

  /**
   * One or more key-value pairs to use when tagging the form data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnFormProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID of the Amplify app associated with the form.
     */
    public fun appId(appId: String)

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    public fun cta(cta: IResolvable)

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    public fun cta(cta: CfnForm.FormCTAProperty)

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4d8a788aea136ad682a689412b673fdd09333c0956ff066b535e602cff4c3bc")
    public fun cta(cta: CfnForm.FormCTAProperty.Builder.() -> Unit)

    /**
     * @param dataType The type of data source to use to create the form.
     */
    public fun dataType(dataType: IResolvable)

    /**
     * @param dataType The type of data source to use to create the form.
     */
    public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty)

    /**
     * @param dataType The type of data source to use to create the form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd34f6fe67bf4eaa90a5548a2aa03a07acb9ed0b6d948557e889028044dc9c2d")
    public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty.Builder.() -> Unit)

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param fields The configuration information for the form's fields.
     */
    public fun fields(fields: IResolvable)

    /**
     * @param fields The configuration information for the form's fields.
     */
    public fun fields(fields: Map<String, Any>)

    /**
     * @param formActionType Specifies whether to perform a create or update action on the form.
     */
    public fun formActionType(formActionType: String)

    /**
     * @param labelDecorator Specifies an icon or decoration to display on the form.
     */
    public fun labelDecorator(labelDecorator: String)

    /**
     * @param name The name of the form.
     */
    public fun name(name: String)

    /**
     * @param schemaVersion The schema version of the form.
     */
    public fun schemaVersion(schemaVersion: String)

    /**
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form.
     * These elements are not associated with any data.
     */
    public fun sectionalElements(sectionalElements: IResolvable)

    /**
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form.
     * These elements are not associated with any data.
     */
    public fun sectionalElements(sectionalElements: Map<String, Any>)

    /**
     * @param style The configuration for the form's style.
     */
    public fun style(style: IResolvable)

    /**
     * @param style The configuration for the form's style.
     */
    public fun style(style: CfnForm.FormStyleProperty)

    /**
     * @param style The configuration for the form's style.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a68dcfdb931875e80d54d675242565a871d9d06bcfc323ca08f657e4ad7a87")
    public fun style(style: CfnForm.FormStyleProperty.Builder.() -> Unit)

    /**
     * @param tags One or more key-value pairs to use when tagging the form data.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps.builder()

    /**
     * @param appId The unique ID of the Amplify app associated with the form.
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    override fun cta(cta: IResolvable) {
      cdkBuilder.cta(cta.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    override fun cta(cta: CfnForm.FormCTAProperty) {
      cdkBuilder.cta(cta.let(CfnForm.FormCTAProperty.Companion::unwrap))
    }

    /**
     * @param cta The `FormCTA` object that stores the call to action configuration for the form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4d8a788aea136ad682a689412b673fdd09333c0956ff066b535e602cff4c3bc")
    override fun cta(cta: CfnForm.FormCTAProperty.Builder.() -> Unit): Unit =
        cta(CfnForm.FormCTAProperty(cta))

    /**
     * @param dataType The type of data source to use to create the form.
     */
    override fun dataType(dataType: IResolvable) {
      cdkBuilder.dataType(dataType.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataType The type of data source to use to create the form.
     */
    override fun dataType(dataType: CfnForm.FormDataTypeConfigProperty) {
      cdkBuilder.dataType(dataType.let(CfnForm.FormDataTypeConfigProperty.Companion::unwrap))
    }

    /**
     * @param dataType The type of data source to use to create the form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd34f6fe67bf4eaa90a5548a2aa03a07acb9ed0b6d948557e889028044dc9c2d")
    override fun dataType(dataType: CfnForm.FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
        dataType(CfnForm.FormDataTypeConfigProperty(dataType))

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param fields The configuration information for the form's fields.
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fields The configuration information for the form's fields.
     */
    override fun fields(fields: Map<String, Any>) {
      cdkBuilder.fields(fields.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param formActionType Specifies whether to perform a create or update action on the form.
     */
    override fun formActionType(formActionType: String) {
      cdkBuilder.formActionType(formActionType)
    }

    /**
     * @param labelDecorator Specifies an icon or decoration to display on the form.
     */
    override fun labelDecorator(labelDecorator: String) {
      cdkBuilder.labelDecorator(labelDecorator)
    }

    /**
     * @param name The name of the form.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schemaVersion The schema version of the form.
     */
    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    /**
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form.
     * These elements are not associated with any data.
     */
    override fun sectionalElements(sectionalElements: IResolvable) {
      cdkBuilder.sectionalElements(sectionalElements.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sectionalElements The configuration information for the visual helper elements for the
     * form.
     * These elements are not associated with any data.
     */
    override fun sectionalElements(sectionalElements: Map<String, Any>) {
      cdkBuilder.sectionalElements(sectionalElements.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param style The configuration for the form's style.
     */
    override fun style(style: IResolvable) {
      cdkBuilder.style(style.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param style The configuration for the form's style.
     */
    override fun style(style: CfnForm.FormStyleProperty) {
      cdkBuilder.style(style.let(CfnForm.FormStyleProperty.Companion::unwrap))
    }

    /**
     * @param style The configuration for the form's style.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a68dcfdb931875e80d54d675242565a871d9d06bcfc323ca08f657e4ad7a87")
    override fun style(style: CfnForm.FormStyleProperty.Builder.() -> Unit): Unit =
        style(CfnForm.FormStyleProperty(style))

    /**
     * @param tags One or more key-value pairs to use when tagging the form data.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps,
  ) : CdkObject(cdkObject), CfnFormProps {
    /**
     * The unique ID of the Amplify app associated with the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-appid)
     */
    override fun appId(): String? = unwrap(this).getAppId()

    /**
     * The `FormCTA` object that stores the call to action configuration for the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
     */
    override fun cta(): Any? = unwrap(this).getCta()

    /**
     * The type of data source to use to create the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
     */
    override fun dataType(): Any? = unwrap(this).getDataType()

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * The configuration information for the form's fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
     */
    override fun fields(): Any? = unwrap(this).getFields()

    /**
     * Specifies whether to perform a create or update action on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-formactiontype)
     */
    override fun formActionType(): String? = unwrap(this).getFormActionType()

    /**
     * Specifies an icon or decoration to display on the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-labeldecorator)
     */
    override fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

    /**
     * The name of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The schema version of the form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-schemaversion)
     */
    override fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

    /**
     * The configuration information for the visual helper elements for the form.
     *
     * These elements are not associated with any data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-sectionalelements)
     */
    override fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

    /**
     * The configuration for the form's style.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
     */
    override fun style(): Any? = unwrap(this).getStyle()

    /**
     * One or more key-value pairs to use when tagging the form data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFormProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps):
        CfnFormProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFormProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFormProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
  }
}
