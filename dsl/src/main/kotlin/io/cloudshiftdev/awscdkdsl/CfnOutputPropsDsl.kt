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
import software.amazon.awscdk.CfnOutputProps

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
public class CfnOutputPropsDsl {
    private val cdkBuilder: CfnOutputProps.Builder = CfnOutputProps.builder()

    /**
     * @param condition A condition to associate with this output value. If the condition evaluates
     *   to `false`, this output value will not be included in the stack.
     */
    public fun condition(condition: CfnCondition) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param description A String type that describes the output value. The description can be a
     *   maximum of 4 K in length.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param exportName The name used to export the value of this output across stacks. To import
     *   the value from another stack, use `Fn.importValue(exportName)`.
     */
    public fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
    }

    /**
     * @param value The value of the property returned by the aws cloudformation describe-stacks
     *   command. The value of an output can include literals, parameter references,
     *   pseudo-parameters, a mapping value, or intrinsic functions.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnOutputProps = cdkBuilder.build()
}
