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
import software.amazon.awscdk.services.lambda.CfnVersion
import software.constructs.Construct

/**
 * The `AWS::Lambda::Version` resource creates a
 * [version](https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html) from the current
 * code and configuration of a function. Use versions to create a snapshot of your function code and
 * configuration that doesn't change.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnVersion cfnVersion = CfnVersion.Builder.create(this, "MyCfnVersion")
 * .functionName("functionName")
 * // the properties below are optional
 * .codeSha256("codeSha256")
 * .description("description")
 * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html)
 */
@CdkDslMarker
public class CfnVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVersion.Builder = CfnVersion.Builder.create(scope, id)

    /**
     * Only publish a version if the hash value matches the value that's specified.
     *
     * Use this option to avoid publishing a version if the function code has changed since you last
     * updated it. Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-codesha256)
     *
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     *   specified.
     */
    public fun codeSha256(codeSha256: String) {
        cdkBuilder.codeSha256(codeSha256)
    }

    /**
     * A description for the version to override the description in the function configuration.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-description)
     *
     * @param description A description for the version to override the description in the function
     *   configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* - `MyFunction` .
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-functionname)
     *
     * @param functionName The name of the Lambda function.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     *   function's version.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Updates are not supported for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-version.html#cfn-lambda-version-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     *   function's version.
     */
    public fun provisionedConcurrencyConfig(
        provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty
    ) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun build(): CfnVersion = cdkBuilder.build()
}
