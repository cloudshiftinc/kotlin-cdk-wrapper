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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.cloudassembly.schema.BootstrapRoleDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.SynthesizeStackArtifactOptions
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

/**
 * Stack artifact options.
 *
 * A subset of `cxschema.AwsCloudFormationStackProperties` of optional settings that need to be
 * configurable by synthesizers, plus `additionalDependencies`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * SynthesizeStackArtifactOptions synthesizeStackArtifactOptions =
 * SynthesizeStackArtifactOptions.builder()
 * .additionalDependencies(List.of("additionalDependencies"))
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
 * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
 * .build();
 * ```
 */
@CdkDslMarker
public class SynthesizeStackArtifactOptionsDsl {
    private val cdkBuilder: SynthesizeStackArtifactOptions.Builder =
        SynthesizeStackArtifactOptions.builder()

    private val _additionalDependencies: MutableList<String> = mutableListOf()

    /** @param additionalDependencies Identifiers of additional dependencies. */
    public fun additionalDependencies(vararg additionalDependencies: String) {
        _additionalDependencies.addAll(listOf(*additionalDependencies))
    }

    /** @param additionalDependencies Identifiers of additional dependencies. */
    public fun additionalDependencies(additionalDependencies: Collection<String>) {
        _additionalDependencies.addAll(additionalDependencies)
    }

    /** @param assumeRoleArn The role that needs to be assumed to deploy the stack. */
    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /** @param assumeRoleExternalId The externalID to use with the assumeRoleArn. */
    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     *   number can be found. Only used if `requiresBootstrapStackVersion` is set.
     * * If this value is not set, the bootstrap stack name must be known at deployment time so the
     *   stack version can be looked up from the stack outputs.
     * * If this value is set, the bootstrap stack can have any name because we won't need to look
     *   it up.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param cloudFormationExecutionRoleArn The role that is passed to CloudFormation to execute
     *   the change set.
     */
    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
        cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    /** @param lookupRole The role to use to look up values from the target AWS account. */
    public fun lookupRole(lookupRole: BootstrapRoleDsl.() -> Unit = {}) {
        val builder = BootstrapRoleDsl()
        builder.apply(lookupRole)
        cdkBuilder.lookupRole(builder.build())
    }

    /** @param lookupRole The role to use to look up values from the target AWS account. */
    public fun lookupRole(lookupRole: BootstrapRole) {
        cdkBuilder.lookupRole(lookupRole)
    }

    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     *   stack is deployed.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     *   stack.
     */
    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
        cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    /**
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     *   asset manifest, its asset URL.
     */
    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
        cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public fun build(): SynthesizeStackArtifactOptions {
        if (_additionalDependencies.isNotEmpty())
            cdkBuilder.additionalDependencies(_additionalDependencies)
        return cdkBuilder.build()
    }
}
