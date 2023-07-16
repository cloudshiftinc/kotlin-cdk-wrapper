@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnAutoScalingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAutoScalingConfiguration.Builder =
      CfnAutoScalingConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
    cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
  }

  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAutoScalingConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
