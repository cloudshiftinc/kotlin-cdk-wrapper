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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class AwsCloudFormationStackPropertiesDsl {
    private val cdkBuilder: AwsCloudFormationStackProperties.Builder =
        AwsCloudFormationStackProperties.builder()

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

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
        cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun templateFile(templateFile: String) {
        cdkBuilder.templateFile(templateFile)
    }

    public fun terminationProtection(terminationProtection: Boolean) {
        cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun validateOnSynth(validateOnSynth: Boolean) {
        cdkBuilder.validateOnSynth(validateOnSynth)
    }

    public fun build(): AwsCloudFormationStackProperties = cdkBuilder.build()
}
