@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface GenericWindowsImageProps {
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GenericWindowsImageProps.Builder =
        software.amazon.awscdk.services.ec2.GenericWindowsImageProps.builder()

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GenericWindowsImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.GenericWindowsImageProps,
  ) : CdkObject(cdkObject), GenericWindowsImageProps {
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericWindowsImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericWindowsImageProps):
        GenericWindowsImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GenericWindowsImageProps):
        software.amazon.awscdk.services.ec2.GenericWindowsImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GenericWindowsImageProps
  }
}
