@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder =
      CfnVirtualNode.SubjectAlternativeNameMatchersProperty.builder()

  private val _exact: MutableList<String> = mutableListOf()

  public fun exact(vararg exact: String) {
    _exact.addAll(listOf(*exact))
  }

  public fun exact(exact: Collection<String>) {
    _exact.addAll(exact)
  }

  public fun build(): CfnVirtualNode.SubjectAlternativeNameMatchersProperty {
    if(_exact.isNotEmpty()) cdkBuilder.exact(_exact)
    return cdkBuilder.build()
  }
}
