@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for the `withoutPolicyUpdates()` modifier of a Role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * WithoutPolicyUpdatesOptions withoutPolicyUpdatesOptions = WithoutPolicyUpdatesOptions.builder()
 * .addGrantsToResources(false)
 * .build();
 * ```
 */
public interface WithoutPolicyUpdatesOptions {
  /**
   * Add grants to resources instead of dropping them.
   *
   * If this is `false` or not specified, grant permissions added to this role are ignored.
   * It is your own responsibility to make sure the role has the required permissions.
   *
   * If this is `true`, any grant permissions will be added to the resource instead.
   *
   * Default: false
   */
  public fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

  /**
   * A builder for [WithoutPolicyUpdatesOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addGrantsToResources Add grants to resources instead of dropping them.
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     */
    public fun addGrantsToResources(addGrantsToResources: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions.Builder
        = software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions.builder()

    /**
     * @param addGrantsToResources Add grants to resources instead of dropping them.
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     */
    override fun addGrantsToResources(addGrantsToResources: Boolean) {
      cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    public fun build(): software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions,
  ) : CdkObject(cdkObject), WithoutPolicyUpdatesOptions {
    /**
     * Add grants to resources instead of dropping them.
     *
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     *
     * Default: false
     */
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WithoutPolicyUpdatesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions):
        WithoutPolicyUpdatesOptions = CdkObjectWrappers.wrap(cdkObject) as?
        WithoutPolicyUpdatesOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WithoutPolicyUpdatesOptions):
        software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions
  }
}
