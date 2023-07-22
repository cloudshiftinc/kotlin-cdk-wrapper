@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps

@CdkDslMarker
public class UserPoolIdentityProviderPropsDsl {
  private val cdkBuilder: UserPoolIdentityProviderProps.Builder =
      UserPoolIdentityProviderProps.builder()

  /**
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool.
   */
  public fun attributeMapping(attributeMapping: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(attributeMapping)
    cdkBuilder.attributeMapping(builder.build())
  }

  /**
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool.
   */
  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  /**
   * @param userPool The user pool to which this construct provides identities. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolIdentityProviderProps = cdkBuilder.build()
}
