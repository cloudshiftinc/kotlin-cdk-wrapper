@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class Template internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Template,
) : CdkObject(cdkObject) {
  public open fun allResources(type: String, props: Any) {
    unwrap(this).allResources(type, props)
  }

  public open fun allResourcesProperties(type: String, props: Any) {
    unwrap(this).allResourcesProperties(type, props)
  }

  public open fun findConditions(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findConditions(logicalId) ?: emptyMap()

  public open fun findConditions(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findConditions(logicalId, props) ?: emptyMap()

  public open fun findMappings(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findMappings(logicalId) ?: emptyMap()

  public open fun findMappings(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findMappings(logicalId, props) ?: emptyMap()

  public open fun findOutputs(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findOutputs(logicalId) ?: emptyMap()

  public open fun findOutputs(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findOutputs(logicalId, props) ?: emptyMap()

  public open fun findParameters(logicalId: String): Map<String, Map<String, Any>> =
      unwrap(this).findParameters(logicalId) ?: emptyMap()

  public open fun findParameters(logicalId: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findParameters(logicalId, props) ?: emptyMap()

  public open fun findResources(type: String): Map<String, Map<String, Any>> =
      unwrap(this).findResources(type) ?: emptyMap()

  public open fun findResources(type: String, props: Any): Map<String, Map<String, Any>> =
      unwrap(this).findResources(type, props) ?: emptyMap()

  public open fun hasCondition(logicalId: String, props: Any) {
    unwrap(this).hasCondition(logicalId, props)
  }

  public open fun hasMapping(logicalId: String, props: Any) {
    unwrap(this).hasMapping(logicalId, props)
  }

  public open fun hasOutput(logicalId: String, props: Any) {
    unwrap(this).hasOutput(logicalId, props)
  }

  public open fun hasParameter(logicalId: String, props: Any) {
    unwrap(this).hasParameter(logicalId, props)
  }

  public open fun hasResource(type: String, props: Any) {
    unwrap(this).hasResource(type, props)
  }

  public open fun hasResourceProperties(type: String, props: Any) {
    unwrap(this).hasResourceProperties(type, props)
  }

  public open fun resourceCountIs(type: String, count: Number) {
    unwrap(this).resourceCountIs(type, count)
  }

  public open fun resourcePropertiesCountIs(
    type: String,
    props: Any,
    count: Number,
  ) {
    unwrap(this).resourcePropertiesCountIs(type, props, count)
  }

  public open fun templateMatches(expected: Any) {
    unwrap(this).templateMatches(expected)
  }

  public open fun toJson(): Map<String, Any> = unwrap(this).toJSON() ?: emptyMap()

  public companion object {
    public fun fromJson(template: Map<String, Any>): Template =
        software.amazon.awscdk.assertions.Template.fromJSON(template).let(Template::wrap)

    public fun fromJson(template: Map<String, Any>, templateParsingOptions: TemplateParsingOptions):
        Template = software.amazon.awscdk.assertions.Template.fromJSON(template,
        templateParsingOptions.let(TemplateParsingOptions::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d131d7b560d1035ceeff84d745856250480d5b0c05095dfd8ded5d13b0f88a8b")
    public fun fromJson(template: Map<String, Any>,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromJson(template, TemplateParsingOptions(templateParsingOptions))

    public fun fromStack(stack: Stack): Template =
        software.amazon.awscdk.assertions.Template.fromStack(stack.let(Stack::unwrap)).let(Template::wrap)

    public fun fromStack(stack: Stack, templateParsingOptions: TemplateParsingOptions): Template =
        software.amazon.awscdk.assertions.Template.fromStack(stack.let(Stack::unwrap),
        templateParsingOptions.let(TemplateParsingOptions::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d9a56c6b73e6abd2d132a6353bc67332f340f9993fef529c80abdbcf93a46c2")
    public fun fromStack(stack: Stack,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromStack(stack, TemplateParsingOptions(templateParsingOptions))

    public fun fromString(template: String): Template =
        software.amazon.awscdk.assertions.Template.fromString(template).let(Template::wrap)

    public fun fromString(template: String, templateParsingOptions: TemplateParsingOptions):
        Template = software.amazon.awscdk.assertions.Template.fromString(template,
        templateParsingOptions.let(TemplateParsingOptions::unwrap)).let(Template::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22b6f80ac5b9c59fec0f09ec5f90ec88ae7e88a2a4c3887daece417bafe1029")
    public fun fromString(template: String,
        templateParsingOptions: TemplateParsingOptions.Builder.() -> Unit): Template =
        fromString(template, TemplateParsingOptions(templateParsingOptions))

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Template): Template =
        Template(cdkObject)

    internal fun unwrap(wrapped: Template): software.amazon.awscdk.assertions.Template =
        wrapped.cdkObject
  }
}
