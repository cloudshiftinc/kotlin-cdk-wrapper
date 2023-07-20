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
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnAccessPointProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAccessPointPropsDsl {
    private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun policy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policy(builder.map)
    }

    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnAccessPointProps = cdkBuilder.build()
}
