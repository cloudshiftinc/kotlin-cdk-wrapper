@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GitPushFilter {
  public fun tagsExcludes(): List<String> = unwrap(this).getTagsExcludes() ?: emptyList()

  public fun tagsIncludes(): List<String> = unwrap(this).getTagsIncludes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun tagsExcludes(tagsExcludes: List<String>)

    public fun tagsExcludes(vararg tagsExcludes: String)

    public fun tagsIncludes(tagsIncludes: List<String>)

    public fun tagsIncludes(vararg tagsIncludes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.GitPushFilter.Builder =
        software.amazon.awscdk.services.codepipeline.GitPushFilter.builder()

    override fun tagsExcludes(tagsExcludes: List<String>) {
      cdkBuilder.tagsExcludes(tagsExcludes)
    }

    override fun tagsExcludes(vararg tagsExcludes: String): Unit =
        tagsExcludes(tagsExcludes.toList())

    override fun tagsIncludes(tagsIncludes: List<String>) {
      cdkBuilder.tagsIncludes(tagsIncludes)
    }

    override fun tagsIncludes(vararg tagsIncludes: String): Unit =
        tagsIncludes(tagsIncludes.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.GitPushFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.GitPushFilter,
  ) : CdkObject(cdkObject), GitPushFilter {
    override fun tagsExcludes(): List<String> = unwrap(this).getTagsExcludes() ?: emptyList()

    override fun tagsIncludes(): List<String> = unwrap(this).getTagsIncludes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitPushFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitPushFilter):
        GitPushFilter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitPushFilter):
        software.amazon.awscdk.services.codepipeline.GitPushFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitPushFilter
  }
}
