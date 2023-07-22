@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount

/**
 * Information about a Sidewalk account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * SidewalkAccountInfoProperty sidewalkAccountInfoProperty = SidewalkAccountInfoProperty.builder()
 * .appServerPrivateKey("appServerPrivateKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfo.html)
 */
@CdkDslMarker
public class CfnPartnerAccountSidewalkAccountInfoPropertyDsl {
  private val cdkBuilder: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder =
      CfnPartnerAccount.SidewalkAccountInfoProperty.builder()

  /**
   * @param appServerPrivateKey The Sidewalk application server private key. 
   * The application server private key is a secret key, which you should handle in a similar way as
   * you would an application password. You can protect the application server private key by storing
   * the value in the AWS Secrets Manager and use the
   * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
   * to reference this value.
   */
  public fun appServerPrivateKey(appServerPrivateKey: String) {
    cdkBuilder.appServerPrivateKey(appServerPrivateKey)
  }

  public fun build(): CfnPartnerAccount.SidewalkAccountInfoProperty = cdkBuilder.build()
}
