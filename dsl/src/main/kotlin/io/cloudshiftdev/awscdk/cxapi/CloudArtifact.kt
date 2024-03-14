package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class CloudArtifact internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.CloudArtifact,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun assembly(): CloudAssembly = unwrap(this).getAssembly().let(CloudAssembly::wrap)

  /**
   * Returns all the artifacts that this artifact depends on.
   */
  public open fun dependencies(): List<CloudArtifact> =
      unwrap(this).getDependencies().map(CloudArtifact::wrap)

  /**
   * @return all the metadata entries of a specific type in this artifact.
   * @param type 
   */
  public open fun findMetadataByType(type: String): List<MetadataEntryResult> =
      unwrap(this).findMetadataByType(type).map(MetadataEntryResult::wrap)

  /**
   * An identifier that shows where this artifact is located in the tree of nested assemblies, based
   * on their manifests.
   *
   * Defaults to the normal
   * id. Should only be used in user interfaces.
   */
  public open fun hierarchicalId(): String = unwrap(this).getHierarchicalId()

  /**
   *
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * The artifact's manifest.
   */
  public open fun manifest(): ArtifactManifest =
      unwrap(this).getManifest().let(ArtifactManifest::wrap)

  /**
   * The set of messages extracted from the artifact's metadata.
   */
  public open fun messages(): List<SynthesisMessage> =
      unwrap(this).getMessages().map(SynthesisMessage::wrap)

  public companion object {
    public fun fromManifest(
      assembly: CloudAssembly,
      id: String,
      artifact: ArtifactManifest,
    ): CloudArtifact? =
        software.amazon.awscdk.cxapi.CloudArtifact.fromManifest(assembly.let(CloudAssembly::unwrap),
        id, artifact.let(ArtifactManifest::unwrap))?.let(CloudArtifact::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf15c645a93890774d2fc564c09a4cc0b00096f48fca3019d1f567d1c659f93c")
    public fun fromManifest(
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
