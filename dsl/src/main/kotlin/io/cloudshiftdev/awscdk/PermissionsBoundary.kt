package io.cloudshiftdev.awscdk

import kotlin.String

public open class PermissionsBoundary internal constructor(
  internal override val cdkObject: software.amazon.awscdk.PermissionsBoundary,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromArn(arn: String): PermissionsBoundary =
        software.amazon.awscdk.PermissionsBoundary.fromArn(arn).let(PermissionsBoundary::wrap)

    public fun fromName(name: String): PermissionsBoundary =
        software.amazon.awscdk.PermissionsBoundary.fromName(name).let(PermissionsBoundary::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.PermissionsBoundary): PermissionsBoundary =
        PermissionsBoundary(cdkObject)

    internal fun unwrap(wrapped: PermissionsBoundary): software.amazon.awscdk.PermissionsBoundary =
        wrapped.cdkObject
  }
}
