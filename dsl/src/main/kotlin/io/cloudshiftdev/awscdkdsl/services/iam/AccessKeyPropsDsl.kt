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
import software.amazon.awscdk.services.iam.AccessKeyProps
import software.amazon.awscdk.services.iam.AccessKeyStatus
import software.amazon.awscdk.services.iam.IUser

/**
 * Properties for defining an IAM access key.
 *
 * Example:
 * ```
 * // Creates a new IAM user, access and secret keys, and stores the secret access key in a Secret.
 * User user = new User(this, "User");
 * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
 * Secret secret = Secret.Builder.create(this, "Secret")
 * .secretStringValue(accessKey.getSecretAccessKey())
 * .build();
 * ```
 */
@CdkDslMarker
public class AccessKeyPropsDsl {
    private val cdkBuilder: AccessKeyProps.Builder = AccessKeyProps.builder()

    /**
     * @param serial A CloudFormation-specific value that signifies the access key should be
     *   replaced/rotated. This value can only be incremented. Incrementing this value will cause
     *   CloudFormation to replace the Access Key resource.
     */
    public fun serial(serial: Number) {
        cdkBuilder.serial(serial)
    }

    /**
     * @param status The status of the access key. An Active access key is allowed to be used to
     *   make API calls; An Inactive key cannot.
     */
    public fun status(status: AccessKeyStatus) {
        cdkBuilder.status(status)
    }

    /**
     * @param user The IAM user this key will belong to. Changing this value will result in the
     *   access key being deleted and a new access key (with a different ID and secret value) being
     *   assigned to the new user.
     */
    public fun user(user: IUser) {
        cdkBuilder.user(user)
    }

    public fun build(): AccessKeyProps = cdkBuilder.build()
}
