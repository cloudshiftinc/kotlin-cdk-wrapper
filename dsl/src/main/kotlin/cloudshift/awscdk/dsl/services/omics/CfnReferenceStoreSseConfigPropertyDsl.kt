@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnReferenceStore

@CdkDslMarker
public class CfnReferenceStoreSseConfigPropertyDsl {
  private val cdkBuilder: CfnReferenceStore.SseConfigProperty.Builder =
      CfnReferenceStore.SseConfigProperty.builder()

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

  public fun build(): CfnReferenceStore.SseConfigProperty = cdkBuilder.build()
}
