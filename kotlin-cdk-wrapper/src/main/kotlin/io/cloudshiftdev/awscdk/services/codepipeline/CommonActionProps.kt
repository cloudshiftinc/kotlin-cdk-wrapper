@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CommonActionProps {
  public fun actionName(): String

  public fun runOrder(): Number? = unwrap(this).getRunOrder()

  public fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CommonActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.CommonActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CommonActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CommonActionProps,
  ) : CdkObject(cdkObject), CommonActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CommonActionProps):
        CommonActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonActionProps):
        software.amazon.awscdk.services.codepipeline.CommonActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CommonActionProps
  }
}
