@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents
import software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions
import software.amazon.awscdk.services.codestarnotifications.DetailType

@CdkDslMarker
public class PipelineNotifyOnOptionsDsl {
  private val cdkBuilder: PipelineNotifyOnOptions.Builder = PipelineNotifyOnOptions.builder()

  private val _events: MutableList<PipelineNotificationEvents> = mutableListOf()

  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun events(vararg events: PipelineNotificationEvents) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<PipelineNotificationEvents>) {
    _events.addAll(events)
  }

  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun build(): PipelineNotifyOnOptions {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
