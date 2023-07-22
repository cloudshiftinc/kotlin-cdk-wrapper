@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CognitoDomainOptions

@CdkDslMarker
public class CognitoDomainOptionsDsl {
  private val cdkBuilder: CognitoDomainOptions.Builder = CognitoDomainOptions.builder()

  /**
   * @param domainPrefix The prefix to the Cognito hosted domain name that will be associated with
   * the user pool. 
   */
  public fun domainPrefix(domainPrefix: String) {
    cdkBuilder.domainPrefix(domainPrefix)
  }

  public fun build(): CognitoDomainOptions = cdkBuilder.build()
}
