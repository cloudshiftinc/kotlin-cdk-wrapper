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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import kotlin.String

@CdkDslMarker
public class CfnTaskTemplateDefaultFieldValuePropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.DefaultFieldValueProperty.Builder =
        CfnTaskTemplate.DefaultFieldValueProperty.builder()

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnTaskTemplate.DefaultFieldValueProperty = cdkBuilder.build()
}
