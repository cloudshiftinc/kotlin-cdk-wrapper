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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIntegrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIntegration.Builder = CfnIntegration.Builder.create(scope, id)

    private val _objectTypeNames: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun flowDefinition(flowDefinition: IResolvable) {
        cdkBuilder.flowDefinition(flowDefinition)
    }

    public fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty) {
        cdkBuilder.flowDefinition(flowDefinition)
    }

    public fun objectTypeName(objectTypeName: String) {
        cdkBuilder.objectTypeName(objectTypeName)
    }

    public fun objectTypeNames(vararg objectTypeNames: Any) {
        _objectTypeNames.addAll(listOf(*objectTypeNames))
    }

    public fun objectTypeNames(objectTypeNames: Collection<Any>) {
        _objectTypeNames.addAll(objectTypeNames)
    }

    public fun objectTypeNames(objectTypeNames: IResolvable) {
        cdkBuilder.objectTypeNames(objectTypeNames)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnIntegration {
        if (_objectTypeNames.isNotEmpty()) cdkBuilder.objectTypeNames(_objectTypeNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
