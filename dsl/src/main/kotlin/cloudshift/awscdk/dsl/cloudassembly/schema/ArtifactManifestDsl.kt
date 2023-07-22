@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cloudassembly.schema.ArtifactType
import software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties

@CdkDslMarker
public class ArtifactManifestDsl {
  private val cdkBuilder: ArtifactManifest.Builder = ArtifactManifest.builder()

  private val _dependencies: MutableList<String> = mutableListOf()

  /**
   * @param dependencies IDs of artifacts that must be deployed before this artifact.
   */
  public fun dependencies(vararg dependencies: String) {
    _dependencies.addAll(listOf(*dependencies))
  }

  /**
   * @param dependencies IDs of artifacts that must be deployed before this artifact.
   */
  public fun dependencies(dependencies: Collection<String>) {
    _dependencies.addAll(dependencies)
  }

  /**
   * @param displayName A string that represents this artifact.
   * Should only be used in user interfaces.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param environment The environment into which this artifact is deployed.
   */
  public fun environment(environment: String) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param metadata Associated metadata.
   */
  public fun metadata(metadata: Map<String, List<MetadataEntry>>) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param properties The set of properties for this artifact (depends on type).
   */
  public fun properties(properties: AssetManifestProperties) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties The set of properties for this artifact (depends on type).
   */
  public fun properties(properties: AwsCloudFormationStackProperties) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties The set of properties for this artifact (depends on type).
   */
  public fun properties(properties: NestedCloudAssemblyProperties) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties The set of properties for this artifact (depends on type).
   */
  public fun properties(properties: TreeArtifactProperties) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param type The type of artifact. 
   */
  public fun type(type: ArtifactType) {
    cdkBuilder.type(type)
  }

  public fun build(): ArtifactManifest {
    if(_dependencies.isNotEmpty()) cdkBuilder.dependencies(_dependencies)
    return cdkBuilder.build()
  }
}
