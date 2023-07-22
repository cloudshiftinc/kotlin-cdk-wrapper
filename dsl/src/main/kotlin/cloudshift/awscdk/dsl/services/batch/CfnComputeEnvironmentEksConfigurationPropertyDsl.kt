@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentEksConfigurationPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.EksConfigurationProperty.Builder =
      CfnComputeEnvironment.EksConfigurationProperty.builder()

  /**
   * @param eksClusterArn The Amazon Resource Name (ARN) of the Amazon EKS cluster. 
   * An example is `arn: *aws* :eks: *us-east-1* : *123456789012* :cluster/ *ClusterForBatch*` .
   */
  public fun eksClusterArn(eksClusterArn: String) {
    cdkBuilder.eksClusterArn(eksClusterArn)
  }

  /**
   * @param kubernetesNamespace The namespace of the Amazon EKS cluster. 
   * AWS Batch manages pods in this namespace. The value can't left empty or null. It must be fewer
   * than 64 characters long, can't be set to `default` , can't start with " `kube-` ," and must match
   * this regular expression: `^[a-z0-9]([-a-z0-9]*[a-z0-9])?$` . For more information, see
   * [Namespaces](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)
   * in the Kubernetes documentation.
   */
  public fun kubernetesNamespace(kubernetesNamespace: String) {
    cdkBuilder.kubernetesNamespace(kubernetesNamespace)
  }

  public fun build(): CfnComputeEnvironment.EksConfigurationProperty = cdkBuilder.build()
}
