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

package cloudshift.awscdk.dsl.services.s3.deployment

import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.ISource
import software.amazon.awscdk.services.s3.deployment.SourceConfig
import software.constructs.Construct

/**
 * Binds the source to a bucket deployment.
 *
 * @param scope The construct tree context.
 * @param context
 */
public inline fun ISource.bind(
    arg0: Construct,
    block: DeploymentSourceContextDsl.() -> Unit = {}
): SourceConfig {
    val builder = DeploymentSourceContextDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}
