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
public class CfnTopicRuleIotSiteWiseActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.IotSiteWiseActionProperty.Builder =
        CfnTopicRule.IotSiteWiseActionProperty.builder()

    private val _putAssetPropertyValueEntries: MutableList<Any> = mutableListOf()

    public fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any) {
        _putAssetPropertyValueEntries.addAll(listOf(*putAssetPropertyValueEntries))
    }

    public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: Collection<Any>) {
        _putAssetPropertyValueEntries.addAll(putAssetPropertyValueEntries)
    }

    public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.IotSiteWiseActionProperty {
        if (_putAssetPropertyValueEntries.isNotEmpty()) {
            cdkBuilder.putAssetPropertyValueEntries(_putAssetPropertyValueEntries)
        }
        return cdkBuilder.build()
    }
}
