package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct

public open class S3EnvironmentFile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile,
) : EnvironmentFile(cdkObject) {
  public override fun bind(_scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.S3EnvironmentFile):
        S3EnvironmentFile = S3EnvironmentFile(cdkObject)

    internal fun unwrap(wrapped: S3EnvironmentFile):
        software.amazon.awscdk.services.ecs.S3EnvironmentFile = wrapped.cdkObject
  }
}
