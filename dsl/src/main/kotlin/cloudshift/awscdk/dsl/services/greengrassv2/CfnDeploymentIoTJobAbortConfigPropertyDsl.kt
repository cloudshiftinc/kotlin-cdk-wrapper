@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobAbortConfigPropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobAbortConfigProperty.Builder =
      CfnDeployment.IoTJobAbortConfigProperty.builder()

  private val _criteriaList: MutableList<Any> = mutableListOf()

  public fun criteriaList(vararg criteriaList: Any) {
    _criteriaList.addAll(listOf(*criteriaList))
  }

  public fun criteriaList(criteriaList: Collection<Any>) {
    _criteriaList.addAll(criteriaList)
  }

  public fun criteriaList(criteriaList: IResolvable) {
    cdkBuilder.criteriaList(criteriaList)
  }

  public fun build(): CfnDeployment.IoTJobAbortConfigProperty {
    if(_criteriaList.isNotEmpty()) cdkBuilder.criteriaList(_criteriaList)
    return cdkBuilder.build()
  }
}
