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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationNFSDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationNFS.Builder = CfnLocationNFS.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun onPremConfig(onPremConfig: IResolvable) {
        cdkBuilder.onPremConfig(onPremConfig)
    }

    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty) {
        cdkBuilder.onPremConfig(onPremConfig)
    }

    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationNFS {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
