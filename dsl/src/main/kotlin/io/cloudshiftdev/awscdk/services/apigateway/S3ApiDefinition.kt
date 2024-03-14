package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.constructs.Construct

public open class S3ApiDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition,
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
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.S3ApiDefinition):
        S3ApiDefinition = S3ApiDefinition(cdkObject)

    internal fun unwrap(wrapped: S3ApiDefinition):
        software.amazon.awscdk.services.apigateway.S3ApiDefinition = wrapped.cdkObject
  }
}
