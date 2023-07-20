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
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationInstance.Builder =
        CfnApplicationInstance.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
        cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
        cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    public fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    public fun manifestPayload(manifestPayload: IResolvable) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    public fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runtimeRoleArn(runtimeRoleArn: String) {
        cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationInstance {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
