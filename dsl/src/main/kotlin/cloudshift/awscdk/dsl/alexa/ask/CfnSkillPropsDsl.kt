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

  public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  public
      fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
    cdkBuilder.authenticationConfiguration(authenticationConfiguration)
  }

  public fun skillPackage(skillPackage: IResolvable) {
    cdkBuilder.skillPackage(skillPackage)
  }

  public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
    cdkBuilder.skillPackage(skillPackage)
  }

  public fun vendorId(vendorId: String) {
    cdkBuilder.vendorId(vendorId)
  }

  public fun build(): CfnSkillProps = cdkBuilder.build()
}
