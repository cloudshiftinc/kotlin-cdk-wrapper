@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The initial capacity configuration per worker.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * InitialCapacityConfigProperty initialCapacityConfigProperty =
 * InitialCapacityConfigProperty.builder()
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .workerCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-initialcapacityconfig.html)
 */
@CdkDslMarker
public class CfnApplicationInitialCapacityConfigPropertyDsl {
  private val cdkBuilder: CfnApplication.InitialCapacityConfigProperty.Builder =
      CfnApplication.InitialCapacityConfigProperty.builder()

  /**
   * @param workerConfiguration The resource configuration of the initial capacity configuration. 
   */
  public fun workerConfiguration(workerConfiguration: IResolvable) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  /**
   * @param workerConfiguration The resource configuration of the initial capacity configuration. 
   */
  public fun workerConfiguration(workerConfiguration: CfnApplication.WorkerConfigurationProperty) {
    cdkBuilder.workerConfiguration(workerConfiguration)
  }

  /**
   * @param workerCount The number of workers in the initial capacity configuration. 
   * *Minimum* : 1
   *
   * *Maximum* : 1000000
   */
  public fun workerCount(workerCount: Number) {
    cdkBuilder.workerCount(workerCount)
  }

  public fun build(): CfnApplication.InitialCapacityConfigProperty = cdkBuilder.build()
}
