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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::BasePathMapping` resource creates a base path that clients who call your
 * API must use in the invocation URL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnBasePathMapping cfnBasePathMapping = CfnBasePathMapping.Builder.create(this,
 * "MyCfnBasePathMapping")
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath("basePath")
 * .id("id")
 * .restApiId("restApiId")
 * .stage("stage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
 */
@CdkDslMarker
public class CfnBasePathMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBasePathMapping.Builder =
        CfnBasePathMapping.Builder.create(scope, id)

    /**
     * The base path name that callers of the API must provide as part of the URL after the domain
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
     *
     * @param basePath The base path name that callers of the API must provide as part of the URL
     *   after the domain name.
     */
    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    /**
     * The domain name of the BasePathMapping resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
     *
     * @param domainName The domain name of the BasePathMapping resource to be described.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-id)
     *
     * @param id
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
     *
     * @param restApiId The string identifier of the associated RestApi.
     */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    /**
     * The name of the associated stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
     *
     * @param stage The name of the associated stage.
     */
    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnBasePathMapping = cdkBuilder.build()
}
