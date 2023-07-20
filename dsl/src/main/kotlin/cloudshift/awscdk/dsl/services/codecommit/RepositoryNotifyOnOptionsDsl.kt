@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents
import software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions
import software.amazon.awscdk.services.codestarnotifications.DetailType

@CdkDslMarker
public class RepositoryNotifyOnOptionsDsl {
  private val cdkBuilder: RepositoryNotifyOnOptions.Builder = RepositoryNotifyOnOptions.builder()

  private val _events: MutableList<RepositoryNotificationEvents> = mutableListOf()

  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun events(vararg events: RepositoryNotificationEvents) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<RepositoryNotificationEvents>) {
    _events.addAll(events)
  }

  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  public fun build(): RepositoryNotifyOnOptions {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    return cdkBuilder.build()
  }
}
