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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnWebACLAssociationConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.AssociationConfigProperty.Builder =
        CfnWebACL.AssociationConfigProperty.builder()

    public fun requestBody(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.requestBody(builder.map)
    }

    public fun requestBody(requestBody: Map<String, Any>) {
        cdkBuilder.requestBody(requestBody)
    }

    public fun requestBody(requestBody: IResolvable) {
        cdkBuilder.requestBody(requestBody)
    }

    public fun build(): CfnWebACL.AssociationConfigProperty = cdkBuilder.build()
}
