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
import software.amazon.awscdk.CfnResourceDefaultVersionProps

/**
 * Properties for defining a `CfnResourceDefaultVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnResourceDefaultVersionProps cfnResourceDefaultVersionProps =
 * CfnResourceDefaultVersionProps.builder()
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
 */
@CdkDslMarker
public class CfnResourceDefaultVersionPropsDsl {
    private val cdkBuilder: CfnResourceDefaultVersionProps.Builder =
        CfnResourceDefaultVersionProps.builder()

    /**
     * @param typeName The name of the resource. Conditional: You must specify either
     *   `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version. Conditional:
     *   You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeVersionArn(typeVersionArn: String) {
        cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * @param versionId The ID of a specific version of the resource. The version ID is the value at
     *   the end of the Amazon Resource Name (ARN) assigned to the resource version when it's
     *   registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnResourceDefaultVersionProps = cdkBuilder.build()
}
