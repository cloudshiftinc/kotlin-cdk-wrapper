@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

@CdkDslMarker
public class CfnLayerLifecycleEventConfigurationPropertyDsl {
  private val cdkBuilder: CfnLayer.LifecycleEventConfigurationProperty.Builder =
      CfnLayer.LifecycleEventConfigurationProperty.builder()

  public fun shutdownEventConfiguration(shutdownEventConfiguration: IResolvable) {
    cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration)
  }

  public
      fun shutdownEventConfiguration(shutdownEventConfiguration: CfnLayer.ShutdownEventConfigurationProperty) {
    cdkBuilder.shutdownEventConfiguration(shutdownEventConfiguration)
  }

  public fun build(): CfnLayer.LifecycleEventConfigurationProperty = cdkBuilder.build()
}
