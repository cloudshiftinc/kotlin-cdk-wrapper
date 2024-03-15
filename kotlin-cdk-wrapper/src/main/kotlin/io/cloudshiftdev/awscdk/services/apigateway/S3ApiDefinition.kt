@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.constructs.Construct

/**
 * OpenAPI specification from an S3 archive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3ApiDefinition s3ApiDefinition = new S3ApiDefinition(bucket, "key", "objectVersion");
 * ```
 */
public open class S3ApiDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition,
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition):
        S3ApiDefinition = S3ApiDefinition(cdkObject)

    internal fun unwrap(wrapped: S3ApiDefinition):
        software.amazon.awscdk.services.apigateway.S3ApiDefinition = wrapped.cdkObject
  }
}
