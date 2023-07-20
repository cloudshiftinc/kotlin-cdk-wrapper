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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDomainEBSOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.EBSOptionsProperty.Builder =
        CfnDomain.EBSOptionsProperty.builder()

    public fun ebsEnabled(ebsEnabled: Boolean) {
        cdkBuilder.ebsEnabled(ebsEnabled)
    }

    public fun ebsEnabled(ebsEnabled: IResolvable) {
        cdkBuilder.ebsEnabled(ebsEnabled)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnDomain.EBSOptionsProperty = cdkBuilder.build()
}
