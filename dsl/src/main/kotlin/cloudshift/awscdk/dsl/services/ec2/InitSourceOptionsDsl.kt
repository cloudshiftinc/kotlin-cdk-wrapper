@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.InitSourceOptions

@CdkDslMarker
public class InitSourceOptionsDsl {
  private val cdkBuilder: InitSourceOptions.Builder = InitSourceOptions.builder()

  private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

  public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
    _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
  }

  public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
    _serviceRestartHandles.addAll(serviceRestartHandles)
  }

  public fun build(): InitSourceOptions {
    if(_serviceRestartHandles.isNotEmpty()) cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
    return cdkBuilder.build()
  }
}
