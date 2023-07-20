@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.EmailEncoding
import software.amazon.awscdk.services.ses.actions.Sns
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class SnsDsl {
  private val cdkBuilder: Sns.Builder = Sns.Builder.create()

  public fun encoding(encoding: EmailEncoding) {
    cdkBuilder.encoding(encoding)
  }

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Sns = cdkBuilder.build()
}
