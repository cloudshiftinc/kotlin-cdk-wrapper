@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNotebookInstanceLifecycleConfigProps {
  public fun notebookInstanceLifecycleConfigName(): String? =
      unwrap(this).getNotebookInstanceLifecycleConfigName()

  public fun onCreate(): Any? = unwrap(this).getOnCreate()

  public fun onStart(): Any? = unwrap(this).getOnStart()

  @CdkDslMarker
  public interface Builder {
    public fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String)

    public fun onCreate(onCreate: IResolvable)

    public fun onCreate(onCreate: List<Any>)

    public fun onCreate(vararg onCreate: Any)

    public fun onStart(onStart: IResolvable)

    public fun onStart(onStart: List<Any>)

    public fun onStart(vararg onStart: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.builder()

    override fun notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName: String) {
      cdkBuilder.notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName)
    }

    override fun onCreate(onCreate: IResolvable) {
      cdkBuilder.onCreate(onCreate.let(IResolvable::unwrap))
    }

    override fun onCreate(onCreate: List<Any>) {
      cdkBuilder.onCreate(onCreate)
    }

    override fun onCreate(vararg onCreate: Any): Unit = onCreate(onCreate.toList())

    override fun onStart(onStart: IResolvable) {
      cdkBuilder.onStart(onStart.let(IResolvable::unwrap))
    }

    override fun onStart(onStart: List<Any>) {
      cdkBuilder.onStart(onStart)
    }

    override fun onStart(vararg onStart: Any): Unit = onStart(onStart.toList())

    public fun build():
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps,
  ) : CdkObject(cdkObject), CfnNotebookInstanceLifecycleConfigProps {
    override fun notebookInstanceLifecycleConfigName(): String? =
        unwrap(this).getNotebookInstanceLifecycleConfigName()

    override fun onCreate(): Any? = unwrap(this).getOnCreate()

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
        CfnNotebookInstanceLifecycleConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotebookInstanceLifecycleConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
  }
}
