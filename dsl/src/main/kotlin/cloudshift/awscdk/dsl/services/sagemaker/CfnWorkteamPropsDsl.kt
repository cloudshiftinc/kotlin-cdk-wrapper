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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkteamPropsDsl {
    private val cdkBuilder: CfnWorkteamProps.Builder = CfnWorkteamProps.builder()

    private val _memberDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun memberDefinitions(vararg memberDefinitions: Any) {
        _memberDefinitions.addAll(listOf(*memberDefinitions))
    }

    public fun memberDefinitions(memberDefinitions: Collection<Any>) {
        _memberDefinitions.addAll(memberDefinitions)
    }

    public fun memberDefinitions(memberDefinitions: IResolvable) {
        cdkBuilder.memberDefinitions(memberDefinitions)
    }

    public fun notificationConfiguration(notificationConfiguration: IResolvable) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    public fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun workforceName(workforceName: String) {
        cdkBuilder.workforceName(workforceName)
    }

    public fun workteamName(workteamName: String) {
        cdkBuilder.workteamName(workteamName)
    }

    public fun build(): CfnWorkteamProps {
        if (_memberDefinitions.isNotEmpty()) cdkBuilder.memberDefinitions(_memberDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
