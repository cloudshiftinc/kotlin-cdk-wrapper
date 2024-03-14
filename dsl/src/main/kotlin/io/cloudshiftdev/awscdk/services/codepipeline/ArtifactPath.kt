package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.String

public open class ArtifactPath internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.ArtifactPath,
) {
  /**
   *
   */
  public open fun artifact(): Artifact = unwrap(this).getArtifact().let(Artifact::wrap)

  /**
   *
   */
  public open fun fileName(): String = unwrap(this).getFileName()

  /**
   *
   */
  public open fun location(): String = unwrap(this).getLocation()

  public companion object {
    public fun artifactPath(artifactName: String, fileName: String): ArtifactPath =
        software.amazon.awscdk.services.codepipeline.ArtifactPath.artifactPath(artifactName,
        fileName).let(ArtifactPath::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ArtifactPath):
        ArtifactPath = ArtifactPath(cdkObject)

    internal fun unwrap(wrapped: ArtifactPath):
        software.amazon.awscdk.services.codepipeline.ArtifactPath = wrapped.cdkObject
  }
}
