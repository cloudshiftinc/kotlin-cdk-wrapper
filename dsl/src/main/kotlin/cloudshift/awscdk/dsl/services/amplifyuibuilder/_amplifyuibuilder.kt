@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
import software.constructs.Construct

public object amplifyuibuilder {
  public inline fun cfnComponent(
    scope: Construct,
    id: String,
    block: CfnComponentDsl.() -> Unit = {},
  ): CfnComponent {
    val builder = CfnComponentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentActionParametersProperty(block: CfnComponentActionParametersPropertyDsl.() -> Unit
      = {}): CfnComponent.ActionParametersProperty {
    val builder = CfnComponentActionParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentBindingPropertiesValuePropertiesProperty(block: CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentBindingPropertiesValuePropertiesProperty {
    val builder = CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentBindingPropertiesValueProperty(block: CfnComponentComponentBindingPropertiesValuePropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentBindingPropertiesValueProperty {
    val builder = CfnComponentComponentBindingPropertiesValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentChildProperty(block: CfnComponentComponentChildPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentChildProperty {
    val builder = CfnComponentComponentChildPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentConditionPropertyProperty(block: CfnComponentComponentConditionPropertyPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentConditionPropertyProperty {
    val builder = CfnComponentComponentConditionPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentDataConfigurationProperty(block: CfnComponentComponentDataConfigurationPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentDataConfigurationProperty {
    val builder = CfnComponentComponentDataConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentEventProperty(block: CfnComponentComponentEventPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentEventProperty {
    val builder = CfnComponentComponentEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentPropertyBindingPropertiesProperty(block: CfnComponentComponentPropertyBindingPropertiesPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentPropertyBindingPropertiesProperty {
    val builder = CfnComponentComponentPropertyBindingPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentPropertyProperty(block: CfnComponentComponentPropertyPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentPropertyProperty {
    val builder = CfnComponentComponentPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentComponentVariantProperty(block: CfnComponentComponentVariantPropertyDsl.() -> Unit
      = {}): CfnComponent.ComponentVariantProperty {
    val builder = CfnComponentComponentVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentFormBindingElementProperty(block: CfnComponentFormBindingElementPropertyDsl.() -> Unit
      = {}): CfnComponent.FormBindingElementProperty {
    val builder = CfnComponentFormBindingElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentMutationActionSetStateParameterProperty(block: CfnComponentMutationActionSetStateParameterPropertyDsl.() -> Unit
      = {}): CfnComponent.MutationActionSetStateParameterProperty {
    val builder = CfnComponentMutationActionSetStateParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnComponentPredicateProperty(block: CfnComponentPredicatePropertyDsl.() -> Unit
      = {}): CfnComponent.PredicateProperty {
    val builder = CfnComponentPredicatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnComponentProps(block: CfnComponentPropsDsl.() -> Unit = {}):
      CfnComponentProps {
    val builder = CfnComponentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentSortPropertyProperty(block: CfnComponentSortPropertyPropertyDsl.() -> Unit =
      {}): CfnComponent.SortPropertyProperty {
    val builder = CfnComponentSortPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnForm(
    scope: Construct,
    id: String,
    block: CfnFormDsl.() -> Unit = {},
  ): CfnForm {
    val builder = CfnFormDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormFieldConfigProperty(block: CfnFormFieldConfigPropertyDsl.() -> Unit =
      {}): CfnForm.FieldConfigProperty {
    val builder = CfnFormFieldConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFieldInputConfigProperty(block: CfnFormFieldInputConfigPropertyDsl.() -> Unit =
      {}): CfnForm.FieldInputConfigProperty {
    val builder = CfnFormFieldInputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormFieldPositionProperty(block: CfnFormFieldPositionPropertyDsl.() -> Unit =
      {}): CfnForm.FieldPositionProperty {
    val builder = CfnFormFieldPositionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFieldValidationConfigurationProperty(block: CfnFormFieldValidationConfigurationPropertyDsl.() -> Unit
      = {}): CfnForm.FieldValidationConfigurationProperty {
    val builder = CfnFormFieldValidationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFileUploaderFieldConfigProperty(block: CfnFormFileUploaderFieldConfigPropertyDsl.() -> Unit
      = {}): CfnForm.FileUploaderFieldConfigProperty {
    val builder = CfnFormFileUploaderFieldConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormFormButtonProperty(block: CfnFormFormButtonPropertyDsl.() -> Unit = {}):
      CfnForm.FormButtonProperty {
    val builder = CfnFormFormButtonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormFormCTAProperty(block: CfnFormFormCTAPropertyDsl.() -> Unit = {}):
      CfnForm.FormCTAProperty {
    val builder = CfnFormFormCTAPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFormDataTypeConfigProperty(block: CfnFormFormDataTypeConfigPropertyDsl.() -> Unit =
      {}): CfnForm.FormDataTypeConfigProperty {
    val builder = CfnFormFormDataTypeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFormInputValuePropertyProperty(block: CfnFormFormInputValuePropertyPropertyDsl.() -> Unit
      = {}): CfnForm.FormInputValuePropertyProperty {
    val builder = CfnFormFormInputValuePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormFormStyleConfigProperty(block: CfnFormFormStyleConfigPropertyDsl.() -> Unit = {}):
      CfnForm.FormStyleConfigProperty {
    val builder = CfnFormFormStyleConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormFormStyleProperty(block: CfnFormFormStylePropertyDsl.() -> Unit = {}):
      CfnForm.FormStyleProperty {
    val builder = CfnFormFormStylePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormProps(block: CfnFormPropsDsl.() -> Unit = {}): CfnFormProps {
    val builder = CfnFormPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFormSectionalElementProperty(block: CfnFormSectionalElementPropertyDsl.() -> Unit =
      {}): CfnForm.SectionalElementProperty {
    val builder = CfnFormSectionalElementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormValueMappingProperty(block: CfnFormValueMappingPropertyDsl.() -> Unit =
      {}): CfnForm.ValueMappingProperty {
    val builder = CfnFormValueMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFormValueMappingsProperty(block: CfnFormValueMappingsPropertyDsl.() -> Unit =
      {}): CfnForm.ValueMappingsProperty {
    val builder = CfnFormValueMappingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTheme(
    scope: Construct,
    id: String,
    block: CfnThemeDsl.() -> Unit = {},
  ): CfnTheme {
    val builder = CfnThemeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeProps(block: CfnThemePropsDsl.() -> Unit = {}): CfnThemeProps {
    val builder = CfnThemePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeThemeValueProperty(block: CfnThemeThemeValuePropertyDsl.() -> Unit =
      {}): CfnTheme.ThemeValueProperty {
    val builder = CfnThemeThemeValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnThemeThemeValuesProperty(block: CfnThemeThemeValuesPropertyDsl.() -> Unit =
      {}): CfnTheme.ThemeValuesProperty {
    val builder = CfnThemeThemeValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
