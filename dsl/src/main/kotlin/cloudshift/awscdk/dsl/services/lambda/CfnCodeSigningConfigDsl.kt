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
import software.constructs.Construct

/**
 * Details about a
 * [Code signing configuration](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnCodeSigningConfig cfnCodeSigningConfig = CfnCodeSigningConfig.Builder.create(this,
 * "MyCfnCodeSigningConfig")
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
public class CfnCodeSigningConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCodeSigningConfig.Builder =
        CfnCodeSigningConfig.Builder.create(scope, id)

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     *
     * @param allowedPublishers List of allowed publishers.
     */
    public fun allowedPublishers(allowedPublishers: IResolvable) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     *
     * @param allowedPublishers List of allowed publishers.
     */
    public fun allowedPublishers(
        allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty
    ) {
        cdkBuilder.allowedPublishers(allowedPublishers)
    }

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     *
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     *   signature mismatch or expiry.
     */
    public fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     *
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     *   signature mismatch or expiry.
     */
    public fun codeSigningPolicies(
        codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty
    ) {
        cdkBuilder.codeSigningPolicies(codeSigningPolicies)
    }

    /**
     * Code signing configuration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-description)
     *
     * @param description Code signing configuration description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnCodeSigningConfig = cdkBuilder.build()
}
