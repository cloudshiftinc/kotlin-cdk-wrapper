@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessKey.Builder = CfnAccessKey.Builder.create(scope, id)

  /**
   * This value is specific to CloudFormation and can only be *incremented* .
   *
   * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
   * you update your stack, CloudFormation will replace the existing access key with a new key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-serial)
   * @param serial This value is specific to CloudFormation and can only be *incremented* . 
   */
  public fun serial(serial: Number) {
    cdkBuilder.serial(serial)
  }

  /**
   * The status of the access key.
   *
   * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-status)
   * @param status The status of the access key. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * The name of the IAM user that the new key will belong to.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
   * @param userName The name of the IAM user that the new key will belong to. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnAccessKey = cdkBuilder.build()
}
