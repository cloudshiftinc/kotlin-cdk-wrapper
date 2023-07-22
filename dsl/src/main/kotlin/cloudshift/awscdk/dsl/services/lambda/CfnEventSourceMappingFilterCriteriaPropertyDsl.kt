@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingFilterCriteriaPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.FilterCriteriaProperty.Builder =
      CfnEventSourceMapping.FilterCriteriaProperty.builder()

  private val _filters: MutableList<Any> = mutableListOf()

  /**
   * @param filters A list of filters.
   */
  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters A list of filters.
   */
  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  /**
   * @param filters A list of filters.
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun build(): CfnEventSourceMapping.FilterCriteriaProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
