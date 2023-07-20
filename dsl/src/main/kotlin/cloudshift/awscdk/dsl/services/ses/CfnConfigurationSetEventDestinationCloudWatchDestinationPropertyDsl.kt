@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@CdkDslMarker
public class CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
      = CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

  private val _dimensionConfigurations: MutableList<Any> = mutableListOf()

  public fun dimensionConfigurations(vararg dimensionConfigurations: Any) {
    _dimensionConfigurations.addAll(listOf(*dimensionConfigurations))
  }

  public fun dimensionConfigurations(dimensionConfigurations: Collection<Any>) {
    _dimensionConfigurations.addAll(dimensionConfigurations)
  }

  public fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
    cdkBuilder.dimensionConfigurations(dimensionConfigurations)
  }

  public fun build(): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
    if(_dimensionConfigurations.isNotEmpty())
        cdkBuilder.dimensionConfigurations(_dimensionConfigurations)
    return cdkBuilder.build()
  }
}
