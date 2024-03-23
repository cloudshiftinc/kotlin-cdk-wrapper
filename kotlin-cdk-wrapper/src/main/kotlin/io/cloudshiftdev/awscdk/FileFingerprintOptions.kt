@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options related to calculating source hash.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * FileFingerprintOptions fileFingerprintOptions = FileFingerprintOptions.builder()
 * .exclude(List.of("exclude"))
 * .extraHash("extraHash")
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build();
 * ```
 */
public interface FileFingerprintOptions : FileCopyOptions {
  /**
   * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
   *
   * Default: - hash is only based on source content
   */
  public fun extraHash(): String? = unwrap(this).getExtraHash()

  /**
   * A builder for [FileFingerprintOptions]
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
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs).
     */
    public fun extraHash(extraHash: String)

    /**
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileFingerprintOptions.Builder =
        software.amazon.awscdk.FileFingerprintOptions.builder()

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
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs).
     */
    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    /**
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.FileFingerprintOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.FileFingerprintOptions,
  ) : CdkObject(cdkObject), FileFingerprintOptions {
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
     * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
     *
     * Default: - hash is only based on source content
     */
    override fun extraHash(): String? = unwrap(this).getExtraHash()

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     */
    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     */
    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileFingerprintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileFingerprintOptions):
        FileFingerprintOptions = CdkObjectWrappers.wrap(cdkObject) as? FileFingerprintOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileFingerprintOptions):
        software.amazon.awscdk.FileFingerprintOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.FileFingerprintOptions
  }
}
