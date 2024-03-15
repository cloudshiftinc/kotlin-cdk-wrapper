@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface KeepOriginalAttrs {
  public fun email(): Boolean? = unwrap(this).getEmail()

  public fun phone(): Boolean? = unwrap(this).getPhone()

  @CdkDslMarker
  public interface Builder {
    public fun email(email: Boolean)

    public fun phone(phone: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.KeepOriginalAttrs.Builder =
        software.amazon.awscdk.services.cognito.KeepOriginalAttrs.builder()

    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    public fun build(): software.amazon.awscdk.services.cognito.KeepOriginalAttrs =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs,
  ) : CdkObject(cdkObject), KeepOriginalAttrs {
    override fun email(): Boolean? = unwrap(this).getEmail()

    override fun phone(): Boolean? = unwrap(this).getPhone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeepOriginalAttrs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs):
        KeepOriginalAttrs = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeepOriginalAttrs):
        software.amazon.awscdk.services.cognito.KeepOriginalAttrs = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.KeepOriginalAttrs
  }
}
