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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnSecurityKey
import software.constructs.Construct

/**
 * The security key for the instance.
 *
 * Only two security keys are allowed per Amazon Connect instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnSecurityKey cfnSecurityKey = CfnSecurityKey.Builder.create(this, "MyCfnSecurityKey")
 * .instanceId("instanceId")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html)
 */
@CdkDslMarker
public class CfnSecurityKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityKey.Builder = CfnSecurityKey.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-instanceid)
     *
     * @param instanceId The Amazon Resource Name (ARN) of the instance.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * A valid security key in PEM format. For example:.
     *
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-key)
     *
     * @param key A valid security key in PEM format. For example:.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnSecurityKey = cdkBuilder.build()
}
