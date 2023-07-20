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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackage
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPackageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPackage.Builder = CfnPackage.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun packageName(packageName: String) {
        cdkBuilder.packageName(packageName)
    }

    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackage {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
