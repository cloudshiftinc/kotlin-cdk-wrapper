@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageExplainabilityPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ExplainabilityProperty.Builder =
      CfnModelPackage.ExplainabilityProperty.builder()

  public fun report(report: IResolvable) {
    cdkBuilder.report(report)
  }

  public fun report(report: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.report(report)
  }

  public fun build(): CfnModelPackage.ExplainabilityProperty = cdkBuilder.build()
}
