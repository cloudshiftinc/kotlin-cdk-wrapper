@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.amazon.awscdk.services.ivschat.CfnRoomProps

@CdkDslMarker
public class CfnRoomPropsDsl {
  private val cdkBuilder: CfnRoomProps.Builder = CfnRoomProps.builder()

  private val _loggingConfigurationIdentifiers: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
   * the room.
   */
  public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String) {
    _loggingConfigurationIdentifiers.addAll(listOf(*loggingConfigurationIdentifiers))
  }

  /**
   * @param loggingConfigurationIdentifiers List of logging-configuration identifiers attached to
   * the room.
   */
  public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: Collection<String>) {
    _loggingConfigurationIdentifiers.addAll(loggingConfigurationIdentifiers)
  }

  /**
   * @param maximumMessageLength Maximum number of characters in a single message.
   * Messages are expected to be UTF-8 encoded and this limit applies specifically to
   * rune/code-point count, not number of bytes.
   */
  public fun maximumMessageLength(maximumMessageLength: Number) {
    cdkBuilder.maximumMessageLength(maximumMessageLength)
  }

  /**
   * @param maximumMessageRatePerSecond Maximum number of messages per second that can be sent to
   * the room (by all clients).
   */
  public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
    cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
  }

  /**
   * @param messageReviewHandler Configuration information for optional review of messages.
   */
  public fun messageReviewHandler(messageReviewHandler: IResolvable) {
    cdkBuilder.messageReviewHandler(messageReviewHandler)
  }

  /**
   * @param messageReviewHandler Configuration information for optional review of messages.
   */
  public fun messageReviewHandler(messageReviewHandler: CfnRoom.MessageReviewHandlerProperty) {
    cdkBuilder.messageReviewHandler(messageReviewHandler)
  }

  /**
   * @param name Room name.
   * The value does not need to be unique.
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

  public fun build(): CfnRoomProps {
    if(_loggingConfigurationIdentifiers.isNotEmpty())
        cdkBuilder.loggingConfigurationIdentifiers(_loggingConfigurationIdentifiers)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
