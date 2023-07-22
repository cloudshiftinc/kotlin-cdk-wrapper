@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.finspace.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentSuperuserParametersPropertyDsl {
  private val cdkBuilder: CfnEnvironment.SuperuserParametersProperty.Builder =
      CfnEnvironment.SuperuserParametersProperty.builder()

  /**
   * @param emailAddress The email address of the superuser.
   */
  public fun emailAddress(emailAddress: String) {
    cdkBuilder.emailAddress(emailAddress)
  }

  /**
   * @param firstName The first name of the superuser.
   */
  public fun firstName(firstName: String) {
    cdkBuilder.firstName(firstName)
  }

  /**
   * @param lastName The last name of the superuser.
   */
  public fun lastName(lastName: String) {
    cdkBuilder.lastName(lastName)
  }

  public fun build(): CfnEnvironment.SuperuserParametersProperty = cdkBuilder.build()
}
