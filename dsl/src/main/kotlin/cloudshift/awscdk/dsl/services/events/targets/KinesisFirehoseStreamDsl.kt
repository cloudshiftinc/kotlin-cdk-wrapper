@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class KinesisFirehoseStreamDsl(
  arg0: CfnDeliveryStream,
) {
  private val cdkBuilder: KinesisFirehoseStream.Builder = KinesisFirehoseStream.Builder.create(arg0)

  public fun message(message: RuleTargetInput) {
    cdkBuilder.message(message)
  }

  public fun build(): KinesisFirehoseStream = cdkBuilder.build()
}
