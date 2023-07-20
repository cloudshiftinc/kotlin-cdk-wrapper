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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.Selector
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FargateProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FargateProfile.Builder = FargateProfile.Builder.create(scope, id)

    private val _selectors: MutableList<Selector> = mutableListOf()

    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun fargateProfileName(fargateProfileName: String) {
        cdkBuilder.fargateProfileName(fargateProfileName)
    }

    public fun podExecutionRole(podExecutionRole: IRole) {
        cdkBuilder.podExecutionRole(podExecutionRole)
    }

    public fun selectors(selectors: SelectorDsl.() -> Unit) {
        _selectors.add(SelectorDsl().apply(selectors).build())
    }

    public fun selectors(selectors: Collection<Selector>) {
        _selectors.addAll(selectors)
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

    public fun build(): FargateProfile {
        if (_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
        return cdkBuilder.build()
    }
}
