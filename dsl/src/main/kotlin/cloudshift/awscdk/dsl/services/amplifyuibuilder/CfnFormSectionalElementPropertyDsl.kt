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
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFormSectionalElementPropertyDsl {
    private val cdkBuilder: CfnForm.SectionalElementProperty.Builder =
        CfnForm.SectionalElementProperty.builder()

    public fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
    }

    public fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded)
    }

    public fun level(level: Number) {
        cdkBuilder.level(level)
    }

    public fun orientation(orientation: String) {
        cdkBuilder.orientation(orientation)
    }

    public fun position(position: IResolvable) {
        cdkBuilder.position(position)
    }

    public fun position(position: CfnForm.FieldPositionProperty) {
        cdkBuilder.position(position)
    }

    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnForm.SectionalElementProperty = cdkBuilder.build()
}
