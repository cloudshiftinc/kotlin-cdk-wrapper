@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct

public open class PermissionsBoundary internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PermissionsBoundary,
) : CdkObject(cdkObject) {
  public open fun apply(boundaryPolicy: IManagedPolicy) {
    unwrap(this).apply(boundaryPolicy.let(IManagedPolicy::unwrap))
  }

  public open fun clear() {
    unwrap(this).clear()
  }

  public companion object {
    public fun of(scope: IConstruct): PermissionsBoundary =
        software.amazon.awscdk.services.iam.PermissionsBoundary.of(scope.let(IConstruct::unwrap)).let(PermissionsBoundary::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PermissionsBoundary):
        PermissionsBoundary = PermissionsBoundary(cdkObject)

    internal fun unwrap(wrapped: PermissionsBoundary):
        software.amazon.awscdk.services.iam.PermissionsBoundary = wrapped.cdkObject
  }
}
