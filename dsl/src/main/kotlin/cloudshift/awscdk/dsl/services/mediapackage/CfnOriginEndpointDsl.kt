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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOriginEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOriginEndpoint.Builder = CfnOriginEndpoint.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _whitelist: MutableList<String> = mutableListOf()

    public fun authorization(authorization: IResolvable) {
        cdkBuilder.authorization(authorization)
    }

    public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
        cdkBuilder.authorization(authorization)
    }

    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    public fun cmafPackage(cmafPackage: IResolvable) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    public fun dashPackage(dashPackage: IResolvable) {
        cdkBuilder.dashPackage(dashPackage)
    }

    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
        cdkBuilder.dashPackage(dashPackage)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun hlsPackage(hlsPackage: IResolvable) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    public fun mssPackage(mssPackage: IResolvable) {
        cdkBuilder.mssPackage(mssPackage)
    }

    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
        cdkBuilder.mssPackage(mssPackage)
    }

    public fun origination(origination: String) {
        cdkBuilder.origination(origination)
    }

    public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
        cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    public fun whitelist(vararg whitelist: String) {
        _whitelist.addAll(listOf(*whitelist))
    }

    public fun whitelist(whitelist: Collection<String>) {
        _whitelist.addAll(whitelist)
    }

    public fun build(): CfnOriginEndpoint {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_whitelist.isNotEmpty()) cdkBuilder.whitelist(_whitelist)
        return cdkBuilder.build()
    }
}
