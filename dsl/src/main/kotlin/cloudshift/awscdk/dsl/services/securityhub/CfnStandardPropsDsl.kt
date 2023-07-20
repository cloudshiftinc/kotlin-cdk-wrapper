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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnStandardProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStandardPropsDsl {
    private val cdkBuilder: CfnStandardProps.Builder = CfnStandardProps.builder()

    private val _disabledStandardsControls: MutableList<Any> = mutableListOf()

    public fun disabledStandardsControls(vararg disabledStandardsControls: Any) {
        _disabledStandardsControls.addAll(listOf(*disabledStandardsControls))
    }

    public fun disabledStandardsControls(disabledStandardsControls: Collection<Any>) {
        _disabledStandardsControls.addAll(disabledStandardsControls)
    }

    public fun disabledStandardsControls(disabledStandardsControls: IResolvable) {
        cdkBuilder.disabledStandardsControls(disabledStandardsControls)
    }

    public fun standardsArn(standardsArn: String) {
        cdkBuilder.standardsArn(standardsArn)
    }

    public fun build(): CfnStandardProps {
        if (_disabledStandardsControls.isNotEmpty()) {
            cdkBuilder.disabledStandardsControls(_disabledStandardsControls)
        }
        return cdkBuilder.build()
    }
}
