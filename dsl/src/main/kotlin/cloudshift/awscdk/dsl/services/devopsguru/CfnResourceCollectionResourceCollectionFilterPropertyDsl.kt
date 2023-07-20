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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceCollectionResourceCollectionFilterPropertyDsl {
    private val cdkBuilder: CfnResourceCollection.ResourceCollectionFilterProperty.Builder =
        CfnResourceCollection.ResourceCollectionFilterProperty.builder()

    private val _tags: MutableList<CfnResourceCollection.TagCollectionProperty> = mutableListOf()

    public fun cloudFormation(cloudFormation: IResolvable) {
        cdkBuilder.cloudFormation(cloudFormation)
    }

    public fun cloudFormation(cloudFormation: CfnResourceCollection.CloudFormationCollectionFilterProperty) {
        cdkBuilder.cloudFormation(cloudFormation)
    }

    public fun tags(tags: CfnResourceCollectionTagCollectionPropertyDsl.() -> Unit) {
        _tags.add(CfnResourceCollectionTagCollectionPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnResourceCollection.TagCollectionProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceCollection.ResourceCollectionFilterProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
