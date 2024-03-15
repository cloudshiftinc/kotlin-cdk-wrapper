@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVirtualMFADeviceProps {
  public fun path(): String? = unwrap(this).getPath()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun users(): List<String>

  public fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()

  @CdkDslMarker
  public interface Builder {
    public fun path(path: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun users(users: List<String>)

    public fun users(vararg users: String)

    public fun virtualMfaDeviceName(virtualMfaDeviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.Builder =
        software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.builder()

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    override fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
      cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps,
  ) : CdkObject(cdkObject), CfnVirtualMFADeviceProps {
    override fun path(): String? = unwrap(this).getPath()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun users(): List<String> = unwrap(this).getUsers()

    override fun virtualMfaDeviceName(): String? = unwrap(this).getVirtualMfaDeviceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualMFADeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps):
        CfnVirtualMFADeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualMFADeviceProps):
        software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
  }
}
