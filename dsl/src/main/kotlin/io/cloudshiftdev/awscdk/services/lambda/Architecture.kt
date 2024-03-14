package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Architecture internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Architecture,
) : CdkObject(cdkObject) {
  /**
   * The platform to use for this architecture when building with Docker.
   */
  public open fun dockerPlatform(): String = unwrap(this).getDockerPlatform()

  /**
   * The name of the architecture as recognized by the AWS Lambda service APIs.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val ARM_64: Architecture =
        Architecture.wrap(software.amazon.awscdk.services.lambda.Architecture.ARM_64)

    public val X86_64: Architecture =
        Architecture.wrap(software.amazon.awscdk.services.lambda.Architecture.X86_64)

    public fun custom(name: String): Architecture =
        software.amazon.awscdk.services.lambda.Architecture.custom(name).let(Architecture::wrap)

    public fun custom(name: String, dockerPlatform: String): Architecture =
        software.amazon.awscdk.services.lambda.Architecture.custom(name,
        dockerPlatform).let(Architecture::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Architecture): Architecture
        = Architecture(cdkObject)

    internal fun unwrap(wrapped: Architecture): software.amazon.awscdk.services.lambda.Architecture
        = wrapped.cdkObject
  }
}
