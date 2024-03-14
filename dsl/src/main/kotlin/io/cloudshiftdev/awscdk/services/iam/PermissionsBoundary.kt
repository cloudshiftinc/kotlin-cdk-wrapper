package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.IConstruct

public open class PermissionsBoundary internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PermissionsBoundary,
) : CdkObject(cdkObject) {
  /**
   * Apply the given policy as Permissions Boundary to all Roles and Users in the scope.
   *
   * Will override any Permissions Boundaries configured previously; in case
   * a Permission Boundary is applied in multiple scopes, the Boundary applied
   * closest to the Role wins.
   *
   * @param boundaryPolicy 
   */
  public open fun apply(boundaryPolicy: IManagedPolicy) {
    unwrap(this).apply(boundaryPolicy.let(IManagedPolicy::unwrap))
  }

  /**
   * Remove previously applied Permissions Boundaries.
   */
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
