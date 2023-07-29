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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Contains an asset transform property.
 *
 * A transform is a one-to-one mapping of a property's data points from one form to another. For
 * example, you can use a transform to convert a Celsius data stream to Fahrenheit by applying the
 * transformation expression to each data point of the Celsius stream. Transforms can only input
 * properties that are `INTEGER` , `DOUBLE` , or `BOOLEAN` type. Booleans convert to `0` ( `FALSE` )
 * and `1` ( `TRUE` )..
 *
 * For more information, see
 * [Defining data properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms)
 * in the *AWS IoT SiteWise User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * TransformProperty transformProperty = TransformProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html)
 */
@CdkDslMarker
public class CfnAssetModelTransformPropertyDsl {
    private val cdkBuilder: CfnAssetModel.TransformProperty.Builder =
        CfnAssetModel.TransformProperty.builder()

    private val _variables: MutableList<Any> = mutableListOf()

    /**
     * @param expression The mathematical expression that defines the transformation function. You
     *   can specify up to 10 variables per expression. You can specify up to 10 functions per
     *   expression.
     *
     * For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
     * IoT SiteWise User Guide* .
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(vararg variables: Any) {
        _variables.addAll(listOf(*variables))
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(variables: Collection<Any>) {
        _variables.addAll(variables)
    }

    /** @param variables The list of variables used in the expression. */
    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    public fun build(): CfnAssetModel.TransformProperty {
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        return cdkBuilder.build()
    }
}
