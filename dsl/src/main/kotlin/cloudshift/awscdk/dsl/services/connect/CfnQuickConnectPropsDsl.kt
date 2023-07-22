@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps

@CdkDslMarker
public class CfnQuickConnectPropsDsl {
  private val cdkBuilder: CfnQuickConnectProps.Builder = CfnQuickConnectProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the quick connect.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param name The name of the quick connect. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param quickConnectConfig Contains information about the quick connect. 
   */
  public fun quickConnectConfig(quickConnectConfig: IResolvable) {
    cdkBuilder.quickConnectConfig(quickConnectConfig)
  }

  /**
   * @param quickConnectConfig Contains information about the quick connect. 
   */
  public fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty) {
    cdkBuilder.quickConnectConfig(quickConnectConfig)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnQuickConnectProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
