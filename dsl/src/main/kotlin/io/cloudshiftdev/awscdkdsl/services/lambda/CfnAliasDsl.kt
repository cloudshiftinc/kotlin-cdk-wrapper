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
import software.amazon.awscdk.services.lambda.CfnAlias
import software.constructs.Construct

/**
 * The `AWS::Lambda::Alias` resource creates an
 * [alias](https://docs.aws.amazon.com/lambda/latest/dg/configuration-aliases.html) for a Lambda
 * function version. Use aliases to provide clients with a function identifier that you can update
 * to invoke a different version.
 *
 * You can also map an alias to split invocation requests between two versions. Use the
 * `RoutingConfig` parameter to specify a second version and the percentage of invocation requests
 * that it receives.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
 * .functionName("functionName")
 * .functionVersion("functionVersion")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty.builder()
 * .provisionedConcurrentExecutions(123)
 * .build())
 * .routingConfig(AliasRoutingConfigurationProperty.builder()
 * .additionalVersionWeights(List.of(VersionWeightProperty.builder()
 * .functionVersion("functionVersion")
 * .functionWeight(123)
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html)
 */
@CdkDslMarker
public class CfnAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

    /**
     * A description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-description)
     *
     * @param description A description of the alias.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionname)
     *
     * @param functionName The name of the Lambda function.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * The function version that the alias invokes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-functionversion)
     *
     * @param functionVersion The function version that the alias invokes.
     */
    public fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * The name of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-name)
     *
     * @param name The name of the alias.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Specifies a
     * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig Specifies a
     *   [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     *   configuration for a function's alias.
     */
    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * Specifies a
     * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     * configuration for a function's alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-provisionedconcurrencyconfig)
     *
     * @param provisionedConcurrencyConfig Specifies a
     *   [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/configuration-concurrency.html)
     *   configuration for a function's alias.
     */
    public fun provisionedConcurrencyConfig(
        provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty
    ) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    /**
     * The
     * [routing configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
     *
     * @param routingConfig The
     *   [routing configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     *   of the alias.
     */
    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    /**
     * The
     * [routing configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     * of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-alias.html#cfn-lambda-alias-routingconfig)
     *
     * @param routingConfig The
     *   [routing configuration](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
     *   of the alias.
     */
    public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun build(): CfnAlias = cdkBuilder.build()
}
