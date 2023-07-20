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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
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

    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnAccessPoint = cdkBuilder.build()
}
