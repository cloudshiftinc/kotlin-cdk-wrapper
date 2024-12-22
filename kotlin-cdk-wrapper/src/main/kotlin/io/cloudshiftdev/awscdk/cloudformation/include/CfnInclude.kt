@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.CfnCondition
import io.cloudshiftdev.awscdk.CfnElement
import io.cloudshiftdev.awscdk.CfnHook
import io.cloudshiftdev.awscdk.CfnMapping
import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnRule
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Construct to import an existing CloudFormation template file into a CDK application.
 *
 * All resources defined in the template file can be retrieved by calling the `getResource` method.
 * Any modifications made on the returned resource objects will be reflected in the resulting CDK
 * template.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate = CfnInclude.Builder.create(this, "Template")
 * .templateFile("my-template.json")
 * .build();
 * ```
 */
public open class CfnInclude(
  cdkObject: software.amazon.awscdk.cloudformation.include.CfnInclude,
) : CfnElement(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIncludeProps,
  ) :
      this(software.amazon.awscdk.cloudformation.include.CfnInclude(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIncludeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIncludeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIncludeProps(props)
  )

  /**
   * Returns the CfnCondition object from the 'Conditions' section of the CloudFormation template
   * with the given name.
   *
   * Any modifications performed on that object will be reflected in the resulting CDK template.
   *
   * If a Condition with the given name is not present in the template,
   * throws an exception.
   *
   * @param conditionName the name of the Condition in the CloudFormation template file. 
   */
  public open fun condition(conditionName: String): CfnCondition =
      unwrap(this).getCondition(conditionName).let(CfnCondition::wrap)

  /**
   * Returns the CfnHook object from the 'Hooks' section of the included CloudFormation template
   * with the given logical ID.
   *
   * Any modifications performed on the returned object will be reflected in the resulting CDK
   * template.
   *
   * If a Hook with the given logical ID is not present in the template,
   * an exception will be thrown.
   *
   * @param hookLogicalId the logical ID of the Hook in the included CloudFormation template's
   * 'Hooks' section. 
   */
  public open fun hook(hookLogicalId: String): CfnHook =
      unwrap(this).getHook(hookLogicalId).let(CfnHook::wrap)

  /**
   * Includes a template for a child stack inside of this parent template.
   *
   * A child with this logical ID must exist in the template,
   * and be of type AWS::CloudFormation::Stack.
   * This is equivalent to specifying the value in the `CfnIncludeProps.loadNestedStacks`
   * property on object construction.
   *
   * @return the same `IncludedNestedStack` object that `getNestedStack` returns for this logical ID
   * @param logicalId the ID of the stack to retrieve, as it appears in the template. 
   * @param nestedStackProps the properties of the included child Stack. 
   */
  public open fun loadNestedStack(logicalId: String, nestedStackProps: CfnIncludeProps):
      IncludedNestedStack = unwrap(this).loadNestedStack(logicalId,
      nestedStackProps.let(CfnIncludeProps.Companion::unwrap)).let(IncludedNestedStack::wrap)

  /**
   * Includes a template for a child stack inside of this parent template.
   *
   * A child with this logical ID must exist in the template,
   * and be of type AWS::CloudFormation::Stack.
   * This is equivalent to specifying the value in the `CfnIncludeProps.loadNestedStacks`
   * property on object construction.
   *
   * @return the same `IncludedNestedStack` object that `getNestedStack` returns for this logical ID
   * @param logicalId the ID of the stack to retrieve, as it appears in the template. 
   * @param nestedStackProps the properties of the included child Stack. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73567903f70875c05bac0054e5221db2830d6b52f57afdec22ec5ea29c3830c5")
  public open fun loadNestedStack(logicalId: String,
      nestedStackProps: CfnIncludeProps.Builder.() -> Unit): IncludedNestedStack =
      loadNestedStack(logicalId, CfnIncludeProps(nestedStackProps))

  /**
   * Returns the CfnMapping object from the 'Mappings' section of the included template.
   *
   * Any modifications performed on that object will be reflected in the resulting CDK template.
   *
   * If a Mapping with the given name is not present in the template,
   * an exception will be thrown.
   *
   * @param mappingName the name of the Mapping in the template to retrieve. 
   */
  public open fun mapping(mappingName: String): CfnMapping =
      unwrap(this).getMapping(mappingName).let(CfnMapping::wrap)

  /**
   * Returns a loaded NestedStack with name logicalId.
   *
   * For a nested stack to be returned by this method,
   * it must be specified either in the `CfnIncludeProps.loadNestedStacks` property,
   * or through the `loadNestedStack` method.
   *
   * @param logicalId the ID of the stack to retrieve, as it appears in the template. 
   */
  public open fun nestedStack(logicalId: String): IncludedNestedStack =
      unwrap(this).getNestedStack(logicalId).let(IncludedNestedStack::wrap)

  /**
   * Returns the CfnOutput object from the 'Outputs' section of the included template.
   *
   * Any modifications performed on that object will be reflected in the resulting CDK template.
   *
   * If an Output with the given name is not present in the template,
   * throws an exception.
   *
   * @param logicalId the name of the output to retrieve. 
   */
  public open fun output(logicalId: String): CfnOutput =
      unwrap(this).getOutput(logicalId).let(CfnOutput::wrap)

  /**
   * Returns the CfnParameter object from the 'Parameters' section of the included template.
   *
   * Any modifications performed on that object will be reflected in the resulting CDK template.
   *
   * If a Parameter with the given name is not present in the template,
   * throws an exception.
   *
   * @param parameterName the name of the parameter to retrieve. 
   */
  public open fun parameter(parameterName: String): CfnParameter =
      unwrap(this).getParameter(parameterName).let(CfnParameter::wrap)

  /**
   * Returns the low-level CfnResource from the template with the given logical ID.
   *
   * Any modifications performed on that resource will be reflected in the resulting CDK template.
   *
   * The returned object will be of the proper underlying class;
   * you can always cast it to the correct type in your code:
   *
   * ```
   * // assume the template contains an AWS::S3::Bucket with logical ID 'Bucket'
   * const cfnBucket = cfnTemplate.getResource('Bucket') as s3.CfnBucket;
   * // cfnBucket is of type s3.CfnBucket
   * ```
   *
   * If the template does not contain a resource with the given logical ID,
   * an exception will be thrown.
   *
   * @param logicalId the logical ID of the resource in the CloudFormation template file. 
   */
  public open fun resource(logicalId: String): CfnResource =
      unwrap(this).getResource(logicalId).let(CfnResource::wrap)

  /**
   * Returns the CfnRule object from the 'Rules' section of the CloudFormation template with the
   * given name.
   *
   * Any modifications performed on that object will be reflected in the resulting CDK template.
   *
   * If a Rule with the given name is not present in the template,
   * an exception will be thrown.
   *
   * @param ruleName the name of the Rule in the CloudFormation template. 
   */
  public open fun rule(ruleName: String): CfnRule =
      unwrap(this).getRule(ruleName).let(CfnRule::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cloudformation.include.CfnInclude].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to allow cyclical references, effectively disregarding safeguards meant to
     * avoid undeployable templates.
     *
     * This should only be set to true in the case of templates utilizing cloud transforms (e.g.
     * SAM) that
     * after processing the transform will no longer contain any circular references.
     *
     * Default: - will throw an error on detecting any cyclical references
     *
     * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
     * disregarding safeguards meant to avoid undeployable templates. 
     */
    public fun allowCyclicalReferences(allowCyclicalReferences: Boolean)

    /**
     * Specifies a list of LogicalIDs for resources that will be included in the CDK Stack, but will
     * not be parsed and converted to CDK types.
     *
     * This allows you to use CFN templates
     * that rely on Intrinsic placement that `cfn-include`
     * would otherwise reject, such as non-primitive values in resource update policies.
     *
     * Default: - All resources are hydrated
     *
     * @param dehydratedResources Specifies a list of LogicalIDs for resources that will be included
     * in the CDK Stack, but will not be parsed and converted to CDK types. 
     */
    public fun dehydratedResources(dehydratedResources: List<String>)

    /**
     * Specifies a list of LogicalIDs for resources that will be included in the CDK Stack, but will
     * not be parsed and converted to CDK types.
     *
     * This allows you to use CFN templates
     * that rely on Intrinsic placement that `cfn-include`
     * would otherwise reject, such as non-primitive values in resource update policies.
     *
     * Default: - All resources are hydrated
     *
     * @param dehydratedResources Specifies a list of LogicalIDs for resources that will be included
     * in the CDK Stack, but will not be parsed and converted to CDK types. 
     */
    public fun dehydratedResources(vararg dehydratedResources: String)

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
    public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>)

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
    public fun parameters(parameters: Map<String, Any>)

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
    public fun preserveLogicalIds(preserveLogicalIds: Boolean)

    /**
     * Path to the template file.
     *
     * Both JSON and YAML template formats are supported.
     *
     * @param templateFile Path to the template file. 
     */
    public fun templateFile(templateFile: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudformation.include.CfnInclude.Builder =
        software.amazon.awscdk.cloudformation.include.CfnInclude.Builder.create(scope, id)

    /**
     * Specifies whether to allow cyclical references, effectively disregarding safeguards meant to
     * avoid undeployable templates.
     *
     * This should only be set to true in the case of templates utilizing cloud transforms (e.g.
     * SAM) that
     * after processing the transform will no longer contain any circular references.
     *
     * Default: - will throw an error on detecting any cyclical references
     *
     * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
     * disregarding safeguards meant to avoid undeployable templates. 
     */
    override fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
      cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
    }

    /**
     * Specifies a list of LogicalIDs for resources that will be included in the CDK Stack, but will
     * not be parsed and converted to CDK types.
     *
     * This allows you to use CFN templates
     * that rely on Intrinsic placement that `cfn-include`
     * would otherwise reject, such as non-primitive values in resource update policies.
     *
     * Default: - All resources are hydrated
     *
     * @param dehydratedResources Specifies a list of LogicalIDs for resources that will be included
     * in the CDK Stack, but will not be parsed and converted to CDK types. 
     */
    override fun dehydratedResources(dehydratedResources: List<String>) {
      cdkBuilder.dehydratedResources(dehydratedResources)
    }

    /**
     * Specifies a list of LogicalIDs for resources that will be included in the CDK Stack, but will
     * not be parsed and converted to CDK types.
     *
     * This allows you to use CFN templates
     * that rely on Intrinsic placement that `cfn-include`
     * would otherwise reject, such as non-primitive values in resource update policies.
     *
     * Default: - All resources are hydrated
     *
     * @param dehydratedResources Specifies a list of LogicalIDs for resources that will be included
     * in the CDK Stack, but will not be parsed and converted to CDK types. 
     */
    override fun dehydratedResources(vararg dehydratedResources: String): Unit =
        dehydratedResources(dehydratedResources.toList())

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
    override fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
      cdkBuilder.loadNestedStacks(loadNestedStacks.mapValues{CfnIncludeProps.unwrap(it.value)})
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
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
    override fun preserveLogicalIds(preserveLogicalIds: Boolean) {
      cdkBuilder.preserveLogicalIds(preserveLogicalIds)
    }

    /**
     * Path to the template file.
     *
     * Both JSON and YAML template formats are supported.
     *
     * @param templateFile Path to the template file. 
     */
    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.CfnInclude =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInclude {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInclude(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.CfnInclude):
        CfnInclude = CfnInclude(cdkObject)

    internal fun unwrap(wrapped: CfnInclude):
        software.amazon.awscdk.cloudformation.include.CfnInclude = wrapped.cdkObject as
        software.amazon.awscdk.cloudformation.include.CfnInclude
  }
}
