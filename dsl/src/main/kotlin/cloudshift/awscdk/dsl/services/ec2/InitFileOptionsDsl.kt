@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitFileOptions
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle

@CdkDslMarker
public class InitFileOptionsDsl {
  private val cdkBuilder: InitFileOptions.Builder = InitFileOptions.builder()

  private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

  public fun base64Encoded(base64Encoded: Boolean) {
    cdkBuilder.base64Encoded(base64Encoded)
  }

  public fun group(group: String) {
    cdkBuilder.group(group)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
    _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
  }

  public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
    _serviceRestartHandles.addAll(serviceRestartHandles)
  }

  public fun build(): InitFileOptions {
    if(_serviceRestartHandles.isNotEmpty()) cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
    return cdkBuilder.build()
  }
}
