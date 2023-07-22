@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Container image configuration object for the monitoring job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringAppSpecificationProperty monitoringAppSpecificationProperty =
 * MonitoringAppSpecificationProperty.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .postAnalyticsProcessorSourceUri("postAnalyticsProcessorSourceUri")
 * .recordPreprocessorSourceUri("recordPreprocessorSourceUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringappspecification.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleMonitoringAppSpecificationPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringAppSpecificationProperty.Builder =
      CfnMonitoringSchedule.MonitoringAppSpecificationProperty.builder()

  private val _containerArguments: MutableList<String> = mutableListOf()

  private val _containerEntrypoint: MutableList<String> = mutableListOf()

  /**
   * @param containerArguments An array of arguments for the container used to run the monitoring
   * job.
   */
  public fun containerArguments(vararg containerArguments: String) {
    _containerArguments.addAll(listOf(*containerArguments))
  }

  /**
   * @param containerArguments An array of arguments for the container used to run the monitoring
   * job.
   */
  public fun containerArguments(containerArguments: Collection<String>) {
    _containerArguments.addAll(containerArguments)
  }

  /**
   * @param containerEntrypoint Specifies the entrypoint for a container used to run the monitoring
   * job.
   */
  public fun containerEntrypoint(vararg containerEntrypoint: String) {
    _containerEntrypoint.addAll(listOf(*containerEntrypoint))
  }

  /**
   * @param containerEntrypoint Specifies the entrypoint for a container used to run the monitoring
   * job.
   */
  public fun containerEntrypoint(containerEntrypoint: Collection<String>) {
    _containerEntrypoint.addAll(containerEntrypoint)
  }

  /**
   * @param imageUri The container image to be run by the monitoring job. 
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  /**
   * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after
   * analysis has been performed.
   * Applicable only for the built-in (first party) containers.
   */
  public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
    cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
  }

  /**
   * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row prior to
   * running analysis.
   * It can base64 decode the payload and convert it into a flatted json so that the built-in
   * container can use the converted data. Applicable only for the built-in (first party) containers.
   */
  public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
    cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringAppSpecificationProperty {
    if(_containerArguments.isNotEmpty()) cdkBuilder.containerArguments(_containerArguments)
    if(_containerEntrypoint.isNotEmpty()) cdkBuilder.containerEntrypoint(_containerEntrypoint)
    return cdkBuilder.build()
  }
}
