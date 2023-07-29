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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps

/**
 * Properties for defining a `CfnCodeSigningConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnCodeSigningConfigProps cfnCodeSigningConfigProps = CfnCodeSigningConfigProps.builder()
 * .allowedPublishers(AllowedPublishersProperty.builder()
 * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
 * .build())
 * // the properties below are optional
 * .codeSigningPolicies(CodeSigningPoliciesProperty.builder()
 * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
 * .build())
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html)
 */
@CdkDslMarker
public class CfnCodeSigningConfigPropsDsl {
    private val cdkBuilder: CfnCodeSigningConfigProps.Builder = CfnCodeSigningConfigProps.builder()

    /** @param allowedPublishers List of allowed publishers. */
    public fun allowedPublishers(allowedPublishers: IResolvable) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    /** @param allowedPublishers List of allowed publishers. */
    public fun allowedPublishers(
        allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty
    ) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     *   signature mismatch or expiry.
     */
    public fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     *   signature mismatch or expiry.
     */
    public fun codeSigningPolicies(
        codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty
    ) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    /** @param description Code signing configuration description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnCodeSigningConfigProps = cdkBuilder.build()
}
