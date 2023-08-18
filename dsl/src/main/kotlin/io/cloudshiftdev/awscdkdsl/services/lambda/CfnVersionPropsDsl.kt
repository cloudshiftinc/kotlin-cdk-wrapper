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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps

/**
 * Properties for defining a `CfnVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnVersionProps cfnVersionProps = CfnVersionProps.builder()
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
public class CfnVersionPropsDsl {
    private val cdkBuilder: CfnVersionProps.Builder = CfnVersionProps.builder()

    /**
     * @param codeSha256 Only publish a version if the hash value matches the value that's
     *   specified. Use this option to avoid publishing a version if the function code has changed
     *   since you last updated it. Updates are not supported for this property.
     */
    public fun codeSha256(codeSha256: String) {
        cdkBuilder.codeSha256(codeSha256)
    }

    /**
     * @param description A description for the version to override the description in the function
     *   configuration. Updates are not supported for this property.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param functionName The name of the Lambda function. **Name formats** - *Function name* -
     *   `MyFunction` .
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Partial ARN* - `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     *   function's version. Updates are not supported for this property.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * @param provisionedConcurrencyConfig Specifies a provisioned concurrency configuration for a
     *   function's version. Updates are not supported for this property.
     */
    public fun provisionedConcurrencyConfig(
        provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty
    ) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun build(): CfnVersionProps = cdkBuilder.build()
}
