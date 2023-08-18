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

package io.cloudshiftdev.awscdkdsl.services.opensearchserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.constructs.Construct

/**
 * Specifies a security configuration for OpenSearch Serverless.
 *
 * For more information, see
 * [SAML authentication for Amazon OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnSecurityConfig cfnSecurityConfig = CfnSecurityConfig.Builder.create(this,
 * "MyCfnSecurityConfig")
 * .description("description")
 * .name("name")
 * .samlOptions(SamlConfigOptionsProperty.builder()
 * .metadata("metadata")
 * // the properties below are optional
 * .groupAttribute("groupAttribute")
 * .sessionTimeout(123)
 * .userAttribute("userAttribute")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html)
 */
@CdkDslMarker
public class CfnSecurityConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityConfig.Builder = CfnSecurityConfig.Builder.create(scope, id)

    /**
     * The description of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
     *
     * @param description The description of the security configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
     *
     * @param name The name of the security configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     *
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     *   map.
     */
    public fun samlOptions(samlOptions: IResolvable) {
        cdkBuilder.samlOptions(samlOptions)
    }

    /**
     * SAML options for the security configuration in the form of a key-value map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
     *
     * @param samlOptions SAML options for the security configuration in the form of a key-value
     *   map.
     */
    public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
        cdkBuilder.samlOptions(samlOptions)
    }

    /**
     * The type of security configuration.
     *
     * Currently the only option is `saml` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
     *
     * @param type The type of security configuration.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSecurityConfig = cdkBuilder.build()
}
