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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

/**
 * Details for SASL/IAM client authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * IamProperty iamProperty = IamProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-iam.html)
 */
@CdkDslMarker
public class CfnServerlessClusterIamPropertyDsl {
    private val cdkBuilder: CfnServerlessCluster.IamProperty.Builder =
        CfnServerlessCluster.IamProperty.builder()

    /** @param enabled SASL/IAM authentication is enabled or not. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled SASL/IAM authentication is enabled or not. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnServerlessCluster.IamProperty = cdkBuilder.build()
}
