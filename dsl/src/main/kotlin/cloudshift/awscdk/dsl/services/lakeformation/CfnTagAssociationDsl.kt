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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTagAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTagAssociation.Builder = CfnTagAssociation.Builder.create(scope, id)

    private val _lfTags: MutableList<Any> = mutableListOf()

    public fun lfTags(vararg lfTags: Any) {
        _lfTags.addAll(listOf(*lfTags))
    }

    public fun lfTags(lfTags: Collection<Any>) {
        _lfTags.addAll(lfTags)
    }

    public fun lfTags(lfTags: IResolvable) {
        cdkBuilder.lfTags(lfTags)
    }

    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    public fun resource(resource: CfnTagAssociation.ResourceProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnTagAssociation {
        if (_lfTags.isNotEmpty()) cdkBuilder.lfTags(_lfTags)
        return cdkBuilder.build()
    }
}
