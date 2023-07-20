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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnContactContactTargetInfoPropertyDsl {
    private val cdkBuilder: CfnContact.ContactTargetInfoProperty.Builder =
        CfnContact.ContactTargetInfoProperty.builder()

    public fun contactId(contactId: String) {
        cdkBuilder.contactId(contactId)
    }

    public fun isEssential(isEssential: Boolean) {
        cdkBuilder.isEssential(isEssential)
    }

    public fun isEssential(isEssential: IResolvable) {
        cdkBuilder.isEssential(isEssential)
    }

    public fun build(): CfnContact.ContactTargetInfoProperty = cdkBuilder.build()
}
