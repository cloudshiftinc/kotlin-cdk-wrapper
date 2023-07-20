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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnTagOptionPropsDsl {
    private val cdkBuilder: CfnTagOptionProps.Builder = CfnTagOptionProps.builder()

    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTagOptionProps = cdkBuilder.build()
}
