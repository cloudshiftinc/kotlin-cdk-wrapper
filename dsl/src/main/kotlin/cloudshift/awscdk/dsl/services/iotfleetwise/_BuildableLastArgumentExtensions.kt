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

package cloudshift.awscdk.dsl.services.iotfleetwise

import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import kotlin.Unit

public inline fun CfnSignalCatalog.setNodeCounts(
    block: CfnSignalCatalogNodeCountsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSignalCatalogNodeCountsPropertyDsl()
    builder.apply(block)
    return setNodeCounts(builder.build())
}

public inline fun CfnCampaign.setCollectionScheme(
    block: CfnCampaignCollectionSchemePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCampaignCollectionSchemePropertyDsl()
    builder.apply(block)
    return setCollectionScheme(builder.build())
}
