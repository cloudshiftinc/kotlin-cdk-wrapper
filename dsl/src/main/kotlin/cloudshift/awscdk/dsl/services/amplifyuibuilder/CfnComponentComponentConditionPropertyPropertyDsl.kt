@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import kotlin.String

@CdkDslMarker
public class CfnComponentComponentConditionPropertyPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentConditionPropertyProperty.Builder =
        CfnComponent.ComponentConditionPropertyProperty.builder()

    public fun elseValue(elseValue: IResolvable) {
        cdkBuilder.elseValue(elseValue)
    }

    public fun elseValue(elseValue: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.elseValue(elseValue)
    }

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun operand(operand: String) {
        cdkBuilder.operand(operand)
    }

    public fun operandType(operandType: String) {
        cdkBuilder.operandType(operandType)
    }

    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    public fun then(then: IResolvable) {
        cdkBuilder.then(then)
    }

    public fun then(then: CfnComponent.ComponentPropertyProperty) {
        cdkBuilder.then(then)
    }

    public fun build(): CfnComponent.ComponentConditionPropertyProperty = cdkBuilder.build()
}
