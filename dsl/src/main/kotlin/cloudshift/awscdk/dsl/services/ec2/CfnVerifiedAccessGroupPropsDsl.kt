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
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVerifiedAccessGroupPropsDsl {
    private val cdkBuilder: CfnVerifiedAccessGroupProps.Builder =
        CfnVerifiedAccessGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyEnabled(policyEnabled: Boolean) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    public fun policyEnabled(policyEnabled: IResolvable) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
        cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): CfnVerifiedAccessGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
