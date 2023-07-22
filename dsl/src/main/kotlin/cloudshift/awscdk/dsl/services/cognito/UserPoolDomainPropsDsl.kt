@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolDomainProps

@CdkDslMarker
public class UserPoolDomainPropsDsl {
  private val cdkBuilder: UserPoolDomainProps.Builder = UserPoolDomainProps.builder()

  /**
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified.
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptionsDsl.() -> Unit = {}) {
    val builder = CognitoDomainOptionsDsl()
    builder.apply(cognitoDomain)
    cdkBuilder.cognitoDomain(builder.build())
  }

  /**
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified.
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
    cdkBuilder.cognitoDomain(cognitoDomain)
  }

  /**
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified.
   */
  public fun customDomain(customDomain: CustomDomainOptionsDsl.() -> Unit = {}) {
    val builder = CustomDomainOptionsDsl()
    builder.apply(customDomain)
    cdkBuilder.customDomain(builder.build())
  }

  /**
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified.
   */
  public fun customDomain(customDomain: CustomDomainOptions) {
    cdkBuilder.customDomain(customDomain)
  }

  /**
   * @param userPool The user pool to which this domain should be associated. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolDomainProps = cdkBuilder.build()
}
