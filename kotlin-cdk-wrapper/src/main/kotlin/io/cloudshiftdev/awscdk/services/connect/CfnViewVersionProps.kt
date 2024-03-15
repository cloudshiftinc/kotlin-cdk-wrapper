@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnViewVersionProps {
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public fun viewArn(): String

  public fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()

  @CdkDslMarker
  public interface Builder {
    public fun versionDescription(versionDescription: String)

    public fun viewArn(viewArn: String)

    public fun viewContentSha256(viewContentSha256: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnViewVersionProps.Builder =
        software.amazon.awscdk.services.connect.CfnViewVersionProps.builder()

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    override fun viewContentSha256(viewContentSha256: String) {
      cdkBuilder.viewContentSha256(viewContentSha256)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnViewVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnViewVersionProps,
  ) : CdkObject(cdkObject), CfnViewVersionProps {
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()

    override fun viewArn(): String = unwrap(this).getViewArn()

    override fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnViewVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnViewVersionProps):
        CfnViewVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnViewVersionProps):
        software.amazon.awscdk.services.connect.CfnViewVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnViewVersionProps
  }
}
