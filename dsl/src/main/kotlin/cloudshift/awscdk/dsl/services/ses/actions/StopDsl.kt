@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.Stop
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class StopDsl {
  private val cdkBuilder: Stop.Builder = Stop.Builder.create()

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Stop = cdkBuilder.build()
}
