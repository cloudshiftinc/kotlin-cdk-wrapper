@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.amazon.awscdk.alexa.ask.CfnSkillProps

@CdkDslMarker
public class CfnSkillPropsDsl {
  private val cdkBuilder: CfnSkillProps.Builder = CfnSkillProps.builder()

  /**
   * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
   * with the Alexa service. 
   * Only Login with Amazon clients created through the  are supported. The client ID, client
   * secret, and refresh token are required.
   */
  public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  /**
   * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
   * with the Alexa service. 
   * Only Login with Amazon clients created through the  are supported. The client ID, client
   * secret, and refresh token are required.
   */
  public
      fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  /**
   * @param skillPackage Configuration for the skill package that contains the components of the
   * Alexa skill. 
   * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
   * skill. For more information about the skill package format, see the  .
   */
  public fun skillPackage(skillPackage: IResolvable) {
    cdkBuilder.skillPackage(skillPackage)
  }

  /**
   * @param skillPackage Configuration for the skill package that contains the components of the
   * Alexa skill. 
   * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
   * skill. For more information about the skill package format, see the  .
   */
  public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
    cdkBuilder.skillPackage(skillPackage)
  }

  /**
   * @param vendorId The vendor ID associated with the Amazon developer account that will host the
   * skill. 
   * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
   * the developer account associated with this vendor ID.
   */
  public fun vendorId(vendorId: String) {
    cdkBuilder.vendorId(vendorId)
  }

  public fun build(): CfnSkillProps = cdkBuilder.build()
}
