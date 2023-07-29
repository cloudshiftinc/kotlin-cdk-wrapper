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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnIdentityPool

/**
 * `PushSync` is a property of the
 * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 * resource that defines the configuration options to be applied to an Amazon Cognito identity pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * PushSyncProperty pushSyncProperty = PushSyncProperty.builder()
 * .applicationArns(List.of("applicationArns"))
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html)
 */
@CdkDslMarker
public class CfnIdentityPoolPushSyncPropertyDsl {
    private val cdkBuilder: CfnIdentityPool.PushSyncProperty.Builder =
        CfnIdentityPool.PushSyncProperty.builder()

    private val _applicationArns: MutableList<String> = mutableListOf()

    /**
     * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used by
     *   clients.
     */
    public fun applicationArns(vararg applicationArns: String) {
        _applicationArns.addAll(listOf(*applicationArns))
    }

    /**
     * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used by
     *   clients.
     */
    public fun applicationArns(applicationArns: Collection<String>) {
        _applicationArns.addAll(applicationArns)
    }

    /**
     * @param roleArn An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf of
     *   the developer.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnIdentityPool.PushSyncProperty {
        if (_applicationArns.isNotEmpty()) cdkBuilder.applicationArns(_applicationArns)
        return cdkBuilder.build()
    }
}
