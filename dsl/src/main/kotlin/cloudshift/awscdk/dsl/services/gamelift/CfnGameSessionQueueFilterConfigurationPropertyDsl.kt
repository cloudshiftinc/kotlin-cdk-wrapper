@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@CdkDslMarker
public class CfnGameSessionQueueFilterConfigurationPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.FilterConfigurationProperty.Builder =
      CfnGameSessionQueue.FilterConfigurationProperty.builder()

  private val _allowedLocations: MutableList<String> = mutableListOf()

  /**
   * @param allowedLocations A list of locations to allow game session placement in, in the form of
   * AWS Region codes such as `us-west-2` .
   */
  public fun allowedLocations(vararg allowedLocations: String) {
    _allowedLocations.addAll(listOf(*allowedLocations))
  }

  /**
   * @param allowedLocations A list of locations to allow game session placement in, in the form of
   * AWS Region codes such as `us-west-2` .
   */
  public fun allowedLocations(allowedLocations: Collection<String>) {
    _allowedLocations.addAll(allowedLocations)
  }

  public fun build(): CfnGameSessionQueue.FilterConfigurationProperty {
    if(_allowedLocations.isNotEmpty()) cdkBuilder.allowedLocations(_allowedLocations)
    return cdkBuilder.build()
  }
}
