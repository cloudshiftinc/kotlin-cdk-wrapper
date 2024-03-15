@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

public interface DockerImageOptions {
  public fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun secretsManagerCredentials(secretsManagerCredentials: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.DockerImageOptions.Builder =
        software.amazon.awscdk.services.codebuild.DockerImageOptions.builder()

    override fun secretsManagerCredentials(secretsManagerCredentials: ISecret) {
      cdkBuilder.secretsManagerCredentials(secretsManagerCredentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.DockerImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.DockerImageOptions,
  ) : CdkObject(cdkObject), DockerImageOptions {
    override fun secretsManagerCredentials(): ISecret? =
        unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.DockerImageOptions):
        DockerImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageOptions):
        software.amazon.awscdk.services.codebuild.DockerImageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.DockerImageOptions
  }
}
