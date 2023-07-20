@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobEntityDetectorConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.EntityDetectorConfigurationProperty.Builder =
      CfnJob.EntityDetectorConfigurationProperty.builder()

  private val _entityTypes: MutableList<String> = mutableListOf()

  public fun allowedStatistics(allowedStatistics: IResolvable) {
    cdkBuilder.allowedStatistics(allowedStatistics)
  }

  public fun allowedStatistics(allowedStatistics: CfnJob.AllowedStatisticsProperty) {
    cdkBuilder.allowedStatistics(allowedStatistics)
  }

  public fun entityTypes(vararg entityTypes: String) {
    _entityTypes.addAll(listOf(*entityTypes))
  }

  public fun entityTypes(entityTypes: Collection<String>) {
    _entityTypes.addAll(entityTypes)
  }

  public fun build(): CfnJob.EntityDetectorConfigurationProperty {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    return cdkBuilder.build()
  }
}
