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

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.amazon.awscdk.services.signer.CfnSigningProfileProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSigningProfilePropsDsl {
    private val cdkBuilder: CfnSigningProfileProps.Builder = CfnSigningProfileProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun platformId(platformId: String) {
        cdkBuilder.platformId(platformId)
    }

    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
        cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
    }

    public fun signatureValidityPeriod(signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty) {
        cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSigningProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
