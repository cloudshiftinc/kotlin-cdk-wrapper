@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps

@CdkDslMarker
public class CfnDetectorModelPropsDsl {
  private val cdkBuilder: CfnDetectorModelProps.Builder = CfnDetectorModelProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param detectorModelDefinition Information that defines how a detector operates. 
   */
  public fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
    cdkBuilder.detectorModelDefinition(detectorModelDefinition)
  }

  /**
   * @param detectorModelDefinition Information that defines how a detector operates. 
   */
  public
      fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty) {
    cdkBuilder.detectorModelDefinition(detectorModelDefinition)
  }

  /**
   * @param detectorModelDescription A brief description of the detector model.
   */
  public fun detectorModelDescription(detectorModelDescription: String) {
    cdkBuilder.detectorModelDescription(detectorModelDescription)
  }

  /**
   * @param detectorModelName The name of the detector model.
   */
  public fun detectorModelName(detectorModelName: String) {
    cdkBuilder.detectorModelName(detectorModelName)
  }

  /**
   * @param evaluationMethod Information about the order in which events are evaluated and how
   * actions are executed.
   */
  public fun evaluationMethod(evaluationMethod: String) {
    cdkBuilder.evaluationMethod(evaluationMethod)
  }

  /**
   * @param key The value used to identify a detector instance.
   * When a device or system sends input, a new detector instance with a unique key value is
   * created. AWS IoT Events can continue to route input to its corresponding detector instance based
   * on this identifying information.
   *
   * This parameter uses a JSON-path expression to select the attribute-value pair in the message
   * payload that is used for identification. To route the message to the correct detector instance,
   * the device must send a message payload that contains the same attribute-value.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
   * operations. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
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

  public fun build(): CfnDetectorModelProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
