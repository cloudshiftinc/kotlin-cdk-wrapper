@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.Builder =
      CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.builder()

  private val _exact: MutableList<String> = mutableListOf()

  public fun exact(vararg exact: String) {
    _exact.addAll(listOf(*exact))
  }

  public fun exact(exact: Collection<String>) {
    _exact.addAll(exact)
  }

  public fun build(): CfnVirtualGateway.SubjectAlternativeNameMatchersProperty {
    if(_exact.isNotEmpty()) cdkBuilder.exact(_exact)
    return cdkBuilder.build()
  }
}
