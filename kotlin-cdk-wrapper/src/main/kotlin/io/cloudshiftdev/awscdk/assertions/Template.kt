@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Suite of assertions that can be run on a CDK stack.
 *
 * Typically used, as part of unit tests, to validate that the rendered
 * CloudFormation template has expected resources and properties.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.Stack;
 * import io.cloudshiftdev.awscdk.assertions.Template;
 * Stack stack = new Stack();
 * // ...
 * Template template = Template.fromStack(stack);
 * ```
 */
public open class Template(
  cdkObject: software.amazon.awscdk.assertions.Template,
) : CdkObject(cdkObject) {
  /**
   * Assert that all resources of the given type contain the given definition in the CloudFormation
   * template.
   *
   * By default, performs partial matching on the resource, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param type the resource type;. 
   * @param props the entire definition of the resources as they should be expected in the template.
   * 
   */
  public open fun allResources(type: String, props: Any) {
    unwrap(this).allResources(type, props)
  }

  /**
   * Assert that all resources of the given type contain the given properties CloudFormation
   * template.
   *
   * By default, performs partial matching on the `Properties` key of the resource, via the
   * `Match.objectLike()`. To configure different behavior, use other matchers in the `Match` class.
   *
   * @param type the resource type;. 
   * @param props the 'Properties' section of the resource as should be expected in the template. 
   */
  public open fun allResourcesProperties(type: String, props: Any) {
    unwrap(this).allResourcesProperties(type, props)
  }

  /**
   * Get the set of matching Conditions that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the condition. 
   * @param props by default, matches all Conditions in the template.
   */
  public open fun findConditions(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findConditions(logicalId) ?: emptyMap()

  /**
   * Get the set of matching Conditions that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the condition. 
   * @param props by default, matches all Conditions in the template.
   */
  public open fun findConditions(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findConditions(logicalId, props) ?: emptyMap()

  /**
   * Get the set of matching Mappings that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the mapping. 
   * @param props by default, matches all Mappings in the template.
   */
  public open fun findMappings(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findMappings(logicalId) ?: emptyMap()

  /**
   * Get the set of matching Mappings that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the mapping. 
   * @param props by default, matches all Mappings in the template.
   */
  public open fun findMappings(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findMappings(logicalId, props) ?: emptyMap()

  /**
   * Get the set of matching Outputs that match the given properties in the CloudFormation template.
   *
   * @param logicalId the name of the output. 
   * @param props by default, matches all Outputs in the template.
   */
  public open fun findOutputs(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findOutputs(logicalId) ?: emptyMap()

  /**
   * Get the set of matching Outputs that match the given properties in the CloudFormation template.
   *
   * @param logicalId the name of the output. 
   * @param props by default, matches all Outputs in the template.
   */
  public open fun findOutputs(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findOutputs(logicalId, props) ?: emptyMap()

  /**
   * Get the set of matching Parameters that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the parameter. 
   * @param props by default, matches all Parameters in the template.
   */
  public open fun findParameters(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findParameters(logicalId) ?: emptyMap()

  /**
   * Get the set of matching Parameters that match the given properties in the CloudFormation
   * template.
   *
   * @param logicalId the name of the parameter. 
   * @param props by default, matches all Parameters in the template.
   */
  public open fun findParameters(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findParameters(logicalId, props) ?: emptyMap()

  /**
   * Get the set of matching resources of a given type and properties in the CloudFormation
   * template.
   *
   * @param type the type to match in the CloudFormation template. 
   * @param props by default, matches all resources with the given type.
   */
  public open fun findResources(type: String): Map<String, Map<String, Any>> =
      unwrap(this).findResources(type) ?: emptyMap()

  /**
   * Get the set of matching resources of a given type and properties in the CloudFormation
   * template.
   *
   * @param type the type to match in the CloudFormation template. 
   * @param props by default, matches all resources with the given type.
   */
  public open fun findResources(type: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findResources(type, props) ?: emptyMap()

  /**
   * Assert that a Condition with the given properties exists in the CloudFormation template.
   *
   * By default, performs partial matching on the resource, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param logicalId the name of the mapping. 
   * @param props the output as should be expected in the template. 
   */
  public open fun hasCondition(logicalId: String, props: Any) {
    unwrap(this).hasCondition(logicalId, props)
  }

  /**
   * Assert that a Mapping with the given properties exists in the CloudFormation template.
   *
   * By default, performs partial matching on the resource, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param logicalId the name of the mapping. 
   * @param props the output as should be expected in the template. 
   */
  public open fun hasMapping(logicalId: String, props: Any) {
    unwrap(this).hasMapping(logicalId, props)
  }

  /**
   * Assert that an Output with the given properties exists in the CloudFormation template.
   *
   * By default, performs partial matching on the resource, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param logicalId the name of the output. 
   * @param props the output as should be expected in the template. 
   */
  public open fun hasOutput(logicalId: String, props: Any) {
    unwrap(this).hasOutput(logicalId, props)
  }

  /**
   * Assert that a Parameter with the given properties exists in the CloudFormation template.
   *
   * By default, performs partial matching on the parameter, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param logicalId the name of the parameter. 
   * @param props the parameter as should be expected in the template. 
   */
  public open fun hasParameter(logicalId: String, props: Any) {
    unwrap(this).hasParameter(logicalId, props)
  }

  /**
   * Assert that a resource of the given type and given definition exists in the CloudFormation
   * template.
   *
   * By default, performs partial matching on the resource, via the `Match.objectLike()`.
   * To configure different behavior, use other matchers in the `Match` class.
   *
   * @param type the resource type;. 
   * @param props the entire definition of the resource as should be expected in the template. 
   */
  public open fun hasResource(type: String, props: Any) {
    unwrap(this).hasResource(type, props)
  }

  /**
   * Assert that a resource of the given type and properties exists in the CloudFormation template.
   *
   * By default, performs partial matching on the `Properties` key of the resource, via the
   * `Match.objectLike()`. To configure different behavior, use other matchers in the `Match` class.
   *
   * @param type the resource type;. 
   * @param props the 'Properties' section of the resource as should be expected in the template. 
   */
  public open fun hasResourceProperties(type: String, props: Any) {
    unwrap(this).hasResourceProperties(type, props)
  }

  /**
   * Assert that the given number of resources of the given type exist in the template.
   *
   * @param type the resource type;. 
   * @param count number of expected instances. 
   */
  public open fun resourceCountIs(type: String, count: Number) {
    unwrap(this).resourceCountIs(type, count)
  }

  /**
   * Assert that the given number of resources of the given type and properties exists in the
   * CloudFormation template.
   *
   * @param type the resource type;. 
   * @param props the 'Properties' section of the resource as should be expected in the template. 
   * @param count number of expected instances. 
   */
  public open fun resourcePropertiesCountIs(
    type: String,
    props: Any,
    count: Number,
  ) {
    unwrap(this).resourcePropertiesCountIs(type, props, count)
  }

  /**
   * Assert that the CloudFormation template matches the given value.
   *
   * @param expected the expected CloudFormation template as key-value pairs. 
   */
  public open fun templateMatches(expected: Any) {
    unwrap(this).templateMatches(expected)
  }

  /**
   * The CloudFormation template deserialized into an object.
   */
  public open fun toJSON(): Map<String, Any> = unwrap(this).toJSON() ?: emptyMap()

  public companion object {
    public fun fromJSON(template: Map<String, Any>): Template =
        software.amazon.awscdk.assertions.Template.fromJSON(template.mapValues{CdkObjectWrappers.unwrap(it.value)}).let(Template::wrap)

    public fun fromJSON(template: Map<String, Any>, templateParsingOptions: TemplateParsingOptions):
        Template =
        software.amazon.awscdk.assertions.Template.fromJSON(template.mapValues{CdkObjectWrappers.unwrap(it.value)},
        templateParsingOptions.let(TemplateParsingOptions.Companion::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbffcbc7046e55838a1d5fb9e7a97ebb37d7a2374f5094e37c1eb7be3ab5e424")
    public fun fromJSON(template: Map<String, Any>,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromJSON(template, TemplateParsingOptions(templateParsingOptions))

    public fun fromStack(stack: Stack): Template =
        software.amazon.awscdk.assertions.Template.fromStack(stack.let(Stack.Companion::unwrap)).let(Template::wrap)

    public fun fromStack(stack: Stack, templateParsingOptions: TemplateParsingOptions): Template =
        software.amazon.awscdk.assertions.Template.fromStack(stack.let(Stack.Companion::unwrap),
        templateParsingOptions.let(TemplateParsingOptions.Companion::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d9a56c6b73e6abd2d132a6353bc67332f340f9993fef529c80abdbcf93a46c2")
    public fun fromStack(stack: Stack,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromStack(stack, TemplateParsingOptions(templateParsingOptions))

    public fun fromString(template: String): Template =
        software.amazon.awscdk.assertions.Template.fromString(template).let(Template::wrap)

    public fun fromString(template: String, templateParsingOptions: TemplateParsingOptions):
        Template = software.amazon.awscdk.assertions.Template.fromString(template,
        templateParsingOptions.let(TemplateParsingOptions.Companion::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22b6f80ac5b9c59fec0f09ec5f90ec88ae7e88a2a4c3887daece417bafe1029")
    public fun fromString(template: String,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromString(template, TemplateParsingOptions(templateParsingOptions))

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Template): Template =
        Template(cdkObject)

    internal fun unwrap(wrapped: Template): software.amazon.awscdk.assertions.Template =
        wrapped.cdkObject as software.amazon.awscdk.assertions.Template
  }
}
