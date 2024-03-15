@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccessGrantsLocationProps {
  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public fun locationScope(): String? = unwrap(this).getLocationScope()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun iamRoleArn(iamRoleArn: String)

    public fun locationScope(locationScope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps.Builder
        = software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps.builder()

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun locationScope(locationScope: String) {
      cdkBuilder.locationScope(locationScope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps,
  ) : CdkObject(cdkObject), CfnAccessGrantsLocationProps {
    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    override fun locationScope(): String? = unwrap(this).getLocationScope()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessGrantsLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps):
        CfnAccessGrantsLocationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantsLocationProps):
        software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps
  }
}
