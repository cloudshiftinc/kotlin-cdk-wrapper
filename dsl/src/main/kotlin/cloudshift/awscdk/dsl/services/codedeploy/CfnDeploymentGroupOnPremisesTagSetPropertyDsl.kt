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
public class CfnDeploymentGroupOnPremisesTagSetPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder =
        CfnDeploymentGroup.OnPremisesTagSetProperty.builder()

    private val _onPremisesTagSetList: MutableList<Any> = mutableListOf()

    public fun onPremisesTagSetList(vararg onPremisesTagSetList: Any) {
        _onPremisesTagSetList.addAll(listOf(*onPremisesTagSetList))
    }

    public fun onPremisesTagSetList(onPremisesTagSetList: Collection<Any>) {
        _onPremisesTagSetList.addAll(onPremisesTagSetList)
    }

    public fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList)
    }

    public fun build(): CfnDeploymentGroup.OnPremisesTagSetProperty {
        if (_onPremisesTagSetList.isNotEmpty()) cdkBuilder.onPremisesTagSetList(_onPremisesTagSetList)
        return cdkBuilder.build()
    }
}
