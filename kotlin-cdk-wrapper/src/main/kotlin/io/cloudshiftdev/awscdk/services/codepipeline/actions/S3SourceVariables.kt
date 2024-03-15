@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface S3SourceVariables {
  public fun eTag(): String

  public fun versionId(): String

  @CdkDslMarker
  public interface Builder {
    public fun eTag(eTag: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.builder()

    override fun eTag(eTag: String) {
      cdkBuilder.eTag(eTag)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables,
  ) : CdkObject(cdkObject), S3SourceVariables {
    override fun eTag(): String = unwrap(this).getETag()

    override fun versionId(): String = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables):
        S3SourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables
  }
}
