@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRelativeDatesFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.RelativeDatesFilterProperty.Builder =
      CfnTemplate.RelativeDatesFilterProperty.builder()

  public fun anchorDateConfiguration(anchorDateConfiguration: IResolvable) {
    cdkBuilder.anchorDateConfiguration(anchorDateConfiguration)
  }

  public
      fun anchorDateConfiguration(anchorDateConfiguration: CfnTemplate.AnchorDateConfigurationProperty) {
    cdkBuilder.anchorDateConfiguration(anchorDateConfiguration)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun excludePeriodConfiguration(excludePeriodConfiguration: IResolvable) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  public
      fun excludePeriodConfiguration(excludePeriodConfiguration: CfnTemplate.ExcludePeriodConfigurationProperty) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  public fun minimumGranularity(minimumGranularity: String) {
    cdkBuilder.minimumGranularity(minimumGranularity)
  }

  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun relativeDateType(relativeDateType: String) {
    cdkBuilder.relativeDateType(relativeDateType)
  }

  public fun relativeDateValue(relativeDateValue: Number) {
    cdkBuilder.relativeDateValue(relativeDateValue)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.RelativeDatesFilterProperty = cdkBuilder.build()
}
