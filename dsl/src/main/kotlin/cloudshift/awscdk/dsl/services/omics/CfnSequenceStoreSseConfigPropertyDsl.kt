@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnSequenceStore

@CdkDslMarker
public class CfnSequenceStoreSseConfigPropertyDsl {
  private val cdkBuilder: CfnSequenceStore.SseConfigProperty.Builder =
      CfnSequenceStore.SseConfigProperty.builder()

  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSequenceStore.SseConfigProperty = cdkBuilder.build()
}
