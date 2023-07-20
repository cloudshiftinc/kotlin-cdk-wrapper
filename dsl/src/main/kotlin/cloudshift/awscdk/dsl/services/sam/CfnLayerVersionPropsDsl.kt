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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLayerVersionPropsDsl {
    private val cdkBuilder: CfnLayerVersionProps.Builder = CfnLayerVersionProps.builder()

    private val _compatibleRuntimes: MutableList<String> = mutableListOf()

    public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
        _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
    }

    public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
        _compatibleRuntimes.addAll(compatibleRuntimes)
    }

    public fun contentUri(contentUri: String) {
        cdkBuilder.contentUri(contentUri)
    }

    public fun contentUri(contentUri: IResolvable) {
        cdkBuilder.contentUri(contentUri)
    }

    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
        cdkBuilder.contentUri(contentUri)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun layerName(layerName: String) {
        cdkBuilder.layerName(layerName)
    }

    public fun licenseInfo(licenseInfo: String) {
        cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun retentionPolicy(retentionPolicy: String) {
        cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): CfnLayerVersionProps {
        if (_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
        return cdkBuilder.build()
    }
}
