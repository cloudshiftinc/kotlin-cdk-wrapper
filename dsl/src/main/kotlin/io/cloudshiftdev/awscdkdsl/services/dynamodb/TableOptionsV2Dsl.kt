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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.dynamodb.TableOptionsV2
import software.amazon.awscdk.services.kinesis.IStream

/**
 * Options used to configure a DynamoDB table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * import software.amazon.awscdk.services.kinesis.*;
 * Stream stream;
 * TableOptionsV2 tableOptionsV2 = TableOptionsV2.builder()
 * .contributorInsights(false)
 * .deletionProtection(false)
 * .kinesisStream(stream)
 * .pointInTimeRecovery(false)
 * .tableClass(TableClass.STANDARD)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class TableOptionsV2Dsl {
    private val cdkBuilder: TableOptionsV2.Builder = TableOptionsV2.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param contributorInsights Whether CloudWatch contributor insights is enabled. */
    public fun contributorInsights(contributorInsights: Boolean) {
        cdkBuilder.contributorInsights(contributorInsights)
    }

    /** @param deletionProtection Whether deletion protection is enabled. */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /** @param kinesisStream Kinesis Data Stream to capture item level changes. */
    public fun kinesisStream(kinesisStream: IStream) {
        cdkBuilder.kinesisStream(kinesisStream)
    }

    /** @param pointInTimeRecovery Whether point-in-time recovery is enabled. */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
        cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /** @param tableClass The table class. */
    public fun tableClass(tableClass: TableClass) {
        cdkBuilder.tableClass(tableClass)
    }

    /** @param tags Tags to be applied to the table or replica table. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags to be applied to the table or replica table. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): TableOptionsV2 {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
