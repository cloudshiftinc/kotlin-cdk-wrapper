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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.IAction
import software.amazon.awscdk.services.codepipeline.StageProps
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class StagePropsDsl {
    private val cdkBuilder: StageProps.Builder = StageProps.builder()

    private val _actions: MutableList<IAction> = mutableListOf()

    public fun actions(vararg actions: IAction) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<IAction>) {
        _actions.addAll(actions)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun transitionDisabledReason(transitionDisabledReason: String) {
        cdkBuilder.transitionDisabledReason(transitionDisabledReason)
    }

    public fun transitionToEnabled(transitionToEnabled: Boolean) {
        cdkBuilder.transitionToEnabled(transitionToEnabled)
    }

    public fun build(): StageProps {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
