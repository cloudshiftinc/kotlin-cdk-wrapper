@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.ProjectNotificationEvents
import software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions
import software.amazon.awscdk.services.codestarnotifications.DetailType

@CdkDslMarker
public class ProjectNotifyOnOptionsDsl {
  private val cdkBuilder: ProjectNotifyOnOptions.Builder = ProjectNotifyOnOptions.builder()

  private val _events: MutableList<ProjectNotificationEvents> = mutableListOf()

  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun events(vararg events: ProjectNotificationEvents) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<ProjectNotificationEvents>) {
    _events.addAll(events)
  }

  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun build(): ProjectNotifyOnOptions {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
