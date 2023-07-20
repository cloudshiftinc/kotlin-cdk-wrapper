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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDiskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDisk.Builder = CfnDisk.Builder.create(scope, id)

    private val _addOns: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun addOns(vararg addOns: Any) {
        _addOns.addAll(listOf(*addOns))
    }

    public fun addOns(addOns: Collection<Any>) {
        _addOns.addAll(addOns)
    }

    public fun addOns(addOns: IResolvable) {
        cdkBuilder.addOns(addOns)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun diskName(diskName: String) {
        cdkBuilder.diskName(diskName)
    }

    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    public fun location(location: CfnDisk.LocationProperty) {
        cdkBuilder.location(location)
    }

    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDisk {
        if (_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
