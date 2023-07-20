@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryDimensionMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.DimensionMappingProperty.Builder =
      CfnScheduledQuery.DimensionMappingProperty.builder()

  public fun dimensionValueType(dimensionValueType: String) {
    cdkBuilder.dimensionValueType(dimensionValueType)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnScheduledQuery.DimensionMappingProperty = cdkBuilder.build()
}
