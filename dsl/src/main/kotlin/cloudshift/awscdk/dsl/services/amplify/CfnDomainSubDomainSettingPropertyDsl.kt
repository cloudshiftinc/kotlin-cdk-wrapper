@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnDomain

@CdkDslMarker
public class CfnDomainSubDomainSettingPropertyDsl {
  private val cdkBuilder: CfnDomain.SubDomainSettingProperty.Builder =
      CfnDomain.SubDomainSettingProperty.builder()

  /**
   * @param branchName The branch name setting for the subdomain. 
   * *Length Constraints:* Minimum length of 1. Maximum length of 255.
   *
   * *Pattern:* (?s).+
   */
  public fun branchName(branchName: String) {
    cdkBuilder.branchName(branchName)
  }

  /**
   * @param prefix The prefix setting for the subdomain. 
   * *Length Constraints:* Maximum length of 255.
   *
   * *Pattern:* (?s).*
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnDomain.SubDomainSettingProperty = cdkBuilder.build()
}
