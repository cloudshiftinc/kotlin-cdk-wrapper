@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.NetworkConfigurationProperty.Builder =
      CfnJobDefinition.NetworkConfigurationProperty.builder()

  /**
   * @param assignPublicIp Indicates whether the job has a public IP address.
   * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
   * the internet (for example, to pull container images), the private subnet requires a NAT gateway be
   * attached to route requests to the internet. For more information, see [Amazon ECS task
   * networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
   * the *Amazon Elastic Container Service Developer Guide* . The default value is " `DISABLED` ".
   */
  public fun assignPublicIp(assignPublicIp: String) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  public fun build(): CfnJobDefinition.NetworkConfigurationProperty = cdkBuilder.build()
}
