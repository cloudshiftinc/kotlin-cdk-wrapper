@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Any
import kotlin.String

public open class Artifact internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Artifact,
) : CdkObject(cdkObject) {
  public open fun artifactName(): String? = unwrap(this).getArtifactName()

  public open fun atPath(fileName: String): ArtifactPath =
      unwrap(this).atPath(fileName).let(ArtifactPath::wrap)

  public open fun bucketName(): String = unwrap(this).getBucketName()

  public open fun metadata(key: String): Any = unwrap(this).getMetadata(key)

  public open fun metadata(key: String, `value`: Any) {
    unwrap(this).setMetadata(key, `value`)
  }

  public open fun objectKey(): String = unwrap(this).getObjectKey()

  public open fun `param`(jsonFile: String, keyName: String): String =
      unwrap(this).getParam(jsonFile, keyName)

  public open fun s3Location(): Location = unwrap(this).getS3Location().let(Location::wrap)

  public open fun url(): String = unwrap(this).getUrl()

  public companion object {
    public fun artifact(name: String): Artifact =
        software.amazon.awscdk.services.codepipeline.Artifact.artifact(name).let(Artifact::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Artifact): Artifact =
        Artifact(cdkObject)

    internal fun unwrap(wrapped: Artifact): software.amazon.awscdk.services.codepipeline.Artifact =
        wrapped.cdkObject
  }
}
