@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnEventStream

@CdkDslMarker
public class CfnEventStreamDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnEventStream.DestinationDetailsProperty.Builder =
      CfnEventStream.DestinationDetailsProperty.builder()

  /**
   * @param status The status of enabling the Kinesis stream as a destination for export. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param uri The StreamARN of the destination to deliver profile events to. 
   * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnEventStream.DestinationDetailsProperty = cdkBuilder.build()
}
