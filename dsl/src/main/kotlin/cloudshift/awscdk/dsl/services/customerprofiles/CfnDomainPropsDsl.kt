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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnDomainProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
        cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    public fun defaultEncryptionKey(defaultEncryptionKey: String) {
        cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    public fun defaultExpirationDays(defaultExpirationDays: Number) {
        cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomainProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
