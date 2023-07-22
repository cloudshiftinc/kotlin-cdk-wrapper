@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps

@CdkDslMarker
public class CfnAccountAliasPropsDsl {
  private val cdkBuilder: CfnAccountAliasProps.Builder = CfnAccountAliasProps.builder()

  /**
   * @param accountAlias An alias or short name for an AWS account . 
   */
  public fun accountAlias(accountAlias: String) {
    cdkBuilder.accountAlias(accountAlias)
  }

  public fun build(): CfnAccountAliasProps = cdkBuilder.build()
}
