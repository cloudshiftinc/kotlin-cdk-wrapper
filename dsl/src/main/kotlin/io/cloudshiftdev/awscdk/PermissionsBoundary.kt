package io.cloudshiftdev.awscdk

import kotlin.String

public open class PermissionsBoundary internal constructor(
  private val cdkObject: software.amazon.awscdk.PermissionsBoundary,
) {
  public companion object {
    public open fun fromArn(arn: String): PermissionsBoundary =
        software.amazon.awscdk.PermissionsBoundary.fromArn(arn).let(PermissionsBoundary::wrap)

    public open fun fromName(name: String): PermissionsBoundary =
        software.amazon.awscdk.PermissionsBoundary.fromName(name).let(PermissionsBoundary::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.PermissionsBoundary): PermissionsBoundary =
        PermissionsBoundary(cdkObject)

    internal fun unwrap(wrapped: PermissionsBoundary): software.amazon.awscdk.PermissionsBoundary =
        wrapped.cdkObject
  }
}
