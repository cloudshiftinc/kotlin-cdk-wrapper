@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions
import software.amazon.awscdk.services.cloudtrail.ManagementEventSources
import software.amazon.awscdk.services.cloudtrail.ReadWriteType

@CdkDslMarker
public class AddEventSelectorOptionsDsl {
  private val cdkBuilder: AddEventSelectorOptions.Builder = AddEventSelectorOptions.builder()

  private val _excludeManagementEventSources: MutableList<ManagementEventSources> = mutableListOf()

  /**
   * @param excludeManagementEventSources An optional list of service event sources from which you
   * do not want management events to be logged on your trail.
   */
  public fun excludeManagementEventSources(vararg
      excludeManagementEventSources: ManagementEventSources) {
    _excludeManagementEventSources.addAll(listOf(*excludeManagementEventSources))
  }

  /**
   * @param excludeManagementEventSources An optional list of service event sources from which you
   * do not want management events to be logged on your trail.
   */
  public
      fun excludeManagementEventSources(excludeManagementEventSources: Collection<ManagementEventSources>) {
    _excludeManagementEventSources.addAll(excludeManagementEventSources)
  }

  /**
   * @param includeManagementEvents Specifies whether the event selector includes management events
   * for the trail.
   */
  public fun includeManagementEvents(includeManagementEvents: Boolean) {
    cdkBuilder.includeManagementEvents(includeManagementEvents)
  }

  /**
   * @param readWriteType Specifies whether to log read-only events, write-only events, or all
   * events.
   */
  public fun readWriteType(readWriteType: ReadWriteType) {
    cdkBuilder.readWriteType(readWriteType)
  }

  public fun build(): AddEventSelectorOptions {
    if(_excludeManagementEventSources.isNotEmpty())
        cdkBuilder.excludeManagementEventSources(_excludeManagementEventSources)
    return cdkBuilder.build()
  }
}
