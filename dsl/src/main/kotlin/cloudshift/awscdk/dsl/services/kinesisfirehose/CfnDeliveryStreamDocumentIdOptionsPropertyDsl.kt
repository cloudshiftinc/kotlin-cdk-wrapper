@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamDocumentIdOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.DocumentIdOptionsProperty.Builder =
      CfnDeliveryStream.DocumentIdOptionsProperty.builder()

  public fun defaultDocumentIdFormat(defaultDocumentIdFormat: String) {
    cdkBuilder.defaultDocumentIdFormat(defaultDocumentIdFormat)
  }

  public fun build(): CfnDeliveryStream.DocumentIdOptionsProperty = cdkBuilder.build()
}
