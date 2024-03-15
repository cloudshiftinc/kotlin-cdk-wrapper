@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Options for binding a Permissions Boundary to a construct scope.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * PermissionsBoundaryBindOptions permissionsBoundaryBindOptions =
 * PermissionsBoundaryBindOptions.builder().build();
 * ```
 */
public interface PermissionsBoundaryBindOptions {
  /**
   * A builder for [PermissionsBoundaryBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PermissionsBoundaryBindOptions.Builder =
        software.amazon.awscdk.PermissionsBoundaryBindOptions.builder()

    public fun build(): software.amazon.awscdk.PermissionsBoundaryBindOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.PermissionsBoundaryBindOptions,
  ) : CdkObject(cdkObject), PermissionsBoundaryBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBoundaryBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PermissionsBoundaryBindOptions):
        PermissionsBoundaryBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PermissionsBoundaryBindOptions):
        software.amazon.awscdk.PermissionsBoundaryBindOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.PermissionsBoundaryBindOptions
  }
}
