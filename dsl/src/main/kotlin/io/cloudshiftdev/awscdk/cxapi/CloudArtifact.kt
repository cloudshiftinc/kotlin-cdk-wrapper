package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class CloudArtifact internal constructor(
  private val cdkObject: software.amazon.awscdk.cxapi.CloudArtifact,
) {
  public open fun assembly(): CloudAssembly = unwrap(this).getAssembly().let(CloudAssembly::wrap)

  public open fun dependencies(): List<CloudArtifact> =
      unwrap(this).getDependencies().map(CloudArtifact::wrap)

  public open fun findMetadataByType(type: String): List<MetadataEntryResult> =
      unwrap(this).findMetadataByType(type).map(MetadataEntryResult::wrap)

  public open fun hierarchicalId(): String = unwrap(this).getHierarchicalId()

  public open fun id(): String = unwrap(this).getId()

  public open fun manifest(): ArtifactManifest =
      unwrap(this).getManifest().let(ArtifactManifest::wrap)

  public open fun messages(): List<SynthesisMessage> =
      unwrap(this).getMessages().map(SynthesisMessage::wrap)

  public companion object {
    public open fun fromManifest(
      assembly: CloudAssembly,
      id: String,
      artifact: ArtifactManifest,
    ): CloudArtifact? =
        software.amazon.awscdk.cxapi.CloudArtifact.fromManifest(assembly.let(CloudAssembly::unwrap),
        id, artifact.let(ArtifactManifest::unwrap))?.let(CloudArtifact::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf15c645a93890774d2fc564c09a4cc0b00096f48fca3019d1f567d1c659f93c")
    public open fun fromManifest(
      assembly: CloudAssembly,
      id: String,
      artifact: ArtifactManifest.Builder.() -> Unit,
    ): CloudArtifact? = fromManifest(assembly, id, ArtifactManifest(artifact))

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudArtifact): CloudArtifact =
        CloudArtifact(cdkObject)

    internal fun unwrap(wrapped: CloudArtifact): software.amazon.awscdk.cxapi.CloudArtifact =
        wrapped.cdkObject
  }
}
