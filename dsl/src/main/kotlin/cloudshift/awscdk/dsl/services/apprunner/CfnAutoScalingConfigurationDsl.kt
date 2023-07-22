@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnAutoScalingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAutoScalingConfiguration.Builder =
      CfnAutoScalingConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The customer-provided auto scaling configuration name.
   *
   * It can be used in multiple revisions of a configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-autoscalingconfigurationname)
   * @param autoScalingConfigurationName The customer-provided auto scaling configuration name. 
   */
  public fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
    cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
  }

  /**
   * The maximum number of concurrent requests that an instance processes.
   *
   * If the number of concurrent requests exceeds this limit, App Runner scales the service up.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxconcurrency)
   * @param maxConcurrency The maximum number of concurrent requests that an instance processes. 
   */
  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  /**
   * The maximum number of instances that a service scales up to.
   *
   * At most `MaxSize` instances actively serve traffic for your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-maxsize)
   * @param maxSize The maximum number of instances that a service scales up to. 
   */
  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  /**
   * The minimum number of instances that App Runner provisions for a service.
   *
   * The service always has at least `MinSize` provisioned instances. Some of them actively serve
   * traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute
   * capacity reserve and are ready to be quickly activated. You pay for memory usage of all the
   * provisioned instances. You pay for CPU usage of only the active subset.
   *
   * App Runner temporarily doubles the number of provisioned instances during deployments, to
   * maintain the same capacity for both old and new code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-minsize)
   * @param minSize The minimum number of instances that App Runner provisions for a service. 
   */
  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
   * @param tags A list of metadata items that you can associate with your auto scaling
   * configuration resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of metadata items that you can associate with your auto scaling configuration resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-autoscalingconfiguration.html#cfn-apprunner-autoscalingconfiguration-tags)
   * @param tags A list of metadata items that you can associate with your auto scaling
   * configuration resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAutoScalingConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
