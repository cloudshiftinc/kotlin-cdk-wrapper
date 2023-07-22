@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.constructs.Construct

@CdkDslMarker
public class CfnIncludeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInclude.Builder = CfnInclude.Builder.create(scope, id)

  /**
   * Specifies whether to allow cyclical references, effectively disregarding safeguards meant to
   * avoid undeployable templates.
   *
   * This should only be set to true in the case of templates utilizing cloud transforms (e.g. SAM)
   * that
   * after processing the transform will no longer contain any circular references.
   *
   * Default: - will throw an error on detecting any cyclical references
   *
   * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
   * disregarding safeguards meant to avoid undeployable templates. 
   */
  public fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
    cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
  }

  /**
   * Specifies the template files that define nested stacks that should be included.
   *
   * If your template specifies a stack that isn't included here, it won't be created as a
   * NestedStack
   * resource, and it won't be accessible from the `CfnInclude.getNestedStack` method
   * (but will still be accessible from the `CfnInclude.getResource` method).
   *
   * If you include a stack here with an ID that isn't in the template,
   * or is in the template but is not a nested stack,
   * template creation will fail and an error will be thrown.
   *
   * Default: - no nested stacks will be included
   *
   * @param loadNestedStacks Specifies the template files that define nested stacks that should be
   * included. 
   */
  public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
    cdkBuilder.loadNestedStacks(loadNestedStacks)
  }

  /**
   * Specifies parameters to be replaced by the values in this mapping.
   *
   * Any parameters in the template that aren't specified here will be left unmodified.
   * If you include a parameter here with an ID that isn't in the template,
   * template creation will fail and an error will be thrown.
   *
   * If you are importing a parameter from a live stack, we cannot know the value of that
   * parameter. You will need to supply a value for your parameters, else the default
   * value will be used.
   *
   * Default: - parameters will retain their original definitions
   *
   * @param parameters Specifies parameters to be replaced by the values in this mapping. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * Specifies parameters to be replaced by the values in this mapping.
   *
   * Any parameters in the template that aren't specified here will be left unmodified.
   * If you include a parameter here with an ID that isn't in the template,
   * template creation will fail and an error will be thrown.
   *
   * If you are importing a parameter from a live stack, we cannot know the value of that
   * parameter. You will need to supply a value for your parameters, else the default
   * value will be used.
   *
   * Default: - parameters will retain their original definitions
   *
   * @param parameters Specifies parameters to be replaced by the values in this mapping. 
   */
  public fun parameters(parameters: Map<String, Any>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * Whether the resources should have the same logical IDs in the resulting CDK template as they
   * did in the original CloudFormation template file.
   *
   * If you're vending a Construct using an existing CloudFormation template,
   * make sure to pass this as `false`.
   *
   * **Note**: regardless of whether this option is true or false,
   * the `CfnInclude.getResource` and related methods always uses the original logical ID of the
   * resource/element,
   * as specified in the template file.
   *
   * Default: true
   *
   * @param preserveLogicalIds Whether the resources should have the same logical IDs in the
   * resulting CDK template as they did in the original CloudFormation template file. 
   */
  public fun preserveLogicalIds(preserveLogicalIds: Boolean) {
    cdkBuilder.preserveLogicalIds(preserveLogicalIds)
  }

  /**
   * Path to the template file.
   *
   * Both JSON and YAML template formats are supported.
   *
   * @param templateFile Path to the template file. 
   */
  public fun templateFile(templateFile: String) {
    cdkBuilder.templateFile(templateFile)
  }

  public fun build(): CfnInclude = cdkBuilder.build()
}
