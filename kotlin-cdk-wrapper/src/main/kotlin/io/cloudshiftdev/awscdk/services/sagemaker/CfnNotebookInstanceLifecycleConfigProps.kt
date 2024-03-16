@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNotebookInstanceLifecycleConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
public interface CfnNotebookInstanceLifecycleConfigProps {
  /**
   * The name of the lifecycle configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
   */
  public fun notebookInstanceLifecycleConfigName(): String? =
      unwrap(this).getNotebookInstanceLifecycleConfigName()

  /**
   * A shell script that runs only once, when you create a notebook instance.
   *
   * The shell script must be a base64-encoded string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
   */
  public fun onCreate(): Any? = unwrap(this).getOnCreate()

  /**
   * A shell script that runs every time you start a notebook instance, including when you create
   * the notebook instance.
   *
   * The shell script must be a base64-encoded string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
   */
  public fun onStart(): Any? = unwrap(this).getOnStart()

  /**
   * A builder for [CfnNotebookInstanceLifecycleConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration.
     */
    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String)

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onCreate(onCreate: IResolvable)

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onCreate(onCreate: List<Any>)

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onCreate(vararg onCreate: Any)

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onStart(onStart: IResolvable)

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onStart(onStart: List<Any>)

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    public fun onStart(vararg onStart: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.builder()

    /**
     * @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration.
     */
    override fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
      cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onCreate(onCreate: IResolvable) {
      cdkBuilder.onCreate(onCreate.let(IResolvable::unwrap))
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onCreate(onCreate: List<Any>) {
      cdkBuilder.onCreate(onCreate)
    }

    /**
     * @param onCreate A shell script that runs only once, when you create a notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onCreate(vararg onCreate: Any): Unit = onCreate(onCreate.toList())

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onStart(onStart: IResolvable) {
      cdkBuilder.onStart(onStart.let(IResolvable::unwrap))
    }

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onStart(onStart: List<Any>) {
      cdkBuilder.onStart(onStart)
    }

    /**
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance.
     * The shell script must be a base64-encoded string.
     */
    override fun onStart(vararg onStart: Any): Unit = onStart(onStart.toList())

    public fun build():
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps,
  ) : CdkObject(cdkObject), CfnNotebookInstanceLifecycleConfigProps {
    /**
     * The name of the lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
     */
    override fun notebookInstanceLifecycleConfigName(): String? =
        unwrap(this).getNotebookInstanceLifecycleConfigName()

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     */
    override fun onCreate(): Any? = unwrap(this).getOnCreate()

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     */
    override fun onStart(): Any? = unwrap(this).getOnStart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnNotebookInstanceLifecycleConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps):
        CfnNotebookInstanceLifecycleConfigProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnNotebookInstanceLifecycleConfigProps

    internal fun unwrap(wrapped: CfnNotebookInstanceLifecycleConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
  }
}
