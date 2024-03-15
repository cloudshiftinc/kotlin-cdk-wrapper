@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnStateMachineVersionProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun stateMachineArn(): String

  public fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun stateMachineArn(stateMachineArn: String)

    public fun stateMachineRevisionId(stateMachineRevisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun stateMachineArn(stateMachineArn: String) {
      cdkBuilder.stateMachineArn(stateMachineArn)
    }

    override fun stateMachineRevisionId(stateMachineRevisionId: String) {
      cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps,
  ) : CdkObject(cdkObject), CfnStateMachineVersionProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

    override fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps):
        CfnStateMachineVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineVersionProps):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
  }
}
