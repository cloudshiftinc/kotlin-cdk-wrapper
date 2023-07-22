@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

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
