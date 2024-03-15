@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocationFSxWindowsProps {
  public fun domain(): String? = unwrap(this).getDomain()

  public fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  public fun password(): String? = unwrap(this).getPassword()

  public fun securityGroupArns(): List<String>

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun user(): String

  @CdkDslMarker
  public interface Builder {
    public fun domain(domain: String)

    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    public fun password(password: String)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun securityGroupArns(vararg securityGroupArns: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.builder()

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps,
  ) : CdkObject(cdkObject), CfnLocationFSxWindowsProps {
    override fun domain(): String? = unwrap(this).getDomain()

    override fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

    override fun password(): String? = unwrap(this).getPassword()

    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun user(): String = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxWindowsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps):
        CfnLocationFSxWindowsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxWindowsProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps
  }
}
