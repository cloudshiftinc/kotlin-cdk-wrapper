@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisStream
import software.amazon.awscdk.services.kinesis.IStream

@CdkDslMarker
public class KinesisStreamDsl(
  arg0: IStream,
) {
  private val cdkBuilder: KinesisStream.Builder = KinesisStream.Builder.create(arg0)

  public fun message(message: RuleTargetInput) {
    cdkBuilder.message(message)
  }

  public fun partitionKeyPath(partitionKeyPath: String) {
    cdkBuilder.partitionKeyPath(partitionKeyPath)
  }

  public fun build(): KinesisStream = cdkBuilder.build()
}
