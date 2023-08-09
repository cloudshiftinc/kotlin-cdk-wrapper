@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iotfleetwise

import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

/** The data collection scheme associated with the campaign. */
public inline fun CfnCampaign.setCollectionScheme(
    block: CfnCampaignCollectionSchemePropertyDsl.() -> Unit = {}
) {
    val builder = CfnCampaignCollectionSchemePropertyDsl()
    builder.apply(block)
    return setCollectionScheme(builder.build())
}

/** (Optional) Information about the number of nodes and node types in a vehicle network. */
public inline fun CfnSignalCatalog.setNodeCounts(
    block: CfnSignalCatalogNodeCountsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSignalCatalogNodeCountsPropertyDsl()
    builder.apply(block)
    return setNodeCounts(builder.build())
}
