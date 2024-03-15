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

public open class CfnNotebookInstanceLifecycleConfig internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNotebookInstanceLifecycleConfigName(): String =
      unwrap(this).getAttrNotebookInstanceLifecycleConfigName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notebookInstanceLifecycleConfigName(): String? =
      unwrap(this).getNotebookInstanceLifecycleConfigName()

  public open fun notebookInstanceLifecycleConfigName(`value`: String) {
    unwrap(this).setNotebookInstanceLifecycleConfigName(`value`)
  }

  public open fun onCreate(): Any? = unwrap(this).getOnCreate()

  public open fun onCreate(`value`: IResolvable) {
    unwrap(this).setOnCreate(`value`.let(IResolvable::unwrap))
  }

  public open fun onCreate(__idx_ac66f0: List<Any>) {
    unwrap(this).setOnCreate(__idx_ac66f0)
  }

  public open fun onCreate(vararg __idx_ac66f0: Any): Unit = onCreate(__idx_ac66f0.toList())

  public open fun onStart(): Any? = unwrap(this).getOnStart()

  public open fun onStart(`value`: IResolvable) {
    unwrap(this).setOnStart(`value`.let(IResolvable::unwrap))
  }

  public open fun onStart(__idx_ac66f0: List<Any>) {
    unwrap(this).setOnStart(__idx_ac66f0)
  }

  public open fun onStart(vararg __idx_ac66f0: Any): Unit = onStart(__idx_ac66f0.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.Builder.create(scope,
        id)

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

  public interface NotebookInstanceLifecycleHookProperty {
    public fun content(): String? = unwrap(this).getContent()

    @CdkDslMarker
    public interface Builder {
      public fun content(content: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.builder()

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
