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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iam.CfnAccessKeyProps

/**
 * Properties for defining a `CfnAccessKey`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * CfnAccessKeyProps cfnAccessKeyProps = CfnAccessKeyProps.builder()
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
public class CfnAccessKeyPropsDsl {
    private val cdkBuilder: CfnAccessKeyProps.Builder = CfnAccessKeyProps.builder()

    /**
     * @param serial This value is specific to CloudFormation and can only be *incremented* .
     *   Incrementing this value notifies CloudFormation that you want to rotate your access key.
     *   When you update your stack, CloudFormation will replace the existing access key with a new
     *   key.
     */
    public fun serial(serial: Number) {
        cdkBuilder.serial(serial)
    }

    /**
     * @param status The status of the access key. `Active` means that the key is valid for API
     *   calls, while `Inactive` means it is not.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param userName The name of the IAM user that the new key will belong to. This parameter
     *   allows (through its
     *   [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     *   characters consisting of upper and lowercase alphanumeric characters with no spaces. You
     *   can also include any of the following characters: _+=,.&#64;-
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnAccessKeyProps = cdkBuilder.build()
}
