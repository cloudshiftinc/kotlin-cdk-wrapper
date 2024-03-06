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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.constructs.Construct

/**
 * Specifies the default version of a module.
 *
 * The default version of the module will be used in CloudFormation operations for this account and
 * Region.
 *
 * To register a module version, use the
 * `[`AWS::CloudFormation::ModuleVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)`
 * resource.
 *
 * For more information using modules, see
 * [Using modules to encapsulate and reuse resource configurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html)
 * and
 * [Registering extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register)
 * in the *AWS CloudFormation User Guide* . For information on developing modules, see
 * [Developing modules](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules.html)
 * in the *AWS CloudFormation CLI User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnModuleDefaultVersion cfnModuleDefaultVersion = CfnModuleDefaultVersion.Builder.create(this,
 * "MyCfnModuleDefaultVersion")
 * .arn("arn")
 * .moduleName("moduleName")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
 */
@CdkDslMarker
public class CfnModuleDefaultVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModuleDefaultVersion.Builder =
        CfnModuleDefaultVersion.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the module version to set as the default version.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
     *
     * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
     *   version.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * The name of the module.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
     *
     * @param moduleName The name of the module.
     */
    public fun moduleName(moduleName: String) {
        cdkBuilder.moduleName(moduleName)
    }

    /**
     * The ID for the specific version of the module.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
     *
     * @param versionId The ID for the specific version of the module.
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnModuleDefaultVersion = cdkBuilder.build()
}
