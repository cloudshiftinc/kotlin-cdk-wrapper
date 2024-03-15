@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construction properties of `CfnInclude`.
 *
 * Example:
 *
 * ```
 * CfnInclude parentTemplate = CfnInclude.Builder.create(this, "ParentStack")
 * .templateFile("path/to/my-parent-template.json")
 * .loadNestedStacks(Map.of(
 * "ChildStack", CfnIncludeProps.builder()
 * .templateFile("path/to/my-nested-template.json")
 * .build()))
 * .build();
 * ```
 */
public interface CfnIncludeProps {
  /**
   * Specifies whether to allow cyclical references, effectively disregarding safeguards meant to
   * avoid undeployable templates.
   *
   * This should only be set to true in the case of templates utilizing cloud transforms (e.g. SAM)
   * that
   * after processing the transform will no longer contain any circular references.
   *
   * Default: - will throw an error on detecting any cyclical references
   */
  public fun allowCyclicalReferences(): Boolean? = unwrap(this).getAllowCyclicalReferences()

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
   */
  public fun loadNestedStacks(): Map<String, CfnIncludeProps> =
      unwrap(this).getLoadNestedStacks()?.mapValues{CfnIncludeProps.wrap(it.value)} ?: emptyMap()

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
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

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
   */
  public fun preserveLogicalIds(): Boolean? = unwrap(this).getPreserveLogicalIds()

  /**
   * Path to the template file.
   *
   * Both JSON and YAML template formats are supported.
   */
  public fun templateFile(): String

  /**
   * A builder for [CfnIncludeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
     * disregarding safeguards meant to avoid undeployable templates.
     * This should only be set to true in the case of templates utilizing cloud transforms (e.g.
     * SAM) that
     * after processing the transform will no longer contain any circular references.
     */
    public fun allowCyclicalReferences(allowCyclicalReferences: Boolean)

    /**
     * @param loadNestedStacks Specifies the template files that define nested stacks that should be
     * included.
     * If your template specifies a stack that isn't included here, it won't be created as a
     * NestedStack
     * resource, and it won't be accessible from the `CfnInclude.getNestedStack` method
     * (but will still be accessible from the `CfnInclude.getResource` method).
     *
     * If you include a stack here with an ID that isn't in the template,
     * or is in the template but is not a nested stack,
     * template creation will fail and an error will be thrown.
     */
    public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>)

    /**
     * @param parameters Specifies parameters to be replaced by the values in this mapping.
     * Any parameters in the template that aren't specified here will be left unmodified.
     * If you include a parameter here with an ID that isn't in the template,
     * template creation will fail and an error will be thrown.
     *
     * If you are importing a parameter from a live stack, we cannot know the value of that
     * parameter. You will need to supply a value for your parameters, else the default
     * value will be used.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param preserveLogicalIds Whether the resources should have the same logical IDs in the
     * resulting CDK template as they did in the original CloudFormation template file.
     * If you're vending a Construct using an existing CloudFormation template,
     * make sure to pass this as `false`.
     *
     * **Note**: regardless of whether this option is true or false,
     * the `CfnInclude.getResource` and related methods always uses the original logical ID of the
     * resource/element,
     * as specified in the template file.
     */
    public fun preserveLogicalIds(preserveLogicalIds: Boolean)

    /**
     * @param templateFile Path to the template file. 
     * Both JSON and YAML template formats are supported.
     */
    public fun templateFile(templateFile: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudformation.include.CfnIncludeProps.Builder =
        software.amazon.awscdk.cloudformation.include.CfnIncludeProps.builder()

    /**
     * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
     * disregarding safeguards meant to avoid undeployable templates.
     * This should only be set to true in the case of templates utilizing cloud transforms (e.g.
     * SAM) that
     * after processing the transform will no longer contain any circular references.
     */
    override fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
      cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
    }

    /**
     * @param loadNestedStacks Specifies the template files that define nested stacks that should be
     * included.
     * If your template specifies a stack that isn't included here, it won't be created as a
     * NestedStack
     * resource, and it won't be accessible from the `CfnInclude.getNestedStack` method
     * (but will still be accessible from the `CfnInclude.getResource` method).
     *
     * If you include a stack here with an ID that isn't in the template,
     * or is in the template but is not a nested stack,
     * template creation will fail and an error will be thrown.
     */
    override fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
      cdkBuilder.loadNestedStacks(loadNestedStacks.mapValues{CfnIncludeProps.unwrap(it.value)})
    }

    /**
     * @param parameters Specifies parameters to be replaced by the values in this mapping.
     * Any parameters in the template that aren't specified here will be left unmodified.
     * If you include a parameter here with an ID that isn't in the template,
     * template creation will fail and an error will be thrown.
     *
     * If you are importing a parameter from a live stack, we cannot know the value of that
     * parameter. You will need to supply a value for your parameters, else the default
     * value will be used.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param preserveLogicalIds Whether the resources should have the same logical IDs in the
     * resulting CDK template as they did in the original CloudFormation template file.
     * If you're vending a Construct using an existing CloudFormation template,
     * make sure to pass this as `false`.
     *
     * **Note**: regardless of whether this option is true or false,
     * the `CfnInclude.getResource` and related methods always uses the original logical ID of the
     * resource/element,
     * as specified in the template file.
     */
    override fun preserveLogicalIds(preserveLogicalIds: Boolean) {
      cdkBuilder.preserveLogicalIds(preserveLogicalIds)
    }

    /**
     * @param templateFile Path to the template file. 
     * Both JSON and YAML template formats are supported.
     */
    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.CfnIncludeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudformation.include.CfnIncludeProps,
  ) : CdkObject(cdkObject), CfnIncludeProps {
    /**
     * Specifies whether to allow cyclical references, effectively disregarding safeguards meant to
     * avoid undeployable templates.
     *
     * This should only be set to true in the case of templates utilizing cloud transforms (e.g.
     * SAM) that
     * after processing the transform will no longer contain any circular references.
     *
     * Default: - will throw an error on detecting any cyclical references
     */
    override fun allowCyclicalReferences(): Boolean? = unwrap(this).getAllowCyclicalReferences()

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
     */
    override fun loadNestedStacks(): Map<String, CfnIncludeProps> =
        unwrap(this).getLoadNestedStacks()?.mapValues{CfnIncludeProps.wrap(it.value)} ?: emptyMap()

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
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

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
     */
    override fun preserveLogicalIds(): Boolean? = unwrap(this).getPreserveLogicalIds()

    /**
     * Path to the template file.
     *
     * Both JSON and YAML template formats are supported.
     */
    override fun templateFile(): String = unwrap(this).getTemplateFile()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIncludeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.CfnIncludeProps):
        CfnIncludeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIncludeProps):
        software.amazon.awscdk.cloudformation.include.CfnIncludeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudformation.include.CfnIncludeProps
  }
}
