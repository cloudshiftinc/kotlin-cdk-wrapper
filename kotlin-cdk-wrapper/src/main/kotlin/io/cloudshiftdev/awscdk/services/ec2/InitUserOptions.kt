@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface InitUserOptions {
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public fun homeDir(): String? = unwrap(this).getHomeDir()

  public fun userId(): Number? = unwrap(this).getUserId()

  @CdkDslMarker
  public interface Builder {
    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun homeDir(homeDir: String)

    public fun userId(userId: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitUserOptions.Builder =
        software.amazon.awscdk.services.ec2.InitUserOptions.builder()

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun homeDir(homeDir: String) {
      cdkBuilder.homeDir(homeDir)
    }

    override fun userId(userId: Number) {
      cdkBuilder.userId(userId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitUserOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitUserOptions,
  ) : CdkObject(cdkObject), InitUserOptions {
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    override fun homeDir(): String? = unwrap(this).getHomeDir()

    override fun userId(): Number? = unwrap(this).getUserId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitUserOptions):
        InitUserOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitUserOptions):
        software.amazon.awscdk.services.ec2.InitUserOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitUserOptions
  }
}
