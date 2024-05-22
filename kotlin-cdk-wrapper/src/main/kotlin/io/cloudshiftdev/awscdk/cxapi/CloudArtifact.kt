@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents an artifact within a cloud assembly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * CloudAssembly cloudAssembly;
 * CloudArtifact cloudArtifact = CloudArtifact.fromManifest(cloudAssembly, "MyCloudArtifact",
 * ArtifactManifest.builder()
 * .type(ArtifactType.NONE)
 * // the properties below are optional
 * .dependencies(List.of("dependencies"))
 * .displayName("displayName")
 * .environment("environment")
 * .metadata(Map.of(
 * "metadataKey", List.of(MetadataEntry.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build())))
 * .properties(AwsCloudFormationStackProperties.builder()
 * .templateFile("templateFile")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .lookupRole(BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build())
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .requiresBootstrapStackVersion(123)
 * .stackName("stackName")
 * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .terminationProtection(false)
 * .validateOnSynth(false)
 * .build())
 * .build());
 * ```
 */
public open class CloudArtifact(
  cdkObject: software.amazon.awscdk.cxapi.CloudArtifact,
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
        software.amazon.awscdk.cxapi.CloudArtifact.fromManifest(assembly.let(CloudAssembly.Companion::unwrap),
        id, artifact.let(ArtifactManifest.Companion::unwrap))?.let(CloudArtifact::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf15c645a93890774d2fc564c09a4cc0b00096f48fca3019d1f567d1c659f93c")
    public fun fromManifest(
      assembly: CloudAssembly,
      id: String,
      artifact: ArtifactManifest.Builder.() -> Unit,
    ): CloudArtifact? = fromManifest(assembly, id, ArtifactManifest(artifact))

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudArtifact): CloudArtifact =
        CloudArtifact(cdkObject)

    internal fun unwrap(wrapped: CloudArtifact): software.amazon.awscdk.cxapi.CloudArtifact =
        wrapped.cdkObject as software.amazon.awscdk.cxapi.CloudArtifact
  }
}
