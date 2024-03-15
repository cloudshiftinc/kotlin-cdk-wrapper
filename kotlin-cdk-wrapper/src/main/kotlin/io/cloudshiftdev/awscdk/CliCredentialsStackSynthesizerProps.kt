@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CliCredentialsStackSynthesizerProps {
  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  public fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

  public fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

  public fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

  public fun qualifier(): String? = unwrap(this).getQualifier()

  @CdkDslMarker
  public interface Builder {
    public fun bucketPrefix(bucketPrefix: String)

    public fun dockerTagPrefix(dockerTagPrefix: String)

    public fun fileAssetsBucketName(fileAssetsBucketName: String)

    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String)

    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CliCredentialsStackSynthesizerProps.Builder =
        software.amazon.awscdk.CliCredentialsStackSynthesizerProps.builder()

    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    override fun fileAssetsBucketName(fileAssetsBucketName: String) {
      cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    override fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
      cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.CliCredentialsStackSynthesizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizerProps,
  ) : CdkObject(cdkObject), CliCredentialsStackSynthesizerProps {
    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    override fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

    override fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

    override fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

    override fun qualifier(): String? = unwrap(this).getQualifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CliCredentialsStackSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizerProps):
        CliCredentialsStackSynthesizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CliCredentialsStackSynthesizerProps):
        software.amazon.awscdk.CliCredentialsStackSynthesizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CliCredentialsStackSynthesizerProps
  }
}
