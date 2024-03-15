@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Architecture internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Architecture,
) : CdkObject(cdkObject) {
  public open fun dockerPlatform(): String = unwrap(this).getDockerPlatform()

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
