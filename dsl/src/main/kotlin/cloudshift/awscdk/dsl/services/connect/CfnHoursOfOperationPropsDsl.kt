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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnHoursOfOperationPropsDsl {
    private val cdkBuilder: CfnHoursOfOperationProps.Builder = CfnHoursOfOperationProps.builder()

    private val _config: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun config(vararg config: Any) {
        _config.addAll(listOf(*config))
    }

    public fun config(config: Collection<Any>) {
        _config.addAll(config)
    }

    public fun config(config: IResolvable) {
        cdkBuilder.config(config)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
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

    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnHoursOfOperationProps {
        if (_config.isNotEmpty()) cdkBuilder.config(_config)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
