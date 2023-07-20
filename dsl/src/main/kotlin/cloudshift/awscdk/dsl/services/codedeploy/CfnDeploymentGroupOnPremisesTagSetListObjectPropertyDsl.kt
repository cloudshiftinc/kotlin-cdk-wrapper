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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder =
        CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.builder()

    private val _onPremisesTagGroup: MutableList<Any> = mutableListOf()

    public fun onPremisesTagGroup(vararg onPremisesTagGroup: Any) {
        _onPremisesTagGroup.addAll(listOf(*onPremisesTagGroup))
    }

    public fun onPremisesTagGroup(onPremisesTagGroup: Collection<Any>) {
        _onPremisesTagGroup.addAll(onPremisesTagGroup)
    }

    public fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
        cdkBuilder.onPremisesTagGroup(onPremisesTagGroup)
    }

    public fun build(): CfnDeploymentGroup.OnPremisesTagSetListObjectProperty {
        if (_onPremisesTagGroup.isNotEmpty()) cdkBuilder.onPremisesTagGroup(_onPremisesTagGroup)
        return cdkBuilder.build()
    }
}
