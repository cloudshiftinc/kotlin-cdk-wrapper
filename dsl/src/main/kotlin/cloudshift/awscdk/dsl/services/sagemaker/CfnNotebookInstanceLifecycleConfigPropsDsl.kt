@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps

/**
 * Properties for defining a `CfnNotebookInstanceLifecycleConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnNotebookInstanceLifecycleConfigProps cfnNotebookInstanceLifecycleConfigProps =
 * CfnNotebookInstanceLifecycleConfigProps.builder()
 * .notebookInstanceLifecycleConfigName("notebookInstanceLifecycleConfigName")
 * .onCreate(List.of(NotebookInstanceLifecycleHookProperty.builder()
 * .content("content")
 * .build()))
 * .onStart(List.of(NotebookInstanceLifecycleHookProperty.builder()
 * .content("content")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html)
 */
@CdkDslMarker
public class CfnNotebookInstanceLifecycleConfigPropsDsl {
    private val cdkBuilder: CfnNotebookInstanceLifecycleConfigProps.Builder =
        CfnNotebookInstanceLifecycleConfigProps.builder()

    private val _onCreate: MutableList<Any> = mutableListOf()

    private val _onStart: MutableList<Any> = mutableListOf()

    /** @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration. */
    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
        cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance. The
     *   shell script must be a base64-encoded string.
     */
    public fun onCreate(vararg onCreate: Any) {
        _onCreate.addAll(listOf(*onCreate))
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance. The
     *   shell script must be a base64-encoded string.
     */
    public fun onCreate(onCreate: Collection<Any>) {
        _onCreate.addAll(onCreate)
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance. The
     *   shell script must be a base64-encoded string.
     */
    public fun onCreate(onCreate: IResolvable) {
        cdkBuilder.onCreate(onCreate)
    }

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance. The shell script must be a base64-encoded string.
     */
    public fun onStart(vararg onStart: Any) {
        _onStart.addAll(listOf(*onStart))
    }

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance. The shell script must be a base64-encoded string.
     */
    public fun onStart(onStart: Collection<Any>) {
        _onStart.addAll(onStart)
    }

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance. The shell script must be a base64-encoded string.
     */
    public fun onStart(onStart: IResolvable) {
        cdkBuilder.onStart(onStart)
    }

    public fun build(): CfnNotebookInstanceLifecycleConfigProps {
        if (_onCreate.isNotEmpty()) cdkBuilder.onCreate(_onCreate)
        if (_onStart.isNotEmpty()) cdkBuilder.onStart(_onStart)
        return cdkBuilder.build()
    }
}
