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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnIndex
import kotlin.String

@CdkDslMarker
public class CfnIndexJsonTokenTypeConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.JsonTokenTypeConfigurationProperty.Builder =
        CfnIndex.JsonTokenTypeConfigurationProperty.builder()

    public fun groupAttributeField(groupAttributeField: String) {
        cdkBuilder.groupAttributeField(groupAttributeField)
    }

    public fun userNameAttributeField(userNameAttributeField: String) {
        cdkBuilder.userNameAttributeField(userNameAttributeField)
    }

    public fun build(): CfnIndex.JsonTokenTypeConfigurationProperty = cdkBuilder.build()
}
