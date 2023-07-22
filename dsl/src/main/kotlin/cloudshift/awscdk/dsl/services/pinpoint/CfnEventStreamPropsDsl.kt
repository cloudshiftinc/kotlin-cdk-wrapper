@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps

@CdkDslMarker
public class CfnEventStreamPropsDsl {
  private val cdkBuilder: CfnEventStreamProps.Builder = CfnEventStreamProps.builder()

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that you want to
   * export data from. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or
   * Amazon Kinesis Data Firehose delivery stream that you want to publish event data to. 
   * For a Kinesis data stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
   * stream_name`
   *
   * For a Kinesis Data Firehose delivery stream, the ARN format is: `arn:aws:firehose: region :
   * account-id :deliverystream/ stream_name`
   */
  public fun destinationStreamArn(destinationStreamArn: String) {
    cdkBuilder.destinationStreamArn(destinationStreamArn)
  }

  /**
   * @param roleArn The AWS Identity and Access Management (IAM) role that authorizes Amazon
   * Pinpoint to publish event data to the stream in your AWS account. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnEventStreamProps = cdkBuilder.build()
}
