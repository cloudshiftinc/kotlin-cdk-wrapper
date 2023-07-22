@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeSubjectAlternativeNamesPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.SubjectAlternativeNamesProperty.Builder =
      CfnVirtualNode.SubjectAlternativeNamesProperty.builder()

  /**
   * @param match An object that represents the criteria for determining a SANs match. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match An object that represents the criteria for determining a SANs match. 
   */
  public fun match(match: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
    cdkBuilder.match(match)
  }

  public fun build(): CfnVirtualNode.SubjectAlternativeNamesProperty = cdkBuilder.build()
}
