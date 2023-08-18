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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnOutput
import software.constructs.Construct

/**
 * Example:
 * ```
 * Cluster cluster;
 * // add service account
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
 * Bucket bucket = new Bucket(this, "Bucket");
 * bucket.grantReadWrite(serviceAccount);
 * KubernetesManifest mypod = cluster.addManifest("mypod", Map.of(
 * "apiVersion", "v1",
 * "kind", "Pod",
 * "metadata", Map.of("name", "mypod"),
 * "spec", Map.of(
 * "serviceAccountName", serviceAccount.getServiceAccountName(),
 * "containers", List.of(Map.of(
 * "name", "hello",
 * "image", "paulbouwer/hello-kubernetes:1.5",
 * "ports", List.of(Map.of("containerPort", 8080)))))));
 * // create the resource after the service account.
 * mypod.node.addDependency(serviceAccount);
 * // print the IAM role arn for this service account
 * // print the IAM role arn for this service account
 * CfnOutput.Builder.create(this,
 * "ServiceAccountIamRole").value(serviceAccount.getRole().getRoleArn()).build();
 * ```
 */
@CdkDslMarker
public class CfnOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOutput.Builder = CfnOutput.Builder.create(scope, id)

    /**
     * A condition to associate with this output value.
     *
     * If the condition evaluates to `false`, this output value will not be included in the stack.
     *
     * Default: - No condition is associated with the output.
     *
     * @param condition A condition to associate with this output value.
     */
    public fun condition(condition: CfnCondition) {
        cdkBuilder.condition(condition)
    }

    /**
     * A String type that describes the output value.
     *
     * The description can be a maximum of 4 K in length.
     *
     * Default: - No description.
     *
     * @param description A String type that describes the output value.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name used to export the value of this output across stacks.
     *
     * To import the value from another stack, use `Fn.importValue(exportName)`.
     *
     * Default: - the output is not exported
     *
     * @param exportName The name used to export the value of this output across stacks.
     */
    public fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
    }

    /**
     * The value of the property returned by the aws cloudformation describe-stacks command.
     *
     * The value of an output can include literals, parameter references, pseudo-parameters, a
     * mapping value, or intrinsic functions.
     *
     * @param value The value of the property returned by the aws cloudformation describe-stacks
     *   command.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnOutput = cdkBuilder.build()
}
