@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SageMaker::NotebookInstanceLifecycleConfig` resource creates shell scripts that run
 * when you create and/or start a notebook instance.
 *
 * For information about notebook instance lifecycle configurations, see [Customize a Notebook
 * Instance](https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html) in the
 * *Amazon SageMaker Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
public open class CfnNotebookInstanceLifecycleConfig internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the lifecycle configuration, such as `MyLifecycleConfig` .
   */
  public open fun attrNotebookInstanceLifecycleConfigName(): String =
      unwrap(this).getAttrNotebookInstanceLifecycleConfigName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the lifecycle configuration.
   */
  public open fun notebookInstanceLifecycleConfigName(): String? =
      unwrap(this).getNotebookInstanceLifecycleConfigName()

  /**
   * The name of the lifecycle configuration.
   */
  public open fun notebookInstanceLifecycleConfigName(`value`: String) {
    unwrap(this).setNotebookInstanceLifecycleConfigName(`value`)
  }

  /**
   * A shell script that runs only once, when you create a notebook instance.
   */
  public open fun onCreate(): Any? = unwrap(this).getOnCreate()

  /**
   * A shell script that runs only once, when you create a notebook instance.
   */
  public open fun onCreate(`value`: IResolvable) {
    unwrap(this).setOnCreate(`value`.let(IResolvable::unwrap))
  }

  /**
   * A shell script that runs only once, when you create a notebook instance.
   */
  public open fun onCreate(_idx_ac66f0: List<Any>) {
    unwrap(this).setOnCreate(_idx_ac66f0)
  }

  /**
   * A shell script that runs only once, when you create a notebook instance.
   */
  public open fun onCreate(vararg _idx_ac66f0: Any): Unit = onCreate(_idx_ac66f0.toList())

  /**
   * A shell script that runs every time you start a notebook instance, including when you create
   * the notebook instance.
   */
  public open fun onStart(): Any? = unwrap(this).getOnStart()

  /**
   * A shell script that runs every time you start a notebook instance, including when you create
   * the notebook instance.
   */
  public open fun onStart(`value`: IResolvable) {
    unwrap(this).setOnStart(`value`.let(IResolvable::unwrap))
  }

  /**
   * A shell script that runs every time you start a notebook instance, including when you create
   * the notebook instance.
   */
  public open fun onStart(_idx_ac66f0: List<Any>) {
    unwrap(this).setOnStart(_idx_ac66f0)
  }

  /**
   * A shell script that runs every time you start a notebook instance, including when you create
   * the notebook instance.
   */
  public open fun onStart(vararg _idx_ac66f0: Any): Unit = onStart(_idx_ac66f0.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
     * @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration. 
     */
    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String)

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    public fun onCreate(onCreate: IResolvable)

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    public fun onCreate(onCreate: List<Any>)

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    public fun onCreate(vararg onCreate: Any)

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    public fun onStart(onStart: IResolvable)

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    public fun onStart(onStart: List<Any>)

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    public fun onStart(vararg onStart: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.Builder.create(scope,
        id)

    /**
     * The name of the lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
     * @param notebookInstanceLifecycleConfigName The name of the lifecycle configuration. 
     */
    override fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
      cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    override fun onCreate(onCreate: IResolvable) {
      cdkBuilder.onCreate(onCreate.let(IResolvable::unwrap))
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    override fun onCreate(onCreate: List<Any>) {
      cdkBuilder.onCreate(onCreate)
    }

    /**
     * A shell script that runs only once, when you create a notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
     * @param onCreate A shell script that runs only once, when you create a notebook instance. 
     */
    override fun onCreate(vararg onCreate: Any): Unit = onCreate(onCreate.toList())

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    override fun onStart(onStart: IResolvable) {
      cdkBuilder.onStart(onStart.let(IResolvable::unwrap))
    }

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    override fun onStart(onStart: List<Any>) {
      cdkBuilder.onStart(onStart)
    }

    /**
     * A shell script that runs every time you start a notebook instance, including when you create
     * the notebook instance.
     *
     * The shell script must be a base64-encoded string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
     * @param onStart A shell script that runs every time you start a notebook instance, including
     * when you create the notebook instance. 
     */
    override fun onStart(vararg onStart: Any): Unit = onStart(onStart.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotebookInstanceLifecycleConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotebookInstanceLifecycleConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig):
        CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstanceLifecycleConfig):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig =
        wrapped.cdkObject
  }

  /**
   * Specifies the notebook instance lifecycle configuration script.
   *
   * Each lifecycle configuration script has a limit of 16384 characters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * NotebookInstanceLifecycleHookProperty notebookInstanceLifecycleHookProperty =
   * NotebookInstanceLifecycleHookProperty.builder()
   * .content("content")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html)
   */
  public interface NotebookInstanceLifecycleHookProperty {
    /**
     * A base64-encoded string that contains a shell script for a notebook instance lifecycle
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * A builder for [NotebookInstanceLifecycleHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content A base64-encoded string that contains a shell script for a notebook instance
       * lifecycle configuration.
       */
      public fun content(content: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.builder()

      /**
       * @param content A base64-encoded string that contains a shell script for a notebook instance
       * lifecycle configuration.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty,
    ) : CdkObject(cdkObject), NotebookInstanceLifecycleHookProperty {
      /**
       * A base64-encoded string that contains a shell script for a notebook instance lifecycle
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content)
       */
      override fun content(): String? = unwrap(this).getContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotebookInstanceLifecycleHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty):
          NotebookInstanceLifecycleHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotebookInstanceLifecycleHookProperty):
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty
    }
  }
}
