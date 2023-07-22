@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleIotSiteWiseActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.IotSiteWiseActionProperty.Builder =
      CfnTopicRule.IotSiteWiseActionProperty.builder()

  private val _putAssetPropertyValueEntries: MutableList<Any> = mutableListOf()

  /**
   * @param putAssetPropertyValueEntries A list of asset property value entries. 
   */
  public fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any) {
    _putAssetPropertyValueEntries.addAll(listOf(*putAssetPropertyValueEntries))
  }

  /**
   * @param putAssetPropertyValueEntries A list of asset property value entries. 
   */
  public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: Collection<Any>) {
    _putAssetPropertyValueEntries.addAll(putAssetPropertyValueEntries)
  }

  /**
   * @param putAssetPropertyValueEntries A list of asset property value entries. 
   */
  public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
    cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
  }

  /**
   * @param roleArn The ARN of the role that grants AWS IoT permission to send an asset property
   * value to AWS IoT SiteWise. 
   * ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The trust policy can restrict access
   * to specific asset hierarchy paths.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.IotSiteWiseActionProperty {
    if(_putAssetPropertyValueEntries.isNotEmpty())
        cdkBuilder.putAssetPropertyValueEntries(_putAssetPropertyValueEntries)
    return cdkBuilder.build()
  }
}
