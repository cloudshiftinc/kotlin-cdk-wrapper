@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.customresources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.customresources.SdkCallsPolicyOptions

@CdkDslMarker
public class SdkCallsPolicyOptionsDsl {
  private val cdkBuilder: SdkCallsPolicyOptions.Builder = SdkCallsPolicyOptions.builder()

  private val _resources: MutableList<String> = mutableListOf()

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun build(): SdkCallsPolicyOptions {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
