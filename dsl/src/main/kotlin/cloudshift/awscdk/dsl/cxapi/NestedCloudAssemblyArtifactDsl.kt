@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.ArtifactType
import software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList

/**
 * Asset manifest is a description of a set of assets which need to be built and published.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * import software.amazon.awscdk.cxapi.*;
 * CloudAssembly cloudAssembly;
 * NestedCloudAssemblyArtifact nestedCloudAssemblyArtifact =
 * NestedCloudAssemblyArtifact.Builder.create(cloudAssembly, "name")
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
 * .build();
 * ```
 */
@CdkDslMarker
public class NestedCloudAssemblyArtifactDsl(
    assembly: CloudAssembly,
    name: String
) {
    private val cdkBuilder: NestedCloudAssemblyArtifact.Builder =
        NestedCloudAssemblyArtifact.Builder.create(assembly, name)

    private val _dependencies: MutableList<String> = mutableListOf()

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    public fun dependencies(vararg dependencies: String) {
        _dependencies.addAll(listOf(*dependencies))
    }

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact.
     */
    public fun dependencies(dependencies: Collection<String>) {
        _dependencies.addAll(dependencies)
    }

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     *
     * @param displayName A string that represents this artifact.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     *
     * @param environment The environment into which this artifact is deployed.
     */
    public fun environment(environment: String) {
        cdkBuilder.environment(environment)
    }

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     *
     * @param metadata Associated metadata.
     */
    public fun metadata(metadata: Map<String, List<MetadataEntry>>) {
        cdkBuilder.metadata(metadata)
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: AssetManifestProperties) {
        cdkBuilder.properties(properties)
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: AwsCloudFormationStackProperties) {
        cdkBuilder.properties(properties)
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: NestedCloudAssemblyProperties) {
        cdkBuilder.properties(properties)
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type).
     */
    public fun properties(properties: TreeArtifactProperties) {
        cdkBuilder.properties(properties)
    }

    /**
     * The type of artifact.
     *
     * @param type The type of artifact.
     */
    public fun type(type: ArtifactType) {
        cdkBuilder.type(type)
    }

    public fun build(): NestedCloudAssemblyArtifact {
        if (_dependencies.isNotEmpty()) cdkBuilder.dependencies(_dependencies)
        return cdkBuilder.build()
    }
}
