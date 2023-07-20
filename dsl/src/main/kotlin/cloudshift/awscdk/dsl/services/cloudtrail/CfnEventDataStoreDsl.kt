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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventDataStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventDataStore.Builder = CfnEventDataStore.Builder.create(scope, id)

    private val _advancedEventSelectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun advancedEventSelectors(vararg advancedEventSelectors: Any) {
        _advancedEventSelectors.addAll(listOf(*advancedEventSelectors))
    }

    public fun advancedEventSelectors(advancedEventSelectors: Collection<Any>) {
        _advancedEventSelectors.addAll(advancedEventSelectors)
    }

    public fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
        cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    public fun ingestionEnabled(ingestionEnabled: Boolean) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    public fun ingestionEnabled(ingestionEnabled: IResolvable) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun multiRegionEnabled(multiRegionEnabled: Boolean) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    public fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun organizationEnabled(organizationEnabled: Boolean) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    public fun organizationEnabled(organizationEnabled: IResolvable) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    public fun retentionPeriod(retentionPeriod: Number) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    public fun build(): CfnEventDataStore {
        if (_advancedEventSelectors.isNotEmpty()) {
            cdkBuilder.advancedEventSelectors(_advancedEventSelectors)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
