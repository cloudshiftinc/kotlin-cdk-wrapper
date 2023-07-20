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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNotebookInstanceLifecycleConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNotebookInstanceLifecycleConfig.Builder =
        CfnNotebookInstanceLifecycleConfig.Builder.create(scope, id)

    private val _onCreate: MutableList<Any> = mutableListOf()

    private val _onStart: MutableList<Any> = mutableListOf()

    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
        cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    public fun onCreate(vararg onCreate: Any) {
        _onCreate.addAll(listOf(*onCreate))
    }

    public fun onCreate(onCreate: Collection<Any>) {
        _onCreate.addAll(onCreate)
    }

    public fun onCreate(onCreate: IResolvable) {
        cdkBuilder.onCreate(onCreate)
    }

    public fun onStart(vararg onStart: Any) {
        _onStart.addAll(listOf(*onStart))
    }

    public fun onStart(onStart: Collection<Any>) {
        _onStart.addAll(onStart)
    }

    public fun onStart(onStart: IResolvable) {
        cdkBuilder.onStart(onStart)
    }

    public fun build(): CfnNotebookInstanceLifecycleConfig {
        if (_onCreate.isNotEmpty()) cdkBuilder.onCreate(_onCreate)
        if (_onStart.isNotEmpty()) cdkBuilder.onStart(_onStart)
        return cdkBuilder.build()
    }
}
