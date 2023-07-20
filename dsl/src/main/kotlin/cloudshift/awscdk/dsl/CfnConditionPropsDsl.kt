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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnConditionProps
import software.amazon.awscdk.ICfnConditionExpression

@CdkDslMarker
public class CfnConditionPropsDsl {
    private val cdkBuilder: CfnConditionProps.Builder = CfnConditionProps.builder()

    public fun expression(expression: ICfnConditionExpression) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnConditionProps = cdkBuilder.build()
}
