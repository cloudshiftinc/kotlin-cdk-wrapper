@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointObjectLambdaConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder =
      CfnAccessPoint.ObjectLambdaConfigurationProperty.builder()

  private val _allowedFeatures: MutableList<String> = mutableListOf()

  private val _transformationConfigurations: MutableList<Any> = mutableListOf()

  public fun allowedFeatures(vararg allowedFeatures: String) {
    _allowedFeatures.addAll(listOf(*allowedFeatures))
  }

  public fun allowedFeatures(allowedFeatures: Collection<String>) {
    _allowedFeatures.addAll(allowedFeatures)
  }

  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  public fun supportingAccessPoint(supportingAccessPoint: String) {
    cdkBuilder.supportingAccessPoint(supportingAccessPoint)
  }

  public fun transformationConfigurations(vararg transformationConfigurations: Any) {
    _transformationConfigurations.addAll(listOf(*transformationConfigurations))
  }

  public fun transformationConfigurations(transformationConfigurations: Collection<Any>) {
    _transformationConfigurations.addAll(transformationConfigurations)
  }

  public fun transformationConfigurations(transformationConfigurations: IResolvable) {
    cdkBuilder.transformationConfigurations(transformationConfigurations)
  }

  public fun build(): CfnAccessPoint.ObjectLambdaConfigurationProperty {
    if(_allowedFeatures.isNotEmpty()) cdkBuilder.allowedFeatures(_allowedFeatures)
    if(_transformationConfigurations.isNotEmpty())
        cdkBuilder.transformationConfigurations(_transformationConfigurations)
    return cdkBuilder.build()
  }
}
