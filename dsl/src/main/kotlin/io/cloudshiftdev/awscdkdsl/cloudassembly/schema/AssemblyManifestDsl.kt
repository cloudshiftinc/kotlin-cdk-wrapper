@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cloudassembly.schema.AssemblyManifest
import software.amazon.awscdk.cloudassembly.schema.MissingContext
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo

/**
 * A manifest which describes the cloud assembly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AssemblyManifest assemblyManifest = AssemblyManifest.builder()
 * .version("version")
 * // the properties below are optional
 * .artifacts(Map.of(
 * "artifactsKey", ArtifactManifest.builder()
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
 * .build()))
 * .missing(List.of(MissingContext.builder()
 * .key("key")
 * .props(AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .owners(List.of("owners"))
 * .build())
 * .provider(ContextProvider.AMI_PROVIDER)
 * .build()))
 * .runtime(RuntimeInfo.builder()
 * .libraries(Map.of(
 * "librariesKey", "libraries"))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AssemblyManifestDsl {
    private val cdkBuilder: AssemblyManifest.Builder = AssemblyManifest.builder()

    private val _missing: MutableList<MissingContext> = mutableListOf()

    /** @param artifacts The set of artifacts in this assembly. */
    public fun artifacts(artifacts: Map<String, ArtifactManifest>) {
        cdkBuilder.artifacts(artifacts)
    }

    /**
     * @param missing Missing context information. If this field has values, it means that the cloud
     *   assembly is not complete and should not be deployed.
     */
    public fun missing(missing: MissingContextDsl.() -> Unit) {
        _missing.add(MissingContextDsl().apply(missing).build())
    }

    /**
     * @param missing Missing context information. If this field has values, it means that the cloud
     *   assembly is not complete and should not be deployed.
     */
    public fun missing(missing: Collection<MissingContext>) {
        _missing.addAll(missing)
    }

    /** @param runtime Runtime information. */
    public fun runtime(runtime: RuntimeInfoDsl.() -> Unit = {}) {
        val builder = RuntimeInfoDsl()
        builder.apply(runtime)
        cdkBuilder.runtime(builder.build())
    }

    /** @param runtime Runtime information. */
    public fun runtime(runtime: RuntimeInfo) {
        cdkBuilder.runtime(runtime)
    }

    /** @param version Protocol version. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): AssemblyManifest {
        if (_missing.isNotEmpty()) cdkBuilder.missing(_missing)
        return cdkBuilder.build()
    }
}
