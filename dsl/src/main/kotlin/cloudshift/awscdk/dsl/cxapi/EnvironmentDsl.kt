@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.Environment

@CdkDslMarker
public class EnvironmentDsl {
  private val cdkBuilder: Environment.Builder = Environment.builder()

  /**
   * @param account The AWS account this environment deploys into. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param name The arbitrary name of this environment (user-set, or at least user-meaningful). 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param region The AWS region name where this environment deploys into. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): Environment = cdkBuilder.build()
}
