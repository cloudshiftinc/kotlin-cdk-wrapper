@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options applied when copying directories.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CopyOptions copyOptions = CopyOptions.builder()
 * .exclude(List.of("exclude"))
 * .follow(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build();
 * ```
 */
public interface CopyOptions {
  /**
   * File paths matching the patterns will be excluded.
   *
   * See `ignoreMode` to set the matching behavior.
   * Has no effect on Assets bundled using the `bundling` property.
   *
   * Default: - nothing is excluded
   */
  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  /**
   * A strategy for how to handle symlinks.
   *
   * Default: SymlinkFollowMode.NEVER
   */
  public fun follow(): SymlinkFollowMode? = unwrap(this).getFollow()?.let(SymlinkFollowMode::wrap)

  /**
   * The ignore behavior to use for `exclude` patterns.
   *
   * Default: IgnoreMode.GLOB
   */
  public fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

  /**
   * A builder for [CopyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: List<String>)

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String)

    /**
     * @param follow A strategy for how to handle symlinks.
     */
    public fun follow(follow: SymlinkFollowMode)

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CopyOptions.Builder =
        software.amazon.awscdk.CopyOptions.builder()

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * @param follow A strategy for how to handle symlinks.
     */
    override fun follow(follow: SymlinkFollowMode) {
      cdkBuilder.follow(follow.let(SymlinkFollowMode.Companion::unwrap))
    }

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.CopyOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CopyOptions,
  ) : CdkObject(cdkObject), CopyOptions {
    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     */
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     */
    override fun follow(): SymlinkFollowMode? =
        unwrap(this).getFollow()?.let(SymlinkFollowMode::wrap)

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     */
    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CopyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CopyOptions): CopyOptions =
        CdkObjectWrappers.wrap(cdkObject) as? CopyOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CopyOptions): software.amazon.awscdk.CopyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CopyOptions
  }
}
