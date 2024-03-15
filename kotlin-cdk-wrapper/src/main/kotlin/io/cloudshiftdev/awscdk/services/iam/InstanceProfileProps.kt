@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface InstanceProfileProps {
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public fun path(): String? = unwrap(this).getPath()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun instanceProfileName(instanceProfileName: String)

    public fun path(path: String)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.InstanceProfileProps.Builder =
        software.amazon.awscdk.services.iam.InstanceProfileProps.builder()

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.InstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.InstanceProfileProps,
  ) : CdkObject(cdkObject), InstanceProfileProps {
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    override fun path(): String? = unwrap(this).getPath()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.InstanceProfileProps):
        InstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceProfileProps):
        software.amazon.awscdk.services.iam.InstanceProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.InstanceProfileProps
  }
}
