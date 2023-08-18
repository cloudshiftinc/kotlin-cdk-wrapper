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

package io.cloudshiftdev.awscdkdsl.services.qldb

import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream

/** The configuration settings of the Kinesis Data Streams destination for your stream request. */
public inline fun CfnStream.setKinesisConfiguration(
    block: CfnStreamKinesisConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamKinesisConfigurationPropertyDsl()
    builder.apply(block)
    return setKinesisConfiguration(builder.build())
}
