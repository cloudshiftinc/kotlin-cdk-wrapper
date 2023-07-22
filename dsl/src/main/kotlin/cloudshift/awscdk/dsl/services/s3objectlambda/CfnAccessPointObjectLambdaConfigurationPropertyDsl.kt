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

/**
 * A configuration used when creating an Object Lambda Access Point.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * Object contentTransformation;
 * ObjectLambdaConfigurationProperty objectLambdaConfigurationProperty =
 * ObjectLambdaConfigurationProperty.builder()
 * .supportingAccessPoint("supportingAccessPoint")
 * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
 * .actions(List.of("actions"))
 * .contentTransformation(contentTransformation)
 * .build()))
 * // the properties below are optional
 * .allowedFeatures(List.of("allowedFeatures"))
 * .cloudWatchMetricsEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-objectlambdaconfiguration.html)
 */
@CdkDslMarker
public class CfnAccessPointObjectLambdaConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder =
      CfnAccessPoint.ObjectLambdaConfigurationProperty.builder()

  private val _allowedFeatures: MutableList<String> = mutableListOf()

  private val _transformationConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param allowedFeatures A container for allowed features.
   * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
   * `HeadObject-PartNumber` .
   */
  public fun allowedFeatures(vararg allowedFeatures: String) {
    _allowedFeatures.addAll(listOf(*allowedFeatures))
  }

  /**
   * @param allowedFeatures A container for allowed features.
   * Valid inputs are `GetObject-Range` , `GetObject-PartNumber` , `HeadObject-Range` , and
   * `HeadObject-PartNumber` .
   */
  public fun allowedFeatures(allowedFeatures: Collection<String>) {
    _allowedFeatures.addAll(allowedFeatures)
  }

  /**
   * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics configuration is
   * enabled.
   */
  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  /**
   * @param cloudWatchMetricsEnabled A container for whether the CloudWatch metrics configuration is
   * enabled.
   */
  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  /**
   * @param supportingAccessPoint Standard access point associated with the Object Lambda Access
   * Point. 
   */
  public fun supportingAccessPoint(supportingAccessPoint: String) {
    cdkBuilder.supportingAccessPoint(supportingAccessPoint)
  }

  /**
   * @param transformationConfigurations A container for transformation configurations for an Object
   * Lambda Access Point. 
   */
  public fun transformationConfigurations(vararg transformationConfigurations: Any) {
    _transformationConfigurations.addAll(listOf(*transformationConfigurations))
  }

  /**
   * @param transformationConfigurations A container for transformation configurations for an Object
   * Lambda Access Point. 
   */
  public fun transformationConfigurations(transformationConfigurations: Collection<Any>) {
    _transformationConfigurations.addAll(transformationConfigurations)
  }

  /**
   * @param transformationConfigurations A container for transformation configurations for an Object
   * Lambda Access Point. 
   */
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
