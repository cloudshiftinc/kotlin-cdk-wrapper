@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public open class WindowsImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.WindowsImage,
) : GenericSSMParameterImage(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    version: software.amazon.awscdk.services.ec2.WindowsVersion,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.WindowsImage.Builder =
        software.amazon.awscdk.services.ec2.WindowsImage.Builder.create(version)

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.WindowsImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(version: WindowsVersion, block: Builder.() -> Unit = {}):
        WindowsImage {
      val builderImpl = BuilderImpl(WindowsVersion.unwrap(version))
      return WindowsImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.WindowsImage): WindowsImage =
        WindowsImage(cdkObject)

    internal fun unwrap(wrapped: WindowsImage): software.amazon.awscdk.services.ec2.WindowsImage =
        wrapped.cdkObject
  }
}
