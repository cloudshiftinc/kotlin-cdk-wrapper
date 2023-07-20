@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemClientConfigurationsPropertyDsl {
  private val cdkBuilder: CfnFileSystem.ClientConfigurationsProperty.Builder =
      CfnFileSystem.ClientConfigurationsProperty.builder()

  private val _options: MutableList<String> = mutableListOf()

  public fun clients(clients: String) {
    cdkBuilder.clients(clients)
  }

  public fun options(vararg options: String) {
    _options.addAll(listOf(*options))
  }

  public fun options(options: Collection<String>) {
    _options.addAll(options)
  }

  public fun build(): CfnFileSystem.ClientConfigurationsProperty {
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    return cdkBuilder.build()
  }
}
