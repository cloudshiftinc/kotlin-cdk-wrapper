@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.constructs.Construct

@CdkDslMarker
public class CfnStudioDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStudio.Builder = CfnStudio.Builder.create(scope, id)

  /**
   * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
   * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble Studio
   * portal. 
   */
  public fun adminRoleArn(adminRoleArn: String) {
    cdkBuilder.adminRoleArn(adminRoleArn)
  }

  /**
   * A friendly name for the studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
   * @param displayName A friendly name for the studio. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * Configuration of the encryption method that is used for the studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
   * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
   * the studio. 
   */
  public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
    cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
  }

  /**
   * Configuration of the encryption method that is used for the studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
   * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
   * the studio. 
   */
  public
      fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty) {
    cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration)
  }

  /**
   * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
   * @param studioName The name of the studio, as included in the URL when accessing it in the
   * Nimble Studio portal. 
   */
  public fun studioName(studioName: String) {
    cdkBuilder.studioName(studioName)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The IAM role that studio users assume when logging in to the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
   * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
   * portal. 
   */
  public fun userRoleArn(userRoleArn: String) {
    cdkBuilder.userRoleArn(userRoleArn)
  }

  public fun build(): CfnStudio = cdkBuilder.build()
}
