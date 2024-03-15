@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface InstanceProfileAttributes {
  public fun instanceProfileArn(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun instanceProfileArn(instanceProfileArn: String)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.InstanceProfileAttributes.Builder =
        software.amazon.awscdk.services.iam.InstanceProfileAttributes.builder()

    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.InstanceProfileAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.InstanceProfileAttributes,
  ) : CdkObject(cdkObject), InstanceProfileAttributes {
    override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProfileAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.InstanceProfileAttributes):
        InstanceProfileAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceProfileAttributes):
        software.amazon.awscdk.services.iam.InstanceProfileAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.InstanceProfileAttributes
  }
}
