@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.constructs.Construct

/**
 * The `AWS::NimbleStudio::StreamingImage` resource creates a streaming image in a studio.
 *
 * A streaming image defines the operating system and software to be used in an  streaming session.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnStreamingImage cfnStreamingImage = CfnStreamingImage.Builder.create(this,
 * "MyCfnStreamingImage")
 * .ec2ImageId("ec2ImageId")
 * .name("name")
 * .studioId("studioId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html)
 */
@CdkDslMarker
public class CfnStreamingImageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStreamingImage.Builder = CfnStreamingImage.Builder.create(scope, id)

  /**
   * A human-readable description of the streaming image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
   * @param description A human-readable description of the streaming image. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of an EC2 machine image with which to create the streaming image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
   * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image. 
   */
  public fun ec2ImageId(ec2ImageId: String) {
    cdkBuilder.ec2ImageId(ec2ImageId)
  }

  /**
   * A friendly name for a streaming image resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
   * @param name A friendly name for a streaming image resource. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The unique identifier for a studio resource.
   *
   * In Nimble Studio , all other resources are contained in a studio resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
   * @param studioId The unique identifier for a studio resource. 
   */
  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnStreamingImage = cdkBuilder.build()
}
