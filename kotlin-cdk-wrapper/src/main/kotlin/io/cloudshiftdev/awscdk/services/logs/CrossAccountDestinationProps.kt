@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface CrossAccountDestinationProps {
  public fun destinationName(): String? = unwrap(this).getDestinationName()

  public fun role(): IRole

  public fun targetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun destinationName(destinationName: String)

    public fun role(role: IRole)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder =
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps.builder()

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CrossAccountDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestinationProps,
  ) : CdkObject(cdkObject), CrossAccountDestinationProps {
    override fun destinationName(): String? = unwrap(this).getDestinationName()

    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CrossAccountDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestinationProps):
        CrossAccountDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossAccountDestinationProps):
        software.amazon.awscdk.services.logs.CrossAccountDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CrossAccountDestinationProps
  }
}
