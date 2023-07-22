@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnGroupProps

@CdkDslMarker
public class CfnGroupPropsDsl {
  private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

  private val _tags: MutableList<Any> = mutableListOf()

  /**
   * @param filterExpression The filter expression defining the parameters to include traces.
   */
  public fun filterExpression(filterExpression: String) {
    cdkBuilder.filterExpression(filterExpression)
  }

  /**
   * @param groupName The unique case-sensitive name of the group. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param insightsConfiguration The structure containing configurations related to insights.
   * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
   * disable insights for the group.
   * * The NotificationsEnabled boolean can be set to true to enable insights notifications through
   * Amazon EventBridge for the group.
   */
  public fun insightsConfiguration(insightsConfiguration: IResolvable) {
    cdkBuilder.insightsConfiguration(insightsConfiguration)
  }

  /**
   * @param insightsConfiguration The structure containing configurations related to insights.
   * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
   * disable insights for the group.
   * * The NotificationsEnabled boolean can be set to true to enable insights notifications through
   * Amazon EventBridge for the group.
   */
  public fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty) {
    cdkBuilder.insightsConfiguration(insightsConfiguration)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(vararg tags: Any) {
    _tags.addAll(listOf(*tags))
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: Collection<Any>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
