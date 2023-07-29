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
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides the configuration information for the JWT token type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * JwtTokenTypeConfigurationProperty jwtTokenTypeConfigurationProperty =
 * JwtTokenTypeConfigurationProperty.builder()
 * .keyLocation("keyLocation")
 * // the properties below are optional
 * .claimRegex("claimRegex")
 * .groupAttributeField("groupAttributeField")
 * .issuer("issuer")
 * .secretManagerArn("secretManagerArn")
 * .url("url")
 * .userNameAttributeField("userNameAttributeField")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexJwtTokenTypeConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.JwtTokenTypeConfigurationProperty.Builder =
        CfnIndex.JwtTokenTypeConfigurationProperty.builder()

    /** @param claimRegex The regular expression that identifies the claim. */
    public fun claimRegex(claimRegex: String) {
        cdkBuilder.claimRegex(claimRegex)
    }

    /** @param groupAttributeField The group attribute field. */
    public fun groupAttributeField(groupAttributeField: String) {
        cdkBuilder.groupAttributeField(groupAttributeField)
    }

    /** @param issuer The issuer of the token. */
    public fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
    }

    /** @param keyLocation The location of the key. */
    public fun keyLocation(keyLocation: String) {
        cdkBuilder.keyLocation(keyLocation)
    }

    /** @param secretManagerArn The Amazon Resource Name (arn) of the secret. */
    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    /** @param url The signing key URL. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /** @param userNameAttributeField The user name attribute field. */
    public fun userNameAttributeField(userNameAttributeField: String) {
        cdkBuilder.userNameAttributeField(userNameAttributeField)
    }

    public fun build(): CfnIndex.JwtTokenTypeConfigurationProperty = cdkBuilder.build()
}
