@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps

@CdkDslMarker
public class CfnAnomalyMonitorPropsDsl {
  private val cdkBuilder: CfnAnomalyMonitorProps.Builder = CfnAnomalyMonitorProps.builder()

  private val _resourceTags: MutableList<Any> = mutableListOf()

  public fun monitorDimension(monitorDimension: String) {
    cdkBuilder.monitorDimension(monitorDimension)
  }

  public fun monitorName(monitorName: String) {
    cdkBuilder.monitorName(monitorName)
  }

  public fun monitorSpecification(monitorSpecification: String) {
    cdkBuilder.monitorSpecification(monitorSpecification)
  }

  public fun monitorType(monitorType: String) {
    cdkBuilder.monitorType(monitorType)
  }

  public fun resourceTags(vararg resourceTags: Any) {
    _resourceTags.addAll(listOf(*resourceTags))
  }

  public fun resourceTags(resourceTags: Collection<Any>) {
    _resourceTags.addAll(resourceTags)
  }

  public fun resourceTags(resourceTags: IResolvable) {
    cdkBuilder.resourceTags(resourceTags)
  }

  public fun build(): CfnAnomalyMonitorProps {
    if(_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
    return cdkBuilder.build()
  }
}
