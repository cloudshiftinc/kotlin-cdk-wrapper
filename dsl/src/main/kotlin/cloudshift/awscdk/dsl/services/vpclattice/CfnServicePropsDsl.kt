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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServicePropsDsl {
    private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun customDomainName(customDomainName: String) {
        cdkBuilder.customDomainName(customDomainName)
    }

    public fun dnsEntry(dnsEntry: IResolvable) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    public fun dnsEntry(dnsEntry: CfnService.DnsEntryProperty) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
