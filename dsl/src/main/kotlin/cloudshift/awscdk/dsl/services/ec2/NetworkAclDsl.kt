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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class NetworkAclDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NetworkAcl.Builder = NetworkAcl.Builder.create(scope, id)

    public fun networkAclName(networkAclName: String) {
        cdkBuilder.networkAclName(networkAclName)
    }

    public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnetSelection(builder.build())
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkAcl = cdkBuilder.build()
}
