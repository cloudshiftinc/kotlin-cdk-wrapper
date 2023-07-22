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

  /**
   * @param filesLimit If provided, this structure imposes a limit on a number of files that should
   * be selected.
   */
  public fun filesLimit(filesLimit: IResolvable) {
    cdkBuilder.filesLimit(filesLimit)
  }

  /**
   * @param filesLimit If provided, this structure imposes a limit on a number of files that should
   * be selected.
   */
  public fun filesLimit(filesLimit: CfnDataset.FilesLimitProperty) {
    cdkBuilder.filesLimit(filesLimit)
  }

  /**
   * @param lastModifiedDateCondition If provided, this structure defines a date range for matching
   * Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
   */
  public fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable) {
    cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition)
  }

  /**
   * @param lastModifiedDateCondition If provided, this structure defines a date range for matching
   * Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
   */
  public
      fun lastModifiedDateCondition(lastModifiedDateCondition: CfnDataset.FilterExpressionProperty) {
    cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition)
  }

  /**
   * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
   * dataset to their definitions.
   */
  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  /**
   * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
   * dataset to their definitions.
   */
  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  /**
   * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
   * dataset to their definitions.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnDataset.PathOptionsProperty {
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
