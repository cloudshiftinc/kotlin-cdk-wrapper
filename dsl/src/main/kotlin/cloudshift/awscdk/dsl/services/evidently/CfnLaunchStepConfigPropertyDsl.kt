@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch

@CdkDslMarker
public class CfnLaunchStepConfigPropertyDsl {
  private val cdkBuilder: CfnLaunch.StepConfigProperty.Builder =
      CfnLaunch.StepConfigProperty.builder()

  private val _groupWeights: MutableList<Any> = mutableListOf()

  private val _segmentOverrides: MutableList<Any> = mutableListOf()

  /**
   * @param groupWeights An array of structures that define how much launch traffic to allocate to
   * each launch group during this step of the launch. 
   */
  public fun groupWeights(vararg groupWeights: Any) {
    _groupWeights.addAll(listOf(*groupWeights))
  }

  /**
   * @param groupWeights An array of structures that define how much launch traffic to allocate to
   * each launch group during this step of the launch. 
   */
  public fun groupWeights(groupWeights: Collection<Any>) {
    _groupWeights.addAll(groupWeights)
  }

  /**
   * @param groupWeights An array of structures that define how much launch traffic to allocate to
   * each launch group during this step of the launch. 
   */
  public fun groupWeights(groupWeights: IResolvable) {
    cdkBuilder.groupWeights(groupWeights)
  }

  /**
   * @param segmentOverrides An array of structures that you can use to specify different traffic
   * splits for one or more audience *segments* .
   * A segment is a portion of your audience that share one or more characteristics. Examples could
   * be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other
   * criteria that your application collects, such as age.
   *
   * For more information, see [Use segments to focus your
   * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
   * .
   */
  public fun segmentOverrides(vararg segmentOverrides: Any) {
    _segmentOverrides.addAll(listOf(*segmentOverrides))
  }

  /**
   * @param segmentOverrides An array of structures that you can use to specify different traffic
   * splits for one or more audience *segments* .
   * A segment is a portion of your audience that share one or more characteristics. Examples could
   * be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other
   * criteria that your application collects, such as age.
   *
   * For more information, see [Use segments to focus your
   * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
   * .
   */
  public fun segmentOverrides(segmentOverrides: Collection<Any>) {
    _segmentOverrides.addAll(segmentOverrides)
  }

  /**
   * @param segmentOverrides An array of structures that you can use to specify different traffic
   * splits for one or more audience *segments* .
   * A segment is a portion of your audience that share one or more characteristics. Examples could
   * be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other
   * criteria that your application collects, such as age.
   *
   * For more information, see [Use segments to focus your
   * audience](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html)
   * .
   */
  public fun segmentOverrides(segmentOverrides: IResolvable) {
    cdkBuilder.segmentOverrides(segmentOverrides)
  }

  /**
   * @param startTime The date and time to start this step of the launch. 
   * Use UTC format, `yyyy-MM-ddTHH:mm:ssZ` . For example, `2025-11-25T23:59:59Z`
   */
  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnLaunch.StepConfigProperty {
    if(_groupWeights.isNotEmpty()) cdkBuilder.groupWeights(_groupWeights)
    if(_segmentOverrides.isNotEmpty()) cdkBuilder.segmentOverrides(_segmentOverrides)
    return cdkBuilder.build()
  }
}
