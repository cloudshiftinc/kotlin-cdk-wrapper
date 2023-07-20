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
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPackagingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPackagingConfiguration.Builder =
        CfnPackagingConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cmafPackage(cmafPackage: IResolvable) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    public fun dashPackage(dashPackage: IResolvable) {
        cdkBuilder.dashPackage(dashPackage)
    }

    public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
        cdkBuilder.dashPackage(dashPackage)
    }

    public fun hlsPackage(hlsPackage: IResolvable) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun mssPackage(mssPackage: IResolvable) {
        cdkBuilder.mssPackage(mssPackage)
    }

    public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
        cdkBuilder.mssPackage(mssPackage)
    }

    public fun packagingGroupId(packagingGroupId: String) {
        cdkBuilder.packagingGroupId(packagingGroupId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackagingConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
