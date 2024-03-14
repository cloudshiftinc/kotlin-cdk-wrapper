package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String

public open class Architecture internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.Architecture,
) {
  public open fun dockerPlatform(): String = unwrap(this).getDockerPlatform()

  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public open fun custom(name: String): Architecture =
        software.amazon.awscdk.services.lambda.Architecture.custom(name).let(Architecture::wrap)

    public open fun custom(name: String, dockerPlatform: String): Architecture =
        software.amazon.awscdk.services.lambda.Architecture.custom(name,
        dockerPlatform).let(Architecture::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Architecture): Architecture
        = Architecture(cdkObject)

    internal fun unwrap(wrapped: Architecture): software.amazon.awscdk.services.lambda.Architecture
        = wrapped.cdkObject
  }
}
