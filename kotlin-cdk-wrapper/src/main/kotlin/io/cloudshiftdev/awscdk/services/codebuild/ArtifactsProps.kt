@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ArtifactsProps {
  public fun identifier(): String? = unwrap(this).getIdentifier()

  @CdkDslMarker
  public interface Builder {
    public fun identifier(identifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ArtifactsProps.Builder =
        software.amazon.awscdk.services.codebuild.ArtifactsProps.builder()

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ArtifactsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsProps,
  ) : CdkObject(cdkObject), ArtifactsProps {
    override fun identifier(): String? = unwrap(this).getIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsProps):
        ArtifactsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactsProps):
        software.amazon.awscdk.services.codebuild.ArtifactsProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.ArtifactsProps
  }
}
