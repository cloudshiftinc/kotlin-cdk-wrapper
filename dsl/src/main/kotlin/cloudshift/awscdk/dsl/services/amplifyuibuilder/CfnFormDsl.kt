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
import software.constructs.Construct

@CdkDslMarker
public class CfnFormDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnForm.Builder = CfnForm.Builder.create(scope, id)

  /**
   * The unique ID of the Amplify app associated with the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-appid)
   * @param appId The unique ID of the Amplify app associated with the form. 
   */
  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
   * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
   */
  public fun cta(cta: IResolvable) {
    cdkBuilder.cta(cta)
  }

  /**
   * The `FormCTA` object that stores the call to action configuration for the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-cta)
   * @param cta The `FormCTA` object that stores the call to action configuration for the form. 
   */
  public fun cta(cta: CfnForm.FormCTAProperty) {
    cdkBuilder.cta(cta)
  }

  /**
   * The type of data source to use to create the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
   * @param dataType The type of data source to use to create the form. 
   */
  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * The type of data source to use to create the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-datatype)
   * @param dataType The type of data source to use to create the form. 
   */
  public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * The name of the backend environment that is a part of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-environmentname)
   * @param environmentName The name of the backend environment that is a part of the Amplify app. 
   */
  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  /**
   * The configuration information for the form's fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(fields)
    cdkBuilder.fields(builder.map)
  }

  /**
   * The configuration information for the form's fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: Map<String, Any>) {
    cdkBuilder.fields(fields)
  }

  /**
   * The configuration information for the form's fields.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-fields)
   * @param fields The configuration information for the form's fields. 
   */
  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  /**
   * Specifies whether to perform a create or update action on the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-formactiontype)
   * @param formActionType Specifies whether to perform a create or update action on the form. 
   */
  public fun formActionType(formActionType: String) {
    cdkBuilder.formActionType(formActionType)
  }

  /**
   * Specifies an icon or decoration to display on the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-labeldecorator)
   * @param labelDecorator Specifies an icon or decoration to display on the form. 
   */
  public fun labelDecorator(labelDecorator: String) {
    cdkBuilder.labelDecorator(labelDecorator)
  }

  /**
   * The name of the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-name)
   * @param name The name of the form. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The schema version of the form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-schemaversion)
   * @param schemaVersion The schema version of the form. 
   */
  public fun schemaVersion(schemaVersion: String) {
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
  public fun sectionalElements(sectionalElements: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(sectionalElements)
    cdkBuilder.sectionalElements(builder.map)
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
  public fun sectionalElements(sectionalElements: Map<String, Any>) {
    cdkBuilder.sectionalElements(sectionalElements)
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
  public fun sectionalElements(sectionalElements: IResolvable) {
    cdkBuilder.sectionalElements(sectionalElements)
  }

  /**
   * The configuration for the form's style.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
   * @param style The configuration for the form's style. 
   */
  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  /**
   * The configuration for the form's style.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-style)
   * @param style The configuration for the form's style. 
   */
  public fun style(style: CfnForm.FormStyleProperty) {
    cdkBuilder.style(style)
  }

  /**
   * One or more key-value pairs to use when tagging the form data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-form.html#cfn-amplifyuibuilder-form-tags)
   * @param tags One or more key-value pairs to use when tagging the form data. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnForm = cdkBuilder.build()
}
