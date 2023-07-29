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
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.constructs.Construct

/**
 * The `AWS::SageMaker::NotebookInstanceLifecycleConfig` resource creates shell scripts that run
 * when you create and/or start a notebook instance.
 *
 * For information about notebook instance lifecycle configurations, see
 * [Customize a Notebook Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html)
 * in the *Amazon SageMaker Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnNotebookInstanceLifecycleConfig cfnNotebookInstanceLifecycleConfig =
 * CfnNotebookInstanceLifecycleConfig.Builder.create(this, "MyCfnNotebookInstanceLifecycleConfig")
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
public class CfnNotebookInstanceLifecycleConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNotebookInstanceLifecycleConfig.Builder =
        CfnNotebookInstanceLifecycleConfig.Builder.create(scope, id)

    private val _onCreate: MutableList<Any> = mutableListOf()

    private val _onStart: MutableList<Any> = mutableListOf()

    /**
     * The name of the lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
     *
     * @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration.
     */
    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
        cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     *
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     */
    public fun onCreate(vararg onCreate: Any) {
        _onCreate.addAll(listOf(*onCreate))
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     *
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     */
    public fun onCreate(onCreate: Collection<Any>) {
        _onCreate.addAll(onCreate)
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     *
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     */
    public fun onCreate(onCreate: IResolvable) {
        cdkBuilder.onCreate(onCreate)
    }

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     *
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance.
     */
    public fun onStart(vararg onStart: Any) {
        _onStart.addAll(listOf(*onStart))
    }

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     *
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance.
     */
    public fun onStart(onStart: Collection<Any>) {
        _onStart.addAll(onStart)
    }

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     *
     * @param onStart A shell script that runs every time you start a notebook instance, including
     *   when you create the notebook instance.
     */
    public fun onStart(onStart: IResolvable) {
        cdkBuilder.onStart(onStart)
    }

    public fun build(): CfnNotebookInstanceLifecycleConfig {
        if (_onCreate.isNotEmpty()) cdkBuilder.onCreate(_onCreate)
        if (_onStart.isNotEmpty()) cdkBuilder.onStart(_onStart)
        return cdkBuilder.build()
    }
}
