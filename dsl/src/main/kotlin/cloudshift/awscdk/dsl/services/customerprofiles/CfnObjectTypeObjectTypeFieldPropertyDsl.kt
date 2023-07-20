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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import kotlin.String

@CdkDslMarker
public class CfnObjectTypeObjectTypeFieldPropertyDsl {
    private val cdkBuilder: CfnObjectType.ObjectTypeFieldProperty.Builder =
        CfnObjectType.ObjectTypeFieldProperty.builder()

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnObjectType.ObjectTypeFieldProperty = cdkBuilder.build()
}
