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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Boolean

@CdkDslMarker
public class CfnBotMultipleValuesSettingPropertyDsl {
    private val cdkBuilder: CfnBot.MultipleValuesSettingProperty.Builder =
        CfnBot.MultipleValuesSettingProperty.builder()

    public fun allowMultipleValues(allowMultipleValues: Boolean) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
    }

    public fun allowMultipleValues(allowMultipleValues: IResolvable) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
    }

    public fun build(): CfnBot.MultipleValuesSettingProperty = cdkBuilder.build()
}
