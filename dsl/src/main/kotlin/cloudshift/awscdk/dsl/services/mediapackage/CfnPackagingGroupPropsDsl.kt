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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPackagingGroupPropsDsl {
    private val cdkBuilder: CfnPackagingGroupProps.Builder = CfnPackagingGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun authorization(authorization: IResolvable) {
        cdkBuilder.authorization(authorization)
    }

    public fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty) {
        cdkBuilder.authorization(authorization)
    }

    public fun egressAccessLogs(egressAccessLogs: IResolvable) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    public fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackagingGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
