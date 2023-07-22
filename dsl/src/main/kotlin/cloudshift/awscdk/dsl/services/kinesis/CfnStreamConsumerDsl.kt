@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.constructs.Construct

@CdkDslMarker
public class CfnStreamConsumerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStreamConsumer.Builder = CfnStreamConsumer.Builder.create(scope, id)

  /**
   * The name of the consumer is something you choose when you register the consumer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
   * @param consumerName The name of the consumer is something you choose when you register the
   * consumer. 
   */
  public fun consumerName(consumerName: String) {
    cdkBuilder.consumerName(consumerName)
  }

  /**
   * The ARN of the stream with which you registered the consumer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
   * @param streamArn The ARN of the stream with which you registered the consumer. 
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStreamConsumer = cdkBuilder.build()
}
