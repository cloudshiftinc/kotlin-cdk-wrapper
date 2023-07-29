@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.constructs.Construct

/**
 * Creates a new AWS secret access key and corresponding AWS access key ID for the specified user.
 *
 * The default status for new keys is `Active` .
 *
 * For information about quotas on the number of keys you can create, see
 * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
 * in the *IAM User Guide* .
 *
 * To ensure the security of your AWS account , the secret access key is accessible only during key
 * and user creation. You must save the key (for example, in a text file) if you want to be able to
 * access it again. If a secret key is lost, you can rotate access keys by increasing the value of
 * the `serial` property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * CfnAccessKey cfnAccessKey = CfnAccessKey.Builder.create(this, "MyCfnAccessKey")
 * .userName("userName")
 * // the properties below are optional
 * .serial(123)
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html)
 */
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
     *
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
     *
     * @param status The status of the access key.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * The name of the IAM user that the new key will belong to.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
     *
     * @param userName The name of the IAM user that the new key will belong to.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnAccessKey = cdkBuilder.build()
}
