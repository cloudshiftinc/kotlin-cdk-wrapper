@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnSoftwarePackageVersionProps {
  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun description(): String? = unwrap(this).getDescription()

  public fun packageName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun versionName(): String? = unwrap(this).getVersionName()

  @CdkDslMarker
  public interface Builder {
    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun description(description: String)

    public fun packageName(packageName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun versionName(versionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.builder()

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps,
  ) : CdkObject(cdkObject), CfnSoftwarePackageVersionProps {
    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun description(): String? = unwrap(this).getDescription()

    override fun packageName(): String = unwrap(this).getPackageName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun versionName(): String? = unwrap(this).getVersionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSoftwarePackageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps):
        CfnSoftwarePackageVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersionProps):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps
  }
}
