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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps

/**
 * Properties for defining a `CfnModuleDefaultVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnModuleDefaultVersionProps cfnModuleDefaultVersionProps =
 * CfnModuleDefaultVersionProps.builder()
 * .arn("arn")
 * .moduleName("moduleName")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
 */
@CdkDslMarker
public class CfnModuleDefaultVersionPropsDsl {
    private val cdkBuilder: CfnModuleDefaultVersionProps.Builder =
        CfnModuleDefaultVersionProps.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
     *   version. Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param moduleName The name of the module. Conditional: You must specify either `Arn` , or
     *   `ModuleName` and `VersionId` .
     */
    public fun moduleName(moduleName: String) {
        cdkBuilder.moduleName(moduleName)
    }

    /**
     * @param versionId The ID for the specific version of the module. Conditional: You must specify
     *   either `Arn` , or `ModuleName` and `VersionId` .
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnModuleDefaultVersionProps = cdkBuilder.build()
}
