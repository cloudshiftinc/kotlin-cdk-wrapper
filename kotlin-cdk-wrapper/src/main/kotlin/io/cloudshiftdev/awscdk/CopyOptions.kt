@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CopyOptions {
  public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

  public fun follow(): SymlinkFollowMode? = unwrap(this).getFollow()?.let(SymlinkFollowMode::wrap)

  public fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun follow(follow: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CopyOptions.Builder =
        software.amazon.awscdk.CopyOptions.builder()

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun follow(follow: SymlinkFollowMode) {
      cdkBuilder.follow(follow.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.CopyOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CopyOptions,
  ) : CdkObject(cdkObject), CopyOptions {
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    override fun follow(): SymlinkFollowMode? =
        unwrap(this).getFollow()?.let(SymlinkFollowMode::wrap)

    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CopyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CopyOptions): CopyOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CopyOptions): software.amazon.awscdk.CopyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CopyOptions
  }
}
