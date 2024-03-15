@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface AccessKeyProps {
  public fun serial(): Number? = unwrap(this).getSerial()

  public fun status(): AccessKeyStatus? = unwrap(this).getStatus()?.let(AccessKeyStatus::wrap)

  public fun user(): IUser

  @CdkDslMarker
  public interface Builder {
    public fun serial(serial: Number)

    public fun status(status: AccessKeyStatus)

    public fun user(user: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AccessKeyProps.Builder =
        software.amazon.awscdk.services.iam.AccessKeyProps.builder()

    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    override fun status(status: AccessKeyStatus) {
      cdkBuilder.status(status.let(AccessKeyStatus::unwrap))
    }

    override fun user(user: IUser) {
      cdkBuilder.user(user.let(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.AccessKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.AccessKeyProps,
  ) : CdkObject(cdkObject), AccessKeyProps {
    override fun serial(): Number? = unwrap(this).getSerial()

    override fun status(): AccessKeyStatus? = unwrap(this).getStatus()?.let(AccessKeyStatus::wrap)

    override fun user(): IUser = unwrap(this).getUser().let(IUser::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccessKeyProps): AccessKeyProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessKeyProps): software.amazon.awscdk.services.iam.AccessKeyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.AccessKeyProps
  }
}
