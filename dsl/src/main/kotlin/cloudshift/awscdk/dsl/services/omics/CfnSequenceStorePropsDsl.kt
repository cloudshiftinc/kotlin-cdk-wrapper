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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStoreProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnSequenceStorePropsDsl {
    private val cdkBuilder: CfnSequenceStoreProps.Builder = CfnSequenceStoreProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun fallbackLocation(fallbackLocation: String) {
        cdkBuilder.fallbackLocation(fallbackLocation)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sseConfig(sseConfig: IResolvable) {
        cdkBuilder.sseConfig(sseConfig)
    }

    public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
        cdkBuilder.sseConfig(sseConfig)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSequenceStoreProps = cdkBuilder.build()
}
