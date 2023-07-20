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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.amazon.awscdk.services.iot.CfnMitigationActionProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMitigationActionPropsDsl {
    private val cdkBuilder: CfnMitigationActionProps.Builder = CfnMitigationActionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun actionParams(actionParams: IResolvable) {
        cdkBuilder.actionParams(actionParams)
    }

    public fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty) {
        cdkBuilder.actionParams(actionParams)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMitigationActionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
