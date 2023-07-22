@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.constructs.Construct

/**
 * The `AWS::NimbleStudio::Studio` resource creates a new studio resource. In  , all other resources
 * are contained in a studio.
 *
 * When creating a studio, two IAM roles must be provided: the admin role and the user role. These
 * roles are assumed by your users when they log in to the  portal. The user role must have the
 * AmazonNimbleStudio-StudioUser managed policy attached for the portal to function properly. The Admin
 * Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function
 * properly.
 *
 * You can optionally specify an AWS Key Management Service key in the
 * StudioEncryptionConfiguration. In Nimble Studio, resource names, descriptions, initialization
 * scripts, and other data you provide are always encrypted at rest using an AWS Key Management Service
 * key. By default, this key is owned by AWS and managed on your behalf. You may provide your own AWS
 * Key Management Service key when calling CreateStudio to encrypt this data using a key that you own
 * and manage. When providing an AWS Key Management Service key during studio creation,  creates AWS
 * Key Management Service grants in your account to provide your studio user and admin roles access to
 * these AWS Key Management Service keys. If you delete this grant, the studio will no longer be
 * accessible to your portal users. If you delete the studio AWS Key Management Service key, your
 * studio will no longer be accessible.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnStudio cfnStudio = CfnStudio.Builder.create(this, "MyCfnStudio")
 * .adminRoleArn("adminRoleArn")
 * .displayName("displayName")
 * .studioName("studioName")
 * .userRoleArn("userRoleArn")
 * // the properties below are optional
 * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
 */
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
