@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options that may be provided to LambdaDestination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * LambdaDestinationOptions lambdaDestinationOptions = LambdaDestinationOptions.builder()
 * .addPermissions(false)
 * .build();
 * ```
 */
public interface LambdaDestinationOptions {
  /**
   * Whether or not to add Lambda Permissions.
   *
   * Default: true
   */
  public fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()

  /**
   * A builder for [LambdaDestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addPermissions Whether or not to add Lambda Permissions.
     */
    public fun addPermissions(addPermissions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.Builder =
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions.builder()

    /**
     * @param addPermissions Whether or not to add Lambda Permissions.
     */
    override fun addPermissions(addPermissions: Boolean) {
      cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions,
  ) : CdkObject(cdkObject),
      LambdaDestinationOptions {
    /**
     * Whether or not to add Lambda Permissions.
     *
     * Default: true
     */
    override fun addPermissions(): Boolean? = unwrap(this).getAddPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions):
        LambdaDestinationOptions = CdkObjectWrappers.wrap(cdkObject) as? LambdaDestinationOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDestinationOptions):
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions
  }
}
