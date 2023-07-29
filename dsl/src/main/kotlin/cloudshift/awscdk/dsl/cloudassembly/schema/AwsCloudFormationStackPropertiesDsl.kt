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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

/**
 * Artifact properties for CloudFormation stacks.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AwsCloudFormationStackProperties awsCloudFormationStackProperties =
 * AwsCloudFormationStackProperties.builder()
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
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsCloudFormationStackPropertiesDsl {
    private val cdkBuilder: AwsCloudFormationStackProperties.Builder =
        AwsCloudFormationStackProperties.builder()

    /** @param assumeRoleArn The role that needs to be assumed to deploy the stack. */
    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId External ID to use when assuming role for cloudformation
     *   deployments.
     */
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

    /** @param stackName The name to use for the CloudFormation stack. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    /**
     * @param stackTemplateAssetObjectUrl If the stack template has already been included in the
     *   asset manifest, its asset URL.
     */
    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
        cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    /**
     * @param tags Values for CloudFormation stack tags that should be passed when the stack is
     *   deployed.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param templateFile A file relative to the assembly root which contains the CloudFormation
     *   template for this stack.
     */
    public fun templateFile(templateFile: String) {
        cdkBuilder.templateFile(templateFile)
    }

    /** @param terminationProtection Whether to enable termination protection for this stack. */
    public fun terminationProtection(terminationProtection: Boolean) {
        cdkBuilder.terminationProtection(terminationProtection)
    }

    /** @param validateOnSynth Whether this stack should be validated by the CLI after synthesis. */
    public fun validateOnSynth(validateOnSynth: Boolean) {
        cdkBuilder.validateOnSynth(validateOnSynth)
    }

    public fun build(): AwsCloudFormationStackProperties = cdkBuilder.build()
}
