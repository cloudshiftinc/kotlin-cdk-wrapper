@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.oam.CfnLinkProps

@CdkDslMarker
public class CfnLinkPropsDsl {
  private val cdkBuilder: CfnLinkProps.Builder = CfnLinkProps.builder()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  public fun labelTemplate(labelTemplate: String) {
    cdkBuilder.labelTemplate(labelTemplate)
  }

  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  public fun sinkIdentifier(sinkIdentifier: String) {
    cdkBuilder.sinkIdentifier(sinkIdentifier)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnLinkProps {
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    return cdkBuilder.build()
  }
}
