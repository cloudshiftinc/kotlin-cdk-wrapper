@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FileCopyOptions {
  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  public fun followSymlinks(): SymlinkFollowMode? =
      unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

  public fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileCopyOptions.Builder =
        software.amazon.awscdk.FileCopyOptions.builder()

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.FileCopyOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.FileCopyOptions,
  ) : CdkObject(cdkObject), FileCopyOptions {
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileCopyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileCopyOptions): FileCopyOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileCopyOptions): software.amazon.awscdk.FileCopyOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.FileCopyOptions
  }
}
