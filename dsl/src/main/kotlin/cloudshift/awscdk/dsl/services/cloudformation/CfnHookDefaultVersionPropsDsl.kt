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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
import kotlin.String

@CdkDslMarker
public class CfnHookDefaultVersionPropsDsl {
    private val cdkBuilder: CfnHookDefaultVersionProps.Builder = CfnHookDefaultVersionProps.builder()

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun typeVersionArn(typeVersionArn: String) {
        cdkBuilder.typeVersionArn(typeVersionArn)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnHookDefaultVersionProps = cdkBuilder.build()
}
