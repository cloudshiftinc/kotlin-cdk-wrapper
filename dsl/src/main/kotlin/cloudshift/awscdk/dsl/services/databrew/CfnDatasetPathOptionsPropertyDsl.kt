@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetPathOptionsPropertyDsl {
  private val cdkBuilder: CfnDataset.PathOptionsProperty.Builder =
      CfnDataset.PathOptionsProperty.builder()

  private val _parameters: MutableList<Any> = mutableListOf()

  public fun filesLimit(filesLimit: IResolvable) {
    cdkBuilder.filesLimit(filesLimit)
  }

  public fun filesLimit(filesLimit: CfnDataset.FilesLimitProperty) {
    cdkBuilder.filesLimit(filesLimit)
  }

  public fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable) {
    cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition)
  }

  public
      fun lastModifiedDateCondition(lastModifiedDateCondition: CfnDataset.FilterExpressionProperty) {
    cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition)
  }

  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnDataset.PathOptionsProperty {
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
