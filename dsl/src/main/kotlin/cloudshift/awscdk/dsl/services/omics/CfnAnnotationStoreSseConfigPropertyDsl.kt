@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnAnnotationStore

@CdkDslMarker
public class CfnAnnotationStoreSseConfigPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.SseConfigProperty.Builder =
      CfnAnnotationStore.SseConfigProperty.builder()

  /**
   * @param keyArn An encryption key ARN.
   */
  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  /**
   * @param type The encryption type. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnnotationStore.SseConfigProperty = cdkBuilder.build()
}
