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
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Identifies a property value used in an expression.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * VariableValueProperty variableValueProperty = VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html)
 */
@CdkDslMarker
public class CfnAssetModelVariableValuePropertyDsl {
    private val cdkBuilder: CfnAssetModel.VariableValueProperty.Builder =
        CfnAssetModel.VariableValueProperty.builder()

    /**
     * @param hierarchyLogicalId The `LogicalID` of the hierarchy to query for the
     *   `PropertyLogicalID` . You use a `hierarchyLogicalID` instead of a model ID because you can
     *   have several hierarchies using the same model and therefore the same property. For example,
     *   you might have separately grouped assets that come from the same asset model. For more
     *   information, see
     *   [Defining relationships between assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     *   in the *AWS IoT SiteWise User Guide* .
     */
    public fun hierarchyLogicalId(hierarchyLogicalId: String) {
        cdkBuilder.hierarchyLogicalId(hierarchyLogicalId)
    }

    /** @param propertyLogicalId The `LogicalID` of the property to use as the variable. */
    public fun propertyLogicalId(propertyLogicalId: String) {
        cdkBuilder.propertyLogicalId(propertyLogicalId)
    }

    public fun build(): CfnAssetModel.VariableValueProperty = cdkBuilder.build()
}
