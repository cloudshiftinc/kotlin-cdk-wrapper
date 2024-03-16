@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options to add a prefix list.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * PrefixListOptions prefixListOptions = PrefixListOptions.builder()
 * .maxEntries(123)
 * .build();
 * ```
 */
public interface PrefixListOptions {
  /**
   * The maximum number of entries for the prefix list.
   *
   * Default: Automatically-calculated
   */
  public fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  /**
   * A builder for [PrefixListOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     */
    public fun maxEntries(maxEntries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixListOptions.Builder =
        software.amazon.awscdk.services.ec2.PrefixListOptions.builder()

    /**
     * @param maxEntries The maximum number of entries for the prefix list.
     */
    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixListOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrefixListOptions,
  ) : CdkObject(cdkObject), PrefixListOptions {
    /**
     * The maximum number of entries for the prefix list.
     *
     * Default: Automatically-calculated
     */
    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrefixListOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixListOptions):
        PrefixListOptions = CdkObjectWrappers.wrap(cdkObject) as PrefixListOptions

    internal fun unwrap(wrapped: PrefixListOptions):
        software.amazon.awscdk.services.ec2.PrefixListOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.PrefixListOptions
  }
}
