@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicNegativeFormatPropertyDsl {
  private val cdkBuilder: CfnTopic.NegativeFormatProperty.Builder =
      CfnTopic.NegativeFormatProperty.builder()

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnTopic.NegativeFormatProperty = cdkBuilder.build()
}
