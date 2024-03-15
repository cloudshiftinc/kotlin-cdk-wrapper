@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.constructs.Construct

/**
 * OpenAPI specification from an inline JSON object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object definition;
 * InlineApiDefinition inlineApiDefinition = new InlineApiDefinition(definition);
 * ```
 */
public open class InlineApiDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.InlineApiDefinition,
) : ApiDefinition(cdkObject) {
  /**
   * Called when the specification is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(ApiDefinitionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.InlineApiDefinition):
        InlineApiDefinition = InlineApiDefinition(cdkObject)

    internal fun unwrap(wrapped: InlineApiDefinition):
        software.amazon.awscdk.services.apigateway.InlineApiDefinition = wrapped.cdkObject
  }
}
