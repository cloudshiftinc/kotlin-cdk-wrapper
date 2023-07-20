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

package cloudshift.awscdk.dsl.services.sdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sdb.CfnDomainProps
import kotlin.String

@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnDomainProps = cdkBuilder.build()
}
