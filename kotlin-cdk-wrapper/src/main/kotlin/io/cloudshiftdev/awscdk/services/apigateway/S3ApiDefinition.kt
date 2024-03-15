@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.constructs.Construct

public open class S3ApiDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition,
) : ApiDefinition(cdkObject) {
  public override fun bind(_scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(ApiDefinitionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition):
        S3ApiDefinition = S3ApiDefinition(cdkObject)

    internal fun unwrap(wrapped: S3ApiDefinition):
        software.amazon.awscdk.services.apigateway.S3ApiDefinition = wrapped.cdkObject
  }
}
