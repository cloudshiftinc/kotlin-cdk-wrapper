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
import kotlin.String

@CdkDslMarker
public class CfnFormFormCTAPropertyDsl {
    private val cdkBuilder: CfnForm.FormCTAProperty.Builder = CfnForm.FormCTAProperty.builder()

    public fun cancel(cancel: IResolvable) {
        cdkBuilder.cancel(cancel)
    }

    public fun cancel(cancel: CfnForm.FormButtonProperty) {
        cdkBuilder.cancel(cancel)
    }

    public fun clear(clear: IResolvable) {
        cdkBuilder.clear(clear)
    }

    public fun clear(clear: CfnForm.FormButtonProperty) {
        cdkBuilder.clear(clear)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun submit(submit: IResolvable) {
        cdkBuilder.submit(submit)
    }

    public fun submit(submit: CfnForm.FormButtonProperty) {
        cdkBuilder.submit(submit)
    }

    public fun build(): CfnForm.FormCTAProperty = cdkBuilder.build()
}
