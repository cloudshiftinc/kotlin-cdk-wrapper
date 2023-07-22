@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.constructs.Construct

@CdkDslMarker
public class UserPoolDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolDomain.Builder = UserPoolDomain.Builder.create(scope, id)

  /**
   * Associate a cognito prefix domain with your user pool Either `customDomain` or `cognitoDomain`
   * must be specified.
   *
   * Default: - not set if `customDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified. 
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptionsDsl.() -> Unit = {}) {
    val builder = CognitoDomainOptionsDsl()
    builder.apply(cognitoDomain)
    cdkBuilder.cognitoDomain(builder.build())
  }

  /**
   * Associate a cognito prefix domain with your user pool Either `customDomain` or `cognitoDomain`
   * must be specified.
   *
   * Default: - not set if `customDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
   * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
   * `customDomain` or `cognitoDomain` must be specified. 
   */
  public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
    cdkBuilder.cognitoDomain(cognitoDomain)
  }

  /**
   * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must be
   * specified.
   *
   * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified. 
   */
  public fun customDomain(customDomain: CustomDomainOptionsDsl.() -> Unit = {}) {
    val builder = CustomDomainOptionsDsl()
    builder.apply(customDomain)
    cdkBuilder.customDomain(builder.build())
  }

  /**
   * Associate a custom domain with your user pool Either `customDomain` or `cognitoDomain` must be
   * specified.
   *
   * Default: - not set if `cognitoDomain` is specified, otherwise, throws an error.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
   * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
   * `cognitoDomain` must be specified. 
   */
  public fun customDomain(customDomain: CustomDomainOptions) {
    cdkBuilder.customDomain(customDomain)
  }

  /**
   * The user pool to which this domain should be associated.
   *
   * @param userPool The user pool to which this domain should be associated. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolDomain = cdkBuilder.build()
}
