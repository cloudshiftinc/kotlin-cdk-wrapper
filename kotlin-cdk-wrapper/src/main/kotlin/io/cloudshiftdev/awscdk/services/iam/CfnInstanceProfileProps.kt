@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInstanceProfileProps {
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public fun path(): String? = unwrap(this).getPath()

  public fun roles(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun instanceProfileName(instanceProfileName: String)

    public fun path(path: String)

    public fun roles(roles: List<String>)

    public fun roles(vararg roles: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.iam.CfnInstanceProfileProps.builder()

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    override fun path(): String? = unwrap(this).getPath()

    override fun roles(): List<String> = unwrap(this).getRoles()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfileProps):
        CfnInstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.iam.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnInstanceProfileProps
  }
}
