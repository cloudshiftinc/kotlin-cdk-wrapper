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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnStorageLensEncryptionPropertyDsl {
    private val cdkBuilder: CfnStorageLens.EncryptionProperty.Builder =
        CfnStorageLens.EncryptionProperty.builder()

    public fun ssekms(ssekms: IResolvable) {
        cdkBuilder.ssekms(ssekms)
    }

    public fun ssekms(ssekms: CfnStorageLens.SSEKMSProperty) {
        cdkBuilder.ssekms(ssekms)
    }

    public fun sses3(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.sses3(builder.map)
    }

    public fun sses3(sses3: Any) {
        cdkBuilder.sses3(sses3)
    }

    public fun build(): CfnStorageLens.EncryptionProperty = cdkBuilder.build()
}
