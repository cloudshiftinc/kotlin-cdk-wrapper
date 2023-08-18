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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps

/**
 * Properties for defining a `CfnHookTypeConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnHookTypeConfigProps cfnHookTypeConfigProps = CfnHookTypeConfigProps.builder()
 * .configuration("configuration")
 * // the properties below are optional
 * .configurationAlias("configurationAlias")
 * .typeArn("typeArn")
 * .typeName("typeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
 */
@CdkDslMarker
public class CfnHookTypeConfigPropsDsl {
    private val cdkBuilder: CfnHookTypeConfigProps.Builder = CfnHookTypeConfigProps.builder()

    /**
     * @param configuration Specifies the activated hook type configuration, in this AWS account and
     *   AWS Region . You must specify either `TypeName` and `Configuration` or `TypeARN` and
     *   `Configuration` .
     */
    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param configurationAlias Specifies the activated hook type configuration, in this AWS
     *   account and AWS Region . Defaults to `default` alias. Hook types currently support default
     *   configuration alias.
     */
    public fun configurationAlias(configurationAlias: String) {
        cdkBuilder.configurationAlias(configurationAlias)
    }

    /**
     * @param typeArn The Amazon Resource Number (ARN) for the hook to set `Configuration` for. You
     *   must specify either `TypeName` and `Configuration` or `TypeARN` and `Configuration` .
     */
    public fun typeArn(typeArn: String) {
        cdkBuilder.typeArn(typeArn)
    }

    /**
     * @param typeName The unique name for your hook. Specifies a three-part namespace for your
     *   hook, with a recommended pattern of `Organization::Service::Hook` .
     *
     * You must specify either `TypeName` and `Configuration` or `TypeARN` and `Configuration` .
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnHookTypeConfigProps = cdkBuilder.build()
}
