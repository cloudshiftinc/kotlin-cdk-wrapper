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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * Specifies a Delta data store to crawl one or more Delta tables.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DeltaTargetProperty deltaTargetProperty = DeltaTargetProperty.builder()
 * .connectionName("connectionName")
 * .createNativeDeltaTable(false)
 * .deltaTables(List.of("deltaTables"))
 * .writeManifest(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-deltatarget.html)
 */
@CdkDslMarker
public class CfnCrawlerDeltaTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.DeltaTargetProperty.Builder =
        CfnCrawler.DeltaTargetProperty.builder()

    private val _deltaTables: MutableList<String> = mutableListOf()

    /**
     * @param connectionName The name of the connection to use to connect to the Delta table target.
     */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /**
     * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
     *   allow integration with query engines that support querying of the Delta transaction log
     *   directly.
     */
    public fun createNativeDeltaTable(createNativeDeltaTable: Boolean) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
    }

    /**
     * @param createNativeDeltaTable Specifies whether the crawler will create native tables, to
     *   allow integration with query engines that support querying of the Delta transaction log
     *   directly.
     */
    public fun createNativeDeltaTable(createNativeDeltaTable: IResolvable) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
    }

    /** @param deltaTables A list of the Amazon S3 paths to the Delta tables. */
    public fun deltaTables(vararg deltaTables: String) {
        _deltaTables.addAll(listOf(*deltaTables))
    }

    /** @param deltaTables A list of the Amazon S3 paths to the Delta tables. */
    public fun deltaTables(deltaTables: Collection<String>) {
        _deltaTables.addAll(deltaTables)
    }

    /**
     * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
     */
    public fun writeManifest(writeManifest: Boolean) {
        cdkBuilder.writeManifest(writeManifest)
    }

    /**
     * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
     */
    public fun writeManifest(writeManifest: IResolvable) {
        cdkBuilder.writeManifest(writeManifest)
    }

    public fun build(): CfnCrawler.DeltaTargetProperty {
        if (_deltaTables.isNotEmpty()) cdkBuilder.deltaTables(_deltaTables)
        return cdkBuilder.build()
    }
}
