@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterServiceConnectDefaultsPropertyDsl {
  private val cdkBuilder: CfnCluster.ServiceConnectDefaultsProperty.Builder =
      CfnCluster.ServiceConnectDefaultsProperty.builder()

  /**
   * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
   * namespace that's used when you create a service and don't specify a Service Connect configuration.
   * The namespace name can include up to 1024 characters. The name is case-sensitive. The name
   * can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/).
   *
   * If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace
   * type is supported. The namespace must be in this account and this AWS Region.
   *
   * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a AWS
   * Cloud Map namespace with the "API calls" method of instance discovery only. This instance
   * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types of
   * instance discovery aren't used by Service Connect.
   *
   * If you update the service with an empty string `""` for the namespace name, the cluster
   * configuration for Service Connect is removed. Note that the namespace will remain in AWS Cloud Map
   * and must be deleted separately.
   *
   * For more information about AWS Cloud Map , see [Working with
   * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the *AWS
   * Cloud Map Developer Guide* .
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnCluster.ServiceConnectDefaultsProperty = cdkBuilder.build()
}
