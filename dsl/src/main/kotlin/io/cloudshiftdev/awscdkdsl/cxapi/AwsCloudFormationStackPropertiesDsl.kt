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

package io.cloudshiftdev.awscdkdsl.cxapi

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties

/**
 * Artifact properties for CloudFormation stacks.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * AwsCloudFormationStackProperties awsCloudFormationStackProperties =
 * AwsCloudFormationStackProperties.builder()
 * .templateFile("templateFile")
 * // the properties below are optional
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .stackName("stackName")
 * .terminationProtection(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsCloudFormationStackPropertiesDsl {
    private val cdkBuilder: AwsCloudFormationStackProperties.Builder =
        AwsCloudFormationStackProperties.builder()

    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     *   stack is deployed.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param stackName The name to use for the CloudFormation stack. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
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

    public fun build(): AwsCloudFormationStackProperties = cdkBuilder.build()
}
