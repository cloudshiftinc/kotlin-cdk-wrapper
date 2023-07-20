@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

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

@CdkDslMarker
public class NestedCloudAssemblyArtifactDsl(
    assembly: CloudAssembly,
    name: String,
) {
    private val cdkBuilder: NestedCloudAssemblyArtifact.Builder =
        NestedCloudAssemblyArtifact.Builder.create(assembly, name)

    private val _dependencies: MutableList<String> = mutableListOf()

    public fun dependencies(vararg dependencies: String) {
        _dependencies.addAll(listOf(*dependencies))
    }

    public fun dependencies(dependencies: Collection<String>) {
        _dependencies.addAll(dependencies)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun environment(environment: String) {
        cdkBuilder.environment(environment)
    }

    public fun metadata(metadata: Map<String, List<MetadataEntry>>) {
        cdkBuilder.metadata(metadata)
    }

    public fun properties(properties: AssetManifestProperties) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: AwsCloudFormationStackProperties) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: NestedCloudAssemblyProperties) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: TreeArtifactProperties) {
        cdkBuilder.properties(properties)
    }

    public fun type(type: ArtifactType) {
        cdkBuilder.type(type)
    }

    public fun build(): NestedCloudAssemblyArtifact {
        if (_dependencies.isNotEmpty()) cdkBuilder.dependencies(_dependencies)
        return cdkBuilder.build()
    }
}
