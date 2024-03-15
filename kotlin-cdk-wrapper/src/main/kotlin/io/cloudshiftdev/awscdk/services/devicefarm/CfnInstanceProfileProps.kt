@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInstanceProfileProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun excludeAppPackagesFromCleanup(): List<String> =
      unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

  public fun name(): String

  public fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

  public fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>)

    public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String)

    public fun name(name: String)

    public fun packageCleanup(packageCleanup: Boolean)

    public fun packageCleanup(packageCleanup: IResolvable)

    public fun rebootAfterUse(rebootAfterUse: Boolean)

    public fun rebootAfterUse(rebootAfterUse: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
      cdkBuilder.excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup)
    }

    override fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String): Unit =
        excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packageCleanup(packageCleanup: Boolean) {
      cdkBuilder.packageCleanup(packageCleanup)
    }

    override fun packageCleanup(packageCleanup: IResolvable) {
      cdkBuilder.packageCleanup(packageCleanup.let(IResolvable::unwrap))
    }

    override fun rebootAfterUse(rebootAfterUse: Boolean) {
      cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    override fun rebootAfterUse(rebootAfterUse: IResolvable) {
      cdkBuilder.rebootAfterUse(rebootAfterUse.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun excludeAppPackagesFromCleanup(): List<String> =
        unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

    override fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps):
        CfnInstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps
  }
}
