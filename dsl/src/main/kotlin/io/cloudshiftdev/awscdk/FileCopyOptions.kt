package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FileCopyOptions {
  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  public fun followSymlinks(): SymlinkFollowMode? =
      unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

  public fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

  public interface Builder {
    public fun exclude(exclude: List<String>)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileCopyOptions.Builder =
        software.amazon.awscdk.FileCopyOptions.builder()

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.FileCopyOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.FileCopyOptions,
  ) : FileCopyOptions {
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileCopyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileCopyOptions): FileCopyOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileCopyOptions): software.amazon.awscdk.FileCopyOptions = (wrapped
        as Wrapper).cdkObject
  }
}
