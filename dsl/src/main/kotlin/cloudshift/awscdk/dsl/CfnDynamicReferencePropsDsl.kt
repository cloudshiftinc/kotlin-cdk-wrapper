@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnDynamicReferenceProps
import software.amazon.awscdk.CfnDynamicReferenceService

@CdkDslMarker
public class CfnDynamicReferencePropsDsl {
  private val cdkBuilder: CfnDynamicReferenceProps.Builder = CfnDynamicReferenceProps.builder()

  /**
   * @param referenceKey The reference key of the dynamic reference. 
   */
  public fun referenceKey(referenceKey: String) {
    cdkBuilder.referenceKey(referenceKey)
  }

  /**
   * @param service The service to retrieve the dynamic reference from. 
   */
  public fun service(service: CfnDynamicReferenceService) {
    cdkBuilder.service(service)
  }

  public fun build(): CfnDynamicReferenceProps = cdkBuilder.build()
}
