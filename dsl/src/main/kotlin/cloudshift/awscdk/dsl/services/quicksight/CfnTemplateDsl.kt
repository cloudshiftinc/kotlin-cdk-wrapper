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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTemplate.Builder = CfnTemplate.Builder.create(scope, id)

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    public fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    public fun sourceEntity(sourceEntity: IResolvable) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    public fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnTemplate {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
