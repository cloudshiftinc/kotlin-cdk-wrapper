@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.StopProps
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class StopPropsDsl {
  private val cdkBuilder: StopProps.Builder = StopProps.builder()

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): StopProps = cdkBuilder.build()
}
