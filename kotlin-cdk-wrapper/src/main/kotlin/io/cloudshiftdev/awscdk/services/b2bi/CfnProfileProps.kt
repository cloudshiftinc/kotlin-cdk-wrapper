@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfileProps {
  public fun businessName(): String

  public fun email(): String? = unwrap(this).getEmail()

  public fun logging(): String

  public fun name(): String

  public fun phone(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun businessName(businessName: String)

    public fun email(email: String)

    public fun logging(logging: String)

    public fun name(name: String)

    public fun phone(phone: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnProfileProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnProfileProps.builder()

    override fun businessName(businessName: String) {
      cdkBuilder.businessName(businessName)
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun logging(logging: String) {
      cdkBuilder.logging(logging)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnProfileProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    override fun businessName(): String = unwrap(this).getBusinessName()

    override fun email(): String? = unwrap(this).getEmail()

    override fun logging(): String = unwrap(this).getLogging()

    override fun name(): String = unwrap(this).getName()

    override fun phone(): String = unwrap(this).getPhone()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnProfileProps):
        CfnProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.b2bi.CfnProfileProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.b2bi.CfnProfileProps
  }
}
