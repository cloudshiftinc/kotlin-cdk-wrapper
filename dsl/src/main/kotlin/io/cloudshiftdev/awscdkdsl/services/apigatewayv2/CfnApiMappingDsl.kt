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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::ApiMapping` resource contains an API mapping.
 *
 * An API mapping relates a path of your custom domain name to a stage of your API. A custom domain
 * name can have multiple API mappings, but the paths can't overlap. A custom domain can map only to
 * APIs of the same protocol type. For more information, see
 * [CreateApiMapping](https://docs.aws.amazon.com/apigatewayv2/latest/api-reference/domainnames-domainname-apimappings.html#CreateApiMapping)
 * in the *Amazon API Gateway V2 API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * CfnApiMapping cfnApiMapping = CfnApiMapping.Builder.create(this, "MyCfnApiMapping")
 * .apiId("apiId")
 * .domainName("domainName")
 * .stage("stage")
 * // the properties below are optional
 * .apiMappingKey("apiMappingKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html)
 */
@CdkDslMarker
public class CfnApiMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiMapping.Builder = CfnApiMapping.Builder.create(scope, id)

    /**
     * The identifier of the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
     *
     * @param apiId The identifier of the API.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * The API mapping key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
     *
     * @param apiMappingKey The API mapping key.
     */
    public fun apiMappingKey(apiMappingKey: String) {
        cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
     *
     * @param domainName The domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
     *
     * @param stage The API stage.
     */
    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnApiMapping = cdkBuilder.build()
}
