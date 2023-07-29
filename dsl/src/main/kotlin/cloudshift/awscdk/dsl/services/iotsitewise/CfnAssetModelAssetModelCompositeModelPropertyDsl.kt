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
 * Contains information about a composite model in an asset model.
 *
 * This object contains the asset property definitions that you define in the composite model. You
 * can use composite asset models to define alarms on this asset model.
 *
 * If you use the `AssetModelCompositeModel` property to create an alarm, you must use the following
 * information to define three asset model properties:
 * * Use an asset model property to specify the alarm type.
 * * The name must be `AWS/ALARM_TYPE` .
 * * The data type must be `STRING` .
 * * For the `Type` property, the type name must be `Attribute` and the default value must be
 *   `IOT_EVENTS` .
 * * Use an asset model property to specify the alarm source.
 * * The name must be `AWS/ALARM_SOURCE` .
 * * The data type must be `STRING` .
 * * For the `Type` property, the type name must be `Attribute` and the default value must be the
 *   ARN of the alarm model that you created in AWS IoT Events .
 *
 * For the ARN of the alarm model, you can use the `Fn::Sub` intrinsic function to substitute the
 * `AWS::Partition` , `AWS::Region` , and `AWS::AccountId` variables in an input string with values
 * that you specify.
 *
 * For example, `Fn::Sub:
 * "arn:${AWS::Partition}:iotevents:${AWS::Region}:${AWS::AccountId}:alarmModel/TestAlarmModel"` .
 *
 * Replace `TestAlarmModel` with the name of your alarm model.
 *
 * For more information about using the `Fn::Sub` intrinsic function, see
 * [Fn::Sub](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-sub.html)
 * .
 * * Use an asset model property to specify the state of the alarm.
 * * The name must be `AWS/ALARM_STATE` .
 * * The data type must be `STRUCT` .
 * * The `DataTypeSpec` value must be `AWS/ALARM_STATE` .
 * * For the `Type` property, the type name must be `Measurement` .
 *
 * At the bottom of this page, we provide a YAML example that you can modify to create an alarm.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AssetModelCompositeModelProperty assetModelCompositeModelProperty =
 * AssetModelCompositeModelProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
 * .dataType("dataType")
 * .logicalId("logicalId")
 * .name("name")
 * .type(PropertyTypeProperty.builder()
 * .typeName("typeName")
 * // the properties below are optional
 * .attribute(AttributeProperty.builder()
 * .defaultValue("defaultValue")
 * .build())
 * .metric(MetricProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .window(MetricWindowProperty.builder()
 * .tumbling(TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build())
 * .build())
 * .build())
 * .transform(TransformProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .dataTypeSpec("dataTypeSpec")
 * .unit("unit")
 * .build()))
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html)
 */
@CdkDslMarker
public class CfnAssetModelAssetModelCompositeModelPropertyDsl {
    private val cdkBuilder: CfnAssetModel.AssetModelCompositeModelProperty.Builder =
        CfnAssetModel.AssetModelCompositeModelProperty.builder()

    private val _compositeModelProperties: MutableList<Any> = mutableListOf()

    /** @param compositeModelProperties The asset property definitions for this composite model. */
    public fun compositeModelProperties(vararg compositeModelProperties: Any) {
        _compositeModelProperties.addAll(listOf(*compositeModelProperties))
    }

    /** @param compositeModelProperties The asset property definitions for this composite model. */
    public fun compositeModelProperties(compositeModelProperties: Collection<Any>) {
        _compositeModelProperties.addAll(compositeModelProperties)
    }

    /** @param compositeModelProperties The asset property definitions for this composite model. */
    public fun compositeModelProperties(compositeModelProperties: IResolvable) {
        cdkBuilder.compositeModelProperties(compositeModelProperties)
    }

    /** @param description The description of the composite model. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the composite model. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of the composite model. For alarm composite models, this type is
     *   `AWS/ALARM` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAssetModel.AssetModelCompositeModelProperty {
        if (_compositeModelProperties.isNotEmpty())
            cdkBuilder.compositeModelProperties(_compositeModelProperties)
        return cdkBuilder.build()
    }
}
