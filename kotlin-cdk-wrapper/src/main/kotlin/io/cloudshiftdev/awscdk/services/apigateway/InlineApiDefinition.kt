@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.constructs.Construct
import kotlin.Any

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
public open class InlineApiDefinition(
  cdkObject: software.amazon.awscdk.services.apigateway.InlineApiDefinition,
) : ApiDefinition(cdkObject) {
  public constructor(definition: Any) :
      this(software.amazon.awscdk.services.apigateway.InlineApiDefinition(definition)
  )

  /**
   * Called when the specification is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(ApiDefinitionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.InlineApiDefinition):
        InlineApiDefinition = InlineApiDefinition(cdkObject)

    internal fun unwrap(wrapped: InlineApiDefinition):
        software.amazon.awscdk.services.apigateway.InlineApiDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.InlineApiDefinition
  }
}
