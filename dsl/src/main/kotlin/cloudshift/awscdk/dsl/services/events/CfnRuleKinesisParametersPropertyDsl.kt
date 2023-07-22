@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

/**
 * This object enables you to specify a JSON path to extract from the event and use as the partition
 * key for the Amazon Kinesis data stream, so that you can control the shard to which the event goes.
 *
 * If you do not include this parameter, the default is to use the `eventId` as the partition key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * KinesisParametersProperty kinesisParametersProperty = KinesisParametersProperty.builder()
 * .partitionKeyPath("partitionKeyPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html)
 */
@CdkDslMarker
public class CfnRuleKinesisParametersPropertyDsl {
  private val cdkBuilder: CfnRule.KinesisParametersProperty.Builder =
      CfnRule.KinesisParametersProperty.builder()

  /**
   * @param partitionKeyPath The JSON path to be extracted from the event and used as the partition
   * key. 
   * For more information, see [Amazon Kinesis Streams Key
   * Concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key) in the
   * *Amazon Kinesis Streams Developer Guide* .
   */
  public fun partitionKeyPath(partitionKeyPath: String) {
    cdkBuilder.partitionKeyPath(partitionKeyPath)
  }

  public fun build(): CfnRule.KinesisParametersProperty = cdkBuilder.build()
}
