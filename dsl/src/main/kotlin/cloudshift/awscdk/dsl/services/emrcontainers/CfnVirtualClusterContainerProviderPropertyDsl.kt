@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

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
