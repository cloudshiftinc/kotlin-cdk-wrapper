package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FileFingerprintOptions : FileCopyOptions {
  public fun extraHash(): String? = unwrap(this).getExtraHash()

  public interface Builder {
    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun extraHash(extraHash: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileFingerprintOptions.Builder =
        software.amazon.awscdk.FileFingerprintOptions.builder()

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.FileFingerprintOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.FileFingerprintOptions,
  ) : FileFingerprintOptions {
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun extraHash(): String? = unwrap(this).getExtraHash()

    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileFingerprintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileFingerprintOptions):
        FileFingerprintOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileFingerprintOptions):
        software.amazon.awscdk.FileFingerprintOptions = (wrapped as Wrapper).cdkObject
  }
}
