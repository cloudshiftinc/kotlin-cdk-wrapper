@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexJwtTokenTypeConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.JwtTokenTypeConfigurationProperty.Builder =
      CfnIndex.JwtTokenTypeConfigurationProperty.builder()

  /**
   * @param claimRegex The regular expression that identifies the claim.
   */
  public fun claimRegex(claimRegex: String) {
    cdkBuilder.claimRegex(claimRegex)
  }

  /**
   * @param groupAttributeField The group attribute field.
   */
  public fun groupAttributeField(groupAttributeField: String) {
    cdkBuilder.groupAttributeField(groupAttributeField)
  }

  /**
   * @param issuer The issuer of the token.
   */
  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * @param keyLocation The location of the key. 
   */
  public fun keyLocation(keyLocation: String) {
    cdkBuilder.keyLocation(keyLocation)
  }

  /**
   * @param secretManagerArn The Amazon Resource Name (arn) of the secret.
   */
  public fun secretManagerArn(secretManagerArn: String) {
    cdkBuilder.secretManagerArn(secretManagerArn)
  }

  /**
   * @param url The signing key URL.
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  /**
   * @param userNameAttributeField The user name attribute field.
   */
  public fun userNameAttributeField(userNameAttributeField: String) {
    cdkBuilder.userNameAttributeField(userNameAttributeField)
  }

  public fun build(): CfnIndex.JwtTokenTypeConfigurationProperty = cdkBuilder.build()
}
