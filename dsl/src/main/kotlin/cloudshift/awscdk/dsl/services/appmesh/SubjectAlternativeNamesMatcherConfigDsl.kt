@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig

@CdkDslMarker
public class SubjectAlternativeNamesMatcherConfigDsl {
  private val cdkBuilder: SubjectAlternativeNamesMatcherConfig.Builder =
      SubjectAlternativeNamesMatcherConfig.builder()

  /**
   * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative names
   * secured by the certificate. 
   */
  public
      fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl()
    builder.apply(subjectAlternativeNamesMatch)
    cdkBuilder.subjectAlternativeNamesMatch(builder.build())
  }

  /**
   * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative names
   * secured by the certificate. 
   */
  public
      fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
    cdkBuilder.subjectAlternativeNamesMatch(subjectAlternativeNamesMatch)
  }

  public fun build(): SubjectAlternativeNamesMatcherConfig = cdkBuilder.build()
}
