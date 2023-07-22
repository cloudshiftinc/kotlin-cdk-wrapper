@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.constructs.Construct

/**
 * A public key that you can use with [signed URLs and signed
 * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
 * or with [field-level
 * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnPublicKey cfnPublicKey = CfnPublicKey.Builder.create(this, "MyCfnPublicKey")
 * .publicKeyConfig(PublicKeyConfigProperty.builder()
 * .callerReference("callerReference")
 * .encodedKey("encodedKey")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html)
 */
@CdkDslMarker
public class CfnPublicKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPublicKey.Builder = CfnPublicKey.Builder.create(scope, id)

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
   * @param publicKeyConfig Configuration information about a public key that you can use with
   * [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * . 
   */
  public fun publicKeyConfig(publicKeyConfig: IResolvable) {
    cdkBuilder.publicKeyConfig(publicKeyConfig)
  }

  /**
   * Configuration information about a public key that you can use with [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html#cfn-cloudfront-publickey-publickeyconfig)
   * @param publicKeyConfig Configuration information about a public key that you can use with
   * [signed URLs and signed
   * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) ,
   * or with [field-level
   * encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
   * . 
   */
  public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
    cdkBuilder.publicKeyConfig(publicKeyConfig)
  }

  public fun build(): CfnPublicKey = cdkBuilder.build()
}
