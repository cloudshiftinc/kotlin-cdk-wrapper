@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSoftwarePackageProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun packageName(): String? = unwrap(this).getPackageName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun packageName(packageName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageProps.builder()

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

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps,
  ) : CdkObject(cdkObject), CfnSoftwarePackageProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun packageName(): String? = unwrap(this).getPackageName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSoftwarePackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps):
        CfnSoftwarePackageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageProps):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSoftwarePackageProps
  }
}
