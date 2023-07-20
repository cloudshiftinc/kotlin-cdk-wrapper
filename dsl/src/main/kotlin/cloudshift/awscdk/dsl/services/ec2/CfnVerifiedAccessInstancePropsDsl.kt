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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVerifiedAccessInstancePropsDsl {
    private val cdkBuilder: CfnVerifiedAccessInstanceProps.Builder =
        CfnVerifiedAccessInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _verifiedAccessTrustProviderIds: MutableList<String> = mutableListOf()

    private val _verifiedAccessTrustProviders: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun loggingConfigurations(loggingConfigurations: IResolvable) {
        cdkBuilder.loggingConfigurations(loggingConfigurations)
    }

    public fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty) {
        cdkBuilder.loggingConfigurations(loggingConfigurations)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String) {
        _verifiedAccessTrustProviderIds.addAll(listOf(*verifiedAccessTrustProviderIds))
    }

    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: Collection<String>) {
        _verifiedAccessTrustProviderIds.addAll(verifiedAccessTrustProviderIds)
    }

    public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any) {
        _verifiedAccessTrustProviders.addAll(listOf(*verifiedAccessTrustProviders))
    }

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: Collection<Any>) {
        _verifiedAccessTrustProviders.addAll(verifiedAccessTrustProviders)
    }

    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
        cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    public fun build(): CfnVerifiedAccessInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_verifiedAccessTrustProviderIds.isNotEmpty()) {
            cdkBuilder.verifiedAccessTrustProviderIds(_verifiedAccessTrustProviderIds)
        }
        if (_verifiedAccessTrustProviders.isNotEmpty()) {
            cdkBuilder.verifiedAccessTrustProviders(_verifiedAccessTrustProviders)
        }
        return cdkBuilder.build()
    }
}
