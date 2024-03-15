@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Apply a permissions boundary to all IAM Roles and Users within a specific scope.
 *
 * A permissions boundary is typically applied at the `Stage` scope.
 * This allows setting different permissions boundaries per Stage. For
 * example, you may *not* apply a boundary to the `Dev` stage which deploys
 * to a personal dev account, but you *do* apply the default boundary to the
 * `Prod` stage.
 *
 * It is possible to apply different permissions boundaries to different scopes
 * within your app. In this case the most specifically applied one wins
 *
 * Example:
 *
 * ```
 * // no permissions boundary for dev stage
 * // no permissions boundary for dev stage
 * new Stage(app, "DevStage");
 * // default boundary for prod stage
 * Stage prodStage = Stage.Builder.create(app, "ProdStage")
 * .permissionsBoundary(PermissionsBoundary.fromName("prod-pb"))
 * .build();
 * // overriding the pb applied for this stack
 * // overriding the pb applied for this stack
 * Stack.Builder.create(prodStage, "ProdStack1")
 * .permissionsBoundary(PermissionsBoundary.fromName("stack-pb"))
 * .build();
 * // will inherit the permissions boundary from the stage
 * // will inherit the permissions boundary from the stage
 * new Stack(prodStage, "ProdStack2");
 * ```
 */
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
