@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps

@CdkDslMarker
public class CfnEventIntegrationPropsDsl {
  private val cdkBuilder: CfnEventIntegrationProps.Builder = CfnEventIntegrationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The event integration description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
   */
  public fun eventBridgeBus(eventBridgeBus: String) {
    cdkBuilder.eventBridgeBus(eventBridgeBus)
  }

  /**
   * @param eventFilter The event integration filter. 
   */
  public fun eventFilter(eventFilter: IResolvable) {
    cdkBuilder.eventFilter(eventFilter)
  }

  /**
   * @param eventFilter The event integration filter. 
   */
  public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty) {
    cdkBuilder.eventFilter(eventFilter)
  }

  /**
   * @param name The name of the event integration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEventIntegrationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
