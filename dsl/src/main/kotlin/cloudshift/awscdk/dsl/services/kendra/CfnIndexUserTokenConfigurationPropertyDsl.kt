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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides the configuration information for a token.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * UserTokenConfigurationProperty userTokenConfigurationProperty =
 * UserTokenConfigurationProperty.builder()
 * .jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty.builder()
 * .groupAttributeField("groupAttributeField")
 * .userNameAttributeField("userNameAttributeField")
 * .build())
 * .jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty.builder()
 * .keyLocation("keyLocation")
 * // the properties below are optional
 * .claimRegex("claimRegex")
 * .groupAttributeField("groupAttributeField")
 * .issuer("issuer")
 * .secretManagerArn("secretManagerArn")
 * .url("url")
 * .userNameAttributeField("userNameAttributeField")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexUserTokenConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.UserTokenConfigurationProperty.Builder =
        CfnIndex.UserTokenConfigurationProperty.builder()

    /** @param jsonTokenTypeConfiguration Information about the JSON token type configuration. */
    public fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable) {
        cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration)
    }

    /** @param jsonTokenTypeConfiguration Information about the JSON token type configuration. */
    public fun jsonTokenTypeConfiguration(
        jsonTokenTypeConfiguration: CfnIndex.JsonTokenTypeConfigurationProperty
    ) {
        cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration)
    }

    /** @param jwtTokenTypeConfiguration Information about the JWT token type configuration. */
    public fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable) {
        cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration)
    }

    /** @param jwtTokenTypeConfiguration Information about the JWT token type configuration. */
    public fun jwtTokenTypeConfiguration(
        jwtTokenTypeConfiguration: CfnIndex.JwtTokenTypeConfigurationProperty
    ) {
        cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration)
    }

    public fun build(): CfnIndex.UserTokenConfigurationProperty = cdkBuilder.build()
}
