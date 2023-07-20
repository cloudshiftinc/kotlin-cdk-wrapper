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
import kotlin.String

@CdkDslMarker
public class CfnFormFormButtonPropertyDsl {
    private val cdkBuilder: CfnForm.FormButtonProperty.Builder = CfnForm.FormButtonProperty.builder()

    public fun children(children: String) {
        cdkBuilder.children(children)
    }

    public fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
    }

    public fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded)
    }

    public fun position(position: IResolvable) {
        cdkBuilder.position(position)
    }

    public fun position(position: CfnForm.FieldPositionProperty) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnForm.FormButtonProperty = cdkBuilder.build()
}
