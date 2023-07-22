@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

/**
 * The information about the container provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrcontainers.*;
 * ContainerProviderProperty containerProviderProperty = ContainerProviderProperty.builder()
 * .id("id")
 * .info(ContainerInfoProperty.builder()
 * .eksInfo(EksInfoProperty.builder()
 * .namespace("namespace")
 * .build())
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerprovider.html)
 */
@CdkDslMarker
public class CfnVirtualClusterContainerProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualCluster.ContainerProviderProperty.Builder =
      CfnVirtualCluster.ContainerProviderProperty.builder()

  /**
   * @param id The ID of the container cluster. 
   * *Minimum* : 1
   *
   * *Maximum* : 100
   *
   * *Pattern* : `^[0-9A-Za-z][A-Za-z0-9\-_]*`
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param info The information about the container cluster. 
   */
  public fun info(info: IResolvable) {
    cdkBuilder.info(info)
  }

  /**
   * @param info The information about the container cluster. 
   */
  public fun info(info: CfnVirtualCluster.ContainerInfoProperty) {
    cdkBuilder.info(info)
  }

  /**
   * @param type The type of the container provider. 
   * Amazon EKS is the only supported type as of now.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnVirtualCluster.ContainerProviderProperty = cdkBuilder.build()
}
