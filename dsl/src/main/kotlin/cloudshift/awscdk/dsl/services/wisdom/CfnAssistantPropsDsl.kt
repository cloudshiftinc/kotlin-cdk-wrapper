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

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssistantPropsDsl {
    private val cdkBuilder: CfnAssistantProps.Builder = CfnAssistantProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAssistantProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
