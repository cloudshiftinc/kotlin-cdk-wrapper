@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisStreamProps

@CdkDslMarker
public class KinesisStreamPropsDsl {
  private val cdkBuilder: KinesisStreamProps.Builder = KinesisStreamProps.builder()

  /**
   * @param message The message to send to the stream.
   * Must be a valid JSON text passed to the target stream.
   */
  public fun message(message: RuleTargetInput) {
    cdkBuilder.message(message)
  }

  /**
   * @param partitionKeyPath Partition Key Path for records sent to this stream.
   */
  public fun partitionKeyPath(partitionKeyPath: String) {
    cdkBuilder.partitionKeyPath(partitionKeyPath)
  }

  public fun build(): KinesisStreamProps = cdkBuilder.build()
}
