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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import kotlin.String

@CdkDslMarker
public class CfnObjectTypeFieldMapPropertyDsl {
    private val cdkBuilder: CfnObjectType.FieldMapProperty.Builder =
        CfnObjectType.FieldMapProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun objectTypeField(objectTypeField: IResolvable) {
        cdkBuilder.objectTypeField(objectTypeField)
    }

    public fun objectTypeField(objectTypeField: CfnObjectType.ObjectTypeFieldProperty) {
        cdkBuilder.objectTypeField(objectTypeField)
    }

    public fun build(): CfnObjectType.FieldMapProperty = cdkBuilder.build()
}
