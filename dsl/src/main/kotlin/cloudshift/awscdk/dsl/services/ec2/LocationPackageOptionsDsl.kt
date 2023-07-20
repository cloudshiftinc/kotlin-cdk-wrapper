@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.LocationPackageOptions

@CdkDslMarker
public class LocationPackageOptionsDsl {
  private val cdkBuilder: LocationPackageOptions.Builder = LocationPackageOptions.builder()

  private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
    _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
  }

  public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
    _serviceRestartHandles.addAll(serviceRestartHandles)
  }

  public fun build(): LocationPackageOptions {
    if(_serviceRestartHandles.isNotEmpty()) cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
    return cdkBuilder.build()
  }
}
