package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct

public open class S3EnvironmentFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile,
) : EnvironmentFile(cdkObject) {
  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile):
        S3EnvironmentFile = S3EnvironmentFile(cdkObject)

    internal fun unwrap(wrapped: S3EnvironmentFile):
        software.amazon.awscdk.services.ecs.S3EnvironmentFile = wrapped.cdkObject
  }
}