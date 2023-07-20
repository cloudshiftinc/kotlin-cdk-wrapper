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

  public fun cognitoDomain(block: CognitoDomainOptionsDsl.() -> Unit = {}) {
    val builder = CognitoDomainOptionsDsl()
    builder.apply(block)
    cdkBuilder.cognitoDomain(builder.build())
  }

  public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
    cdkBuilder.cognitoDomain(cognitoDomain)
  }

  public fun customDomain(block: CustomDomainOptionsDsl.() -> Unit = {}) {
    val builder = CustomDomainOptionsDsl()
    builder.apply(block)
    cdkBuilder.customDomain(builder.build())
  }

  public fun customDomain(customDomain: CustomDomainOptions) {
    cdkBuilder.customDomain(customDomain)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolDomainProps = cdkBuilder.build()
}
