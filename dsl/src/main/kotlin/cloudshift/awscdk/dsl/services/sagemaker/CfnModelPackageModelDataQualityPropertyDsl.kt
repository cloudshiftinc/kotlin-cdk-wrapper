@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageModelDataQualityPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelDataQualityProperty.Builder =
      CfnModelPackage.ModelDataQualityProperty.builder()

  /**
   * @param constraints Data quality constraints for a model.
   */
  public fun constraints(constraints: IResolvable) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param constraints Data quality constraints for a model.
   */
  public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param statistics Data quality statistics for a model.
   */
  public fun statistics(statistics: IResolvable) {
    cdkBuilder.statistics(statistics)
  }

  /**
   * @param statistics Data quality statistics for a model.
   */
  public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.statistics(statistics)
  }

  public fun build(): CfnModelPackage.ModelDataQualityProperty = cdkBuilder.build()
}
