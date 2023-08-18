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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

/**
 * Configuration for the Amazon EKS cluster that supports the AWS Batch compute environment.
 *
 * The cluster must exist before the compute environment can be created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksConfigurationProperty eksConfigurationProperty = EksConfigurationProperty.builder()
 * .eksClusterArn("eksClusterArn")
 * .kubernetesNamespace("kubernetesNamespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-eksconfiguration.html)
 */
@CdkDslMarker
public class CfnComputeEnvironmentEksConfigurationPropertyDsl {
    private val cdkBuilder: CfnComputeEnvironment.EksConfigurationProperty.Builder =
        CfnComputeEnvironment.EksConfigurationProperty.builder()

    /**
     * @param eksClusterArn The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is
     *   `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
     */
    public fun eksClusterArn(eksClusterArn: String) {
        cdkBuilder.eksClusterArn(eksClusterArn)
    }

    /**
     * @param kubernetesNamespace The namespace of the Amazon EKS cluster. AWS Batch manages pods in
     *   this namespace. The value can't left empty or null. It must be fewer than 64 characters
     *   long, can't be set to `default` , can't start with " `kube-` ," and must match this regular
     *   expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information, see
     *   [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
     *   in the Kubernetes documentation.
     */
    public fun kubernetesNamespace(kubernetesNamespace: String) {
        cdkBuilder.kubernetesNamespace(kubernetesNamespace)
    }

    public fun build(): CfnComputeEnvironment.EksConfigurationProperty = cdkBuilder.build()
}
