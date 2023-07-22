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
import software.constructs.Construct

/**
 * Creates an event integration.
 *
 * You provide a name, description, and a reference to an Amazon EventBridge bus in your account and
 * a partner event source that will push events to that bus. No objects are created in your account,
 * only metadata that is persisted on the EventIntegration control plane.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * CfnEventIntegration cfnEventIntegration = CfnEventIntegration.Builder.create(this,
 * "MyCfnEventIntegration")
 * .eventBridgeBus("eventBridgeBus")
 * .eventFilter(EventFilterProperty.builder()
 * .source("source")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html)
 */
@CdkDslMarker
public class CfnEventIntegrationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEventIntegration.Builder = CfnEventIntegration.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The event integration description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-description)
   * @param description The event integration description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Amazon EventBridge bus for the event integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventbridgebus)
   * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
   */
  public fun eventBridgeBus(eventBridgeBus: String) {
    cdkBuilder.eventBridgeBus(eventBridgeBus)
  }

  /**
   * The event integration filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
   * @param eventFilter The event integration filter. 
   */
  public fun eventFilter(eventFilter: IResolvable) {
    cdkBuilder.eventFilter(eventFilter)
  }

  /**
   * The event integration filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
   * @param eventFilter The event integration filter. 
   */
  public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty) {
    cdkBuilder.eventFilter(eventFilter)
  }

  /**
   * The name of the event integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-name)
   * @param name The name of the event integration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEventIntegration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
