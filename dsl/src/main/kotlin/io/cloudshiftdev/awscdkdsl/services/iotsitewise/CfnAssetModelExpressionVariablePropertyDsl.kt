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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Contains expression variable information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * ExpressionVariableProperty expressionVariableProperty = ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html)
 */
@CdkDslMarker
public class CfnAssetModelExpressionVariablePropertyDsl {
    private val cdkBuilder: CfnAssetModel.ExpressionVariableProperty.Builder =
        CfnAssetModel.ExpressionVariableProperty.builder()

    /**
     * @param name The friendly name of the variable to be used in the expression. The maximum
     *   length is 64 characters with the pattern `^[a-z][a-z0-9_]*$` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The variable that identifies an asset property from which to use values. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The variable that identifies an asset property from which to use values. */
    public fun `value`(`value`: CfnAssetModel.VariableValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAssetModel.ExpressionVariableProperty = cdkBuilder.build()
}
