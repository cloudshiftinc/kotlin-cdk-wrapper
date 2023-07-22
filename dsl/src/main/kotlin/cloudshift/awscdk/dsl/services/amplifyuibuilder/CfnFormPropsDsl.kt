@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps

@CdkDslMarker
public class CfnFormPropsDsl {
  private val cdkBuilder: CfnFormProps.Builder = CfnFormProps.builder()

  /**
   * @param appId The unique ID of the Amplify app associated with the form.
   */
  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  /**
   * @param cta The `FormCTA` object that stores the call to action configuration for the form.
   */
  public fun cta(cta: IResolvable) {
    cdkBuilder.cta(cta)
  }

  /**
   * @param cta The `FormCTA` object that stores the call to action configuration for the form.
   */
  public fun cta(cta: CfnForm.FormCTAProperty) {
    cdkBuilder.cta(cta)
  }

  /**
   * @param dataType The type of data source to use to create the form. 
   */
  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param dataType The type of data source to use to create the form. 
   */
  public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param environmentName The name of the backend environment that is a part of the Amplify app.
   */
  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  /**
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(fields)
    cdkBuilder.fields(builder.map)
  }

  /**
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: Map<String, Any>) {
    cdkBuilder.fields(fields)
  }

  /**
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  /**
   * @param formActionType Specifies whether to perform a create or update action on the form. 
   */
  public fun formActionType(formActionType: String) {
    cdkBuilder.formActionType(formActionType)
  }

  /**
   * @param labelDecorator Specifies an icon or decoration to display on the form.
   */
  public fun labelDecorator(labelDecorator: String) {
    cdkBuilder.labelDecorator(labelDecorator)
  }

  /**
   * @param name The name of the form. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param schemaVersion The schema version of the form. 
   */
  public fun schemaVersion(schemaVersion: String) {
    cdkBuilder.schemaVersion(schemaVersion)
  }

  /**
   * @param sectionalElements The configuration information for the visual helper elements for the
   * form. 
   * These elements are not associated with any data.
   */
  public fun sectionalElements(sectionalElements: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(sectionalElements)
    cdkBuilder.sectionalElements(builder.map)
  }

  /**
   * @param sectionalElements The configuration information for the visual helper elements for the
   * form. 
   * These elements are not associated with any data.
   */
  public fun sectionalElements(sectionalElements: Map<String, Any>) {
    cdkBuilder.sectionalElements(sectionalElements)
  }

  /**
   * @param sectionalElements The configuration information for the visual helper elements for the
   * form. 
   * These elements are not associated with any data.
   */
  public fun sectionalElements(sectionalElements: IResolvable) {
    cdkBuilder.sectionalElements(sectionalElements)
  }

  /**
   * @param style The configuration for the form's style. 
   */
  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  /**
   * @param style The configuration for the form's style. 
   */
  public fun style(style: CfnForm.FormStyleProperty) {
    cdkBuilder.style(style)
  }

  /**
   * @param tags One or more key-value pairs to use when tagging the form data.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnFormProps = cdkBuilder.build()
}
