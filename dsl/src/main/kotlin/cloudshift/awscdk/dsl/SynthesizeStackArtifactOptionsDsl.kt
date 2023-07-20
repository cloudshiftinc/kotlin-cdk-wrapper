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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.cloudassembly.schema.BootstrapRoleDsl
import software.amazon.awscdk.SynthesizeStackArtifactOptions
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class SynthesizeStackArtifactOptionsDsl {
    private val cdkBuilder: SynthesizeStackArtifactOptions.Builder =
        SynthesizeStackArtifactOptions.builder()

    private val _additionalDependencies: MutableList<String> = mutableListOf()

    public fun additionalDependencies(vararg additionalDependencies: String) {
        _additionalDependencies.addAll(listOf(*additionalDependencies))
    }

    public fun additionalDependencies(additionalDependencies: Collection<String>) {
        _additionalDependencies.addAll(additionalDependencies)
    }

    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
        cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    public fun lookupRole(block: BootstrapRoleDsl.() -> Unit = {}) {
        val builder = BootstrapRoleDsl()
        builder.apply(block)
        cdkBuilder.lookupRole(builder.build())
    }

    public fun lookupRole(lookupRole: BootstrapRole) {
        cdkBuilder.lookupRole(lookupRole)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
        cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
        cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public fun build(): SynthesizeStackArtifactOptions {
        if (_additionalDependencies.isNotEmpty()) {
            cdkBuilder.additionalDependencies(_additionalDependencies)
        }
        return cdkBuilder.build()
    }
}
