@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeliverySourceProps {
  public fun logType(): String? = unwrap(this).getLogType()

  public fun name(): String

  public fun resourceArn(): String? = unwrap(this).getResourceArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun logType(logType: String)

    public fun name(name: String)

    public fun resourceArn(resourceArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliverySourceProps.Builder =
        software.amazon.awscdk.services.logs.CfnDeliverySourceProps.builder()

    override fun logType(logType: String) {
      cdkBuilder.logType(logType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliverySourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySourceProps,
  ) : CdkObject(cdkObject), CfnDeliverySourceProps {
    override fun logType(): String? = unwrap(this).getLogType()

    override fun name(): String = unwrap(this).getName()

    override fun resourceArn(): String? = unwrap(this).getResourceArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliverySourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySourceProps):
        CfnDeliverySourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliverySourceProps):
        software.amazon.awscdk.services.logs.CfnDeliverySourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnDeliverySourceProps
  }
}
