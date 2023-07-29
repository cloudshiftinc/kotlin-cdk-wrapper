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
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

/**
 * The time units you use when you set the duration of ID, access, and refresh tokens.
 *
 * The default unit for RefreshToken is days, and the default for ID and access tokens is hours.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * TokenValidityUnitsProperty tokenValidityUnitsProperty = TokenValidityUnitsProperty.builder()
 * .accessToken("accessToken")
 * .idToken("idToken")
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html)
 */
@CdkDslMarker
public class CfnUserPoolClientTokenValidityUnitsPropertyDsl {
    private val cdkBuilder: CfnUserPoolClient.TokenValidityUnitsProperty.Builder =
        CfnUserPoolClient.TokenValidityUnitsProperty.builder()

    /**
     * @param accessToken A time unit of `seconds` , `minutes` , `hours` , or `days` for the value
     *   that you set in the `AccessTokenValidity` parameter. The default `AccessTokenValidity` time
     *   unit is hours. `AccessTokenValidity` duration can range from five minutes to one day.
     */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /**
     * @param idToken A time unit of `seconds` , `minutes` , `hours` , or `days` for the value that
     *   you set in the `IdTokenValidity` parameter. The default `IdTokenValidity` time unit is
     *   hours. `IdTokenValidity` duration can range from five minutes to one day.
     */
    public fun idToken(idToken: String) {
        cdkBuilder.idToken(idToken)
    }

    /**
     * @param refreshToken A time unit of `seconds` , `minutes` , `hours` , or `days` for the value
     *   that you set in the `RefreshTokenValidity` parameter. The default `RefreshTokenValidity`
     *   time unit is days. `RefreshTokenValidity` duration can range from 60 minutes to 10 years.
     */
    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnUserPoolClient.TokenValidityUnitsProperty = cdkBuilder.build()
}
