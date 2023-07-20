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
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssistantAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssistantAssociation.Builder =
        CfnAssistantAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assistantId(assistantId: String) {
        cdkBuilder.assistantId(assistantId)
    }

    public fun association(association: IResolvable) {
        cdkBuilder.association(association)
    }

    public fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
        cdkBuilder.association(association)
    }

    public fun associationType(associationType: String) {
        cdkBuilder.associationType(associationType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssistantAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
