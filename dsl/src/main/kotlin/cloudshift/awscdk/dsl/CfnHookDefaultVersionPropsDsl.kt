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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookDefaultVersionProps

/**
 * Properties for defining a `CfnHookDefaultVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnHookDefaultVersionProps cfnHookDefaultVersionProps = CfnHookDefaultVersionProps.builder()
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
 */
@CdkDslMarker
public class CfnHookDefaultVersionPropsDsl {
    private val cdkBuilder: CfnHookDefaultVersionProps.Builder =
        CfnHookDefaultVersionProps.builder()

    /**
     * @param typeName The name of the hook. You must specify either `TypeVersionArn` , or
     *   `TypeName` and `VersionId` .
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeVersionArn The version ID of the type configuration. You must specify either
     *   `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeVersionArn(typeVersionArn: String) {
        cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * @param versionId The version ID of the type specified. You must specify either
     *   `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnHookDefaultVersionProps = cdkBuilder.build()
}
