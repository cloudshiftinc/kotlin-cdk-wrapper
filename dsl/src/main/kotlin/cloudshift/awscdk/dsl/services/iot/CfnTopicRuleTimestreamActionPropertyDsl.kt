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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicRuleTimestreamActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamActionProperty.Builder =
        CfnTopicRule.TimestreamActionProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun timestamp(timestamp: CfnTopicRule.TimestreamTimestampProperty) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun build(): CfnTopicRule.TimestreamActionProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
