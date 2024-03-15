@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnAccessKeyProps {
  public fun serial(): Number? = unwrap(this).getSerial()

  public fun status(): String? = unwrap(this).getStatus()

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun serial(serial: Number)

    public fun status(status: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnAccessKeyProps.Builder =
        software.amazon.awscdk.services.iam.CfnAccessKeyProps.builder()

    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnAccessKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnAccessKeyProps,
  ) : CdkObject(cdkObject), CfnAccessKeyProps {
    override fun serial(): Number? = unwrap(this).getSerial()

    override fun status(): String? = unwrap(this).getStatus()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnAccessKeyProps):
        CfnAccessKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessKeyProps):
        software.amazon.awscdk.services.iam.CfnAccessKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CfnAccessKeyProps
  }
}
