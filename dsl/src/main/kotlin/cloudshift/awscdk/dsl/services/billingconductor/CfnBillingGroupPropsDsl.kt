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

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBillingGroupPropsDsl {
    private val cdkBuilder: CfnBillingGroupProps.Builder = CfnBillingGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accountGrouping(accountGrouping: IResolvable) {
        cdkBuilder.accountGrouping(accountGrouping)
    }

    public fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty) {
        cdkBuilder.accountGrouping(accountGrouping)
    }

    public fun computationPreference(computationPreference: IResolvable) {
        cdkBuilder.computationPreference(computationPreference)
    }

    public fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty) {
        cdkBuilder.computationPreference(computationPreference)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun primaryAccountId(primaryAccountId: String) {
        cdkBuilder.primaryAccountId(primaryAccountId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBillingGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
