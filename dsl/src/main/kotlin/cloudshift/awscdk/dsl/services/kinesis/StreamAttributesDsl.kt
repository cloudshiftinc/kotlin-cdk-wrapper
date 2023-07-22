@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.StreamAttributes
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class StreamAttributesDsl {
  private val cdkBuilder: StreamAttributes.Builder = StreamAttributes.builder()

  /**
   * @param encryptionKey The KMS key securing the contents of the stream if encryption is enabled.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param streamArn The ARN of the stream. 
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): StreamAttributes = cdkBuilder.build()
}
