@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps

@CdkDslMarker
public class CfnCodeSigningConfigPropsDsl {
  private val cdkBuilder: CfnCodeSigningConfigProps.Builder = CfnCodeSigningConfigProps.builder()

  /**
   * @param allowedPublishers List of allowed publishers. 
   */
  public fun allowedPublishers(allowedPublishers: IResolvable) {
    cdkBuilder.allowedPublishers(allowedPublishers)
  }

  /**
   * @param allowedPublishers List of allowed publishers. 
   */
  public fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty) {
    cdkBuilder.allowedPublishers(allowedPublishers)
  }

  /**
   * @param codeSigningPolicies The code signing policy controls the validation failure action for
   * signature mismatch or expiry.
   */
  public fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
    cdkBuilder.codeSigningPolicies(codeSigningPolicies)
  }

  /**
   * @param codeSigningPolicies The code signing policy controls the validation failure action for
   * signature mismatch or expiry.
   */
  public
      fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty) {
    cdkBuilder.codeSigningPolicies(codeSigningPolicies)
  }

  /**
   * @param description Code signing configuration description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnCodeSigningConfigProps = cdkBuilder.build()
}
