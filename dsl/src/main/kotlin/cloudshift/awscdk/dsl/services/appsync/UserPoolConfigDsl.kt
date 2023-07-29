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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.UserPoolConfig
import software.amazon.awscdk.services.appsync.UserPoolDefaultAction
import software.amazon.awscdk.services.cognito.IUserPool

/**
 * Configuration for Cognito user-pools in AppSync.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.cognito.*;
 * UserPool userPool;
 * UserPoolConfig userPoolConfig = UserPoolConfig.builder()
 * .userPool(userPool)
 * // the properties below are optional
 * .appIdClientRegex("appIdClientRegex")
 * .defaultAction(UserPoolDefaultAction.ALLOW)
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolConfigDsl {
    private val cdkBuilder: UserPoolConfig.Builder = UserPoolConfig.builder()

    /** @param appIdClientRegex the optional app id regex. */
    public fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    /** @param defaultAction Default auth action. */
    public fun defaultAction(defaultAction: UserPoolDefaultAction) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /** @param userPool The Cognito user pool to use as identity source. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolConfig = cdkBuilder.build()
}
