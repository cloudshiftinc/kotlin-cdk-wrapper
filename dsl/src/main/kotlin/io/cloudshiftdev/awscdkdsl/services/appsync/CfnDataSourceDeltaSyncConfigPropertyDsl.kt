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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * Describes a Delta Sync configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * DeltaSyncConfigProperty deltaSyncConfigProperty = DeltaSyncConfigProperty.builder()
 * .baseTableTtl("baseTableTtl")
 * .deltaSyncTableName("deltaSyncTableName")
 * .deltaSyncTableTtl("deltaSyncTableTtl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceDeltaSyncConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.DeltaSyncConfigProperty.Builder =
        CfnDataSource.DeltaSyncConfigProperty.builder()

    /** @param baseTableTtl The number of minutes that an Item is stored in the data source. */
    public fun baseTableTtl(baseTableTtl: String) {
        cdkBuilder.baseTableTtl(baseTableTtl)
    }

    /** @param deltaSyncTableName The Delta Sync table name. */
    public fun deltaSyncTableName(deltaSyncTableName: String) {
        cdkBuilder.deltaSyncTableName(deltaSyncTableName)
    }

    /**
     * @param deltaSyncTableTtl The number of minutes that a Delta Sync log entry is stored in the
     *   Delta Sync table.
     */
    public fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
        cdkBuilder.deltaSyncTableTtl(deltaSyncTableTtl)
    }

    public fun build(): CfnDataSource.DeltaSyncConfigProperty = cdkBuilder.build()
}
