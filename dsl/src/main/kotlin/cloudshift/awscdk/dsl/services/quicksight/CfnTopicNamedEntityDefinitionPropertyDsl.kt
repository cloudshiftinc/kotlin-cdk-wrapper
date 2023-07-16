@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicNamedEntityDefinitionPropertyDsl {
  private val cdkBuilder: CfnTopic.NamedEntityDefinitionProperty.Builder =
      CfnTopic.NamedEntityDefinitionProperty.builder()

  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  public fun metric(metric: CfnTopic.NamedEntityDefinitionMetricProperty) {
    cdkBuilder.metric(metric)
  }

  public fun propertyName(propertyName: String) {
    cdkBuilder.propertyName(propertyName)
  }

  public fun propertyRole(propertyRole: String) {
    cdkBuilder.propertyRole(propertyRole)
  }

  public fun propertyUsage(propertyUsage: String) {
    cdkBuilder.propertyUsage(propertyUsage)
  }

  public fun build(): CfnTopic.NamedEntityDefinitionProperty = cdkBuilder.build()
}
