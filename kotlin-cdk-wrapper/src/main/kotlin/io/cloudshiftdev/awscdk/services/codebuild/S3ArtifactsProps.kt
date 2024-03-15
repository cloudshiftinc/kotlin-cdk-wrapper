@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface S3ArtifactsProps : ArtifactsProps {
  public fun bucket(): IBucket

  public fun encryption(): Boolean? = unwrap(this).getEncryption()

  public fun includeBuildId(): Boolean? = unwrap(this).getIncludeBuildId()

  public fun name(): String? = unwrap(this).getName()

  public fun packageZip(): Boolean? = unwrap(this).getPackageZip()

  public fun path(): String? = unwrap(this).getPath()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun encryption(encryption: Boolean)

    public fun identifier(identifier: String)

    public fun includeBuildId(includeBuildId: Boolean)

    public fun name(name: String)

    public fun packageZip(packageZip: Boolean)

    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.S3ArtifactsProps.Builder =
        software.amazon.awscdk.services.codebuild.S3ArtifactsProps.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun encryption(encryption: Boolean) {
      cdkBuilder.encryption(encryption)
    }

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun includeBuildId(includeBuildId: Boolean) {
      cdkBuilder.includeBuildId(includeBuildId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packageZip(packageZip: Boolean) {
      cdkBuilder.packageZip(packageZip)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.S3ArtifactsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.S3ArtifactsProps,
  ) : CdkObject(cdkObject), S3ArtifactsProps {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun encryption(): Boolean? = unwrap(this).getEncryption()

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun includeBuildId(): Boolean? = unwrap(this).getIncludeBuildId()

    override fun name(): String? = unwrap(this).getName()

    override fun packageZip(): Boolean? = unwrap(this).getPackageZip()

    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ArtifactsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.S3ArtifactsProps):
        S3ArtifactsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ArtifactsProps):
        software.amazon.awscdk.services.codebuild.S3ArtifactsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.S3ArtifactsProps
  }
}
