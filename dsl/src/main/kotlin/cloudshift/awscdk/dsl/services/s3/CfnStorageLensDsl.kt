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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStorageLensDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStorageLens.Builder = CfnStorageLens.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
        cdkBuilder.storageLensConfiguration(storageLensConfiguration)
    }

    public fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty) {
        cdkBuilder.storageLensConfiguration(storageLensConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageLens {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
