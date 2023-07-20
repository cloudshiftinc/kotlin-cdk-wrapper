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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLifecyclePolicyPropsDsl {
    private val cdkBuilder: CfnLifecyclePolicyProps.Builder = CfnLifecyclePolicyProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun policyDetails(policyDetails: IResolvable) {
        cdkBuilder.policyDetails(policyDetails)
    }

    public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
        cdkBuilder.policyDetails(policyDetails)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLifecyclePolicyProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
